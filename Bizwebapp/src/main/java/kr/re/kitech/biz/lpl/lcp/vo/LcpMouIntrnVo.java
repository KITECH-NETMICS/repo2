package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "LcpMouIntrnExp")
public class LcpMouIntrnVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public LcpMouIntrnVo(){
    }

    @ElDtoField(logicalName = "mouContrctYmd1", physicalName = "mou_contrct_ymd1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_contrct_ymd1;

    @ElDtoField(logicalName = "mouContrctYmd2", physicalName = "mou_contrct_ymd2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_contrct_ymd2;

    @ElDtoField(logicalName = "mouSubj", physicalName = "mou_subj", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_subj;

    @ElDtoField(logicalName = "mouKnd", physicalName = "mou_knd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_knd;

    @ElDtoField(logicalName = "contryCd", physicalName = "contry_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contry_cd;

    @ElDtoField(logicalName = "contractState", physicalName = "contract_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contract_state;

    @ElDtoField(logicalName = "cmpyNmEng", physicalName = "cmpy_nm_eng", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_eng;

    @ElDtoField(logicalName = "cmpyNmKrchar", physicalName = "cmpy_nm_krchar", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_krchar;

    @ElDtoField(logicalName = "mouNo", physicalName = "mou_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_no;

    @ElDtoField(logicalName = "mouSchdlYmd", physicalName = "mou_schdl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_schdl_ymd;

    @ElDtoField(logicalName = "mouNatn", physicalName = "mou_natn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_natn;

    @ElDtoField(logicalName = "mouNatnNm", physicalName = "mou_natn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_natn_nm;

    @ElDtoField(logicalName = "mouFild", physicalName = "mou_fild", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_fild;

    @ElDtoField(logicalName = "mouFildNm", physicalName = "mou_fild_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_fild_nm;

    @ElDtoField(logicalName = "mouKndNm", physicalName = "mou_knd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_knd_nm;

    @ElDtoField(logicalName = "contrctAgncy", physicalName = "contrct_agncy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_agncy;

    @ElDtoField(logicalName = "contrctGoal", physicalName = "contrct_goal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_goal;

    @ElDtoField(logicalName = "mouGoal", physicalName = "mou_goal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_goal;

    @ElDtoField(logicalName = "mouContnt", physicalName = "mou_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_contnt;

    @ElDtoField(logicalName = "chargSyspayno", physicalName = "charg_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_syspayno;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "contrctState", physicalName = "contrct_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_state;

    @ElDtoField(logicalName = "contrctStateNm", physicalName = "contrct_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_state_nm;

    @ElDtoField(logicalName = "mouContrctYmd", physicalName = "mou_contrct_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_contrct_ymd;

    @ElDtoField(logicalName = "mouClsYmd", physicalName = "mou_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_cls_ymd;

    @ElDtoField(logicalName = "agncyClsfNm", physicalName = "agncy_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_clsf_nm;

    @ElDtoField(logicalName = "krcharAgncyNm", physicalName = "krchar_agncy_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String krchar_agncy_nm;

    @ElDtoField(logicalName = "contrctGoalNm1", physicalName = "contrct_goal_nm1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_goal_nm1;

    @ElDtoField(logicalName = "contrctGoalNm2", physicalName = "contrct_goal_nm2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_goal_nm2;

    @ElDtoField(logicalName = "contrctGoalNm3", physicalName = "contrct_goal_nm3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_goal_nm3;

    @ElDtoField(logicalName = "contrctGoalNm4", physicalName = "contrct_goal_nm4", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_goal_nm4;

    @ElDtoField(logicalName = "goalCount", physicalName = "goal_count", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String goal_count;

    @ElDtoField(logicalName = "contrctSyspayno", physicalName = "contrct_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_syspayno;

    @ElDtoField(logicalName = "contrctPsnNm", physicalName = "contrct_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_psn_nm;

    @ElDtoField(logicalName = "contrct_psn_dept_cd", physicalName = "contrct_psn_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_psn_dept_cd;

    @ElDtoField(logicalName = "contrct_psn_dept_new_ymd", physicalName = "contrct_psn_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_psn_dept_new_ymd;

    @ElDtoField(logicalName = "contrct_psn_dept_nm", physicalName = "contrct_psn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_psn_dept_nm;

    @ElDtoField(logicalName = "contrct_psn_posi_nm", physicalName = "contrct_psn_posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_psn_posi_nm;

    @ElDtoField(logicalName = "cud_type", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "validAttachNo", physicalName = "validAttachNo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String validAttachNo;

    @ElDtoField(logicalName = "afc_del_row_odr", physicalName = "afc_del_row_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String afc_del_row_odr;

    @ElDtoField(logicalName = "afc_row_flag", physicalName = "afc_row_flag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String afc_row_flag;

    @ElDtoField(logicalName = "agy_del_row_odr", physicalName = "agy_del_row_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agy_del_row_odr;

    @ElDtoField(logicalName = "agy_row_flag", physicalName = "agy_row_flag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agy_row_flag;

    @ElDtoField(logicalName = "afc_del_odr", physicalName = "afc_del_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String afc_del_odr;

    @ElDtoField(logicalName = "agy_del_odr", physicalName = "agy_del_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agy_del_odr;

    @ElDtoField(logicalName = "regst_psn_syspayno", physicalName = "regst_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_psn_syspayno;

    @ElDtoField(logicalName = "updt_psn_syspayno", physicalName = "updt_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_psn_syspayno;

    @ElDtoField(logicalName = "charg_nm", physicalName = "charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_nm;

    @ElVoField(physicalName = "mou_contrct_ymd1")
    public String getMou_contrct_ymd1(){
        return mou_contrct_ymd1;
    }

    @ElVoField(physicalName = "mou_contrct_ymd1")
    public void setMou_contrct_ymd1(String mou_contrct_ymd1){
        this.mou_contrct_ymd1 = mou_contrct_ymd1;
    }

    @ElVoField(physicalName = "mou_contrct_ymd2")
    public String getMou_contrct_ymd2(){
        return mou_contrct_ymd2;
    }

    @ElVoField(physicalName = "mou_contrct_ymd2")
    public void setMou_contrct_ymd2(String mou_contrct_ymd2){
        this.mou_contrct_ymd2 = mou_contrct_ymd2;
    }

    @ElVoField(physicalName = "mou_subj")
    public String getMou_subj(){
        return mou_subj;
    }

    @ElVoField(physicalName = "mou_subj")
    public void setMou_subj(String mou_subj){
        this.mou_subj = mou_subj;
    }

    @ElVoField(physicalName = "mou_knd")
    public String getMou_knd(){
        return mou_knd;
    }

    @ElVoField(physicalName = "mou_knd")
    public void setMou_knd(String mou_knd){
        this.mou_knd = mou_knd;
    }

    @ElVoField(physicalName = "contry_cd")
    public String getContry_cd(){
        return contry_cd;
    }

    @ElVoField(physicalName = "contry_cd")
    public void setContry_cd(String contry_cd){
        this.contry_cd = contry_cd;
    }

    @ElVoField(physicalName = "contract_state")
    public String getContract_state(){
        return contract_state;
    }

    @ElVoField(physicalName = "contract_state")
    public void setContract_state(String contract_state){
        this.contract_state = contract_state;
    }

    @ElVoField(physicalName = "cmpy_nm_eng")
    public String getCmpy_nm_eng(){
        return cmpy_nm_eng;
    }

    @ElVoField(physicalName = "cmpy_nm_eng")
    public void setCmpy_nm_eng(String cmpy_nm_eng){
        this.cmpy_nm_eng = cmpy_nm_eng;
    }

    @ElVoField(physicalName = "cmpy_nm_krchar")
    public String getCmpy_nm_krchar(){
        return cmpy_nm_krchar;
    }

    @ElVoField(physicalName = "cmpy_nm_krchar")
    public void setCmpy_nm_krchar(String cmpy_nm_krchar){
        this.cmpy_nm_krchar = cmpy_nm_krchar;
    }

    @ElVoField(physicalName = "mou_no")
    public String getMou_no(){
        return mou_no;
    }

    @ElVoField(physicalName = "mou_no")
    public void setMou_no(String mou_no){
        this.mou_no = mou_no;
    }

    @ElVoField(physicalName = "mou_schdl_ymd")
    public String getMou_schdl_ymd(){
        return mou_schdl_ymd;
    }

    @ElVoField(physicalName = "mou_schdl_ymd")
    public void setMou_schdl_ymd(String mou_schdl_ymd){
        this.mou_schdl_ymd = mou_schdl_ymd;
    }

    @ElVoField(physicalName = "mou_natn")
    public String getMou_natn(){
        return mou_natn;
    }

    @ElVoField(physicalName = "mou_natn")
    public void setMou_natn(String mou_natn){
        this.mou_natn = mou_natn;
    }

    @ElVoField(physicalName = "mou_natn_nm")
    public String getMou_natn_nm(){
        return mou_natn_nm;
    }

    @ElVoField(physicalName = "mou_natn_nm")
    public void setMou_natn_nm(String mou_natn_nm){
        this.mou_natn_nm = mou_natn_nm;
    }

    @ElVoField(physicalName = "mou_fild")
    public String getMou_fild(){
        return mou_fild;
    }

    @ElVoField(physicalName = "mou_fild")
    public void setMou_fild(String mou_fild){
        this.mou_fild = mou_fild;
    }

    @ElVoField(physicalName = "mou_fild_nm")
    public String getMou_fild_nm(){
        return mou_fild_nm;
    }

    @ElVoField(physicalName = "mou_fild_nm")
    public void setMou_fild_nm(String mou_fild_nm){
        this.mou_fild_nm = mou_fild_nm;
    }

    @ElVoField(physicalName = "mou_knd_nm")
    public String getMou_knd_nm(){
        return mou_knd_nm;
    }

    @ElVoField(physicalName = "mou_knd_nm")
    public void setMou_knd_nm(String mou_knd_nm){
        this.mou_knd_nm = mou_knd_nm;
    }

    @ElVoField(physicalName = "contrct_agncy")
    public String getContrct_agncy(){
        return contrct_agncy;
    }

    @ElVoField(physicalName = "contrct_agncy")
    public void setContrct_agncy(String contrct_agncy){
        this.contrct_agncy = contrct_agncy;
    }

    @ElVoField(physicalName = "contrct_goal")
    public String getContrct_goal(){
        return contrct_goal;
    }

    @ElVoField(physicalName = "contrct_goal")
    public void setContrct_goal(String contrct_goal){
        this.contrct_goal = contrct_goal;
    }

    @ElVoField(physicalName = "mou_goal")
    public String getMou_goal(){
        return mou_goal;
    }

    @ElVoField(physicalName = "mou_goal")
    public void setMou_goal(String mou_goal){
        this.mou_goal = mou_goal;
    }

    @ElVoField(physicalName = "mou_contnt")
    public String getMou_contnt(){
        return mou_contnt;
    }

    @ElVoField(physicalName = "mou_contnt")
    public void setMou_contnt(String mou_contnt){
        this.mou_contnt = mou_contnt;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public String getCharg_syspayno(){
        return charg_syspayno;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public void setCharg_syspayno(String charg_syspayno){
        this.charg_syspayno = charg_syspayno;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "contrct_state")
    public String getContrct_state(){
        return contrct_state;
    }

    @ElVoField(physicalName = "contrct_state")
    public void setContrct_state(String contrct_state){
        this.contrct_state = contrct_state;
    }

    @ElVoField(physicalName = "contrct_state_nm")
    public String getContrct_state_nm(){
        return contrct_state_nm;
    }

    @ElVoField(physicalName = "contrct_state_nm")
    public void setContrct_state_nm(String contrct_state_nm){
        this.contrct_state_nm = contrct_state_nm;
    }

    @ElVoField(physicalName = "mou_contrct_ymd")
    public String getMou_contrct_ymd(){
        return mou_contrct_ymd;
    }

    @ElVoField(physicalName = "mou_contrct_ymd")
    public void setMou_contrct_ymd(String mou_contrct_ymd){
        this.mou_contrct_ymd = mou_contrct_ymd;
    }

    @ElVoField(physicalName = "mou_cls_ymd")
    public String getMou_cls_ymd(){
        return mou_cls_ymd;
    }

    @ElVoField(physicalName = "mou_cls_ymd")
    public void setMou_cls_ymd(String mou_cls_ymd){
        this.mou_cls_ymd = mou_cls_ymd;
    }

    @ElVoField(physicalName = "agncy_clsf_nm")
    public String getAgncy_clsf_nm(){
        return agncy_clsf_nm;
    }

    @ElVoField(physicalName = "agncy_clsf_nm")
    public void setAgncy_clsf_nm(String agncy_clsf_nm){
        this.agncy_clsf_nm = agncy_clsf_nm;
    }

    @ElVoField(physicalName = "krchar_agncy_nm")
    public String getKrchar_agncy_nm(){
        return krchar_agncy_nm;
    }

    @ElVoField(physicalName = "krchar_agncy_nm")
    public void setKrchar_agncy_nm(String krchar_agncy_nm){
        this.krchar_agncy_nm = krchar_agncy_nm;
    }

    @ElVoField(physicalName = "contrct_goal_nm1")
    public String getContrct_goal_nm1(){
        return contrct_goal_nm1;
    }

    @ElVoField(physicalName = "contrct_goal_nm1")
    public void setContrct_goal_nm1(String contrct_goal_nm1){
        this.contrct_goal_nm1 = contrct_goal_nm1;
    }

    @ElVoField(physicalName = "contrct_goal_nm2")
    public String getContrct_goal_nm2(){
        return contrct_goal_nm2;
    }

    @ElVoField(physicalName = "contrct_goal_nm2")
    public void setContrct_goal_nm2(String contrct_goal_nm2){
        this.contrct_goal_nm2 = contrct_goal_nm2;
    }

    @ElVoField(physicalName = "contrct_goal_nm3")
    public String getContrct_goal_nm3(){
        return contrct_goal_nm3;
    }

    @ElVoField(physicalName = "contrct_goal_nm3")
    public void setContrct_goal_nm3(String contrct_goal_nm3){
        this.contrct_goal_nm3 = contrct_goal_nm3;
    }

    @ElVoField(physicalName = "contrct_goal_nm4")
    public String getContrct_goal_nm4(){
        return contrct_goal_nm4;
    }

    @ElVoField(physicalName = "contrct_goal_nm4")
    public void setContrct_goal_nm4(String contrct_goal_nm4){
        this.contrct_goal_nm4 = contrct_goal_nm4;
    }

    @ElVoField(physicalName = "goal_count")
    public String getGoal_count(){
        return goal_count;
    }

    @ElVoField(physicalName = "goal_count")
    public void setGoal_count(String goal_count){
        this.goal_count = goal_count;
    }

    @ElVoField(physicalName = "contrct_syspayno")
    public String getContrct_syspayno(){
        return contrct_syspayno;
    }

    @ElVoField(physicalName = "contrct_syspayno")
    public void setContrct_syspayno(String contrct_syspayno){
        this.contrct_syspayno = contrct_syspayno;
    }

    @ElVoField(physicalName = "contrct_psn_nm")
    public String getContrct_psn_nm(){
        return contrct_psn_nm;
    }

    @ElVoField(physicalName = "contrct_psn_nm")
    public void setContrct_psn_nm(String contrct_psn_nm){
        this.contrct_psn_nm = contrct_psn_nm;
    }

    @ElVoField(physicalName = "contrct_psn_dept_cd")
    public String getContrct_psn_dept_cd(){
        return contrct_psn_dept_cd;
    }

    @ElVoField(physicalName = "contrct_psn_dept_cd")
    public void setContrct_psn_dept_cd(String contrct_psn_dept_cd){
        this.contrct_psn_dept_cd = contrct_psn_dept_cd;
    }

    @ElVoField(physicalName = "contrct_psn_dept_new_ymd")
    public String getContrct_psn_dept_new_ymd(){
        return contrct_psn_dept_new_ymd;
    }

    @ElVoField(physicalName = "contrct_psn_dept_new_ymd")
    public void setContrct_psn_dept_new_ymd(String contrct_psn_dept_new_ymd){
        this.contrct_psn_dept_new_ymd = contrct_psn_dept_new_ymd;
    }

    @ElVoField(physicalName = "contrct_psn_dept_nm")
    public String getContrct_psn_dept_nm(){
        return contrct_psn_dept_nm;
    }

    @ElVoField(physicalName = "contrct_psn_dept_nm")
    public void setContrct_psn_dept_nm(String contrct_psn_dept_nm){
        this.contrct_psn_dept_nm = contrct_psn_dept_nm;
    }

    @ElVoField(physicalName = "contrct_psn_posi_nm")
    public String getContrct_psn_posi_nm(){
        return contrct_psn_posi_nm;
    }

    @ElVoField(physicalName = "contrct_psn_posi_nm")
    public void setContrct_psn_posi_nm(String contrct_psn_posi_nm){
        this.contrct_psn_posi_nm = contrct_psn_posi_nm;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "validAttachNo")
    public String getValidAttachNo(){
        return validAttachNo;
    }

    @ElVoField(physicalName = "validAttachNo")
    public void setValidAttachNo(String validAttachNo){
        this.validAttachNo = validAttachNo;
    }

    @ElVoField(physicalName = "afc_del_row_odr")
    public String getAfc_del_row_odr(){
        return afc_del_row_odr;
    }

    @ElVoField(physicalName = "afc_del_row_odr")
    public void setAfc_del_row_odr(String afc_del_row_odr){
        this.afc_del_row_odr = afc_del_row_odr;
    }

    @ElVoField(physicalName = "afc_row_flag")
    public String getAfc_row_flag(){
        return afc_row_flag;
    }

    @ElVoField(physicalName = "afc_row_flag")
    public void setAfc_row_flag(String afc_row_flag){
        this.afc_row_flag = afc_row_flag;
    }

    @ElVoField(physicalName = "agy_del_row_odr")
    public String getAgy_del_row_odr(){
        return agy_del_row_odr;
    }

    @ElVoField(physicalName = "agy_del_row_odr")
    public void setAgy_del_row_odr(String agy_del_row_odr){
        this.agy_del_row_odr = agy_del_row_odr;
    }

    @ElVoField(physicalName = "agy_row_flag")
    public String getAgy_row_flag(){
        return agy_row_flag;
    }

    @ElVoField(physicalName = "agy_row_flag")
    public void setAgy_row_flag(String agy_row_flag){
        this.agy_row_flag = agy_row_flag;
    }

    @ElVoField(physicalName = "afc_del_odr")
    public String getAfc_del_odr(){
        return afc_del_odr;
    }

    @ElVoField(physicalName = "afc_del_odr")
    public void setAfc_del_odr(String afc_del_odr){
        this.afc_del_odr = afc_del_odr;
    }

    @ElVoField(physicalName = "agy_del_odr")
    public String getAgy_del_odr(){
        return agy_del_odr;
    }

    @ElVoField(physicalName = "agy_del_odr")
    public void setAgy_del_odr(String agy_del_odr){
        this.agy_del_odr = agy_del_odr;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public String getRegst_psn_syspayno(){
        return regst_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public void setRegst_psn_syspayno(String regst_psn_syspayno){
        this.regst_psn_syspayno = regst_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public String getUpdt_psn_syspayno(){
        return updt_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public void setUpdt_psn_syspayno(String updt_psn_syspayno){
        this.updt_psn_syspayno = updt_psn_syspayno;
    }

    @ElVoField(physicalName = "charg_nm")
    public String getCharg_nm(){
        return charg_nm;
    }

    @ElVoField(physicalName = "charg_nm")
    public void setCharg_nm(String charg_nm){
        this.charg_nm = charg_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LcpMouIntrnVo [");
        sb.append("mou_contrct_ymd1").append("=").append(mou_contrct_ymd1).append(",");
        sb.append("mou_contrct_ymd2").append("=").append(mou_contrct_ymd2).append(",");
        sb.append("mou_subj").append("=").append(mou_subj).append(",");
        sb.append("mou_knd").append("=").append(mou_knd).append(",");
        sb.append("contry_cd").append("=").append(contry_cd).append(",");
        sb.append("contract_state").append("=").append(contract_state).append(",");
        sb.append("cmpy_nm_eng").append("=").append(cmpy_nm_eng).append(",");
        sb.append("cmpy_nm_krchar").append("=").append(cmpy_nm_krchar).append(",");
        sb.append("mou_no").append("=").append(mou_no).append(",");
        sb.append("mou_schdl_ymd").append("=").append(mou_schdl_ymd).append(",");
        sb.append("mou_natn").append("=").append(mou_natn).append(",");
        sb.append("mou_natn_nm").append("=").append(mou_natn_nm).append(",");
        sb.append("mou_fild").append("=").append(mou_fild).append(",");
        sb.append("mou_fild_nm").append("=").append(mou_fild_nm).append(",");
        sb.append("mou_knd_nm").append("=").append(mou_knd_nm).append(",");
        sb.append("contrct_agncy").append("=").append(contrct_agncy).append(",");
        sb.append("contrct_goal").append("=").append(contrct_goal).append(",");
        sb.append("mou_goal").append("=").append(mou_goal).append(",");
        sb.append("mou_contnt").append("=").append(mou_contnt).append(",");
        sb.append("charg_syspayno").append("=").append(charg_syspayno).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("contrct_state").append("=").append(contrct_state).append(",");
        sb.append("contrct_state_nm").append("=").append(contrct_state_nm).append(",");
        sb.append("mou_contrct_ymd").append("=").append(mou_contrct_ymd).append(",");
        sb.append("mou_cls_ymd").append("=").append(mou_cls_ymd).append(",");
        sb.append("agncy_clsf_nm").append("=").append(agncy_clsf_nm).append(",");
        sb.append("krchar_agncy_nm").append("=").append(krchar_agncy_nm).append(",");
        sb.append("contrct_goal_nm1").append("=").append(contrct_goal_nm1).append(",");
        sb.append("contrct_goal_nm2").append("=").append(contrct_goal_nm2).append(",");
        sb.append("contrct_goal_nm3").append("=").append(contrct_goal_nm3).append(",");
        sb.append("contrct_goal_nm4").append("=").append(contrct_goal_nm4).append(",");
        sb.append("goal_count").append("=").append(goal_count).append(",");
        sb.append("contrct_syspayno").append("=").append(contrct_syspayno).append(",");
        sb.append("contrct_psn_nm").append("=").append(contrct_psn_nm).append(",");
        sb.append("contrct_psn_dept_cd").append("=").append(contrct_psn_dept_cd).append(",");
        sb.append("contrct_psn_dept_new_ymd").append("=").append(contrct_psn_dept_new_ymd).append(",");
        sb.append("contrct_psn_dept_nm").append("=").append(contrct_psn_dept_nm).append(",");
        sb.append("contrct_psn_posi_nm").append("=").append(contrct_psn_posi_nm).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("validAttachNo").append("=").append(validAttachNo).append(",");
        sb.append("afc_del_row_odr").append("=").append(afc_del_row_odr).append(",");
        sb.append("afc_row_flag").append("=").append(afc_row_flag).append(",");
        sb.append("agy_del_row_odr").append("=").append(agy_del_row_odr).append(",");
        sb.append("agy_row_flag").append("=").append(agy_row_flag).append(",");
        sb.append("afc_del_odr").append("=").append(afc_del_odr).append(",");
        sb.append("agy_del_odr").append("=").append(agy_del_odr).append(",");
        sb.append("regst_psn_syspayno").append("=").append(regst_psn_syspayno).append(",");
        sb.append("updt_psn_syspayno").append("=").append(updt_psn_syspayno).append(",");
        sb.append("charg_nm").append("=").append(charg_nm);
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
