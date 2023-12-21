/**
 * 
 */
package kr.re.kitech.biz.xom.core.view;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.servlet.view.AbstractView;

import com.inswave.elfw.ElConstants;
import com.inswave.elfw.core.ElHeader;
import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.xom.base.model.BizUserHeader;

/**
 * 
 * @author James
 * @since 2022. 7. 13.
 */
public class AttachDownloadView extends AbstractView {

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.view.AbstractView#renderMergedOutputModel(java.util.Map, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
		AppLog.debug("========] renderMergedOutputModel.model [=========\n" + model);
		ElHeader elHeader = (ElHeader)model.get(ElConstants.EL_HEADER_STRING);
		BizUserHeader userHeader = (BizUserHeader)model.get(ElConstants.USER_HEADER_STRING);
		
		Map<?,?> elData = (Map<?,?>)model.get(ElConstants.EL_DATA_STRING);

		AppLog.debug("========] elHeader [=========\n" + elHeader);
		AppLog.debug("========] sessions [=========\n" + userHeader.getSession());

        String saveFilename = (String)elData.get("saveFilename");
        String orgFilename = (String)elData.get("orgFilename");
        
		File file = new File( saveFilename);
		AppLog.debug("filename with path = " + saveFilename);
		if (file.exists() && file.isFile()) {	        
	        AppLog.debug("file is exists!");
	        String disposition = this.getDisposition( orgFilename, request.getHeader("User-Agent"));
	        AppLog.debug(disposition);
        	response.setContentType("application/octet-stream; charset=utf-8");
	        // response.setContentType("application/download;charset=utf-8");
			response.setContentLength((int) file.length()); 
	        response.setHeader("Content-Disposition", disposition);
	        response.setHeader("Content-Transfer-Encoding", "binary");
	        
	        try (OutputStream out = response.getOutputStream();
				FileInputStream fis = new FileInputStream(file)) {
				FileCopyUtils.copy(fis, out);
				out.flush();
			}catch (Exception e) {
				AppLog.error("AttachDownloadView.renderMergedOutputModel", e);
			} 
		}
	}
	
	
	/**
	 * 브라우저에 따른 파일 인코딩 작업을 수행한다.
	 *
	 * @param fileName
	 * @param browser
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	private String getDisposition(String fileName, String browser) throws UnsupportedEncodingException{
        // 여기서부터는 각 브라우저에 따른 파일이름 인코딩작업
        if (browser.indexOf("MSIE") > -1) {
            fileName = URLEncoder.encode(fileName, "UTF-8").replaceAll("\\+", "%20");
        } else if (browser.indexOf("Trident") > -1) {       // IE11
            fileName = URLEncoder.encode(fileName, "UTF-8").replaceAll("\\+", "%20");
        } else if (browser.indexOf("Firefox") > -1) {
            fileName = "\"" + new String(fileName.getBytes("UTF-8"), "8859_1") + "\"";
        } else if (browser.indexOf("Opera") > -1) {
            fileName = "\"" + new String(fileName.getBytes("UTF-8"), "8859_1") + "\"";
        } else if (browser.indexOf("Chrome") > -1) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < fileName.length(); i++) {
               char c = fileName.charAt(i);
               if (c > '~') {
                     sb.append(URLEncoder.encode("" + c, "UTF-8"));
                       } else {
                             sb.append(c);
                       }
                }
                fileName = sb.toString();
        } else if (browser.indexOf("Safari") > -1){
        	String encodedFileName = URLEncoder.encode(fileName, "UTF-8").replaceAll("\\+", "%20");
        	return "attachment; filename=" + new String(fileName.getBytes("UTF-8"), "ISO-8859-1") + "; filename*=UTF-8''" + encodedFileName;
        } else {
             fileName = "\"" + new String(fileName.getBytes("UTF-8"), "8859_1")+ "\"";
        }
        return "attachment; filename=\"" + fileName + "\";";
	}
}
