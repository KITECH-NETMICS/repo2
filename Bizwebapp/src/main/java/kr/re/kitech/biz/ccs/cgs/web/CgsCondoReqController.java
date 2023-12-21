package kr.re.kitech.biz.ccs.cgs.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.ccs.cgs.service.CgsCondoReqService;
import kr.re.kitech.biz.ccs.cgs.vo.CgsCondoReqListVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgsCondoReqVo;
/**
 * @ClassSubJect : 콘도신청
 * @Class Name : CgsCondoReqController.java
 * @Description : 콘도신청 컨트롤러
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.08.30.      lsh    최초생성
 * 					    
 * @author lsh
 * @since 2023.08.30.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class CgsCondoReqController {
    
    @Resource(name = "cgsCondoReqServiceImpl")
    private CgsCondoReqService cgsService;
    
    @ElService(key = "SvcCCSCGSCNDMR01")
    @RequestMapping(value = "SvcCCSCGSCNDMR01")
    @ElDescription(sub = "콘도신청 목록조회", desc = "콘도신청 목록을 조회한다.")
    public CgsCondoReqListVo selectList(CgsCondoReqVo cgsVo) throws Exception {
        List<CgsCondoReqVo> list = cgsService.selectList(cgsVo);    	 
        CgsCondoReqListVo List = new CgsCondoReqListVo();
        List.setCgsCondoListVo(list);
        return List;
    }
    
    @ElService(key = "SvcCCSCGSCNDSR01")
    @RequestMapping(value = "SvcCCSCGSCNDSR01")
    @ElDescription(sub = "콘도신청 상세조회", desc = "콘도신청 상세내용을 조회한다.")
    public CgsCondoReqListVo selectItem(CgsCondoReqVo cgsVo) throws Exception {
        CgsCondoReqVo vo = cgsService.selectItem(cgsVo); 
        CgsCondoReqListVo List = new CgsCondoReqListVo();
        List.setCgsCondoVo(vo);
        return List;
    }
    
    @ElService(key = "SvcCCSCGSCNDSM01")
    @RequestMapping(value = "SvcCCSCGSCNDSM01")
    @ElDescription(sub = "콘도신청 저장", desc = "콘도신청 내용을 등록한다.")
    public CgsCondoReqListVo insertItem(CgsCondoReqVo cgsVo) throws Exception {
        CgsCondoReqVo vo = cgsService.insertItem(cgsVo); 
        CgsCondoReqListVo List = new CgsCondoReqListVo();
        List.setCgsCondoVo(vo);
        return List;
    }
    
    @ElService(key = "SvcCCSCGSCNDSD01")
    @RequestMapping(value = "SvcCCSCGSCNDSD01")
    @ElDescription(sub = "콘도신청 삭제", desc = "콘도신청 내용을 삭제한다.")
    public void deleteItem(CgsCondoReqVo cgsVo) throws Exception {
    	cgsService.deleteItem(cgsVo);
    }
    
    @ElService(key = "SvcCCSCGSCNDSU01")
    @RequestMapping(value = "SvcCCSCGSCNDSU01")
    @ElDescription(sub = "콘도신청 신청상태 수정", desc = "콘도신청 신청상태를 수정한다. (취소, 취소확정, 예약확정)")
	@ElValidator(errUrl = "")
    public void updateItem(CgsCondoReqVo cgsVo) throws Exception {
    	cgsService.updateReqState(cgsVo);
    }
    
    @ElService(key = "SvcCCSCGSCNDMR02")
    @RequestMapping(value = "SvcCCSCGSCNDMR02")
    @ElDescription(sub = "콘도 지역명 목록조회", desc = "콘도 지역명 콤보박스 목록을 조회한다.")
    public CgsCondoReqListVo selectCondoRegion(CgsCondoReqVo cgsVo) throws Exception {
        List<CgsCondoReqVo> list = cgsService.selectCondoRegion(cgsVo);    	 
        CgsCondoReqListVo List = new CgsCondoReqListVo();
        List.setCgsCondoListVo(list);
        return List;
    }
    
    @ElService(key = "SvcCCSCGSCNDMR03")
    @RequestMapping(value = "SvcCCSCGSCNDMR03")
    @ElDescription(sub = "콘도명 목록조회", desc = "콘도명 콤보박스 목록을 조회한다.")
    public CgsCondoReqListVo selectCondoNm(CgsCondoReqVo cgsVo) throws Exception {
        List<CgsCondoReqVo> list = cgsService.selectCondoNm(cgsVo);    	 
        CgsCondoReqListVo List = new CgsCondoReqListVo();
        List.setCgsCondoListVo(list);
        return List;
    }

    @ElService(key = "SvcCCSCGSCNDMR04")
    @RequestMapping(value = "SvcCCSCGSCNDMR04")
    @ElDescription(sub = "콘도신청관리 목록조회", desc = "콘도신청관리 목록을 조회한다.")
    public CgsCondoReqListVo selectListCondoReqMnt(CgsCondoReqVo cgsVo) throws Exception {
    	List<CgsCondoReqVo> list = cgsService.selectListCondoReqMnt(cgsVo);    	 
    	CgsCondoReqListVo List = new CgsCondoReqListVo();
    	List.setCgsCondoListVo(list);
    	return List;
    }
    
    @ElService(key = "SvcCCSCGSCNDSU02")
    @RequestMapping(value = "SvcCCSCGSCNDSU02")
    @ElDescription(sub = "콘도신청관리 수정", desc = "콘도신청관리 내용을 수정한다.")
    public void updateCondoReqMnt(CgsCondoReqListVo cgsListVo) throws Exception {
    	cgsService.updateCondoReqMnt(cgsListVo.getCgsCondoListVo());
    }
}
