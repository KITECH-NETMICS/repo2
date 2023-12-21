package kr.re.kitech.biz.xom.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.api.client.KdocClient;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.ApprvConfigDAO;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.service.ApprvConfigService;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.vo.ApprMapVo;
import kr.re.kitech.biz.xom.core.vo.ApprvConfigVo;
import kr.re.kitech.biz.xom.core.vo.AppvDelegatorDetailVo;
import kr.re.kitech.biz.xom.core.vo.AppvDelegatorVo;
import kr.re.kitech.biz.xom.core.vo.UserAppvConfigVo;
import kr.re.kitech.biz.xom.core.vo.UserVo;

/**  
 * @ClassSubJect 환경설정 
 * @Class Name : ApprvConfigServiceImpl.java
 * @Description : 환경설정 으 처리하는 ServiceImpl
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/08/16   이영희          최초생성
 * 
 * @author 이영희
 * @since 2022/08/16
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved.
 */
@Service("apprvConfigService")
public class ApprvConfigServiceImpl extends EgovAbstractServiceImpl implements ApprvConfigService {

	@Resource(name="apprvConfigDAO")
	private ApprvConfigDAO dao;

    @Resource(name="accntServiceImpl")
    private AccntService accntService;    
    	
	@Resource(name="kdocDelegate")
	private KdocClient kdocClient;	


	/**
     * 유저 환경설정 조회
     * @param ApprvConfigVo
     * @return UserAppvConfigVo
     * @throws Exception
     */
	@Override
	public UserAppvConfigVo selectApprvConfig(ApprvConfigVo vo) throws KitechException {
		UserAppvConfigVo retVo = new UserAppvConfigVo();
		retVo.setConfigVo(dao.selectApprvConfig(vo));
		retVo.setUserList(dao.selectApprvDelegatorList(vo));
		return retVo;
	}
	
	/**
     * 유저 환경설정 저장
     * @param ApprvConfigVo
     * @throws Exception
     * @author LeeYH
     * @since 2022.08.16.
     */
	public void saveApprvConfig(ApprvConfigVo vo) throws KitechException {
		if("C".equals(vo.getCud_type())){
			dao.insertApprvConfig(vo);
		}else{
			dao.updateApprvConfig(vo);
		}
	}
	
	/**
     * 양식함 Tree 조회
     * @param ApprvConfigVo
     * @return List<ApprMapVo>
     * @throws Exception
     * @author LeeYH
     * @since 2022.08.16.
     */
	public List<ApprMapVo> selectAppvMapList(ApprvConfigVo vo) throws KitechException{
		return dao.selectAppvMapList(vo);
	}
	
	/**
     * 대결설정 조회
     * @param ApprvConfigVo
     * @return UserAppvConfigVo
     * @throws Exception
     */
	public UserAppvConfigVo selectApprvDlgt(AppvDelegatorVo vo) throws KitechException {
		UserAppvConfigVo retVo = new UserAppvConfigVo();
		retVo.setDlgtVo(dao.getAppvDelegator(vo));
		// 대결설정 상세 조회
		if((retVo.getDlgtVo() != null && retVo.getDlgtVo().getDlgt_sn() != 0) || vo.getDlgt_sn() != 0){
			vo.setDlgt_sn(retVo.getDlgtVo().getDlgt_sn());
			retVo.setDetlList(dao.selectAppvDelegatorDetailList(vo));
		}
		return retVo;
	}

