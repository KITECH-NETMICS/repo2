
package kr.re.kitech.biz.ccs.cgs.web;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.ccs.cgs.service.CgsDormReqService;
import kr.re.kitech.biz.ccs.cgs.vo.CgsDormLisReqtVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgsDormReqVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgsDormVo;


@Controller
public class CgsDormReqController {

	/** CgsMRoomReqService */
    @Resource(name = "cgsDormReqServiceImpl")
    private CgsDormReqService cgsDormReqService;
   
    /**
     * 휴일 조회합니다.
     * @param CgsDormReqVo 휴일조회 CgsDormReqVo
     * @return 조회 결과
     * @throws Exception
     */
    @ElService(key="SvcCCSCGSDOMR00")
    @RequestMapping(value="SvcCCSCGSDOMR00")    
    @ElDescription(sub="휴일조회",desc="휴일조회")               
    public CgsDormLisReqtVo selectHoliyday(CgsDormReqVo cgsDormReqVo) throws Exception {    	   	

        CgsDormReqVo cgsDormReqtVo = cgsDormReqService.selectHoliyday(cgsDormReqVo);                  
        //long totCnt = cgsMRoomReqService.selectListCountCgsMRoomReq(cgsMRoomReqVo);
	
		CgsDormLisReqtVo retCgsDormReqList = new CgsDormLisReqtVo();
		retCgsDormReqList.setCgsDormReqVo(cgsDormReqtVo);
		//retCgsMRoomReqList.setTotalCount(totCnt);

        return retCgsDormReqList;            
    } 
   
    /**
     * 기숙사신청 목록을 조회합니다.
     * @param CgsDormReqVo 기숙사신청 CgsDormReqVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key="SvcCCSCGSDOMR01")
    @RequestMapping(value="SvcCCSCGSDOMR01")    
    @ElDescription(sub="기숙사신청 목록조회",desc="페이징을 처리하여 기숙사신청 목록 조회를 한다.")               
    public CgsDormLisReqtVo selectListCgsDormReq(CgsDormReqVo cgsDormReqVo) throws Exception {    	   	
    	AppLog.debug("syspano"+cgsDormReqVo.getSyspayno());
    	AppLog.debug("syspano"+cgsDormReqVo.getYmd());
        List<CgsDormReqVo> cgsDormLisReqtVo = cgsDormReqService.selectListCgsDormReq(cgsDormReqVo);                  
        //long totCnt = cgsMRoomReqService.selectListCountCgsMRoomReq(cgsMRoomReqVo);
	
		CgsDormLisReqtVo retCgsDormReqList = new CgsDormLisReqtVo();
		retCgsDormReqList.setCgsDormReqVoList(cgsDormLisReqtVo);
		//retCgsMRoomReqList.setTotalCount(totCnt);

        return retCgsDormReqList;            
    }

     /**
     * 지역 기숙사 목록을 조회합니다.
     * @param CgsDormVo 기숙사 CgsDormVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key="SvcCCSCGSDOMR02")
    @RequestMapping(value="SvcCCSCGSDOMR02")    
    @ElDescription(sub="지역 기숙사신청 목록조회",desc="페이징을 처리하여 지역 기숙사 목록 조회를 한다.")               
    public CgsDormLisReqtVo selectListCgsDorm(CgsDormVo cgsDormVo) throws Exception {    	   	

        List<CgsDormVo> cgsDormListVo = cgsDormReqService.selectListCgsDorm(cgsDormVo);                  
        //long totCnt = cgsMRoomReqService.selectListCountCgsMRoomReq(cgsMRoomReqVo);
	
		CgsDormLisReqtVo retCgsDormList = new CgsDormLisReqtVo();
		retCgsDormList.setCgsDormVoList(cgsDormListVo);
		//retCgsMRoomReqList.setTotalCount(totCnt);

        return retCgsDormList;            
    }
    
    /**
     * 기숙사 목록을 조회합니다.
     * @param CgsDormVo 기숙사 CgsDormVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key="SvcCCSCGSDOMR05")
    @RequestMapping(value="SvcCCSCGSDOMR05")    
    @ElDescription(sub="숙사신청 목록조회",desc="페이징을 처리하여 기숙사 목록 조회를 한다.")               
    public CgsDormLisReqtVo selectListCgsDormNo(CgsDormVo cgsDormVo) throws Exception {    	   	

        List<CgsDormVo> cgsDormListVo = cgsDormReqService.selectListCgsDormNo(cgsDormVo);                  
        //long totCnt = cgsMRoomReqService.selectListCountCgsMRoomReq(cgsMRoomReqVo);
	
		CgsDormLisReqtVo retCgsDormList = new CgsDormLisReqtVo();
		retCgsDormList.setCgsDormVoList(cgsDormListVo);
		//retCgsMRoomReqList.setTotalCount(totCnt);

        return retCgsDormList;            
    }
    
    /**
     * 승인날짜 리스트 조회
     * @param CgsDormReqVo 승인날짜 리스트 조회 CgsDormReqVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key="SvcCCSCGSDOMR03")
    @RequestMapping(value="SvcCCSCGSDOMR03")    
    @ElDescription(sub="승인날짜 리스트 조회",desc="승인날짜 리스트 조회")               
    public CgsDormLisReqtVo selectListCgsDormApprovDate(CgsDormReqVo cgsDormReqVo) throws Exception {    	   	

        List<CgsDormReqVo> cgsDormLisReqtVo = cgsDormReqService.selectListCgsDormApprovDate(cgsDormReqVo);                  
        //long totCnt = cgsMRoomReqService.selectListCountCgsMRoomReq(cgsMRoomReqVo);
	
		CgsDormLisReqtVo retCgsDormReqList = new CgsDormLisReqtVo();
		retCgsDormReqList.setCgsDormReqVoList(cgsDormLisReqtVo);
		retCgsDormReqList.setTotalCount(Long.valueOf(cgsDormLisReqtVo.size()));
		//retCgsMRoomReqList.setTotalCount(totCnt);

        return retCgsDormReqList;            
    }
    
     /**
     * 휴일리스트 조회
     * @param CgsDormReqVo  휴일리스트 조회 CgsDormReqVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key="SvcCCSCGSDOMR04")
    @RequestMapping(value="SvcCCSCGSDOMR04")    
    @ElDescription(sub="승인날짜 리스트 조회",desc="승인날짜 리스트 조회")               
    public CgsDormLisReqtVo selectListHoliday(CgsDormReqVo cgsDormReqVo) throws Exception {    	   	

        List<CgsDormReqVo> cgsDormLisReqtVo = cgsDormReqService.selectListHoliday(cgsDormReqVo);                  
        //long totCnt = cgsMRoomReqService.selectListCountCgsMRoomReq(cgsMRoomReqVo);
	
		CgsDormLisReqtVo retCgsDormReqList = new CgsDormLisReqtVo();
		retCgsDormReqList.setCgsDormReqVoList(cgsDormLisReqtVo);
		retCgsDormReqList.setTotalCount(Long.valueOf(cgsDormLisReqtVo.size()));
		//retCgsMRoomReqList.setTotalCount(totCnt);

        return retCgsDormReqList;            
    }  
     
        
     /**
     * 직급리스트조회
     * @param CgsDormReqVo  직급리스트조회 CgsDormReqVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key="SvcCCSCGSDOMR06")
    @RequestMapping(value="SvcCCSCGSDOMR06")    
    @ElDescription(sub="직급리스트조회",desc="직급리스트조회")               
    public CgsDormLisReqtVo selectListPosi(CgsDormReqVo cgsDormReqVo) throws Exception {    	   	
        List<CgsDormReqVo> cgsDormLisReqtVo = cgsDormReqService.selectListPosi();                  
	
		CgsDormLisReqtVo retCgsDormReqList = new CgsDormLisReqtVo();
		retCgsDormReqList.setCgsDormReqVoList(cgsDormLisReqtVo);

        return retCgsDormReqList;            
    } 
    
    /**
     * 기숙사신청
     * @param CgsDormReqVo  기숙사신청 CgsDormReqVo
     * @return 기숙사신청
     * @throws Exception
     */
    @ElService(key="SvcCCSCGSDOMI01")
    @RequestMapping(value="SvcCCSCGSDOMI01")    
    @ElDescription(sub="기숙사신청",desc="기숙사신청")               
    public void insertCgsDorm(CgsDormReqVo cgsDormReqVo) throws Exception {    	   	
        cgsDormReqService.insertCgsDorm(cgsDormReqVo);
        cgsDormReqService.cgsMailSend(cgsDormReqVo);
    } 
     
