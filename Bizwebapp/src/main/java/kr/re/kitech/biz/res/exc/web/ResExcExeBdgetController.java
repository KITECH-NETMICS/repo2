package kr.re.kitech.biz.res.exc.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.res.exc.service.ResExcExeBdgetService;
import kr.re.kitech.biz.res.exc.vo.ResExcExeBdgetInfoVo;
import kr.re.kitech.biz.res.exc.vo.ResExcExeBdgetVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : ResExcExeBdgetController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.16.     김상미           최초생성
 * 
 * @author 김상미
 * @since 2023.10.16.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class ResExcExeBdgetController {

	@Resource(name = "resExcExeBdgetServiceImpl")
	private ResExcExeBdgetService excService;
	
	/**
	 * 실행예산편성관리 목록 조회
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return List<ResExcExeBdgetInfoVo>
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */  
	@ElService(key="SvcRESEXCEXEMR01")
	@RequestMapping(value="SvcRESEXCEXEMR01")
	@DataCollection(ref="", target="")
	@ElDescription(sub="실행예산편성관리 목록 조회",desc="실행예산편성관리 목록 조회")
	public List<ResExcExeBdgetInfoVo> selectResExcExeBdgetList(ResExcExeBdgetInfoVo excVo) throws KitechException {
	    return excService.selectResExcExeBdgetList(excVo);   
	}

	/**
	 * 실행예산(계정) 내역 조회 
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */  
	@ElService(key="SvcRESEXCEXESR01")
	@RequestMapping(value="SvcRESEXCEXESR01")
	@DataCollection(ref="", target="")
	@ElDescription(sub="실행예산(계정) 내역 조회",desc="실행예산(계정) 내역 조회")
	public ResExcExeBdgetInfoVo selectResExcBdgetAcctm(ResExcExeBdgetInfoVo excVo) throws KitechException {
	    return excService.selectResExcBdgetAcctm(excVo);
	}

	/**
	 * 실행예산신청번호를 가지고 과제번호,계정번호 조회 
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */  
	@ElService(key="SvcRESEXCEXESR02")
	@RequestMapping(value="SvcRESEXCEXESR02")
	@DataCollection(ref="", target="")
	@ElDescription(sub="실행예산신청번호를 가지고 과제번호,계정번호 조회",desc="실행예산신청번호를 가지고 과제번호,계정번호 조회")
	public ResExcExeBdgetInfoVo selectResExcBdgetPrjAccntNoByReqNo(ResExcExeBdgetInfoVo excVo) throws KitechException {
	    return excService.selectResExcBdgetPrjAccntNoByReqNo(excVo);
	}
	
	/**
	 * 계정별 실행예산상태, 실행예산차수 MAX, 계정상태 조회 
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */  
	@ElService(key="SvcRESEXCEXESR03")
	@RequestMapping(value="SvcRESEXCEXESR03")
	@DataCollection(ref="", target="")
	@ElDescription(sub="계정별 실행예산상태, 실행예산차수 MAX, 계정상태 조회",desc="계정별 실행예산상태, 실행예산차수 MAX, 계정상태 조회")
	public ResExcExeBdgetVo selectResExcBdgetState(ResExcExeBdgetInfoVo excVo) throws KitechException {
	    return excService.selectResExcBdgetState(excVo);
	}
	
	/**
	 * 계정별 대비목/세부비목에 대한 차수별 실행예산 내역 조회
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return List<ResExcExeBdgetInfoVo>
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */  
	@ElService(key="SvcRESEXCEXESR04")
	@RequestMapping(value="SvcRESEXCEXESR04")
	@DataCollection(ref="", target="")
	@ElDescription(sub="계정별 대비목/세부비목에 대한 차수별 실행예산 내역 조회",desc="계정별 대비목/세부비목에 대한 차수별 실행예산 내역 조회")
	public List<ResExcExeBdgetVo> selectResExcBdgetExect(ResExcExeBdgetInfoVo excVo) throws KitechException {
	    return excService.selectResExcBdgetExect(excVo);   
	}	

	/**
	 * 계정의 실행예산에 대한 검증 
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */  
	@ElService(key="SvcRESEXCEXESR05")
	@RequestMapping(value="SvcRESEXCEXESR05")
	@DataCollection(ref="", target="")
	@ElDescription(sub="계정의 실행예산에 대한 검증",desc="계정의 실행예산에 대한 검증")
	public ResExcExeBdgetInfoVo selectCheckResBgExectAmt(ResExcExeBdgetInfoVo excVo) throws KitechException {
	    return excService.selectCheckResBgExectAmt(excVo);
	}	

	/**
	 * Main계정 체크 
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */  
	@ElService(key="SvcRESEXCEXESR06")
	@RequestMapping(value="SvcRESEXCEXESR06")
	@DataCollection(ref="", target="")
	@ElDescription(sub="Main계정 체크",desc="Main계정 체크")
	public ResExcExeBdgetInfoVo selectMainAccntChk(ResExcExeBdgetInfoVo excVo) throws KitechException {
	    return excService.selectMainAccntChk(excVo);
	}	
	

	/**
	 * 실행예산 내 외부전문기술활용비를 협약예산과 체크
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */  
	@ElService(key="SvcRESEXCEXESR07")
	@RequestMapping(value="SvcRESEXCEXESR07")
	@DataCollection(ref="", target="")
	@ElDescription(sub="실행예산 내 외부전문기술활용비를 협약예산과 체크",desc="실행예산 내 외부전문기술활용비를 협약예산과 체크")
	public ResExcExeBdgetInfoVo selectResExcRstAmtChk(ResExcExeBdgetInfoVo excVo) throws KitechException {
	    return excService.selectResExcRstAmtChk(excVo);
	}	


	/**
	 * 실행예산 내 외부전문기술활용비를 직접비와 체크 
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */  
	@ElService(key="SvcRESEXCEXESR08")
	@RequestMapping(value="SvcRESEXCEXESR08")
	@DataCollection(ref="", target="")
	@ElDescription(sub="실행예산 내 외부전문기술활용비를 직접비와 체크",desc="실행예산 내 외부전문기술활용비를 직접비와 체크")
	public ResExcExeBdgetInfoVo selectResExcDrctAmtChk(ResExcExeBdgetInfoVo excVo) throws KitechException {
	    return excService.selectResExcDrctAmtChk(excVo);
	}	
	
	/**
	 * 사용자용 실행예산편성 조회
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return List<ResExcExeBdgetInfoVo>
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */  
	@ElService(key="SvcRESEXCEXESR13")
	@RequestMapping(value="SvcRESEXCEXESR13")
	@DataCollection(ref="", target="")
	@ElDescription(sub="사용자용 실행예산편성 조회",desc="사용자용 실행예산편성 조회")
	public List<ResExcExeBdgetInfoVo> selectResExcExeBdgetForUserList(ResExcExeBdgetInfoVo excVo) throws KitechException {
	    return excService.selectResExcExeBdgetForUserList(excVo);   
	}

	/**
	 * 해당 차수의 실행예산 변경사유 조회
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return List<ResExcExeBdgetInfoVo>
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */  
	@ElService(key="SvcRESEXCEXESR14")
	@RequestMapping(value="SvcRESEXCEXESR14")
	@DataCollection(ref="", target="")
	@ElDescription(sub="해당 차수의 실행예산 변경사유 조회",desc="해당 차수의 실행예산 변경사유 조회")
	public List<ResExcExeBdgetInfoVo> selectResExcBdgetExereList(ResExcExeBdgetInfoVo excVo) throws KitechException {
	    return excService.selectResExcBdgetExereList(excVo);   
	}	


	/**
	 * 실행예산 변경사유 수정
     *
     * @author 김상미
     * @param  ResExcExeBdgetVo
     * @throws KitechException
	 * @since 2023.10.16. 
	 */
	@ElService(key = "SvcRESEXCEXESU04")    
	@RequestMapping(value = "SvcRESEXCEXESU04")
	@ElDescription(sub = "실행예산 변경사유 수정", desc = "실행예산 변경사유 수정")
	@ElValidator(errUrl = "")
	public void saveResExcBdgetExere(ResExcExeBdgetVo excVo) throws Exception {    	 
		excService.saveResExcBdgetExere(excVo);
	}	

	/**
	 * 실행예산 변경 등록
     *
     * @author 김상미
     * @param  ResExcExeBdgetVo
     * @return ResExcExeBdgetInfoVo
     * @throws KitechException
	 * @since 2023.10.16. 
	 */
	@ElService(key="SvcRESEXCEXEMI01")
	@RequestMapping(value="SvcRESEXCEXEMI01")
	@DataCollection(ref="", target="")
	@ElDescription(sub="실행예산 변경 등록",desc="실행예산 변경 등록")
	public ResExcExeBdgetInfoVo saveResExcBdgetData(ResExcExeBdgetVo excVo) throws KitechException {
		return excService.saveResExcBdgetData(excVo);
	}

	/**
	 * 실행예산 결제 신청
     *
     * @author 김상미
     * @param  ResExcExeBdgetVo
     * @return ResExcExeBdgetInfoVo
     * @throws KitechException
	 * @since 2023.10.16. 
	 */
	@ElService(key="SvcRESEXCEXEMU02")
	@RequestMapping(value="SvcRESEXCEXEMU02")
	@DataCollection(ref="", target="")
	@ElDescription(sub="실행예산 결제 신청",desc="실행예산 결제 신청")
	public ResExcExeBdgetInfoVo saveResExcBdgetApr(ResExcExeBdgetVo excVo) throws KitechException {
		return excService.saveResExcBdgetApr(excVo);
	}

	/**
	 * 실행예산 결재 정보 삭제
     *
     * @author 김상미
     * @param  ResExcExeBdgetVo
     * @throws KitechException
	 * @since 2023.10.16. 
	 */
	@ElService(key="SvcRESEXCEXEMD01")
	@RequestMapping(value="SvcRESEXCEXEMD01")
	@DataCollection(ref="", target="")
	@ElDescription(sub="실행예산 결재 정보 삭제",desc="실행예산 결재 정보 삭제")
	public void deleteResExcBdgetApr(ResExcExeBdgetInfoVo excVo) throws KitechException {
	   excService.deleteResExcBdgetApr(excVo);
	}
}
  