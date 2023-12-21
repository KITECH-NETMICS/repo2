/**
 * 
 */
/**
 * @author user
 *
 */
package kr.re.kitech.biz.ccs.cgs.service.impl;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.util.ControllerContextUtil;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.ccs.cgs.dao.CgsCarUseDAO;
import kr.re.kitech.biz.ccs.cgs.service.CgsCarUseService;
import kr.re.kitech.biz.ccs.cgs.vo.CgsCarUseVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.model.BizUserHeader;
import kr.re.kitech.biz.xom.core.model.BizMail;
import kr.re.kitech.biz.xom.core.util.MailSender;
import kr.re.kitech.biz.xom.core.vo.MailTemplateVo;


@Service("cgsCarUseServiceImpl")
public class CgsCarUseServiceImpl  extends EgovAbstractServiceImpl implements CgsCarUseService {

    @Resource(name="cgsCarUseDAO")
    private CgsCarUseDAO cgsDAO;
    
	@Resource(name="mailSender")
	private MailSender mailSender;

    
    @Override
    public List<CgsCarUseVo> selectListArea() throws ElException {
    	List<CgsCarUseVo> list = cgsDAO.selectListArea();	
		return list;
    }
    
    @Override
    public List<CgsCarUseVo> selectListCar(CgsCarUseVo vo) throws ElException {
    	List<CgsCarUseVo> list = cgsDAO.selectListCar(vo);	
		return list;
    }
    
    @Override
    public CgsCarUseVo selectCarAdmin(CgsCarUseVo CgsVo) throws ElException {
    	CgsCarUseVo resultVO = cgsDAO.selectCarAdmin(CgsVo);			
        return resultVO;
    }
    

	@Override
	public List<CgsCarUseVo> selectListCgsCarUse(CgsCarUseVo vo) throws ElException {
		List<CgsCarUseVo> list = cgsDAO.selectListCgsCarUse(vo);	
		return list;
	}
	
	@Override
	public int insertCgsCarUse(CgsCarUseVo vo) throws ElException, IOException {
        int result = cgsDAO.insertCgsCarUse(vo);
        return result;
	}
	
	@Override
	public CgsCarUseVo selectDetailCgsCarUse(CgsCarUseVo vo) throws ElException {
		CgsCarUseVo resultVO = cgsDAO.selectDetailCgsCarUse(vo);			
        return resultVO;
	}
	
	@Override
	public int updateCgsCarUse(CgsCarUseVo vo) throws Exception {
		 int result = cgsDAO.updateCgsCarUse(vo);
		return result;
	}
	
	@Override
	public int deleteCgsCarUse(CgsCarUseVo CgsVo) throws Exception {
		return cgsDAO.deleteCgsCarUse(CgsVo);
	}
	
	@Override
	public int updatBiz(CgsCarUseVo CgsVo) throws Exception {
		 int result = cgsDAO.updatBiz(CgsVo);
		return result;
	}
	
	@Override
	public CgsCarUseVo dupCheckCarUse(CgsCarUseVo CgsVo) throws ElException {
		CgsCarUseVo resultVO = cgsDAO.dupCheckCarUse(CgsVo);			
        return resultVO;
	}
	
	@Override
	public CgsCarUseVo dupCheckCarUse2(CgsCarUseVo CgsVo) throws ElException {
		CgsCarUseVo resultVO = cgsDAO.dupCheckCarUse2(CgsVo);			
        return resultVO;
	}
	
	@Override
	public void cgsMailSend(CgsCarUseVo cgsVo) throws ElException {
		MailTemplateVo templateVo = new MailTemplateVo();
		Map<String, String> templateVar = new HashMap<String, String>();
		BizUserHeader siteUserHeader = (BizUserHeader)ControllerContextUtil.getUserHeader();
		
		String useDate = new StringBuilder(cgsVo.getUse_orign_ymd())
							.append(", ")
							.append(cgsVo.getUse_orign_time())
							.append(" ~ ")
							.append(cgsVo.getUse_cls_ymd())
							.append(", ")
							.append(cgsVo.getUse_cls_time())
							.toString();
		
		templateVar.put("@useDate@", useDate);
		templateVar.put("@carInfo@", cgsVo.getCar_info() + " - 신청지역(" + cgsVo.getReq_region_nm() + ")");
		templateVar.put("@drivPsn@", cgsVo.getDriv_psn_nm());
		templateVar.put("@destin@", cgsVo.getDestin());
		templateVar.put("@rmk@", cgsVo.getRmk());
		
		String subject = "[신청] 배차신청이 확정 되었습니다.";
		String templatePath = "ccs/CgsCarUseReqMail";
		String syspayno = siteUserHeader.getSession().getSn();
		String toAddr = cgsDAO.selectReqPsnEmail(cgsVo).getEmail();
		String sender = siteUserHeader.getSession().getUid() + "@kitech.re.kr";
		
		templateVo.setContentVar(templateVar);
		List<MailTemplateVo> templateVars = new ArrayList<>();
		templateVars.add(templateVo);
		
		mailSender.sendMessage(
			// 비즈니스 타입, 행위자 시스템 사번, 개별발송여부는 고정 속성
			new BizMail.Builder(syspayno, Business.CCS, true)
				.senderEmail(sender.trim())
				.toAddr(toAddr.trim())
				//.ccAddr(ccAddress)
				.subject(subject)
				.savesent(false)	// 받은 편지함 저장 여부
				.logging(true)	// 로그 저장 여부
				.templatePath(templatePath)
				.templateVars(templateVars)
			.build());
	}
	

}