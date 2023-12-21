package kr.re.kitech.biz.epu.req.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.com.vo.ResInpMatePopVo;
import kr.re.kitech.biz.com.vo.SfcChmclsSafeVo;
import kr.re.kitech.biz.epu.pop.vo.PurContAnnlPrjVo;
import kr.re.kitech.biz.epu.pop.vo.PurContAnnlReqVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqSpcficVo;
import kr.re.kitech.biz.epu.req.vo.PurReqAccntVo;
import kr.re.kitech.biz.epu.req.vo.PurReqAttachFileVo;
import kr.re.kitech.biz.epu.req.vo.PurReqItemAprVo;
import kr.re.kitech.biz.epu.req.vo.PurReqItemVo;
import kr.re.kitech.biz.epu.req.vo.PurReqMastrMngVo;
import kr.re.kitech.biz.epu.req.vo.PurReqMastrVo;
import kr.re.kitech.biz.epu.req.vo.PurSrcVo;
import kr.re.kitech.biz.fin.com.vo.BblenfrcVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 구매요구관리 DAO
 * @Class Name PurDomReqDAO
 * @Description 구매요구관리 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/11/24      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/11/24
 * @version 1.0
 * @see
 * 
 */
@Repository("purDomReqDAO")
public class PurDomReqDAO extends BizDefaultAbstractDAO{
	/**
     * 구매요구관리 조회
     * @param PurSrcVo
     * @return List<PurReqMastrListVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<PurReqMastrMngVo> selectPurReqMastrList(PurSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.epu.req.selectPurReqMastrList", vo);
	}
	
	/**
     * 구매요구 마스터 조회
     * @param String reqNo
     * @return PurReqMastrVo
     * @throws Exception
     */
	public PurReqMastrVo selectPurReqMastr(String reqNo) throws KitechException{
		return (PurReqMastrVo)selectByPk("kr.re.kitech.biz.epu.req.selectPurReqMastr", reqNo);
	}
	
	/**
     * 구매요구 품목내역 조회
     * @param String reqNo
     * @return List<PurReqItemVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<PurReqItemVo> selectPurReqItemList(String reqNo) throws KitechException{
		return list("kr.re.kitech.biz.epu.req.selectPurReqItemList", reqNo);
	}
	
	/**
     * 구매요구 품목내역 조회
     * @param String reqNo
     * @return List<PurReqAccntVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<PurReqAccntVo> selectPurReqAccntList(String reqNo) throws KitechException{
		return list("kr.re.kitech.biz.epu.req.selectPurReqAccntList", reqNo);
	}
	
	/**
     * 구매요구 첨부서류 조회
     * @param PurSrcVo
     * @return List<PurReqAttachFileVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<PurReqAttachFileVo> selectPurReqAttachList(PurSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.epu.req.selectPurReqAttachList", vo);
	}
	
	/**
     * 특정구매사유서 저장
     * @param PurReqSpcficVo
     * @return int
     * @throws Exception
     */
    public int insertPurReqSpcfic(PurReqSpcficVo vo) throws KitechException{
    	return insert("kr.re.kitech.biz.epu.req.insertPurReqSpcfic", vo);
    }
    
    /**
     * 특정구매사유서 수정
     * @param PurReqSpcficVo
     * @return int
     * @throws Exception
     */
    public int updatePurReqSpcfic(PurReqSpcficVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.epu.req.updatePurReqSpcfic", vo);
    }
    
    /**
     * 특정물품구매사유서-결재신청시 품목 합계 금액 조회
     * @param String
     * @return PurReqItemAprVo
     * @throws Exception
     */
    public PurReqItemAprVo selectPurReqItemApr(String purReqNo) throws KitechException{
    	return (PurReqItemAprVo)selectByPk("kr.re.kitech.biz.epu.req.selectPurReqItemApr", purReqNo);
    }
    
    /**
     * 계속연차확인서 저장
     * @param PurContAnnlReqVo
     * @return int
     * @throws Exception
     */
    public int updatePurReqMastrContAnnl(PurContAnnlReqVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.epu.req.updatePurReqMastrContAnnl", vo);
    }
    
    /**
     * 계속연차확인 과제정보 조회
     * @param String
     * @return List<PurContAnnlPrjVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<PurContAnnlPrjVo> selectPurContAnnlPrj(String purReqNo) throws KitechException{
    	return list("kr.re.kitech.biz.epu.pop.selectPurContAnnlPrj", purReqNo);
    }
    
    /**
     * 구매요구 마스터 저장
     * @param PurReqMastrVo
     * @return int
     * @throws Exception
     */
    public int insertPurReqMastr(PurReqMastrVo vo) throws KitechException{
    	return insert("kr.re.kitech.biz.epu.req.insertPurReqMastr", vo);
    }
    
