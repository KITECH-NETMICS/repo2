package kr.re.kitech.biz.sup.cus.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.sup.cus.vo.SptCustBaseInfoMntVo;
import kr.re.kitech.biz.sup.cus.vo.SptCustBaseInfoVo;
import kr.re.kitech.biz.sup.cus.vo.SptCustSrcVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 입주기업관리 DAO
 * @Class Name SptRtlInfoDAO.java
 * @Description 입주기업관리 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/08/04      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/08/04
 * @version 1.0
 * @see
 * 
 */
@Repository("sptCusInfoDAO")
public class SptCusInfoDAO extends BizDefaultAbstractDAO {
	/**
     * 고객정보에 있는지 체크
     * @param String custNo
     * @return int
     * @throws Exception
     */
	public int selectSptCustBaseInfoCnt(String custNo) throws KitechException{
		return (int)selectByPk("kr.re.kitech.biz.sup.cus.selectSptCustBaseInfoCnt", custNo);
	}
	
	/**
     * 고객정보 저장
     * @param SptCustBaseInfoVo
     * @return int
     * @throws Exception
     */
	public int insertSptCustBaseInfo(SptCustBaseInfoVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.sup.cus.insertSptCustBaseInfo", vo);
	}
	
	/**
     * 재무거래처정보에 의한 고객정보등록
     * @param SptCustBaseInfoVo
     * @return int
     * @throws Exception
     */
	public int updateSptCustBaseInfoByVend(SptCustBaseInfoVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.cus.updateSptCustBaseInfoByVend", vo);
	}
	
	/**
     * 기술지원내역등록 고객정보조회
     * @param SptCustSrcVo
     * @return SptCustBaseInfoVo
     * @throws Exception
     */
	public SptCustBaseInfoVo selectSptCustBaseInfo(SptCustSrcVo vo) throws KitechException{
		return (SptCustBaseInfoVo)selectByPk("kr.re.kitech.biz.sup.cus.selectSptCustBaseInfo", vo);
	}
	
	/**
     * 기업정보관리 조회
     * @param SptCustSrcVo
     * @return List<SptCustBaseInfoMntVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<SptCustBaseInfoMntVo> selectSptCustBaseInfoList(SptCustSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.sup.cus.selectSptCustBaseInfoList", vo);
	}

}
