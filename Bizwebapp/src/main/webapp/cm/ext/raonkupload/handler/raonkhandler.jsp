<%@ page contentType="text/html;charset=utf-8" pageEncoding="UTF8"
	import="
	  java.io.File
	, java.nio.file.Files
	, java.nio.file.Paths
	, java.util.Map
	, java.util.List
	, java.util.HashMap
	, java.util.ArrayList
	, com.raonwiz.kupload.RAONKHandler
	, com.raonwiz.kupload.event.*
	, com.raonwiz.kupload.util.EventVo
	, com.raonwiz.kupload.util.StaticVariables
	, com.raonwiz.kupload.common.ImageApi
	, com.inswave.elfw.log.AppLog
	, com.inswave.elfw.util.ElBeanUtils
	, com.inswave.elfw.ElConstants
	, com.inswave.elfw.core.UserHeader
	, com.inswave.elfw.util.ControllerContextUtil
	, com.inswave.elfw.core.ControllerInvocationContext
	, kr.re.kitech.biz.xom.base.model.BizUserHeader
	, kr.re.kitech.biz.xom.core.util.KitechContextUtil
	, kr.re.kitech.biz.xom.base.enums.Attaches
	, kr.re.kitech.biz.xom.core.vo.AttachVo
	, kr.re.kitech.biz.xom.core.vo.AttachListVo
	, kr.re.kitech.biz.xom.core.service.AttachService
"%><%!
	
	/**
	 *  2022-03-02, James, 라온Kupload 업로드 핸들러,
	 */
	static final int LEN_ATTACH_FILE_NO = 13;
	static final String URL_DELIMETER = "/";
	
