package kr.re.kitech.biz.uss.ath.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.uss.ath.service.UssAthRoleMntService;
import kr.re.kitech.biz.uss.ath.vo.UserSrcVo;
import kr.re.kitech.biz.xom.core.vo.RoleVo;
import kr.re.kitech.biz.xom.core.vo.ServiceVo;
import kr.re.kitech.biz.xom.core.vo.UserVo;

/**  
 * @ClassSubJect 권한관리(롤관리,사용자관리)
 * @Class Name UssAthRoleMntController.java
 * @Description 권한관리(롤관리,사용자관리) 관련 처리를 담당하는 Controller
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/11/15   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/11/15
 * @version 1
 * @see
 * 
 */
@Controller
public class UssAthRoleMntController {
	@Resource(name="ussAthRoleMntService")
	private UssAthRoleMntService roleService;
	
	@ElService(key = "SvcUSSATHUSRR01")
	@RequestMapping(value = "SvcUSSATHUSRR01")
	@ElDescription(sub = "롤관리,사용자관리 시스템구분 조회", desc = "")
	@ElValidator(errUrl = "")
	public List<ServiceVo> findServiceTopDivCode(ServiceVo vo) throws Exception{
		return roleService.findServiceTopDivCode(vo);
	}
	
	@ElService(key = "SvcUSSATHUSRR02")
	@RequestMapping(value = "SvcUSSATHUSRR02")
	@ElDescription(sub = "사용자조회", desc = "")
	@ElValidator(errUrl = "")
	public List<UserVo> findUsers(UserSrcVo vo) throws Exception{
		return roleService.findUsers(vo);
	}
	
	@ElService(key = "SvcUSSATHUSRR03")
	@RequestMapping(value = "SvcUSSATHUSRR03")
	@ElDescription(sub = "사용자별 롤등록관리 사용자리스트 조회", desc = "")
	@ElValidator(errUrl = "")
	public List<UserVo> findUserList(UserSrcVo vo) throws Exception{
		return roleService.findUserList(vo);
	}
	
	@ElService(key = "SvcUSSATHUSRR04")
	@RequestMapping(value = "SvcUSSATHUSRR04")
	@ElDescription(sub = "사용자별 롤등록관리 사용자별 롤 등록리스트 조회", desc = "")
	@ElValidator(errUrl = "")
	public List<RoleVo> findUserRoleList(UserSrcVo vo) throws Exception{
		return roleService.findUserRoleList(vo);
	}
	
	@ElService(key = "SvcUSSATHUSRR05")
	@RequestMapping(value = "SvcUSSATHUSRR05")
	@ElDescription(sub = "사용자별 롤등록관리 - 롤 조회", desc = "")
	@ElValidator(errUrl = "")
	public List<RoleVo> findRoleList(UserSrcVo vo) throws Exception{
		return roleService.findRoleList(vo);
	}
	
	@ElService(key = "SvcUSSATHUSRU01")
	@RequestMapping(value = "SvcUSSATHUSRU01")
	@ElDescription(sub = "사용자별 롤등록관리 - 사용자롤 수정", desc = "")
	@ElValidator(errUrl = "")
	public void saveUserRole(UserVo vo) throws Exception{
		roleService.saveUserRole(vo);
	}
}
