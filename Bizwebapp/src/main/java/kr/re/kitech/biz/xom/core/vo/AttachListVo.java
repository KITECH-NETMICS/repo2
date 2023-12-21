package kr.re.kitech.biz.xom.core.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", logicalName = "공통첨부파일테이블")
public class AttachListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    @ElDtoField(logicalName = "공통첨부파일테이블List", physicalName = "attachVoList", type = "kr.re.kitech.biz.xom.core.AttachVo", typeKind = "List", fldYn = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> attachVoList;

    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getAttachVoList(){
        return attachVoList;
    }

    public void setAttachVoList(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> attachVoList){
        this.attachVoList = attachVoList;
    }

    @Override
    public String toString() {
        return "AttachListVo [attachVoList=" + attachVoList+ "]";
    }

    public boolean isFixedLengthVo() {
        return false;
    }

}
