/**
 * 
 */
package kr.re.kitech.biz.xom.core.service;


import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.stereotype.Service;

import kr.re.kitech.biz.xom.core.vo.Fruit;

/**
 * 엑셀파일 공통 서비스 추후 삭제 될 수 있다.
 *
 * @author James
 * @since 2022. 3. 14.
 */
@Service("excelService") 
public class ExcelService {

    /**
     * 엑셀파일로 만들 리스트 생성
     * @param names
     * @param prices
     * @param quantities
     * @return 엑셀파일 리스트
     */
    public List<Fruit> makeFruitList(String[] names, long[] prices, int[] quantities){
        List<Fruit> list = new ArrayList<>();
        for(int i=0; i< names.length; i++) {
            Fruit fruit = new Fruit(names[i], prices[i], quantities[i]);
            list.add(fruit);
        }
        return list;
    }
    
    /**
     * 과일 리스트를 간단한 엑셀 워크북 객체로 생성
     * @param list
     * @return 생성된 워크북
     */
    public SXSSFWorkbook excelFileDownloadProcess(List<Fruit> list) {
        SXSSFWorkbook workbook = new SXSSFWorkbook();
        
        // 시트 생성
        SXSSFSheet sheet = (SXSSFSheet) workbook.createSheet("과일표");
        
        //시트 열 너비 설정
        sheet.setColumnWidth(0, 1500);
        sheet.setColumnWidth(0, 3000);
        sheet.setColumnWidth(0, 3000);
        sheet.setColumnWidth(0, 1500);
        
        //테이블 헤더 스타일 적용
        CellStyle headerStyle = getCellStyleSetting(workbook, "header");
        //테이블 데이터 스타일 적용
        CellStyle bodyStyle = getCellStyleSetting(workbook, "data");
                
        
        // 헤더 행 생
        Row headerRow = sheet.createRow(0);
        // 해당 행의 첫번째 열 셀 생성
        Cell headerCell = headerRow.createCell(0);
        headerCell.setCellValue("번호");
        // 해당 행의 두번째 열 셀 생성
        headerCell = headerRow.createCell(1);
        headerCell.setCellValue("과일이름");
        // 해당 행의 세번째 열 셀 생성
        headerCell = headerRow.createCell(2);
        headerCell.setCellValue("가격");
        // 해당 행의 네번째 열 셀 생성
        headerCell = headerRow.createCell(3);
        headerCell.setCellValue("수량");
        headerCell.setCellStyle(headerStyle);
        
        // 과일표 내용 행 및 셀 생성
        Row bodyRow = null;
        Cell bodyCell = null;
        for(int i=0; i<list.size(); i++) {
            Fruit fruit = list.get(i);
            
            // 행 생성
            bodyRow = sheet.createRow(i+1);
            // 데이터 번호 표시
            bodyCell = bodyRow.createCell(0);
            bodyCell.setCellValue(i + 1);
            // 데이터 이름 표시
            bodyCell = bodyRow.createCell(1);
            bodyCell.setCellValue(fruit.getName());
            // 데이터 가격 표시
            bodyCell = bodyRow.createCell(2);
            bodyCell.setCellValue(fruit.getPrice());
            // 데이터 수량 표시
            bodyCell = bodyRow.createCell(3);
            bodyCell.setCellValue(fruit.getQuantity());
            
            bodyCell.setCellStyle( bodyStyle);
        }
        
        return workbook;
    }

	
	//각 셀의 스타일 세팅
	private CellStyle getCellStyleSetting(SXSSFWorkbook workbook, String kind) {
		//테이블 스타일
        CellStyle cellStyle = workbook.createCellStyle();
        
        //가는 경계선
//        cellStyle.setBorderTop(BorderStyle.THIN);
//        cellStyle.setBorderBottom(BorderStyle.THIN);
//        cellStyle.setBorderLeft(BorderStyle.THIN);
//        cellStyle.setBorderRight(BorderStyle.THIN);

        if(kind.equals("header")) {
        	//배경색 회색
        	cellStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
//        	cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        }
        
        //데이터는 가운데 정렬
//        cellStyle.setAlignment(HorizontalAlignment.CENTER);
//        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER); //중앙 정렬
        
        //폰트 설정
        Font fontOfGothic = workbook.createFont();
        fontOfGothic.setFontName("맑은 고딕");
        cellStyle.setFont(fontOfGothic);

        return cellStyle;
	}
}
