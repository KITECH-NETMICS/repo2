package kr.re.kitech.biz.res.exp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "ResRsAllowanceRateExp")
public class ResRsAllowanceRateVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResRsAllowanceRateVo(){
    }

    @ElDtoField(logicalName = "bsnsCdInout", physicalName = "bsns_cd_inout", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_inout;

    @ElDtoField(logicalName = "bsnsCd", physicalName = "bsns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd;

    @ElDtoField(logicalName = "bsnsInoutNm", physicalName = "bsns_inout_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_inout_nm;

    @ElDtoField(logicalName = "bsnsNm", physicalName = "bsns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_nm;

    @ElDtoField(logicalName = "startYmd", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;

    @ElDtoField(logicalName = "closeYmd", physicalName = "close_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String close_ymd;

    @ElDtoField(logicalName = "psnLimitRate01", physicalName = "psn_limit_rate_01", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psn_limit_rate_01;

    @ElDtoField(logicalName = "psnLimitRate02", physicalName = "psn_limit_rate_02", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psn_limit_rate_02;

    @ElDtoField(logicalName = "psnLimitRate03", physicalName = "psn_limit_rate_03", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psn_limit_rate_03;

    @ElDtoField(logicalName = "psnLimitRate04", physicalName = "psn_limit_rate_04", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psn_limit_rate_04;

    @ElDtoField(logicalName = "psnLimitRate05", physicalName = "psn_limit_rate_05", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psn_limit_rate_05;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "useYn", physicalName = "use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_yn;

    @ElDtoField(logicalName = "regstSyspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "regstDaytm", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "updtSyspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;

    @ElDtoField(logicalName = "updtDaytm", physicalName = "updt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_daytm;

    @ElDtoField(logicalName = "sn", physicalName = "sn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sn;

    @ElDtoField(logicalName = "depth", physicalName = "depth", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depth;

    @ElDtoField(logicalName = "use_ex", physicalName = "use_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_ex;

    @ElDtoField(logicalName = "regstNm", physicalName = "regst_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_nm;

    @ElDtoField(logicalName = "updaterNm ", physicalName = "updater_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updater_nm;

    @ElVoField(physicalName = "bsns_cd_inout")
    public String getBsns_cd_inout(){
        return bsns_cd_inout;
    }

    @ElVoField(physicalName = "bsns_cd_inout")
    public void setBsns_cd_inout(String bsns_cd_inout){
        this.bsns_cd_inout = bsns_cd_inout;
    }

    @ElVoField(physicalName = "bsns_cd")
    public String getBsns_cd(){
        return bsns_cd;
    }

    @ElVoField(physicalName = "bsns_cd")
    public void setBsns_cd(String bsns_cd){
        this.bsns_cd = bsns_cd;
    }

    @ElVoField(physicalName = "bsns_inout_nm")
    public String getBsns_inout_nm(){
        return bsns_inout_nm;
    }

    @ElVoField(physicalName = "bsns_inout_nm")
    public void setBsns_inout_nm(String bsns_inout_nm){
        this.bsns_inout_nm = bsns_inout_nm;
    }

    @ElVoField(physicalName = "bsns_nm")
    public String getBsns_nm(){
        return bsns_nm;
    }

    @ElVoField(physicalName = "bsns_nm")
    public void setBsns_nm(String bsns_nm){
        this.bsns_nm = bsns_nm;
    }

    @ElVoField(physicalName = "start_ymd")
    public String getStart_ymd(){
        return start_ymd;
    }

    @ElVoField(physicalName = "start_ymd")
    public void setStart_ymd(String start_ymd){
        this.start_ymd = start_ymd;
    }

    @ElVoField(physicalName = "close_ymd")
    public String getClose_ymd(){
        return close_ymd;
    }

    @ElVoField(physicalName = "close_ymd")
    public void setClose_ymd(String close_ymd){
        this.close_ymd = close_ymd;
    }

    @ElVoField(physicalName = "psn_limit_rate_01")
    public String getPsn_limit_rate_01(){
        return psn_limit_rate_01;
    }

    @ElVoField(physicalName = "psn_limit_rate_01")
    public void setPsn_limit_rate_01(String psn_limit_rate_01){
        this.psn_limit_rate_01 = psn_limit_rate_01;
    }

    @ElVoField(physicalName = "psn_limit_rate_02")
    public String getPsn_limit_rate_02(){
        return psn_limit_rate_02;
    }

    @ElVoField(physicalName = "psn_limit_rate_02")
    public void setPsn_limit_rate_02(String psn_limit_rate_02){
        this.psn_limit_rate_02 = psn_limit_rate_02;
    }

    @ElVoField(physicalName = "psn_limit_rate_03")
    public String getPsn_limit_rate_03(){
        return psn_limit_rate_03;
    }

    @ElVoField(physicalName = "psn_limit_rate_03")
    public void setPsn_limit_rate_03(String psn_limit_rate_03){
        this.psn_limit_rate_03 = psn_limit_rate_03;
    }

    @ElVoField(physicalName = "psn_limit_rate_04")
    public String getPsn_limit_rate_04(){
        return psn_limit_rate_04;
    }

    @ElVoField(physicalName = "psn_limit_rate_04")
    public void setPsn_limit_rate_04(String psn_limit_rate_04){
        this.psn_limit_rate_04 = psn_limit_rate_04;
    }

    @ElVoField(physicalName = "psn_limit_rate_05")
    public String getPsn_limit_rate_05(){
        return psn_limit_rate_05;
    }

    @ElVoField(physicalName = "psn_limit_rate_05")
    public void setPsn_limit_rate_05(String psn_limit_rate_05){
        this.psn_limit_rate_05 = psn_limit_rate_05;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "use_yn")
    public String getUse_yn(){
        return use_yn;
    }

    @ElVoField(physicalName = "use_yn")
    public void setUse_yn(String use_yn){
        this.use_yn = use_yn;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        return regst_daytm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public String getUpdt_syspayno(){
        return updt_syspayno;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public void setUpdt_syspayno(String updt_syspayno){
        this.updt_syspayno = updt_syspayno;
    }

    @ElVoField(physicalName = "updt_daytm")
    public String getUpdt_daytm(){
        return updt_daytm;
    }

    @ElVoField(physicalName = "updt_daytm")
    public void setUpdt_daytm(String updt_daytm){
        this.updt_daytm = updt_daytm;
    }

    @ElVoField(physicalName = "sn")
    public String getSn(){
        return sn;
    }

    @ElVoField(physicalName = "sn")
    public void setSn(String sn){
        this.sn = sn;
    }

    @ElVoField(physicalName = "depth")
    public String getDepth(){
        return depth;
    }

    @ElVoField(physicalName = "depth")
    public void setDepth(String depth){
        this.depth = depth;
    }

    @ElVoField(physicalName = "use_ex")
    public String getUse_ex(){
        return use_ex;
    }

    @ElVoField(physicalName = "use_ex")
    public void setUse_ex(String use_ex){
        this.use_ex = use_ex;
    }

    @ElVoField(physicalName = "regst_nm")
    public String getRegst_nm(){
        return regst_nm;
    }

    @ElVoField(physicalName = "regst_nm")
    public void setRegst_nm(String regst_nm){
        this.regst_nm = regst_nm;
    }

    @ElVoField(physicalName = "updater_nm")
    public String getUpdater_nm(){
        return updater_nm;
    }

    @ElVoField(physicalName = "updater_nm")
    public void setUpdater_nm(String updater_nm){
        this.updater_nm = updater_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResRsAllowanceRateVo [");
        sb.append("bsns_cd_inout").append("=").append(bsns_cd_inout).append(",");
        sb.append("bsns_cd").append("=").append(bsns_cd).append(",");
        sb.append("bsns_inout_nm").append("=").append(bsns_inout_nm).append(",");
        sb.append("bsns_nm").append("=").append(bsns_nm).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("close_ymd").append("=").append(close_ymd).append(",");
        sb.append("psn_limit_rate_01").append("=").append(psn_limit_rate_01).append(",");
        sb.append("psn_limit_rate_02").append("=").append(psn_limit_rate_02).append(",");
        sb.append("psn_limit_rate_03").append("=").append(psn_limit_rate_03).append(",");
        sb.append("psn_limit_rate_04").append("=").append(psn_limit_rate_04).append(",");
        sb.append("psn_limit_rate_05").append("=").append(psn_limit_rate_05).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("use_yn").append("=").append(use_yn).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
        sb.append("updt_daytm").append("=").append(updt_daytm).append(",");
        sb.append("sn").append("=").append(sn).append(",");
        sb.append("depth").append("=").append(depth).append(",");
        sb.append("use_ex").append("=").append(use_ex).append(",");
        sb.append("regst_nm").append("=").append(regst_nm).append(",");
        sb.append("updater_nm").append("=").append(updater_nm);
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
