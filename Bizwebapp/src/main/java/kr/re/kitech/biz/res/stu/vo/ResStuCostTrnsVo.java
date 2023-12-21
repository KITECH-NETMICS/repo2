package kr.re.kitech.biz.res.stu.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "ResStuCostTrnsExp")
public class ResStuCostTrnsVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResStuCostTrnsVo(){
    }

    @ElDtoField(logicalName = "slipYmdSt", physicalName = "slip_ymd_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_ymd_st;

    @ElDtoField(logicalName = "slipYmdEd", physicalName = "slip_ymd_ed", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_ymd_ed;

    @ElDtoField(logicalName = "unslipNo", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "decsnEx", physicalName = "decsn_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_ex;

    @ElDtoField(logicalName = "accntRspns", physicalName = "accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns;

    @ElDtoField(logicalName = "accntNo", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "slipYmd", physicalName = "slip_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_ymd;

    @ElDtoField(logicalName = "accntYmd", physicalName = "accnt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_ymd;

    @ElDtoField(logicalName = "wrtePsn", physicalName = "wrte_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_psn;

    @ElDtoField(logicalName = "wrtePsnNm", physicalName = "wrte_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_psn_nm;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "slipNo", physicalName = "slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_no;

    @ElDtoField(logicalName = "decsnPsn", physicalName = "decsn_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_psn;

    @ElDtoField(logicalName = "decsnPsnNm", physicalName = "decsn_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_psn_nm;

    @ElDtoField(logicalName = "aprState", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "absrpYrmon", physicalName = "absrp_yrmon", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String absrp_yrmon;

    @ElDtoField(logicalName = "slipTyp", physicalName = "slip_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_typ;

    @ElDtoField(logicalName = "unslipAmt", physicalName = "unslip_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long unslip_amt;

    @ElDtoField(logicalName = "accntCd", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;

    @ElDtoField(logicalName = "accntCdNm", physicalName = "accnt_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd_nm;

    @ElDtoField(logicalName = "accntEmpno", physicalName = "accnt_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_empno;

    @ElDtoField(logicalName = "accntRspnsNm", physicalName = "accnt_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_nm;

    @ElDtoField(logicalName = "cryfwdBugt", physicalName = "cryfwd_bugt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long cryfwd_bugt;

    @ElDtoField(logicalName = "bugtAmt", physicalName = "bugt_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long bugt_amt;

    @ElDtoField(logicalName = "reqAmt", physicalName = "req_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long req_amt;

    @ElDtoField(logicalName = "enfrcAmt", physicalName = "enfrc_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long enfrc_amt;

    @ElDtoField(logicalName = "relatNo", physicalName = "relat_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat_no;

    @ElDtoField(logicalName = "bugtYr", physicalName = "bugt_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_yr;

    @ElDtoField(logicalName = "res_manager", physicalName = "res_manager", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_manager;

    @ElDtoField(logicalName = "ctrl_manager", physicalName = "ctrl_manager", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctrl_manager;

    @ElVoField(physicalName = "slip_ymd_st")
    public String getSlip_ymd_st(){
        return slip_ymd_st;
    }

    @ElVoField(physicalName = "slip_ymd_st")
    public void setSlip_ymd_st(String slip_ymd_st){
        this.slip_ymd_st = slip_ymd_st;
    }

    @ElVoField(physicalName = "slip_ymd_ed")
    public String getSlip_ymd_ed(){
        return slip_ymd_ed;
    }

    @ElVoField(physicalName = "slip_ymd_ed")
    public void setSlip_ymd_ed(String slip_ymd_ed){
        this.slip_ymd_ed = slip_ymd_ed;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "decsn_ex")
    public String getDecsn_ex(){
        return decsn_ex;
    }

    @ElVoField(physicalName = "decsn_ex")
    public void setDecsn_ex(String decsn_ex){
        this.decsn_ex = decsn_ex;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public String getAccnt_rspns(){
        return accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public void setAccnt_rspns(String accnt_rspns){
        this.accnt_rspns = accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "slip_ymd")
    public String getSlip_ymd(){
        return slip_ymd;
    }

    @ElVoField(physicalName = "slip_ymd")
    public void setSlip_ymd(String slip_ymd){
        this.slip_ymd = slip_ymd;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public String getAccnt_ymd(){
        return accnt_ymd;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public void setAccnt_ymd(String accnt_ymd){
        this.accnt_ymd = accnt_ymd;
    }

    @ElVoField(physicalName = "wrte_psn")
    public String getWrte_psn(){
        return wrte_psn;
    }

    @ElVoField(physicalName = "wrte_psn")
    public void setWrte_psn(String wrte_psn){
        this.wrte_psn = wrte_psn;
    }

    @ElVoField(physicalName = "wrte_psn_nm")
    public String getWrte_psn_nm(){
        return wrte_psn_nm;
    }

    @ElVoField(physicalName = "wrte_psn_nm")
    public void setWrte_psn_nm(String wrte_psn_nm){
        this.wrte_psn_nm = wrte_psn_nm;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "slip_no")
    public String getSlip_no(){
        return slip_no;
    }

    @ElVoField(physicalName = "slip_no")
    public void setSlip_no(String slip_no){
        this.slip_no = slip_no;
    }

    @ElVoField(physicalName = "decsn_psn")
    public String getDecsn_psn(){
        return decsn_psn;
    }

    @ElVoField(physicalName = "decsn_psn")
    public void setDecsn_psn(String decsn_psn){
        this.decsn_psn = decsn_psn;
    }

    @ElVoField(physicalName = "decsn_psn_nm")
    public String getDecsn_psn_nm(){
        return decsn_psn_nm;
    }

    @ElVoField(physicalName = "decsn_psn_nm")
    public void setDecsn_psn_nm(String decsn_psn_nm){
        this.decsn_psn_nm = decsn_psn_nm;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "absrp_yrmon")
    public String getAbsrp_yrmon(){
        return absrp_yrmon;
    }

    @ElVoField(physicalName = "absrp_yrmon")
    public void setAbsrp_yrmon(String absrp_yrmon){
        this.absrp_yrmon = absrp_yrmon;
    }

    @ElVoField(physicalName = "slip_typ")
    public String getSlip_typ(){
        return slip_typ;
    }

    @ElVoField(physicalName = "slip_typ")
    public void setSlip_typ(String slip_typ){
        this.slip_typ = slip_typ;
    }

    @ElVoField(physicalName = "unslip_amt")
    public long getUnslip_amt(){
        return unslip_amt;
    }

    @ElVoField(physicalName = "unslip_amt")
    public void setUnslip_amt(long unslip_amt){
        this.unslip_amt = unslip_amt;
    }

    @ElVoField(physicalName = "accnt_cd")
    public String getAccnt_cd(){
        return accnt_cd;
    }

    @ElVoField(physicalName = "accnt_cd")
    public void setAccnt_cd(String accnt_cd){
        this.accnt_cd = accnt_cd;
    }

    @ElVoField(physicalName = "accnt_cd_nm")
    public String getAccnt_cd_nm(){
        return accnt_cd_nm;
    }

    @ElVoField(physicalName = "accnt_cd_nm")
    public void setAccnt_cd_nm(String accnt_cd_nm){
        this.accnt_cd_nm = accnt_cd_nm;
    }

    @ElVoField(physicalName = "accnt_empno")
    public String getAccnt_empno(){
        return accnt_empno;
    }

    @ElVoField(physicalName = "accnt_empno")
    public void setAccnt_empno(String accnt_empno){
        this.accnt_empno = accnt_empno;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public String getAccnt_rspns_nm(){
        return accnt_rspns_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public void setAccnt_rspns_nm(String accnt_rspns_nm){
        this.accnt_rspns_nm = accnt_rspns_nm;
    }

    @ElVoField(physicalName = "cryfwd_bugt")
    public long getCryfwd_bugt(){
        return cryfwd_bugt;
    }

    @ElVoField(physicalName = "cryfwd_bugt")
    public void setCryfwd_bugt(long cryfwd_bugt){
        this.cryfwd_bugt = cryfwd_bugt;
    }

    @ElVoField(physicalName = "bugt_amt")
    public long getBugt_amt(){
        return bugt_amt;
    }

    @ElVoField(physicalName = "bugt_amt")
    public void setBugt_amt(long bugt_amt){
        this.bugt_amt = bugt_amt;
    }

    @ElVoField(physicalName = "req_amt")
    public long getReq_amt(){
        return req_amt;
    }

    @ElVoField(physicalName = "req_amt")
    public void setReq_amt(long req_amt){
        this.req_amt = req_amt;
    }

    @ElVoField(physicalName = "enfrc_amt")
    public long getEnfrc_amt(){
        return enfrc_amt;
    }

    @ElVoField(physicalName = "enfrc_amt")
    public void setEnfrc_amt(long enfrc_amt){
        this.enfrc_amt = enfrc_amt;
    }

    @ElVoField(physicalName = "relat_no")
    public String getRelat_no(){
        return relat_no;
    }

    @ElVoField(physicalName = "relat_no")
    public void setRelat_no(String relat_no){
        this.relat_no = relat_no;
    }

    @ElVoField(physicalName = "bugt_yr")
    public String getBugt_yr(){
        return bugt_yr;
    }

    @ElVoField(physicalName = "bugt_yr")
    public void setBugt_yr(String bugt_yr){
        this.bugt_yr = bugt_yr;
    }

    @ElVoField(physicalName = "res_manager")
    public String getRes_manager(){
        return res_manager;
    }

    @ElVoField(physicalName = "res_manager")
    public void setRes_manager(String res_manager){
        this.res_manager = res_manager;
    }

    @ElVoField(physicalName = "ctrl_manager")
    public String getCtrl_manager(){
        return ctrl_manager;
    }

    @ElVoField(physicalName = "ctrl_manager")
    public void setCtrl_manager(String ctrl_manager){
        this.ctrl_manager = ctrl_manager;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResStuCostTrnsVo [");
        sb.append("slip_ymd_st").append("=").append(slip_ymd_st).append(",");
        sb.append("slip_ymd_ed").append("=").append(slip_ymd_ed).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("decsn_ex").append("=").append(decsn_ex).append(",");
        sb.append("accnt_rspns").append("=").append(accnt_rspns).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("slip_ymd").append("=").append(slip_ymd).append(",");
        sb.append("accnt_ymd").append("=").append(accnt_ymd).append(",");
        sb.append("wrte_psn").append("=").append(wrte_psn).append(",");
        sb.append("wrte_psn_nm").append("=").append(wrte_psn_nm).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("slip_no").append("=").append(slip_no).append(",");
        sb.append("decsn_psn").append("=").append(decsn_psn).append(",");
        sb.append("decsn_psn_nm").append("=").append(decsn_psn_nm).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("absrp_yrmon").append("=").append(absrp_yrmon).append(",");
        sb.append("slip_typ").append("=").append(slip_typ).append(",");
        sb.append("unslip_amt").append("=").append(unslip_amt).append(",");
        sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
        sb.append("accnt_cd_nm").append("=").append(accnt_cd_nm).append(",");
        sb.append("accnt_empno").append("=").append(accnt_empno).append(",");
        sb.append("accnt_rspns_nm").append("=").append(accnt_rspns_nm).append(",");
        sb.append("cryfwd_bugt").append("=").append(cryfwd_bugt).append(",");
        sb.append("bugt_amt").append("=").append(bugt_amt).append(",");
        sb.append("req_amt").append("=").append(req_amt).append(",");
        sb.append("enfrc_amt").append("=").append(enfrc_amt).append(",");
        sb.append("relat_no").append("=").append(relat_no).append(",");
        sb.append("bugt_yr").append("=").append(bugt_yr).append(",");
        sb.append("res_manager").append("=").append(res_manager).append(",");
        sb.append("ctrl_manager").append("=").append(ctrl_manager);
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