	/**
     * 대결설정 저장
     * @param ApprvConfigVo
     * @throws Exception
     * @author LeeYH
     * @since 2022.08.16.
     */
	public void saveAppvDelegator(UserAppvConfigVo vo) throws KitechException {
		// 대결설정 저장
		AppvDelegatorVo dlgtVo = vo.getDlgtVo();
		if ("C".equals(dlgtVo.getCud_type())){
			// 신규저장시 이전 대결설정 유효개수 조회
			if (dao.selectAppvDelegatorCnt(dlgtVo.getSyspayno()) > 0){
				throw new KitechException(Exceptions.ALERT, Business.XOM, "message.xom.co.apr.0002");
			}
			// 신규등록
			dao.insertAppvDelegator(dlgtVo);
		} else {
			dao.updateAppvDelegator(dlgtVo);
		}

		List<AppvDelegatorDetailVo> detlList = vo.getDetlList();
		if (null != detlList && 0 < detlList.size()){
			// 대결 상세 삭제
			dao.deleteAppvDelegatorDetail(dlgtVo.getDlgt_sn());
			
			// 대결상세 입력
			int cnt =0;
			for (AppvDelegatorDetailVo detlVo : detlList){
				detlVo.setDlgt_sn(dlgtVo.getDlgt_sn());
				detlVo.setSeq(cnt+1);
				detlVo.setSyspayno(dlgtVo.getSyspayno());
				
				dao.insertAppvDelegatorDetail(detlVo);
				cnt++;
			}
		}
		
		if (StringUtils.equals(KitechContextUtil.getWorkClsf(), "HAG010")) {
			// KDOC 삭제
			this.sendToKdoc(dlgtVo, "D");
	
			// KDOC 저장
			this.sendToKdoc(dlgtVo, "I");
		}
	}
	
	/**
	 * 해당 사용자의 대결을 전체 삭제 한 후 신규 한건만 등록한다. 퇴직신청서 사용.
     *
	 * @param dlgtVo
	 * @throws KitechException
	 */
	public void saveAppvDelegator(AppvDelegatorVo dlgtVo) throws KitechException {

		// 사용자의 대결설정 전체 삭제 
		dao.deleteAppvDelegatorAll(dlgtVo.getSyspayno());
		
		// 신규등록
		dao.insertAppvDelegator(dlgtVo);
		
		// KDOC 전체 삭제
		this.sendToKdoc(dlgtVo, "D");

		// KDOC 해당 건 저장
		this.sendToKdoc(dlgtVo, "I");
	}
	

	/**
     * 대결설정 삭제
     * @param AppvDelegatorDetailVo
     * @throws Exception
     * @author LeeYH
     * @since 2022.08.16.
     */
	public void deleteAppvDelegator(AppvDelegatorDetailVo vo) throws KitechException {
		// KDOC 삭제 전문 생성을 위한 조회
		AppvDelegatorVo param = new AppvDelegatorVo();
		param.setDlgt_sn(vo.getDlgt_sn());
		param.setSyspayno( vo.getSyspayno());
		AppvDelegatorVo dlgtVo = dao.getAppvDelegator(param);
	
		// 대결 설정 삭제
		dao.deleteAppvDelegator(vo.getDlgt_sn());
		
		// 대결 상세 삭제
		dao.deleteAppvDelegatorDetail(vo.getDlgt_sn());
		
		if (StringUtils.equals(KitechContextUtil.getWorkClsf(), "HAG010")) {
			// KDOC 삭제
			this.sendToKdoc(dlgtVo, "D");
		}
	}
	
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.xom.core.service.ApprvConfigService#deleteAppvDelegatorAll(java.lang.String)
	 */
	public void deleteAppvDelegatorAll(String syspayno)throws KitechException {
		// KDOC 삭제 전문 생성을 위한 조회
		List<AppvDelegatorVo> delegators = dao.selectAppvDelegator(syspayno);
		if (CollectionUtils.isNotEmpty(delegators)) {
			// KDOC 삭제
			delegators.forEach(delegator -> {
				this.sendToKdoc(delegator, "D");
			});
			
			// 사번에 해당하는 사용자의 대결 설정 메인, 디테일 일괄 삭제
			dao.deleteAppvDelegatorAll(syspayno);
		}
	}

	/**
	 * 문서유통(KDOC) 데이터 연계
	 * @param dlgtVo
	 * @param state
	 * @return
	 */
	private void sendToKdoc(AppvDelegatorVo dlgtVo, String state) {
		if (null != dlgtVo && StringUtils.isNotEmpty(dlgtVo.getMain_syspayno())) {
			UserVo user = accntService.findUserIdBySyspayno(dlgtVo.getMain_syspayno());
			dlgtVo.setDelegatorCode(user.getUid());
			dlgtVo.setActorCode(KitechContextUtil.getUserId());				
			dlgtVo.setState(state);
			kdocClient.execute(dlgtVo);
		}
	}
}
