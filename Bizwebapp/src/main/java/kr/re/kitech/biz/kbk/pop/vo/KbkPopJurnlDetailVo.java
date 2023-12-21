package kr.re.kitech.biz.kbk.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "저널권호 팝업 Vo")
public class KbkPopJurnlDetailVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public KbkPopJurnlDetailVo(){
    }

    @ElDtoField(logicalName = "jurnl_no", physicalName = "jurnl_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String jurnl_no;

    @ElDtoField(logicalName = "no", physicalName = "no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String no;

    @ElDtoField(logicalName = "vol", physicalName = "vol", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vol;

    @ElDtoField(logicalName = "publ_yr", physicalName = "publ_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String publ_yr;

    @ElDtoField(logicalName = "publ_month", physicalName = "publ_month", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String publ_month;

    @ElDtoField(logicalName = "wrhsg_ymd", physicalName = "wrhsg_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrhsg_ymd;

    @ElDtoField(logicalName = "wrhsg_schdl_ymd", physicalName = "wrhsg_schdl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrhsg_schdl_ymd;

    @ElDtoField(logicalName = "cycle_item", physicalName = "cycle_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cycle_item;

    @ElDtoField(logicalName = "missno_yn", physicalName = "missno_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String missno_yn;

    @ElDtoField(logicalName = "attach_file_no", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "imprnt", physicalName = "imprnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String imprnt;

    @ElDtoField(logicalName = "jurnl_subj", physicalName = "jurnl_subj", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String jurnl_subj;

    @ElDtoField(logicalName = "rowStatus", physicalName = "rowStatus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rowStatus;

    @ElDtoField(logicalName = "imprnt_nm", physicalName = "imprnt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String imprnt_nm;

    @ElDtoField(logicalName = "팝업종류", physicalName = "cmd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmd;

    @ElVoField(physicalName = "jurnl_no")
    public String getJurnl_no(){
        return jurnl_no;
    }

    @ElVoField(physicalName = "jurnl_no")
    public void setJurnl_no(String jurnl_no){
        this.jurnl_no = jurnl_no;
    }

    @ElVoField(physicalName = "no")
    public String getNo(){
        return no;
    }

    @ElVoField(physicalName = "no")
    public void setNo(String no){
        this.no = no;
    }

    @ElVoField(physicalName = "vol")
    public String getVol(){
        return vol;
    }

    @ElVoField(physicalName = "vol")
    public void setVol(String vol){
        this.vol = vol;
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

    @ElVoField(physicalName = "imprnt")
    public String getImprnt(){
        return imprnt;
    }

    @ElVoField(physicalName = "imprnt")
    public void setImprnt(String imprnt){
        this.imprnt = imprnt;
    }

    @ElVoField(physicalName = "jurnl_subj")
    public String getJurnl_subj(){
        return jurnl_subj;
    }

    @ElVoField(physicalName = "jurnl_subj")
    public void setJurnl_subj(String jurnl_subj){
        this.jurnl_subj = jurnl_subj;
    }

    @ElVoField(physicalName = "rowStatus")
    public String getRowStatus(){
        return rowStatus;
    }

    @ElVoField(physicalName = "rowStatus")
    public void setRowStatus(String rowStatus){
        this.rowStatus = rowStatus;
    }

    @ElVoField(physicalName = "imprnt_nm")
    public String getImprnt_nm(){
        return imprnt_nm;
    }

    @ElVoField(physicalName = "imprnt_nm")
    public void setImprnt_nm(String imprnt_nm){
        this.imprnt_nm = imprnt_nm;
    }

    @ElVoField(physicalName = "cmd")
    public String getCmd(){
        return cmd;
    }

    @ElVoField(physicalName = "cmd")
    public void setCmd(String cmd){
        this.cmd = cmd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KbkPopJurnlDetailVo [");
        sb.append("jurnl_no").append("=").append(jurnl_no).append(",");
        sb.append("no").append("=").append(no).append(",");
        sb.append("vol").append("=").append(vol).append(",");
        sb.append("publ_yr").append("=").append(publ_yr).append(",");
        sb.append("publ_month").append("=").append(publ_month).append(",");
        sb.append("wrhsg_ymd").append("=").append(wrhsg_ymd).append(",");
        sb.append("wrhsg_schdl_ymd").append("=").append(wrhsg_schdl_ymd).append(",");
        sb.append("cycle_item").append("=").append(cycle_item).append(",");
        sb.append("missno_yn").append("=").append(missno_yn).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("imprnt").append("=").append(imprnt).append(",");
        sb.append("jurnl_subj").append("=").append(jurnl_subj).append(",");
        sb.append("rowStatus").append("=").append(rowStatus).append(",");
        sb.append("imprnt_nm").append("=").append(imprnt_nm).append(",");
        sb.append("cmd").append("=").append(cmd);
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
