package kr.re.kitech.biz.lpl.lpr.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.lpl.lpr.service.LplLprPrGoodsReqService;
import kr.re.kitech.biz.lpl.lpr.vo.LplLprPrGoodsReqAprVo;
import kr.re.kitech.biz.lpl.lpr.vo.LplLprPrGoodsReqInfoVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : LplLprPrGoodsReqController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.13.      author    최초생성
 * 
 * @author 
 * @since 2023.09.13.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class LplLprPrGoodsReqController {

	@Resource(name = "lplLprPrGoodsReqServiceImpl")
	private LplLprPrGoodsReqService lprService;

    /**
     * 기념홍보물신청 리스트조회 
     * 
     * @author 김상미
	 * @param LplLprPrGoodsReqInfoVo
	 * @return List<LplLprPrGoodsReqInfoVo>
	 * @throws KitechException
	 * @since 2023.09.13.
	 */   
	@ElService(key = "SvcLPLLPRPRGDMR01")
	@RequestMapping(value = "SvcLPLLPRPRGDMR01")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "기념홍보물신청리스트 조회", desc = "기념홍보물신청리스트를 조회한다.")
	@ElValidator(errUrl = "")
	public List<LplLprPrGoodsReqInfoVo> selectList(LplLprPrGoodsReqInfoVo lprVo) throws KitechException {
		return lprService.selectList(lprVo);  
	}

    /**
     * 기념홍보물신청 물품정보 조회
     * 
     * @author 김상미
	 * @param LplLprPrGoodsReqInfoVo
	 * @return List<LplLprPrGoodsReqInfoVo>
	 * @throws KitechException
	 * @since 2023.09.13.
	 */   	
	@ElService(key = "SvcLPLLPRPRGDMR02")
	@RequestMapping(value = "SvcLPLLPRPRGDMR02")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "기념홍보물신청 물품정보 조회", desc = "기념홍보물신청 물품정보를 조회한다.")
	@ElValidator(errUrl = "")
	public List<LplLprPrGoodsReqInfoVo> selectMasterList(LplLprPrGoodsReqInfoVo lprVo) throws KitechException {
		return lprService.selectMasterList(lprVo);  
	}

    /**
     * 기념홍보물신청 상세 조회
     * 
     * @author 김상미
	 * @param LplLprPrGoodsReqInfoVo
	 * @return LplLprPrGoodsReqAprVo
	 * @throws KitechException
	 * @since 2023.09.13.
	 */   
	@ElService(key = "SvcLPLLPRPRGDSR01")
	@RequestMapping(value = "SvcLPLLPRPRGDSR01")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "기념홍보물신청 상세 조회", desc = "기념홍보물신청 상세 내용을 조회한다.")
	@ElValidator(errUrl = "")
	public LplLprPrGoodsReqAprVo select(LplLprPrGoodsReqInfoVo lprVo) throws KitechException {
		return lprService.select(lprVo); 
	}

    /**
     * 기념홍보물신청 물품재고 조회 
     * 
     * @author 김상미
	 * @param LplLprPrGoodsReqInfoVo
	 * @return List<LplLprPrGoodsReqInfoVo>
	 * @throws KitechException
	 * @since 2023.09.13.
	 */   
	@ElService(key = "SvcLPLLPRPRGDSR02")
	@RequestMapping(value = "SvcLPLLPRPRGDSR02")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "기념홍보물신청 물품재고 조회", desc = "기념홍보물신청 물품재고를 조회한다.")
	@ElValidator(errUrl = "")
	public List<LplLprPrGoodsReqInfoVo> selectGoodsInv(LplLprPrGoodsReqInfoVo lprVo) throws KitechException {
		return lprService.selectGoodsInv(lprVo);  
	}

    /**
     * 기념홍보물파일 조회
     * 
     * @author 김상미
	 * @param LplLprPrGoodsReqInfoVo
	 * @return LplLprPrGoodsReqInfoVo
	 * @throws KitechException
	 * @since 2023.09.13.
	 */   
	@ElService(key = "SvcLPLLPRPRGDSR03")
	@RequestMapping(value = "SvcLPLLPRPRGDSR03")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "기념홍보물파일 조회", desc = "기념홍보물 파일을 조회한다.")
	@ElValidator(errUrl = "")
	public LplLprPrGoodsReqInfoVo selectLplLprPrGoodsFile(LplLprPrGoodsReqInfoVo lprVo) throws KitechException {
		return lprService.selectLplLprPrGoodsFile(lprVo);  
	}

    /**
     * 기념홍보물신청 정보 등록
     * 
     * @author 김상미
	 * @param LplLprPrGoodsReqAprVo
	 * @return LplLprPrGoodsReqInfoVo
	 * @throws KitechException
	 * @since 2023.09.13.
	 */   
	@ElService(key = "SvcLPLLPRPRGDSI01")
	@RequestMapping(value = "SvcLPLLPRPRGDSI01")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "기념홍보물신청 정보 등록", desc = "기념홍보물신청 정보를 등록한다.")
	@ElValidator(errUrl = "")
	public LplLprPrGoodsReqInfoVo save(LplLprPrGoodsReqAprVo lprVo) throws KitechException {
		return lprService.save(lprVo);
	}

    /**
     * 기념홍보물신청 내역을 삭제 
     * 
     * @author 김상미
	 * @param LplLprPrGoodsReqInfoVo
	 * @return LplLprPrGoodsReqInfoVo
	 * @throws KitechException
	 * @since 2023.09.13.
	 */   
	@ElService(key = "SvcLPLLPRPRGDSD01")
	@RequestMapping(value = "SvcLPLLPRPRGDSD01")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "기념홍보물신청 내역을 삭제", desc = "기념홍보물신청 내역을 삭제한다.")
	@ElValidator(errUrl = "")
	public LplLprPrGoodsReqInfoVo delete(LplLprPrGoodsReqInfoVo lprVo) throws Exception {
	    return lprService.delete(lprVo);
	}

    /**
     * 기념홍보물신청 물품 출고정보 조회
     * 
     * @author 김상미
	 * @param LplLprPrGoodsReqInfoVo
	 * @return List<LplLprPrGoodsReqInfoVo>
	 * @throws KitechException
	 * @since 2023.09.13.
	 */   
	@ElService(key = "SvcLPLLPRPRGDSR04")
	@RequestMapping(value = "SvcLPLLPRPRGDSR04")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "기념홍보물신청 물품 출고정보 조회", desc = "기념홍보물신청 출고정보를 조회한다.")
	@ElValidator(errUrl = "")
	public List<LplLprPrGoodsReqInfoVo> selectDelivList(LplLprPrGoodsReqInfoVo lprVo) throws KitechException {
		return lprService.selectLplLprPrGoddsDeliv(lprVo);  
	}

    /**
     * 기념홍보물신청 물품 출고정보 등록 
     * 
     * @author 김상미
	 * @param LplLprPrGoodsReqInfoVo
	 * @return LplLprPrGoodsReqInfoVo
	 * @throws KitechException
	 * @since 2023.09.13.
	 */   
	@ElService(key = "SvcLPLLPRPRGDSI02")
	@RequestMapping(value = "SvcLPLLPRPRGDSI02")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "기념홍보물신청 물품 출고정보 등록", desc = "기념홍보물신청 물품  출고정보를 등록한다.")
	@ElValidator(errUrl = "")
	public LplLprPrGoodsReqInfoVo updateLplLprPrGoodsReqDetail(LplLprPrGoodsReqInfoVo lprVo) throws KitechException {
		return lprService.updateLplLprPrGoodsReqDetail(lprVo);
	}
}
  