package kr.re.kitech.biz.zam.emp.web;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;
import com.inswave.elfw.core.ElResDataVO;
import com.inswave.elfw.log.AppLog;
import com.inswave.elfw.util.ControllerContextUtil;

import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.model.BizUserHeader;
import kr.re.kitech.biz.xom.base.tcp.BizTcpLengthBaseSendUtil;
import kr.re.kitech.biz.zam.emp.service.EmpFileService;
import kr.re.kitech.biz.zam.emp.service.EmpService;
import kr.re.kitech.biz.zam.emp.vo.DeptListVo;
import kr.re.kitech.biz.zam.emp.vo.EmpListVo;
import kr.re.kitech.biz.zam.emp.vo.EmpVo;


/**  
 * @ClassSubJect 사원정보 관련 처리른 하는 컨트롤러
 * @Class Name : EmpController.java
 * @Description : 사원정보 관련 처리른 하는 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/01/06   샘플작성자                 최초생성
 * 
 * @author 개발팀
 * @since 2022/01/06
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved.
 */

@Controller
public class EmpController {
	
	/** EmpService */
    @Resource(name = "empServiceImpl")
    private EmpService empService;
 
    @Resource(name = "empFileServiceImpl")
    private EmpFileService empFileService;
    
	@Resource(name = "messageSource")
	private MessageSource messageSource;
    
	/**
	 * 사원목록을 조회합니다.
	 * @param empVo 사원정보 EmpVo
	 * @param model 결과정보를 담을 Model
	 * @return 이동할 URL 정보
	 * @throws Exception
	 */
	@ElService(key="DmoEmpList")
    @RequestMapping(value="DmoEmpList")    
    @ElDescription(sub="사원목록조회",desc="페이징을 처리하여 사원목록 조회를 한다.")               
    public EmpListVo selectEmpList(EmpVo empVo) throws Exception {          
        
    	AppLog.debug("사원목록조회 로그 테스트 : " + empVo);            

        List<EmpVo> empList = empService.selectListEmp(empVo);
        long totCnt = empService.selectListCountEmp(empVo);
        
	
		EmpListVo retEmpVoList = new EmpListVo();
		retEmpVoList.setEmpVoList(empList); 
		retEmpVoList.setDeptVoList(empService.selectListDept(new HashMap()));
		retEmpVoList.setTotalCount(totCnt);

        return retEmpVoList;
    } 

    
    /**
     * 사원등록 폼을 위한 조회처리를 합니다.
     * @param empVo 사원정보 EmpVo
     * @param model 결과정보를 담을 Model
     * @return 이동할 URL 정보
     * @throws Exception
     */
    @ElService(key="DmoEmpView")    
    @RequestMapping(value = { "DmoEmpView" })
    @ElDescription(sub="사원등록 폼을 위한 조회",desc="사원등록 폼을 위한 조회 처리를 한다.")  
    public DeptListVo addEmpView(EmpVo empVo) throws Exception {
    	DeptListVo deptListVo = new DeptListVo();
        deptListVo.setDeptVoList(empService.selectListDept(new HashMap()));		
        return deptListVo;
    }    

    /**
     * 사원정보를 등록 처리 한다.
     * @param empVo 사원정보 EmpVo
     * @param model 결과정보를 담을 Model
     * @return 이동할 URL 정보
     * @throws Exception
     */
    @ElService(key="DmoEmpIns")    
    @RequestMapping(value = { "DmoEmpIns" })
    @ElDescription(sub="사원등록처리",desc="사원정보를 등록 처리 한다.")
    @ElValidator(errUrl="")    
    public DeptListVo addEmp(EmpVo empVo) throws Exception {    	
    	DeptListVo deptListVo = new DeptListVo();
    	deptListVo.setDeptVoList(empService.selectListDept(new HashMap()));	     	
    	empService.insertEmp( empVo );   
    	
    	return deptListVo;
    }
        
    /**
     * 사원정보 갱신 폼을 위한 조회를 한다.
     * @param empVo 사원정보 EmpVo
     * @param model 결과정보를 담을 Model
     * @return 이동할 URL 정보
     * @throws Exception
     */
    @ElService(key = "DmoEmpUpdView")    
    @RequestMapping(value = { "DmoEmpUpdView" }) 
    @ElDescription(sub = "사원정보 갱신 폼을 위한 조회", desc = "사원정보 갱신 폼을 위한 조회를 한다.")    
    public EmpListVo updateEmpView(EmpVo empVo) throws Exception {

    	EmpVo selectEmpVo = empService.selectEmp(empVo);    	    
		EmpVo empFileVo = empFileService.selectEmpFile(empVo);
		   	
		if( empFileVo != null ) {   				   	
			selectEmpVo.setFileName(empFileVo.getFileName());
		}		
		  
        EmpListVo retEmpVoList = new EmpListVo();
        retEmpVoList.setEmpVo(selectEmpVo);
        retEmpVoList.setDeptVoList(empService.selectListDept(new HashMap()));
        
		return retEmpVoList;
    } 
    
