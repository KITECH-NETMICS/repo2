package kr.re.kitech.biz.ass.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "AssAppChaReqExp")
public class AssAppChaReqVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AssAppChaReqVo(){
    }

    @ElDtoField(logicalName = "asetTyp", physicalName = "aset_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_typ;

    @ElDtoField(logicalName = "userSyspayno", physicalName = "user_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_syspayno;

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "asetNo", physicalName = "aset_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_no;

    @ElDtoField(logicalName = "asetNm", physicalName = "aset_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_nm;

    @ElDtoField(logicalName = "introYmd", physicalName = "intro_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intro_ymd;

    @ElDtoField(logicalName = "introAmt", physicalName = "intro_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intro_amt;

    @ElDtoField(logicalName = "cause", physicalName = "cause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cause;

    @ElDtoField(logicalName = "transSyspayno", physicalName = "trans_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_syspayno;

    @ElDtoField(logicalName = "transNm", physicalName = "trans_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_nm;

    @ElDtoField(logicalName = "transEmpno", physicalName = "trans_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_empno;

    @ElDtoField(logicalName = "receiptSyspayno", physicalName = "receipt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String receipt_syspayno;

    @ElDtoField(logicalName = "receiptNm", physicalName = "receipt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String receipt_nm;

    @ElDtoField(logicalName = "receiptEmpno", physicalName = "receipt_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String receipt_empno;

    @ElDtoField(logicalName = "aprState", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElVoField(physicalName = "aset_typ")
    public String getAset_typ(){
        return aset_typ;
    }

    @ElVoField(physicalName = "aset_typ")
    public void setAset_typ(String aset_typ){
        this.aset_typ = aset_typ;
    }

    @ElVoField(physicalName = "user_syspayno")
    public String getUser_syspayno(){
        return user_syspayno;
    }

    @ElVoField(physicalName = "user_syspayno")
    public void setUser_syspayno(String user_syspayno){
        this.user_syspayno = user_syspayno;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "aset_no")
    public String getAset_no(){
        return aset_no;
    }

    @ElVoField(physicalName = "aset_no")
    public void setAset_no(String aset_no){
        this.aset_no = aset_no;
    }

    @ElVoField(physicalName = "aset_nm")
    public String getAset_nm(){
        return aset_nm;
    }

    @ElVoField(physicalName = "aset_nm")
    public void setAset_nm(String aset_nm){
        this.aset_nm = aset_nm;
    }

    @ElVoField(physicalName = "intro_ymd")
    public String getIntro_ymd(){
        return intro_ymd;
    }

    @ElVoField(physicalName = "intro_ymd")
    public void setIntro_ymd(String intro_ymd){
        this.intro_ymd = intro_ymd;
    }

    @ElVoField(physicalName = "intro_amt")
    public String getIntro_amt(){
        return intro_amt;
    }

    @ElVoField(physicalName = "intro_amt")
    public void setIntro_amt(String intro_amt){
        this.intro_amt = intro_amt;
    }

    @ElVoField(physicalName = "cause")
    public String getCause(){
        return cause;
    }

    @ElVoField(physicalName = "cause")
    public void setCause(String cause){
        this.cause = cause;
    }

    @ElVoField(physicalName = "trans_syspayno")
    public String getTrans_syspayno(){
        return trans_syspayno;
    }

    @ElVoField(physicalName = "trans_syspayno")
    public void setTrans_syspayno(String trans_syspayno){
        this.trans_syspayno = trans_syspayno;
    }

    @ElVoField(physicalName = "trans_nm")
    public String getTrans_nm(){
        return trans_nm;
    }

    @ElVoField(physicalName = "trans_nm")
    public void setTrans_nm(String trans_nm){
        this.trans_nm = trans_nm;
    }

    @ElVoField(physicalName = "trans_empno")
    public String getTrans_empno(){
        return trans_empno;
    }

    @ElVoField(physicalName = "trans_empno")
    public void setTrans_empno(String trans_empno){
        this.trans_empno = trans_empno;
    }

    @ElVoField(physicalName = "receipt_syspayno")
    public String getReceipt_syspayno(){
        return receipt_syspayno;
    }

    @ElVoField(physicalName = "receipt_syspayno")
    public void setReceipt_syspayno(String receipt_syspayno){
        this.receipt_syspayno = receipt_syspayno;
    }

    @ElVoField(physicalName = "receipt_nm")
    public String getReceipt_nm(){
        return receipt_nm;
    }

    @ElVoField(physicalName = "receipt_nm")
    public void setReceipt_nm(String receipt_nm){
        this.receipt_nm = receipt_nm;
    }

    @ElVoField(physicalName = "receipt_empno")
    public String getReceipt_empno(){
        return receipt_empno;
    }

    @ElVoField(physicalName = "receipt_empno")
    public void setReceipt_empno(String receipt_empno){
        this.receipt_empno = receipt_empno;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AssAppChaReqVo [");
        sb.append("aset_typ").append("=").append(aset_typ).append(",");
        sb.append("user_syspayno").append("=").append(user_syspayno).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("aset_no").append("=").append(aset_no).append(",");
        sb.append("aset_nm").append("=").append(aset_nm).append(",");
        sb.append("intro_ymd").append("=").append(intro_ymd).append(",");
        sb.append("intro_amt").append("=").append(intro_amt).append(",");
        sb.append("cause").append("=").append(cause).append(",");
        sb.append("trans_syspayno").append("=").append(trans_syspayno).append(",");
        sb.append("trans_nm").append("=").append(trans_nm).append(",");
        sb.append("trans_empno").append("=").append(trans_empno).append(",");
        sb.append("receipt_syspayno").append("=").append(receipt_syspayno).append(",");
        sb.append("receipt_nm").append("=").append(receipt_nm).append(",");
        sb.append("receipt_empno").append("=").append(receipt_empno).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm);
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
