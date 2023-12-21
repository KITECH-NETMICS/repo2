package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "출장정산 GPS Vo")
public class CtrTripGpsVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CtrTripGpsVo(){
    }

    @ElDtoField(logicalName = "성명", physicalName = "user_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_nm;

    @ElDtoField(logicalName = "부서명", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "인증아이디", physicalName = "emplyr_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String emplyr_id;

    @ElDtoField(logicalName = "인증지역", physicalName = "addr_kr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr_kr;

    @ElDtoField(logicalName = "인증시각", physicalName = "input_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String input_date;

    @ElVoField(physicalName = "user_nm")
    public String getUser_nm(){
        return user_nm;
    }

    @ElVoField(physicalName = "user_nm")
    public void setUser_nm(String user_nm){
        this.user_nm = user_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "emplyr_id")
    public String getEmplyr_id(){
        return emplyr_id;
    }

    @ElVoField(physicalName = "emplyr_id")
    public void setEmplyr_id(String emplyr_id){
        this.emplyr_id = emplyr_id;
    }

    @ElVoField(physicalName = "addr_kr")
    public String getAddr_kr(){
        return addr_kr;
    }

    @ElVoField(physicalName = "addr_kr")
    public void setAddr_kr(String addr_kr){
        this.addr_kr = addr_kr;
    }

    @ElVoField(physicalName = "input_date")
    public String getInput_date(){
        return input_date;
    }

    @ElVoField(physicalName = "input_date")
    public void setInput_date(String input_date){
        this.input_date = input_date;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrTripGpsVo [");
        sb.append("user_nm").append("=").append(user_nm).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("emplyr_id").append("=").append(emplyr_id).append(",");
        sb.append("addr_kr").append("=").append(addr_kr).append(",");
        sb.append("input_date").append("=").append(input_date);
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
