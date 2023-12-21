package kr.re.kitech.biz.hum.apy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.hum.apy.vo.HumApyAllowInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyRctFamInfoVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 가족수당신청 
 * @Class Name HumApyAllowDAO.java
 * @Description 가족수당신청 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2023.08.11.     김상미             최초생성
 * 
 * @author 김상미
 * @since 2023.08.11.
 * @version 1.0
 * @see
 * 
 */
 
  @Repository("humApyAllowDAO")
  public class HumApyAllowDAO extends BizDefaultAbstractDAO {
  
	/**
	 * 가족수당신청 목록 조회
	 * @param  HumApyAllowInfoVo
	 * @return List<HumApyAllowInfoVo>
	 * @throws KitechException
	 * @since 2023.08.11.
	 */
	public List<HumApyAllowInfoVo> selectList(HumApyAllowInfoVo vo) throws KitechException {
		return (List<HumApyAllowInfoVo>)list("kr.re.kitech.biz.hum.apy.selectHumApyAllowList", vo);
	}

	/**
	 * 가족수당신청 상세 조회
	 * @param  HumApyAllowInfoVo
	 * @return HumApyAllowInfoVo
	 * @throws KitechException
	 * @since 2023.08.11.
	 */
	public HumApyAllowInfoVo selectHumApyUserBasicInfo(HumApyAllowInfoVo vo) throws KitechException {
		return (HumApyAllowInfoVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApyUserBasicInfo", vo);
	}
	 
	/**
	 * 가족수당신청 결재요청 정보 조회
	 * @param  HumApyAllowInfoVo
	 * @return HumApyAllowInfoVo
	 * @throws KitechException
	 * @since 2023.08.11.
	 */
	public HumApyAllowInfoVo selectHumApyAllowBasic(HumApyAllowInfoVo vo) throws KitechException {
		return (HumApyAllowInfoVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApyAllowBasic", vo);
	}
	
	
	/**
	 * 가족수당신청 중복신청 여부 조회
	 * @param  HumApyAllowInfoVo
	 * @return HumApyAllowInfoVo
	 * @throws KitechException
	 * @since 2023.08.11.
	 */
	public HumApyAllowInfoVo selectHumApyAprDuplCheck(HumApyAllowInfoVo vo) throws KitechException {
		return (HumApyAllowInfoVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApyAprDuplCheck", vo);
	}
	 
	 
	/**
	 * 기본 가족정보리스트 조회
	 * @param  HumApyAllowInfoVo
	 * @return List<HumApyRctFamInfoVo>
	 * @throws KitechException
	 * @since 2023.08.11.
	 */
	public List<HumApyRctFamInfoVo> selectHumApyBasicFamList(HumApyAllowInfoVo vo) throws KitechException {
		return (List<HumApyRctFamInfoVo>)list("kr.re.kitech.biz.hum.apy.selectHumApyBasicFamList", vo);
	}
	 
	/**
	 * 요청 전/후 가족정보리스트 조회
	 * @param  HumApyAllowInfoVo
	 * @return List<HumApyRctFamInfoVo>
	 * @throws KitechException
	 * @since 2023.08.11.
	 */
	public List<HumApyRctFamInfoVo> selectHumApyReqRctFamList(HumApyAllowInfoVo vo) throws KitechException {
		return (List<HumApyRctFamInfoVo>)list("kr.re.kitech.biz.hum.apy.selectHumApyReqRctFamList", vo);
	}
	
	
	/**
	 * 가족수당신청 신청 정보 조회
	 * @param  HumApyAllowInfoVo
	 * @return HumApyAllowInfoVo
	 * @throws KitechException
	 * @since 2023.08.11.
	 */
	public HumApyAllowInfoVo selectHumApyBasic(HumApyAllowInfoVo vo) throws KitechException {
		return (HumApyAllowInfoVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApyBasic", vo);
	}
	
	/**
	 * 가족수당신청 신청 정보 등록
	 * @param  HumApyAllowInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.08.11.
	 */
	public int insert(HumApyAllowInfoVo vo) throws KitechException {
		return insert("kr.re.kitech.biz.hum.apy.insertHumApyAlowwBasic", vo);
	}
	
	/**
	 * 가족수당신청 신청 정보 수정
	 * @param  HumApyAllowInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.08.11.
	 */
	public int update(HumApyAllowInfoVo vo) throws KitechException {
		return update("kr.re.kitech.biz.hum.apy.updateHumApyAllowBasic", vo);
	}
	
	
	/**
	 * 가족수당신청 신청일자 수정
	 * @param  HumApyAllowInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.08.11.
	 */
	public int updateReqYmd(HumApyAllowInfoVo vo) throws KitechException {
		return update("kr.re.kitech.biz.hum.apy.updateHumApyAllowReqYmd", vo);
	}
	 
	/**
	 * 가족수당신청 대상 가족 정보 등록
	 * @param  HumApyRctFamInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.08.11.
	 */
	public int insertRctFam(HumApyRctFamInfoVo vo) throws KitechException {
		return insert("kr.re.kitech.biz.hum.apy.insertHumApyAllowRctFam", vo);
	}
	 
	/**
	 * 가족수당신청 대상 가족 정보 수정
	 * 
	 * @author 김상미
	 * @param  HumApyRctFamInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.08.11.
	 */
	public int updateRctFam(HumApyRctFamInfoVo vo) throws KitechException {
		return update("kr.re.kitech.biz.hum.apy.updateHumApyAllowRctFam", vo);
	}  
	
	
	/**
	 * 가족수당신청 삭제대상 가족정보 조회
	 * 
	 * @author 김상미
	 * @param  HumApyAllowInfoVo
	 * @return List<HumApyRctFamInfoVo>
	 * @throws KitechException
	 * @since 2023.08.11.
	 */
	public List<HumApyRctFamInfoVo> selectHumApyAllowDelFamy(HumApyAllowInfoVo vo) throws KitechException {
		return (List<HumApyRctFamInfoVo>) list("kr.re.kitech.biz.hum.apy.selectHumApyAllowDelFamy", vo);
	}
	
	/**
	 * 가족수당신청 대상제외 가족기본 정보 삭제
	 * 
	 * @author 김상미
	 * @param  HumApyRctFamInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.08.11.
	 */
	public int deleteBasicFamyInfo(HumApyRctFamInfoVo vo) throws KitechException {
		return delete("kr.re.kitech.biz.hum.apy.deleteBasicFamyInfo", vo);
	}   
	
	
	/**
	 * 가족수당신청 신청가족 변경후 리스트
	 * 
	 * @author 김상미
	 * @param  HumApyAllowInfoVo
	 * @return List<HumApyRctFamInfoVo>
	 * @throws KitechException
	 * @since 2023.08.11.
	 */
	public List<HumApyRctFamInfoVo> selectRctFamAfterList(HumApyAllowInfoVo vo) throws KitechException {
		return (List<HumApyRctFamInfoVo>)list("kr.re.kitech.biz.hum.apy.selectRctFamAfterList", vo);
	}  
	
	
	/**
	 * 가족기본정보 조회
	 * 
	 * @author 김상미
	 * @param  HumApyRctFamInfoVo
	 * @return HumApyRctFamInfoVo
	 * @throws KitechException
	 * @since 2023.08.11.
	 */
	public HumApyRctFamInfoVo selectHumFamyInfo(HumApyRctFamInfoVo vo) throws KitechException {
		return (HumApyRctFamInfoVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumFamyInfo", vo);
	}   
	
	
	/**
	 * 기본 가족 정보 등록
	 * 
	 * @author 김상미
	 * @param  HumApyRctFamInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.08.11.
	 */
	public int insertHumFamyInfo(HumApyRctFamInfoVo vo) throws KitechException {
		return insert("kr.re.kitech.biz.hum.apy.insertHumFamyInfo", vo);
	}
	
	/**
	 * 기본 가족 정보 수정
	 * 
	 * @author 김상미
	 * @param  HumApyRctFamInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.08.11.
	 */
	public int updateHumFamyInfo(HumApyRctFamInfoVo vo) throws KitechException {
		return update("kr.re.kitech.biz.hum.apy.updateHumFamyInfo", vo);
	}  

	/**
	 * 가족수당신청 기본정보 삭제
	 * 
	 * @author 김상미
	 * @param  HumApyRctFamInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.08.11.
	 */
	public int delete(HumApyAllowInfoVo vo) throws KitechException {
		return delete("kr.re.kitech.biz.hum.apy.deleteHumApyAllowBasic", vo);
	}

	/**
	 * 가족수당신청 요청 가족정보 삭제
	 * 
	 * @author 김상미
	 * @param  HumApyAllowInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.08.11.
	 */
	public int deleteRctFam(HumApyAllowInfoVo vo) throws KitechException {
		return delete("kr.re.kitech.biz.hum.apy.deleteHumApyAllowRctFam", vo);
	}

}
