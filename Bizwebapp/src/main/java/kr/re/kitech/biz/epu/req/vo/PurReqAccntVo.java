package kr.re.kitech.biz.epu.req.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "구매요구 계정내역 Vo")
public class PurReqAccntVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PurReqAccntVo(){
    }

    @ElDtoField(logicalName = "구매요구번호", physicalName = "pur_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_req_no;

    @ElDtoField(logicalName = "계정순번", physicalName = "accnt_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_odr;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "과제번호", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no;

    @ElDtoField(logicalName = "관리구분", physicalName = "mngmt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_clsf;

    @ElDtoField(logicalName = "계정명", physicalName = "accnt_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_nm;

    @ElDtoField(logicalName = "회계코드", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;

    @ElDtoField(logicalName = "회계코드명", physicalName = "accnt_cd_abbr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd_abbr;

    @ElDtoField(logicalName = "비용코드", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd;

    @ElDtoField(logicalName = "비용코드명", physicalName = "expns_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd_nm;

    @ElDtoField(logicalName = "계정책임자시스템개인번호", physicalName = "accnt_respn_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_respn_psn_syspayno;

    @ElDtoField(logicalName = "계정책임자개인번호", physicalName = "accnt_respn_psn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_respn_psn_empno;

    @ElDtoField(logicalName = "계정책임자성명", physicalName = "accnt_respn_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_respn_psn_nm;

    @ElDtoField(logicalName = "통제금액", physicalName = "ctrl_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long ctrl_amt;

    @ElDtoField(logicalName = "통제번호", physicalName = "ctrl_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctrl_no;

    @ElDtoField(logicalName = "계정요구금액", physicalName = "accnt_demnd_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long accnt_demnd_amt;

    @ElDtoField(logicalName = "기자재순번", physicalName = "equip_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_odr;

    @ElDtoField(logicalName = "기자재명", physicalName = "equip_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_nm;

    @ElDtoField(logicalName = "심의번호", physicalName = "consttn_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String consttn_no;

    @ElDtoField(logicalName = "심의구분", physicalName = "consttn_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String consttn_clsf;

    @ElDtoField(logicalName = "심의기구구분", physicalName = "consttn_plce_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String consttn_plce_clsf;

    @ElDtoField(logicalName = "심의기구", physicalName = "consttn_plce", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String consttn_plce;

    @ElDtoField(logicalName = "심의장소", physicalName = "consttn_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String consttn_resn;

    @ElDtoField(logicalName = "심의일자", physicalName = "consttn_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String consttn_ymd;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "부대비", physicalName = "incidntl_expns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String incidntl_expns;

    @ElDtoField(logicalName = "과세여부", physicalName = "tax_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_cd;

    @ElDtoField(logicalName = "카드사용구분", physicalName = "card_use_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_use_ex;

    @ElDtoField(logicalName = "계정종료일", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "부가세", physicalName = "add_tax", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long add_tax;

    @ElDtoField(logicalName = "공급가액", physicalName = "sum_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long sum_amt;

    @ElDtoField(logicalName = "연구기자재금액", physicalName = "amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long amt;

    @ElDtoField(logicalName = "NTIS장비번호", physicalName = "ntis_reg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ntis_reg_no;

    @ElDtoField(logicalName = "사업구분", physicalName = "bsns_cd_inout", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_inout;

    @ElDtoField(logicalName = "사업부처", physicalName = "bsns_cd_ofic", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_ofic;

    @ElDtoField(logicalName = "계정종료일(마감)", physicalName = "apply_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apply_cls_ymd;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElVoField(physicalName = "pur_req_no")
    public String getPur_req_no(){
        return pur_req_no;
    }

    @ElVoField(physicalName = "pur_req_no")
    public void setPur_req_no(String pur_req_no){
        this.pur_req_no = pur_req_no;
    }

    @ElVoField(physicalName = "accnt_odr")
    public String getAccnt_odr(){
        return accnt_odr;
    }

    @ElVoField(physicalName = "accnt_odr")
    public void setAccnt_odr(String accnt_odr){
        this.accnt_odr = accnt_odr;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
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

    @ElVoField(physicalName = "accnt_no_nm")
    public String getAccnt_no_nm(){
        return accnt_no_nm;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public void setAccnt_no_nm(String accnt_no_nm){
        this.accnt_no_nm = accnt_no_nm;
    }

    @ElVoField(physicalName = "accnt_cd")
    public String getAccnt_cd(){
        return accnt_cd;
    }

    @ElVoField(physicalName = "accnt_cd")
    public void setAccnt_cd(String accnt_cd){
        this.accnt_cd = accnt_cd;
    }

    @ElVoField(physicalName = "accnt_cd_abbr")
    public String getAccnt_cd_abbr(){
        return accnt_cd_abbr;
    }

    @ElVoField(physicalName = "accnt_cd_abbr")
    public void setAccnt_cd_abbr(String accnt_cd_abbr){
        this.accnt_cd_abbr = accnt_cd_abbr;
    }

    @ElVoField(physicalName = "expns_cd")
    public String getExpns_cd(){
        return expns_cd;
    }

    @ElVoField(physicalName = "expns_cd")
    public void setExpns_cd(String expns_cd){
        this.expns_cd = expns_cd;
    }

    @ElVoField(physicalName = "expns_cd_nm")
    public String getExpns_cd_nm(){
        return expns_cd_nm;
    }

    @ElVoField(physicalName = "expns_cd_nm")
    public void setExpns_cd_nm(String expns_cd_nm){
        this.expns_cd_nm = expns_cd_nm;
    }

    @ElVoField(physicalName = "accnt_respn_psn_syspayno")
    public String getAccnt_respn_psn_syspayno(){
        return accnt_respn_psn_syspayno;
    }

    @ElVoField(physicalName = "accnt_respn_psn_syspayno")
    public void setAccnt_respn_psn_syspayno(String accnt_respn_psn_syspayno){
        this.accnt_respn_psn_syspayno = accnt_respn_psn_syspayno;
    }

    @ElVoField(physicalName = "accnt_respn_psn_empno")
    public String getAccnt_respn_psn_empno(){
        return accnt_respn_psn_empno;
    }

    @ElVoField(physicalName = "accnt_respn_psn_empno")
    public void setAccnt_respn_psn_empno(String accnt_respn_psn_empno){
        this.accnt_respn_psn_empno = accnt_respn_psn_empno;
    }

    @ElVoField(physicalName = "accnt_respn_psn_nm")
    public String getAccnt_respn_psn_nm(){
        return accnt_respn_psn_nm;
    }

    @ElVoField(physicalName = "accnt_respn_psn_nm")
    public void setAccnt_respn_psn_nm(String accnt_respn_psn_nm){
        this.accnt_respn_psn_nm = accnt_respn_psn_nm;
    }

    @ElVoField(physicalName = "ctrl_amt")
    public long getCtrl_amt(){
        return ctrl_amt;
    }

    @ElVoField(physicalName = "ctrl_amt")
    public void setCtrl_amt(long ctrl_amt){
        this.ctrl_amt = ctrl_amt;
    }

    @ElVoField(physicalName = "ctrl_no")
    public String getCtrl_no(){
        return ctrl_no;
    }

    @ElVoField(physicalName = "ctrl_no")
    public void setCtrl_no(String ctrl_no){
        this.ctrl_no = ctrl_no;
    }

    @ElVoField(physicalName = "accnt_demnd_amt")
    public long getAccnt_demnd_amt(){
        return accnt_demnd_amt;
    }

    @ElVoField(physicalName = "accnt_demnd_amt")
    public void setAccnt_demnd_amt(long accnt_demnd_amt){
        this.accnt_demnd_amt = accnt_demnd_amt;
    }

    @ElVoField(physicalName = "equip_odr")
    public String getEquip_odr(){
        return equip_odr;
    }

    @ElVoField(physicalName = "equip_odr")
    public void setEquip_odr(String equip_odr){
        this.equip_odr = equip_odr;
    }

    @ElVoField(physicalName = "equip_nm")
    public String getEquip_nm(){
        return equip_nm;
    }

    @ElVoField(physicalName = "equip_nm")
    public void setEquip_nm(String equip_nm){
        this.equip_nm = equip_nm;
    }

    @ElVoField(physicalName = "consttn_no")
    public String getConsttn_no(){
        return consttn_no;
    }

    @ElVoField(physicalName = "consttn_no")
    public void setConsttn_no(String consttn_no){
        this.consttn_no = consttn_no;
    }

    @ElVoField(physicalName = "consttn_clsf")
    public String getConsttn_clsf(){
        return consttn_clsf;
    }

    @ElVoField(physicalName = "consttn_clsf")
    public void setConsttn_clsf(String consttn_clsf){
        this.consttn_clsf = consttn_clsf;
    }

    @ElVoField(physicalName = "consttn_plce_clsf")
    public String getConsttn_plce_clsf(){
        return consttn_plce_clsf;
    }

    @ElVoField(physicalName = "consttn_plce_clsf")
    public void setConsttn_plce_clsf(String consttn_plce_clsf){
        this.consttn_plce_clsf = consttn_plce_clsf;
    }

    @ElVoField(physicalName = "consttn_plce")
    public String getConsttn_plce(){
        return consttn_plce;
    }

    @ElVoField(physicalName = "consttn_plce")
    public void setConsttn_plce(String consttn_plce){
        this.consttn_plce = consttn_plce;
    }

    @ElVoField(physicalName = "consttn_resn")
    public String getConsttn_resn(){
        return consttn_resn;
    }

    @ElVoField(physicalName = "consttn_resn")
    public void setConsttn_resn(String consttn_resn){
        this.consttn_resn = consttn_resn;
    }

    @ElVoField(physicalName = "consttn_ymd")
    public String getConsttn_ymd(){
        return consttn_ymd;
    }

    @ElVoField(physicalName = "consttn_ymd")
    public void setConsttn_ymd(String consttn_ymd){
        this.consttn_ymd = consttn_ymd;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "incidntl_expns")
    public String getIncidntl_expns(){
        return incidntl_expns;
    }

    @ElVoField(physicalName = "incidntl_expns")
    public void setIncidntl_expns(String incidntl_expns){
        this.incidntl_expns = incidntl_expns;
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

    @ElVoField(physicalName = "cls_ymd")
    public String getCls_ymd(){
        return cls_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public void setCls_ymd(String cls_ymd){
        this.cls_ymd = cls_ymd;
    }

    @ElVoField(physicalName = "add_tax")
    public long getAdd_tax(){
        return add_tax;
    }

    @ElVoField(physicalName = "add_tax")
    public void setAdd_tax(long add_tax){
        this.add_tax = add_tax;
    }

    @ElVoField(physicalName = "sum_amt")
    public long getSum_amt(){
        return sum_amt;
    }

    @ElVoField(physicalName = "sum_amt")
    public void setSum_amt(long sum_amt){
        this.sum_amt = sum_amt;
    }

    @ElVoField(physicalName = "amt")
    public long getAmt(){
        return amt;
    }

    @ElVoField(physicalName = "amt")
    public void setAmt(long amt){
        this.amt = amt;
    }

    @ElVoField(physicalName = "ntis_reg_no")
    public String getNtis_reg_no(){
        return ntis_reg_no;
    }

    @ElVoField(physicalName = "ntis_reg_no")
    public void setNtis_reg_no(String ntis_reg_no){
        this.ntis_reg_no = ntis_reg_no;
    }

    @ElVoField(physicalName = "bsns_cd_inout")
    public String getBsns_cd_inout(){
        return bsns_cd_inout;
    }

    @ElVoField(physicalName = "bsns_cd_inout")
    public void setBsns_cd_inout(String bsns_cd_inout){
        this.bsns_cd_inout = bsns_cd_inout;
    }

    @ElVoField(physicalName = "bsns_cd_ofic")
    public String getBsns_cd_ofic(){
        return bsns_cd_ofic;
    }

    @ElVoField(physicalName = "bsns_cd_ofic")
    public void setBsns_cd_ofic(String bsns_cd_ofic){
        this.bsns_cd_ofic = bsns_cd_ofic;
    }

    @ElVoField(physicalName = "apply_cls_ymd")
    public String getApply_cls_ymd(){
        return apply_cls_ymd;
    }

    @ElVoField(physicalName = "apply_cls_ymd")
    public void setApply_cls_ymd(String apply_cls_ymd){
        this.apply_cls_ymd = apply_cls_ymd;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurReqAccntVo [");
        sb.append("pur_req_no").append("=").append(pur_req_no).append(",");
        sb.append("accnt_odr").append("=").append(accnt_odr).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("prj_no").append("=").append(prj_no).append(",");
        sb.append("mngmt_clsf").append("=").append(mngmt_clsf).append(",");
        sb.append("accnt_no_nm").append("=").append(accnt_no_nm).append(",");
        sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
        sb.append("accnt_cd_abbr").append("=").append(accnt_cd_abbr).append(",");
        sb.append("expns_cd").append("=").append(expns_cd).append(",");
        sb.append("expns_cd_nm").append("=").append(expns_cd_nm).append(",");
        sb.append("accnt_respn_psn_syspayno").append("=").append(accnt_respn_psn_syspayno).append(",");
        sb.append("accnt_respn_psn_empno").append("=").append(accnt_respn_psn_empno).append(",");
        sb.append("accnt_respn_psn_nm").append("=").append(accnt_respn_psn_nm).append(",");
        sb.append("ctrl_amt").append("=").append(ctrl_amt).append(",");
        sb.append("ctrl_no").append("=").append(ctrl_no).append(",");
        sb.append("accnt_demnd_amt").append("=").append(accnt_demnd_amt).append(",");
        sb.append("equip_odr").append("=").append(equip_odr).append(",");
        sb.append("equip_nm").append("=").append(equip_nm).append(",");
        sb.append("consttn_no").append("=").append(consttn_no).append(",");
        sb.append("consttn_clsf").append("=").append(consttn_clsf).append(",");
        sb.append("consttn_plce_clsf").append("=").append(consttn_plce_clsf).append(",");
        sb.append("consttn_plce").append("=").append(consttn_plce).append(",");
        sb.append("consttn_resn").append("=").append(consttn_resn).append(",");
        sb.append("consttn_ymd").append("=").append(consttn_ymd).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("incidntl_expns").append("=").append(incidntl_expns).append(",");
        sb.append("tax_cd").append("=").append(tax_cd).append(",");
        sb.append("card_use_ex").append("=").append(card_use_ex).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("add_tax").append("=").append(add_tax).append(",");
        sb.append("sum_amt").append("=").append(sum_amt).append(",");
        sb.append("amt").append("=").append(amt).append(",");
        sb.append("ntis_reg_no").append("=").append(ntis_reg_no).append(",");
        sb.append("bsns_cd_inout").append("=").append(bsns_cd_inout).append(",");
        sb.append("bsns_cd_ofic").append("=").append(bsns_cd_ofic).append(",");
        sb.append("apply_cls_ymd").append("=").append(apply_cls_ymd).append(",");
        sb.append("cud_type").append("=").append(cud_type);
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
