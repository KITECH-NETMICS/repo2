package kr.re.kitech.biz.pat.req.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.pat.mnt.service.PatRightMngService;
import kr.re.kitech.biz.pat.mnt.vo.PatRightMngListVo;
import kr.re.kitech.biz.pat.mnt.vo.PatRightMngVo;
import kr.re.kitech.biz.pat.req.dao.PatAppRightDAO;
import kr.re.kitech.biz.pat.req.service.PatAppRightService;
import kr.re.kitech.biz.pat.req.vo.PatAppRightVo;
import kr.re.kitech.biz.pat.req.vo.PatResLstVo;

@Service("patAppRightServiceImpl")
public class PatAppRightServiceImpl extends EgovAbstractServiceImpl implements PatAppRightService {
    
    @Resource(name = "patAppRightDAO")
    private PatAppRightDAO reqDAO;

    @Resource(name = "patRightMngServiceImpl")
    private PatRightMngService mntService;

    /**
     * 지재권 권리유지신청 주발명자 상세조회
     * @author 
     * @since 2023.08.11.
     */
    @Override
    public PatAppRightVo selectItem01(PatAppRightVo vo) throws ElException {
        PatAppRightVo resultVO = reqDAO.selectItem01(vo);
        return resultVO;
    }

    /**
     * 과제 검색
     * @author 
     * @since 2023.08.11.
     */
    @Override
    public List < PatResLstVo > selectList01(PatResLstVo vo) throws ElException {
        List < PatResLstVo > list = reqDAO.selectList01(vo);
        return list;
    }


    /**
     * 유지신청 저장
     * @author 
     * @throws Exception 
     * @since 2023.08.11.
     */
    @Override
    public PatRightMngVo insertItem01(PatRightMngListVo vo) throws Exception {
        return mntService.savePatRightDiv(vo);
    }

}