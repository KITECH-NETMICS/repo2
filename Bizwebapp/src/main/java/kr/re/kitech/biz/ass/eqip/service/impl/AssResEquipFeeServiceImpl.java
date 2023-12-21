/**
 * 
 */
package kr.re.kitech.biz.ass.eqip.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.ass.eqip.dao.AssResEquipMgtDAO;
import kr.re.kitech.biz.ass.eqip.service.AssResEquipFeeService;
import kr.re.kitech.biz.ass.eqip.vo.ResEquipFeeReqVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.fin.com.service.FinComService;
import kr.re.kitech.biz.fin.com.vo.ResBgAcctmVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**  
 * @ClassSubJect 연구장비통합관리
 * @Class Name : AssResEquiqFeeServiceImpl.java
 * @Description : 연구시설장비비 요청관리 ServiceImpl
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/12/07   이민기                최초생성
 * 
 * @author mklee
 * @since 2023/12/07
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Service("assResEquipFeeService")
public class AssResEquipFeeServiceImpl extends EgovAbstractServiceImpl implements AssResEquipFeeService {	
	
	@Resource(name="assResEquipDAO")
	private AssResEquipMgtDAO equipDao;
		
	@Resource(name="apprCommonServiceImpl")
	private ApprCommonService apprCommonService;
	
	@Resource(name="generationServiceImpl")
	private GenerationService genService;
	
	@Resource(name="apprFuncServiceImpl")
	private ApprFuncService apprFuncService;
		
	@Resource(name="finComService")
	private FinComService finComService;	
		
	@Resource(name="attachDAO")
	private AttachDAO attachDao;
  	
	
	/**
    * 연구시설장비비집행요청 목록
    * @param ResEquipFeeReqVo
    * @return List<ResEquipFeeReqVo>
    * @author mklee
    */
	public List<ResEquipFeeReqVo> selectAssResEquipFeeReqList(ResEquipFeeReqVo vo) throws KitechException{
		return equipDao.selectAssResEquipFeeReqList(vo);
	}
	
	/**
    * 연구시설장비비집행요청 상세
    * @param ResEquipFeeReqVo
    * @return List<ResEquipFeeReqVo>
    * @author mklee
    */
	public ResEquipFeeReqVo selectAssResEquipFeeReq(ResEquipFeeReqVo vo) throws KitechException{
		return equipDao.selectAssResEquipFeeReq(vo);
	}
	
	/**
    * 연구시설장비비집행요청 상세
    * @param ResEquipFeeReqVo
    * @return List<ResEquipFeeReqVo>
    * @author mklee
    */
	public ResEquipFeeReqVo selectResEquipFeeAccnt(ResEquipFeeReqVo vo) throws KitechException{
		return equipDao.selectResEquipFeeAccnt(vo);
	}
	
	/**
    * 연구장비비요청 데이터 저장
    * @param ResEquipFeeReqVo
	* @return 
    * @throws mklee
    */
	public String saveAssResEquipFeeReq(ResEquipFeeReqVo vo) throws KitechException{
		
		String reqNo = vo.getReq_no();
		
		if(vo.getAccnt_no().equals("FF210002")){
			//계정책임자 및 편성단위 조회
			ResBgAcctmVo acctnoVo = finComService.selectResBgAcctmChk(vo.getAccnt_no());		
			vo.setAccnt_rspns(acctnoVo.getAccnt_rspns());
		}
		
		if("C".equals(vo.getCud_type())){
			reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "A31");
			vo.setReq_no(reqNo);
			
			// 인터페이스 테이블 저장
			apprFuncService.formInit(reqNo, "G310", KitechContextUtil.getUserId());
						
			if(equipDao.insertAssResEquipFeeReq(vo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.CCS, "message.xom.co.com.0002", new String[]{"연구시설장비비 요청 저장"});
			}				
			
		}else{
			equipDao.updateAssResEquipFeeReq(vo);
		}	
		
		return reqNo;	
	}
	
	/**
    * 연구장비비요청 데이터 삭제
    * @param ResEquipFeeReqVo
	* @return int
    * @throws Exception
    */
	public void deleteAssResEquipFeeReq(ResEquipFeeReqVo vo) throws KitechException {
		//결재정보 삭제
		this.apprCommonService.deleteApr(vo.getReq_no());	
		equipDao.deleteAssResEquipFeeReq(vo);
	}
	
	/**
    * 연구장비비요청 결재신청
    * @param ResEquipFeeReqVo
	* @return int
    * @throws Exception
    */
	public void saveAssResEquipFeeReqApr(ResEquipFeeReqVo vo) throws KitechException {
				
		// 첨부파일
		if(!"".equals(vo.getAttach_file_no())){
			vo.setFileList(attachDao.selectListAttach(vo.getAttach_file_no()));
		}
		
		AprVo aprVo = new AprVo();
		aprVo.setLoginUserId(KitechContextUtil.getUserId());		
		aprVo.setReqNo(vo.getReq_no());		
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setUiId(KitechContextUtil.getServiceId());									
		aprVo.setInfoCd(vo.getRmk());
		aprVo.setExt1Cd(vo.getAccnt_no());
		aprVo.setResearcher(vo.getAccnt_rspns());
		// 04. 결재프로세스 호출
		//AppLog.info("\n =================== aprVo : " + vo);
		apprFuncService.approvalRequest(aprVo, vo);		
	}

}
