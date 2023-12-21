package kr.re.kitech.biz.pat.pre.service;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.pat.pre.vo.PatPreRecInvVo;
import kr.re.kitech.biz.pat.pre.vo.PatPreReqInvVo;
import kr.re.kitech.biz.pat.pre.vo.PatPreRerInvListVo;
import kr.re.kitech.biz.pat.pre.vo.PatPreRerInvVo;

public interface PatPreRerInvService {
  
  /**
    * 등록결정보고 조회
    * @author 
    * @since 2023.08.24.
    */
  public PatPreRerInvVo selectItem01(PatPreRerInvVo vo) throws ElException;

  /**
    * 등록지시 확인 등록
    * @author 
    * @since 2023.08.24.
    */
  public int updateItem01(PatPreRerInvVo vo) throws Exception;

  /**
    * 등록지시 결과 검토 등록
    * @author 
    * @since 2023.09.05.
    */
  public int updatePreRecInv(PatPreRerInvListVo vo) throws Exception;

  /**
    * 등록지시 결과 조회
    * @author 
    * @since 2023.09.05.
    */
  public PatPreRecInvVo selectItem02(PatPreRecInvVo vo) throws ElException;

  /**
    * 등록지시 의뢰 조회
    * @author 
    * @since 2023.09.06.
    */
  public PatPreReqInvVo selectItem03(PatPreReqInvVo vo) throws ElException;

    /**
    * 등록지시 의뢰 등록
    * @author 
    * @since 2023.09.06.
    */
  public int updatePreReqInv(PatPreRerInvListVo vo) throws Exception;
}