	/**
	 * 사원정보를 갱신 처리 한다.
	 * @param empVo 사원정보 EmpVo
	 * @param model 결과정보를 담을 Model
	 * @return 이동할 URL 정보
	 * @throws Exception
	 */
	@ElService(key="DmoEmpUpd")    
    @RequestMapping("DmoEmpUpd")    
    @ElValidator(errUrl="")
    @ElDescription(sub="사원목록갱신처리",desc="사원정보를 갱신 처리 한다.")    
    public DeptListVo updateEmp(EmpVo empVo) throws Exception {  
		DeptListVo deptListVo = new DeptListVo();
		deptListVo.setDeptVoList(empService.selectListDept(new HashMap()));		      	
    	empService.updateEmp(empVo);        
    	
    	return deptListVo;                                    
    }


    /**
     * 사원정보를 삭제 처리한다.
     * @param empVo 사원정보 EmpVo
     * @return 이동할 URL 정보
     * @throws Exception
     */
    @ElService(key = "DmoEmpDel")    
    @RequestMapping(value = { "DmoEmpDel" })
    @ElDescription(sub = "사원정보삭제", desc = "사원정보를 삭제 처리한다.")    
    public void deleteEmp(EmpVo empVo) throws Exception {
        empService.deleteEmp(empVo);
    }
   
    /**
     * 사원정보파일을 다운로드한다.
     * @param empVo 사원첨부파일 정보  EmpVo
     * @param response 다운로드 담을 HttpServletResponse
     * @throws Exception
     */
    @ElService(key = "DmoEmpDown")    
    @RequestMapping(value = { "DmoEmpDown" })
    @ElDescription(sub = "파일다운로드", desc = "사원정보파일을 다운로드한다.")    
    public void downEmpFile(EmpVo empVo, HttpServletResponse response) throws Exception {
    	empVo = empFileService.selectEmpFile(empVo);
    	
	    byte[] data = empVo.getFileData();  
	    String fileName = empVo.getFileName();
	    
	    fileName = new String( fileName.getBytes("EUC-KR"), "ISO-8859-1" );
	    
	    response.reset();  
	    response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");  
	    response.addHeader("Content-Length", "" + data.length);  
	    response.setContentType("application/octet-stream;charset=EUC-KR");  
	    OutputStream outputStream = new BufferedOutputStream(response.getOutputStream());  
	    outputStream.write(data);  
	    outputStream.flush();  
	    outputStream.close();
       
    }
    
    /**
     * 파일 업로드를 처리 한다
     * @param request
     * @param empVo
     * @param model
     * @throws Exception
     */
    @ElService(key = "DmoEmpUploadEmpFile")    
    @RequestMapping(value = { "DmoEmpUploadEmpFile" })
    @ElDescription(sub = "파일업로드처리", desc = "파일 업로드를 처리 한다.")
    public void uploadEmpFileToDb(HttpServletRequest request, HttpServletResponse response) throws Exception {  
    	System.out.println("upload2.do start===================");
		 
	 
	    MultipartHttpServletRequest multiPartRequest = (MultipartHttpServletRequest) request;		    
	    Iterator<String> iter = multiPartRequest.getFileNames();
		if(!iter.hasNext()) {
			throw new RuntimeException("파일 업로드 오류!!");
		}
	        
        String uploadFileName = iter.next();
        MultipartFile mfile = (MultipartFile) multiPartRequest.getFile(uploadFileName);
        String content = new String(mfile.getBytes(), StandardCharsets.UTF_8);
        
        // 미사용 노드 제거, ds:Signature 검증이 필요하다면 여기에서 하고 ds:Signature 자체를 remove 하는게 좋음
        JSONObject json = XML.toJSONObject(content);
        json.getJSONObject("TaxInvoice").getJSONObject("ds:Signature").getJSONObject("ds:SignedInfo").getJSONObject("ds:Reference").remove("ds:Transforms");
        AppLog.debug(json.toString(4));
        
        // Double Quotes
        content = new ObjectMapper().writeValueAsString( json.toString());

		StringBuilder builder = new StringBuilder();
		builder.append("<script>window.onload = doInit;function doInit() {");
		builder.append("parent.").append(request.getParameter("callbackFunc"));
		builder.append("(").append(content).append(");}</script>");
		
		HttpServletResponseWrapper wrapper = new HttpServletResponseWrapper(response);
		wrapper.setContentType("text/html;charset=UTF-8");
		wrapper.setHeader("Content-length", "" + builder.toString().getBytes().length);
		
		response.getWriter().print(builder.toString());
    }
    
    
    /**
     * 파일 업로드를 처리 한다
     * @param request
     * @param empVo
     * @param model
     * @throws Exception
     */
    @ElService(key = "DmoEmpUpdateUploadEmpFile")    
    @RequestMapping(value = "DmoEmpUpdateUploadEmpFile")
    @ElDescription(sub = "파일업로드 수정", desc = "파일 업로드를 수정 처리 한다.")
	@ElValidator(errUrl = "")
    public String updateUploadEmpFile(HttpServletRequest request, EmpVo empVo, Model model) throws Exception {  
    	MultipartHttpServletRequest multiPartRequest = (MultipartHttpServletRequest) request;
    	Iterator<String> iter = multiPartRequest.getFileNames();
    	
    	while(iter.hasNext()) {
    		String fileName = iter.next();
    		MultipartFile inputFileData = (MultipartFile) multiPartRequest.getFile(fileName);
    		empVo.setInputFileData(inputFileData);
    		empService.updateEmp(empVo);
    	}
    	
    	model.addAttribute("empVo", empVo);
    	
    	return "/cmmn/upload";
    }
    
    
    //////// TCP 샘플 /////////////////
    
    
    @ElService(key = "DmoEmpSelect")    
    @RequestMapping(value = { "DmoEmpSelect" }) 
    @ElDescription(sub = "사원정보 상세조회 (TCP 내부 테스트용)", desc = "사원정보 상세조회 (TCP 내부 테스트용)를 한다.")    
    public EmpVo selectEmpView(EmpVo empVo) throws Exception {

    	return empService.selectEmp(empVo);
    } 
    