%><%

	// Cross Origin Resource Sharing(CORS) 설정
	response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS");
	response.setHeader("Access-Control-Allow-Headers", "content-type, RAONK-Encoded");
	response.setHeader("Access-Control-Allow-Origin", "*");

	out.clear(); // Servlet으로 handler 작업 시 제거
	request.setCharacterEncoding("UTF-8");
	RAONKHandler upload = new RAONKHandler();

	//디버깅
	//2번째 파라미터의 Log Mode 설명
	//- C : 일반로그 출력(System.out.println 로그 출력)
	//- L : 1. Log4j 모듈에 의한 로그 출력(/handler/JAVA 폴더의 log4j.properties 파일을 WEB-INF/classes에 적용)
	//      2. 기존 설정파일이 존재할 경우 /handler/JAVA 폴더의 log4j.properties 파일 내용 중 "# K Upload Log" 항목을 기존 설정파일에 적용
	//      3. 기존 설정파일의 위치가 WEB-INF/classes/log4j.properties 경로가 아닐 경우 3번째 파라미터에 해당 경로 설정
	//      4. WEB-INF/lib에 log4j-......jar 파일이 존재하지 않을 경우 DebugMode가 false로 설정됨
	// upload.settingVo.setDebugMode(true, "C");
	
	
	//upload.settingVo.setDebugMode(true, "L", "/was85/WebSphere/AppServer/profiles/AppSrv01/installedApps/kwas2Cell01/biz.ear/bizweb.war/extlib/raonkupload/handler/JAVA");
	upload.settingVo.setDebugMode(true, "L");
	
	///////////////////////////////
	//	이벤트를 등록 처리 		 //
	///////////////////////////////
	
	EventClass event = new EventClass();

	/**
	 * 파일을 업로드하기 전에 발생하는 이벤트 입니다.
	 * 파일에 대한 저장 경로를 변경해야 하는 경우 사용합니다.
	 */
	event.addBeforeUploadEventListener(new BeforeUploadEventListener() {
		public void beforeUploadEvent(EventVo eventVo) {

			String fileLocation = eventVo.getNewFileLocation(); //NewFileLocation Value
			String customValue = eventVo.getCustomValue(); //CustomValue
			String fileIndex = eventVo.getFileIndex(); //FileIndex Value - 마지막 파일은 index 뒤에 z가 붙습니다.
			String orgFileName = eventVo.getOriginalFileName(); //Original File Name
			String guid = eventVo.getGuid(); //Guid

			try {
				AppLog.info("======================================] beforeUploadEvent [========================================");
				AppLog.info("1. fileLocation: " + fileLocation);
				AppLog.info("2. customValue: " + customValue);
				AppLog.info("3. fileIndex: " + fileIndex);
				AppLog.info("4. orgFileName: " + orgFileName);
				AppLog.info("5. strGuid: " + guid);
				AppLog.info("======================================] beforeUploadEvent [========================================");

				// 클라이언트에서 AddFormData를 이용하여 추가된 스토리지 종류 (target)
				String[] targets = eventVo.getUpload().getParameterValue("target");
				if (null != targets) {
					AppLog.info("target length: " + targets.length);
					for (String target : targets) {
						AppLog.info("target value: " + target);
						if ("IPMS".equals(target)) {
							fileLocation = fileLocation.replace(Attaches.WHICH_IMIS.getCode(), Attaches.WHICH_IPMS.getCode());
						}
					}
				}
				AttachService attachService = (AttachService)ElBeanUtils.getBean("attachServiceImpl");
				
				// 클라이언트에서 AddFormData를 이용하여 추가된 삭제 대상 (attach_file_no || seq)
				String[] aryRemoveFiles = eventVo.getUpload().getParameterValue("removeFiles");
				if (null != aryRemoveFiles) {
					aryRemoveFiles = aryRemoveFiles[0].split(",");
					AppLog.info("length: " + aryRemoveFiles.length);

					// 삭제 파라미터 생성
					AttachListVo attachListVo = new AttachListVo();
					List<AttachVo> attaches = new ArrayList<>();
					for (String removeFile : aryRemoveFiles) {						
						AttachVo rmAttach = new AttachVo();
						rmAttach.setAttach_file_no( removeFile.substring(0, 13));
						rmAttach.setSeq( removeFile.substring(13, 15));
						rmAttach.setFileKey( removeFile);
						attaches.add( rmAttach);
					}
					attachListVo.setAttachVoList( attaches);
					
					// DB 및 스토리지 삭제
					attachService.deleteAttaches( attachListVo);
				}

				// 클라이언트에서 AddFormData를 이용하여 추가된 첨부파일 번호 (attachFileNo)
				String[] attachFileNos = eventVo.getUpload().getParameterValue("attachFileNo");
				String attachFileNo = (null != attachFileNos && 0 < attachFileNos.length) ? attachFileNos[0] : "";
				// attachFileNo 유효성 체크
				if (("").equals(attachFileNo) && LEN_ATTACH_FILE_NO > attachFileNo.length()) {
					String errCode = "901";
					String errMessage = "첨부파일번호 파라미터가 올바르지 않습니다. 13자리 이상의 attach_file_no 를 설정해야합니다.";
					eventVo.setCustomError( errCode, errMessage);
					throw new Exception( eventVo.getCustomError().getErrorCode() + ": " + eventVo.getCustomError().getErrorMessage());
				}

				// attachFileNo 가 넘어온 경우: 기존 첨부파일이므로 seq 채번 후 저장
				AttachVo attach = new AttachVo();
				attach.setAttach_file_no(attachFileNo);
				
				// DB 에서 최근 순번(SEQ) 조회
				String fileSeq = attachService.selectMaxSeq(attach);
				String saveFileName = attachFileNo + ((null==fileSeq || ("").equals(fileSeq)) ? "01" : fileSeq);

				//Change NewFileLocation Value
				AppLog.info("Change NewFileLocation Value: " + fileLocation.substring(0, fileLocation.lastIndexOf(File.separator) + 1) + saveFileName);
				
				eventVo.setNewFileLocation( fileLocation.substring( 0, fileLocation.lastIndexOf( File.separator) + 1) + saveFileName);
				eventVo.setGuid( saveFileName);

			} catch (Exception ex) {
				AppLog.error("addBeforeUploadEventListener: ", ex);
				String errCode = "902";
				String errMessage = "addBeforeUploadEventListener 오류!";
				eventVo.setCustomError(errCode, errMessage);
			}
		}
	});

	/**
	 * 파일을 업로드한 후에 발생하는 이벤트 입니다.
	 * 업로드된 파일을 변경하는 경우 사용됩니다.(DRM처리, Image API 처리)
	 * 경로가 변경된 경우 Response되는 파일경로도 변경해야 합니다.(ResponseFileServerPath)
	 */
	event.addAfterUploadEventListener(new AfterUploadEventListener() {
		
		/**
		 * ThreadLocal 맵에 세션 데이터 갱신
		 */
		private void refreshThreadLocal(EventVo eventVo) throws Exception {
		    UserHeader userHeader = ControllerContextUtil.getUserHeader();
			BizUserHeader bizUserHeader = null;
			if (userHeader instanceof BizUserHeader) {  // 해당 Context 에 ThreadLocal 이 생성된 경우		
			    bizUserHeader = (BizUserHeader)userHeader ;
			} else {
				HttpSession session = eventVo.getRequest().getSession();
		        Object objUserHeader = session.getAttribute( ElConstants.USER_HEADER_STRING);
		        if (objUserHeader instanceof BizUserHeader) {  // 세션체크
		            bizUserHeader = (BizUserHeader)objUserHeader ;
		            // 강제 ThreadLocal 생성
		            ControllerInvocationContext.setCurrent( new ControllerInvocationContext());
		            ControllerContextUtil.setUserHeader(bizUserHeader);
		        }
		    }
		}
			
		public void afterUploadEvent(EventVo eventVo) {

			HttpServletRequest request = eventVo.getRequest(); //Request Value
			HttpServletResponse response = eventVo.getResponse(); //Response Value
			String newFileLocation = eventVo.getNewFileLocation(); //NewFileLocation Value
			String responseFileServerPath = eventVo.getResponseFileServerPath(); //ResponseFileServerPath Value
			String customValue = eventVo.getCustomValue(); //CustomValue
			String fileIndex = eventVo.getFileIndex(); //FileIndex Value - 마지막 파일은 index 뒤에 z가 붙습니다.
			String originalFileName = eventVo.getOriginalFileName(); //Original File Name
			String guid = eventVo.getGuid(); //Guid

			try {
				// 실제 저장된 파일 관련 데이터 추출
				String fileSize = Double.toString(Math.round(new File(newFileLocation).length() / 1024. * 100) / 100.) + " KB"; // 파일 사이즈
				String fileName = originalFileName.substring(0, originalFileName.lastIndexOf(".")); // 실제 저장된 파일의 확장자 제거된 파일명
				String fileExtension = originalFileName.substring(originalFileName.lastIndexOf(".") + 1); // 실제 저장된 파일의 확장자

				// Debugging
				AppLog.info("======================================] afterUploadEvent [=========================================");
				AppLog.info("1. newFileLocation: " + newFileLocation);
				AppLog.info("2. responseFileServerPath(파일 저장 경로): " + responseFileServerPath);
				AppLog.info("3. customValue: " + customValue);
				AppLog.info("4. fileIndex: " + fileIndex);
				AppLog.info("5. originalFileName(원본 파일명): " + originalFileName);
				AppLog.info("6. guid: " + guid);
				AppLog.info("7. fileName: " + fileName);
				AppLog.info("8. fileExtension: " + fileExtension);
				AppLog.info("9. fileSize: " + fileSize);
				AppLog.info("======================================] afterUploadEvent [=========================================");
				AppLog.info("BIZ_STORAGE_ROOT: " + Attaches.BIZ_STORAGE_ROOT.getCode());
				AppLog.info("PAT_STORAGE_ROOT: " + Attaches.PAT_STORAGE_ROOT.getCode());
				
				// DB 첨부파일공통 테이블 저장 수행
				AttachVo attach = new AttachVo();
				newFileLocation = newFileLocation.replaceAll(Attaches.BIZ_STORAGE_ROOT.getCode() + "/", "");
				newFileLocation = newFileLocation.replaceAll(Attaches.PAT_STORAGE_ROOT.getCode() + "/", "");
				attach.setPath( newFileLocation.substring(0, newFileLocation.lastIndexOf("/") + 1));
				
				newFileLocation = newFileLocation.substring(newFileLocation.lastIndexOf("/") + 1);
				attach.setAttach_file_no( newFileLocation.substring(0, newFileLocation.length() - 2));
				attach.setSeq( newFileLocation.substring(newFileLocation.length() - 2));
				attach.setFile_nm( fileName);
				attach.setExtens_nm( fileExtension);
				attach.setFile_size( fileSize);
				// 실행 컨텍스트에 TheadLocal 변수가 없는 경우 채워준다.
				this.refreshThreadLocal( eventVo);
				attach.setRegst_syspayno( KitechContextUtil.getSyspayno());
				
				AttachService attachService = (AttachService)ElBeanUtils.getBean("attachServiceImpl");
				attachService.insertAttach(attach);

				// Set ResponseCustomValue
				eventVo.setResponseCustomValue( attach.getAttach_file_no());
			} catch (Exception ex) {
				AppLog.error("addAfterUploadEventListener: ", ex);
				String errCode = "903";
				String errMessage = "addAfterUploadEventListener 오류!";
				eventVo.setCustomError(errCode, errMessage);
			}
		}
	});

	/**
	 * 파일을 다운로드하기 전에 발생하는 이벤트 입니다.
	 * 파일에 대한 다운로드 경로를 변경하거나 서버에서 구해지는 Stream 다운로드로 처리할 경우 사용합니다.
	 */
	event.addBeforeDownloadEventListener(new BeforeDownloadEventListener() {
		public void beforeDownloadEvent(EventVo eventVo) {

			HttpServletRequest request = eventVo.getRequest(); // Request Value
			HttpServletResponse response = eventVo.getResponse(); // Response Value
			String[] aryDownloadFilePath = eventVo.getDownloadFilePath(); // DownloadFilePath Value
			String[] aryDownloadCustomValue = eventVo.getDownloadCustomValue(); // DownloadCustomValue

			AppLog.info("======================================] BeforeDownloadEvent [=========================================");
			if (null != aryDownloadFilePath) {
				AppLog.info("target length: " + aryDownloadFilePath.length);
				for (String downloadFilePath : aryDownloadFilePath) {
					AppLog.info("downloadFilePath: " + downloadFilePath);
				}
			}

			String which = "";
			if (null != aryDownloadCustomValue) {
				AppLog.info("target length: " + aryDownloadCustomValue.length);
				for (String downloadCustomValue : aryDownloadCustomValue) {
					which = downloadCustomValue;
				}
			}

			for (int i = 0; i < aryDownloadFilePath.length; i++) {
				if (Attaches.WHICH_IPMS.getCode().equals(which)) {

					// 방어로직: IPMS 영역 우선 확인
					boolean isExists = Files.exists(Paths.get(Attaches.PAT_STORAGE_ROOT.getCode() + aryDownloadFilePath[i]));
					AppLog.info("방어로직 IPMS 존재여부: " + isExists);
					if (isExists) {
						aryDownloadFilePath[i] = Attaches.PAT_STORAGE_ROOT.getCode() + aryDownloadFilePath[i];
					} else {
						aryDownloadFilePath[i] = Attaches.BIZ_STORAGE_ROOT.getCode() + aryDownloadFilePath[i];
					}
				} else {

					// 방어로직: IMIS 영역 우선 확인
					boolean isExists = Files.exists(Paths.get(Attaches.BIZ_STORAGE_ROOT.getCode() + aryDownloadFilePath[i]));
					AppLog.info("방어로직 IMIS 존재여부: " + isExists);
					if (isExists) {
						aryDownloadFilePath[i] = Attaches.BIZ_STORAGE_ROOT.getCode() + aryDownloadFilePath[i];
					} else {
						aryDownloadFilePath[i] = Attaches.PAT_STORAGE_ROOT.getCode() + aryDownloadFilePath[i];
					}
				}
			}
			
			

			// Change DownloadFilePath Value
			eventVo.setDownloadFilePath(aryDownloadFilePath);
		}
	});

	/**
	 * 파일을 다운로드한 후에 발생하는 이벤트 입니다.
	 * 다운로드 받을 파일에 대한 정보를 얻은 후 해당 정보에 대하여 로그출력을 하려는 경우 사용합니다.
	 */
	event.addAfterDownloadEventListener(new AfterDownloadEventListener() {
		public void afterDownloadEvent(EventVo eventVo) {

			//HttpServletRequest request = eventVo.getRequest(); //Request Value
			//HttpServletResponse response = eventVo.getResponse(); //Response Value
			//String[] aryDownloadFilePath = eventVo.getDownloadFilePath(); //DownloadFilePath Value
			//String[] aryDownloadCustomValue = eventVo.getDownloadCustomValue();  //DownloadCustomValue

			//////////////////////////////////////////////////////////////////////////////////
			//Stream 다운로드 처리 시 특정 위치에 써진 파일을 다음과 같이 제거하시면 됩니다.//
			//////////////////////////////////////////////////////////////////////////////////
			//예)
			// String[] aryDownloadFilePath = eventVo.getDownloadFilePath();
			// int iDownloadFilePathLength = aryDownloadFilePath.length;
			// for (int i = 0; i < iDownloadFilePathLength; i++) {
			//     new java.io.File(aryDownloadFilePath[i]).delete();
			// }
			//////////////////////////////////////////////////////////////////////////////////
		}
	});

	///////////////////////////////
	//         서버모듈 설정              //
	///////////////////////////////

	//실제 업로드 할 기본경로 설정 (가상경로와 물리적 경로로 설정 가능)
	//폴더명 제일 뒤에 .과 공백이 있다면 제거하시고 설정해 주세요.(운영체제에서 지원되지 않는 문자열입니다.)

	try {

		//-------------------- [설정방법1] 물리적경로(절대경로) 설정 시작 --------------------//
		upload.settingVo.setPhysicalPath(Attaches.BIZ_STORAGE_ROOT.getCode());
		//upload.settingVo.setDownloadRootPath(File.separator);	// 다운로드 기본 폴더 지정 
		AppLog.info("getPhysicalPath: " + upload.settingVo.getPhysicalPath());
		AppLog.info("getDownloadRootPath: " + upload.settingVo.getDownloadRootPath());
		AppLog.info("===============================================================");

		//임시파일 물리적 경로설정 ( setPhysicalPath에 설정된 경로 + raonktemp )
		upload.settingVo.setTempPath(upload.settingVo.getPhysicalPath() + File.separator + "raonktemp");
		
		String[] arrAllowDirectoryPath = { 
			  Attaches.BIZ_STORAGE_ROOT.getCode()
			, Attaches.PAT_STORAGE_ROOT.getCode()
 			, Attaches.DEV_STORAGE_ROOT.getCode()
 			, Attaches.BIZ_STORAGE_ROOT_01.getCode()
 			, Attaches.BIZ_STORAGE_ROOT_02.getCode()
 			, Attaches.BIZ_STORAGE_ROOT_03.getCode()
 			, Attaches.BIZ_STORAGE_ROOT_04.getCode()
 			, Attaches.BIZ_STORAGE_ROOT_05.getCode()
 			, Attaches.BIZ_STORAGE_ROOT_PDF_01.getCode()
 			, Attaches.BIZ_STORAGE_ROOT_PDF_02.getCode()
 			, Attaches.BIZ_STORAGE_ROOT_PDF_03.getCode()
 			, Attaches.BIZ_STORAGE_ROOT_PDF_04.getCode()
 			, Attaches.BIZ_STORAGE_ROOT_PDF_05.getCode()
		};
		
		// **************** 보안 설정 : 업로드 가능한 경로 설정 - 이외의 경로로 업로드 불가능 *****************
		upload.settingVo.setAllowUploadDirectoryPath(arrAllowDirectoryPath);

		// ************** 보안 설정 : 다운로드 가능한 경로 설정 - 이외의 경로에서 다운로드 불가능 **************
		// context.Request.MapPath("/") 값은 샘플 동작을 위한 설정으로 실제 적용 시 제외하시면 됩니다.
		upload.settingVo.setAllowDownloadDirectoryPath(arrAllowDirectoryPath);

		//위에 설정된 임시파일 물리적 경로에 불필요한 파일을 삭제 처리하는 설정 (단위: 일)
		upload.settingVo.setGarbageCleanDay(2);
	
		//환경설정파일 물리적 폴더 (서버 환경설정 파일을 사용할 경우)
		String strRootFolder = request.getServletPath();
		strRootFolder = strRootFolder.substring(0, strRootFolder.lastIndexOf(URL_DELIMETER));
		strRootFolder = request.getSession().getServletContext().getRealPath(strRootFolder.substring(0, strRootFolder.lastIndexOf(URL_DELIMETER)));
		upload.settingVo.setConfigPhysicalPath(strRootFolder + File.separator + "config");
		AppLog.info("getConfigPhysicalPath: " + upload.settingVo.getConfigPhysicalPath());

		//서버 구성정보중 Context Path가 있다면, 아래와 같이 설정해주세요. (SetVirtualPath 사용시만 필요)
		//upload.settingVo.setContextPath("Context Path");

		//***************보안 설정 : 업로드 제한 확장자 설정***************
		//적용에 필요 없는 확장자는 제외하시면 됩니다.
		//setUploadCheckFileExtension 1번째 Parameter : 0-제한,1-허용 , 2번째 Parameter : 확장자 리스트 Array Type
		String[] arrUploadCheckFileExtension = { "exe", "bat", "sh", "jsp", "php", "hwpx"};
		upload.settingVo.setUploadCheckFileExtension(0, arrUploadCheckFileExtension);

		// 업로드 진행
		String result = upload.Process(request, response, application, event);
		
		if (!result.equals("")) {
			out.print(result);
		}
	} catch (Exception ex) {
		AppLog.error("main: ", ex);
		throw ex;
	}

	// Servlet으로 handler 작업을 하시려면 다음과 같이 작성해 주세요.
	// Servlet으로 구성하실 때 해당 Function의 Return Type은 void로 선언 후 return 되는 값은 반드시 없어야합니다.

/*
	// 만일 getServletContext()가 undefined 이면 request.getSession().getServletContext(); 으로 하시면 됩니다.
	ServletContext application = getServletContext();
	
	String result = "";
	try {
		result = upload.Process(request, response, application, event);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	if(!result.equals("")) {
		response.setContentType("text/html");
		ServletOutputStream out = response.getOutputStream();
		out.print(result);
		out.close();
	}
*/
%>