package kr.re.kitech.biz.xom.base.util.wq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

import websquare.http.controller.grid.excel.write.IExternalGridDataProvider;

public class ExcelHeadDown implements IExternalGridDataProvider {
	protected Logger log = LoggerFactory.getLogger(this.getClass());

	public String[] getData(Document reqObj) throws Exception {

		String[] returnData = { "" };
		return returnData;
	}

}
