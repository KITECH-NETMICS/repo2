package kr.re.kitech.biz.ass.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "AssMoveExp")
public class AssAppMoveReqDetailVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AssAppMoveReqDetailVo(){
    }

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "reqYmd", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "moveClsf", physicalName = "move_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String move_clsf;

    @ElDtoField(logicalName = "asetNo", physicalName = "aset_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_no;

    @ElDtoField(logicalName = "asetNm", physicalName = "aset_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_nm;

    @ElDtoField(logicalName = "asetClsf", physicalName = "aset_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_clsf;

    @ElDtoField(logicalName = "asetClsfNm", physicalName = "aset_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_clsf_nm;

    @ElDtoField(logicalName = "asetTyp", physicalName = "aset_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_typ;

    @ElDtoField(logicalName = "asetTypNm", physicalName = "aset_typ_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_typ_nm;

    @ElDtoField(logicalName = "moveClsfNm", physicalName = "move_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String move_clsf_nm;

    @ElDtoField(logicalName = "toutSchdlYmd", physicalName = "tout_schdl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tout_schdl_ymd;

    @ElDtoField(logicalName = "brinSchdlYmd", physicalName = "brin_schdl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String brin_schdl_ymd;

    @ElDtoField(logicalName = "userSyspayno", physicalName = "user_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_syspayno;

    @ElDtoField(logicalName = "userNm", physicalName = "user_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_nm;

    @ElDtoField(logicalName = "userEmpno", physicalName = "user_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_empno;

    @ElDtoField(logicalName = "introYmd", physicalName = "intro_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intro_ymd;

    @ElDtoField(logicalName = "introAmt", physicalName = "intro_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intro_amt;

    @ElDtoField(logicalName = "toutUserNm", physicalName = "tout_user_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tout_user_nm;

    @ElDtoField(logicalName = "toutUserEmpno", physicalName = "tout_user_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tout_user_empno;

    @ElDtoField(logicalName = "toutUserSyspayno", physicalName = "tout_user_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tout_user_syspayno;

    @ElDtoField(logicalName = "toutUserDeptCd", physicalName = "tout_user_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tout_user_dept_cd;

    @ElDtoField(logicalName = "toutUserDeptNewYmd", physicalName = "tout_user_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tout_user_dept_new_ymd;

    @ElDtoField(logicalName = "toutUserExtNo", physicalName = "tout_user_ext_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tout_user_ext_no;

    @ElDtoField(logicalName = "toutUserEmail", physicalName = "tout_user_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tout_user_email;

    @ElDtoField(logicalName = "toutUserDeptNm", physicalName = "tout_user_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tout_user_dept_nm;

    @ElDtoField(logicalName = "cause", physicalName = "cause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cause;

    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "godsAttachFileNo", physicalName = "gods_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String gods_attach_file_no;

    @ElDtoField(logicalName = "instlVend", physicalName = "instl_vend", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String instl_vend;

    @ElDtoField(logicalName = "instlVendNm", physicalName = "instl_vend_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String instl_vend_nm;

    @ElDtoField(logicalName = "instlVendCharg", physicalName = "instl_vend_charg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String instl_vend_charg;

    @ElDtoField(logicalName = "instlVendChargTel", physicalName = "instl_vend_charg_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String instl_vend_charg_tel;

    @ElDtoField(logicalName = "outInstlYmdSt", physicalName = "out_instl_ymd_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String out_instl_ymd_st;

    @ElDtoField(logicalName = "outInstlYmdEd", physicalName = "out_instl_ymd_ed", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String out_instl_ymd_ed;

    @ElDtoField(logicalName = "prjNo", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no;

    @ElDtoField(logicalName = "prjNm", physicalName = "prj_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_nm;

    @ElDtoField(logicalName = "aftrMngmtEx", physicalName = "aftr_mngmt_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aftr_mngmt_ex;

    @ElDtoField(logicalName = "aftrMngmtExNm", physicalName = "aftr_mngmt_ex_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aftr_mngmt_ex_nm;

    @ElDtoField(logicalName = "toutPosiRegion", physicalName = "tout_posi_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tout_posi_region;

    @ElDtoField(logicalName = "toutPosiBuild", physicalName = "tout_posi_build", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tout_posi_build;

    @ElDtoField(logicalName = "toutPosiRegionNm", physicalName = "tout_posi_region_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tout_posi_region_nm;

    @ElDtoField(logicalName = "toutPosiBuildNm", physicalName = "tout_posi_build_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tout_posi_build_nm;

    @ElDtoField(logicalName = "toutPosiFloor", physicalName = "tout_posi_floor", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tout_posi_floor;

    @ElDtoField(logicalName = "toutPosiDetls", physicalName = "tout_posi_detls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tout_posi_detls;

    @ElDtoField(logicalName = "toutYmd", physicalName = "tout_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tout_ymd;

    @ElDtoField(logicalName = "toutAffirYmd", physicalName = "tout_affir_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tout_affir_ymd;

    @ElDtoField(logicalName = "toutAffirSyspayno", physicalName = "tout_affir_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tout_affir_syspayno;

    @ElDtoField(logicalName = "toutPsnSyspayno", physicalName = "tout_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tout_psn_syspayno;

    @ElDtoField(logicalName = "toutDept", physicalName = "tout_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tout_dept;

    @ElDtoField(logicalName = "toutDeptNewYmd", physicalName = "tout_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tout_dept_new_ymd;

    @ElDtoField(logicalName = "toutAffirNm", physicalName = "tout_affir_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tout_affir_nm;

    @ElDtoField(logicalName = "brinYmd", physicalName = "brin_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String brin_ymd;

    @ElDtoField(logicalName = "brinAffirYmd", physicalName = "brin_affir_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String brin_affir_ymd;

    @ElDtoField(logicalName = "brinAffirSyspayno", physicalName = "brin_affir_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String brin_affir_syspayno;

    @ElDtoField(logicalName = "brinAffirNm", physicalName = "brin_affir_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String brin_affir_nm;

    @ElDtoField(logicalName = "posiNm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "wrteSyspayno", physicalName = "wrte_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_syspayno;

    @ElDtoField(logicalName = "assSyspayno", physicalName = "ass_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ass_syspayno;

    @ElDtoField(logicalName = "", physicalName = "rowStatus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rowStatus;

    @ElDtoField(logicalName = "aprState", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "move_clsf")
    public String getMove_clsf(){
        return move_clsf;
    }

    @ElVoField(physicalName = "move_clsf")
    public void setMove_clsf(String move_clsf){
        this.move_clsf = move_clsf;
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

    @ElVoField(physicalName = "aset_clsf")
    public String getAset_clsf(){
        return aset_clsf;
    }

    @ElVoField(physicalName = "aset_clsf")
    public void setAset_clsf(String aset_clsf){
        this.aset_clsf = aset_clsf;
    }

    @ElVoField(physicalName = "aset_clsf_nm")
    public String getAset_clsf_nm(){
        return aset_clsf_nm;
    }

    @ElVoField(physicalName = "aset_clsf_nm")
    public void setAset_clsf_nm(String aset_clsf_nm){
        this.aset_clsf_nm = aset_clsf_nm;
    }

    @ElVoField(physicalName = "aset_typ")
    public String getAset_typ(){
        return aset_typ;
    }

    @ElVoField(physicalName = "aset_typ")
    public void setAset_typ(String aset_typ){
        this.aset_typ = aset_typ;
    }

    @ElVoField(physicalName = "aset_typ_nm")
    public String getAset_typ_nm(){
        return aset_typ_nm;
    }

    @ElVoField(physicalName = "aset_typ_nm")
    public void setAset_typ_nm(String aset_typ_nm){
        this.aset_typ_nm = aset_typ_nm;
    }

    @ElVoField(physicalName = "move_clsf_nm")
    public String getMove_clsf_nm(){
        return move_clsf_nm;
    }

    @ElVoField(physicalName = "move_clsf_nm")
    public void setMove_clsf_nm(String move_clsf_nm){
        this.move_clsf_nm = move_clsf_nm;
    }

    @ElVoField(physicalName = "tout_schdl_ymd")
    public String getTout_schdl_ymd(){
        return tout_schdl_ymd;
    }

    @ElVoField(physicalName = "tout_schdl_ymd")
    public void setTout_schdl_ymd(String tout_schdl_ymd){
        this.tout_schdl_ymd = tout_schdl_ymd;
    }

    @ElVoField(physicalName = "brin_schdl_ymd")
    public String getBrin_schdl_ymd(){
        return brin_schdl_ymd;
    }

    @ElVoField(physicalName = "brin_schdl_ymd")
    public void setBrin_schdl_ymd(String brin_schdl_ymd){
        this.brin_schdl_ymd = brin_schdl_ymd;
    }

    @ElVoField(physicalName = "user_syspayno")
    public String getUser_syspayno(){
        return user_syspayno;
    }

    @ElVoField(physicalName = "user_syspayno")
    public void setUser_syspayno(String user_syspayno){
        this.user_syspayno = user_syspayno;
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

    @ElVoField(physicalName = "tout_user_nm")
    public String getTout_user_nm(){
        return tout_user_nm;
    }

    @ElVoField(physicalName = "tout_user_nm")
    public void setTout_user_nm(String tout_user_nm){
        this.tout_user_nm = tout_user_nm;
    }

    @ElVoField(physicalName = "tout_user_empno")
    public String getTout_user_empno(){
        return tout_user_empno;
    }

    @ElVoField(physicalName = "tout_user_empno")
    public void setTout_user_empno(String tout_user_empno){
        this.tout_user_empno = tout_user_empno;
    }

    @ElVoField(physicalName = "tout_user_syspayno")
    public String getTout_user_syspayno(){
        return tout_user_syspayno;
    }

    @ElVoField(physicalName = "tout_user_syspayno")
    public void setTout_user_syspayno(String tout_user_syspayno){
        this.tout_user_syspayno = tout_user_syspayno;
    }

    @ElVoField(physicalName = "tout_user_dept_cd")
    public String getTout_user_dept_cd(){
        return tout_user_dept_cd;
    }

    @ElVoField(physicalName = "tout_user_dept_cd")
    public void setTout_user_dept_cd(String tout_user_dept_cd){
        this.tout_user_dept_cd = tout_user_dept_cd;
    }

    @ElVoField(physicalName = "tout_user_dept_new_ymd")
    public String getTout_user_dept_new_ymd(){
        return tout_user_dept_new_ymd;
    }

    @ElVoField(physicalName = "tout_user_dept_new_ymd")
    public void setTout_user_dept_new_ymd(String tout_user_dept_new_ymd){
        this.tout_user_dept_new_ymd = tout_user_dept_new_ymd;
    }

    @ElVoField(physicalName = "tout_user_ext_no")
    public String getTout_user_ext_no(){
        return tout_user_ext_no;
    }

    @ElVoField(physicalName = "tout_user_ext_no")
    public void setTout_user_ext_no(String tout_user_ext_no){
        this.tout_user_ext_no = tout_user_ext_no;
    }

    @ElVoField(physicalName = "tout_user_email")
    public String getTout_user_email(){
        return tout_user_email;
    }

    @ElVoField(physicalName = "tout_user_email")
    public void setTout_user_email(String tout_user_email){
        this.tout_user_email = tout_user_email;
    }

    @ElVoField(physicalName = "tout_user_dept_nm")
    public String getTout_user_dept_nm(){
        return tout_user_dept_nm;
    }

    @ElVoField(physicalName = "tout_user_dept_nm")
    public void setTout_user_dept_nm(String tout_user_dept_nm){
        this.tout_user_dept_nm = tout_user_dept_nm;
    }

    @ElVoField(physicalName = "cause")
    public String getCause(){
        return cause;
    }

    @ElVoField(physicalName = "cause")
    public void setCause(String cause){
        this.cause = cause;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "gods_attach_file_no")
    public String getGods_attach_file_no(){
        return gods_attach_file_no;
    }

    @ElVoField(physicalName = "gods_attach_file_no")
    public void setGods_attach_file_no(String gods_attach_file_no){
        this.gods_attach_file_no = gods_attach_file_no;
    }

    @ElVoField(physicalName = "instl_vend")
    public String getInstl_vend(){
        return instl_vend;
    }

    @ElVoField(physicalName = "instl_vend")
    public void setInstl_vend(String instl_vend){
        this.instl_vend = instl_vend;
    }

    @ElVoField(physicalName = "instl_vend_nm")
    public String getInstl_vend_nm(){
        return instl_vend_nm;
    }

    @ElVoField(physicalName = "instl_vend_nm")
    public void setInstl_vend_nm(String instl_vend_nm){
        this.instl_vend_nm = instl_vend_nm;
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

    @ElVoField(physicalName = "prj_no")
    public String getPrj_no(){
        return prj_no;
    }

    @ElVoField(physicalName = "prj_no")
    public void setPrj_no(String prj_no){
        this.prj_no = prj_no;
    }

    @ElVoField(physicalName = "prj_nm")
    public String getPrj_nm(){
        return prj_nm;
    }

    @ElVoField(physicalName = "prj_nm")
    public void setPrj_nm(String prj_nm){
        this.prj_nm = prj_nm;
    }

    @ElVoField(physicalName = "aftr_mngmt_ex")
    public String getAftr_mngmt_ex(){
        return aftr_mngmt_ex;
    }

    @ElVoField(physicalName = "aftr_mngmt_ex")
    public void setAftr_mngmt_ex(String aftr_mngmt_ex){
        this.aftr_mngmt_ex = aftr_mngmt_ex;
    }

    @ElVoField(physicalName = "aftr_mngmt_ex_nm")
    public String getAftr_mngmt_ex_nm(){
        return aftr_mngmt_ex_nm;
    }

    @ElVoField(physicalName = "aftr_mngmt_ex_nm")
    public void setAftr_mngmt_ex_nm(String aftr_mngmt_ex_nm){
        this.aftr_mngmt_ex_nm = aftr_mngmt_ex_nm;
    }

    @ElVoField(physicalName = "tout_posi_region")
    public String getTout_posi_region(){
        return tout_posi_region;
    }

    @ElVoField(physicalName = "tout_posi_region")
    public void setTout_posi_region(String tout_posi_region){
        this.tout_posi_region = tout_posi_region;
    }

    @ElVoField(physicalName = "tout_posi_build")
    public String getTout_posi_build(){
        return tout_posi_build;
    }

    @ElVoField(physicalName = "tout_posi_build")
    public void setTout_posi_build(String tout_posi_build){
        this.tout_posi_build = tout_posi_build;
    }

    @ElVoField(physicalName = "tout_posi_region_nm")
    public String getTout_posi_region_nm(){
        return tout_posi_region_nm;
    }

    @ElVoField(physicalName = "tout_posi_region_nm")
    public void setTout_posi_region_nm(String tout_posi_region_nm){
        this.tout_posi_region_nm = tout_posi_region_nm;
    }

    @ElVoField(physicalName = "tout_posi_build_nm")
    public String getTout_posi_build_nm(){
        return tout_posi_build_nm;
    }

    @ElVoField(physicalName = "tout_posi_build_nm")
    public void setTout_posi_build_nm(String tout_posi_build_nm){
        this.tout_posi_build_nm = tout_posi_build_nm;
    }

    @ElVoField(physicalName = "tout_posi_floor")
    public String getTout_posi_floor(){
        return tout_posi_floor;
    }

    @ElVoField(physicalName = "tout_posi_floor")
    public void setTout_posi_floor(String tout_posi_floor){
        this.tout_posi_floor = tout_posi_floor;
    }

    @ElVoField(physicalName = "tout_posi_detls")
    public String getTout_posi_detls(){
        return tout_posi_detls;
    }

    @ElVoField(physicalName = "tout_posi_detls")
    public void setTout_posi_detls(String tout_posi_detls){
        this.tout_posi_detls = tout_posi_detls;
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

    @ElVoField(physicalName = "tout_affir_syspayno")
    public String getTout_affir_syspayno(){
        return tout_affir_syspayno;
    }

    @ElVoField(physicalName = "tout_affir_syspayno")
    public void setTout_affir_syspayno(String tout_affir_syspayno){
        this.tout_affir_syspayno = tout_affir_syspayno;
    }

    @ElVoField(physicalName = "tout_psn_syspayno")
    public String getTout_psn_syspayno(){
        return tout_psn_syspayno;
    }

    @ElVoField(physicalName = "tout_psn_syspayno")
    public void setTout_psn_syspayno(String tout_psn_syspayno){
        this.tout_psn_syspayno = tout_psn_syspayno;
    }

    @ElVoField(physicalName = "tout_dept")
    public String getTout_dept(){
        return tout_dept;
    }

    @ElVoField(physicalName = "tout_dept")
    public void setTout_dept(String tout_dept){
        this.tout_dept = tout_dept;
    }

    @ElVoField(physicalName = "tout_dept_new_ymd")
    public String getTout_dept_new_ymd(){
        return tout_dept_new_ymd;
    }

    @ElVoField(physicalName = "tout_dept_new_ymd")
    public void setTout_dept_new_ymd(String tout_dept_new_ymd){
        this.tout_dept_new_ymd = tout_dept_new_ymd;
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

    @ElVoField(physicalName = "brin_affir_syspayno")
    public String getBrin_affir_syspayno(){
        return brin_affir_syspayno;
    }

    @ElVoField(physicalName = "brin_affir_syspayno")
    public void setBrin_affir_syspayno(String brin_affir_syspayno){
        this.brin_affir_syspayno = brin_affir_syspayno;
    }

    @ElVoField(physicalName = "brin_affir_nm")
    public String getBrin_affir_nm(){
        return brin_affir_nm;
    }

    @ElVoField(physicalName = "brin_affir_nm")
    public void setBrin_affir_nm(String brin_affir_nm){
        this.brin_affir_nm = brin_affir_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "wrte_syspayno")
    public String getWrte_syspayno(){
        return wrte_syspayno;
    }

    @ElVoField(physicalName = "wrte_syspayno")
    public void setWrte_syspayno(String wrte_syspayno){
        this.wrte_syspayno = wrte_syspayno;
    }

    @ElVoField(physicalName = "ass_syspayno")
    public String getAss_syspayno(){
        return ass_syspayno;
    }

    @ElVoField(physicalName = "ass_syspayno")
    public void setAss_syspayno(String ass_syspayno){
        this.ass_syspayno = ass_syspayno;
    }

    @ElVoField(physicalName = "rowStatus")
    public String getRowStatus(){
        return rowStatus;
    }

    @ElVoField(physicalName = "rowStatus")
    public void setRowStatus(String rowStatus){
        this.rowStatus = rowStatus;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AssAppMoveReqDetailVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("move_clsf").append("=").append(move_clsf).append(",");
        sb.append("aset_no").append("=").append(aset_no).append(",");
        sb.append("aset_nm").append("=").append(aset_nm).append(",");
        sb.append("aset_clsf").append("=").append(aset_clsf).append(",");
        sb.append("aset_clsf_nm").append("=").append(aset_clsf_nm).append(",");
        sb.append("aset_typ").append("=").append(aset_typ).append(",");
        sb.append("aset_typ_nm").append("=").append(aset_typ_nm).append(",");
        sb.append("move_clsf_nm").append("=").append(move_clsf_nm).append(",");
        sb.append("tout_schdl_ymd").append("=").append(tout_schdl_ymd).append(",");
        sb.append("brin_schdl_ymd").append("=").append(brin_schdl_ymd).append(",");
        sb.append("user_syspayno").append("=").append(user_syspayno).append(",");
        sb.append("user_nm").append("=").append(user_nm).append(",");
        sb.append("user_empno").append("=").append(user_empno).append(",");
        sb.append("intro_ymd").append("=").append(intro_ymd).append(",");
        sb.append("intro_amt").append("=").append(intro_amt).append(",");
        sb.append("tout_user_nm").append("=").append(tout_user_nm).append(",");
        sb.append("tout_user_empno").append("=").append(tout_user_empno).append(",");
        sb.append("tout_user_syspayno").append("=").append(tout_user_syspayno).append(",");
        sb.append("tout_user_dept_cd").append("=").append(tout_user_dept_cd).append(",");
        sb.append("tout_user_dept_new_ymd").append("=").append(tout_user_dept_new_ymd).append(",");
        sb.append("tout_user_ext_no").append("=").append(tout_user_ext_no).append(",");
        sb.append("tout_user_email").append("=").append(tout_user_email).append(",");
        sb.append("tout_user_dept_nm").append("=").append(tout_user_dept_nm).append(",");
        sb.append("cause").append("=").append(cause).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("gods_attach_file_no").append("=").append(gods_attach_file_no).append(",");
        sb.append("instl_vend").append("=").append(instl_vend).append(",");
        sb.append("instl_vend_nm").append("=").append(instl_vend_nm).append(",");
        sb.append("instl_vend_charg").append("=").append(instl_vend_charg).append(",");
        sb.append("instl_vend_charg_tel").append("=").append(instl_vend_charg_tel).append(",");
        sb.append("out_instl_ymd_st").append("=").append(out_instl_ymd_st).append(",");
        sb.append("out_instl_ymd_ed").append("=").append(out_instl_ymd_ed).append(",");
        sb.append("prj_no").append("=").append(prj_no).append(",");
        sb.append("prj_nm").append("=").append(prj_nm).append(",");
        sb.append("aftr_mngmt_ex").append("=").append(aftr_mngmt_ex).append(",");
        sb.append("aftr_mngmt_ex_nm").append("=").append(aftr_mngmt_ex_nm).append(",");
        sb.append("tout_posi_region").append("=").append(tout_posi_region).append(",");
        sb.append("tout_posi_build").append("=").append(tout_posi_build).append(",");
        sb.append("tout_posi_region_nm").append("=").append(tout_posi_region_nm).append(",");
        sb.append("tout_posi_build_nm").append("=").append(tout_posi_build_nm).append(",");
        sb.append("tout_posi_floor").append("=").append(tout_posi_floor).append(",");
        sb.append("tout_posi_detls").append("=").append(tout_posi_detls).append(",");
        sb.append("tout_ymd").append("=").append(tout_ymd).append(",");
        sb.append("tout_affir_ymd").append("=").append(tout_affir_ymd).append(",");
        sb.append("tout_affir_syspayno").append("=").append(tout_affir_syspayno).append(",");
        sb.append("tout_psn_syspayno").append("=").append(tout_psn_syspayno).append(",");
        sb.append("tout_dept").append("=").append(tout_dept).append(",");
        sb.append("tout_dept_new_ymd").append("=").append(tout_dept_new_ymd).append(",");
        sb.append("tout_affir_nm").append("=").append(tout_affir_nm).append(",");
        sb.append("brin_ymd").append("=").append(brin_ymd).append(",");
        sb.append("brin_affir_ymd").append("=").append(brin_affir_ymd).append(",");
        sb.append("brin_affir_syspayno").append("=").append(brin_affir_syspayno).append(",");
        sb.append("brin_affir_nm").append("=").append(brin_affir_nm).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("wrte_syspayno").append("=").append(wrte_syspayno).append(",");
        sb.append("ass_syspayno").append("=").append(ass_syspayno).append(",");
        sb.append("rowStatus").append("=").append(rowStatus).append(",");
        sb.append("apr_state").append("=").append(apr_state);
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
