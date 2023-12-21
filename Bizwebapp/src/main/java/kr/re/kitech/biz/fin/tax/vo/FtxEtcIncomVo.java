package kr.re.kitech.biz.fin.tax.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "기타소득 세부내역 Vo")
public class FtxEtcIncomVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FtxEtcIncomVo(){
    }

    @ElDtoField(logicalName = "관리연월", physicalName = "mngmt_yrmon", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_yrmon;

    @ElDtoField(logicalName = "관리번호", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;

    @ElDtoField(logicalName = "주민번호", physicalName = "resid_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resid_no;

    @ElDtoField(logicalName = "성명", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "주소", physicalName = "addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr;

    @ElDtoField(logicalName = "거주구분", physicalName = "resid_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resid_clsf;

    @ElDtoField(logicalName = "내국인구분", physicalName = "foctr_psn_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String foctr_psn_clsf;

    @ElDtoField(logicalName = "국적", physicalName = "resid_natn_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resid_natn_cd;

    @ElDtoField(logicalName = "소득구분코드", physicalName = "incom_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String incom_clsf;

    @ElDtoField(logicalName = "소득구분", physicalName = "incom_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String incom_clsf_nm;

    @ElDtoField(logicalName = "지급일자", physicalName = "pay_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pay_ymd;

    @ElDtoField(logicalName = "귀속연월", physicalName = "incom_belng_month", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String incom_belng_month;

    @ElDtoField(logicalName = "지급총액", physicalName = "pay_tot_liq", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long pay_tot_liq;

    @ElDtoField(logicalName = "필요경비", physicalName = "need_expns", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long need_expns;

    @ElDtoField(logicalName = "소득금액", physicalName = "incom_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long incom_amt;

    @ElDtoField(logicalName = "소득세", physicalName = "incomtax", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long incomtax;

    @ElDtoField(logicalName = "지방세", physicalName = "corptax", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long corptax;

    @ElDtoField(logicalName = "주민세", physicalName = "residtax", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long residtax;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "적요", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "mngmt_odr", physicalName = "mngmt_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_odr;

    @ElDtoField(logicalName = "등록자", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "등록일시", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "수정자", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;

    @ElDtoField(logicalName = "수정일시", physicalName = "updt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_daytm;

    @ElVoField(physicalName = "mngmt_yrmon")
    public String getMngmt_yrmon(){
        return mngmt_yrmon;
    }

    @ElVoField(physicalName = "mngmt_yrmon")
    public void setMngmt_yrmon(String mngmt_yrmon){
        this.mngmt_yrmon = mngmt_yrmon;
    }

    @ElVoField(physicalName = "mngmt_no")
    public String getMngmt_no(){
        return mngmt_no;
    }

    @ElVoField(physicalName = "mngmt_no")
    public void setMngmt_no(String mngmt_no){
        this.mngmt_no = mngmt_no;
    }

    @ElVoField(physicalName = "resid_no")
    public String getResid_no(){
        return resid_no;
    }

    @ElVoField(physicalName = "resid_no")
    public void setResid_no(String resid_no){
        this.resid_no = resid_no;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "addr")
    public String getAddr(){
        return addr;
    }

    @ElVoField(physicalName = "addr")
    public void setAddr(String addr){
        this.addr = addr;
    }

    @ElVoField(physicalName = "resid_clsf")
    public String getResid_clsf(){
        return resid_clsf;
    }

    @ElVoField(physicalName = "resid_clsf")
    public void setResid_clsf(String resid_clsf){
        this.resid_clsf = resid_clsf;
    }

    @ElVoField(physicalName = "foctr_psn_clsf")
    public String getFoctr_psn_clsf(){
        return foctr_psn_clsf;
    }

    @ElVoField(physicalName = "foctr_psn_clsf")
    public void setFoctr_psn_clsf(String foctr_psn_clsf){
        this.foctr_psn_clsf = foctr_psn_clsf;
    }

    @ElVoField(physicalName = "resid_natn_cd")
    public String getResid_natn_cd(){
        return resid_natn_cd;
    }

    @ElVoField(physicalName = "resid_natn_cd")
    public void setResid_natn_cd(String resid_natn_cd){
        this.resid_natn_cd = resid_natn_cd;
    }

    @ElVoField(physicalName = "incom_clsf")
    public String getIncom_clsf(){
        return incom_clsf;
    }

    @ElVoField(physicalName = "incom_clsf")
    public void setIncom_clsf(String incom_clsf){
        this.incom_clsf = incom_clsf;
    }

    @ElVoField(physicalName = "incom_clsf_nm")
    public String getIncom_clsf_nm(){
        return incom_clsf_nm;
    }

    @ElVoField(physicalName = "incom_clsf_nm")
    public void setIncom_clsf_nm(String incom_clsf_nm){
        this.incom_clsf_nm = incom_clsf_nm;
    }

    @ElVoField(physicalName = "pay_ymd")
    public String getPay_ymd(){
        return pay_ymd;
    }

    @ElVoField(physicalName = "pay_ymd")
    public void setPay_ymd(String pay_ymd){
        this.pay_ymd = pay_ymd;
    }

    @ElVoField(physicalName = "incom_belng_month")
    public String getIncom_belng_month(){
        return incom_belng_month;
    }

    @ElVoField(physicalName = "incom_belng_month")
    public void setIncom_belng_month(String incom_belng_month){
        this.incom_belng_month = incom_belng_month;
    }

    @ElVoField(physicalName = "pay_tot_liq")
    public long getPay_tot_liq(){
        return pay_tot_liq;
    }

    @ElVoField(physicalName = "pay_tot_liq")
    public void setPay_tot_liq(long pay_tot_liq){
        this.pay_tot_liq = pay_tot_liq;
    }

    @ElVoField(physicalName = "need_expns")
    public long getNeed_expns(){
        return need_expns;
    }

    @ElVoField(physicalName = "need_expns")
    public void setNeed_expns(long need_expns){
        this.need_expns = need_expns;
    }

    @ElVoField(physicalName = "incom_amt")
    public long getIncom_amt(){
        return incom_amt;
    }

    @ElVoField(physicalName = "incom_amt")
    public void setIncom_amt(long incom_amt){
        this.incom_amt = incom_amt;
    }

    @ElVoField(physicalName = "incomtax")
    public long getIncomtax(){
        return incomtax;
    }

    @ElVoField(physicalName = "incomtax")
    public void setIncomtax(long incomtax){
        this.incomtax = incomtax;
    }

    @ElVoField(physicalName = "corptax")
    public long getCorptax(){
        return corptax;
    }

    @ElVoField(physicalName = "corptax")
    public void setCorptax(long corptax){
        this.corptax = corptax;
    }

    @ElVoField(physicalName = "residtax")
    public long getResidtax(){
        return residtax;
    }

    @ElVoField(physicalName = "residtax")
    public void setResidtax(long residtax){
        this.residtax = residtax;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "mngmt_odr")
    public String getMngmt_odr(){
        return mngmt_odr;
    }

    @ElVoField(physicalName = "mngmt_odr")
    public void setMngmt_odr(String mngmt_odr){
        this.mngmt_odr = mngmt_odr;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FtxEtcIncomVo [");
        sb.append("mngmt_yrmon").append("=").append(mngmt_yrmon).append(",");
        sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
        sb.append("resid_no").append("=").append(resid_no).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("addr").append("=").append(addr).append(",");
        sb.append("resid_clsf").append("=").append(resid_clsf).append(",");
        sb.append("foctr_psn_clsf").append("=").append(foctr_psn_clsf).append(",");
        sb.append("resid_natn_cd").append("=").append(resid_natn_cd).append(",");
        sb.append("incom_clsf").append("=").append(incom_clsf).append(",");
        sb.append("incom_clsf_nm").append("=").append(incom_clsf_nm).append(",");
        sb.append("pay_ymd").append("=").append(pay_ymd).append(",");
        sb.append("incom_belng_month").append("=").append(incom_belng_month).append(",");
        sb.append("pay_tot_liq").append("=").append(pay_tot_liq).append(",");
        sb.append("need_expns").append("=").append(need_expns).append(",");
        sb.append("incom_amt").append("=").append(incom_amt).append(",");
        sb.append("incomtax").append("=").append(incomtax).append(",");
        sb.append("corptax").append("=").append(corptax).append(",");
        sb.append("residtax").append("=").append(residtax).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("mngmt_odr").append("=").append(mngmt_odr).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
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
