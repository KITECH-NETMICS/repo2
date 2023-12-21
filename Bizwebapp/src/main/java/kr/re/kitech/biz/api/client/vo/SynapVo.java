package kr.re.kitech.biz.api.client.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "Synap 파일 미리보기 Api Vo")
public class SynapVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SynapVo(){
    }

    @ElDtoField(logicalName = "URL", physicalName = "viewUrlPath", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String viewUrlPath;

    @ElVoField(physicalName = "viewUrlPath")
    public String getViewUrlPath(){
        return viewUrlPath;
    }

    @ElVoField(physicalName = "viewUrlPath")
    public void setViewUrlPath(String viewUrlPath){
        this.viewUrlPath = viewUrlPath;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SynapVo [");
        sb.append("viewUrlPath").append("=").append(viewUrlPath);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
    }


    @Override
    public void _xStreamDec() {
    }


}
