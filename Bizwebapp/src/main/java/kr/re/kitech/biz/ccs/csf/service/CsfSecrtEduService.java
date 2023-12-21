package kr.re.kitech.biz.ccs.csf.service;

import java.util.List;

import kr.re.kitech.biz.ccs.csf.vo.CsfSecrtEduListVo;
import kr.re.kitech.biz.ccs.csf.vo.CsfSecrtEduVo;


/**
 * @ClassSubJect 
 * @ClassName : CsfSecrtEduService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.27.      author    최초생성
 * 
 * @author 
 * @since 2023.10.27.
 * @version 1.0
 * @see
 * 
 */
public interface CsfSecrtEduService {
	public List<CsfSecrtEduVo> selectCsfSecrtEduList(CsfSecrtEduVo csfVo);

	public List<CsfSecrtEduVo> selectEducTypCdList(CsfSecrtEduVo csfVo);

	public List<CsfSecrtEduVo> selectEducKndCdList(CsfSecrtEduVo csfVo);

	public void insertCsfSecrtEdu(CsfSecrtEduVo csfVo);

	public void deleteCsfSecrtEdu(CsfSecrtEduVo csfVo);

	public void insertsCsfSecrtEdu(CsfSecrtEduListVo csfVo);
}
  