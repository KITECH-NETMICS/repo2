package kr.re.kitech.biz.fin.fnd.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.com.vo.FibkAccntHisVo;
import kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo;
import kr.re.kitech.biz.fin.fnd.vo.FndDepstSrcVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 입금의뢰 및 입금결의(연구비,기술료,기업지원)
 * @Class Name FndDepstReqDAO.java
 * @Description 입금의뢰 결의생성 DAO
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
@Repository("fndDepstReqDAO")
public class FndDepstReqDAO extends BizDefaultAbstractDAO{	
	/**
     * 입금의뢰번호가 있을 경우 입금일자 조회
     * @param String
     * @return FndDepstSrcVo
     * @throws Exception
     */
    public FibkAccntHisVo selectFibkAcctHisForDepst(String reqNo) throws KitechException{
    	return (FibkAccntHisVo)selectByPk("kr.re.kitech.biz.fin.fnd.selectFibkAcctHisForDepst", reqNo);
    }
    
    /**
     * 예금입금의뢰등록팝업 (조회)
     * @param FndDepstSrcVo
     * @return FcpDepstReqVo
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<FcpDepstReqVo> selectFcpDepstReq(FndDepstSrcVo vo) throws KitechException{
    	return list("kr.re.kitech.biz.fin.fnd.selectFcpDepstReq", vo);
    }
    
    /**
     * 예금입금의뢰 Ⅱ 목록 조회
     * @param FndDepstSrcVo
     * @return List<FibkAccntHisVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<FibkAccntHisVo> selectFibkAcctHisList(FndDepstSrcVo vo) throws KitechException{
    	return list("kr.re.kitech.biz.fin.fnd.selectFibkAcctHisList", vo);
    }
    
    /**
     * 계정정보 조회
     * @param String accntNo
     * @return Map
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public Map<String,String> selectAccntNoInfoForDepst(String accntNo) throws KitechException{
    	return (Map<String,String>)selectByPk("kr.re.kitech.biz.fin.fnd.selectAccntNoInfoForDepst", accntNo);
    }
}
