package kr.re.kitech.biz.res.exc.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.res.exc.service.ResExcPrjBdgetService;
import kr.re.kitech.biz.res.exc.vo.ResExcPrjBdgetInfoVo;
import kr.re.kitech.biz.res.exc.vo.ResExcPrjBdgetVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : ResExcPrjBdgetController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.24.     김상미    최초생성
 * 
 * @author 김상미
 * @since 2023.10.24.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class ResExcPrjBdgetController {	
	@Resource(name = "resExcPrjBdgetServiceImpl")
	private ResExcPrjBdgetService excService;
	
	/**
	 * PX프로젝트 계정 실행예산 편성 계정 목록 조회
	 * 
	 * @author 김상미
	 * @param ResExcPrjBdgetInfoVo
	 * @return List<ResExcPrjBdgetInfoVo>
	 * @throws KitechException
	 * @since 2023.10.24.   
	 */  
	@ElService(key="SvcRESEXCPRJR01")
	@RequestMapping(value="SvcRESEXCPRJR01")
	@DataCollection(ref="", target="")
	@ElDescription(sub="PX프로젝트 계정 실행예산 편성 계정 목록 조회",desc="PX프로젝트 계정 실행예산 편성 계정 목록 조회")
	public List<ResExcPrjBdgetInfoVo> selectResExcPrjBdgetList(ResExcPrjBdgetInfoVo excVo) throws KitechException {
	    List<ResExcPrjBdgetInfoVo> list = excService.selectResExcPrjBdgetList(excVo);    	 
	    return list;
	}

	/**
	 * 프로젝트예산편성 조회
	 * 
	 * @author 김상미
	 * @param ResExcPrjBdgetInfoVo
	 * @return ResExcPrjBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.24.   
	 */ 
	@ElService(key="SvcRESEXCPRJR02")
	@RequestMapping(value="SvcRESEXCPRJR02")
	@DataCollection(ref="", target="")
	@ElDescription(sub="프로젝트예산편성 조회",desc="프로젝트예산편성 조회")
	public ResExcPrjBdgetVo selectPrjAccntBugtDetail(ResExcPrjBdgetInfoVo excVo) throws KitechException {
		ResExcPrjBdgetVo vo = excService.selectPrjAccntBugtDetail(excVo); 
	    return vo;
	}

	/**
	 * 신청번호로 계정번호조회
	 * 
	 * @author 김상미
	 * @param ResExcPrjBdgetInfoVo
	 * @return ResExcPrjBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.24.   
	 */  
	@ElService(key="SvcRESEXCPRJR03")
	@RequestMapping(value="SvcRESEXCPRJR03")
	@DataCollection(ref="", target="")
	@ElDescription(sub="신청번호로 계정번호조회",desc="신청번호로 계정번호조회")
	public ResExcPrjBdgetInfoVo selectAccntNoByReqNo(ResExcPrjBdgetInfoVo excVo) throws KitechException {
	    ResExcPrjBdgetInfoVo resVo = excService.selectAccntNoByReqNo(excVo);    	 
	    return resVo;
	}

	/**
	 * 계정별 대비목/세부비목에 대한 차수별 실행예산 내역 조회
	 * 
	 * @author 김상미
	 * @param ResExcPrjBdgetInfoVo
	 * @return List<ResExcPrjBdgetVo>
	 * @throws KitechException
	 * @since 2023.10.24.   
	 */  
	@ElService(key="SvcRESEXCPRJR04")
	@RequestMapping(value="SvcRESEXCPRJR04")
	@DataCollection(ref="", target="")
	@ElDescription(sub="계정별 대비목/세부비목에 대한 차수별 실행예산 내역 조회",desc="계정별 대비목/세부비목에 대한 차수별 실행예산 내역 조회")
	public List<ResExcPrjBdgetVo> selectResPrjAccntBugtList(ResExcPrjBdgetInfoVo excVo) throws KitechException {
	    List<ResExcPrjBdgetVo> list = excService.selectResPrjAccntBugt(excVo);    	 
	    return list;
	}

	/**
	 * 프로젝트얘산편셩 변경 등록
     *
     * @author 김상미
     * @param  ResExcPrjBdgetVo
     * @return ResExcPrjBdgetInfoVo
     * @throws KitechException
	 * @since 2023.10.24. 
	 */
	@ElService(key="SvcRESEXCPRJI01")
	@RequestMapping(value="SvcRESEXCPRJI01")
	@DataCollection(ref="", target="")
	@ElDescription(sub="프로젝트얘산편셩 변경 등록",desc="프로젝트얘산편셩 변경 등록")
	public ResExcPrjBdgetInfoVo saveResExcPrjBdgetData(ResExcPrjBdgetVo excVo) throws KitechException {
		return excService.saveResExcPrjBdgetData(excVo);
	}

	/**
	 * 프로젝트얘산편셩 결제 신청
     *
     * @author 김상미
     * @param  ResExcPrjBdgetVo
     * @return ResExcPrjBdgetInfoVo
     * @throws KitechException
	 * @since 2023.10.24. 
	 */
	@ElService(key="SvcRESEXCPRJI02")
	@RequestMapping(value="SvcRESEXCPRJI02")
	@DataCollection(ref="", target="")
	@ElDescription(sub="프로젝트얘산편셩 결제 신청",desc="프로젝트얘산편셩 결제 신청")
	public ResExcPrjBdgetInfoVo saveResExcPrjBdgetApr(ResExcPrjBdgetVo excVo) throws KitechException {
		return excService.saveResExcPrjBdgetApr(excVo);
	}
	
	/**
	 * 이월금변경
     *
     * @author 김상미
     * @param  ResExcPrjBdgetInfoVo
     * @throws KitechException
	 * @since 2023.10.24. 
	 */
	@ElService(key = "SvcRESEXCPRJU01")    
	@RequestMapping(value = "SvcRESEXCPRJU01")
	@ElDescription(sub = "이월금변경", desc = "이월금변경")
	@ElValidator(errUrl = "")
	public void updateCryfwdAmt(ResExcPrjBdgetInfoVo excVo) throws Exception {    	 
		excService.updateCryfwdAmt(excVo);
	}		

	/**
	 * 프로젝트얘산편성 결재 정보 삭제
     *
     * @author 김상미
     * @param  ResExcPrjBdgetInfoVo
     * @throws KitechException
	 * @since 2023.10.24. 
	 */
	@ElService(key="SvcRESEXCPRJD01")
	@RequestMapping(value="SvcRESEXCPRJD01")
	@DataCollection(ref="", target="")
	@ElDescription(sub="프로젝트얘산편성 결재 정보 삭제",desc="프로젝트얘산편성 결재 정보 삭제")
	public void deleteResExcPrjBdgetApr(ResExcPrjBdgetInfoVo excVo) throws KitechException {
	   excService.deleteResExcPrjBdgetApr(excVo);
	}		
	
	/**
	 * 예실반영
     *
     * @author 김상미
     * @param  ResExcPrjBdgetInfoVo
     * @throws KitechException
	 * @since 2023.10.24.  
	 */
	@ElService(key = "SvcRESEXCPRJU02")    
	@RequestMapping(value = "SvcRESEXCPRJU02")
	@ElDescription(sub = "예실반영", desc = "예실반영")
	@ElValidator(errUrl = "")
	public void saveBugtAplyPrcs(ResExcPrjBdgetInfoVo excVo) throws Exception {    	 
		excService.saveBugtAplyPrcs(excVo);
	}	
}
  