package kr.re.kitech.biz.ass.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "자산 공통 조회조건 VO")
public class AssCommSrchVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AssCommSrchVo(){
    }

    @ElDtoField(logicalName = "mngmt_item_1", physicalName = "mngmt_item_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_1;

    @ElVoField(physicalName = "mngmt_item_1")
    public String getMngmt_item_1(){
        return mngmt_item_1;
    }

    @ElVoField(physicalName = "mngmt_item_1")
    public void setMngmt_item_1(String mngmt_item_1){
        this.mngmt_item_1 = mngmt_item_1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AssCommSrchVo [");
        sb.append("mngmt_item_1").append("=").append(mngmt_item_1);
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
