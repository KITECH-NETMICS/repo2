package kr.re.kitech.biz.res.exc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo;
import kr.re.kitech.biz.fin.std.vo.ComResBgAcctmVo;
import kr.re.kitech.biz.fin.tax.vo.FtxBillUpdVo;
import kr.re.kitech.biz.res.exc.vo.ResBgDepstMntVo;
import kr.re.kitech.biz.res.exc.vo.ResBgRectlVo;
import kr.re.kitech.biz.res.exc.vo.ResBgRecveVo;
import kr.re.kitech.biz.res.exc.vo.ResDemndReqVo;
import kr.re.kitech.biz.res.exc.vo.ResDepstAmtChkVo;
import kr.re.kitech.biz.res.exc.vo.ResExcSrcVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;
/**
 * @ClassSubJect 연구비입금관리 DAO
 * @Class Name ResDepstMntDAO.java
 * @Description 연구비입금관리 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2023/04/25      이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/04/25
 * @version 1.0
 * @see
 * 
 */
@Repository("resDepstMntDAO")
public class ResDepstMntDAO extends BizDefaultAbstractDAO {
	/**
     * 연구비 입금관리 목록 조회
     * @param ResExcSrcVo
     * @return List<ResBgDepstMntVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<ResBgDepstMntVo> selectResBgDepstMntList(ResExcSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.res.exc.selectResBgDepstMntList", vo);
	}
	
	/**
     * 연구비 입금 결재신청번호로 계정번호 조회
     * @param String
     * @return String
     * @throws Exception
     */
	public ResExcSrcVo selectResBgRectlAccntNo(String reqNo) throws KitechException{
		return (ResExcSrcVo)selectByPk("kr.re.kitech.biz.res.exc.selectResBgRectlAccntNo", reqNo);
	}
	
	/**
     * 통합이지바로과제 협약예산(위탁연구비) 조회
     * @param ComResBgAcctmVo
     * @return long
     * @throws Exception
     */
	public long selectResBgAgreeTotAmt(ComResBgAcctmVo vo) throws KitechException{
		return (long)selectByPk("kr.re.kitech.biz.res.exc.selectResBgAgreeTotAmt", vo);
	}
	
	/**
     * 입금예정정보 조회
     * @param String
     * @return List<ResBgRecveVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<ResBgRecveVo> selectResBgRecveList(String accntNo) throws KitechException{
		return list("kr.re.kitech.biz.res.exc.selectResBgRecveList", accntNo);
	}
	
	/**
     * 연구비입금내역정보 조회
     * @param ResExcSrcVo
     * @return List<ResBgRectlVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<ResBgRectlVo> selectResBgRectlList(ResExcSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.res.exc.selectResBgRectlList", vo);
	}
	
	/**
     * 연구비 입금예정정보 저장
     * @param ResBgRecveVo
     * @return int
     * @throws Exception
     */
	public int mergeResBgRecve(ResBgRecveVo vo) throws KitechException{
		return update("kr.re.kitech.biz.res.exc.mergeResBgRecve", vo);
	}
	
	/**
     * 입금예정내역 삭제 가능여부 조회
     * @param ResBgRecveVo
     * @return int
     * @throws Exception
     */
	public int selectResBgRectlDelYn(ResBgRecveVo vo) throws KitechException{
		return (int)selectByPk("kr.re.kitech.biz.res.exc.selectResBgRectlDelYn", vo);
	}
	
	/**
     * 입금예정내역 삭제
     * @param ResBgRecveVo
     * @return int
     * @throws Exception
     */
	public int deleteResBgRecve(ResBgRecveVo vo) throws KitechException{
		return delete("kr.re.kitech.biz.res.exc.deleteResBgRecve", vo);
	}
	
	/**
     * 연구비 입금상세 저장
     * @param ResBgRectlVo
     * @return int
     * @throws Exception
     */
	public int insertResBgRectl(ResBgRectlVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.res.exc.insertResBgRectl", vo);
	}
	
	/**
     * 입금관리상세 내역 수정 
     * @param ResBgRectlVo
     * @return int
     * @throws Exception
     */
	public int updateResBgRectl(ResBgRectlVo vo) throws KitechException{
		return update("kr.re.kitech.biz.res.exc.updateResBgRectl", vo);
	}
	
	/**
     * 입금관리상세 내역 삭제
     * @param ResBgRectlVo
     * @return int
     * @throws Exception
     */
	public int deleteResBgRectl(ResBgRectlVo vo) throws KitechException{
		return delete("kr.re.kitech.biz.res.exc.deleteResBgRectl", vo);
	}
	
