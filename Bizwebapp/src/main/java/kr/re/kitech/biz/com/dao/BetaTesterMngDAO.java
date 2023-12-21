/**
 * 
 */
package kr.re.kitech.biz.com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.com.vo.BetaTesterVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * 
 * @author James
 * @since 2023. 4. 5.
 */
@Repository("betaTesterMngDAO")
public class BetaTesterMngDAO extends BizDefaultAbstractDAO {

    /**
	 * 검색 구분에 따른 리스트 조회
     * @param vo
     * @return
     * @throws Exception
     */
    public List<BetaTesterVo> selectBusinessServices(BetaTesterVo vo)  throws KitechException {
        return (List<BetaTesterVo>)list("kr.re.kitech.biz.com.con.selectBusinessServices", vo);
    }
    
   /**
	 * 특정 메뉴의 베타테스터 리스트 조회
     * @param vo
     * @return
     * @throws Exception
     */
    public List<BetaTesterVo> selectBetaTester(BetaTesterVo vo) throws KitechException {
    	return (List<BetaTesterVo>)list("kr.re.kitech.biz.com.con.selectBetaTester", vo);
    }
    
       /**
	 * 베타테스터 로그 삽입
     * @param vo
     * @return
     * @throws Exception
     */
    public void insertBetaTesterLog(BetaTesterVo vo) throws KitechException {
    	insert("kr.re.kitech.biz.com.con.insertBetaTesterLog", vo);
    }
    
   /**
	 * 베타테스터 로그 삽입
     * @param vo
     * @return
     * @throws Exception
     */
    public void insertUpdateBetaYNLog(BetaTesterVo vo) throws KitechException {
    	insert("kr.re.kitech.biz.com.con.insertUpdateBetaYNLog", vo);
    }
    
       /**
	 * 베타테스터 삽입
     * @param vo
     * @return
     * @throws Exception
     */
    public void insertBetaTester(BetaTesterVo vo) throws KitechException {
    	insert("kr.re.kitech.biz.com.con.insertBetaTester", vo);
    }
    
       /**
	 * 베타테스터 삭제 로그 삽입
     * @param vo
     * @return
     * @throws Exception
     */
    public void insertBetaTesterDeleteLog(BetaTesterVo vo) throws KitechException {
    	insert("kr.re.kitech.biz.com.con.insertBetaTesterDeleteLog", vo);
    }
    
       /**
	 * 베타테스터 삭제
     * @param vo
     * @return
     * @throws Exception
     */
    public void deleteBetaTester(BetaTesterVo vo) throws KitechException {
    	delete("kr.re.kitech.biz.com.con.deleteBetaTester", vo);
    }   
}
