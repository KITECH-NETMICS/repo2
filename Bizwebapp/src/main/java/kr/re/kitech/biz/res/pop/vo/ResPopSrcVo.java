package kr.re.kitech.biz.res.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "연구팝업 조회조건 Vo")
public class ResPopSrcVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResPopSrcVo(){
    }

    @ElDtoField(logicalName = "신청일자(시작)", physicalName = "from_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String from_ymd;

    @ElDtoField(logicalName = "신청일자(종료)", physicalName = "to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String to_ymd;

    @ElDtoField(logicalName = "지역본부", physicalName = "dept_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_typ;

    @ElDtoField(logicalName = "세부사업", physicalName = "bsns_nm_detls_bsns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_nm_detls_bsns;

    @ElDtoField(logicalName = "사업명", physicalName = "bsns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_nm;

    @ElDtoField(logicalName = "연구책임자", physicalName = "resch_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_rspns;

    @ElVoField(physicalName = "from_ymd")
    public String getFrom_ymd(){
        return from_ymd;
    }

    @ElVoField(physicalName = "from_ymd")
    public void setFrom_ymd(String from_ymd){
        this.from_ymd = from_ymd;
    }

    @ElVoField(physicalName = "to_ymd")
    public String getTo_ymd(){
        return to_ymd;
    }

    @ElVoField(physicalName = "to_ymd")
    public void setTo_ymd(String to_ymd){
        this.to_ymd = to_ymd;
    }

    @ElVoField(physicalName = "dept_typ")
    public String getDept_typ(){
        return dept_typ;
    }

    @ElVoField(physicalName = "dept_typ")
    public void setDept_typ(String dept_typ){
        this.dept_typ = dept_typ;
    }

    @ElVoField(physicalName = "bsns_nm_detls_bsns")
    public String getBsns_nm_detls_bsns(){
        return bsns_nm_detls_bsns;
    }

    @ElVoField(physicalName = "bsns_nm_detls_bsns")
    public void setBsns_nm_detls_bsns(String bsns_nm_detls_bsns){
        this.bsns_nm_detls_bsns = bsns_nm_detls_bsns;
    }

    @ElVoField(physicalName = "bsns_nm")
    public String getBsns_nm(){
        return bsns_nm;
    }

    @ElVoField(physicalName = "bsns_nm")
    public void setBsns_nm(String bsns_nm){
        this.bsns_nm = bsns_nm;
    }

    @ElVoField(physicalName = "resch_rspns")
    public String getResch_rspns(){
        return resch_rspns;
    }

    @ElVoField(physicalName = "resch_rspns")
    public void setResch_rspns(String resch_rspns){
        this.resch_rspns = resch_rspns;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResPopSrcVo [");
        sb.append("from_ymd").append("=").append(from_ymd).append(",");
        sb.append("to_ymd").append("=").append(to_ymd).append(",");
        sb.append("dept_typ").append("=").append(dept_typ).append(",");
        sb.append("bsns_nm_detls_bsns").append("=").append(bsns_nm_detls_bsns).append(",");
        sb.append("bsns_nm").append("=").append(bsns_nm).append(",");
        sb.append("resch_rspns").append("=").append(resch_rspns);
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
