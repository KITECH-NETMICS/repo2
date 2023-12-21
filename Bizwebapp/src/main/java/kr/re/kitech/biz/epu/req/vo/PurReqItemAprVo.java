package kr.re.kitech.biz.epu.req.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "특정구매요구서 픔목합계 Vo")
public class PurReqItemAprVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PurReqItemAprVo(){
    }

    @ElDtoField(logicalName = "추정단가", physicalName = "req_unit_price", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double req_unit_price;

    @ElDtoField(logicalName = "추정가격", physicalName = "req_amt", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double req_amt;

    @ElDtoField(logicalName = "부가세", physicalName = "req_time_addtax_extexpns", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double req_time_addtax_extexpns;

    @ElDtoField(logicalName = "요청금액합계", physicalName = "req_amt_sum", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double req_amt_sum;

    @ElDtoField(logicalName = "내외자구분", physicalName = "inout_psn_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inout_psn_clsf_cd;

    @ElDtoField(logicalName = "편성단위", physicalName = "region_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String region_cd;

    @ElDtoField(logicalName = "한글품명", physicalName = "krchar_gdnm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String krchar_gdnm;

    @ElDtoField(logicalName = "영문품명", physicalName = "eng_gdnm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eng_gdnm;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "fcsyspayno", physicalName = "fcsyspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fcsyspayno;

    @ElVoField(physicalName = "req_unit_price")
    public double getReq_unit_price(){
        return req_unit_price;
    }

    @ElVoField(physicalName = "req_unit_price")
    public void setReq_unit_price(double req_unit_price){
        this.req_unit_price = req_unit_price;
    }

    @ElVoField(physicalName = "req_amt")
    public double getReq_amt(){
        return req_amt;
    }

    @ElVoField(physicalName = "req_amt")
    public void setReq_amt(double req_amt){
        this.req_amt = req_amt;
    }

    @ElVoField(physicalName = "req_time_addtax_extexpns")
    public double getReq_time_addtax_extexpns(){
        return req_time_addtax_extexpns;
    }

    @ElVoField(physicalName = "req_time_addtax_extexpns")
    public void setReq_time_addtax_extexpns(double req_time_addtax_extexpns){
        this.req_time_addtax_extexpns = req_time_addtax_extexpns;
    }

    @ElVoField(physicalName = "req_amt_sum")
    public double getReq_amt_sum(){
        return req_amt_sum;
    }

    @ElVoField(physicalName = "req_amt_sum")
    public void setReq_amt_sum(double req_amt_sum){
        this.req_amt_sum = req_amt_sum;
    }

    @ElVoField(physicalName = "inout_psn_clsf_cd")
    public String getInout_psn_clsf_cd(){
        return inout_psn_clsf_cd;
    }

    @ElVoField(physicalName = "inout_psn_clsf_cd")
    public void setInout_psn_clsf_cd(String inout_psn_clsf_cd){
        this.inout_psn_clsf_cd = inout_psn_clsf_cd;
    }

    @ElVoField(physicalName = "region_cd")
    public String getRegion_cd(){
        return region_cd;
    }

    @ElVoField(physicalName = "region_cd")
    public void setRegion_cd(String region_cd){
        this.region_cd = region_cd;
    }

    @ElVoField(physicalName = "krchar_gdnm")
    public String getKrchar_gdnm(){
        return krchar_gdnm;
    }

    @ElVoField(physicalName = "krchar_gdnm")
    public void setKrchar_gdnm(String krchar_gdnm){
        this.krchar_gdnm = krchar_gdnm;
    }

    @ElVoField(physicalName = "eng_gdnm")
    public String getEng_gdnm(){
        return eng_gdnm;
    }

    @ElVoField(physicalName = "eng_gdnm")
    public void setEng_gdnm(String eng_gdnm){
        this.eng_gdnm = eng_gdnm;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "fcsyspayno")
    public String getFcsyspayno(){
        return fcsyspayno;
    }

    @ElVoField(physicalName = "fcsyspayno")
    public void setFcsyspayno(String fcsyspayno){
        this.fcsyspayno = fcsyspayno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurReqItemAprVo [");
        sb.append("req_unit_price").append("=").append(req_unit_price).append(",");
        sb.append("req_amt").append("=").append(req_amt).append(",");
        sb.append("req_time_addtax_extexpns").append("=").append(req_time_addtax_extexpns).append(",");
        sb.append("req_amt_sum").append("=").append(req_amt_sum).append(",");
        sb.append("inout_psn_clsf_cd").append("=").append(inout_psn_clsf_cd).append(",");
        sb.append("region_cd").append("=").append(region_cd).append(",");
        sb.append("krchar_gdnm").append("=").append(krchar_gdnm).append(",");
        sb.append("eng_gdnm").append("=").append(eng_gdnm).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("fcsyspayno").append("=").append(fcsyspayno);
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
