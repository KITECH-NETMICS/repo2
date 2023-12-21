package kr.re.kitech.biz.xom.base.util.wq;

import websquare.http.controller.grid.excel.write.ICellDataProvider;

public class ExcelDownCellDataConvertor implements ICellDataProvider {

    @Override
	public String convertValue(String cellvalue) throws Exception {
//		System.out.println("cellvalue ==>>" + cellvalue);
		// down받은 data중에서 변경할 부분을 replace한다.
		return cellvalue.replace( "&nbsp;", " "); // &nbsp;를 공백으로 치환

	}

}
