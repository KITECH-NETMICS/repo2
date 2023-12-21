package kr.re.kitech.biz.res.exc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.fin.com.vo.AutoBugtVo;
import kr.re.kitech.biz.res.exc.vo.ResExcExeBdgetInfoVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 
 * @ClassName : ResExcExeBdgetDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.16.     김상미    최초생성
 * 
 * @author 김상미
 * @since 2023.10.16.
 * @version 1.0
 * @see
 * 
 */
@Repository("resExcExeBdgetDAO")
public class ResExcExeBdgetDAO extends BizDefaultAbstractDAO {
	
	/**
	 * 실행예산편성관리 조회
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return List<ResExcExeBdgetInfoVo>
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public List<ResExcExeBdgetInfoVo> selectResExcExeBdgetList(ResExcExeBdgetInfoVo vo) throws KitechException {
		return (List<ResExcExeBdgetInfoVo>)list("kr.re.kitech.biz.res.exc.selectResExcExeBdgetList", vo);
	}
	
	/**
	 * 실행예산(계정)내역 조회
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public ResExcExeBdgetInfoVo selectResExcBdgetAcctm(ResExcExeBdgetInfoVo vo) throws KitechException {
		return (ResExcExeBdgetInfoVo) selectByPk("kr.re.kitech.biz.res.exc.selectResExcBdgetAcctm", vo);
	}

	/**
	 * 실행예산신청번호를 가지고 과제번호,계정번호 조회
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public ResExcExeBdgetInfoVo selectResExcBdgetPrjAccntNoByReqNo(ResExcExeBdgetInfoVo vo) throws KitechException {
		return (ResExcExeBdgetInfoVo) selectByPk("kr.re.kitech.biz.res.exc.selectResExcBdgetPrjAccntNoByReqNo", vo);
	}		

	/**
	 * 위탁사업계획서 존재유무 확인
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public ResExcExeBdgetInfoVo selectResExcConsWorkFile(ResExcExeBdgetInfoVo vo) throws KitechException {
		return (ResExcExeBdgetInfoVo) selectByPk("kr.re.kitech.biz.res.exc.selectResExcConsWorkFile", vo);
	}	
	
	/**
	 * 계정별 실행예산상태, 실행예산차수 MAX, 계정상태 조회
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public ResExcExeBdgetInfoVo selectResExcBdgetState(ResExcExeBdgetInfoVo vo) throws KitechException {
		return (ResExcExeBdgetInfoVo) selectByPk("kr.re.kitech.biz.res.exc.selectResExcBdgetState", vo);
	}		

	/**
	 * 과제별 타계정 O/H 흡수 비목(예산항목) 금액 조회
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public ResExcExeBdgetInfoVo selectResBgAgreeSum(ResExcExeBdgetInfoVo vo) throws KitechException {
		return (ResExcExeBdgetInfoVo) selectByPk("kr.re.kitech.biz.res.exc.selectResBgAgreeSum", vo);
	}			

	/**
	 * 계정별 대비목/세부비목에 대한 예산(협약예산/집행금액(원인금액포함)) 내역 조회
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return List<ResExcExeBdgetInfoVo>
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public List<ResExcExeBdgetInfoVo> selectResExcBdgetAgree(ResExcExeBdgetInfoVo vo) throws KitechException {
		return (List<ResExcExeBdgetInfoVo>)list("kr.re.kitech.biz.res.exc.selectResExcBdgetAgree", vo);
	}

	/**
	 * 계정별 대비목/세부비목에 대한 차수별 실행예산 내역 조회 
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return List<ResExcExeBdgetInfoVo>
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public List<ResExcExeBdgetInfoVo> selectResExcBdgetExect(ResExcExeBdgetInfoVo vo) throws KitechException {
		return (List<ResExcExeBdgetInfoVo>)list("kr.re.kitech.biz.res.exc.selectResExcBdgetExect", vo);
	}

	/**
	 * 실행예산 내 외부전문기술활용비를 협약예산과 체크
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public ResExcExeBdgetInfoVo selectResExcRstAmtChk(ResExcExeBdgetInfoVo vo) throws KitechException {
		return (ResExcExeBdgetInfoVo) selectByPk("kr.re.kitech.biz.res.exc.selectResExcRstAmtChk", vo);
	}	

	/**
	 * 계정번호로 sub계정 있는지 체크
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public ResExcExeBdgetInfoVo selectMainAccntChk(ResExcExeBdgetInfoVo vo) throws KitechException {
		return (ResExcExeBdgetInfoVo) selectByPk("kr.re.kitech.biz.res.exc.selectMainAccntChk", vo);
	}	

	/**
	 * 외부전문기술활용비, 국제공동연구 직접비 체크
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public ResExcExeBdgetInfoVo selectResExcDrctAmtChk(ResExcExeBdgetInfoVo vo) throws KitechException {
		return (ResExcExeBdgetInfoVo) selectByPk("kr.re.kitech.biz.res.exc.selectResExcDrctAmtChk", vo);
	}	


	/**
	 * 계정의 실행예산에 대한 검증
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public List<ResExcExeBdgetInfoVo> selectResExcExeBdgetEct(ResExcExeBdgetInfoVo vo) throws KitechException {
		return (List<ResExcExeBdgetInfoVo>)list("kr.re.kitech.biz.res.exc.selectResExcExeBdgetEct", vo);
	}	


	/**
	 * 이자,이월계정 금액검증 조회
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public List<ResExcExeBdgetInfoVo> selectResExcBdgetAgreeTotal(ResExcExeBdgetInfoVo vo) throws KitechException {
		return (List<ResExcExeBdgetInfoVo>)list("kr.re.kitech.biz.res.exc.selectResExcBdgetAgreeTotal", vo);
	}	


	/**
	 * 연구과제추진비 대한 검증
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public List<ResExcExeBdgetInfoVo> selectResExcPrjBdgetEct(ResExcExeBdgetInfoVo vo) throws KitechException {
		return (List<ResExcExeBdgetInfoVo>) list("kr.re.kitech.biz.res.exc.selectResExcPrjBdgetEct", vo);
	}				
				
	/**
	 * (연구비)입금관리상세 내역(입금구분, 계산서번호, 입금의뢰번호) 조회
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public ResExcExeBdgetInfoVo selectResExcBdgetRectl(ResExcExeBdgetInfoVo vo) throws KitechException {
		return (ResExcExeBdgetInfoVo) selectByPk("kr.re.kitech.biz.res.exc.selectResExcBdgetRectl", vo);
	}
	
	/**
	 * 사용자용 실행예산편성 조회  
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return List<ResExcExeBdgetInfoVo>
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public List<ResExcExeBdgetInfoVo> selectResExcExeBdgetForUserList(ResExcExeBdgetInfoVo vo) throws KitechException {
		return (List<ResExcExeBdgetInfoVo>)list("kr.re.kitech.biz.res.exc.selectResExcExeBdgetForUserList", vo);
	}	

	/**
	 * 실행예산 변경사유 조회 
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return List<ResExcExeBdgetInfoVo>
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public List<ResExcExeBdgetInfoVo> selectResExcBdgetExereList(ResExcExeBdgetInfoVo vo) throws KitechException {
		return (List<ResExcExeBdgetInfoVo>)list("kr.re.kitech.biz.res.exc.selectResExcBdgetExereList", vo);
	}

	/**
	 * 실행예산 변경사유 수정
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public int updateResExcBdgetExere(ResExcExeBdgetInfoVo vo) throws KitechException {
		return update("kr.re.kitech.biz.res.exc.updateResExcBdgetExere", vo);
	}		

	/**
	 * 실행예산 변경사유 등록
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public int insertResExcBdgetExere(ResExcExeBdgetInfoVo vo) throws KitechException {
		return insert("kr.re.kitech.biz.res.exc.insertResExcBdgetExere", vo);
	}
	
	/**
	 * 실행예산 내역 등록
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public int insertResExcBdgetExect(ResExcExeBdgetInfoVo vo) throws KitechException {
		return insert("kr.re.kitech.biz.res.exc.insertResExcBdgetExect", vo);
	}

	/**
	 * 실행예산 신청시 계정상태 변경
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public int updateResExcBgacctmState(ResExcExeBdgetInfoVo vo) throws KitechException {
		return update("kr.re.kitech.biz.res.exc.updateResExcBgacctmState", vo);
	}	

	/**
	 * 실행예산 편성 삭제
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public int deleteResExcBgExect(ResExcExeBdgetInfoVo vo) throws KitechException {
		return delete("kr.re.kitech.biz.res.exc.deleteResExcBgExect", vo);
	}

	/**
	 * 실행예산 편성 변경 사유 삭제
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public int deleteResExcBgExere(ResExcExeBdgetInfoVo vo) throws KitechException {
		return delete("kr.re.kitech.biz.res.exc.deleteResExcBgExere", vo);
	}	

	/**
	 * 실행예산 내역 수정
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public int updateResExcBdgetExect(ResExcExeBdgetInfoVo vo) throws KitechException {
		return update("kr.re.kitech.biz.res.exc.updateResExcBdgetExect", vo);
	}	

	/**
	 * 해당 계정번호/실행예산차수에 대한 신청일자/신청자 및 상태를 수정
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public int updateResExcBdgetExectState(ResExcExeBdgetInfoVo vo) throws KitechException {
		return update("kr.re.kitech.biz.res.exc.updateResExcBdgetExectState", vo);
	}		

	/**
	 * 메인계정책임자조회
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return AutoBugtVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public AutoBugtVo selectBudgetResMan(ResExcExeBdgetInfoVo vo) throws KitechException {
		return (AutoBugtVo) selectByPk("kr.re.kitech.biz.res.exc.selectBudgetResMan", vo);
	}
}
