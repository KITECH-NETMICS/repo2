package kr.re.kitech.biz.xom.core.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.xom.core.service.MymenuService;
import kr.re.kitech.biz.xom.core.vo.MymenuListVo;
import kr.re.kitech.biz.xom.core.vo.MymenuVo;


/**  
 * @ClassSubJect 마이메뉴 관련 처리른 하는 컨트롤러
 * @Class Name MymenuController.java
 * @Description 마이메뉴 관련 처리른 하는 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/03/08     박병목             최초생성
 * 
 * @author 박병목
 * @since 2022/03/08
 * @version 1.0
 * @see
 * 
 */

@Controller
public class MymenuController {
	
    /** MymenuService */
    @Resource(name = "mymenuServiceImpl")
    private MymenuService mymenuService;
    
    /**
     * 마이메뉴 목록을 조회합니다.
     * @param mymenuVo 마이메뉴 MymenuVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key="MymenuList")
    @RequestMapping(value="MymenuList")    
    @ElDescription(sub="마이메뉴 목록조회",desc="페이징을 처리하여 마이메뉴 목록 조회를 한다.")               
    public MymenuListVo selectListMymenu(MymenuVo mymenuVo) throws Exception {    	   	

        List<MymenuVo> mymenuList = mymenuService.selectListMymenu(mymenuVo);                  
        long totCnt = mymenuService.selectListCountMymenu(mymenuVo);
	
		MymenuListVo retMymenuList = new MymenuListVo();
		retMymenuList.setMymenuVoList(mymenuList); 
		retMymenuList.setTotalCount(totCnt);

        return retMymenuList;            
    }
    
    /**
     * 마이메뉴 메뉴를 계층형으로 정렬하여 조회한다.
     * @param mymenuVo 마이메뉴 MymenuVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key="MymenuClassList")
    @RequestMapping(value="MymenuClassList")    
    @ElDescription(sub="마이메뉴 목록조회",desc="페이징을 처리하여 마이메뉴 목록 조회를 한다.")               
    public MymenuListVo selectListClassMymenu(MymenuVo mymenuVo) throws Exception {    	   	

        List<MymenuVo> mymenuList = mymenuService.selectListClassMymenu(mymenuVo);                  
	
		MymenuListVo retServices = new MymenuListVo();
		retServices.setMymenuVoList(mymenuList);


        return retServices;
    } 
        
    /**
     * 마이메뉴을 단건 조회 처리 한다.
     * @param mymenuVo 마이메뉴 MymenuVo
     * @return 단건 조회 결과
     * @throws Exception
     */
    @ElService(key = "MymenuUpdView")    
    @RequestMapping(value="MymenuUpdView") 
    @ElDescription(sub = "마이메뉴 갱신 폼을 위한 조회", desc = "마이메뉴 갱신 폼을 위한 조회를 한다.")    
    public MymenuVo selectMymenu(MymenuVo mymenuVo, Model model) throws Exception {
    	MymenuVo selectMymenuVo = mymenuService.selectMymenu(mymenuVo);    	    
		
        return selectMymenuVo;
    } 
 
    /**
     * 마이메뉴를 등록 처리 한다.
     * @param mymenuVo 마이메뉴 MymenuVo
     * @throws Exception
     */
    @ElService(key="MymenuIns")    
    @RequestMapping(value="MymenuIns")
    @ElDescription(sub="마이메뉴 등록처러",desc="마이메뉴를 등록 처리 한다.")
    public void insertMymenu(MymenuVo mymenuVo, Model model) throws Exception {    	 
    	mymenuService.insertMymenu(mymenuVo);   
    }      

    /**
     * 마이메뉴를 삭제 처리한다.
     * @param mymenuVo 마이메뉴 MymenuVo     
     * @throws Exception
     */
    @ElService(key = "MymenuDel")    
    @RequestMapping(value="MymenuDel")
    @ElDescription(sub = "마이메뉴 삭제처리", desc = "마이메뉴를 삭제 처리한다.")    
    public void deleteMymenu(MymenuVo mymenuVo) throws Exception {
        mymenuService.deleteMymenu(mymenuVo);
    }

	/**
	 * 나의메뉴목록 정보를 저장 한다. 
	 * @param mymenuListVo 나의메뉴정보 MymenuListVo
	 * @throws Exception
	 */
	@ElService(key = "MymenuListSaveAstar")    
    @RequestMapping(value = "MymenuListSaveAstar")    
    @ElDescription(sub = "나의메뉴목록저장", desc = "나의메뉴목록 정보를 저장 한다.")
	@ElValidator(errUrl = "")    
    public void saveMyMenuListAstar(MymenuListVo mymenuListVo) throws Exception {  

		// TODO: 공통 Vo 값 갱신 임시로직, 추 후 공통 모듈로 이관 검토 필요.
		mymenuListVo.getMymenuVoList().forEach(menu -> {
			menu.setRegst_syspayno(mymenuListVo.getRegst_syspayno());
			menu.setRegst_daytm(mymenuListVo.getRegst_daytm());
			menu.setUpdt_syspayno(mymenuListVo.getUpdt_syspayno());
			menu.setUpdt_daytm(mymenuListVo.getUpdt_daytm());
		});
    
    	mymenuService.saveMymenuList(mymenuListVo.getMymenuVoList());
    }
    
    	/**
	 * 나의메뉴목록 정보를 저장 한다. 
	 * @param mymenuListVo 나의메뉴정보 MymenuListVo
	 * @throws Exception
	 */
	@ElService(key = "MymenuListSave")    
    @RequestMapping(value = "MymenuListSave")    
    @ElDescription(sub = "나의메뉴목록저장", desc = "나의메뉴목록 정보를 저장 한다.")
	@ElValidator(errUrl = "")    
    public void saveMyMenuList(MymenuListVo mymenuListVo) throws Exception {  
		
		if (mymenuListVo != null) {
			// TODO: 공통 Vo 값 갱신 임시로직, 추 후 공통 모듈로 이관 검토 필요.
			List<MymenuVo> myMenuVoList = mymenuListVo.getMymenuVoList();
			List<MymenuVo> delmyMenuVoList = mymenuListVo.getDelMyMenuVoList();
			
			if (myMenuVoList != null && myMenuVoList.size() > 0) {
				myMenuVoList.forEach(menu -> {
					menu.setRegst_syspayno(mymenuListVo.getRegst_syspayno());
					menu.setRegst_daytm(mymenuListVo.getRegst_daytm());
					menu.setUpdt_syspayno(mymenuListVo.getUpdt_syspayno());
					menu.setUpdt_daytm(mymenuListVo.getUpdt_daytm());
				});
				
				mymenuService.saveMymenuList(myMenuVoList);
			}
			
			if (delmyMenuVoList != null && delmyMenuVoList.size() > 0) {
				delmyMenuVoList.forEach(menu -> {
					menu.setUpdt_syspayno(mymenuListVo.getUpdt_syspayno());
					menu.setUpdt_daytm(mymenuListVo.getUpdt_daytm());
				});
				
				mymenuService.saveMymenuList(delmyMenuVoList);
			}
	    
    	}
    }
   
}
