package kr.re.kitech.biz.xom.base.util.wq;

import websquare.http.controller.grid.excel.write.IDataXMLProvider;

public class ExcelDownXmlDataConvertor implements IDataXMLProvider {

    @Override
    public String convertXML(String xmlData) throws Exception {
//		System.out.println("xmlData ==>>" + xmlData);
//        String returnData = xmlData.replaceAll( "\u0000", ""); 					
//        returnData = xmlData.replaceAll( "\u0001", ""); 							
//        returnData = xmlData.replaceAll( "\u0002", ""); 							
//        returnData = xmlData.replaceAll( "\u0003", ""); 							
//        return returnData;
    	/*
    	 	0000	null character
    		0001	start of header
    		0002	start of text
    		0003	end of text
    		0009	horizontal tab
    		000A	line feed
    		000D	carriage return
    		0020	SPACE
    	*/
    	// XML 파싱 시 유니코드 문자 포함 오류 해결 
    	return xmlData.replaceAll("[^\\u0009\\u000A\\u000D\\u0020-\\uD7FF\\uE000-\\uFFFD\\u10000-\\u10FFF]+", ""); 	
    }

}