	@ElService(key = "DmoTcpSendTest")    
	@RequestMapping(value = { "DmoTcpSendTest" }) 
	@ElDescription(sub = "TCP 송신 테스트", desc = "TCP 송신 테스트를 한다.")    
	public EmpVo tcpSendTest(EmpVo empVo) throws Exception {

		// TCP 테스트 샘플 
		EmpVo eInVo = new EmpVo();
		eInVo.setEmpno(1111);
		EmpVo eOutVo = new EmpVo();
		BizUserHeader userHeader = new BizUserHeader();
		userHeader.setSvcId("DmoEmpSelect");
		
		ElResDataVO resVo = BizTcpLengthBaseSendUtil.sendFld("localhost", 9999, userHeader, eInVo, eOutVo, 10, false, "EUC-KR");
		EmpVo resEmpVo = (EmpVo) resVo.getVo();
		BizUserHeader resUserHeader =(BizUserHeader) resVo.getUserHeader();
		AppLog.debug("resTcp EmpVo:" + resEmpVo);
		AppLog.debug("resTcp resUserHeader:" + resUserHeader);
			
		return resEmpVo;
		
	}
    
	/**
	 * 사원정보를 저장 한다.
	 * @param empVo 사원정보 EmpVo
	 * @throws Exception
	 */
	@ElService(key = "DmoEmpSave")    
    @RequestMapping(value = "DmoEmpSave")    
    @ElValidator(errUrl = "")
    @ElDescription(sub = "사원정보저장", desc = "사원정보를 저장 한다.")    
    public void saveEmp(EmpVo empVo) throws Exception {  
    	empService.saveEmp(empVo);        
    }

	/**
	 * 사원목록 정보를 저장 한다.
	 * @param empListVo 사원정보 EmpListVo
	 * @throws Exception
	 */
	@ElService(key = "DmoEmpListSave")    
    @RequestMapping(value = "DmoEmpListSave")    
    @ElValidator(errUrl = "")
    @ElDescription(sub = "사원목록저장", desc = "사원목록 정보를 저장 한다.")    
    public void saveEmpList(EmpListVo empListVo) throws Exception {  
    	empService.saveEmpList(empListVo.getEmpVoList());        
    }

	/**
	 * 예외처리 테스트
	 * @throws Exception
	 */
	@ElService(key = "TestBizException")    
    @RequestMapping(value = "TestBizException")    
    @ElValidator(errUrl = "")
    @ElDescription(sub = "예외처리 테스트", desc = "예외처리를 테스트한다.")    
    public void testBizException() throws Exception {
		BizUserHeader header  = (BizUserHeader)ControllerContextUtil.getUserHeader();
		String userid = header.getUserId();
		throw new KitechException(Exceptions.ERROR, Business.RES, "message.xom.fw.valid.notKorean", new String[]{userid, "박정일"});
    }

	/**
	 * 500 오류 테스트
	 * @throws Exception
	 */
	@ElService(key = "TestError")    
    @RequestMapping(value = "TestError")    
    @ElValidator(errUrl = "")
    @ElDescription(sub = "시스템 에러 테스트", desc = "시스템 에러를 테스트한다.")    
    public void testError(HttpServletRequest request) throws Exception {  
//		ElHeader elHeader = (ElHeader)request.getAttribute(ElConstants.EL_HEADER_STRING);
//		String resCode = elHeader.getResCode();
//		String resMsg =  elHeader.getResMsg();
//		
//		String moveUrl = "";
//		String btnText = "";
//		if (null != resCode){
//			if (resCode.startsWith("error.login") || resCode.startsWith("el.error.login")){
//				moveUrl = request.getContextPath() + "/login.xml";
//				btnText = "로그인 페이지";
//			}
//		}
//		AppLog.debug(moveUrl);
//		AppLog.debug(btnText);
//		AppLog.debug(resMsg);
		
    
		int i = 1 / 0;
    }
    
}
