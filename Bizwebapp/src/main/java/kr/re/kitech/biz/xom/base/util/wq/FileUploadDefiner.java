package kr.re.kitech.biz.xom.base.util.wq;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import websquare.http.MultiPartHttpServletRequest;
import websquare.http.WebSquareContext;
import websquare.upload.handl.AbstractUploadFileDefiner;

public class FileUploadDefiner extends AbstractUploadFileDefiner {

	/**
	 * @param <String:Y> clientFileName : 클라이언트에서 선택한 파일명
	 * @param <String:Y> originalFileName : 물리적으로 저장될 파일명
	 * @desc 파일명을 변경한다.
	 */

	@Override
	public String getFileName(String clientFileName, String originalFileName) throws Exception {
		return UUID.randomUUID().toString();
	}

	/**
	 * @param <String:Y> filePath : 물리적으로 저장될 파일 경로
	 * @desc 파일 저장 경로를 변경한다.
	 */

	@Override
	public String getFilePath(String filePath) throws Exception {
		// 파일업로드는 WAS의 공유볼륨에 저장된다. 파일 저장위치는 {websquare_home}/config/websquare.xml의 baseDir에 위치한다.)
		// 업로드컴퍼넌트의 useDir 파라메타가 있을때 baseDir 하위에 폴더를 생성하고 저장한다.
		HttpServletRequest request = WebSquareContext.getContext().getRequest();
		MultiPartHttpServletRequest multiPartRequest = (MultiPartHttpServletRequest) request;

		Map parmeterMap = multiPartRequest.getMultipartParameters();

		String[] subDir = (String[]) parmeterMap.get("subDir");
		// filePath : C:/inswaveTool/upload/bizwebapp/file/temp 
		// _filePath : C:/inswaveTool/upload/bizwebapp/file/subDir/yyyyMM 
		String _filePath = filePath.substring(0, filePath.lastIndexOf(File.separator));
		StringBuffer rt = new StringBuffer(_filePath);
		if (subDir != null) {
			int iCnt = subDir.length;
			for (int idx = 0; idx < iCnt; idx++) {
				if (idx == 0)
					rt.append(File.separator);
				rt.append(subDir[idx]);
			}
		}
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMM");
		String date = simpleDateFormat.format(new Date());
		rt.append(File.separator);
		rt.append(date);
		
		System.out.println("filePath : [" + _filePath + "]");
		System.out.println("rt.toString() : [" + rt.toString() + "]");

		return rt.toString();
	}
}
