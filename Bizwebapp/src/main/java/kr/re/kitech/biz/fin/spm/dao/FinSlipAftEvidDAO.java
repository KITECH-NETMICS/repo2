package kr.re.kitech.biz.fin.spm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.fin.spm.vo.FinSlipAftEvidListVo;
import kr.re.kitech.biz.fin.spm.vo.FinSlipAftEvidVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 
 * @ClassName : FinSlipAftEvidDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.07.      작업자    최초생성
 * 
 * @author 
 * @since 2023.09.07.
 * @version 1.0
 * @see
 * 
 */
@Repository("finSlipAftEvidDAO")
public class FinSlipAftEvidDAO extends BizDefaultAbstractDAO {
  /**
   * 모든 컬럼 조회 
   * 
   * @author 
   * @param 
   * @return List<FspSlipDecsnHVo>
   * @throws KitechException
   * @since 2023.09.07.   
   */
	@SuppressWarnings("unchecked")
	public List<FinSlipAftEvidListVo> selectSlipAftEvidInfoList(FinSlipAftEvidVo finVo) {
		return list("kr.re.kitech.biz.fin.spm.selectSlipAftEvidInfoList", finVo);
	}
  /**
   * 확정 결의서 헤더 첨부파일 업데이트
   * 
   * @author 
   * @param 
   * @return List<FspSlipDecsnHVo>
   * @throws KitechException
   * @since 2023.09.07.   
   */
	public int updateSlipAftEvidInfo(FinSlipAftEvidVo finVo) {
		return update("kr.re.kitech.biz.fin.spm.updateSlipAftEvidInfo", finVo);
	}

  /**
   * 사후증빙 삭제
   * 
   * @author 
   * @param 
   * @return List<FspSlipDecsnHVo>
   * @throws KitechException
   * @since 2023.09.07.   
   */
	public int insertDelSlipAftEvid(FinSlipAftEvidVo finVo){
		return insert("kr.re.kitech.biz.fin.spm.insertDelSlipAftEvid", finVo);
	}

  /**
   * 사후증빙 생성
   * 
   * @author 
   * @param 
   * @return List<FspSlipDecsnHVo>
   * @throws KitechException
   * @since 2023.09.07.   
   */
	public void createSlipAftEvid(FinSlipAftEvidVo finVo) {
		selectByPk("kr.re.kitech.biz.fin.spm.createSlipAftEvid", finVo);
	}
}
