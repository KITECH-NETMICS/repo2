package kr.re.kitech.biz.xom.core.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;

import com.inswave.elfw.ElConstants;
import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;
import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.api.client.SynapClient;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.service.AttachService;
import kr.re.kitech.biz.xom.core.view.AttachDownloadView;
import kr.re.kitech.biz.xom.core.vo.AttachListVo;
import kr.re.kitech.biz.xom.core.vo.AttachVo;


/**  
 * @ClassSubJect 공통첨부파일테이블 관련 처리른 하는 컨트롤러
 * @Class Name AttachController.java
 * @Description 공통첨부파일테이블 관련 처리른 하는 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/03/18     박정일             최초생성
 * 
 * @author 박정일
 * @since 2022/03/18
 * @version 1.0
 * @see
 * 
 */

@Controller
public class AttachController {
	
    /** AttachService */
    @Resource(name = "attachServiceImpl")
    private AttachService attachService;
	
	@Resource(name="synapPreviewClient")
	private SynapClient synapPreviewClient;
	
    
    /**
     * 공통첨부파일테이블 목록을 조회합니다.
     * @param attachVo 공통첨부파일테이블 AttachVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcAttachList")
    @RequestMapping(value = "SvcAttachList")    
    @ElDescription(sub = "공통첨부파일테이블 목록조회", desc = "페이징을 처리하여 공통첨부파일테이블 목록 조회를 한다.")
	@ElValidator(errUrl = "")               
    public AttachListVo selectListAttach(AttachVo attachVo) throws Exception {    
        List<AttachVo> attachList = attachService.selectListAttach(attachVo.getAttach_file_no());                  
		AttachListVo retAttachList = new AttachListVo();
		retAttachList.setAttachVoList(attachList); 

        return retAttachList;            
    }  
        
    /**
     * 공통첨부파일테이블을 단건 조회 처리 한다.
     * @param attachVo 공통첨부파일테이블 AttachVo
     * @return 단건 조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcAttachUpdView")    
    @RequestMapping(value = "SvcAttachUpdView") 
    @ElDescription(sub = "공통첨부파일테이블 갱신 폼을 위한 조회", desc = "공통첨부파일테이블 갱신 폼을 위한 조회를 한다.")
	@ElValidator(errUrl = "")    
    public AttachVo selectAttach(AttachVo attachVo, Model model) throws Exception {
    	AttachVo selectAttachVo = attachService.selectAttach(attachVo);    	    
		
        return selectAttachVo;
    } 
 
    /**
     * 공통첨부파일테이블를 등록 처리 한다.
     * @param attachVo 공통첨부파일테이블 AttachVo
     * @throws Exception
     */
    @ElService(key = "SvcAttachIns")    
    @RequestMapping(value = "SvcAttachIns")
    @ElDescription(sub = "공통첨부파일테이블 등록처러", desc = "공통첨부파일테이블를 등록 처리 한다.")
	@ElValidator(errUrl = "")
    public void insertAttach(AttachVo attachVo, Model model) throws Exception {    	 
    	attachService.insertAttach(attachVo);   
    }
       
    /**
     * 공통첨부파일테이블를 갱신 처리 한다.
     * @param attachVo 공통첨부파일테이블 AttachVo
     * @throws Exception
     */
    @ElService(key = "SvcAttachUpd")    
    @RequestMapping(value = "SvcAttachUpd")    
    @ElValidator(errUrl = "/attach/attachRegister", errContinue = true)
    @ElDescription(sub = "공통첨부파일테이블 갱신처러", desc = "공통첨부파일테이블를 갱신 처리 한다.")    
    public void updateAttach(AttachVo attachVo , Model model) throws Exception {  
 
    	attachService.updateAttach(attachVo);                                            
    }


    /**
     * 공통첨부파일테이블를 삭제 처리한다.
     * @param attachVo 공통첨부파일테이블 AttachVo     
     * @throws Exception
     */
    @ElService(key = "SvcAttachDel")    
    @RequestMapping(value = "SvcAttachDel")
    @ElDescription(sub = "공통첨부파일테이블 삭제처리", desc = "공통첨부파일테이블를 삭제 처리한다.")
	@ElValidator(errUrl = "")    
    public void deleteAttach(AttachListVo attachListVo) throws Exception {
        attachService.deleteAttaches(attachListVo);
    }
    
    /**
     * 공통첨부파일을 다운로드 한다.
	 *
     * @param attachVo 공통첨부파일테이블 AttachVo     
     * @throws Exception
     */
    @ElService(key = "SvcAttachDown")    
    @RequestMapping(value = "SvcAttachDown")
    @ElDescription(sub = "공통첨부파일테이블 데이터를 다운로드한다.", desc = "공통첨부파일테이블 데이터를 다운로드한다.")
	@ElValidator(errUrl = "")    
    public View downloadAttach(HttpServletRequest request, Model model) throws Exception {
    	try {
			String fileName = request.getParameter("fileName");
			String orgName = request.getParameter("orgFileName");
			String bizKind = Business.getName(request.getParameter("bizKind"));
		
	    	AttachVo attach = attachService.getRealAttach(fileName, orgName, Business.valueOf(bizKind), request);
	    	if (orgName != null && !orgName.equals("")) {
	    		attach.setAttachFullPath(orgName);
	    	}
	    	
	        Map<String,Object> elData = new HashMap<>();
	        elData.put("saveFilename", attach.getAttachFullPath());
	        AppLog.debug("--------------------------------------------"+attach.getOrgFile());
	        elData.put("orgFilename", attach.getOrgFile());
	        
	        model.addAttribute(ElConstants.EL_DATA_STRING, elData);
        } catch (NoSuchElementException enumException) {
        	throw new KitechException(Exceptions.ERROR, Business.XOM, "파라미터 오류 3: 업무 구분 코드가 올바르지 않습니다.");
        }
        return new AttachDownloadView();
    }
    
         /**
     * 모바일에서 첨부파일을 업로드 한다.
	*
     * @param attachVo 공통첨부파일테이블 AttachVo     
     * @throws Exception
     */
    @ElService(key = "SvcMbiAttachUpload")    
    @RequestMapping(value = "SvcMbiAttachUpload")
    @ElDescription(sub = "모바일에서 첨부파일을 업로드 한다.", desc = "모바일에서 첨부파일을 업로드 한다.")
    @ElValidator(errUrl = "")    
    public void uploadMobileAttach(HttpServletRequest request, Model model, AttachListVo vo) throws Exception {
    	if (vo != null && null != vo.getAttachVoList()) {
	    	for (AttachVo v : vo.getAttachVoList()) {
	    		if (v.getEtc().equals("N") || v.getEtc().equals("D")) {
	    			AppLog.debug(v.toString());
	    			attachService.saveMobileAttachFile(v);
	    		}
	    	}
    	}
//        attachService.selectMaxSeq();
    }
    
    @ElService(key="SvcPreviewAttach")
    @RequestMapping(value="SvcPreviewAttach")    
    @ElDescription(sub="첨부파일 다운로드", desc="첨부파일 다운로드")
    public AttachVo previewAttachFile(AttachVo attachVo) throws Exception {  
    	AttachVo retVo = new AttachVo();
    	retVo.setAttachFullPath(synapPreviewClient.execute(attachVo));
    	
    	return retVo;
    }
    
}
