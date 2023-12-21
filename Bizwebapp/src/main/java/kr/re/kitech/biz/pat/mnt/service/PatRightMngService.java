package kr.re.kitech.biz.pat.mnt.service;

import java.util.List;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.pat.mnt.vo.PatRightMngListVo;
import kr.re.kitech.biz.pat.mnt.vo.PatRightMngVo;

public interface PatRightMngService {

    /**
     * 권리 유지 관리자 조회
     * @author 
     * @since 2023.08.07.
     */
    public List < PatRightMngVo > selectList(PatRightMngVo vo) throws ElException;

    /**
     * 권리 유지 관리자 저장
     * @author 
     * @since 2023.08.07.
     */
    public int savePatRightMntBatch(PatRightMngListVo vo) throws Exception;


    /**
     * 권리유지 결재신청
     * @author 
     * @since 2023.08.07.
     */
    public PatRightMngVo saveReqPatRight(PatRightMngListVo vo) throws Exception;


    /**
     * 권리유지신청 저장
     * @author 
     * @since 2023.08.11.
     */
    public PatRightMngVo savePatRightDiv(PatRightMngListVo vo) throws Exception;

}