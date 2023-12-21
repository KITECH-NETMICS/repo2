package kr.re.kitech.biz.res.exc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.res.exc.vo.ResExcPrjBdgetInfoVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 
 * @ClassName : ResExcPrjBdgetDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.24.     김상미    		최초생성
 * 
 * @author 김상미
 * @since 2023.10.24.
 * @version 1.0
 * @see
 * 
 */
@Repository("resExcPrjBdgetDAO")
public class ResExcPrjBdgetDAO extends BizDefaultAbstractDAO {
	
	/**
	 * PX프로젝트 계정 실행예산 편성 계정 목록 조회
	 * 
	 * @author 김상미
	 * @param ResExcPrjBdgetInfoVo
	 * @return List<ResExcPrjBudgetVo>
	 * @throws KitechException
	 * @since 2023.10.24.   
	 */
	public List<ResExcPrjBdgetInfoVo> selectResExcPrjBdgetList(ResExcPrjBdgetInfoVo vo) throws KitechException {
		return (List<ResExcPrjBdgetInfoVo>)list("kr.re.kitech.biz.res.exc.selectResExcPrjBdgetList", vo);
	}
	
	/**
	 * 프로젝트 예산 편성 계정정보 조회
	 * 
	 * @author 김상미
	 * @param ResExcPrjBdgetInfoVo
	 * @return ResExcPrjBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.24.   
	 */
	public ResExcPrjBdgetInfoVo selectPrjAccntBugtMaster(ResExcPrjBdgetInfoVo vo) throws KitechException {
		return (ResExcPrjBdgetInfoVo) selectByPk("kr.re.kitech.biz.res.exc.selectResExcPrjBdgetAcctm", vo);
	}	

	/**
	 * 프로젝트 예산등록 기본정보 조회
	 * 
	 * @author 김상미
	 * @param ResExcPrjBdgetInfoVo
	 * @return ResExcPrjBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.24.   
	 */
	public ResExcPrjBdgetInfoVo selectPrjAccntBugtInfo(ResExcPrjBdgetInfoVo vo) throws KitechException {
		return (ResExcPrjBdgetInfoVo) selectByPk("kr.re.kitech.biz.res.exc.selectResExcPrjBudgetBasic", vo);
	}
		
	/**
	 * 프로젝트 예산 편성 내역 조회
	 * 
	 * @author 김상미
	 * @param ResExcPrjBdgetInfoVo
	 * @return List<ResExcPrjBdgetInfoVo>
	 * @throws KitechException
	 * @since 2023.10.24.   
	 */
	public List<ResExcPrjBdgetInfoVo> selectResExcPrjAccntBuget(ResExcPrjBdgetInfoVo vo) throws KitechException {
		return (List<ResExcPrjBdgetInfoVo>)list("kr.re.kitech.biz.res.exc.selectResExcPrjAccntBuget", vo);
	}

	/**
	 * 신청번호로 계정번호 조회
	 * 
	 * @author 김상미
	 * @param ResExcPrjBdgetInfoVo
	 * @return ResExcPrjBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.24.   
	 */
	public ResExcPrjBdgetInfoVo selectResPrjAccntBugtByReqno(ResExcPrjBdgetInfoVo vo) throws KitechException {
		return (ResExcPrjBdgetInfoVo) selectByPk("kr.re.kitech.biz.res.exc.selectResPrjAccntBugtByReqno", vo);
	}

	/**
	 * 계정별 대비목/세부비목에 대한 차수별 실행예산 내역 조회
	 * 
	 * @author 김상미
	 * @param ResExcPrjBdgetInfoVo
	 * @return List<ResExcPrjBdgetInfoVo>
	 * @throws KitechException
	 * @since 2023.10.24.   
	 */
	public List<ResExcPrjBdgetInfoVo> selectResPrjAccntBugt(ResExcPrjBdgetInfoVo vo) throws KitechException {
		return (List<ResExcPrjBdgetInfoVo>)list("kr.re.kitech.biz.res.exc.selectResPrjAccntBugt", vo);
	}
	
	/**
	 * PX계정실행예산마스터 저장
	 * 
	 * @author 김상미
	 * @param ResExcPrjBdgetInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.10.24.   
	 */
	public int insertResBgPrjbugtm(ResExcPrjBdgetInfoVo vo) throws KitechException {
		return insert("kr.re.kitech.biz.res.exc.insertResBgPrjbugtm", vo);
	}	
		
	/**
	 * PX계정실행예산마스터 수정
	 * 
	 * @author 김상미
	 * @param ResExcPrjBdgetInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.10.24.   
	 */
	public int updateResBgPrjbugtm(ResExcPrjBdgetInfoVo vo) throws KitechException {
		return update("kr.re.kitech.biz.res.exc.updateResBgPrjbugtm", vo);
	}		

	/**
	 * 프로젝트 예산 등록 (금액)
	 * 
	 * @author 김상미
	 * @param ResExcPrjBdgetInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.10.24.   
	 */
	public int insertResBgPrjbugt(ResExcPrjBdgetInfoVo vo) throws KitechException {
		return insert("kr.re.kitech.biz.res.exc.insertResBgPrjbugt", vo);
	}

	/**
	 * 프로젝트 예산 수정 (금액)
	 * 
	 * @author 김상미
	 * @param ResExcPrjBdgetInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.10.24.   
	 */
	public int updateResBgPrjbugt(ResExcPrjBdgetInfoVo vo) throws KitechException {
		return update("kr.re.kitech.biz.res.exc.updateResBgPrjbugt", vo);
	}		
		
	/**
	 * 실행예산 신청시 계정상태 변경(계정마스터수정)
	 * 
	 * @author 김상미
	 * @param ResExcPrjBdgetInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.10.24.   
	 */
	public int updateResBgAcctm(ResExcPrjBdgetInfoVo vo) throws KitechException {
		return update("kr.re.kitech.biz.res.exc.updateResBgAcctm", vo);
	}	

	/**
	 * ADX계정 실행예산 내 이월금액 변경
	 * 
	 * @author 김상미
	 * @param ResExcPrjBdgetInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.10.24.   
	 */
	public int updateResCryfwdAmt(ResExcPrjBdgetInfoVo vo) throws KitechException {
		return update("kr.re.kitech.biz.res.exc.updateResCryfwdAmt", vo);
	}
	
	/**
	 * 프로젝트 예산편성삭제
	 * 
	 * @author 김상미
	 * @param ResExcPrjBdgetInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.10.24.   
	 */
	public int deleteResBgPrjBugt(ResExcPrjBdgetInfoVo vo) throws KitechException {
		return delete("kr.re.kitech.biz.res.exc.deleteResBgPrjBugt", vo);
	}		
	
	/**
	 * 프로젝트 예산편성 마스터 삭제
	 * 
	 * @author 김상미
	 * @param ResExcPrjBdgetInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.10.24.   
	 */
	public int deleteResBgPrjBugtm(ResExcPrjBdgetInfoVo vo) throws KitechException {
		return delete("kr.re.kitech.biz.res.exc.deleteResBgPrjBugtm", vo);
	}
	
	
	/**
	 * fcommlog 테이블에서 log information 조회
	 * 
	 * @author 김상미
	 * @param ResExcPrjBdgetInfoVo
	 * @return ResExcPrjBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.24.   
	 */
	public ResExcPrjBdgetInfoVo selectFcommlog(ResExcPrjBdgetInfoVo vo) throws KitechException {
		return (ResExcPrjBdgetInfoVo) selectByPk("kr.re.kitech.biz.res.exc.selectFcommlog", vo);
	}
		
}
