package kr.re.kitech.biz.kbk.inv.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "저널권호정보 Vo")
public class InvJurnlVolVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public InvJurnlVolVo(){
    }

    @ElDtoField(logicalName = "저널번호", physicalName = "jurnl_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String jurnl_no;

    @ElDtoField(logicalName = "저널명", physicalName = "jurnl_subj", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String jurnl_subj;

    @ElDtoField(logicalName = "volume", physicalName = "vol", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vol;

    @ElDtoField(logicalName = "number", physicalName = "no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String no;

    @ElDtoField(logicalName = "출판년도", physicalName = "publ_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String publ_yr;

    @ElDtoField(logicalName = "출판월", physicalName = "publ_month", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String publ_month;

    @ElDtoField(logicalName = "입고일", physicalName = "wrhsg_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrhsg_ymd;

    @ElDtoField(logicalName = "입고예정일", physicalName = "wrhsg_schdl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrhsg_schdl_ymd;

    @ElDtoField(logicalName = "결호여부", physicalName = "missno_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String missno_yn;

    @ElDtoField(logicalName = "원문여부", physicalName = "file_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String file_yn;

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
    public String getVol(){
        return vol;
    }

    @ElVoField(physicalName = "vol")
    public void setVol(String vol){
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

    @ElVoField(physicalName = "missno_yn")
    public String getMissno_yn(){
        return missno_yn;
    }

    @ElVoField(physicalName = "missno_yn")
    public void setMissno_yn(String missno_yn){
        this.missno_yn = missno_yn;
    }

    @ElVoField(physicalName = "file_yn")
    public String getFile_yn(){
        return file_yn;
    }

    @ElVoField(physicalName = "file_yn")
    public void setFile_yn(String file_yn){
        this.file_yn = file_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvJurnlVolVo [");
        sb.append("jurnl_no").append("=").append(jurnl_no).append(",");
        sb.append("jurnl_subj").append("=").append(jurnl_subj).append(",");
        sb.append("vol").append("=").append(vol).append(",");
        sb.append("no").append("=").append(no).append(",");
        sb.append("publ_yr").append("=").append(publ_yr).append(",");
        sb.append("publ_month").append("=").append(publ_month).append(",");
        sb.append("wrhsg_ymd").append("=").append(wrhsg_ymd).append(",");
        sb.append("wrhsg_schdl_ymd").append("=").append(wrhsg_schdl_ymd).append(",");
        sb.append("missno_yn").append("=").append(missno_yn).append(",");
        sb.append("file_yn").append("=").append(file_yn);
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
