package kr.re.kitech.biz.fin.tax.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.fin.tax.vo.FtxEtcIncomVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 기타소득
 * @Class Name : FinEtcIncomDAO.java
 * @Description : 기타소득 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/10/25   이민기                최초생성
 * 
 * @author MKLee
 * @since 2023/10/25
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Repository("finEtcIncomDAO")
public class FinEtcIncomDAO extends BizDefaultAbstractDAO {
	/**
     * 기타소득 목록 조회
     * @param FinTaxSearchVo
     * @return List<FtxEtcIncomVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<FtxEtcIncomVo> selectEtcIncomList(FtxEtcIncomVo vo) throws KitechException{
    	 return list("kr.re.kitech.biz.fin.tax.selectEtcIncomList", vo);
    }

    /**
     * 기타소득 상세조회
     * @param FinTaxSearchVo
     * @return FtxEtcIncomVo
     * @throws Exception
     */
	public FtxEtcIncomVo selectEtcIncomData(FtxEtcIncomVo vo) throws KitechException {
		return (FtxEtcIncomVo)selectByPk("kr.re.kitech.biz.fin.tax.selectEtcIncomData", vo);
	}
	
	/**
     * 기타소득 단건삭제
     * @param FtxEtcIncomVo
     * @return void
     * @throws Exception
     */
	public void deleteEtcIncomData(FtxEtcIncomVo vo) throws KitechException {
		delete("kr.re.kitech.biz.fin.tax.deleteEtcIncomData", vo);
	}	 
    
    /**
     * 기타소득 단건수정
     * @param FtxEtcIncomVo
     * @return void
     * @throws Exception
     */
	public void updateEtcIncomData(FtxEtcIncomVo vo) throws KitechException {
		delete("kr.re.kitech.biz.fin.tax.updateEtcIncomData", vo);
	}

	/**
     * 기타소득 단건등록
     * @param FtxEtcIncomVo
     * @return int
     * @throws Exception
     */
	public int insertEtcIncomData(FtxEtcIncomVo vo) throws KitechException {
		return insert("kr.re.kitech.biz.fin.tax.insertEtcIncomData", vo);
	}

	/**
     * 기타소득 관리번호 채번
     * @param FtxEtcIncomVo
	 * @return 
     * @return int
     * @throws Exception
     */
	public FtxEtcIncomVo selectEtcIncomMnmtNo(FtxEtcIncomVo vo) throws KitechException {
		return (FtxEtcIncomVo)selectByPk("kr.re.kitech.biz.fin.tax.selectEtcIncomMnmtNo", vo);
	}
   
}
