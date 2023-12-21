package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "출장기간 중복검증 Vo")
public class PeriodDupVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PeriodDupVo(){
    }

    @ElDtoField(logicalName = "출장구분", physicalName = "gbn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String gbn;

    @ElDtoField(logicalName = "출장신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "출장자", physicalName = "biztrip_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_psn_syspayno;

    @ElDtoField(logicalName = "출장자개인번호", physicalName = "biztrip_psn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_psn_empno;

    @ElDtoField(logicalName = "출장자성명", physicalName = "biztrip_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_psn_nm;

    @ElDtoField(logicalName = "출장지역", physicalName = "biztrip_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_region;

    @ElDtoField(logicalName = "출장출발일", physicalName = "biztrip_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_start_ymd;

    @ElDtoField(logicalName = "출장종료일", physicalName = "biztrip_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_cls_ymd;

    @ElDtoField(logicalName = "상태", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElVoField(physicalName = "gbn")
    public String getGbn(){
        return gbn;
    }

    @ElVoField(physicalName = "gbn")
    public void setGbn(String gbn){
        this.gbn = gbn;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "biztrip_psn_syspayno")
    public String getBiztrip_psn_syspayno(){
        return biztrip_psn_syspayno;
    }

    @ElVoField(physicalName = "biztrip_psn_syspayno")
    public void setBiztrip_psn_syspayno(String biztrip_psn_syspayno){
        this.biztrip_psn_syspayno = biztrip_psn_syspayno;
    }

    @ElVoField(physicalName = "biztrip_psn_empno")
    public String getBiztrip_psn_empno(){
        return biztrip_psn_empno;
    }

    @ElVoField(physicalName = "biztrip_psn_empno")
    public void setBiztrip_psn_empno(String biztrip_psn_empno){
        this.biztrip_psn_empno = biztrip_psn_empno;
    }

    @ElVoField(physicalName = "biztrip_psn_nm")
    public String getBiztrip_psn_nm(){
        return biztrip_psn_nm;
    }

    @ElVoField(physicalName = "biztrip_psn_nm")
    public void setBiztrip_psn_nm(String biztrip_psn_nm){
        this.biztrip_psn_nm = biztrip_psn_nm;
    }

    @ElVoField(physicalName = "biztrip_region")
    public String getBiztrip_region(){
        return biztrip_region;
    }

    @ElVoField(physicalName = "biztrip_region")
    public void setBiztrip_region(String biztrip_region){
        this.biztrip_region = biztrip_region;
    }

    @ElVoField(physicalName = "biztrip_start_ymd")
    public String getBiztrip_start_ymd(){
        return biztrip_start_ymd;
    }

    @ElVoField(physicalName = "biztrip_start_ymd")
    public void setBiztrip_start_ymd(String biztrip_start_ymd){
        this.biztrip_start_ymd = biztrip_start_ymd;
    }

    @ElVoField(physicalName = "biztrip_cls_ymd")
    public String getBiztrip_cls_ymd(){
        return biztrip_cls_ymd;
    }

    @ElVoField(physicalName = "biztrip_cls_ymd")
    public void setBiztrip_cls_ymd(String biztrip_cls_ymd){
        this.biztrip_cls_ymd = biztrip_cls_ymd;
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
        sb.append("PeriodDupVo [");
        sb.append("gbn").append("=").append(gbn).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("biztrip_psn_syspayno").append("=").append(biztrip_psn_syspayno).append(",");
        sb.append("biztrip_psn_empno").append("=").append(biztrip_psn_empno).append(",");
        sb.append("biztrip_psn_nm").append("=").append(biztrip_psn_nm).append(",");
        sb.append("biztrip_region").append("=").append(biztrip_region).append(",");
        sb.append("biztrip_start_ymd").append("=").append(biztrip_start_ymd).append(",");
        sb.append("biztrip_cls_ymd").append("=").append(biztrip_cls_ymd).append(",");
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
