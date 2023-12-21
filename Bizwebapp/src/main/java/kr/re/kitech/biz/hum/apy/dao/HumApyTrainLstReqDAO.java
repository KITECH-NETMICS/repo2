package kr.re.kitech.biz.hum.apy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.hum.apy.vo.HumApyEduCpacpVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyEducVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyTrainLstReqVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect : 교육훈련 신청
 * @ClassName : HumApyTrainLstReqDAO.java
 * @Description : 교육훈련 신청 DAO
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
@Repository("humApyTrainLstReqDAO")
public class HumApyTrainLstReqDAO extends BizDefaultAbstractDAO {
	/**
   * 교육훈련 신청 목록 조회 selectHumApyEduc01
   * @param HumApyTrainLstReqVo
   * @return List<HumApyTrainLstReqVo>
   * @throws KitechException
   */
	@SuppressWarnings("unchecked")
    public List<HumApyTrainLstReqVo> selectHumApyEduc01(HumApyTrainLstReqVo vo) throws KitechException {
		return (List<HumApyTrainLstReqVo>)list("kr.re.kitech.biz.hum.apy.selectHumApyEduc01", vo);
	}
	
	/**
   * 교육훈련 신청 목록 조회 selectHumApyEduc05
   * @param HumApyTrainLstReqVo
   * @return List<HumApyTrainLstReqVo>
   * @throws KitechException
   */
	@SuppressWarnings("unchecked")
    public List<HumApyTrainLstReqVo> selectHumApyEduc05(HumApyTrainLstReqVo vo) throws KitechException {
		return (List<HumApyTrainLstReqVo>)list("kr.re.kitech.biz.hum.apy.selectHumApyEduc05", vo);
	}
	
