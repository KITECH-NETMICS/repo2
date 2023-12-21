package kr.re.kitech.biz.ccs.cws.service;

import java.util.List;

import kr.re.kitech.biz.ccs.cws.vo.CwsCmtAreaTagVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 출퇴근인증API 관련 처리를 담당하는 인터페이스
 * @Class Name : CwsCmtAreaService.java
 * @Description : 출퇴근인증API 관련 처리를 담당하는 인터페이스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/09/15   김소연                  최초생성
 * 
 * @author 모바일
 * @since 2022/09/15
 * @version 1.0
 * @see
 * 
 */
public interface CwsCmtAreaService {
 
	 /**
	 * 현재사용자위치를 등록한다.
	 * @param cwsCmtAreaTagVo 출퇴근인증 CwsCmtAreaTagVo
	 * @return 
	 * @throws Exception
	 */
	public CwsCmtAreaTagVo selectCwsCmtAreaCheck(CwsCmtAreaTagVo cwsCmtAreaTagVo) throws KitechException;
	public List<CwsCmtAreaTagVo> selectCwsCmtAreaList(CwsCmtAreaTagVo cwsCmtAreaTagVo) throws KitechException;
}