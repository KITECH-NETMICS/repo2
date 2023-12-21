/**
 * 
 */
package kr.re.kitech.biz.com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.com.vo.ExceptItemVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * 
 * @author James
 * @since 2023. 4. 5.
 */
@Repository("exceptDAO")
public class ExceptDAO extends BizDefaultAbstractDAO {


    /**
	 * 예외처리 대상자 카운트 조회
     * @param vo
     * @return
     * @throws Exception
     */
    public int getExceptTargetCount(ExceptItemVo vo)  throws Exception {               
        return (int)selectByPk("kr.re.kitech.biz.com.getExceptTargetCount", vo);
    }
    
    /**
	 * 예외처리 데이터 조회
     * @param vo
     * @return
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<String> getExceptValues(ExceptItemVo vo)  throws Exception {               
        return (List<String>)super.list("kr.re.kitech.biz.com.getExceptValues", vo);
    }
    
        /**
	 * 예외처리 리스트 조회
     * @param vo
     * @return
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<ExceptItemVo> selectExceptItemList(ExceptItemVo exceptVo)  throws Exception {               
        return (List<ExceptItemVo>)super.list("kr.re.kitech.biz.com.selectExceptItemList", exceptVo);
    }
    
        /**
	 * 예외처리 데이터 삽입
     * @param vo
     * @return
     * @throws Exception
     */
    public int insertExceptItem(ExceptItemVo vo)  throws Exception {               
        return (int)insert("kr.re.kitech.biz.com.insertExceptItem", vo);
    }
    
        /**
	 * 예외처리 데이터 수정
     * @param vo
     * @return
     * @throws Exception
     */
    public int updateExceptItem(ExceptItemVo vo)  throws Exception {               
        return (int)update("kr.re.kitech.biz.com.updateExceptItem", vo);
    }
    
            /**
	 * 예외처리 데이터 수정
     * @param vo
     * @return
     * @throws Exception
     */
    public int updateExceptItemAllowN(ExceptItemVo vo)  throws Exception {               
        return (int)update("kr.re.kitech.biz.com.updateExceptItemAllowN", vo);
    }
    
        /**
	 * 예외처리 데이터 삭제
     * @param vo
     * @return
     * @throws Exception
     */
    public int deleteExceptItem(ExceptItemVo vo)  throws Exception {               
        return (int)delete("kr.re.kitech.biz.com.deleteExceptItem", vo);
    }
}
