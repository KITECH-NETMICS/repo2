package kr.re.kitech.biz.uss.cod.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.uss.cod.vo.ComBoxCodeVo;
import kr.re.kitech.biz.uss.cod.vo.ComBoxSrcVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;
/**
 * @ClassSubJect selectBox 코드 조회
 * @ClassName  ComBoxCodeDAO.java
 * @Description selectBox 코드 조회 DAO
 * @Modification :   
 *     수정일           수정자     수정내용
 *  ----------- ------- ---------
 *  2023.09.20.  이영희       최초생성
 * 
 * @author 
 * @since 2023.09.20.
 * @version 1.0
 * @see
 * 
 */
@Repository("comBoxCodeDAO")
public class ComBoxCodeDAO extends BizDefaultAbstractDAO {
	/**
     * 자산관리 통합관리계정 변경이력 관리부서 조회 
     * @param ComBoxSrcVo
     * @return List<ComBoxCodeVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<ComBoxCodeVo> selectDeptHeadQrtr(ComBoxSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.uss.cod.selectDeptHeadQrtr", vo);
	}
	
	/**
     * 연구관리센터조회(divsn_dept)
     * @param ComBoxSrcVo
     * @return List<ComBoxCodeVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<ComBoxCodeVo> selectDivsnDept(ComBoxSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.uss.cod.selectDivsnDept", vo);
	}
	
	/**
     * 자산관리 관리주체별 부서조회(ass_dept)
     * @param ComBoxSrcVo
     * @return List<ComBoxCodeVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<ComBoxCodeVo> selectAssDeptInfo(ComBoxSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.uss.cod.selectAssDeptInfo", vo);
	}
}
