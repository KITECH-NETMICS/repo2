package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "계정번호마스터")
public class AccntNoPopupVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AccntNoPopupVo(){
    }

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "계정명", physicalName = "accnt_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_nm;

    @ElDtoField(logicalName = "메인계정번호", physicalName = "main_accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_accnt_no;

    @ElDtoField(logicalName = "계정책임자", physicalName = "accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns;

    @ElDtoField(logicalName = "예산통제자", physicalName = "bugt_ctrl_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_psn;

    @ElDtoField(logicalName = "계정구분", physicalName = "accnt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_clsf;

    @ElDtoField(logicalName = "과제번호", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no;

    @ElDtoField(logicalName = "관리구분", physicalName = "mngmt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_clsf;

    @ElDtoField(logicalName = "계정상태", physicalName = "accnt_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_state;

    @ElDtoField(logicalName = "계정상태명", physicalName = "accnt_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_state_nm;

    @ElDtoField(logicalName = "재무사업구분", physicalName = "fin_bsns_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fin_bsns_clsf;

    @ElDtoField(logicalName = "시작일자", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;

    @ElDtoField(logicalName = "종료일자", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "전체과제시작일자", physicalName = "tot_prj_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_prj_start_ymd;

    @ElDtoField(logicalName = "전체과제종료일자", physicalName = "tot_prj_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_prj_cls_ymd;

    @ElDtoField(logicalName = "비목해소기준", physicalName = "itm_solve_base", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String itm_solve_base;

    @ElDtoField(logicalName = "과세코드", physicalName = "tax_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_cd;

    @ElDtoField(logicalName = "카드사용구분", physicalName = "card_use_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_use_ex;

    @ElDtoField(logicalName = "편성단위", physicalName = "fomat_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fomat_unit;

    @ElDtoField(logicalName = "계정그룹", physicalName = "accnt_grp", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_grp;

    @ElDtoField(logicalName = "내외구분", physicalName = "bsns_cd_inout", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_inout;

    @ElDtoField(logicalName = "전문기관", physicalName = "bsns_cd_exclsv_agncy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_exclsv_agncy;

    @ElDtoField(logicalName = "관계부처", physicalName = "bsns_cd_ofic", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_ofic;

    @ElDtoField(logicalName = "계정책임자성명", physicalName = "accnt_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_nm;

    @ElDtoField(logicalName = "계정책임자개인번호", physicalName = "accnt_rspns_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_empno;

    @ElDtoField(logicalName = "증빙체크", physicalName = "evid_chk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evid_chk;

    @ElDtoField(logicalName = "구매 잔여일수", physicalName = "date_between", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String date_between;

    @ElDtoField(logicalName = "구매 계정마감일여부", physicalName = "ctrl_gbn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctrl_gbn;

    @ElDtoField(logicalName = "최초과제번호", physicalName = "first_pre_prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String first_pre_prj_no;

    @ElDtoField(logicalName = "연구지원담당자", physicalName = "dept_res_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_res_psn;

    @ElDtoField(logicalName = "경상비지원유무", physicalName = "srpt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String srpt_cd;

    @ElDtoField(logicalName = "연차정산상태(과제반납)", physicalName = "anal_adjst_decsn_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String anal_adjst_decsn_yn;

    @ElDtoField(logicalName = "신청번호(과제반납)", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "학생인건비풀링여부", physicalName = "student_cost_use", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String student_cost_use;

    @ElDtoField(logicalName = "연구노트사용유무", physicalName = "note_use_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String note_use_ex;

    @ElDtoField(logicalName = "연구노트유형", physicalName = "note_type_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String note_type_cd;

    @ElDtoField(logicalName = "계정책임자상세", physicalName = "accnt_rspns_detl_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_detl_nm;

    @ElDtoField(logicalName = "계정책임자부서", physicalName = "accnt_rspns_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_dept_nm;

    @ElDtoField(logicalName = "예산통제자개인번호", physicalName = "bugt_ctrl_psn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_psn_empno;

    @ElDtoField(logicalName = "예산통제자성명", physicalName = "bugt_ctrl_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_psn_nm;

    @ElDtoField(logicalName = "예산통제자상세", physicalName = "bugt_ctrl_psn_detl_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_psn_detl_nm;

    @ElDtoField(logicalName = "예산통제자부서", physicalName = "bugt_ctrl_psn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_psn_dept_nm;

    @ElDtoField(logicalName = "연구책임자", physicalName = "resch_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_rspns;

    @ElDtoField(logicalName = "연구책임자개인번호", physicalName = "resch_rspns_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_rspns_empno;

    @ElDtoField(logicalName = "연구책임자성명", physicalName = "resch_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_rspns_nm;

    @ElDtoField(logicalName = "연구책임자상세", physicalName = "resch_rspns_detl_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_rspns_detl_nm;

    @ElDtoField(logicalName = "연구책임자부서", physicalName = "resch_rspns_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_rspns_dept_nm;

    @ElDtoField(logicalName = "연구비현금", physicalName = "resch_fund", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long resch_fund;

    @ElDtoField(logicalName = "관계부처명", physicalName = "bsns_cd_ofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_ofic_nm;

    @ElDtoField(logicalName = "내역사업명", physicalName = "bsns_cd_detls_bsns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_detls_bsns_nm;

    @ElDtoField(logicalName = "보안과제유무", physicalName = "secrt_prj_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String secrt_prj_ex;

    @ElDtoField(logicalName = "연구자료공개여부", physicalName = "secrt_prj_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String secrt_prj_yn;

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public String getAccnt_no_nm(){
        return accnt_no_nm;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public void setAccnt_no_nm(String accnt_no_nm){
        this.accnt_no_nm = accnt_no_nm;
    }

    @ElVoField(physicalName = "main_accnt_no")
    public String getMain_accnt_no(){
        return main_accnt_no;
    }

    @ElVoField(physicalName = "main_accnt_no")
    public void setMain_accnt_no(String main_accnt_no){
        this.main_accnt_no = main_accnt_no;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public String getAccnt_rspns(){
        return accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public void setAccnt_rspns(String accnt_rspns){
        this.accnt_rspns = accnt_rspns;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn")
    public String getBugt_ctrl_psn(){
        return bugt_ctrl_psn;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn")
    public void setBugt_ctrl_psn(String bugt_ctrl_psn){
        this.bugt_ctrl_psn = bugt_ctrl_psn;
    }

    @ElVoField(physicalName = "accnt_clsf")
    public String getAccnt_clsf(){
        return accnt_clsf;
    }

    @ElVoField(physicalName = "accnt_clsf")
    public void setAccnt_clsf(String accnt_clsf){
        this.accnt_clsf = accnt_clsf;
    }

    @ElVoField(physicalName = "prj_no")
    public String getPrj_no(){
        return prj_no;
    }

    @ElVoField(physicalName = "prj_no")
    public void setPrj_no(String prj_no){
        this.prj_no = prj_no;
    }

    @ElVoField(physicalName = "mngmt_clsf")
    public String getMngmt_clsf(){
        return mngmt_clsf;
    }

    @ElVoField(physicalName = "mngmt_clsf")
    public void setMngmt_clsf(String mngmt_clsf){
        this.mngmt_clsf = mngmt_clsf;
    }

    @ElVoField(physicalName = "accnt_state")
    public String getAccnt_state(){
        return accnt_state;
    }

    @ElVoField(physicalName = "accnt_state")
    public void setAccnt_state(String accnt_state){
        this.accnt_state = accnt_state;
    }

    @ElVoField(physicalName = "accnt_state_nm")
    public String getAccnt_state_nm(){
        return accnt_state_nm;
    }

    @ElVoField(physicalName = "accnt_state_nm")
    public void setAccnt_state_nm(String accnt_state_nm){
        this.accnt_state_nm = accnt_state_nm;
    }

    @ElVoField(physicalName = "fin_bsns_clsf")
    public String getFin_bsns_clsf(){
        return fin_bsns_clsf;
    }

    @ElVoField(physicalName = "fin_bsns_clsf")
    public void setFin_bsns_clsf(String fin_bsns_clsf){
        this.fin_bsns_clsf = fin_bsns_clsf;
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

    @ElVoField(physicalName = "tot_prj_start_ymd")
    public String getTot_prj_start_ymd(){
        return tot_prj_start_ymd;
    }

    @ElVoField(physicalName = "tot_prj_start_ymd")
    public void setTot_prj_start_ymd(String tot_prj_start_ymd){
        this.tot_prj_start_ymd = tot_prj_start_ymd;
    }

    @ElVoField(physicalName = "tot_prj_cls_ymd")
    public String getTot_prj_cls_ymd(){
        return tot_prj_cls_ymd;
    }

    @ElVoField(physicalName = "tot_prj_cls_ymd")
    public void setTot_prj_cls_ymd(String tot_prj_cls_ymd){
        this.tot_prj_cls_ymd = tot_prj_cls_ymd;
    }

    @ElVoField(physicalName = "itm_solve_base")
    public String getItm_solve_base(){
        return itm_solve_base;
    }

    @ElVoField(physicalName = "itm_solve_base")
    public void setItm_solve_base(String itm_solve_base){
        this.itm_solve_base = itm_solve_base;
    }

    @ElVoField(physicalName = "tax_cd")
    public String getTax_cd(){
        return tax_cd;
    }

    @ElVoField(physicalName = "tax_cd")
    public void setTax_cd(String tax_cd){
        this.tax_cd = tax_cd;
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

    @ElVoField(physicalName = "accnt_grp")
    public String getAccnt_grp(){
        return accnt_grp;
    }

    @ElVoField(physicalName = "accnt_grp")
    public void setAccnt_grp(String accnt_grp){
        this.accnt_grp = accnt_grp;
    }

    @ElVoField(physicalName = "bsns_cd_inout")
    public String getBsns_cd_inout(){
        return bsns_cd_inout;
    }

    @ElVoField(physicalName = "bsns_cd_inout")
    public void setBsns_cd_inout(String bsns_cd_inout){
        this.bsns_cd_inout = bsns_cd_inout;
    }

    @ElVoField(physicalName = "bsns_cd_exclsv_agncy")
    public String getBsns_cd_exclsv_agncy(){
        return bsns_cd_exclsv_agncy;
    }

    @ElVoField(physicalName = "bsns_cd_exclsv_agncy")
    public void setBsns_cd_exclsv_agncy(String bsns_cd_exclsv_agncy){
        this.bsns_cd_exclsv_agncy = bsns_cd_exclsv_agncy;
    }

    @ElVoField(physicalName = "bsns_cd_ofic")
    public String getBsns_cd_ofic(){
        return bsns_cd_ofic;
    }

    @ElVoField(physicalName = "bsns_cd_ofic")
    public void setBsns_cd_ofic(String bsns_cd_ofic){
        this.bsns_cd_ofic = bsns_cd_ofic;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public String getAccnt_rspns_nm(){
        return accnt_rspns_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public void setAccnt_rspns_nm(String accnt_rspns_nm){
        this.accnt_rspns_nm = accnt_rspns_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_empno")
    public String getAccnt_rspns_empno(){
        return accnt_rspns_empno;
    }

    @ElVoField(physicalName = "accnt_rspns_empno")
    public void setAccnt_rspns_empno(String accnt_rspns_empno){
        this.accnt_rspns_empno = accnt_rspns_empno;
    }

    @ElVoField(physicalName = "evid_chk")
    public String getEvid_chk(){
        return evid_chk;
    }

    @ElVoField(physicalName = "evid_chk")
    public void setEvid_chk(String evid_chk){
        this.evid_chk = evid_chk;
    }

    @ElVoField(physicalName = "date_between")
    public String getDate_between(){
        return date_between;
    }

    @ElVoField(physicalName = "date_between")
    public void setDate_between(String date_between){
        this.date_between = date_between;
    }

    @ElVoField(physicalName = "ctrl_gbn")
    public String getCtrl_gbn(){
        return ctrl_gbn;
    }

    @ElVoField(physicalName = "ctrl_gbn")
    public void setCtrl_gbn(String ctrl_gbn){
        this.ctrl_gbn = ctrl_gbn;
    }

    @ElVoField(physicalName = "first_pre_prj_no")
    public String getFirst_pre_prj_no(){
        return first_pre_prj_no;
    }

    @ElVoField(physicalName = "first_pre_prj_no")
    public void setFirst_pre_prj_no(String first_pre_prj_no){
        this.first_pre_prj_no = first_pre_prj_no;
    }

    @ElVoField(physicalName = "dept_res_psn")
    public String getDept_res_psn(){
        return dept_res_psn;
    }

    @ElVoField(physicalName = "dept_res_psn")
    public void setDept_res_psn(String dept_res_psn){
        this.dept_res_psn = dept_res_psn;
    }

    @ElVoField(physicalName = "srpt_cd")
    public String getSrpt_cd(){
        return srpt_cd;
    }

    @ElVoField(physicalName = "srpt_cd")
    public void setSrpt_cd(String srpt_cd){
        this.srpt_cd = srpt_cd;
    }

    @ElVoField(physicalName = "anal_adjst_decsn_yn")
    public String getAnal_adjst_decsn_yn(){
        return anal_adjst_decsn_yn;
    }

    @ElVoField(physicalName = "anal_adjst_decsn_yn")
    public void setAnal_adjst_decsn_yn(String anal_adjst_decsn_yn){
        this.anal_adjst_decsn_yn = anal_adjst_decsn_yn;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "student_cost_use")
    public String getStudent_cost_use(){
        return student_cost_use;
    }

    @ElVoField(physicalName = "student_cost_use")
    public void setStudent_cost_use(String student_cost_use){
        this.student_cost_use = student_cost_use;
    }

    @ElVoField(physicalName = "note_use_ex")
    public String getNote_use_ex(){
        return note_use_ex;
    }

    @ElVoField(physicalName = "note_use_ex")
    public void setNote_use_ex(String note_use_ex){
        this.note_use_ex = note_use_ex;
    }

    @ElVoField(physicalName = "note_type_cd")
    public String getNote_type_cd(){
        return note_type_cd;
    }

    @ElVoField(physicalName = "note_type_cd")
    public void setNote_type_cd(String note_type_cd){
        this.note_type_cd = note_type_cd;
    }

    @ElVoField(physicalName = "accnt_rspns_detl_nm")
    public String getAccnt_rspns_detl_nm(){
        return accnt_rspns_detl_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_detl_nm")
    public void setAccnt_rspns_detl_nm(String accnt_rspns_detl_nm){
        this.accnt_rspns_detl_nm = accnt_rspns_detl_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_dept_nm")
    public String getAccnt_rspns_dept_nm(){
        return accnt_rspns_dept_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_dept_nm")
    public void setAccnt_rspns_dept_nm(String accnt_rspns_dept_nm){
        this.accnt_rspns_dept_nm = accnt_rspns_dept_nm;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn_empno")
    public String getBugt_ctrl_psn_empno(){
        return bugt_ctrl_psn_empno;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn_empno")
    public void setBugt_ctrl_psn_empno(String bugt_ctrl_psn_empno){
        this.bugt_ctrl_psn_empno = bugt_ctrl_psn_empno;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn_nm")
    public String getBugt_ctrl_psn_nm(){
        return bugt_ctrl_psn_nm;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn_nm")
    public void setBugt_ctrl_psn_nm(String bugt_ctrl_psn_nm){
        this.bugt_ctrl_psn_nm = bugt_ctrl_psn_nm;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn_detl_nm")
    public String getBugt_ctrl_psn_detl_nm(){
        return bugt_ctrl_psn_detl_nm;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn_detl_nm")
    public void setBugt_ctrl_psn_detl_nm(String bugt_ctrl_psn_detl_nm){
        this.bugt_ctrl_psn_detl_nm = bugt_ctrl_psn_detl_nm;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn_dept_nm")
    public String getBugt_ctrl_psn_dept_nm(){
        return bugt_ctrl_psn_dept_nm;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn_dept_nm")
    public void setBugt_ctrl_psn_dept_nm(String bugt_ctrl_psn_dept_nm){
        this.bugt_ctrl_psn_dept_nm = bugt_ctrl_psn_dept_nm;
    }

    @ElVoField(physicalName = "resch_rspns")
    public String getResch_rspns(){
        return resch_rspns;
    }

    @ElVoField(physicalName = "resch_rspns")
    public void setResch_rspns(String resch_rspns){
        this.resch_rspns = resch_rspns;
    }

    @ElVoField(physicalName = "resch_rspns_empno")
    public String getResch_rspns_empno(){
        return resch_rspns_empno;
    }

    @ElVoField(physicalName = "resch_rspns_empno")
    public void setResch_rspns_empno(String resch_rspns_empno){
        this.resch_rspns_empno = resch_rspns_empno;
    }

    @ElVoField(physicalName = "resch_rspns_nm")
    public String getResch_rspns_nm(){
        return resch_rspns_nm;
    }

    @ElVoField(physicalName = "resch_rspns_nm")
    public void setResch_rspns_nm(String resch_rspns_nm){
        this.resch_rspns_nm = resch_rspns_nm;
    }

    @ElVoField(physicalName = "resch_rspns_detl_nm")
    public String getResch_rspns_detl_nm(){
        return resch_rspns_detl_nm;
    }

    @ElVoField(physicalName = "resch_rspns_detl_nm")
    public void setResch_rspns_detl_nm(String resch_rspns_detl_nm){
        this.resch_rspns_detl_nm = resch_rspns_detl_nm;
    }

    @ElVoField(physicalName = "resch_rspns_dept_nm")
    public String getResch_rspns_dept_nm(){
        return resch_rspns_dept_nm;
    }

    @ElVoField(physicalName = "resch_rspns_dept_nm")
    public void setResch_rspns_dept_nm(String resch_rspns_dept_nm){
        this.resch_rspns_dept_nm = resch_rspns_dept_nm;
    }

    @ElVoField(physicalName = "resch_fund")
    public long getResch_fund(){
        return resch_fund;
    }

    @ElVoField(physicalName = "resch_fund")
    public void setResch_fund(long resch_fund){
        this.resch_fund = resch_fund;
    }

    @ElVoField(physicalName = "bsns_cd_ofic_nm")
    public String getBsns_cd_ofic_nm(){
        return bsns_cd_ofic_nm;
    }

    @ElVoField(physicalName = "bsns_cd_ofic_nm")
    public void setBsns_cd_ofic_nm(String bsns_cd_ofic_nm){
        this.bsns_cd_ofic_nm = bsns_cd_ofic_nm;
    }

    @ElVoField(physicalName = "bsns_cd_detls_bsns_nm")
    public String getBsns_cd_detls_bsns_nm(){
        return bsns_cd_detls_bsns_nm;
    }

    @ElVoField(physicalName = "bsns_cd_detls_bsns_nm")
    public void setBsns_cd_detls_bsns_nm(String bsns_cd_detls_bsns_nm){
        this.bsns_cd_detls_bsns_nm = bsns_cd_detls_bsns_nm;
    }

    @ElVoField(physicalName = "secrt_prj_ex")
    public String getSecrt_prj_ex(){
        return secrt_prj_ex;
    }

    @ElVoField(physicalName = "secrt_prj_ex")
    public void setSecrt_prj_ex(String secrt_prj_ex){
        this.secrt_prj_ex = secrt_prj_ex;
    }

    @ElVoField(physicalName = "secrt_prj_yn")
    public String getSecrt_prj_yn(){
        return secrt_prj_yn;
    }

    @ElVoField(physicalName = "secrt_prj_yn")
    public void setSecrt_prj_yn(String secrt_prj_yn){
        this.secrt_prj_yn = secrt_prj_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccntNoPopupVo [");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_no_nm").append("=").append(accnt_no_nm).append(",");
        sb.append("main_accnt_no").append("=").append(main_accnt_no).append(",");
        sb.append("accnt_rspns").append("=").append(accnt_rspns).append(",");
        sb.append("bugt_ctrl_psn").append("=").append(bugt_ctrl_psn).append(",");
        sb.append("accnt_clsf").append("=").append(accnt_clsf).append(",");
        sb.append("prj_no").append("=").append(prj_no).append(",");
        sb.append("mngmt_clsf").append("=").append(mngmt_clsf).append(",");
        sb.append("accnt_state").append("=").append(accnt_state).append(",");
        sb.append("accnt_state_nm").append("=").append(accnt_state_nm).append(",");
        sb.append("fin_bsns_clsf").append("=").append(fin_bsns_clsf).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("tot_prj_start_ymd").append("=").append(tot_prj_start_ymd).append(",");
        sb.append("tot_prj_cls_ymd").append("=").append(tot_prj_cls_ymd).append(",");
        sb.append("itm_solve_base").append("=").append(itm_solve_base).append(",");
        sb.append("tax_cd").append("=").append(tax_cd).append(",");
        sb.append("card_use_ex").append("=").append(card_use_ex).append(",");
        sb.append("fomat_unit").append("=").append(fomat_unit).append(",");
        sb.append("accnt_grp").append("=").append(accnt_grp).append(",");
        sb.append("bsns_cd_inout").append("=").append(bsns_cd_inout).append(",");
        sb.append("bsns_cd_exclsv_agncy").append("=").append(bsns_cd_exclsv_agncy).append(",");
        sb.append("bsns_cd_ofic").append("=").append(bsns_cd_ofic).append(",");
        sb.append("accnt_rspns_nm").append("=").append(accnt_rspns_nm).append(",");
        sb.append("accnt_rspns_empno").append("=").append(accnt_rspns_empno).append(",");
        sb.append("evid_chk").append("=").append(evid_chk).append(",");
        sb.append("date_between").append("=").append(date_between).append(",");
        sb.append("ctrl_gbn").append("=").append(ctrl_gbn).append(",");
        sb.append("first_pre_prj_no").append("=").append(first_pre_prj_no).append(",");
        sb.append("dept_res_psn").append("=").append(dept_res_psn).append(",");
        sb.append("srpt_cd").append("=").append(srpt_cd).append(",");
        sb.append("anal_adjst_decsn_yn").append("=").append(anal_adjst_decsn_yn).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("student_cost_use").append("=").append(student_cost_use).append(",");
        sb.append("note_use_ex").append("=").append(note_use_ex).append(",");
        sb.append("note_type_cd").append("=").append(note_type_cd).append(",");
        sb.append("accnt_rspns_detl_nm").append("=").append(accnt_rspns_detl_nm).append(",");
        sb.append("accnt_rspns_dept_nm").append("=").append(accnt_rspns_dept_nm).append(",");
        sb.append("bugt_ctrl_psn_empno").append("=").append(bugt_ctrl_psn_empno).append(",");
        sb.append("bugt_ctrl_psn_nm").append("=").append(bugt_ctrl_psn_nm).append(",");
        sb.append("bugt_ctrl_psn_detl_nm").append("=").append(bugt_ctrl_psn_detl_nm).append(",");
        sb.append("bugt_ctrl_psn_dept_nm").append("=").append(bugt_ctrl_psn_dept_nm).append(",");
        sb.append("resch_rspns").append("=").append(resch_rspns).append(",");
        sb.append("resch_rspns_empno").append("=").append(resch_rspns_empno).append(",");
        sb.append("resch_rspns_nm").append("=").append(resch_rspns_nm).append(",");
        sb.append("resch_rspns_detl_nm").append("=").append(resch_rspns_detl_nm).append(",");
        sb.append("resch_rspns_dept_nm").append("=").append(resch_rspns_dept_nm).append(",");
        sb.append("resch_fund").append("=").append(resch_fund).append(",");
        sb.append("bsns_cd_ofic_nm").append("=").append(bsns_cd_ofic_nm).append(",");
        sb.append("bsns_cd_detls_bsns_nm").append("=").append(bsns_cd_detls_bsns_nm).append(",");
        sb.append("secrt_prj_ex").append("=").append(secrt_prj_ex).append(",");
        sb.append("secrt_prj_yn").append("=").append(secrt_prj_yn);
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
