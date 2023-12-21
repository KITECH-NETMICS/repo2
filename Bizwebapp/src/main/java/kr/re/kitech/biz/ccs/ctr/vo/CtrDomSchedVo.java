package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "국내출장 활동내역 Vo")
public class CtrDomSchedVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CtrDomSchedVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "순번", physicalName = "ord", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int ord;

    @ElDtoField(logicalName = "시작일자", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;

    @ElDtoField(logicalName = "종료일자", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "주요면담자", physicalName = "major_intrv_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String major_intrv_psn;

    @ElDtoField(logicalName = "면담자연락처", physicalName = "major_intrv_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String major_intrv_tel;

    @ElDtoField(logicalName = "방문기관", physicalName = "agncy_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_nm;

    @ElDtoField(logicalName = "활동내역", physicalName = "actn_detls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String actn_detls;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "ord")
    public int getOrd(){
        return ord;
    }

    @ElVoField(physicalName = "ord")
    public void setOrd(int ord){
        this.ord = ord;
    }

    @ElVoField(physicalName = "start_ymd")
    public String getStart_ymd(){
        return start_ymd;
    }

    @ElVoField(physicalName = "start_ymd")
    public void setStart_ymd(String start_ymd){
        this.start_ymd = start_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public String getCls_ymd(){
        return cls_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public void setCls_ymd(String cls_ymd){
        this.cls_ymd = cls_ymd;
    }

    @ElVoField(physicalName = "major_intrv_psn")
    public String getMajor_intrv_psn(){
        return major_intrv_psn;
    }

    @ElVoField(physicalName = "major_intrv_psn")
    public void setMajor_intrv_psn(String major_intrv_psn){
        this.major_intrv_psn = major_intrv_psn;
    }

    @ElVoField(physicalName = "major_intrv_tel")
    public String getMajor_intrv_tel(){
        return major_intrv_tel;
    }

    @ElVoField(physicalName = "major_intrv_tel")
    public void setMajor_intrv_tel(String major_intrv_tel){
        this.major_intrv_tel = major_intrv_tel;
    }

    @ElVoField(physicalName = "agncy_nm")
    public String getAgncy_nm(){
        return agncy_nm;
    }

    @ElVoField(physicalName = "agncy_nm")
    public void setAgncy_nm(String agncy_nm){
        this.agncy_nm = agncy_nm;
    }

    @ElVoField(physicalName = "actn_detls")
    public String getActn_detls(){
        return actn_detls;
    }

    @ElVoField(physicalName = "actn_detls")
    public void setActn_detls(String actn_detls){
        this.actn_detls = actn_detls;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrDomSchedVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("ord").append("=").append(ord).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("major_intrv_psn").append("=").append(major_intrv_psn).append(",");
        sb.append("major_intrv_tel").append("=").append(major_intrv_tel).append(",");
        sb.append("agncy_nm").append("=").append(agncy_nm).append(",");
        sb.append("actn_detls").append("=").append(actn_detls).append(",");
        sb.append("rmk").append("=").append(rmk);
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
