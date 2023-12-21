package kr.re.kitech.biz.ccs.cws.service;

import java.util.List;

import kr.re.kitech.biz.ccs.cws.vo.CwsExceptWorkTimeVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsTagExceptVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 재택근무신청 관련 처리를 담당하는 인터페이스
 * @Class Name : CwsOutWorkService.java
 * @Description : 재택근무신청 관련 처리를 담당하는 인터페이스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/03/28   개발팀             최초생성
 * 
 * @author 개발팀
 * @since 2022/03/28
 * @version 1.0
 * @see
 * 
 */
public interface CwsTagExceptService {
	
	public CwsExceptWorkTimeVo selectExceptWorkTimeTarget(CwsExceptWorkTimeVo cwsExceptWorkTimeVo) throws KitechException ;
	public void selectExceptWorkTimedupCheck(CwsTagExceptVo cwsTagExceptVo) throws KitechException;
	public CwsTagExceptVo selectTagExcept(CwsTagExceptVo cwsTagExceptVo) throws KitechException;
	public String saveTagExcept(CwsTagExceptVo cwsTagExtVo) throws Exception;
	public List<CwsTagExceptVo> selectTagExceptList(CwsTagExceptVo cwsTagExceptVo) throws KitechException;
	
}