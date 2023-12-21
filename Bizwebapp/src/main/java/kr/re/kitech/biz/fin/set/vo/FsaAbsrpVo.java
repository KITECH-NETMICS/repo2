package kr.re.kitech.biz.fin.set.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "ResStuCostSlip")
public class FsaAbsrpVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FsaAbsrpVo(){
    }

    @ElDtoField(logicalName = "unslipNo", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "No", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "accntNo", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "No", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "absrpYrmon", physicalName = "absrp_yrmon", type = "String", typeKind = "", fldYn = "", delimeterYn = "No", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String absrp_yrmon;

    @ElDtoField(logicalName = "accntCd", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "No", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;

    @ElDtoField(logicalName = "expnsCd", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd;

    @ElDtoField(logicalName = "odr", physicalName = "odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "No", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String odr;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "No", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "accntRspns", physicalName = "accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "No", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns;

    @ElDtoField(logicalName = "accntRspnsNm", physicalName = "accnt_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "No", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_nm;

    @ElDtoField(logicalName = "accnt_empno", physicalName = "accnt_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_empno;

    @ElDtoField(logicalName = "dept", physicalName = "dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "No", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept;

    @ElDtoField(logicalName = "deptNewYmd", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "accntNoNm", physicalName = "accnt_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "No", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_nm;

    @ElDtoField(logicalName = "bugtCtrlPsn", physicalName = "bugt_ctrl_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "No", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_psn;

    @ElDtoField(logicalName = "accntPrd", physicalName = "accnt_prd", type = "String", typeKind = "", fldYn = "", delimeterYn = "No", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_prd;

    @ElDtoField(logicalName = "cardUseEx", physicalName = "card_use_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "No", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_use_ex;

    @ElDtoField(logicalName = "fomatUnit", physicalName = "fomat_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "No", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fomat_unit;

    @ElDtoField(logicalName = "oriPlanAmt", physicalName = "ori_plan_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "No", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long ori_plan_amt;

    @ElDtoField(logicalName = "planAmt", physicalName = "plan_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "No", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long plan_amt;

    @ElDtoField(logicalName = "unslipAmt", physicalName = "unslip_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long unslip_amt;

    @ElDtoField(logicalName = "slipTyp", physicalName = "slip_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "No", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_typ;

    @ElDtoField(logicalName = "slipYmd", physicalName = "slip_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_ymd;

    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "reqYmd", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "itmSolveBase", physicalName = "itm_solve_base", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String itm_solve_base;

    @ElDtoField(logicalName = "absrpClsf", physicalName = "absrp_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String absrp_clsf;

    @ElDtoField(logicalName = "bfAbsrpYrmon", physicalName = "bf_absrp_yrmon", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bf_absrp_yrmon;

    @ElDtoField(logicalName = "bfOdr", physicalName = "bf_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bf_odr;

    @ElDtoField(logicalName = "regstSyspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "updtSyspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;

    @ElDtoField(logicalName = "belngYrmon", physicalName = "belng_yrmon", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String belng_yrmon;

    @ElDtoField(logicalName = "aprState", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "startYmd", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;

    @ElDtoField(logicalName = "clsYmd", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "aftrAccntRspns", physicalName = "aftr_accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aftr_accnt_rspns;

    @ElDtoField(logicalName = "accntCdNm", physicalName = "accnt_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd_nm;

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

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "absrp_yrmon")
    public String getAbsrp_yrmon(){
        return absrp_yrmon;
    }

    @ElVoField(physicalName = "absrp_yrmon")
    public void setAbsrp_yrmon(String absrp_yrmon){
        this.absrp_yrmon = absrp_yrmon;
    }

    @ElVoField(physicalName = "accnt_cd")
    public String getAccnt_cd(){
        return accnt_cd;
    }

    @ElVoField(physicalName = "accnt_cd")
    public void setAccnt_cd(String accnt_cd){
        this.accnt_cd = accnt_cd;
    }

    @ElVoField(physicalName = "expns_cd")
    public String getExpns_cd(){
        return expns_cd;
    }

    @ElVoField(physicalName = "expns_cd")
    public void setExpns_cd(String expns_cd){
        this.expns_cd = expns_cd;
    }

    @ElVoField(physicalName = "odr")
    public String getOdr(){
        return odr;
    }

    @ElVoField(physicalName = "odr")
    public void setOdr(String odr){
        this.odr = odr;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public String getAccnt_rspns(){
        return accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public void setAccnt_rspns(String accnt_rspns){
        this.accnt_rspns = accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public String getAccnt_rspns_nm(){
        return accnt_rspns_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public void setAccnt_rspns_nm(String accnt_rspns_nm){
        this.accnt_rspns_nm = accnt_rspns_nm;
    }

    @ElVoField(physicalName = "accnt_empno")
    public String getAccnt_empno(){
        return accnt_empno;
    }

    @ElVoField(physicalName = "accnt_empno")
    public void setAccnt_empno(String accnt_empno){
        this.accnt_empno = accnt_empno;
    }

    @ElVoField(physicalName = "dept")
    public String getDept(){
        return dept;
    }

    @ElVoField(physicalName = "dept")
    public void setDept(String dept){
        this.dept = dept;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public String getDept_new_ymd(){
        return dept_new_ymd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public void setDept_new_ymd(String dept_new_ymd){
        this.dept_new_ymd = dept_new_ymd;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public String getAccnt_no_nm(){
        return accnt_no_nm;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public void setAccnt_no_nm(String accnt_no_nm){
        this.accnt_no_nm = accnt_no_nm;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn")
    public String getBugt_ctrl_psn(){
        return bugt_ctrl_psn;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn")
    public void setBugt_ctrl_psn(String bugt_ctrl_psn){
        this.bugt_ctrl_psn = bugt_ctrl_psn;
    }

    @ElVoField(physicalName = "accnt_prd")
    public String getAccnt_prd(){
        return accnt_prd;
    }

    @ElVoField(physicalName = "accnt_prd")
    public void setAccnt_prd(String accnt_prd){
        this.accnt_prd = accnt_prd;
    }

    @ElVoField(physicalName = "card_use_ex")
    public String getCard_use_ex(){
        return card_use_ex;
    }

    @ElVoField(physicalName = "card_use_ex")
    public void setCard_use_ex(String card_use_ex){
        this.card_use_ex = card_use_ex;
    }

    @ElVoField(physicalName = "fomat_unit")
    public String getFomat_unit(){
        return fomat_unit;
    }

    @ElVoField(physicalName = "fomat_unit")
    public void setFomat_unit(String fomat_unit){
        this.fomat_unit = fomat_unit;
    }

    @ElVoField(physicalName = "ori_plan_amt")
    public long getOri_plan_amt(){
        return ori_plan_amt;
    }

    @ElVoField(physicalName = "ori_plan_amt")
    public void setOri_plan_amt(long ori_plan_amt){
        this.ori_plan_amt = ori_plan_amt;
    }

    @ElVoField(physicalName = "plan_amt")
    public long getPlan_amt(){
        return plan_amt;
    }

    @ElVoField(physicalName = "plan_amt")
    public void setPlan_amt(long plan_amt){
        this.plan_amt = plan_amt;
    }

    @ElVoField(physicalName = "unslip_amt")
    public long getUnslip_amt(){
        return unslip_amt;
    }

    @ElVoField(physicalName = "unslip_amt")
    public void setUnslip_amt(long unslip_amt){
        this.unslip_amt = unslip_amt;
    }

    @ElVoField(physicalName = "slip_typ")
    public String getSlip_typ(){
        return slip_typ;
    }

    @ElVoField(physicalName = "slip_typ")
    public void setSlip_typ(String slip_typ){
        this.slip_typ = slip_typ;
    }

    @ElVoField(physicalName = "slip_ymd")
    public String getSlip_ymd(){
        return slip_ymd;
    }

    @ElVoField(physicalName = "slip_ymd")
    public void setSlip_ymd(String slip_ymd){
        this.slip_ymd = slip_ymd;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "itm_solve_base")
    public String getItm_solve_base(){
        return itm_solve_base;
    }

    @ElVoField(physicalName = "itm_solve_base")
    public void setItm_solve_base(String itm_solve_base){
        this.itm_solve_base = itm_solve_base;
    }

    @ElVoField(physicalName = "absrp_clsf")
    public String getAbsrp_clsf(){
        return absrp_clsf;
    }

    @ElVoField(physicalName = "absrp_clsf")
    public void setAbsrp_clsf(String absrp_clsf){
        this.absrp_clsf = absrp_clsf;
    }

    @ElVoField(physicalName = "bf_absrp_yrmon")
    public String getBf_absrp_yrmon(){
        return bf_absrp_yrmon;
    }

    @ElVoField(physicalName = "bf_absrp_yrmon")
    public void setBf_absrp_yrmon(String bf_absrp_yrmon){
        this.bf_absrp_yrmon = bf_absrp_yrmon;
    }

    @ElVoField(physicalName = "bf_odr")
    public String getBf_odr(){
        return bf_odr;
    }

    @ElVoField(physicalName = "bf_odr")
    public void setBf_odr(String bf_odr){
        this.bf_odr = bf_odr;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public String getUpdt_syspayno(){
        return updt_syspayno;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public void setUpdt_syspayno(String updt_syspayno){
        this.updt_syspayno = updt_syspayno;
    }

    @ElVoField(physicalName = "belng_yrmon")
    public String getBelng_yrmon(){
        return belng_yrmon;
    }

    @ElVoField(physicalName = "belng_yrmon")
    public void setBelng_yrmon(String belng_yrmon){
        this.belng_yrmon = belng_yrmon;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "start_ymd")
    public String getStart_ymd(){
        return start_ymd;
    }

    @ElVoField(physicalName = "start_ymd")
    public void setStart_ymd(String start_ymd){
        this.start_ymd = start_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public String getCls_ymd(){
        return cls_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public void setCls_ymd(String cls_ymd){
        this.cls_ymd = cls_ymd;
    }

    @ElVoField(physicalName = "aftr_accnt_rspns")
    public String getAftr_accnt_rspns(){
        return aftr_accnt_rspns;
    }

    @ElVoField(physicalName = "aftr_accnt_rspns")
    public void setAftr_accnt_rspns(String aftr_accnt_rspns){
        this.aftr_accnt_rspns = aftr_accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_cd_nm")
    public String getAccnt_cd_nm(){
        return accnt_cd_nm;
    }

    @ElVoField(physicalName = "accnt_cd_nm")
    public void setAccnt_cd_nm(String accnt_cd_nm){
        this.accnt_cd_nm = accnt_cd_nm;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FsaAbsrpVo [");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("absrp_yrmon").append("=").append(absrp_yrmon).append(",");
        sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
        sb.append("expns_cd").append("=").append(expns_cd).append(",");
        sb.append("odr").append("=").append(odr).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("accnt_rspns").append("=").append(accnt_rspns).append(",");
        sb.append("accnt_rspns_nm").append("=").append(accnt_rspns_nm).append(",");
        sb.append("accnt_empno").append("=").append(accnt_empno).append(",");
        sb.append("dept").append("=").append(dept).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("accnt_no_nm").append("=").append(accnt_no_nm).append(",");
        sb.append("bugt_ctrl_psn").append("=").append(bugt_ctrl_psn).append(",");
        sb.append("accnt_prd").append("=").append(accnt_prd).append(",");
        sb.append("card_use_ex").append("=").append(card_use_ex).append(",");
        sb.append("fomat_unit").append("=").append(fomat_unit).append(",");
        sb.append("ori_plan_amt").append("=").append(ori_plan_amt).append(",");
        sb.append("plan_amt").append("=").append(plan_amt).append(",");
        sb.append("unslip_amt").append("=").append(unslip_amt).append(",");
        sb.append("slip_typ").append("=").append(slip_typ).append(",");
        sb.append("slip_ymd").append("=").append(slip_ymd).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("itm_solve_base").append("=").append(itm_solve_base).append(",");
        sb.append("absrp_clsf").append("=").append(absrp_clsf).append(",");
        sb.append("bf_absrp_yrmon").append("=").append(bf_absrp_yrmon).append(",");
        sb.append("bf_odr").append("=").append(bf_odr).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
        sb.append("belng_yrmon").append("=").append(belng_yrmon).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("aftr_accnt_rspns").append("=").append(aftr_accnt_rspns).append(",");
        sb.append("accnt_cd_nm").append("=").append(accnt_cd_nm).append(",");
        sb.append("cryfwd_bugt").append("=").append(cryfwd_bugt).append(",");
        sb.append("bugt_amt").append("=").append(bugt_amt).append(",");
        sb.append("req_amt").append("=").append(req_amt).append(",");
        sb.append("enfrc_amt").append("=").append(enfrc_amt).append(",");
        sb.append("relat_no").append("=").append(relat_no).append(",");
        sb.append("bugt_yr").append("=").append(bugt_yr);
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