	/**
     * 연구비 청구의뢰조회
     * @param ResExcSrcVo
     * @return ResDemndReqVo
     * @throws Exception
     */
	public ResDemndReqVo selectResDemndReq(ResExcSrcVo vo) throws KitechException{
		return (ResDemndReqVo)selectByPk("kr.re.kitech.biz.res.exc.selectResDemndReq", vo);
	}	
	
	/**
     * 연구비 청구의뢰 저장
     * @param ResDemndReqVo
     * @return int
     * @throws Exception
     */
	public int insertResDemndReq(ResDemndReqVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.res.exc.insertResDemndReq", vo);
	}
	
	/**
     * 연구비 청구의뢰 수정
     * @param ResDemndReqVo
     * @return int
     * @throws Exception
     */
	public int updateResDemndReq(ResDemndReqVo vo) throws KitechException{
		return update("kr.re.kitech.biz.res.exc.updateResDemndReq", vo);
	}
	
	/**
     * 연구비청구의뢰시 입금상세내역 저장
     * @param ResDemndReqVo
     * @return int
     * @throws Exception
     */
	public int updateResBgRectlDemnd(ResDemndReqVo vo) throws KitechException{
		return update("kr.re.kitech.biz.res.exc.updateResBgRectlDemnd", vo);
	}
	
	/**
     * 연구비청구의뢰 삭제
     * @param String reqNo
     * @return int
     * @throws Exception
     */
	public int deleteResDemndReq(String reqNo) throws KitechException{
		return delete("kr.re.kitech.biz.res.exc.deleteResDemndReq", reqNo);
	}
	
	/**
     * 계산서헤더 신청번호 업데이트
     * @param FtxBillUpdVo
     * @return int
     * @throws Exception
     */
	 public int updateFtxBillHIssuReq(FtxBillUpdVo vo) throws KitechException{
		 return update("kr.re.kitech.biz.fin.com.updateFtxBillHIssuReq", vo);
	 }	 
	 
	 /**
     * 연구비 미수반제 신청조회
     * @param ResExcSrcVo
     * @return List<FcpDepstReqVo>
     * @throws Exception
     */
	 @SuppressWarnings("unchecked")
	public List<FcpDepstReqVo> selectFcpDepstReqList(ResExcSrcVo vo) throws KitechException{
		 return list("kr.re.kitech.biz.res.exc.selectFcpDepstReqList", vo);
	}
	
	/**
     * 연구비 미수반제 신청을 위한 청구의뢰 조회
     * @param ResExcSrcVo
     * @return ResDemndReqVo
     * @throws Exception
     */
	public ResDemndReqVo selectResDemndForRepay(ResExcSrcVo vo) throws KitechException{
		return (ResDemndReqVo)selectByPk("kr.re.kitech.biz.res.exc.selectResDemndForRepay", vo);
	}
	
	/**
     * 연구비 미수반제 신청시 입금상세내역 저장
     * @param FcpDepstReqVo
     * @return int
     * @throws Exception
     */
	public int mergeResBgRectl(FcpDepstReqVo vo) throws KitechException{
		return update("kr.re.kitech.biz.res.exc.mergeResBgRectl", vo);
	}
	
	/**
     * 입금의뢰 후 입금관리내역 수정
     * @param ResBgRecveVo
     * @return int
     * @throws Exception
     */
	public int updateResBgRecve(ResBgRecveVo vo) throws KitechException{
		return update("kr.re.kitech.biz.res.exc.updateResBgRecve", vo);
	}	
	
	/**
     * 연구비반제 결재신청 청구정보 조회
     * @param ResExcSrcVo
     * @return ResDemndReqVo
     * @throws Exception
     */
	public ResDemndReqVo selectResRepayDemndApr(ResExcSrcVo vo) throws KitechException{
		return (ResDemndReqVo)selectByPk("kr.re.kitech.biz.res.exc.selectResRepayDemndApr", vo);
	}
	
	/**
     * 연구비입금 결재신청 입금예정정보 조회
     * @param ResExcSrcVo
     * @return ResBgRecveVo
     * @throws Exception
     */
	public ResBgRecveVo selectResBgRecveApr(ResExcSrcVo vo) throws KitechException{
		return (ResBgRecveVo)selectByPk("kr.re.kitech.biz.res.exc.selectResBgRecveApr", vo);
	}
	
	/**
     * 과세 계정일 경우 계산서 공급가액, 세액 조회
     * @param String
     * @return ResDepstAmtChkVo
     * @throws Exception
     */
	public ResDepstAmtChkVo selectDepstAmtCheck(String accntNo) throws KitechException{
		return (ResDepstAmtChkVo)selectByPk("kr.re.kitech.biz.res.exc.selectDepstAmtCheck", accntNo);
	}
	
	public int updateResBgRecveTest(ResBgRecveVo vo) throws KitechException{
		return update("kr.re.kitech.biz.res.exc.updateResBgRecveTest", vo);
	}
}
