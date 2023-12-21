package kr.re.kitech.biz.pat.psr.service;

import java.util.List;

import kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageListVo;
import kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : PatPsrInquiryManageService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.01.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.11.01.
 * @version 1.0
 * @see
 * 
 */
public interface PatPsrInquiryManageService {
  
  /**
   * 지재권 목록 조회
   * 
   * @author Chris
   * @param PatPsrInquiryManageVo
   * @return List<PatPsrInquiryManageVo>
   * @throws KitechException
   * @since 2023.11.01.   
   */
  public List<PatPsrInquiryManageVo> selectPatPsrLst01(PatPsrInquiryManageVo vo) throws KitechException;

  /**
   * 지식재산권 기본정보 조회
   * 
   * @author Chris
   * @param PatPsrInquiryManageVo
   * @return PatPsrInquiryManageListVo
   * @throws KitechException
   * @since 2023.11.02.   
   */
  public PatPsrInquiryManageListVo retrieveDefaultInfo(PatPsrInquiryManageVo vo) throws KitechException;

  /**
   * 지식 재산권 등록 후 patmastr 수정 및 소연심 안건등록
   * 
   * @author Chris
   * @param PatPsrInquiryManageVo
   * @return int
   * @throws KitechException
   * @since 2023.11.06.   
   */
	public int updatePatMastr(PatPsrInquiryManageVo vo) throws KitechException;

  /**
   * 출원 데이터 변경
   * 
   * @author Chris
   * @param PatPsrInquiryManageVo
   * @return int
   * @throws KitechException
   * @since 2023.11.06.   
   */
	public int setPatAppSave(PatPsrInquiryManageVo vo) throws KitechException;

  /**
   * 지식재산권 출원 정보 조회
   * 
   * @author Chris
   * @param PatPsrInquiryManageVo
   * @return PatPsrInquiryManageListVo
   * @throws KitechException
   * @since 2023.11.06.
   */
  public PatPsrInquiryManageListVo retrieveAppInfo(PatPsrInquiryManageVo vo) throws KitechException;

  /**
   * 지식재산권 등록 정보 조회
   * 
   * @author Chris
   * @param PatPsrInquiryManageVo
   * @return PatPsrInquiryManageListVo
   * @throws KitechException
   * @since 2023.11.06.
   */
  public PatPsrInquiryManageListVo retrieveRegInfo(PatPsrInquiryManageVo vo) throws KitechException;

  /**
   * 지식재산권 상세 조회 사후관리
   * 
   * @author Chris
   * @param PatPsrInquiryManageVo
   * @return List<PatPsrInquiryManageVo>
   * @throws KitechException
   * @since 2023.11.06.
   */
  public PatPsrInquiryManageListVo patGridIA05(PatPsrInquiryManageVo vo) throws KitechException;

  /**
   * 지식재산권 비용 정보 조회
   * 
   * @author Chris
   * @param PatPsrInquiryManageVo
   * @return PatPsrInquiryManageVo
   * @throws KitechException
   * @since 2023.11.07.   
   */
  public PatPsrInquiryManageVo retrieveCostInfo(PatPsrInquiryManageVo vo) throws KitechException;

  /**
   * 지식재산권 비용 정보 리스트 조회
   * 
   * @author Chris
   * @param PatPsrInquiryManageVo
   * @return List<PatPsrInquiryManageVo>
   * @throws KitechException
   * @since 2023.11.07.   
   */
  public List<PatPsrInquiryManageVo> retrieveCostLst(PatPsrInquiryManageVo vo) throws KitechException;

  /**
   * 패밀리목록 조회
   * 
   * @author Chris
   * @param PatPsrInquiryManageVo
   * @return List<PatPsrInquiryManageVo>
   * @throws KitechException
   * @since 2023.11.07.   
   */
  public List<PatPsrInquiryManageVo> retrieveList(PatPsrInquiryManageVo vo) throws KitechException;

  /**
   * 지식재산권 결재 유무 변경
   * 
   * @author Chris
   * @param PatPsrInquiryManageVo
   * @return int
   * @throws KitechException
   * @since 2023.11.06.
   */
	public int updatePatmastrBpmYn(PatPsrInquiryManageVo vo) throws KitechException;

}
  