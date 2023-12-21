package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "대체휴일저장 Vo")
public class CgsSubHoliVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CgsSubHoliVo(){
    }

    @ElDtoField(logicalName = "출장신청번호", physicalName = "ctr_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctr_req_no;

    @ElDtoField(logicalName = "출장자", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "대체휴일", physicalName = "subs_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String subs_date;

    @ElDtoField(logicalName = "휴가원신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElVoField(physicalName = "ctr_req_no")
    public String getCtr_req_no(){
        return ctr_req_no;
    }

    @ElVoField(physicalName = "ctr_req_no")
    public void setCtr_req_no(String ctr_req_no){
        this.ctr_req_no = ctr_req_no;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "subs_date")
    public String getSubs_date(){
        return subs_date;
    }

    @ElVoField(physicalName = "subs_date")
    public void setSubs_date(String subs_date){
        this.subs_date = subs_date;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CgsSubHoliVo [");
        sb.append("ctr_req_no").append("=").append(ctr_req_no).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("subs_date").append("=").append(subs_date).append(",");
        sb.append("req_no").append("=").append(req_no);
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
