package kr.re.kitech.biz.bud.frc.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "BudAuditElecVo")
public class BudAuditElecVo extends kr.re.kitech.biz.bud.frc.vo.BudAuditVo {
    private static final long serialVersionUID = 1L;

    public BudAuditElecVo(){
    }

    @ElDtoField(logicalName = "seq", physicalName = "seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seq;

    @ElDtoField(logicalName = "mngmtDeptNewYmd", physicalName = "mngmt_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_dept_new_ymd;

    @ElDtoField(logicalName = "rejOpnon", physicalName = "rej_opnon", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rej_opnon;

    @ElDtoField(logicalName = "aprTyp", physicalName = "apr_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_typ;

    @ElDtoField(logicalName = "enddate", physicalName = "enddate", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String enddate;

    @ElDtoField(logicalName = "reqSyspayno", physicalName = "req_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_syspayno;

    @ElDtoField(logicalName = "rcptContnt2", physicalName = "rcpt_contnt2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_contnt2;

    @ElVoField(physicalName = "seq")
    public String getSeq(){
        return seq;
    }

    @ElVoField(physicalName = "seq")
    public void setSeq(String seq){
        this.seq = seq;
    }

    @ElVoField(physicalName = "mngmt_dept_new_ymd")
    public String getMngmt_dept_new_ymd(){
        return mngmt_dept_new_ymd;
    }

    @ElVoField(physicalName = "mngmt_dept_new_ymd")
    public void setMngmt_dept_new_ymd(String mngmt_dept_new_ymd){
        this.mngmt_dept_new_ymd = mngmt_dept_new_ymd;
    }

    @ElVoField(physicalName = "rej_opnon")
    public String getRej_opnon(){
        return rej_opnon;
    }

    @ElVoField(physicalName = "rej_opnon")
    public void setRej_opnon(String rej_opnon){
        this.rej_opnon = rej_opnon;
    }

    @ElVoField(physicalName = "apr_typ")
    public String getApr_typ(){
        return apr_typ;
    }

    @ElVoField(physicalName = "apr_typ")
    public void setApr_typ(String apr_typ){
        this.apr_typ = apr_typ;
    }

    @ElVoField(physicalName = "enddate")
    public String getEnddate(){
        return enddate;
    }

    @ElVoField(physicalName = "enddate")
    public void setEnddate(String enddate){
        this.enddate = enddate;
    }

    @ElVoField(physicalName = "req_syspayno")
    public String getReq_syspayno(){
        return req_syspayno;
    }

    @ElVoField(physicalName = "req_syspayno")
    public void setReq_syspayno(String req_syspayno){
        this.req_syspayno = req_syspayno;
    }

    @ElVoField(physicalName = "rcpt_contnt2")
    public String getRcpt_contnt2(){
        return rcpt_contnt2;
    }

    @ElVoField(physicalName = "rcpt_contnt2")
    public void setRcpt_contnt2(String rcpt_contnt2){
        this.rcpt_contnt2 = rcpt_contnt2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BudAuditElecVo [");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("mngmt_dept_new_ymd").append("=").append(mngmt_dept_new_ymd).append(",");
        sb.append("rej_opnon").append("=").append(rej_opnon).append(",");
        sb.append("apr_typ").append("=").append(apr_typ).append(",");
        sb.append("enddate").append("=").append(enddate).append(",");
        sb.append("req_syspayno").append("=").append(req_syspayno).append(",");
        sb.append("rcpt_contnt2").append("=").append(rcpt_contnt2);
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
