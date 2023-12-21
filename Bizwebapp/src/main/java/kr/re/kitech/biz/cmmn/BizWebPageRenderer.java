package kr.re.kitech.biz.cmmn;

import com.inswave.elfw.core.CommVO;
import com.inswave.elfw.page.DefaultWebPageRenderer;
import com.inswave.elfw.page.PageLabelVO;

public class BizWebPageRenderer extends DefaultWebPageRenderer{

    public BizWebPageRenderer(PageLabelVO vo) {
        super(vo);
    }

    @Override
    public String getPageRenderer(CommVO vo) {
        return super.getPageRenderer(vo);
    }
}
