/**
 * 
 */
package kr.re.kitech.biz.com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.com.vo.AppvConstraintVo;
import kr.re.kitech.biz.com.vo.BetaTesterVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * 
 * @author James
 * @since 2023. 4. 5.
 */
@Repository("appvConstraintDAO")
public class AppvConstraintDAO extends BizDefaultAbstractDAO {

    /**
	 * 검색 구분에 따른 리스트 조회
     * @param vo
     * @return
     * @throws Exception
     */
    public BetaTesterVo selectAliasViaServiceId(BetaTesterVo vo)  throws KitechException {               
        return (BetaTesterVo)selectByPk("kr.re.kitech.biz.com.con.selectXslUrlViaalias", vo);
    }

    /**
	 * 검색 구분에 따른 리스트 조회
     * @param vo
     * @return
     * @throws Exception
     */
    public List<AppvConstraintVo> selectAppvConstList(AppvConstraintVo vo)  throws KitechException {               
        return (List<AppvConstraintVo>)list("kr.re.kitech.biz.com.con.selectAppvConstList", vo);
    }
    
    /**
	 * 결재문서 제약쿼리 저장
     * @param vo
     * @return
     * @throws Exception
     */
    public void saveAppvApplicationMap(BetaTesterVo vo) throws Exception {
		update("kr.re.kitech.biz.com.con.updateAppvApplicationMap", vo);
	}
	
    /**
	 * 결재문서 스냅샷 경로 수정
     * @param vo
     * @return
     * @throws Exception
     */
	public void saveAppvConstraint(AppvConstraintVo vo) throws Exception {
		update("kr.re.kitech.biz.com.con.mergeAppvConstraint", vo);
	}
	
	public void swapAppvApplicationMap(BetaTesterVo vo) throws Exception {
		update("kr.re.kitech.biz.com.con.swapAppvApplicationMap", vo);
	}
}
