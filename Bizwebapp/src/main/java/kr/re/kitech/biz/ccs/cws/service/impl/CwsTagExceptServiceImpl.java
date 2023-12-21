package kr.re.kitech.biz.ccs.cws.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.ccs.cws.dao.CwsTagExceptDAO;
import kr.re.kitech.biz.ccs.cws.service.CwsTagExceptService;
import kr.re.kitech.biz.ccs.cws.vo.CwsExceptWorkTimeVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsTagExceptVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.vo.AttachVo;


/**  
 * @ClassSubJect 재택근무신청 관련 처리를 담당하는 MyBatis Impl
 * @Class Name CwsOutWorkServiceImpl.java
 * @Description 재택근무신청  처리를 담당하는 구현체 서비스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/03/28   개발팀             최초생성
 * 
 * @author 개발팀
 * @since 2022/03/28
 * @version 1.0
 * @see
 * 
 */
@Service("cwsTagExceptServiceImpl")
public class CwsTagExceptServiceImpl  extends EgovAbstractServiceImpl implements CwsTagExceptService {

    @Resource(name="cwsTagExceptDAO")
    private CwsTagExceptDAO cwsTagExceptDAO;
	
	@Resource(name = "messageSource")
	private MessageSource messageSource;
	
	@Resource(name = "generationServiceImpl")
    public GenerationService generationService;
	
    @Resource(name = "apprFuncServiceImpl")
    public ApprFuncService apprFuncService;
    
    @Resource(name="attachDAO")
    private AttachDAO attachDAO;
    
	@Override
	public CwsExceptWorkTimeVo selectExceptWorkTimeTarget(CwsExceptWorkTimeVo cwsExceptWorkTimeVo) throws KitechException {
		return cwsTagExceptDAO.selectExceptWorkTimeTarget((CwsExceptWorkTimeVo)cwsExceptWorkTimeVo);
	}
	
	@Override
	public void selectExceptWorkTimedupCheck(CwsTagExceptVo cwsTagExceptVo)  throws KitechException {
		List<CwsTagExceptVo> tempList = cwsTagExceptDAO.selectTagExceptList(cwsTagExceptVo);
		
		if (tempList.size() > 0) {
			CwsTagExceptVo vo = tempList.get(0);
			String[] exceptionString = { vo.getApr_state_nm(), vo.getReq_no(), vo.getBasedate(), vo.getCause() };
			throw new KitechException(Exceptions.ERROR, Business.CCS, "message.alert.ccs.cws.0010", exceptionString);
		}
	}
	
	@Override
	public CwsTagExceptVo selectTagExcept(CwsTagExceptVo cwsTagExceptVo) throws KitechException {
		return cwsTagExceptDAO.selectTagExcept(cwsTagExceptVo);
	}
	
	@Override
	public String saveTagExcept(CwsTagExceptVo cwsTagExtVo) throws Exception {
		String rowStatus = cwsTagExtVo.getRowStatus();
		
		if (rowStatus.equals("C")) {
	        String gen = generationService.getGenNumber(Numberings.DOCUMENT.getName(), "C97");
	        cwsTagExtVo.setReq_no(gen);
			cwsTagExceptDAO.insertTagExcept(cwsTagExtVo);
			apprFuncService.formInit(gen, "C943", KitechContextUtil.getUserId());
		} else if (rowStatus.equals("U")) {
			cwsTagExceptDAO.updateTagExcept(cwsTagExtVo);
		} else if (rowStatus.equals("D")) {
			apprFuncService.formRemove(cwsTagExtVo.getReq_no());
			cwsTagExceptDAO.deleteTagExcept(cwsTagExtVo);
		}	
		
		if (cwsTagExtVo.isApproval()) {
			String syspayno = cwsTagExtVo.getSyspayno();
			CwsTagExceptVo author = cwsTagExceptDAO.selectExcepAuthor(syspayno);
			
			// 1. BPM 코어 파라미터 객체 생성
			AprVo aprVo = new AprVo();
			aprVo.setReqNo(cwsTagExtVo.getReq_no());
			aprVo.setEndpoint(KitechContextUtil.getUserId());
			aprVo.setUiId("C943");
			aprVo.setInfoCd(cwsTagExtVo.getInfoCd());
			aprVo.setManagerId(author.getAuth_syspayno());
			aprVo.setManager(author.getAuth_syspayno());
			// TO-DO 변수 추가적으로 넣어주기
			//aprVo.setProcDefAlias(cwsOutWorkVo.getReq_no().substring(0, 3));
			//aprVo.setInstExt1("info_cd");
			//aprVo.setInstExt2("accntno");
			// 2. 모델에 첨부파일 및 컬렉션류의 데이터 리스트 추가(필요시)
			AttachVo attachVo = new AttachVo();
			// 첨부파일 번호로 첨부파일 리스트 조회
			attachVo.setAttach_file_no(cwsTagExtVo.getAttach_file_no());
			cwsTagExtVo.setAttachVo1(attachDAO.selectListAttach(cwsTagExtVo.getAttach_file_no()));

			// 3. 전자결재 기능 메소드 호출 (결재신청)
			apprFuncService.approvalRequest(aprVo, cwsTagExtVo);
			
		}
		
		return cwsTagExtVo.getReq_no() == null ? "" : cwsTagExtVo.getReq_no();
	}
	
	@Override
	public List<CwsTagExceptVo> selectTagExceptList(CwsTagExceptVo cwsTagExceptVo) throws KitechException {
		return cwsTagExceptDAO.selectTagExceptList(cwsTagExceptVo);
	}
	
}
