/**
 * 
 */
package kr.re.kitech.biz.xom.core.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * 
 * @author James
 * @since 2022. 3. 14.
 */
public class ExcelUtil {
    /*
    public static ByteArrayInputStream createListToExcel(List<String> excelHeader, List<Fruit> fruits) {

        try (Workbook workbook = new HSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("excelDownloadTest");
            Row row;
            Cell cell;
            int rowNo = 0;

            int headerSize = excelHeader.size();

            // 테이블 헤더 스타일 설정
            CellStyle headStyle = workbook.createCellStyle();
            // 경계선 설정
            headStyle.setBorderTop(BorderStyle.THIN);
            headStyle.setBorderBottom(BorderStyle.THIN);
            headStyle.setBorderLeft(BorderStyle.THIN);
            headStyle.setBorderRight(BorderStyle.THIN);
            // 색상
            headStyle.setFillForegroundColor(HSSFColor.HSSFColorPredefined.YELLOW.getIndex());
            headStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            // 헤더 가운데 정렬
            headStyle.setAlignment(HorizontalAlignment.CENTER);

            // 헤더 생성
            row = sheet.createRow(rowNo++);
            for (int i=0; i<headerSize; i++) {
                cell = row.createCell(i);
                cell.setCellStyle(headStyle);
                cell.setCellValue(excelHeader.get(i));
                AppLog.debug("HEADER ["+ i +"]: " + cell.toString());
            }

            // 내용 생성
            for (int j=0; j<fruits.size(); j++) {
                Row dataRow = sheet.createRow(j + 1);
                dataRow.createCell(0).setCellValue(fruits.get(j).getName());
                dataRow.createCell(1).setCellValue(fruits.get(j).getPrice());
                dataRow.createCell(2).setCellValue(fruits.get(j).getQuantity());
                AppLog.debug("BODIES ["+ j +"]: " + fruits.get(j));
            }

            // Making size of column auto resize to fit with data
            sheet.autoSizeColumn(0);
            sheet.autoSizeColumn(1);
            sheet.autoSizeColumn(2);

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            workbook.write(outputStream);
            return new ByteArrayInputStream(outputStream.toByteArray());

        } catch (IOException ie) {
        	AppLog.error("ExcelUtil-IOException", ie);
            return null;
        }
    }
    */
    
	/*
	 * 브라우저에 따른 파일명 인코딩
	 */
	public static String getFileName(String originalFileName, HttpServletRequest request) {
		// 파일명 설정
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		String time = simpleDateFormat.format(date);
		String fileName =originalFileName + "_" + time + ".xlsx";
		try {
			// 브라우저 얻기
			String browser = request.getHeader("User-Agent");
		
			// 브라우저에 따른 파일명 인코딩 설정
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
		} catch (UnsupportedEncodingException ue) {
			AppLog.error("ExcelUtil-UnsupportedEncodingException", ue);
			throw new KitechException(Exceptions.ERROR, Business.XOM, "ERR.CORE.MENU.0001" , ue); 
		}

	
		return fileName;
	}
	
	
	/*
	 * 브라우저에 따른 ContentType 얻기
	 */
	public static String getContentType(HttpServletRequest request){
		String browser = request.getHeader("User-Agent");
		String contentType = "application/download;charset=utf-8";
		switch(browser) {
			case "Firefox":
			case "Opera":
				contentType = "application/octet-stream; text/html; charset=UTF-8;";
				break;
			default: // MSIE, Trident, Chrome, ..
				contentType = "application/x-msdownload; text/html; charset=UTF-8;";
				break;
		}
	
		return contentType;
	}

}