    /**
     * 구매요구 마스터 수정
     * @param PurReqMastrVo
     * @return int
     * @throws Exception
     */
    public int updatePurReqMastr(PurReqMastrVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.epu.req.updatePurReqMastr", vo);
    }
    
    /**
     * 구매 품목내역 삭제
     * @param String
     * @return int
     * @throws Exception
     */
    public int deletePurReqItem(String purReqNo) throws KitechException{
    	return delete("kr.re.kitech.biz.epu.req.deletePurReqItem", purReqNo);
    }
    
    /**
     * 구매 품목내역 저장
     * @param PurReqItemVo
     * @return int
     * @throws Exception
     */
    public int insertPurReqItem(PurReqItemVo vo) throws KitechException{
    	return insert("kr.re.kitech.biz.epu.req.insertPurReqItem", vo);
    }
    
    /**
     * 구매 계정내역 저장
     * @param PurReqAccntVo
     * @return int
     * @throws Exception
     */
    public int insertPurReqAccnt(PurReqAccntVo vo) throws KitechException{
    	return insert("kr.re.kitech.biz.epu.req.insertPurReqAccnt", vo);
    }
    
    /**
     * 예산통제모듈 호출 후 통제번호 업데이트
     * @param BblenfrcVo
     * @return int
     * @throws Exception
     */
    public int updatePurReqAccntCtrl(BblenfrcVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.epu.req.updatePurReqAccntCtrl", vo);
    }
    
    /**
     * 구매 계정내역 수정
     * @param PurReqAccntVo
     * @return int
     * @throws Exception
     */
    public int updatePurReqAccnt(PurReqAccntVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.epu.req.updatePurReqAccnt", vo);
    }
    
     /**
     * 연구기자재 검색
     * @param ResInpMatePopVo
     * @return List<ResInpMatePopVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<ResInpMatePopVo> selectResInpMatePop(ResInpMatePopVo vo) throws KitechException{
    	return list("kr.re.kitech.biz.com.selectResInpMatePop", vo);
    }    
    
    /**
     * 구매요구 계정내역 삭제
     * @param PurReqAccntVo
     * @return int
     * @throws Exception
     */
    public int deletePurReqAccnt(PurReqAccntVo vo) throws KitechException{
    	return delete("kr.re.kitech.biz.epu.req.deletePurReqAccnt", vo);
    }
    
    /**
     * 사전 안전성 검토 저장
     * @param PurReqMastrVo
     * @return int
     * @throws Exception
     */
    public int updateSfcChmclsSafeDcdfprInfo(SfcChmclsSafeVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.epu.req.updateSfcChmclsSafeDcdfprInfo", vo);
    }
    
    /**
     * 구매요구 삭제
     * @param String
     * @return int
     * @throws Exception
     */
    public int deletePurReqInfo(String purReqNo) throws KitechException{
    	return delete("kr.re.kitech.biz.epu.req.deletePurReqInfo", purReqNo);
    }
    
    /**
     * 구매요구 사양서 삭제
     * @param String
     * @return int
     * @throws Exception
     */
    public int deletePurReqSpec(String purReqNo) throws KitechException{
    	return delete("kr.re.kitech.biz.epu.req.deletePurReqSpec", purReqNo);
    }
    
    /**
     * 구매요구 첨부파일 삭제
     * @param String
     * @return int
     * @throws Exception
     */
    public int deletePurReqAttachFile(String purReqNo) throws KitechException{
    	return delete("kr.re.kitech.biz.epu.req.deletePurReqAttachFile", purReqNo);
    }
    
    /**
     * 특정물품구매사유서 삭제
     * @param String
     * @return int
     * @throws Exception
     */
    public int deletePurReqSpcfic(String purReqNo) throws KitechException{
    	return delete("kr.re.kitech.biz.epu.req.deletePurReqSpcfic", purReqNo);
    }
    
    /**
     * 사전안전성 검토 구매번호 초기화
     * @param String
     * @return int
     * @throws Exception
     */
    public int updateSfcChmclsSafeDcdfprInfoDel(String purReqNo) throws KitechException{
    	return update("kr.re.kitech.biz.epu.req.updateSfcChmclsSafeDcdfprInfoDel", purReqNo);
    }
    
    /**
     * 결재 후 담당자 저장
     * @param PurReqMastrVo
     * @return int
     * @throws Exception
     */
    public int updatePurReqMastrPostApr(PurReqMastrVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.epu.req.updatePurReqMastrPostApr", vo);
    }
}
