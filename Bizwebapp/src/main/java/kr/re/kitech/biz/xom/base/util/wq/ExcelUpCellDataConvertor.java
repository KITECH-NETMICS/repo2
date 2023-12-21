package kr.re.kitech.biz.xom.base.util.wq;

import websquare.http.controller.grid.excel.read.ICellDataProvider;

public class ExcelUpCellDataConvertor implements ICellDataProvider {

	public String convertValue(String cellvalue) throws Exception {
//		System.out.println("cellvalue ==>>" + cellvalue);
		// upload할 data중에서 변경할 부분을 replace한다.
		return cellvalue.replace( "\\", "\\\\"); // 특수문자(\) 업로드 처리
	}
}
