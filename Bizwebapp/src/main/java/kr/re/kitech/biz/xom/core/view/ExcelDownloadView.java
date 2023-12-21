/**
 * 
 */
package kr.re.kitech.biz.xom.core.view;

import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.AbstractView;

import com.inswave.elfw.ElConstants;
import com.inswave.elfw.core.ElHeader;
import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.xom.base.model.BizUserHeader;

/**
 * Excel 다운로드 공통 뷰: excelDownloadView로 컨트롤러에서 매핑시 해당 클래스로 바로 매핑한다.
 * 현재 사용하지 않지만 추가 개발의 소지가 있으므로 추가한다.
 *
 * @author James
 * @since 2022. 3. 14.
 */
public class ExcelDownloadView extends AbstractView {
    
	@Override
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
		AppLog.debug("========] renderMergedOutputModel.model [=========\n" + model);
		ElHeader elHeader = (ElHeader)model.get(ElConstants.EL_HEADER_STRING);
		BizUserHeader userHeader = (BizUserHeader)model.get(ElConstants.USER_HEADER_STRING);
		
		@SuppressWarnings("unchecked")
		Map<String,Object> elData = (Map<String,Object>)model.get(ElConstants.EL_DATA_STRING);
		
		AppLog.debug("========] elHeader [=========\n" + elHeader);
		AppLog.debug("========] sessions [=========\n" + userHeader.getSession());
		
        Locale locale = new Locale(elHeader.getLanguage());
        String workbookName = (String) elData.get("workbookName");
        
        // 겹치는 파일 이름 중복을 피하기 위해 시간을 이용해서 파일 이름에 추
        Date date = new Date();
        SimpleDateFormat dayformat = new SimpleDateFormat("yyyyMMdd", locale);
        SimpleDateFormat hourformat = new SimpleDateFormat("hhmmss", locale);
        String day = dayformat.format(date);
        String hour = hourformat.format(date);
        String fileName = workbookName + "_" + day + "_" + hour + ".xlsx";         
        
        // 여기서부터는 각 브라우저에 따른 파일이름 인코딩작업
        String browser = request.getHeader("User-Agent");
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
            fileName = "\"" + new String(fileName.getBytes("UTF-8"), "8859_1")+ "\"";
        } else {
             fileName = "\"" + new String(fileName.getBytes("UTF-8"), "8859_1")+ "\"";
        }
        
        response.setContentType("application/download;charset=utf-8");
        response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\";");
        response.setHeader("Content-Transfer-Encoding", "binary");
        
        AppLog.debug("Download Excel File Name: " + fileName);

//        try (OutputStream os = response.getOutputStream(); 
//        	SXSSFWorkbook workbook = (SXSSFWorkbook) elData.get("workbook")){
//			// 파일생성
//        	workbook.write(os);
//		}catch (Exception e) {
//			AppLog.error("ExcelDownloadView.renderMergedOutputModel", e);
//			throw e;
//		} 
	}
}