	/**
   * 교육훈련상세 조회 전 신청번호로 시스템사번 조회
   * @param HumApyEducVo
   * @return HumApyEducVo
   * @throws KitechException
   */
    public HumApyEducVo 	selectHumApyEduc(HumApyEducVo vo) throws KitechException {
	   return (HumApyEducVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApyEduc", vo);
    }
    
    /**
   * 교육훈련 신청 기본정보 - 문서 저장전 개인정보
   * @param HumApyEducVo
   * @return HumApyEducVo
   * @throws KitechException
   */
    public HumApyEducVo 	selectApyTrainBasicInfo(HumApyEducVo vo) throws KitechException {
	   return (HumApyEducVo) selectByPk("kr.re.kitech.biz.hum.apy.selectApyTrainBasicInfo", vo);
    }
    
    /**
   * 교육훈련 신청 기본정보 - 문서 저장후 개인정보
   * @param HumApyEducVo
   * @return HumApyEducVo
   * @throws KitechException
   */
    public HumApyEducVo 	selectApyTrainBasicInfo02(HumApyEducVo vo) throws KitechException {
	   return (HumApyEducVo) selectByPk("kr.re.kitech.biz.hum.apy.selectApyTrainBasicInfo02", vo);
    }
    
    /**
   * 교육훈련신청 - 교육훈련참가 조회
   * @param HumApyEduCpacpVo
   * @return List<HumApyEduCpacpVo>
   * @throws KitechException
   */
	@SuppressWarnings("unchecked")
    public List<HumApyEduCpacpVo> selectHumApyEducpacp(HumApyEducVo vo) throws KitechException {
		return (List<HumApyEduCpacpVo>)list("kr.re.kitech.biz.hum.apy.selectHumApyEducpacp", vo);
	}
	
	/**
   * 교육훈련 개별 상한 금액 체크
   * @param HumApyEducVo
   * @return List<HumApyEducVo>
   * @throws KitechException
   */
	@SuppressWarnings("unchecked")
    public List<HumApyEducVo> selectEduAmt(HumApyEducVo vo) throws KitechException {
		return (List<HumApyEducVo>)list("kr.re.kitech.biz.hum.apy.selectEduAmt", vo);
	}
	
	/**
   * 교육훈련 신청 기본저장
   * @param HumApyEducVo
   * @return int
   * @throws KitechException
   */
   public int insertHumApyEducSI01(HumApyEducVo vo) throws KitechException {
	   return insert("kr.re.kitech.biz.hum.apy.insertHumApyEducSI01", vo);
   }
   
   /**
   * 교육훈련 신청 기본저장 - selectHumApyEduCpacpSS02
   * @param HumApyEducVo
   * @return int
   * @throws KitechException
   */
   public int selectHumApyEduCpacpSS02(HumApyEducVo vo) {
	    return (int)super.selectByPk("kr.re.kitech.biz.hum.apy.selectHumApyEduCpacpSS02", vo);
   }
   
    /**
   * 교육훈련 신청 기본저장 - insertHumApyEduCpacpSI01
   * @param HumApyEducVo
   * @return int
   * @throws KitechException
   */
   public int insertHumApyEduCpacpSI01(HumApyEduCpacpVo vo) throws KitechException {
	  return insert("kr.re.kitech.biz.hum.apy.insertHumApyEduCpacpSI01", vo);
  }
  
   /**
   * 교육훈련 신청 기본저장 - insertHumApyEduCpacpSI01
   * @param HumApyEducVo
   * @return int
   * @throws KitechException
   */
   public int updateHumApyEduCpacpSU01(HumApyEduCpacpVo vo) throws KitechException {
	  return update("kr.re.kitech.biz.hum.apy.updateHumApyEduCpacpSU01", vo);
  }
  
  /**
   * 교육훈련 신청 기본저장 update - updateHumApyEducSI01
   * @param HumApyEducVo
   * @return int
   * @throws KitechException
   */
   public int  updateHumApyEducSI01(HumApyEducVo vo) throws KitechException {
	   return update("kr.re.kitech.biz.hum.apy.updateHumApyEducSI01", vo);
   }
   
   /**
   * 교육훈련 참석자, 전자결재 삭제
   * @param HumApyEducVo
   * @return int
   * @throws KitechException
   */
   public int  deleteHumApyEduc(HumApyEducVo vo) throws KitechException {
	   return delete("kr.re.kitech.biz.hum.apy.deleteHumApyEduc", vo);
   }
   
   /**
   * 교육훈련 참석자, 전자결재 삭제
   * @param HumApyEducVo
   * @return int
   * @throws KitechException
   */
   public int  deleteHumApyEduCpacp(HumApyEducVo vo) throws KitechException {
	   return delete("kr.re.kitech.biz.hum.apy.deleteHumApyEduCpacp", vo);
   }
   
   /**
   * 교육훈련 참석자, 전자결재 삭제 후 비용 업데이트
   * @param HumApyEducVo
   * @return int
   * @throws KitechException
   */
   public int  updateHumApyEduc(HumApyEducVo vo) throws KitechException {
	   return update("kr.re.kitech.biz.hum.apy.updateHumApyEduc", vo);
   }
   
    /**
   * 교육훈련 참석자 저장 시 체크 - selectHumApyEduCpacpSS03
   * @param HumApyEduCpacpVo
   * @return int
   * @throws KitechException
   */
   public int selectHumApyEduCpacpSS03(HumApyEduCpacpVo vo) {
	    return (int)super.selectByPk("kr.re.kitech.biz.hum.apy.selectHumApyEduCpacpSS03", vo);
   }
   
   /**
   * 교육훈련 신청 참석자 저장
   * @param HumApyEduCpacpVo
   * @return int
   * @throws KitechException
   */
   public int insertHumApyEduCpacpSI02(HumApyEduCpacpVo vo) throws KitechException {
	  return insert("kr.re.kitech.biz.hum.apy.insertHumApyEduCpacpSI02", vo);
  }
  
  /**
   * 교육훈련 신청 참석자 업데이트
   * @param HumApyEduCpacpVo
   * @return int
   * @throws KitechException
   */
   public int updateHumApyEduCpacpSU02(HumApyEduCpacpVo vo) throws KitechException {
	   return update("kr.re.kitech.biz.hum.apy.updateHumApyEduCpacpSU02", vo);
   }
   
   /**
   * 교육훈련 신청 참석자 저장/업데이트 후  비용 업데이트
   * @param HumApyEduCpacpVo
   * @return int
   * @throws KitechException
   */
   public int updateHumApyEducSU05(HumApyEduCpacpVo vo) throws KitechException {
	   return update("kr.re.kitech.biz.hum.apy.updateHumApyEducSU05", vo);
   }
   
}
