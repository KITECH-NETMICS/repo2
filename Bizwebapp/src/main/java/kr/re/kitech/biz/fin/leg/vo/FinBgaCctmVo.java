package kr.re.kitech.biz.fin.leg.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "ResBgaCctmExp")
public class FinBgaCctmVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FinBgaCctmVo(){
    }

    @ElDtoField(logicalName = "accntNo", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "accntRspns", physicalName = "accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns;

    @ElDtoField(logicalName = "relatNo", physicalName = "relat_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat_no;

    @ElDtoField(logicalName = "accntCd", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;

    @ElDtoField(logicalName = "ramtMngmt1", physicalName = "ramt_mngmt_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ramt_mngmt_1;

    @ElDtoField(logicalName = "ramtMngmt2", physicalName = "ramt_mngmt_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ramt_mngmt_2;

    @ElDtoField(logicalName = "mngmtDetlsCd1", physicalName = "mngmt_detls_cd_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_detls_cd_1;

    @ElDtoField(logicalName = "mngmtDetlsCd2", physicalName = "mngmt_detls_cd_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_detls_cd_2;

    @ElDtoField(logicalName = "fromYmd", physicalName = "from_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String from_ymd;

    @ElDtoField(logicalName = "toYmd", physicalName = "to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String to_ymd;

    @ElDtoField(logicalName = "fromMm", physicalName = "from_mm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String from_mm;

    @ElDtoField(logicalName = "toMm", physicalName = "to_mm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String to_mm;

    @ElDtoField(logicalName = "preFromYmd", physicalName = "pre_from_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pre_from_ymd;

    @ElDtoField(logicalName = "preToYmd", physicalName = "pre_to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pre_to_ymd;

    @ElDtoField(logicalName = "serviceId", physicalName = "service_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String service_id;

    @ElDtoField(logicalName = "fromAccntCd", physicalName = "from_accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String from_accnt_cd;

    @ElDtoField(logicalName = "toAccntCd", physicalName = "to_accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String to_accnt_cd;

    @ElDtoField(logicalName = "expnsClsf", physicalName = "expns_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_clsf;

    @ElDtoField(logicalName = "expnsCd", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd;

    @ElDtoField(logicalName = "subYn", physicalName = "sub_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sub_yn;

    @ElDtoField(logicalName = "accnt_no_itm", physicalName = "accnt_no_itm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_itm;

    @ElDtoField(logicalName = "subplus", physicalName = "subplus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String subplus;

    @ElDtoField(logicalName = "accnt_clsf", physicalName = "accnt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_clsf;

    @ElDtoField(logicalName = "clsf", physicalName = "clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String clsf;

    @ElDtoField(logicalName = "reschr_syspayno", physicalName = "reschr_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reschr_syspayno;

    @ElDtoField(logicalName = "mngmt_item_1", physicalName = "mngmt_item_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_1;

    @ElDtoField(logicalName = "mngmt_item_2", physicalName = "mngmt_item_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_2;

    @ElDtoField(logicalName = "mngmt_item_3", physicalName = "mngmt_item_3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_3;

    @ElDtoField(logicalName = "mngmt_item_4", physicalName = "mngmt_item_4", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_4;

    @ElDtoField(logicalName = "string_yn_1", physicalName = "string_yn_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String string_yn_1;

    @ElDtoField(logicalName = "ramt_yn", physicalName = "ramt_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ramt_yn;

    @ElDtoField(logicalName = "accnt_ymd", physicalName = "accnt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_ymd;

    @ElDtoField(logicalName = "string_yn_2", physicalName = "string_yn_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String string_yn_2;

    @ElDtoField(logicalName = "caseby_adjst_ex", physicalName = "caseby_adjst_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String caseby_adjst_ex;

    @ElDtoField(logicalName = "mngmt_item_nm_1", physicalName = "mngmt_item_nm_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_nm_1;

    @ElDtoField(logicalName = "mngmt_item_nm_3", physicalName = "mngmt_item_nm_3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_nm_3;

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public String getAccnt_rspns(){
        return accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public void setAccnt_rspns(String accnt_rspns){
        this.accnt_rspns = accnt_rspns;
    }

    @ElVoField(physicalName = "relat_no")
    public String getRelat_no(){
        return relat_no;
    }

    @ElVoField(physicalName = "relat_no")
    public void setRelat_no(String relat_no){
        this.relat_no = relat_no;
    }

    @ElVoField(physicalName = "accnt_cd")
    public String getAccnt_cd(){
        return accnt_cd;
    }

    @ElVoField(physicalName = "accnt_cd")
    public void setAccnt_cd(String accnt_cd){
        this.accnt_cd = accnt_cd;
    }

    @ElVoField(physicalName = "ramt_mngmt_1")
    public String getRamt_mngmt_1(){
        return ramt_mngmt_1;
    }

    @ElVoField(physicalName = "ramt_mngmt_1")
    public void setRamt_mngmt_1(String ramt_mngmt_1){
        this.ramt_mngmt_1 = ramt_mngmt_1;
    }

    @ElVoField(physicalName = "ramt_mngmt_2")
    public String getRamt_mngmt_2(){
        return ramt_mngmt_2;
    }

    @ElVoField(physicalName = "ramt_mngmt_2")
    public void setRamt_mngmt_2(String ramt_mngmt_2){
        this.ramt_mngmt_2 = ramt_mngmt_2;
    }

    @ElVoField(physicalName = "mngmt_detls_cd_1")
    public String getMngmt_detls_cd_1(){
        return mngmt_detls_cd_1;
    }

    @ElVoField(physicalName = "mngmt_detls_cd_1")
    public void setMngmt_detls_cd_1(String mngmt_detls_cd_1){
        this.mngmt_detls_cd_1 = mngmt_detls_cd_1;
    }

    @ElVoField(physicalName = "mngmt_detls_cd_2")
    public String getMngmt_detls_cd_2(){
        return mngmt_detls_cd_2;
    }

    @ElVoField(physicalName = "mngmt_detls_cd_2")
    public void setMngmt_detls_cd_2(String mngmt_detls_cd_2){
        this.mngmt_detls_cd_2 = mngmt_detls_cd_2;
    }

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

    @ElVoField(physicalName = "from_mm")
    public String getFrom_mm(){
        return from_mm;
    }

    @ElVoField(physicalName = "from_mm")
    public void setFrom_mm(String from_mm){
        this.from_mm = from_mm;
    }

    @ElVoField(physicalName = "to_mm")
    public String getTo_mm(){
        return to_mm;
    }

    @ElVoField(physicalName = "to_mm")
    public void setTo_mm(String to_mm){
        this.to_mm = to_mm;
    }

    @ElVoField(physicalName = "pre_from_ymd")
    public String getPre_from_ymd(){
        return pre_from_ymd;
    }

    @ElVoField(physicalName = "pre_from_ymd")
    public void setPre_from_ymd(String pre_from_ymd){
        this.pre_from_ymd = pre_from_ymd;
    }

    @ElVoField(physicalName = "pre_to_ymd")
    public String getPre_to_ymd(){
        return pre_to_ymd;
    }

    @ElVoField(physicalName = "pre_to_ymd")
    public void setPre_to_ymd(String pre_to_ymd){
        this.pre_to_ymd = pre_to_ymd;
    }

    @ElVoField(physicalName = "service_id")
    public String getService_id(){
        return service_id;
    }

    @ElVoField(physicalName = "service_id")
    public void setService_id(String service_id){
        this.service_id = service_id;
    }

    @ElVoField(physicalName = "from_accnt_cd")
    public String getFrom_accnt_cd(){
        return from_accnt_cd;
    }

    @ElVoField(physicalName = "from_accnt_cd")
    public void setFrom_accnt_cd(String from_accnt_cd){
        this.from_accnt_cd = from_accnt_cd;
    }

    @ElVoField(physicalName = "to_accnt_cd")
    public String getTo_accnt_cd(){
        return to_accnt_cd;
    }

    @ElVoField(physicalName = "to_accnt_cd")
    public void setTo_accnt_cd(String to_accnt_cd){
        this.to_accnt_cd = to_accnt_cd;
    }

    @ElVoField(physicalName = "expns_clsf")
    public String getExpns_clsf(){
        return expns_clsf;
    }

    @ElVoField(physicalName = "expns_clsf")
    public void setExpns_clsf(String expns_clsf){
        this.expns_clsf = expns_clsf;
    }

    @ElVoField(physicalName = "expns_cd")
    public String getExpns_cd(){
        return expns_cd;
    }

    @ElVoField(physicalName = "expns_cd")
    public void setExpns_cd(String expns_cd){
        this.expns_cd = expns_cd;
    }

    @ElVoField(physicalName = "sub_yn")
    public String getSub_yn(){
        return sub_yn;
    }

    @ElVoField(physicalName = "sub_yn")
    public void setSub_yn(String sub_yn){
        this.sub_yn = sub_yn;
    }

    @ElVoField(physicalName = "accnt_no_itm")
    public String getAccnt_no_itm(){
        return accnt_no_itm;
    }

    @ElVoField(physicalName = "accnt_no_itm")
    public void setAccnt_no_itm(String accnt_no_itm){
        this.accnt_no_itm = accnt_no_itm;
    }

    @ElVoField(physicalName = "subplus")
    public String getSubplus(){
        return subplus;
    }

    @ElVoField(physicalName = "subplus")
    public void setSubplus(String subplus){
        this.subplus = subplus;
    }

    @ElVoField(physicalName = "accnt_clsf")
    public String getAccnt_clsf(){
        return accnt_clsf;
    }

    @ElVoField(physicalName = "accnt_clsf")
    public void setAccnt_clsf(String accnt_clsf){
        this.accnt_clsf = accnt_clsf;
    }

    @ElVoField(physicalName = "clsf")
    public String getClsf(){
        return clsf;
    }

    @ElVoField(physicalName = "clsf")
    public void setClsf(String clsf){
        this.clsf = clsf;
    }

    @ElVoField(physicalName = "reschr_syspayno")
    public String getReschr_syspayno(){
        return reschr_syspayno;
    }

    @ElVoField(physicalName = "reschr_syspayno")
    public void setReschr_syspayno(String reschr_syspayno){
        this.reschr_syspayno = reschr_syspayno;
    }

    @ElVoField(physicalName = "mngmt_item_1")
    public String getMngmt_item_1(){
        return mngmt_item_1;
    }

    @ElVoField(physicalName = "mngmt_item_1")
    public void setMngmt_item_1(String mngmt_item_1){
        this.mngmt_item_1 = mngmt_item_1;
    }

    @ElVoField(physicalName = "mngmt_item_2")
    public String getMngmt_item_2(){
        return mngmt_item_2;
    }

    @ElVoField(physicalName = "mngmt_item_2")
    public void setMngmt_item_2(String mngmt_item_2){
        this.mngmt_item_2 = mngmt_item_2;
    }

    @ElVoField(physicalName = "mngmt_item_3")
    public String getMngmt_item_3(){
        return mngmt_item_3;
    }

    @ElVoField(physicalName = "mngmt_item_3")
    public void setMngmt_item_3(String mngmt_item_3){
        this.mngmt_item_3 = mngmt_item_3;
    }

    @ElVoField(physicalName = "mngmt_item_4")
    public String getMngmt_item_4(){
        return mngmt_item_4;
    }

    @ElVoField(physicalName = "mngmt_item_4")
    public void setMngmt_item_4(String mngmt_item_4){
        this.mngmt_item_4 = mngmt_item_4;
    }

    @ElVoField(physicalName = "string_yn_1")
    public String getString_yn_1(){
        return string_yn_1;
    }

    @ElVoField(physicalName = "string_yn_1")
    public void setString_yn_1(String string_yn_1){
        this.string_yn_1 = string_yn_1;
    }

    @ElVoField(physicalName = "ramt_yn")
    public String getRamt_yn(){
        return ramt_yn;
    }

    @ElVoField(physicalName = "ramt_yn")
    public void setRamt_yn(String ramt_yn){
        this.ramt_yn = ramt_yn;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public String getAccnt_ymd(){
        return accnt_ymd;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public void setAccnt_ymd(String accnt_ymd){
        this.accnt_ymd = accnt_ymd;
    }

    @ElVoField(physicalName = "string_yn_2")
    public String getString_yn_2(){
        return string_yn_2;
    }

    @ElVoField(physicalName = "string_yn_2")
    public void setString_yn_2(String string_yn_2){
        this.string_yn_2 = string_yn_2;
    }

    @ElVoField(physicalName = "caseby_adjst_ex")
    public String getCaseby_adjst_ex(){
        return caseby_adjst_ex;
    }

    @ElVoField(physicalName = "caseby_adjst_ex")
    public void setCaseby_adjst_ex(String caseby_adjst_ex){
        this.caseby_adjst_ex = caseby_adjst_ex;
    }

    @ElVoField(physicalName = "mngmt_item_nm_1")
    public String getMngmt_item_nm_1(){
        return mngmt_item_nm_1;
    }

    @ElVoField(physicalName = "mngmt_item_nm_1")
    public void setMngmt_item_nm_1(String mngmt_item_nm_1){
        this.mngmt_item_nm_1 = mngmt_item_nm_1;
    }

    @ElVoField(physicalName = "mngmt_item_nm_3")
    public String getMngmt_item_nm_3(){
        return mngmt_item_nm_3;
    }

    @ElVoField(physicalName = "mngmt_item_nm_3")
    public void setMngmt_item_nm_3(String mngmt_item_nm_3){
        this.mngmt_item_nm_3 = mngmt_item_nm_3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinBgaCctmVo [");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_rspns").append("=").append(accnt_rspns).append(",");
        sb.append("relat_no").append("=").append(relat_no).append(",");
        sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
        sb.append("ramt_mngmt_1").append("=").append(ramt_mngmt_1).append(",");
        sb.append("ramt_mngmt_2").append("=").append(ramt_mngmt_2).append(",");
        sb.append("mngmt_detls_cd_1").append("=").append(mngmt_detls_cd_1).append(",");
        sb.append("mngmt_detls_cd_2").append("=").append(mngmt_detls_cd_2).append(",");
        sb.append("from_ymd").append("=").append(from_ymd).append(",");
        sb.append("to_ymd").append("=").append(to_ymd).append(",");
        sb.append("from_mm").append("=").append(from_mm).append(",");
        sb.append("to_mm").append("=").append(to_mm).append(",");
        sb.append("pre_from_ymd").append("=").append(pre_from_ymd).append(",");
        sb.append("pre_to_ymd").append("=").append(pre_to_ymd).append(",");
        sb.append("service_id").append("=").append(service_id).append(",");
        sb.append("from_accnt_cd").append("=").append(from_accnt_cd).append(",");
        sb.append("to_accnt_cd").append("=").append(to_accnt_cd).append(",");
        sb.append("expns_clsf").append("=").append(expns_clsf).append(",");
        sb.append("expns_cd").append("=").append(expns_cd).append(",");
        sb.append("sub_yn").append("=").append(sub_yn).append(",");
        sb.append("accnt_no_itm").append("=").append(accnt_no_itm).append(",");
        sb.append("subplus").append("=").append(subplus).append(",");
        sb.append("accnt_clsf").append("=").append(accnt_clsf).append(",");
        sb.append("clsf").append("=").append(clsf).append(",");
        sb.append("reschr_syspayno").append("=").append(reschr_syspayno).append(",");
        sb.append("mngmt_item_1").append("=").append(mngmt_item_1).append(",");
        sb.append("mngmt_item_2").append("=").append(mngmt_item_2).append(",");
        sb.append("mngmt_item_3").append("=").append(mngmt_item_3).append(",");
        sb.append("mngmt_item_4").append("=").append(mngmt_item_4).append(",");
        sb.append("string_yn_1").append("=").append(string_yn_1).append(",");
        sb.append("ramt_yn").append("=").append(ramt_yn).append(",");
        sb.append("accnt_ymd").append("=").append(accnt_ymd).append(",");
        sb.append("string_yn_2").append("=").append(string_yn_2).append(",");
        sb.append("caseby_adjst_ex").append("=").append(caseby_adjst_ex).append(",");
        sb.append("mngmt_item_nm_1").append("=").append(mngmt_item_nm_1).append(",");
        sb.append("mngmt_item_nm_3").append("=").append(mngmt_item_nm_3);
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
