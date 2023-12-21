package kr.re.kitech.biz.sup.tec.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo;
import kr.re.kitech.biz.fin.fnd.vo.FndDepstSrcVo;
import kr.re.kitech.biz.fin.tax.vo.FtxBillDVo;
import kr.re.kitech.biz.sup.tec.vo.SptFtxBillHVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecBillBuyrChrgVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecDepstVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRcptDemndVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRcptInfoVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSlipSrcVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSrcVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 기술지원입금의뢰 DAO
 * @Class Name SupTecDepstReqDAO.java
 * @Description 기술지원입금의뢰 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/05/22   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/05/22
 * @version 1
 * @see
 * 
 */
@Repository("supTecDepstReqDAO")
public class SupTecDepstReqDAO extends BizDefaultAbstractDAO {
	/**
     * 외부기술지원 입금의뢰(계산서발행) 목록 조회
     * @param SptTecSrcVo
     * @return List<SptTecDepstVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<SptTecDepstVo> selectSptTechRcptDepstList(SptTecSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.sup.tec.selectSptTechRcptDepstList", vo);
	}
	
	/**
     * 외부기술지원 계산서 디테일 초기정보 조회
     * @param SptTecSrcVo
     * @return List<FtxBillDVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<FtxBillDVo> selectSptTecRcptInfoBillD(SptTecSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.sup.tec.selectSptTecRcptInfoBillD", vo);
	}
	
	/**
     * 외부기술지원 계산서 공급받는자 정보 조회
     * @param String vendCd
     * @return List<SptTecBillBuyrChrgVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<SptTecBillBuyrChrgVo> selectXodfVendJobBuyrChrg(String vendCd) throws KitechException{
		return list("kr.re.kitech.biz.sup.tec.selectXodfVendJobBuyrChrg", vendCd);
	}
	
	/**
     * 외부기술지원 계산서 공급받는자 정보 조회2(상담의뢰자)
     * @param String techSuptReqNo
     * @return List<SptTecBillBuyrChrgVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<SptTecBillBuyrChrgVo> selectSptCtiCunslBuyrChrg(String techSuptReqNo) throws KitechException{
		return list("kr.re.kitech.biz.sup.tec.selectSptCtiCunslBuyrChrg", techSuptReqNo);
	}
	
	/**
     * 일반사용자 전자발행 요청저장(매출계산서 발행) 또는 입금의뢰시 신청번호 업데이트
     * @param SptTecRcptInfoVo
     * @return int
     * @throws Exception
     */
	public int updateSptTecRcptInfoBill(SptTecRcptInfoVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tec.updateSptTecRcptInfoBill", vo);
	}
	
	/**
     * 예금입금의뢰등록팝업 (조회)
     * @param FndDepstSrcVo
     * @return FcpDepstReqVo
     * @throws Exception
     */
	public FcpDepstReqVo selectFcpDepstReq(FndDepstSrcVo vo) throws KitechException{
    	return (FcpDepstReqVo)selectByPk("kr.re.kitech.biz.fin.fnd.selectFcpDepstReq", vo);
    }
    
    /**
     * 입금의뢰시 최초정보 조회
     * @param String reqNo
     * @return FcpDepstReqVo
     * @throws Exception
     */
    public FcpDepstReqVo selectSptTecRcptDepst(String reqNo) throws KitechException{
    	return (FcpDepstReqVo)selectByPk("kr.re.kitech.biz.sup.tec.selectSptTecRcptDepst", reqNo);
    }
    
    /**
     * 외부기술지원 입금의뢰 삭제시 의뢰번호 초기화 
     * @param SptTecRcptInfoVo
     * @return int
     * @throws Exception
     */
	public int updateSptTecRcptInfoDel(SptTecRcptInfoVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tec.updateSptTecRcptInfoDel", vo);
	}
	
	/**
     * 외부기술지원 입금내역 저장
     * @param FcpDepstReqVo
     * @return int
     * @throws Exception
     */
	public int insertSptTecRcptDepst(FcpDepstReqVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.sup.tec.insertSptTecRcptDepst", vo);
	}
	
	/**
     * 청구계산서 발행관리 목록 조회
     * @param SptTecSrcVo
     * @return List<SptTecRcptDemndVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<SptTecRcptDemndVo> selectSptTecRcptDemndList(SptTecSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.sup.tec.selectSptTecRcptDemndList", vo);
	}
	
	/**
     * 청구계산서 발행일자 기준 1개월 이내에 미수수탁정산 미결의 건수 조회 
     * @param String suptTeam
     * @return int
     * @throws Exception
     */
	public int selectSptTecRcptUnRepayCnt(String suptTeam) throws KitechException{
		return (int)selectByPk("kr.re.kitech.biz.sup.tec.selectSptTecRcptUnRepayCnt", suptTeam);
	}
	
	/**
     * 미수수탁 반제신청팝업 입금내역 조회
     * @param SptTecSlipSrcVo
     * @return List<FcpDepstReqVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<FcpDepstReqVo> selectFcpDepstReqSptRepay(SptTecSlipSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.sup.tec.selectFcpDepstReqSptRepay", vo);
	}
	
	/**
     * 미수수탁정산결의 입금의뢰 헤더조회 
     * @param String
     * @return SptFtxBillHVo
     * @throws Exception
     */
	public SptFtxBillHVo selectFtxBillHForAdjstSlip(String taxBillNo) throws KitechException{
		return (SptFtxBillHVo)selectByPk("kr.re.kitech.biz.sup.tec.selectFtxBillHForAdjstSlip", taxBillNo);
	}
	
	/**
     * 입금신청 후 미수반제내역 수정
     * @param SptFtxBillHVo
     * @return int
     * @throws Exception
     */
	public int updateFinUnpaidAdjstDepst(SptFtxBillHVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tec.updateFinUnpaidAdjstDepst", vo);
	}
	
	/**
     * 기술지원 입금의뢰를 위한 기본사항 조회
     * @param String
     * @return SptFtxBillHVo
     * @throws Exception
     */
	public SptFtxBillHVo selectFtxBillHForDepst(String taxBillNo) throws KitechException{
		return (SptFtxBillHVo)selectByPk("kr.re.kitech.biz.sup.tec.selectFtxBillHForDepst", taxBillNo);
	}
	
	/**
     * 기술지원 입금관리내역 삭제
     * @param String
     * @return int
     * @throws Exception
     */
	public int deleteSptTecRcptDepst(String depstMngmtNo) throws KitechException{
		return delete("kr.re.kitech.biz.sup.tec.deleteSptTecRcptDepst", depstMngmtNo);
	}
}
