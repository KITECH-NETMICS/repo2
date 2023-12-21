package kr.re.kitech.biz.kbk.lib.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.kbk.lib.vo.LibBookPurListInpVo;
import kr.re.kitech.biz.kbk.lib.vo.LibBookPurListSrcVo;
import kr.re.kitech.biz.kbk.lib.vo.LibBookPurRegListVo;
import kr.re.kitech.biz.kbk.lib.vo.LibBookPurRegVo;
import kr.re.kitech.biz.kbk.lib.vo.LibBookPurReqListVo;
import kr.re.kitech.biz.kbk.lib.vo.LibBookPurReqVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

@Repository("libBookPurchaseDAO")
public class LibBookPurchaseDAO extends BizDefaultAbstractDAO{

    /*-----------------------------------------------------------------------------------
		도서구입 신청 리스트 K628_00L
    -----------------------------------------------------------------------------------*/ 

	/**
     * 도서구입신청 리스트 조회
     * @param LibBookPurListInpVo
     * @return List
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<LibBookPurListSrcVo> selectLibBookPurcList(LibBookPurListInpVo libBookPrcListInpVo) throws Exception {
        return list("kr.re.kitech.biz.kbk.lib.selectLibBookPurcList", libBookPrcListInpVo);
    }
    
    /*-----------------------------------------------------------------------------------
		도서구입 신청(팝업) K628_01P
    -----------------------------------------------------------------------------------*/ 
       
    /**
     * 도서구입신청 상세 조회 팝업
     * @param LibBookPurRegVo
     * @return LibBookPurRegVo
     * @throws Exception
     */
	public LibBookPurRegVo selectLibBookPurRegDtl(LibBookPurRegVo libBookPurRegVo) throws Exception {
        return (LibBookPurRegVo)selectByPk("kr.re.kitech.biz.kbk.lib.selectLibBookPurRegDtl", libBookPurRegVo);
    }
    
    /**
     * 도서구입신청 상세 조회 신청도서 리스트
     * @param LibBookPurRegVo
     * @return List
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<LibBookPurRegListVo> selectLibBookPurRegList(LibBookPurRegVo libBookPurRegVo) throws Exception {
        return list("kr.re.kitech.biz.kbk.lib.selectLibBookPurRegList", libBookPurRegVo);
    }
    
    /**
     * 도서구입신청 상세 조회 팝업 수정
     * @param LibBookPurRegVo
     * @return void
     * @throws Exception
     */
	public void updateLibBookPurReg(LibBookPurRegVo libBookPurRegVo) throws Exception {
        update("kr.re.kitech.biz.kbk.lib.updateLibBookPurReg", libBookPurRegVo);
    }
    
    
    /*-----------------------------------------------------------------------------------
		도서구입 신청서 K628_02D
    -----------------------------------------------------------------------------------*/
	/**
     * 도서구입신청서 상세조회(메인)
     * @param LibBookPurReqVo
     * @return void
     * @throws Exception
     */
	public LibBookPurReqVo selectLibBookPurReq(LibBookPurReqVo libBookPurReqVo) throws Exception {
        return (LibBookPurReqVo)selectByPk("kr.re.kitech.biz.kbk.lib.selectLibBookPurReq", libBookPurReqVo);
    }

	/**
     * 도서구입신청서 상세조회(신청도서 리스트)
     * @param LibBookPurReqVo
     * @return void
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<LibBookPurReqListVo> selectLibBookPurReqList(LibBookPurReqVo libBookPurReqVo) throws Exception {
        return list("kr.re.kitech.biz.kbk.lib.selectLibBookPurReqList", libBookPurReqVo);
    }	
    
	/**
     * 도서구입신청서 결재 회계코드 검증
     * @param LibBookPurReqVo
     * @return void
     * @throws Exception
     */
	public LibBookPurReqVo selectLibBprAccntCd(LibBookPurReqVo libBookPurReqVo) throws Exception {
        return (LibBookPurReqVo)selectByPk("kr.re.kitech.biz.kbk.lib.selectLibBprAccntCd", libBookPurReqVo);
    }
    
	/**
     * 도서구입신청서 통화단위
     * @param LibBookPurReqVo
     * @return void
     * @throws Exception
     */
	public LibBookPurReqVo selectLibBprCashPurRt(LibBookPurReqVo libBookPurReqVo) throws Exception {
        return (LibBookPurReqVo)selectByPk("kr.re.kitech.biz.kbk.lib.selectLibBprCashPurRt", libBookPurReqVo);
    } 	
    
	/**
     * 도서구입신청서 승인버튼
     * @param LibBookPurReqVo
     * @return void
     * @throws Exception
     */
	public void updateLibBprAgrPrc(LibBookPurReqVo libBookPurReqVo) throws Exception {
		update("kr.re.kitech.biz.kbk.lib.updateLibBprAgrPrc", libBookPurReqVo);
    }
    
    /**
     * 도서구입신청서 등록(메인)
     * @param LibBookPurReqVo
     * @return void
     * @throws Exception
     */
	public void insertLibBookPurReq(LibBookPurReqVo libBookPurReqVo) throws Exception {
        insert("kr.re.kitech.biz.kbk.lib.insertLibBookPurReq", libBookPurReqVo);
    }
    
    /**
     * 도서구입신청서 등록(신청도서 리스트)
     * @param LibBookPurReqListVo
     * @return void
     * @throws ExceptioninsertLibBookPurReqList
     */
	public void insertLibBookPurReqList(LibBookPurReqListVo libBookPurReqListVo) throws Exception {
        insert("kr.re.kitech.biz.kbk.lib.insertLibBookPurReqList", libBookPurReqListVo);
    }
    
    /**
     * 도서구입신청서 수정(메인)
     * @param LibBookPurReqVo
     * @return void
     * @throws Exception
     */
	public void updateLibBookPurReq(LibBookPurReqVo libBookPurReqVo) throws Exception {
		update("kr.re.kitech.biz.kbk.lib.updateLibBookPurReq", libBookPurReqVo);
    }
    
	/**
     * 도서구입신청서 수정(신청도서 리스트)
     * @param LibBookPurReqListVo
     * @return void
     * @throws Exception
     */
	public void updateLibBookPurReqList(LibBookPurReqListVo libBookPurReqListVo) throws Exception {
		update("kr.re.kitech.biz.kbk.lib.updateLibBookPurReqList", libBookPurReqListVo);
    }
    
	/**
     * 도서구입신청서 삭제(메인)
     * @param LibBookPurReqVo
     * @return void
     * @throws Exception
     */
	public void deleteLibBookPurReq(LibBookPurReqVo libBookPurReqVo) throws Exception {
		delete("kr.re.kitech.biz.kbk.lib.deleteLibBookPurReq", libBookPurReqVo);
    }  
    
	/**
     * 도서구입신청서 삭제(신청도서 리스트)
     * @param LibBookPurReqVo
     * @return void
     * @throws Exception
     */
	public void deleteLibBookPurReqList(LibBookPurReqVo libBookPurReqVo) throws Exception {
		delete("kr.re.kitech.biz.kbk.lib.deleteLibBookPurReqList", libBookPurReqVo);
    }                   
}