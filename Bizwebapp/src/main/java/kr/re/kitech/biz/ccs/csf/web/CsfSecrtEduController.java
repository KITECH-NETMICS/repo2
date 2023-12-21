package kr.re.kitech.biz.ccs.csf.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.ccs.csf.service.CsfSecrtEduService;
import kr.re.kitech.biz.ccs.csf.vo.CsfSecrtEduListVo;
import kr.re.kitech.biz.ccs.csf.vo.CsfSecrtEduVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : CsfSecrtEduController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.27.      author    최초생성
 * 
 * @author 
 * @since 2023.10.27.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class CsfSecrtEduController {

	@Resource(name = "csfSecrtEduServiceImpl")
	private CsfSecrtEduService csfService;

	@ElService(key = "SvcCCSCGSEDUMR01")
	@RequestMapping(value = "SvcCCSCGSEDUMR01")
	@DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'csfSecrtEduVoList'}")
	@ElDescription(sub = "보안안전교육 조회", desc = "보안안전교육 조회")
	@ElValidator(errUrl = "")
	public List<CsfSecrtEduVo> selectCsfSecrtEduList(CsfSecrtEduVo csfVo) throws KitechException {
		return csfService.selectCsfSecrtEduList(csfVo);    	 
	}
	
	@ElService(key = "SvcCCSCGSEDUTYPCD01")
	@RequestMapping(value = "SvcCCSCGSEDUTYPCD01")
	@DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'csfSecrtEduVoList'}")
	@ElDescription(sub = "교육구분 코드 조회", desc = "교육구분 코드 조회")
	@ElValidator(errUrl = "")
	public List<CsfSecrtEduVo> selectEducTypCdList(CsfSecrtEduVo csfVo) throws KitechException {
		return csfService.selectEducTypCdList(csfVo);
	}
	
	@ElService(key = "SvcCCSCGSEDUKNDCD01")
	@RequestMapping(value = "SvcCCSCGSEDUKNDCD01")
	@DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'csfSecrtEduVoList'}")
	@ElDescription(sub = "교육종류 코드 조회", desc = "교육종류 코드 조회")
	@ElValidator(errUrl = "")
	public List<CsfSecrtEduVo> selectEducKndCdList(CsfSecrtEduVo csfVo) throws KitechException {
		return csfService.selectEducKndCdList(csfVo);
	}
	
	@ElService(key = "SvcCCSCGSEDUMI01")
	@RequestMapping(value = "SvcCCSCGSEDUMI01")
	@DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'csfSecrtEduVoList'}")
	@ElDescription(sub = "보안안전교육 저장", desc = "보안안전교육 저장")
	@ElValidator(errUrl = "")
	public void insertCsfSecrtEdu(CsfSecrtEduVo csfVo) throws KitechException {
		csfService.insertCsfSecrtEdu(csfVo);
	}
	
	@ElService(key = "SvcCCSCGSEDUMD01")
	@RequestMapping(value = "SvcCCSCGSEDUMD01")
	@DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'csfSecrtEduVoList'}")
	@ElDescription(sub = "보안안전교육 삭제", desc = "보안안전교육 삭제")
	@ElValidator(errUrl = "")
	public void deleteCsfSecrtEdu(CsfSecrtEduVo csfVo) throws KitechException {
		csfService.deleteCsfSecrtEdu(csfVo);
	}
	
	@ElService(key = "SvcCCSCGSEDUMIS01")
	@RequestMapping(value = "SvcCCSCGSEDUMIS01")
	@DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'csfSecrtEduVoList'}")
	@ElDescription(sub = "보안안전교육 그리드 저장", desc = "보안안전교육 그리드 저장")
	@ElValidator(errUrl = "")
	public void insertsCsfSecrtEdu(CsfSecrtEduListVo csfVo) throws KitechException {
		csfService.insertsCsfSecrtEdu(csfVo);
	}
}
  