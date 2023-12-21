package kr.re.kitech.biz.hum.apy.service;

import java.util.List;

import kr.re.kitech.biz.hum.apy.vo.HumApyEduCpacpVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyEducVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyTrainLstReqListVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyTrainLstReqVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect :교육훈련 신청 관련 처리를 담당하는 인터페이스
 * @ClassName : HumApyEduCService.java
 * @Description : 교육훈련 신청 관련 처리를 담당하는 인터페이스
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.05.      송선화    최초생성
 * 
 * @author
 * @since 2023.10.05.
 * @version 1.0
 * @see
 * 
 */
public interface HumApyTrainLstReqService {
	/**
   * 교육훈련 신청 목록 조회
   * 
   * @author 
   * @param HumApyTrainLstReqVo
   * @return List<HumApyTrainLstReqVo>
   * @throws KitechException
   * @since 2023.10.05.   
   */
  public List<HumApyTrainLstReqVo> selectList(HumApyTrainLstReqVo vo) throws KitechException;
  
  /**
   * 교육훈련 신청 목록 Excel 내리기
   * @param HumApyTrainLstReqVo
   * @return List<HumApyTrainLstReqVo>
   * @throws KitechException
   */
   public List<HumApyTrainLstReqVo> selectTrainLstReqExel(HumApyTrainLstReqVo vo) throws KitechException;
   
   /**
   * 교육훈련상세 조회 전 신청번호로 시스템사번 조회
   * @param HumApyEducVo
   * @return HumApyEducVo
   * @throws KitechException
   */
   public HumApyEducVo selectHumApyEduc(HumApyEducVo vo)  throws KitechException;
   
   /**
   * 교육훈련 신청 기본정보 상세
   * @param HumApyEducVo
   * @return HumApyEducVo
   * @throws KitechException
   */
    public HumApyTrainLstReqListVo selectApyTrainBasicInfo(HumApyEducVo vo)  throws KitechException;
   
   /**
   * 교육훈련 개별 상한 금액 체크
   * @param HumApyEducVo
   * @return List<HumApyEducVo>
   * @throws KitechException
   */
   public List<HumApyEducVo> selectEduAmt(HumApyEducVo vo) throws KitechException;
   
   /**
   * 교육훈련 신청 저장
   * @param HumApyEducListVo
   * @return HumApyEducVo
   * @throws KitechException
   */
   public HumApyEducVo saveEducAll(HumApyTrainLstReqListVo vo) throws KitechException;
   
    /**
   * 교육훈련 전자결제 승인(화면)
   * @param HumApyEducListVo
   * @return 
   * @throws KitechException
   */
   public void formAccept(HumApyTrainLstReqListVo vo) throws KitechException;
   
    /**
   * 교육훈련 전자결제 반려(화면)
   * @param HumApyEducVo
   * @return 
   * @throws KitechException
   */
   public void formReject(HumApyEducVo vo) throws KitechException;
   
   /**
   * 교육훈련 참석자, 전자결재 삭제
   * @param HumApyEducVo
   * @return 
   * @throws KitechException
   */
   public void deleteApyTrain(HumApyEducVo vo) throws KitechException;
   
   /**
   * 교육훈련 참석자 저장
   * @param HumApyTrainLstReqListVo
   * @return List<HumApyEduCpacpVo>
   * @throws KitechException
   */
   public HumApyEduCpacpVo saveEducPacp(HumApyTrainLstReqListVo vo)  throws KitechException;
   
}
