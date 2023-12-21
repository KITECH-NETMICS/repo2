package kr.re.kitech.biz.fin.std.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "ResBgAcctMExp")
public class ResBgAcctMVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResBgAcctMVo(){
    }

    @ElDtoField(logicalName = "계정그룹", physicalName = "accnt_grp", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_grp;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "메인계정번호", physicalName = "main_accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_accnt_no;

    @ElDtoField(logicalName = "계정책임자", physicalName = "accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns;

    @ElDtoField(logicalName = "계정책임자명", physicalName = "accnt_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_nm;

    @ElDtoField(logicalName = "계정책임자사번", physicalName = "accnt_rspns_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_empno;

    @ElDtoField(logicalName = "계정책임자명사번", physicalName = "accnt_rspns_nm_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_nm_empno;

    @ElDtoField(logicalName = "예산통제자", physicalName = "bugt_ctrl_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_psn;

    @ElDtoField(logicalName = "예산통제자명", physicalName = "bugt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_nm;

    @ElDtoField(logicalName = "예산통제자사번", physicalName = "bugt_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_empno;

    @ElDtoField(logicalName = "계정상태", physicalName = "accnt_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_state;

    @ElDtoField(logicalName = "계정구분", physicalName = "accnt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_clsf;

    @ElDtoField(logicalName = "계정명", physicalName = "accnt_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_nm;

    @ElDtoField(logicalName = "재무사업구분", physicalName = "fin_bsns_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fin_bsns_clsf;

    @ElDtoField(logicalName = "시작일", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;

    @ElDtoField(logicalName = "종료일", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "총사업시작일", physicalName = "tot_prj_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_prj_start_ymd;

    @ElDtoField(logicalName = "총사업종료일", physicalName = "tot_prj_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_prj_cls_ymd;

    @ElDtoField(logicalName = "성과활용기간", physicalName = "rsut_use_orign_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rsut_use_orign_cls_ymd;

    @ElDtoField(logicalName = "통제한도율", physicalName = "ctrl_lmt_rt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctrl_lmt_rt;

    @ElDtoField(logicalName = "비목해소기준", physicalName = "itm_solve_base", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String itm_solve_base;

    @ElDtoField(logicalName = "비목해소기준명", physicalName = "itm_solve_base_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String itm_solve_base_nm;

    @ElDtoField(logicalName = "pbs유무", physicalName = "pbs_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pbs_ex;

    @ElDtoField(logicalName = "카드사용구분", physicalName = "card_use_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_use_ex;

    @ElDtoField(logicalName = "편성단위", physicalName = "fomat_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fomat_unit;

    @ElDtoField(logicalName = "용도구분", physicalName = "usg_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String usg_clsf;

    @ElDtoField(logicalName = "용도구분명", physicalName = "usg_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String usg_clsf_nm;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "원인행위구분(F/R)", physicalName = "mngmt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_clsf;

    @ElDtoField(logicalName = "관련계정번호", physicalName = "relat_accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat_accnt_no;

    @ElDtoField(logicalName = "관련계정명", physicalName = "relat_accnt_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat_accnt_no_nm;

    @ElDtoField(logicalName = "과세구분", physicalName = "tax_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_cd;

    @ElDtoField(logicalName = "과세구분명", physicalName = "tax_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_cd_nm;

    @ElDtoField(logicalName = "관련계정총사업기간", physicalName = "tot_prj_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_prj_ymd;

    @ElDtoField(logicalName = "인건비배분율", physicalName = "psn_pay_rt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psn_pay_rt;

    @ElDtoField(logicalName = "입력상태", physicalName = "rowStatus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rowStatus;

    @ElDtoField(logicalName = "화면서비스아이디", physicalName = "serviceId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String serviceId;

    @ElDtoField(logicalName = "계정책임자", physicalName = "relat_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat_no;

    @ElVoField(physicalName = "accnt_grp")
    public String getAccnt_grp(){
        return accnt_grp;
    }

    @ElVoField(physicalName = "accnt_grp")
    public void setAccnt_grp(String accnt_grp){
        this.accnt_grp = accnt_grp;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
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

    @ElVoField(physicalName = "accnt_rspns_nm_empno")
    public String getAccnt_rspns_nm_empno(){
        return accnt_rspns_nm_empno;
    }

    @ElVoField(physicalName = "accnt_rspns_nm_empno")
    public void setAccnt_rspns_nm_empno(String accnt_rspns_nm_empno){
        this.accnt_rspns_nm_empno = accnt_rspns_nm_empno;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn")
    public String getBugt_ctrl_psn(){
        return bugt_ctrl_psn;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn")
    public void setBugt_ctrl_psn(String bugt_ctrl_psn){
        this.bugt_ctrl_psn = bugt_ctrl_psn;
    }

    @ElVoField(physicalName = "bugt_nm")
    public String getBugt_nm(){
        return bugt_nm;
    }

    @ElVoField(physicalName = "bugt_nm")
    public void setBugt_nm(String bugt_nm){
        this.bugt_nm = bugt_nm;
    }

    @ElVoField(physicalName = "bugt_empno")
    public String getBugt_empno(){
        return bugt_empno;
    }

    @ElVoField(physicalName = "bugt_empno")
    public void setBugt_empno(String bugt_empno){
        this.bugt_empno = bugt_empno;
    }

    @ElVoField(physicalName = "accnt_state")
    public String getAccnt_state(){
        return accnt_state;
    }

    @ElVoField(physicalName = "accnt_state")
    public void setAccnt_state(String accnt_state){
        this.accnt_state = accnt_state;
    }

    @ElVoField(physicalName = "accnt_clsf")
    public String getAccnt_clsf(){
        return accnt_clsf;
    }

    @ElVoField(physicalName = "accnt_clsf")
    public void setAccnt_clsf(String accnt_clsf){
        this.accnt_clsf = accnt_clsf;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public String getAccnt_no_nm(){
        return accnt_no_nm;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public void setAccnt_no_nm(String accnt_no_nm){
        this.accnt_no_nm = accnt_no_nm;
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

    @ElVoField(physicalName = "rsut_use_orign_cls_ymd")
    public String getRsut_use_orign_cls_ymd(){
        return rsut_use_orign_cls_ymd;
    }

    @ElVoField(physicalName = "rsut_use_orign_cls_ymd")
    public void setRsut_use_orign_cls_ymd(String rsut_use_orign_cls_ymd){
        this.rsut_use_orign_cls_ymd = rsut_use_orign_cls_ymd;
    }

    @ElVoField(physicalName = "ctrl_lmt_rt")
    public String getCtrl_lmt_rt(){
        return ctrl_lmt_rt;
    }

    @ElVoField(physicalName = "ctrl_lmt_rt")
    public void setCtrl_lmt_rt(String ctrl_lmt_rt){
        this.ctrl_lmt_rt = ctrl_lmt_rt;
    }

    @ElVoField(physicalName = "itm_solve_base")
    public String getItm_solve_base(){
        return itm_solve_base;
    }

    @ElVoField(physicalName = "itm_solve_base")
    public void setItm_solve_base(String itm_solve_base){
        this.itm_solve_base = itm_solve_base;
    }

    @ElVoField(physicalName = "itm_solve_base_nm")
    public String getItm_solve_base_nm(){
        return itm_solve_base_nm;
    }

    @ElVoField(physicalName = "itm_solve_base_nm")
    public void setItm_solve_base_nm(String itm_solve_base_nm){
        this.itm_solve_base_nm = itm_solve_base_nm;
    }

    @ElVoField(physicalName = "pbs_ex")
    public String getPbs_ex(){
        return pbs_ex;
    }

    @ElVoField(physicalName = "pbs_ex")
    public void setPbs_ex(String pbs_ex){
        this.pbs_ex = pbs_ex;
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

    @ElVoField(physicalName = "usg_clsf")
    public String getUsg_clsf(){
        return usg_clsf;
    }

    @ElVoField(physicalName = "usg_clsf")
    public void setUsg_clsf(String usg_clsf){
        this.usg_clsf = usg_clsf;
    }

    @ElVoField(physicalName = "usg_clsf_nm")
    public String getUsg_clsf_nm(){
        return usg_clsf_nm;
    }

    @ElVoField(physicalName = "usg_clsf_nm")
    public void setUsg_clsf_nm(String usg_clsf_nm){
        this.usg_clsf_nm = usg_clsf_nm;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "mngmt_clsf")
    public String getMngmt_clsf(){
        return mngmt_clsf;
    }

    @ElVoField(physicalName = "mngmt_clsf")
    public void setMngmt_clsf(String mngmt_clsf){
        this.mngmt_clsf = mngmt_clsf;
    }

    @ElVoField(physicalName = "relat_accnt_no")
    public String getRelat_accnt_no(){
        return relat_accnt_no;
    }

    @ElVoField(physicalName = "relat_accnt_no")
    public void setRelat_accnt_no(String relat_accnt_no){
        this.relat_accnt_no = relat_accnt_no;
    }

    @ElVoField(physicalName = "relat_accnt_no_nm")
    public String getRelat_accnt_no_nm(){
        return relat_accnt_no_nm;
    }

    @ElVoField(physicalName = "relat_accnt_no_nm")
    public void setRelat_accnt_no_nm(String relat_accnt_no_nm){
        this.relat_accnt_no_nm = relat_accnt_no_nm;
    }

    @ElVoField(physicalName = "tax_cd")
    public String getTax_cd(){
        return tax_cd;
    }

    @ElVoField(physicalName = "tax_cd")
    public void setTax_cd(String tax_cd){
        this.tax_cd = tax_cd;
    }

    @ElVoField(physicalName = "tax_cd_nm")
    public String getTax_cd_nm(){
        return tax_cd_nm;
    }

    @ElVoField(physicalName = "tax_cd_nm")
    public void setTax_cd_nm(String tax_cd_nm){
        this.tax_cd_nm = tax_cd_nm;
    }

    @ElVoField(physicalName = "tot_prj_ymd")
    public String getTot_prj_ymd(){
        return tot_prj_ymd;
    }

    @ElVoField(physicalName = "tot_prj_ymd")
    public void setTot_prj_ymd(String tot_prj_ymd){
        this.tot_prj_ymd = tot_prj_ymd;
    }

    @ElVoField(physicalName = "psn_pay_rt")
    public String getPsn_pay_rt(){
        return psn_pay_rt;
    }

    @ElVoField(physicalName = "psn_pay_rt")
    public void setPsn_pay_rt(String psn_pay_rt){
        this.psn_pay_rt = psn_pay_rt;
    }

    @ElVoField(physicalName = "rowStatus")
    public String getRowStatus(){
        return rowStatus;
    }

    @ElVoField(physicalName = "rowStatus")
    public void setRowStatus(String rowStatus){
        this.rowStatus = rowStatus;
    }

    @ElVoField(physicalName = "serviceId")
    public String getServiceId(){
        return serviceId;
    }

    @ElVoField(physicalName = "serviceId")
    public void setServiceId(String serviceId){
        this.serviceId = serviceId;
    }

    @ElVoField(physicalName = "relat_no")
    public String getRelat_no(){
        return relat_no;
    }

    @ElVoField(physicalName = "relat_no")
    public void setRelat_no(String relat_no){
        this.relat_no = relat_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResBgAcctMVo [");
        sb.append("accnt_grp").append("=").append(accnt_grp).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("main_accnt_no").append("=").append(main_accnt_no).append(",");
        sb.append("accnt_rspns").append("=").append(accnt_rspns).append(",");
        sb.append("accnt_rspns_nm").append("=").append(accnt_rspns_nm).append(",");
        sb.append("accnt_rspns_empno").append("=").append(accnt_rspns_empno).append(",");
        sb.append("accnt_rspns_nm_empno").append("=").append(accnt_rspns_nm_empno).append(",");
        sb.append("bugt_ctrl_psn").append("=").append(bugt_ctrl_psn).append(",");
        sb.append("bugt_nm").append("=").append(bugt_nm).append(",");
        sb.append("bugt_empno").append("=").append(bugt_empno).append(",");
        sb.append("accnt_state").append("=").append(accnt_state).append(",");
        sb.append("accnt_clsf").append("=").append(accnt_clsf).append(",");
        sb.append("accnt_no_nm").append("=").append(accnt_no_nm).append(",");
        sb.append("fin_bsns_clsf").append("=").append(fin_bsns_clsf).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("tot_prj_start_ymd").append("=").append(tot_prj_start_ymd).append(",");
        sb.append("tot_prj_cls_ymd").append("=").append(tot_prj_cls_ymd).append(",");
        sb.append("rsut_use_orign_cls_ymd").append("=").append(rsut_use_orign_cls_ymd).append(",");
        sb.append("ctrl_lmt_rt").append("=").append(ctrl_lmt_rt).append(",");
        sb.append("itm_solve_base").append("=").append(itm_solve_base).append(",");
        sb.append("itm_solve_base_nm").append("=").append(itm_solve_base_nm).append(",");
        sb.append("pbs_ex").append("=").append(pbs_ex).append(",");
        sb.append("card_use_ex").append("=").append(card_use_ex).append(",");
        sb.append("fomat_unit").append("=").append(fomat_unit).append(",");
        sb.append("usg_clsf").append("=").append(usg_clsf).append(",");
        sb.append("usg_clsf_nm").append("=").append(usg_clsf_nm).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("mngmt_clsf").append("=").append(mngmt_clsf).append(",");
        sb.append("relat_accnt_no").append("=").append(relat_accnt_no).append(",");
        sb.append("relat_accnt_no_nm").append("=").append(relat_accnt_no_nm).append(",");
        sb.append("tax_cd").append("=").append(tax_cd).append(",");
        sb.append("tax_cd_nm").append("=").append(tax_cd_nm).append(",");
        sb.append("tot_prj_ymd").append("=").append(tot_prj_ymd).append(",");
        sb.append("psn_pay_rt").append("=").append(psn_pay_rt).append(",");
        sb.append("rowStatus").append("=").append(rowStatus).append(",");
        sb.append("serviceId").append("=").append(serviceId).append(",");
        sb.append("relat_no").append("=").append(relat_no);
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
