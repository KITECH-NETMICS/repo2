package kr.re.kitech.biz.xom.base.model;

import com.inswave.elfw.page.PageLabelVO;

/**
 *
 */
public class BizPageLabelInfo extends PageLabelVO{
    protected String imgDir = "/BizWebApp/cm/images/zam/el/";

    public BizPageLabelInfo(){
        firstPageLabel = "<a href=\"#\" onclick=\"{0}({1}); return false;\">" +
            "<image src='" + imgDir + "btn_page_pre10.gif' border=0/></a>&#160;";
	    previousPageLabel = "<a href=\"#\" onclick=\"{0}({1}); return false;\">" +
	                    "<image src='" + imgDir + "btn_page_pre1.gif' border=0/></a>&#160;";
	    currentPageLabel = "<strong>{1}</strong>&#160;";
	    otherPageLabel = "<a href=\"#\" onclick=\"{0}({1}); return false;\">{1}</a>&#160;";
	    nextPageLabel = "<a href=\"#\" onclick=\"{0}({1}); return false;\">" +
	                "<image src='" + imgDir + "btn_page_next1.gif' border=0/></a>&#160;";
	    lastPageLabel = "<a href=\"#\" onclick=\"{0}({1}); return false;\">" +
	                "<image src='" + imgDir + "btn_page_next10.gif' border=0/></a>&#160;";
	
	    functionName = "fn_link_page";
    }
}
