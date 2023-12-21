/**
 * 
 */
package kr.re.kitech.biz.api.server.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import kr.re.kitech.biz.api.server.dao.BizBpmDAO;
import kr.re.kitech.biz.api.server.enums.RoleType;
import kr.re.kitech.biz.api.server.service.BizBpmService;
import kr.re.kitech.biz.api.server.vo.ApiBpmVo;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.vo.IntfatabVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.ApprvConfigDAO;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.vo.AppvDelegatorDetailVo;
import kr.re.kitech.biz.xom.core.vo.UserVo;

/**
 * BPM 대응 서비스 구현체
 * @author James
 * @since 2022. 6. 29.
 */
@Service("bizBpmServiceImpl")
public class BizBpmServiceImpl implements BizBpmService {

    @Resource(name="bizBpmDAO")
    private BizBpmDAO bizBpmDAO;

    @Resource(name="apprvConfigDAO")
    private ApprvConfigDAO apprvConfigDAO;
    
    @Resource(name="apprCommonServiceImpl")
    private ApprCommonService apprCommonService;    
    
	@Resource(name = "accntServiceImpl")
	private AccntService accntService;	    

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.server.service.BizBpmService#findLocalAuthorsBySyspaynoAndType(kr.re.kitech.biz.api.server.vo.ApiAprVo)
	 */
	@Override
	public List<ApiBpmVo> findLocalAuthors(ApiBpmVo apiBpmVo) throws KitechException {
		List<ApiBpmVo> apiBpmVoList = new ArrayList<>();
		RoleType roleType = RoleType.valueOf(apiBpmVo.getRoleType());
		switch(roleType) {
			case pv:	// 인사담당자
			case pv_hr:	// 인사담당자
			case pur_manager_aboard:	// 외자구매담당
			
				String roleCode;
				if (roleType == RoleType.pur_manager_aboard) {
					// 외자구매담당
					roleCode = "1004105";	
				} else {
					// 인사담당
					final String[] occutype1 = {"110000", "120000", "130000", "150000", "190000", "330000",  "340000", "360000"};
					final String[] occutype2 = {"210000", "230000", "250000", "270000", "291000", "310000"};
					final String[] occutype3 = {"350000", "351000", "354000"};
					if (Arrays.stream( occutype1).anyMatch(apiBpmVo.getOccutypCd()::equals)) {
						roleCode = "1003132";
					} else if (Arrays.stream( occutype2).anyMatch(apiBpmVo.getOccutypCd()::equals)){
						roleCode = "1003133";
					} else if (Arrays.stream( occutype3).anyMatch(apiBpmVo.getOccutypCd()::equals)){
						roleCode = "1003125";
					} else {
						roleCode = "1003134";
					}
				}
				
				apiBpmVoList = bizBpmDAO.findAuthorsByRoleCode(roleCode);
				break;
			case tech_manager:	// 지역별 기술료 담당자
				apiBpmVoList = bizBpmDAO.findTecAuthorsByRoleCode("1001210");
				break;
			case asset_hq:	// 원본부 자산 담당자
				apiBpmVoList = bizBpmDAO.findAssHqAuthors();
				break;
			default:
				apiBpmVo.setRoleType(roleType.getCode());
				apiBpmVoList = bizBpmDAO.findLocalAuthorsByRoleType(apiBpmVo);
		}
	
		return apiBpmVoList;
	}


	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.server.service.BizBpmService#execBackToHere(kr.re.kitech.biz.api.server.vo.ApiBpmVo)
	 */
	@Override
	public ApiBpmVo execBackToHere(ApiBpmVo param) throws KitechException {
		IntfatabVo vo = new IntfatabVo();
		
		vo.setReqNo(param.getReqNo());
		vo.setAprState(param.getAprState());
		
		UserVo user = this.accntService.findUserIdBySyspayno(param.getSyspayno());

		vo.setEndpoints(user.getUid());
		int count = apprCommonService.modXomxintfatab(vo);
		
		// 결과 처리
		param.setSuccess(0 < count);
		
		return param;
	}


	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.server.service.BizBpmService#getApprByProxy(kr.re.kitech.biz.api.server.vo.ApiBpmVo)
	 */
	@Override
	public ApiBpmVo getApprByProxy(ApiBpmVo param) throws KitechException {
		
		AppvDelegatorDetailVo vo = new AppvDelegatorDetailVo();
		vo.setSyspayno(param.getSyspayno());
		vo.setForm_alias(param.getFormAlias());
		
		String uid = this.apprvConfigDAO.getAuthorApprByProxy(vo);
		
		// 결과 처리
		if (StringUtils.isEmpty(uid)) {
			// 대결자가 없을 때
			param.setSuccess(false);
		} else {
			// 대결자가 있을 때
			param.setSuccess(true);
			UserVo user = this.accntService.findUserByUsername(uid);
			
			param.setEndPointNm(user.getCn());
			param.setEndPoint(user.getUid());			
		}
		
		return param;
	}


	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.server.service.BizBpmService#execDelegate(kr.re.kitech.biz.api.server.vo.ApiBpmVo)
	 */
	@Override
	public ApiBpmVo execDelegate(ApiBpmVo param) throws KitechException {
		UserVo user = this.accntService.findUserIdBySyspayno(param.getSyspayno());
		this.apprCommonService.modifyAprInterface(param.getReqNo(), null, user.getUid());
		return param;
	}

}
