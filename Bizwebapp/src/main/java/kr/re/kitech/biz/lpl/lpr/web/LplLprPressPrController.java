package kr.re.kitech.biz.lpl.lpr.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.lpl.lpr.service.LplLprPressPrService;
import kr.re.kitech.biz.lpl.lpr.vo.LplLprPressPrInfoVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;

/**
 * @ClassSubJect 언론보도신청
 * @Class Name LplLprPressPrController.java
 * @Description 언론보도신청 Controller
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2023.08.21.      김상미             최초생성
 * 
 * @author 김상미
 * @since 2023.08.21.
 * @version 1.0
 * @see
 * 
 */
 
@Controller
public class LplLprPressPrController {

	@Resource(name = "lplLprPressPrServiceImpl")
	private LplLprPressPrService lprService;

    /**
     * 언론보도신청 목록을 조회합니다.
     *
     * @author 김상미
     * @param  LplLprPressPrInfoVo
     * @return List<LplLprPressPrInfoVo>
     * @throws KitechException
     * @since 2023.08.21.
     */	
	@ElService(key="SvcLPLLPRLPRMR01")
	@RequestMapping(value="SvcLPLLPRLPRMR01")
	@DataCollection(ref="", target="")
	@ElDescription(sub="언론보도신청리스트 조회",desc="언론보도신청리스트를 조회한다.")
	public List<LplLprPressPrInfoVo> selectList(LplLprPressPrInfoVo lprVo) throws KitechException {
	    return lprService.selectList(lprVo);
	}

    /**
     * 언론보도신청 상세를 조회합니다.
     *
     * @author 김상미
     * @param  LplLprPressPrInfoVo
     * @return LplLprPressPrInfoVo
     * @throws KitechException
     * @since 2023.08.21.
     */		
	@ElService(key="SvcLPLLPRLPRSR01")
	@RequestMapping(value="SvcLPLLPRLPRSR01")
	@DataCollection(ref="", target="")
	@ElDescription(sub="언론보도신청 조회",desc="언론보도신청 정보를 조회한다.")
	public LplLprPressPrInfoVo select(LplLprPressPrInfoVo lprVo) throws KitechException {
	    return lprService.select(lprVo);
	}

    /**
     * 언론보도신청 등록/수정 합니다.
     *
     * @author 김상미
     * @param  LplLprPressPrInfoVo
     * @return LplLprPressPrInfoVo
     * @throws KitechException
     * @since 2023.08.21.
     */	 	
	@ElService(key = "SvcLPLLPRLPRSI01")
	@RequestMapping(value = "SvcLPLLPRLPRSI01")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "언론보도신청 등록/수정", desc = "언론보도신청 정보를 등록/수정한다.")
	@ElValidator(errUrl = "")
	public LplLprPressPrInfoVo svae(LplLprPressPrInfoVo lprVo) throws KitechException {
	   return lprService.save(lprVo);
	}
	
    /**
     * 언론보도신청 정보, 전자결재를 삭제합니다.
     *
     * @author 김상미
     * @param  LplLprPressPrInfoVo
     * @throws KitechException
     * @since 2023.08.21.
     */		
	@ElService(key = "SvcLPLLPRLPRSD01")
	@RequestMapping(value = "SvcLPLLPRLPRSD01")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "언론보도신청 내역을 삭제", desc = "언론보도신청 내역을 삭제한다.")
	@ElValidator(errUrl = "")
	public void delete(LplLprPressPrInfoVo lprVo) throws KitechException {
	    lprService.delete(lprVo);
	}  
}
