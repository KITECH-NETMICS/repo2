package kr.re.kitech.biz.hum.bas.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "직종코드Vo")
public class HumOccutypCdVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumOccutypCdVo(){
    }

    @ElDtoField(logicalName = "직종코드", physicalName = "occutyp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occutyp_cd;

    @ElDtoField(logicalName = "직종명", physicalName = "occutyp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occutyp_nm;

    @ElDtoField(logicalName = "occugrp_cd", physicalName = "occugrp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occugrp_cd;

    @ElDtoField(logicalName = "occutyp_desc", physicalName = "occutyp_desc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occutyp_desc;

    @ElDtoField(logicalName = "occutyp_grp", physicalName = "occutyp_grp", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occutyp_grp;

    @ElDtoField(logicalName = "disp_seq", physicalName = "disp_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String disp_seq;

    @ElDtoField(logicalName = "use_yn", physicalName = "use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_yn;

    @ElDtoField(logicalName = "creat_ymd", physicalName = "creat_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String creat_ymd;

    @ElDtoField(logicalName = "abol_ymd", physicalName = "abol_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String abol_ymd;

    @ElVoField(physicalName = "occutyp_cd")
    public String getOccutyp_cd(){
        return occutyp_cd;
    }

    @ElVoField(physicalName = "occutyp_cd")
    public void setOccutyp_cd(String occutyp_cd){
        this.occutyp_cd = occutyp_cd;
    }

    @ElVoField(physicalName = "occutyp_nm")
    public String getOccutyp_nm(){
        return occutyp_nm;
    }

    @ElVoField(physicalName = "occutyp_nm")
    public void setOccutyp_nm(String occutyp_nm){
        this.occutyp_nm = occutyp_nm;
    }

    @ElVoField(physicalName = "occugrp_cd")
    public String getOccugrp_cd(){
        return occugrp_cd;
    }

    @ElVoField(physicalName = "occugrp_cd")
    public void setOccugrp_cd(String occugrp_cd){
        this.occugrp_cd = occugrp_cd;
    }

    @ElVoField(physicalName = "occutyp_desc")
    public String getOccutyp_desc(){
        return occutyp_desc;
    }

    @ElVoField(physicalName = "occutyp_desc")
    public void setOccutyp_desc(String occutyp_desc){
        this.occutyp_desc = occutyp_desc;
    }

    @ElVoField(physicalName = "occutyp_grp")
    public String getOccutyp_grp(){
        return occutyp_grp;
    }

    @ElVoField(physicalName = "occutyp_grp")
    public void setOccutyp_grp(String occutyp_grp){
        this.occutyp_grp = occutyp_grp;
    }

    @ElVoField(physicalName = "disp_seq")
    public String getDisp_seq(){
        return disp_seq;
    }

    @ElVoField(physicalName = "disp_seq")
    public void setDisp_seq(String disp_seq){
        this.disp_seq = disp_seq;
    }

    @ElVoField(physicalName = "use_yn")
    public String getUse_yn(){
        return use_yn;
    }

    @ElVoField(physicalName = "use_yn")
    public void setUse_yn(String use_yn){
        this.use_yn = use_yn;
    }

    @ElVoField(physicalName = "creat_ymd")
    public String getCreat_ymd(){
        return creat_ymd;
    }

    @ElVoField(physicalName = "creat_ymd")
    public void setCreat_ymd(String creat_ymd){
        this.creat_ymd = creat_ymd;
    }

    @ElVoField(physicalName = "abol_ymd")
    public String getAbol_ymd(){
        return abol_ymd;
    }

    @ElVoField(physicalName = "abol_ymd")
    public void setAbol_ymd(String abol_ymd){
        this.abol_ymd = abol_ymd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumOccutypCdVo [");
        sb.append("occutyp_cd").append("=").append(occutyp_cd).append(",");
        sb.append("occutyp_nm").append("=").append(occutyp_nm).append(",");
        sb.append("occugrp_cd").append("=").append(occugrp_cd).append(",");
        sb.append("occutyp_desc").append("=").append(occutyp_desc).append(",");
        sb.append("occutyp_grp").append("=").append(occutyp_grp).append(",");
        sb.append("disp_seq").append("=").append(disp_seq).append(",");
        sb.append("use_yn").append("=").append(use_yn).append(",");
        sb.append("creat_ymd").append("=").append(creat_ymd).append(",");
        sb.append("abol_ymd").append("=").append(abol_ymd);
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
