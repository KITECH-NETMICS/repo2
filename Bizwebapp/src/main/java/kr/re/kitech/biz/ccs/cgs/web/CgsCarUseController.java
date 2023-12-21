
package kr.re.kitech.biz.ccs.cgs.web;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.ccs.cgs.service.CgsCarUseService;
import kr.re.kitech.biz.ccs.cgs.service.CgsCommService;
import kr.re.kitech.biz.ccs.cgs.vo.CgsCarUseListVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgsCarUseVo;


@Controller
public class CgsCarUseController {

 @Resource(name = "cgsCarUseServiceImpl")
 private CgsCarUseService cgsService;
 
 @Resource(name = "cgsCommServiceImpl")
 private CgsCommService cgsCommService;
     
    
 	@ElService(key="SvcCCSCGSCOMR03")
    @RequestMapping(value="SvcCCSCGSCOMR03")    
    @ElDescription(sub="차량목록조회",desc="차량목록조회")               
    public CgsCarUseListVo selectListCar(CgsCarUseVo cgsVo) throws Exception {          
 		
    	 List<CgsCarUseVo> list = cgsService.selectListCar(cgsVo);
    	 
    	 CgsCarUseListVo cgsVoList = new CgsCarUseListVo();
    	 
    	 cgsVoList.setCgsCarUseVoList(list);
    	 
        return cgsVoList;
    } 
    
    @ElService(key="SvcCCSCGSCUSR04")
    @RequestMapping(value="SvcCCSCGSCUSR04")    
    @ElDescription(sub="차량조회",desc="차량조회")               
    public CgsCarUseListVo selectCarAdmin(CgsCarUseVo cgsVo) throws Exception {          
       
    	 CgsCarUseVo vo  = cgsService.selectCarAdmin(cgsVo);
    	 
    	 CgsCarUseListVo cgsVoList = new CgsCarUseListVo();
    	 
    	 cgsVoList.setCgsCarUseVo(vo);
    	 
        return cgsVoList;
    } 
    
    
    
	@ElService(key="SvcCCSCGSCUSR01")
    @RequestMapping(value="SvcCCSCGSCUSR01") 
    @ElDescription(sub="배차목록조회",desc="배차목록조회")               
    public CgsCarUseListVo selectListCgsCarUse(CgsCarUseVo cgsVo) throws Exception {          
				
    	 List<CgsCarUseVo> list = cgsService.selectListCgsCarUse(cgsVo);
    	 
    	 CgsCarUseListVo cgsVoList = new CgsCarUseListVo();
    	 
    	 cgsVoList.setCgsCarUseVoList(list);
    	 
        return cgsVoList;
    }
    
    
    @ElService(key = "SvcCCSCGSCUSC01")    
    @RequestMapping(value = "SvcCCSCGSCUSC01")    
    @ElValidator(errUrl = "")
    @ElDescription(sub = "배자청보저장", desc = "배자청보저장")    
    public void saveCgs(CgsCarUseVo cgsVo) throws Exception {
      
    	String state = cgsVo.getReq_state();
    	String isSend = cgsVo.getIsSend();
    		
      	if(null != state && !"".equals(state)){
      		cgsService.updateCgsCarUse(cgsVo);
      		if (state.equals("CGO004") && (isSend != null && isSend.equals("Y"))) {
      			cgsService.cgsMailSend(cgsVo);
      		}
      	}else{
      		cgsService.insertCgsCarUse(cgsVo);
      	}
      
    	        
    }
    
    @ElService(key = "SvcCCSCGSCUSU01")    
    @RequestMapping(value = "SvcCCSCGSCUSU01")    
    @ElValidator(errUrl = "")
    @ElDescription(sub = "출장확인", desc = "출장확인")    
    public void updatBiz(CgsCarUseVo cgsVo) throws Exception {
      cgsService.updatBiz(cgsVo);
    }
    
    
    @ElService(key = "SvcCCSCGSCUSR02")    
    @RequestMapping(value = { "SvcCCSCGSCUSR02" }) 
    @ElDescription(sub = "배차상세조회", desc = "배차상세조회")    
    public CgsCarUseListVo selectDetailCgsCarUse(CgsCarUseVo cgsVo) throws Exception {
    
    	CgsCarUseVo vo = cgsService.selectDetailCgsCarUse(cgsVo);
    	
    	CgsCarUseListVo cgsVoList = new CgsCarUseListVo();
    	
    	cgsVoList.setCgsCarUseVo(vo);
    
    	return cgsVoList;
    } 
    
    @ElService(key = "SvcCCSCGSCUSD01")    
    @RequestMapping(value="SvcCCSCGSCUSD01")
    @ElDescription(sub = " 배차신청 삭제처리", desc = "배차신청 삭제 처리한다.")    
    public void deleteCgsMRoomReq(CgsCarUseVo cgsVo) throws Exception {
        cgsService.deleteCgsCarUse(cgsVo);
    }
    
    @ElService(key="SvcCCSCGSCUSR05")
    @RequestMapping(value="SvcCCSCGSCUSR05")    
    @ElDescription(sub="차량배차중복신청",desc="차량배차중복신청")               
    public CgsCarUseListVo dupCheckCarUse(CgsCarUseVo cgsVo) throws Exception {          
       
    	 CgsCarUseVo vo  = cgsService.dupCheckCarUse(cgsVo);
    	 
    	 CgsCarUseListVo cgsVoList = new CgsCarUseListVo();
    	 
    	 cgsVoList.setCgsCarUseVo(vo);
    	 
        return cgsVoList;
    } 
    
    @ElService(key="SvcCCSCGSCUSR06")
    @RequestMapping(value="SvcCCSCGSCUSR06")    
    @ElDescription(sub="차량배차중복신청2",desc="차량배차중복신청2")               
    public CgsCarUseListVo dupCheckCarUse2(CgsCarUseVo cgsVo) throws Exception {          
       
    	 CgsCarUseVo vo  = cgsService.dupCheckCarUse2(cgsVo);
    	 
    	 CgsCarUseListVo cgsVoList = new CgsCarUseListVo();
    	 
    	 cgsVoList.setCgsCarUseVo(vo);
    	 
        return cgsVoList;
    } 

}