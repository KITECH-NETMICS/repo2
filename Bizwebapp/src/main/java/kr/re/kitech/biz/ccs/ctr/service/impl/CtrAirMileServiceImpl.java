package kr.re.kitech.biz.ccs.ctr.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.ccs.ctr.dao.CtrAirMileDAO;
import kr.re.kitech.biz.ccs.ctr.service.CtrAirMileService;
import kr.re.kitech.biz.ccs.ctr.vo.AirMileSrcVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrAirMileInfoVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrAirMileVo;
import kr.re.kitech.biz.ccs.pop.vo.CtrAirMileUseVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 국내출장정산
 * @Class Name CtrDomTripAdServiceImpl.java
 * @Description 국내출장정산 관련 처리 ServiceImpl
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/06/08      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/06/08
 * @version 1.0
 * @see
 * 
 */
@Service("ctrAirMileService")
public class CtrAirMileServiceImpl extends EgovAbstractServiceImpl implements CtrAirMileService{
	@Resource(name="ctrAirMileDAO")
	private CtrAirMileDAO dao;
	
	@Resource(name="generationServiceImpl")
	private GenerationService genService;
	
	@Resource(name="finComAttachService")
	private FinComAttachService attachService;
	
	/**
     * 항공사별 마일리지 신청서(신고서) 조회
     * @param String
     * @return List<CtrAirMileUseVo>
     * @throws Exception
     * @author LeeYoungHee
     * @since 2023.02.14.
     */
	public CtrAirMileInfoVo selectCtrAirMileUseList(AirMileSrcVo vo) throws KitechException{	
		CtrAirMileInfoVo retVo = new CtrAirMileInfoVo();
		// 항공사별 마일리지 사용리스트
		retVo.setAirMileUseList(dao.selectCtrAirMileUseList(vo));
		
		// 출장정보 조회
		retVo.setTripVo(dao.selectCtrTripAirMile(vo.getBiztrip_req_no()));	
		
		return retVo;
	}	
	
	/**
     * 개인별 항공마일리지 조회
     * @param String
     * @return List<CtrAirMileVo>
     * @throws Exception
     * @author LeeYoungHee
     * @since 2023.02.14.
     */
	public List<CtrAirMileVo> selectCtrAirMileList(AirMileSrcVo vo) throws KitechException{	
		return dao.selectCtrAirMileList(vo);
	}
	
	/**
     * 항공마일리지 신청(신고)서 저장
     * @param CtrAirMileUseVo
     * @return String
     * @throws Exception
     * @author LeeYoungHee
     * @since 2023.02.16.
     */
	public String saveCtrAirMileReqAndRep(CtrAirMileUseVo vo) throws KitechException{
		String reqNo = vo.getReq_no();
		if(reqNo == null || "".equals(reqNo)){
			reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "C8A");
			vo.setReq_no(reqNo);
			
			if(dao.insertCtrAirMileUse(vo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.CCS, "message.xom.co.com.0002", new String[]{"항공마일리지 신청"});
			}
		}else{
			if(vo.getSeq() == 0){
				if(dao.insertCtrAirMileUse(vo) == 0){
					throw new KitechException(Exceptions.ERROR, Business.CCS, "message.xom.co.com.0002", new String[]{"항공마일리지 신청"});
				}
			}else{
				dao.updateCtrAirMileUse(vo);
			}
		}
		
		if(vo.getAir_cd() != null && !"".equals(vo.getAir_cd().trim())){
			CtrAirMileVo mileVo = new CtrAirMileVo();
			mileVo.setSyspayno(vo.getSyspayno());
			mileVo.setAir_cd(vo.getAir_cd());
			mileVo.setCu_use_mile(vo.getCu_pub_use_mile());
			mileVo.setUse_mile(vo.getPub_use_mile());		
			mileVo.setPub_new_mile(vo.getPub_new_mile());
			mileVo.setCu_pub_new_mile(vo.getCu_pub_new_mile());
			mileVo.setTotl_mile(vo.getCu_pub_new_mile());
			
			if(dao.mergeCtrAirMile(mileVo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.CCS, "message.xom.co.com.0002", new String[]{"개인별 항공마일리지 저장"});
			}
		}
		
		// 항공마일리지 현재는 전자증빙에 없는 것 같아서 일단 주석처리(2023.02.22.)
//		FbaExpnsEvidVo paramVo = new FbaExpnsEvidVo();
//		paramVo.setDoc_id("C74");
//		paramVo.setReq_no(vo.getBiztrip_report_no());
//		List<FspEvidAttachVo> evidVoList = attachService.selectFbaExpnsEvidList(paramVo);
		
//		for(FspEvidAttachVo evidVo : evidVoList){
//			evidVo.setReq_no(reqNo);
//			evidVo.setKey_val(reqNo);
//		}
//		attachService.saveFspEvidAttach(evidVoList);	
		
		return reqNo;
	}
	
}