    /**
     * 기숙사신청 대기
     * @param CgsDormReqVo  기숙사신청 대기 CgsDormReqVo
     * @return 기숙사신청대기
     * @throws Exception
     */
    @ElService(key="SvcCCSCGSDOMI02")
    @RequestMapping(value="SvcCCSCGSDOMI02")    
    @ElDescription(sub="기숙사신청 대기",desc="기숙사신청 대기")               
    public void insertCgsDormStand(CgsDormReqVo cgsDormReqVo) throws Exception {    	   	
        cgsDormReqService.insertCgsDormStand(cgsDormReqVo);
    }
      
        /**
     * 기숙사신청삭제
     * @param CgsDormReqVo  기숙사신청삭제 CgsDormReqVo
     * @return 기숙사신청삭제
     * @throws Exception
     */
    @ElService(key="SvcCCSCGSDOMD01")
    @RequestMapping(value="SvcCCSCGSDOMD01")    
    @ElDescription(sub="기숙사신청삭제",desc="기숙사신청삭제")               
    public void deleteCgsDorm(CgsDormReqVo cgsDormReqVo) throws Exception {
        cgsDormReqService.deleteCgsDorm(cgsDormReqVo); 
    }
    
        /**
     * 기숙사신청
     * @param CgsDormReqVo  기숙사신청 CgsDormReqVo
     * @return 기숙사신청
     * @throws Exception
     */
    @ElService(key="SvcCCSCGSDOMI03")
    @RequestMapping(value="SvcCCSCGSDOMI03")    
    @ElDescription(sub="제주기숙사신청",desc="제주기숙사신청")               
    public void insertCgsDormjj(CgsDormLisReqtVo cgsDormLisReqtVo) throws Exception {    	   	
      List<CgsDormReqVo> cgsDormReqVoList = cgsDormLisReqtVo.getCgsDormReqVoList();
      for(CgsDormReqVo reqVo : cgsDormReqVoList){
    	  cgsDormReqService.insertCgsDorm(reqVo);
      }
    } 
     
    /**
     * 기숙사신청 대기
     * @param CgsDormReqVo  기숙사신청 대기 CgsDormReqVo
     * @return 기숙사신청대기
     * @throws Exception
     */
    @ElService(key="SvcCCSCGSDOMI04")
    @RequestMapping(value="SvcCCSCGSDOMI04")    
    @ElDescription(sub="제주기숙사신청 대기",desc="제주기숙사신청 대기")               
    public void insertCgsDormStandjj(CgsDormLisReqtVo cgsDormLisReqtVo) throws Exception {
    List<CgsDormReqVo> cgsDormReqVoList = cgsDormLisReqtVo.getCgsDormReqVoList();
    	 for(CgsDormReqVo reqVo : cgsDormReqVoList){
    	  cgsDormReqService.insertCgsDormStand(reqVo);
    	}
    }          

}