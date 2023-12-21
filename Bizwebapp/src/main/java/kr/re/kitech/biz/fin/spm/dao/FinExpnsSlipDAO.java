package kr.re.kitech.biz.fin.spm.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.fin.com.vo.FspSendReqVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipDAprVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipDVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipHVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo;
import kr.re.kitech.biz.fin.pop.vo.FspItmEvidDetlsVo;
import kr.re.kitech.biz.fin.spm.vo.CardInfoVo;
import kr.re.kitech.biz.fin.spm.vo.ExpnsAmtSummryVo;
import kr.re.kitech.biz.fin.spm.vo.FinSlipSearchVo;
import kr.re.kitech.biz.fin.spm.vo.FinSpmSlipVo;
import kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrComVo;
import kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrVo;
import kr.re.kitech.biz.fin.spm.vo.PreAprCheckVo;
import kr.re.kitech.biz.fin.std.vo.XodfAccntVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.core.vo.AttachVo;

/**  
 * @ClassSubJect 경비결의
 * @Class Name : FinExpnsSlipDAO.java
 * @Description : 경비결의 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/04/08   이영희                최초생성
 * 
 * @author LeeYh
 * @since 2022/04/08
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Repository("finExpnsSlipDAO")
public class FinExpnsSlipDAO extends BizDefaultAbstractDAO {
	/**
     * 경비결의 목록 조회
     * @param FinSlipSearchVo
     * @return List<FinSlipListVo>
     * @throws Exception
     */
     @SuppressWarnings("unchecked")
	public List<FinSpmSlipVo> selectFinSlipList(FinSlipSearchVo vo) throws ElException{
    	 return list("kr.re.kitech.biz.fin.spm.selectFspSlipHList", vo);
    }
    
    /**
     * 카드결의 결의대상 카드목록 조회
     * @param StdFbaCardVo
     * @return List<CardInfoVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<CardInfoVo> selectFinExpnsSlipCardList(FinSlipSearchVo vo) throws ElException{
    	return list("kr.re.kitech.biz.fin.spm.selectFinExpnsSlipCardList", vo);
    }
    
    /**
     * 결의서 헤더 조회
     * @param String
     * @return FspSlipHVo
     * @throws Exception
     */
	public FspSlipHVo selectFspSlipH(String unslipNo) throws ElException{
    	return (FspSlipHVo)selectByPk("kr.re.kitech.biz.fin.spm.selectFspSlipH", unslipNo);
    }
    
    /**
     * 소액물품결의일 경우 자산등록여부 조회
     * @param String unslipNo
     * @return Map
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public Map<String,String> selectSmlItmCheckupAserReg(String unslipNo) throws ElException{
    	return (Map<String,String>)selectByPk("kr.re.kitech.biz.fin.spm.selectSmlItmCheckupAserReg", unslipNo);
    }
    
    /**
     * 결의서 디테일 조회
     * @param FinSlipSearchVo
     * @return List<FspSlipDVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<FspSlipDVo> selectFspSlipDList(FinSlipSearchVo vo) throws ElException{
    	return list("kr.re.kitech.biz.fin.spm.selectFspSlipDList", vo);
    }
    
     /**
     * 카드결의 비용합계
     * @param FinSlipSearchVo
     * @return List<FspSlipDVo>
     * @throws Exception
     */
    public ExpnsAmtSummryVo selectExpnsCardSum(FinSlipSearchVo vo) throws ElException{
    	return (ExpnsAmtSummryVo)selectByPk("kr.re.kitech.biz.fin.spm.selectExpnsCardSum", vo);
    }
    
    /**
     * 결의서 관리항목 조회
     * @param FinSlipSearchVo
     * @return List<FspSlipMngmtVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<FspSlipMngmtVo> selectFspSlipMngmtList(FinSlipSearchVo vo) throws ElException{
    	return list("kr.re.kitech.biz.fin.spm.selectFspSlipMngmtList", vo);
    }
    
    /**
     * 결의서 카드내역 조회
     * @param FinSlipSearchVo
     * @return CardInfoVo
     * @throws Exception
     */
    public CardInfoVo selectExpnsCardSlip(FinSlipSearchVo vo) throws ElException{
    	return (CardInfoVo)selectByPk("kr.re.kitech.biz.fin.spm.selectExpnsCardSlip", vo);
    }
    
    /**
     * 이지바로과제 증빙개수 조회
     * @param FinSlipSearchVo
     * @return int
     * @throws Exception
     */
    public int selectFspItmEvidDetlsCnt(FinSlipSearchVo vo) throws ElException{
    	return (int)selectByPk("kr.re.kitech.biz.fin.spm.selectFspItmEvidDetlsCnt", vo);
    }
    
    /**
     * 이지바로 과제 증빙(회의록) 저장
     * @param FinSlipSearchVo
     * @return int
     * @throws Exception
     */
    public int insertFspItmEvidDetlsBySel(FinSlipSearchVo vo) throws ElException{
    	return insert("kr.re.kitech.biz.fin.spm.insertFspItmEvidDetlsBySel", vo);
    }
    
    /**
     * 송금내역 조회
     * @param FinSlipSearchVo
     * @return List<FspSendReqVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<FspSendReqVo> selectFspSendReqList(FinSlipSearchVo vo) throws ElException{
    	return list("kr.re.kitech.biz.fin.spm.selectFspSendReqList", vo);
    }
    
    /**
     * 계산서정보 조회
     * @param FinSlipSearchVo
     * @return FtxBillVo
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<KtxIssuMstrVo> selectKtxIssuMstrList(FinSlipSearchVo vo) throws ElException{
    	return list("kr.re.kitech.biz.fin.spm.selectKtxIssuMstrList", vo);
    }
    
    /**
     * 경비결의 일반 비용합계 조회
     * @param FinSlipSearchVo
     * @return ExpnsAmtSummryVo
     * @throws Exception
     */
    public ExpnsAmtSummryVo selectExpnsBillSum(String unslipNo) throws ElException{
    	return (ExpnsAmtSummryVo)selectByPk("kr.re.kitech.biz.fin.spm.selectExpnsBillSum", unslipNo);
    }   
    
    /**
     * 일반결의 수입처리 회계코드 조회
     * @param FinSlipSearchVo
     * @return XodfAccntVo
     * @throws Exception
     */
    public XodfAccntVo selectAccntCdByFinBsnsClsf(FinSlipSearchVo vo) throws ElException{
    	return (XodfAccntVo)selectByPk("kr.re.kitech.biz.fin.spm.selectAccntCdByFinBsnsClsf", vo);
    }
    
    /**
    * 신연구비증빙조회
    * @param FinSlipSearchVo
    * @return List<FspItmEvidDetlsVo>
    * @author LeeYH
    */
	@SuppressWarnings("unchecked")
	public List<FspItmEvidDetlsVo> selectFspItmEvidDetlsList(FinSlipSearchVo vo) throws ElException{
		return list("kr.re.kitech.biz.fin.pop.selectFspItmEvidDetlsList", vo);
	}
	
	/**
    * 신연구비증빙 저장
    * @param FspItmEvidDetlsVo
    * @return int
    * @author LeeYH
    */
	public int insertFspItmEvidDetls(FspItmEvidDetlsVo vo) throws ElException{
		return insert("kr.re.kitech.biz.fin.spm.insertFspItmEvidDetls", vo);
	}
	
	/**
    * 신연구비증빙 삭제
    * @param FspItmEvidDetlsVo
    * @return int
    * @author LeeYH
    */
	public int deleteFspItmEvidDetls(FspItmEvidDetlsVo vo) throws ElException{
		return insert("kr.re.kitech.biz.fin.spm.deleteFspItmEvidDetls", vo);
	}
	
	/**
    * 결재신청시 이지바로과제 증빙등록 체크
    * @param FinSlipSearchVo
    * @return PreAprCheckVo
    * @author LeeYH
    */
	@SuppressWarnings("unchecked")
	public List<PreAprCheckVo> selectEvidDetlsCntPreApr(FinSlipSearchVo vo) throws ElException{
		return list("kr.re.kitech.biz.fin.spm.selectEvidDetlsCntPreApr", vo);
	}
	
	/**
    * 결재신청시 계산서 금액 체크
    * @param KtxIssuMstrComVo
    * @return KtxIssuMstrComVo
    * @author LeeYH
    */
	public KtxIssuMstrComVo selectBillAmtPreApr(KtxIssuMstrComVo vo) throws ElException{
		return (KtxIssuMstrComVo)selectByPk("kr.re.kitech.biz.fin.spm.selectBillAmtPreApr", vo);
	}
	
	/**
    * 결재신청시 카드사용 금액 체크
    * @param KtxIssuMstrComVo
    * @return FspSlipDVo
    * @author LeeYH
    */
	public KtxIssuMstrComVo selectCardAmtPreApr(FspSlipDVo vo) throws ElException{
		return (KtxIssuMstrComVo)selectByPk("kr.re.kitech.biz.fin.spm.selectCardAmtPreApr", vo);
	}	
	
	/**
    * 경비결의 디테일 조회 (결재)
    * @param String unslipNo
    * @return List<FspSlipDAprVo>
    * @author LeeYH
    */
	@SuppressWarnings("unchecked")
	public List<FspSlipDAprVo> selectSlipDAprList(String unslipNo) throws ElException{
		return list("kr.re.kitech.biz.fin.spm.selectSlipDAprList", unslipNo);
	}
	
	/**
    * 경비결의 송금내역 조회 (결재)
    * @param String unslipNo
    * @return List<FspSendReqVo>
    * @author LeeYH
    */
	@SuppressWarnings("unchecked")
	public List<FspSendReqVo> selectFspSendReqApr(String unslipNo) throws ElException{
		return list("kr.re.kitech.biz.fin.spm.selectFspSendReqApr", unslipNo);
	}
	
	/**
    * 경비결의 첨부파일 조회 (결재)
    * @param String unslipNo
    * @return List<AttachVo>
    * @author LeeYH
    */
	@SuppressWarnings("unchecked")
	public List<AttachVo> selectXomxComAttachFileApr(String unslipNo) throws ElException{
		return list("kr.re.kitech.biz.fin.spm.selectXomxComAttachFileApr", unslipNo);
	}
	
	/**
    * 경비결의 이지바로 증빙내역 조회 (결재)
    * @param String unslipNo
    * @return List<FspItmEvidDetlsVo>
    * @author LeeYH
    */
	@SuppressWarnings("unchecked")
	public List<FspItmEvidDetlsVo> selectFspItmEvidDetlsApr(String unslipNo) throws ElException{
		return list("kr.re.kitech.biz.fin.spm.selectFspItmEvidDetlsApr", unslipNo);
	}
	
	/**
    * 경비결의 이지바로 증빙내역 조회 (결재)
    * @param String unslipNo
    * @return List<AttachVo>
    * @author LeeYH
    */
	@SuppressWarnings("unchecked")
	public List<AttachVo> selectFspEvidAttachApr(String unslipNo) throws ElException{
		return list("kr.re.kitech.biz.fin.spm.selectFspEvidAttachApr", unslipNo);
	}
	
	/**
    * 일반결의처리(결의서차변.대변 금액 일치여부)
    * @param String unslipNo
    * @return ExpnsAmtSummryVo
    * @author LeeYH
    */
	public ExpnsAmtSummryVo selectSlipDAmtSum(String unslipNo) throws ElException{
		return (ExpnsAmtSummryVo)selectByPk("kr.re.kitech.biz.fin.spm.selectSlipDAmtSum", unslipNo);
	}
	
	/**
    * 인터페이스 테이블 저장 여부
    * @param String unslipNo
    * @return int
	* @since 2022.07.29.
    * @author LeeYH
    */
	public int selectXomxIntfaTabCnt(String unslipNo) throws ElException{
		return (int)selectByPk("kr.re.kitech.biz.fin.spm.selectXomxIntfaTabCnt", unslipNo);
	}
	
	/**
    * 카드결의 생성을 위한 회의록 정보 조회
    * @param String unslipNo
    * @return FspSlipDVo
	* @since 2022.09.28.
    * @author LeeYH
    */
	public FspSlipDVo selectFspSlipMeetInfo(String reqNo) throws ElException{
		return (FspSlipDVo)selectByPk("kr.re.kitech.biz.fin.spm.selectFspSlipMeetInfo", reqNo);
	}
}
