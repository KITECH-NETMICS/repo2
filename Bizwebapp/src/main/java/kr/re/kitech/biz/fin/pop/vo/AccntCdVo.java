package kr.re.kitech.biz.fin.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "채무반제처리 회계코드 Vo")
public class AccntCdVo extends kr.re.kitech.biz.fin.std.vo.XodfAccntVo {
    private static final long serialVersionUID = 1L;

    public AccntCdVo(){
    }

    @ElDtoField(logicalName = "관리항목명1", physicalName = "mngmt_item_nm_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_nm_1;

    @ElDtoField(logicalName = "관리항목명2", physicalName = "mngmt_item_nm_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_nm_2;

    @ElDtoField(logicalName = "관리항목형식1", physicalName = "data_form_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String data_form_1;

    @ElDtoField(logicalName = "관리항목형식2", physicalName = "data_form_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String data_form_2;

    @ElVoField(physicalName = "mngmt_item_nm_1")
    public String getMngmt_item_nm_1(){
        return mngmt_item_nm_1;
    }

    @ElVoField(physicalName = "mngmt_item_nm_1")
    public void setMngmt_item_nm_1(String mngmt_item_nm_1){
        this.mngmt_item_nm_1 = mngmt_item_nm_1;
    }

    @ElVoField(physicalName = "mngmt_item_nm_2")
    public String getMngmt_item_nm_2(){
        return mngmt_item_nm_2;
    }

    @ElVoField(physicalName = "mngmt_item_nm_2")
    public void setMngmt_item_nm_2(String mngmt_item_nm_2){
        this.mngmt_item_nm_2 = mngmt_item_nm_2;
    }

    @ElVoField(physicalName = "data_form_1")
    public String getData_form_1(){
        return data_form_1;
    }

    @ElVoField(physicalName = "data_form_1")
    public void setData_form_1(String data_form_1){
        this.data_form_1 = data_form_1;
    }

    @ElVoField(physicalName = "data_form_2")
    public String getData_form_2(){
        return data_form_2;
    }

    @ElVoField(physicalName = "data_form_2")
    public void setData_form_2(String data_form_2){
        this.data_form_2 = data_form_2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccntCdVo [");
        sb.append("mngmt_item_nm_1").append("=").append(mngmt_item_nm_1).append(",");
        sb.append("mngmt_item_nm_2").append("=").append(mngmt_item_nm_2).append(",");
        sb.append("data_form_1").append("=").append(data_form_1).append(",");
        sb.append("data_form_2").append("=").append(data_form_2);
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
