package kr.re.kitech.biz.ass.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "자산 이동신청 조회 VO")
public class AssAppMoveReqSrchVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AssAppMoveReqSrchVo(){
    }

    @ElDtoField(logicalName = "aprState", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "asetTyp", physicalName = "aset_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_typ;

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "asetNo", physicalName = "aset_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_no;

    @ElDtoField(logicalName = "moveClsf", physicalName = "move_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String move_clsf;

    @ElDtoField(logicalName = "asetNm", physicalName = "aset_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_nm;

    @ElDtoField(logicalName = "userSyspayno", physicalName = "user_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_syspayno;

    @ElDtoField(logicalName = "reqYmdSt", physicalName = "req_ymd_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd_st;

    @ElDtoField(logicalName = "reqYmdEd", physicalName = "req_ymd_ed", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd_ed;

    @ElDtoField(logicalName = "mngmtMbody", physicalName = "mngmt_mbody", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_mbody;

    @ElDtoField(logicalName = "brinSchdlYmdSt", physicalName = "brin_schdl_ymd_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String brin_schdl_ymd_st;

    @ElDtoField(logicalName = "brinSchdlYmdEd", physicalName = "brin_schdl_ymd_ed", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String brin_schdl_ymd_ed;

    @ElDtoField(logicalName = "reqYmd", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "asetClsf", physicalName = "aset_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_clsf;

    @ElDtoField(logicalName = "oldAsetNo", physicalName = "old_aset_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String old_aset_no;

    @ElDtoField(logicalName = "introYmd", physicalName = "intro_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intro_ymd;

    @ElDtoField(logicalName = "introAmt", physicalName = "intro_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intro_amt;

    @ElDtoField(logicalName = "userNm", physicalName = "user_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_nm;

    @ElDtoField(logicalName = "userEmpno", physicalName = "user_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_empno;

    @ElDtoField(logicalName = "userDeptNm", physicalName = "user_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_dept_nm;

    @ElDtoField(logicalName = "respnSyspayno", physicalName = "respn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String respn_syspayno;

    @ElDtoField(logicalName = "respnNm", physicalName = "respn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String respn_nm;

    @ElDtoField(logicalName = "respnEmpno", physicalName = "respn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String respn_empno;

    @ElDtoField(logicalName = "brinSchdlYmd", physicalName = "brin_schdl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String brin_schdl_ymd;

    @ElDtoField(logicalName = "toutSchdlYmd", physicalName = "tout_schdl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tout_schdl_ymd;

    @ElDtoField(logicalName = "wrteNm", physicalName = "wrte_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_nm;

    @ElDtoField(logicalName = "toutEmpno", physicalName = "tout_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tout_empno;

    @ElDtoField(logicalName = "toutNm", physicalName = "tout_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tout_nm;

    @ElDtoField(logicalName = "cause", physicalName = "cause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cause;

    @ElDtoField(logicalName = "posi", physicalName = "posi", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi;

    @ElDtoField(logicalName = "toutYmd", physicalName = "tout_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tout_ymd;

    @ElDtoField(logicalName = "toutAffirYmd", physicalName = "tout_affir_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tout_affir_ymd;

    @ElDtoField(logicalName = "toutAffirNm", physicalName = "tout_affir_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tout_affir_nm;

    @ElDtoField(logicalName = "brinYmd", physicalName = "brin_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String brin_ymd;

    @ElDtoField(logicalName = "brinAffirYmd", physicalName = "brin_affir_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String brin_affir_ymd;

    @ElDtoField(logicalName = "brinAffirNm", physicalName = "brin_affir_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String brin_affir_nm;

    @ElDtoField(logicalName = "prjNm", physicalName = "prj_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_nm;

    @ElDtoField(logicalName = "instlVendNm", physicalName = "instl_vend_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String instl_vend_nm;

    @ElDtoField(logicalName = "aftrMngmtEx", physicalName = "aftr_mngmt_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aftr_mngmt_ex;

    @ElDtoField(logicalName = "instlVendCharg", physicalName = "instl_vend_charg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String instl_vend_charg;

    @ElDtoField(logicalName = "instlVendChargTel", physicalName = "instl_vend_charg_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String instl_vend_charg_tel;

    @ElDtoField(logicalName = "outInstlYmdSt", physicalName = "out_instl_ymd_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String out_instl_ymd_st;

    @ElDtoField(logicalName = "outInstlYmdEd", physicalName = "out_instl_ymd_ed", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String out_instl_ymd_ed;

    @ElDtoField(logicalName = "mngmtMbodyNm", physicalName = "mngmt_mbody_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_mbody_nm;

    @ElDtoField(logicalName = "asetClsfNm", physicalName = "aset_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_clsf_nm;

    @ElDtoField(logicalName = "moveClsfNm", physicalName = "move_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String move_clsf_nm;

    @ElDtoField(logicalName = "aprStateNm", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_nm;

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "aset_typ")
    public String getAset_typ(){
        return aset_typ;
    }

    @ElVoField(physicalName = "aset_typ")
    public void setAset_typ(String aset_typ){
        this.aset_typ = aset_typ;
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

    @ElVoField(physicalName = "move_clsf")
    public String getMove_clsf(){
        return move_clsf;
    }

    @ElVoField(physicalName = "move_clsf")
    public void setMove_clsf(String move_clsf){
        this.move_clsf = move_clsf;
    }

    @ElVoField(physicalName = "aset_nm")
    public String getAset_nm(){
        return aset_nm;
    }

    @ElVoField(physicalName = "aset_nm")
    public void setAset_nm(String aset_nm){
        this.aset_nm = aset_nm;
    }

    @ElVoField(physicalName = "user_syspayno")
    public String getUser_syspayno(){
        return user_syspayno;
    }

    @ElVoField(physicalName = "user_syspayno")
    public void setUser_syspayno(String user_syspayno){
        this.user_syspayno = user_syspayno;
    }

    @ElVoField(physicalName = "req_ymd_st")
    public String getReq_ymd_st(){
        return req_ymd_st;
    }

    @ElVoField(physicalName = "req_ymd_st")
    public void setReq_ymd_st(String req_ymd_st){
        this.req_ymd_st = req_ymd_st;
    }

    @ElVoField(physicalName = "req_ymd_ed")
    public String getReq_ymd_ed(){
        return req_ymd_ed;
    }

    @ElVoField(physicalName = "req_ymd_ed")
    public void setReq_ymd_ed(String req_ymd_ed){
        this.req_ymd_ed = req_ymd_ed;
    }

    @ElVoField(physicalName = "mngmt_mbody")
    public String getMngmt_mbody(){
        return mngmt_mbody;
    }

    @ElVoField(physicalName = "mngmt_mbody")
    public void setMngmt_mbody(String mngmt_mbody){
        this.mngmt_mbody = mngmt_mbody;
    }

    @ElVoField(physicalName = "brin_schdl_ymd_st")
    public String getBrin_schdl_ymd_st(){
        return brin_schdl_ymd_st;
    }

    @ElVoField(physicalName = "brin_schdl_ymd_st")
    public void setBrin_schdl_ymd_st(String brin_schdl_ymd_st){
        this.brin_schdl_ymd_st = brin_schdl_ymd_st;
    }

    @ElVoField(physicalName = "brin_schdl_ymd_ed")
    public String getBrin_schdl_ymd_ed(){
        return brin_schdl_ymd_ed;
    }

    @ElVoField(physicalName = "brin_schdl_ymd_ed")
    public void setBrin_schdl_ymd_ed(String brin_schdl_ymd_ed){
        this.brin_schdl_ymd_ed = brin_schdl_ymd_ed;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "aset_clsf")
    public String getAset_clsf(){
        return aset_clsf;
    }

    @ElVoField(physicalName = "aset_clsf")
    public void setAset_clsf(String aset_clsf){
        this.aset_clsf = aset_clsf;
    }

    @ElVoField(physicalName = "old_aset_no")
    public String getOld_aset_no(){
        return old_aset_no;
    }

    @ElVoField(physicalName = "old_aset_no")
    public void setOld_aset_no(String old_aset_no){
        this.old_aset_no = old_aset_no;
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

    @ElVoField(physicalName = "user_nm")
    public String getUser_nm(){
        return user_nm;
    }

    @ElVoField(physicalName = "user_nm")
    public void setUser_nm(String user_nm){
        this.user_nm = user_nm;
    }

    @ElVoField(physicalName = "user_empno")
    public String getUser_empno(){
        return user_empno;
    }

    @ElVoField(physicalName = "user_empno")
    public void setUser_empno(String user_empno){
        this.user_empno = user_empno;
    }

    @ElVoField(physicalName = "user_dept_nm")
    public String getUser_dept_nm(){
        return user_dept_nm;
    }

    @ElVoField(physicalName = "user_dept_nm")
    public void setUser_dept_nm(String user_dept_nm){
        this.user_dept_nm = user_dept_nm;
    }

    @ElVoField(physicalName = "respn_syspayno")
    public String getRespn_syspayno(){
        return respn_syspayno;
    }

    @ElVoField(physicalName = "respn_syspayno")
    public void setRespn_syspayno(String respn_syspayno){
        this.respn_syspayno = respn_syspayno;
    }

    @ElVoField(physicalName = "respn_nm")
    public String getRespn_nm(){
        return respn_nm;
    }

    @ElVoField(physicalName = "respn_nm")
    public void setRespn_nm(String respn_nm){
        this.respn_nm = respn_nm;
    }

    @ElVoField(physicalName = "respn_empno")
    public String getRespn_empno(){
        return respn_empno;
    }

    @ElVoField(physicalName = "respn_empno")
    public void setRespn_empno(String respn_empno){
        this.respn_empno = respn_empno;
    }

    @ElVoField(physicalName = "brin_schdl_ymd")
    public String getBrin_schdl_ymd(){
        return brin_schdl_ymd;
    }

    @ElVoField(physicalName = "brin_schdl_ymd")
    public void setBrin_schdl_ymd(String brin_schdl_ymd){
        this.brin_schdl_ymd = brin_schdl_ymd;
    }

    @ElVoField(physicalName = "tout_schdl_ymd")
    public String getTout_schdl_ymd(){
        return tout_schdl_ymd;
    }

    @ElVoField(physicalName = "tout_schdl_ymd")
    public void setTout_schdl_ymd(String tout_schdl_ymd){
        this.tout_schdl_ymd = tout_schdl_ymd;
    }

    @ElVoField(physicalName = "wrte_nm")
    public String getWrte_nm(){
        return wrte_nm;
    }

    @ElVoField(physicalName = "wrte_nm")
    public void setWrte_nm(String wrte_nm){
        this.wrte_nm = wrte_nm;
    }

    @ElVoField(physicalName = "tout_empno")
    public String getTout_empno(){
        return tout_empno;
    }

    @ElVoField(physicalName = "tout_empno")
    public void setTout_empno(String tout_empno){
        this.tout_empno = tout_empno;
    }

    @ElVoField(physicalName = "tout_nm")
    public String getTout_nm(){
        return tout_nm;
    }

    @ElVoField(physicalName = "tout_nm")
    public void setTout_nm(String tout_nm){
        this.tout_nm = tout_nm;
    }

    @ElVoField(physicalName = "cause")
    public String getCause(){
        return cause;
    }

    @ElVoField(physicalName = "cause")
    public void setCause(String cause){
        this.cause = cause;
    }

    @ElVoField(physicalName = "posi")
    public String getPosi(){
        return posi;
    }

    @ElVoField(physicalName = "posi")
    public void setPosi(String posi){
        this.posi = posi;
    }

    @ElVoField(physicalName = "tout_ymd")
    public String getTout_ymd(){
        return tout_ymd;
    }

    @ElVoField(physicalName = "tout_ymd")
    public void setTout_ymd(String tout_ymd){
        this.tout_ymd = tout_ymd;
    }

    @ElVoField(physicalName = "tout_affir_ymd")
    public String getTout_affir_ymd(){
        return tout_affir_ymd;
    }

    @ElVoField(physicalName = "tout_affir_ymd")
    public void setTout_affir_ymd(String tout_affir_ymd){
        this.tout_affir_ymd = tout_affir_ymd;
    }

    @ElVoField(physicalName = "tout_affir_nm")
    public String getTout_affir_nm(){
        return tout_affir_nm;
    }

    @ElVoField(physicalName = "tout_affir_nm")
    public void setTout_affir_nm(String tout_affir_nm){
        this.tout_affir_nm = tout_affir_nm;
    }

    @ElVoField(physicalName = "brin_ymd")
    public String getBrin_ymd(){
        return brin_ymd;
    }

    @ElVoField(physicalName = "brin_ymd")
    public void setBrin_ymd(String brin_ymd){
        this.brin_ymd = brin_ymd;
    }

    @ElVoField(physicalName = "brin_affir_ymd")
    public String getBrin_affir_ymd(){
        return brin_affir_ymd;
    }

    @ElVoField(physicalName = "brin_affir_ymd")
    public void setBrin_affir_ymd(String brin_affir_ymd){
        this.brin_affir_ymd = brin_affir_ymd;
    }

    @ElVoField(physicalName = "brin_affir_nm")
    public String getBrin_affir_nm(){
        return brin_affir_nm;
    }

    @ElVoField(physicalName = "brin_affir_nm")
    public void setBrin_affir_nm(String brin_affir_nm){
        this.brin_affir_nm = brin_affir_nm;
    }

    @ElVoField(physicalName = "prj_nm")
    public String getPrj_nm(){
        return prj_nm;
    }

    @ElVoField(physicalName = "prj_nm")
    public void setPrj_nm(String prj_nm){
        this.prj_nm = prj_nm;
    }

    @ElVoField(physicalName = "instl_vend_nm")
    public String getInstl_vend_nm(){
        return instl_vend_nm;
    }

    @ElVoField(physicalName = "instl_vend_nm")
    public void setInstl_vend_nm(String instl_vend_nm){
        this.instl_vend_nm = instl_vend_nm;
    }

    @ElVoField(physicalName = "aftr_mngmt_ex")
    public String getAftr_mngmt_ex(){
        return aftr_mngmt_ex;
    }

    @ElVoField(physicalName = "aftr_mngmt_ex")
    public void setAftr_mngmt_ex(String aftr_mngmt_ex){
        this.aftr_mngmt_ex = aftr_mngmt_ex;
    }

    @ElVoField(physicalName = "instl_vend_charg")
    public String getInstl_vend_charg(){
        return instl_vend_charg;
    }

    @ElVoField(physicalName = "instl_vend_charg")
    public void setInstl_vend_charg(String instl_vend_charg){
        this.instl_vend_charg = instl_vend_charg;
    }

    @ElVoField(physicalName = "instl_vend_charg_tel")
    public String getInstl_vend_charg_tel(){
        return instl_vend_charg_tel;
    }

    @ElVoField(physicalName = "instl_vend_charg_tel")
    public void setInstl_vend_charg_tel(String instl_vend_charg_tel){
        this.instl_vend_charg_tel = instl_vend_charg_tel;
    }

    @ElVoField(physicalName = "out_instl_ymd_st")
    public String getOut_instl_ymd_st(){
        return out_instl_ymd_st;
    }

    @ElVoField(physicalName = "out_instl_ymd_st")
    public void setOut_instl_ymd_st(String out_instl_ymd_st){
        this.out_instl_ymd_st = out_instl_ymd_st;
    }

    @ElVoField(physicalName = "out_instl_ymd_ed")
    public String getOut_instl_ymd_ed(){
        return out_instl_ymd_ed;
    }

    @ElVoField(physicalName = "out_instl_ymd_ed")
    public void setOut_instl_ymd_ed(String out_instl_ymd_ed){
        this.out_instl_ymd_ed = out_instl_ymd_ed;
    }

    @ElVoField(physicalName = "mngmt_mbody_nm")
    public String getMngmt_mbody_nm(){
        return mngmt_mbody_nm;
    }

    @ElVoField(physicalName = "mngmt_mbody_nm")
    public void setMngmt_mbody_nm(String mngmt_mbody_nm){
        this.mngmt_mbody_nm = mngmt_mbody_nm;
    }

    @ElVoField(physicalName = "aset_clsf_nm")
    public String getAset_clsf_nm(){
        return aset_clsf_nm;
    }

    @ElVoField(physicalName = "aset_clsf_nm")
    public void setAset_clsf_nm(String aset_clsf_nm){
        this.aset_clsf_nm = aset_clsf_nm;
    }

    @ElVoField(physicalName = "move_clsf_nm")
    public String getMove_clsf_nm(){
        return move_clsf_nm;
    }

    @ElVoField(physicalName = "move_clsf_nm")
    public void setMove_clsf_nm(String move_clsf_nm){
        this.move_clsf_nm = move_clsf_nm;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public String getApr_state_nm(){
        return apr_state_nm;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public void setApr_state_nm(String apr_state_nm){
        this.apr_state_nm = apr_state_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AssAppMoveReqSrchVo [");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("aset_typ").append("=").append(aset_typ).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("aset_no").append("=").append(aset_no).append(",");
        sb.append("move_clsf").append("=").append(move_clsf).append(",");
        sb.append("aset_nm").append("=").append(aset_nm).append(",");
        sb.append("user_syspayno").append("=").append(user_syspayno).append(",");
        sb.append("req_ymd_st").append("=").append(req_ymd_st).append(",");
        sb.append("req_ymd_ed").append("=").append(req_ymd_ed).append(",");
        sb.append("mngmt_mbody").append("=").append(mngmt_mbody).append(",");
        sb.append("brin_schdl_ymd_st").append("=").append(brin_schdl_ymd_st).append(",");
        sb.append("brin_schdl_ymd_ed").append("=").append(brin_schdl_ymd_ed).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("aset_clsf").append("=").append(aset_clsf).append(",");
        sb.append("old_aset_no").append("=").append(old_aset_no).append(",");
        sb.append("intro_ymd").append("=").append(intro_ymd).append(",");
        sb.append("intro_amt").append("=").append(intro_amt).append(",");
        sb.append("user_nm").append("=").append(user_nm).append(",");
        sb.append("user_empno").append("=").append(user_empno).append(",");
        sb.append("user_dept_nm").append("=").append(user_dept_nm).append(",");
        sb.append("respn_syspayno").append("=").append(respn_syspayno).append(",");
        sb.append("respn_nm").append("=").append(respn_nm).append(",");
        sb.append("respn_empno").append("=").append(respn_empno).append(",");
        sb.append("brin_schdl_ymd").append("=").append(brin_schdl_ymd).append(",");
        sb.append("tout_schdl_ymd").append("=").append(tout_schdl_ymd).append(",");
        sb.append("wrte_nm").append("=").append(wrte_nm).append(",");
        sb.append("tout_empno").append("=").append(tout_empno).append(",");
        sb.append("tout_nm").append("=").append(tout_nm).append(",");
        sb.append("cause").append("=").append(cause).append(",");
        sb.append("posi").append("=").append(posi).append(",");
        sb.append("tout_ymd").append("=").append(tout_ymd).append(",");
        sb.append("tout_affir_ymd").append("=").append(tout_affir_ymd).append(",");
        sb.append("tout_affir_nm").append("=").append(tout_affir_nm).append(",");
        sb.append("brin_ymd").append("=").append(brin_ymd).append(",");
        sb.append("brin_affir_ymd").append("=").append(brin_affir_ymd).append(",");
        sb.append("brin_affir_nm").append("=").append(brin_affir_nm).append(",");
        sb.append("prj_nm").append("=").append(prj_nm).append(",");
        sb.append("instl_vend_nm").append("=").append(instl_vend_nm).append(",");
        sb.append("aftr_mngmt_ex").append("=").append(aftr_mngmt_ex).append(",");
        sb.append("instl_vend_charg").append("=").append(instl_vend_charg).append(",");
        sb.append("instl_vend_charg_tel").append("=").append(instl_vend_charg_tel).append(",");
        sb.append("out_instl_ymd_st").append("=").append(out_instl_ymd_st).append(",");
        sb.append("out_instl_ymd_ed").append("=").append(out_instl_ymd_ed).append(",");
        sb.append("mngmt_mbody_nm").append("=").append(mngmt_mbody_nm).append(",");
        sb.append("aset_clsf_nm").append("=").append(aset_clsf_nm).append(",");
        sb.append("move_clsf_nm").append("=").append(move_clsf_nm).append(",");
        sb.append("apr_state_nm").append("=").append(apr_state_nm);
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
