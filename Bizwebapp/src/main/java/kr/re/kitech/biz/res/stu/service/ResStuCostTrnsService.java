package kr.re.kitech.biz.res.stu.service;

import java.util.List;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.fin.set.vo.FsaAbsrpListVo;
import kr.re.kitech.biz.fin.set.vo.FsaAbsrpVo;
import kr.re.kitech.biz.res.stu.vo.ResStuCostTrnsVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;



/**
 * @ClassSubJect : 연구비흡수 관리
 * @Class Name : FsaAbsrpService.java
 * @Description : 연구비흡수 관련 서비스 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.08.29.      이민기    최초생성
 * 
 * @author 이민기
 * @since 2023.08.29.
 * @version 1.0
 * @see
 * 
 */
public interface ResStuCostTrnsService {

 /**
   * 학생인건비 추가흡수/취소 결의내역 목록조회
	 * 
	 * @author 이민기
   * @param ResStuCostTrnsVo
   * @return FsaAbsrpVo
   * @throws KitechException
   * @since 2023.08.29.   
   */
  public List<ResStuCostTrnsVo> selectResStuCostSlipMS(ResStuCostTrnsVo vo) throws ElException;
  
 
 /**
   * 학생인건비 추가흡수/취소 결의내역 조회
	 * 
	 * @author 이민기
   * @param FsaAbsrpVo
   * @return FsaAbsrpListVo
   * @throws KitechException
   * @since 2023.08.29.   
   */
  public FsaAbsrpListVo selectResStuCostSlipSS(FsaAbsrpVo absrVo) throws ElException;
  
  /**
   * 학생인건비 흡수취소 이전흡수내역 조회
   * 
   * @author 이민기
   * @param FsaAbsrpVo
   * @return FsaAbsrpVo
   * @throws KitechException
   * @since 2023.08.31.   
   */
  public List<FsaAbsrpVo> selectFsaAbsrpBfSlipMS(FsaAbsrpVo absrVo) throws ElException;
  
   /**
   * 학생인건비 추가흡수 상세계정내역 조회
   * 
   * @author 이민기
   * @param FsaAbsrpVo
   * @return FsaAbsrpVo
   * @throws KitechException
   * @since 2023.09.6.   
   */
  public List<FsaAbsrpVo> selectFsaAbsrpAccntMS(FsaAbsrpVo absrVo) throws ElException;
  
  /**
   * 학생인건비 이관대상 상세 조회
   * 
   * @author 이민기
   * @param FsaAbsrpVo
   * @return FsaAbsrpVo
   * @throws KitechException
   * @since 2023.09.11.   
   */
  public List<ResStuCostTrnsVo> selectFsaTrnspAccntMS(ResStuCostTrnsVo absrVo) throws ElException;
   
    /**
   * 학생인건비 흡수취소 결의 
   * 
   * @author 이민기
   * @param FsaAbsrpListVo
   * @return 
   * @throws KitechException
   * @since 2023.08.29.   
   */
  public String saveStuCostSlip(FsaAbsrpListVo absrVo) throws ElException;
  
   /**
   * 학생인건비 흡수취소 결의 (A타입) 
   * 
   * @author 이민기
   * @param FsaAbsrpListVo
   * @return Unslip_No
   * @throws KitechException
   * @since 2023.08.29.   
   */
  public String saveStuCostSlipA(FsaAbsrpListVo absrVo) throws ElException;
  
   /**
   * 학생인건비 흡수취소 결의 (B타입) 
   * 
   * @author 이민기
   * @param FsaAbsrpListVo
   * @return Unslip_No
   * @throws KitechException
   * @since 2023.08.29.   
   */
  public String saveStuCostSlipB(FsaAbsrpListVo absrVo) throws ElException;
  
   /**
   * 학생인건비 흡수취소 결의 (C타입) 
   * 
   * @author 이민기
   * @param FsaAbsrpListVo
   * @return Unslip_No
   * @throws KitechException
   * @since 2023.08.29.   
   */
  public String saveStuCostSlipC(FsaAbsrpListVo absrVo) throws ElException;
  
   /**
   * 학생인건비 추가흡수 및 흡수취소 결의취소
   * 
   * @author 이민기
   * @param FsaAbsrpListVo
   * @return 
   * @throws KitechException
   * @since 2023.08.31.   
   */
  public void saveStuCostSlipCancel(FsaAbsrpListVo absrVo) throws ElException;

  /**
   * 학생인건비 추가흡수 및 흡수취소 결재신청
   * 
   * @author 이민기
   * @param FsaAbsrpListVo
   * @return 
   * @throws KitechException
   * @since 2023.09.6.   
   */
  public void saveStuCostApr(FsaAbsrpListVo vo) throws ElException;
  
}
