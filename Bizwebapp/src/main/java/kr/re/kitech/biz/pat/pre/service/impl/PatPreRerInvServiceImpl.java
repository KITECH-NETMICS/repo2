package kr.re.kitech.biz.pat.pre.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.pat.com.dao.PatComDAO;
import kr.re.kitech.biz.pat.com.service.PatComWFService;
import kr.re.kitech.biz.pat.com.vo.PatMastrVo;
import kr.re.kitech.biz.pat.com.vo.PatToDoVo;
import kr.re.kitech.biz.pat.pre.dao.PatPreRerInvDAO;
import kr.re.kitech.biz.pat.pre.service.PatPreRerInvService;
import kr.re.kitech.biz.pat.pre.vo.PatPreRecInvVo;
import kr.re.kitech.biz.pat.pre.vo.PatPreReqInvVo;
import kr.re.kitech.biz.pat.pre.vo.PatPreRerInvListVo;
import kr.re.kitech.biz.pat.pre.vo.PatPreRerInvVo;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

@Service("patPreRerInvServiceImpl")
public class PatPreRerInvServiceImpl extends EgovAbstractServiceImpl implements PatPreRerInvService {
    @Resource(name = "patPreRerInvDAO")
    private PatPreRerInvDAO preDAO;

    @Resource(name="patComDAO")
	private PatComDAO patComDAO;

    @Resource(name = "patComWFService")
    private PatComWFService patComService;

    /**
     * 등록결정보고 조회
     * @author 
     * @since 2023.08.24.
     */
    @Override
    public PatPreRerInvVo selectItem01(PatPreRerInvVo vo) throws ElException {
        PatPreRerInvVo resultVO = preDAO.selectItem01(vo);
        return resultVO;
    }
   
    /**
     * 등록지시 결과 조회
     * @author 
     * @since 2023.09.05.
     */
    @Override
    public PatPreRecInvVo selectItem02(PatPreRecInvVo vo) throws ElException {
        PatPreRecInvVo resultVO = preDAO.selectItem02(vo);
        return resultVO;
    }

    /**
     * 등록지시 의뢰 조회
     * @author 
     * @since 2023.09.05.
     */
    @Override
    public PatPreReqInvVo selectItem03(PatPreReqInvVo vo) throws ElException {
        PatPreReqInvVo resultVO = preDAO.selectItem03(vo);
        return resultVO;
    }

    /**
     * 등록지시 확인 등록
     * @author 
     * @since 2023.08.24.
     */
    @Override
    public int updateItem01(PatPreRerInvVo vo) throws Exception {
        int result = preDAO.updateItem01(vo);

        PatToDoVo param = new PatToDoVo();
        param.setReq_no(vo.getReq_no());
        param.setMngmt_no(vo.getMngmt_no());
        param.setCurr_state_cd("P1610");
        param.setNext_state_cd(vo.getNext_state_cd()); // 결재완료
        param.setTodo_auth(vo.getTodo_auth()); // 결재완료
        param.setSyspayno(vo.getSyspayno());
        param.setRef_key(vo.getRef_key());

        patComService.executePatComWFBiz(param);

        return result;
    }


    /**
     * 등록지시 결과 검토 등록
     * @author 
     * @since 2023.09.05.
     */
    @Override
    public int updatePreRecInv(PatPreRerInvListVo vo) throws Exception {
        int result = 0;
        PatPreRecInvVo patPreRecInvVo = vo.getPatPreRecInvVo();
        PatMastrVo patMastrVo = vo.getPatMastrVo();

        result = preDAO.selectPatPreGetOA(patPreRecInvVo);

        if(result > 1){
            return result;
        }	

        // 등록지시 의뢰 등록
        preDAO.updatePatPreRecInvSU01(patPreRecInvVo);
        
        // 특허 마스터 상태변경 
        patComDAO.updatePatMastr(patMastrVo);
        
        //등록지시결과확인
        vo.getPatPreRecInvVo().setReq_no(patPreRecInvVo.getReq_no());
        PatPreRerInvVo resultVo = preDAO.selectResultCheck(vo.getPatPreRecInvVo());
        
        if (resultVo.getPat_clsf().equals("PAT030") || resultVo.getPat_clsf().equals("PAT040")) {// 상표, 디자인만
        	//등록지시결과등록
        	vo.setPatPreRerInvVo(new PatPreRerInvVo());
        	vo.getPatPreRerInvVo().setReq_no(resultVo.getReq_no());
        	vo.getPatPreRerInvVo().setMngmt_no(resultVo.getMngmt_no());
        	vo.getPatPreRerInvVo().setInvnt_krn_nm(resultVo.getInvnt_krn_nm());
        	vo.getPatPreRerInvVo().setRegst_syspayno(resultVo.getRegst_syspayno());
        	vo.getPatPreRerInvVo().setAccnt_no(resultVo.getAccnt_no());
        	vo.getPatPreRerInvVo().setSyspayno(KitechContextUtil.getSyspayno());
        	vo.getPatPreRerInvVo().setCharg_syspayno(resultVo.getCharg_syspayno());
        	
        	preDAO.insertResultCheck(vo.getPatPreRerInvVo());            
        }        
                
        // 결재완료 단계 프로세스 처리
        PatToDoVo param = new PatToDoVo();
        param.setReq_no(patPreRecInvVo.getReq_no());
        param.setMngmt_no(patPreRecInvVo.getMngmt_no());
        param.setCurr_state_cd(patPreRecInvVo.getCurr_state_cd());
        param.setNext_state_cd(patPreRecInvVo.getNext_state_cd()); // 결재완료
        param.setTodo_auth("1"); // 결재완료
        param.setSyspayno(patPreRecInvVo.getSyspayno());
        param.setRef_key(patPreRecInvVo.getRef_key());

        patComService.executePatComWFBiz(param);

        return result;
    }


    /**
     * 등록지시 의뢰 등록
     * @author 
     * @since 2023.09.06.
     */
    @Override
    public int updatePreReqInv(PatPreRerInvListVo vo) throws Exception {
        int result = 0;
        PatPreReqInvVo patPreReqInvVo = vo.getPatPreReqInvVo();
        PatMastrVo patMastrVo = vo.getPatMastrVo();

        // 등록지시 의뢰 등록
        preDAO.updatePatPreReqInvSU01(patPreReqInvVo);
        
        // 특허 마스터 상태변경
        patComDAO.updatePatMastr(patMastrVo);
                            
        // 결재완료 단계 프로세스 처리
        PatToDoVo param = new PatToDoVo();
        param.setReq_no(patPreReqInvVo.getReq_no());
        param.setMngmt_no(patPreReqInvVo.getMngmt_no());
        param.setCurr_state_cd(patPreReqInvVo.getCurr_state_cd());
        param.setNext_state_cd(patPreReqInvVo.getNext_state_cd()); // 결재완료
        param.setTodo_auth("1"); // 결재완료
        param.setSyspayno(patPreReqInvVo.getSyspayno());
        param.setRef_key(patPreReqInvVo.getRef_key());

        patComService.executePatComWFBiz(param);

        return result;
    }

}