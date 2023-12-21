package kr.re.kitech.biz.hum.apy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.hum.apy.vo.HumApyCertVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyOutVo;

/**  
 * @ClassSubJect 증명서발급신청 관련 처리를 담당하는 DAO
 * @Class Name HumApyCertDAO.java
 * @Description 증명서발급신청 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/03/31   개발팀             최초생성
 * 
 * @author 개발팀
 * @since 2022/03/31
 * @version 1.0
 * @see
 * 
 */
@Repository("humApyCertDAO")
public class HumApyCertDAO extends kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO {

    /**
     * 증명서발급신청 상세를 조횐한다.
     * @param vo 증명서발급신청 HumApyCertVo
     * @return 증명서발급신청 HumApyCertVo
     * @throws Exception
     */
    public HumApyCertVo selectHumApyCert(HumApyCertVo vo) throws ElException {
        return (HumApyCertVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApyCert", vo);
    }

    /**
     * 페이징을 처리하여 증명서발급신청 목록조회를 한다.
     * @param vo 증명서발급신청 HumApyCertVo
     * @return 사원목록  List<HumApyCertVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<HumApyCertVo> selectListHumApyCert(HumApyOutVo vo) throws ElException {      	
        return (List<HumApyCertVo>)list("kr.re.kitech.biz.hum.apy.selectListHumApyCert", vo);
    }

    /**
     * 증명서발급신청 목록 조회의 전체 카운트를 조회한다.
     * @param vo 증명서발급신청 HumApyCertVo
     * @return 사원목록 조회의 전체 카운트
     * @throws Exception
     */
    public long selectListCountHumApyCert(HumApyOutVo vo)  throws ElException{               
        return (Long)selectByPk("kr.re.kitech.biz.hum.apy.selectListCountHumApyCert", vo);
    }
        
    /**
     * 증명서발급신청를 등록한다.
     * @param vo 증명서발급신청 HumApyCertVo
     * @return 사번
     * @throws Exception
     */
    public int insertHumApyCert(HumApyCertVo vo) throws ElException {   
        return insert("kr.re.kitech.biz.hum.apy.insertHumApyCert", vo);
    }

    /**
     * 증명서발급신청를 갱신한다.
     * @param vo 증명서발급신청 HumApyCertVo
     * @throws Exception
     */
    public int updateHumApyCert(HumApyCertVo vo) throws ElException {
        return update("kr.re.kitech.biz.hum.apy.updateHumApyCert", vo);
    }

    /**
     * 증명서발급신청를 삭제한다.
     * @param vo 증명서발급신청 HumApyCertVo
     * @throws Exception
     */
    public int deleteHumApyCert(HumApyCertVo vo) throws ElException {
        return delete("kr.re.kitech.biz.hum.apy.deleteHumApyCert", vo);
    }

        /**
     * 증명서발급신청 조회.
     * @param vo 증명서발급신청 HumApyOutVo
     * @throws Exception
     */
    public HumApyOutVo selectHumApyOut(HumApyOutVo vo) throws ElException {
        return (HumApyOutVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApyOut", vo);
    }
    
            /**
     * 증명서발급신청 조회.
     * @param vo 증명서발급신청 HumApyOutVo
     * @throws Exception
     */
    public String selectHumApyIssuNo(HumApyCertVo vo) throws ElException {
        return (String) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApyIssuNo", vo);
    }
    
                /**
     * 증명서발급신청 조회.
     * @param vo 증명서발급신청 HumApyOutVo
     * @throws Exception
     */
    public void updateHumApyIssuNo(HumApyCertVo vo) throws ElException {
        update("kr.re.kitech.biz.hum.apy.updateHumApyIssuNo", vo);
    }

	@SuppressWarnings("unchecked")
	public List<HumApyCertVo> selectHumApyCertList(HumApyCertVo vo) {
		return list("kr.re.kitech.biz.hum.apy.selectHumApyCertList", vo);
	}

	public int saveHumApyCertList(HumApyCertVo vo) {
		System.out.println("vo >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + vo);
		return update("kr.re.kitech.biz.hum.apy.saveHumApyCertList", vo);
	}

	public int deleteHumApyCertList(HumApyCertVo vo) {
		return delete("kr.re.kitech.biz.hum.apy.deleteHumApyCertList", vo);
	}
}
