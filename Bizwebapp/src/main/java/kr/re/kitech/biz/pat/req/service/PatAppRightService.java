package kr.re.kitech.biz.pat.req.service;

import java.util.List;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.pat.mnt.vo.PatRightMngListVo;
import kr.re.kitech.biz.pat.mnt.vo.PatRightMngVo;
import kr.re.kitech.biz.pat.req.vo.PatAppRightVo;
import kr.re.kitech.biz.pat.req.vo.PatResLstVo;

public interface PatAppRightService {

  /**
    * 지재권 권리유지신청 주발명자 상세조회
    * @author 
    * @since 2023.08.11.
    */
  public PatAppRightVo selectItem01(PatAppRightVo vo) throws ElException;

  /**
    * 과제 검색
    * @author 
    * @since 2023.08.11.
    */
  public List<PatResLstVo> selectList01(PatResLstVo vo) throws ElException;

  /**
    * 유지신청 저장
    * @author 
    * @since 2023.08.11.
    */
  public PatRightMngVo insertItem01(PatRightMngListVo vo) throws Exception;

}
