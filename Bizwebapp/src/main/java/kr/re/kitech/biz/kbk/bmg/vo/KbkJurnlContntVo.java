package kr.re.kitech.biz.kbk.bmg.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "저널관리목차VO")
public class KbkJurnlContntVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public KbkJurnlContntVo(){
    }

    @ElDtoField(logicalName = "저널번호", physicalName = "jurnl_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String jurnl_no;

    @ElDtoField(logicalName = "저널제목", physicalName = "jurnl_subj", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String jurnl_subj;

    @ElDtoField(logicalName = "볼륨", physicalName = "vol", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int vol;

    @ElDtoField(logicalName = "번호", physicalName = "no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String no;

    @ElDtoField(logicalName = "출판연도", physicalName = "publ_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String publ_yr;

    @ElDtoField(logicalName = "출판월", physicalName = "publ_month", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String publ_month;

    @ElDtoField(logicalName = "입고일자", physicalName = "wrhsg_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrhsg_ymd;

    @ElDtoField(logicalName = "입고예정일자", physicalName = "wrhsg_schdl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrhsg_schdl_ymd;

    @ElDtoField(logicalName = "비고", physicalName = "cycle_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cycle_item;

    @ElDtoField(logicalName = "결호여부", physicalName = "missno_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String missno_yn;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "등록자시스템개인번호", physicalName = "regst_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_psn_syspayno;

    @ElDtoField(logicalName = "등록일시", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "수정자시스템개인번호", physicalName = "updt_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_psn_syspayno;

    @ElDtoField(logicalName = "수정일시", physicalName = "updt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_daytm;

    @ElVoField(physicalName = "jurnl_no")
    public String getJurnl_no(){
        return jurnl_no;
    }

    @ElVoField(physicalName = "jurnl_no")
    public void setJurnl_no(String jurnl_no){
        this.jurnl_no = jurnl_no;
    }

    @ElVoField(physicalName = "jurnl_subj")
    public String getJurnl_subj(){
        return jurnl_subj;
    }

    @ElVoField(physicalName = "jurnl_subj")
    public void setJurnl_subj(String jurnl_subj){
        this.jurnl_subj = jurnl_subj;
    }

    @ElVoField(physicalName = "vol")
    public int getVol(){
        return vol;
    }

    @ElVoField(physicalName = "vol")
    public void setVol(int vol){
        this.vol = vol;
    }

    @ElVoField(physicalName = "no")
    public String getNo(){
        return no;
    }

    @ElVoField(physicalName = "no")
    public void setNo(String no){
        this.no = no;
    }

    @ElVoField(physicalName = "publ_yr")
    public String getPubl_yr(){
        return publ_yr;
    }

    @ElVoField(physicalName = "publ_yr")
    public void setPubl_yr(String publ_yr){
        this.publ_yr = publ_yr;
    }

    @ElVoField(physicalName = "publ_month")
    public String getPubl_month(){
        return publ_month;
    }

    @ElVoField(physicalName = "publ_month")
    public void setPubl_month(String publ_month){
        this.publ_month = publ_month;
    }

    @ElVoField(physicalName = "wrhsg_ymd")
    public String getWrhsg_ymd(){
        return wrhsg_ymd;
    }

    @ElVoField(physicalName = "wrhsg_ymd")
    public void setWrhsg_ymd(String wrhsg_ymd){
        this.wrhsg_ymd = wrhsg_ymd;
    }

    @ElVoField(physicalName = "wrhsg_schdl_ymd")
    public String getWrhsg_schdl_ymd(){
        return wrhsg_schdl_ymd;
    }

    @ElVoField(physicalName = "wrhsg_schdl_ymd")
    public void setWrhsg_schdl_ymd(String wrhsg_schdl_ymd){
        this.wrhsg_schdl_ymd = wrhsg_schdl_ymd;
    }

    @ElVoField(physicalName = "cycle_item")
    public String getCycle_item(){
        return cycle_item;
    }

    @ElVoField(physicalName = "cycle_item")
    public void setCycle_item(String cycle_item){
        this.cycle_item = cycle_item;
    }

    @ElVoField(physicalName = "missno_yn")
    public String getMissno_yn(){
        return missno_yn;
    }

    @ElVoField(physicalName = "missno_yn")
    public void setMissno_yn(String missno_yn){
        this.missno_yn = missno_yn;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public String getRegst_psn_syspayno(){
        return regst_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public void setRegst_psn_syspayno(String regst_psn_syspayno){
        this.regst_psn_syspayno = regst_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        return regst_daytm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public String getUpdt_psn_syspayno(){
        return updt_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public void setUpdt_psn_syspayno(String updt_psn_syspayno){
        this.updt_psn_syspayno = updt_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_daytm")
    public String getUpdt_daytm(){
        return updt_daytm;
    }

    @ElVoField(physicalName = "updt_daytm")
    public void setUpdt_daytm(String updt_daytm){
        this.updt_daytm = updt_daytm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KbkJurnlContntVo [");
        sb.append("jurnl_no").append("=").append(jurnl_no).append(",");
        sb.append("jurnl_subj").append("=").append(jurnl_subj).append(",");
        sb.append("vol").append("=").append(vol).append(",");
        sb.append("no").append("=").append(no).append(",");
        sb.append("publ_yr").append("=").append(publ_yr).append(",");
        sb.append("publ_month").append("=").append(publ_month).append(",");
        sb.append("wrhsg_ymd").append("=").append(wrhsg_ymd).append(",");
        sb.append("wrhsg_schdl_ymd").append("=").append(wrhsg_schdl_ymd).append(",");
        sb.append("cycle_item").append("=").append(cycle_item).append(",");
        sb.append("missno_yn").append("=").append(missno_yn).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("regst_psn_syspayno").append("=").append(regst_psn_syspayno).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("updt_psn_syspayno").append("=").append(updt_psn_syspayno).append(",");
        sb.append("updt_daytm").append("=").append(updt_daytm);
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
