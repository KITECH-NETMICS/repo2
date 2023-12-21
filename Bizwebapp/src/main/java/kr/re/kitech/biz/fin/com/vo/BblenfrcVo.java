package kr.re.kitech.biz.fin.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "예산통제_신청 Vo")
public class BblenfrcVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public BblenfrcVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "신청순번", physicalName = "req_seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int req_seq;

    @ElDtoField(logicalName = "신청구분", physicalName = "req_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_clsf;

    @ElDtoField(logicalName = "신청일자", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "신청자", physicalName = "req_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn;

    @ElDtoField(logicalName = "신청부서", physicalName = "req_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept;

    @ElDtoField(logicalName = "신청부서신설일자", physicalName = "req_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_new_ymd;

    @ElDtoField(logicalName = "통제번호", physicalName = "ctrl_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctrl_no;

    @ElDtoField(logicalName = "통제자", physicalName = "ctrl_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctrl_psn;

    @ElDtoField(logicalName = "통제방법", physicalName = "bugt_ctrl_way", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_way;

    @ElDtoField(logicalName = "통제일자", physicalName = "ctrl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctrl_ymd;

    @ElDtoField(logicalName = "편성단위", physicalName = "fomat_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fomat_unit;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "회계코드", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;

    @ElDtoField(logicalName = "비용코드", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd;

    @ElDtoField(logicalName = "거래처코드", physicalName = "vend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_cd;

    @ElDtoField(logicalName = "거래처명", physicalName = "vend_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_nm;

    @ElDtoField(logicalName = "신청금액", physicalName = "req_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long req_amt;

    @ElDtoField(logicalName = "이전신청금액", physicalName = "old_req_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long old_req_amt;

    @ElDtoField(logicalName = "원인행위금액", physicalName = "enfrc_amt_cause", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long enfrc_amt_cause;

    @ElDtoField(logicalName = "이전원인행위금액", physicalName = "old_enfrc_amt_cause", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long old_enfrc_amt_cause;

    @ElDtoField(logicalName = "부분전체구분", physicalName = "part_all_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String part_all_clsf;

    @ElDtoField(logicalName = "결의금액", physicalName = "unslip_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long unslip_amt;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "결의순번", physicalName = "unslip_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int unslip_odr;

    @ElDtoField(logicalName = "통제상태", physicalName = "ctrl_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctrl_state;

    @ElDtoField(logicalName = "비고1", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "비고2", physicalName = "rmk_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk_2;

    @ElDtoField(logicalName = "비고3", physicalName = "rmk_3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk_3;

    @ElDtoField(logicalName = "개인번호", physicalName = "relat_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat_no;

    @ElDtoField(logicalName = "대체금액", physicalName = "trans_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long trans_amt;

    @ElDtoField(logicalName = "대체결의번호", physicalName = "trans_unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_unslip_no;

    @ElDtoField(logicalName = "대체결의순번", physicalName = "trans_unslip_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int trans_unslip_odr;

    @ElDtoField(logicalName = "예산년도", physicalName = "bugt_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_yr;

    @ElDtoField(logicalName = "통제여부(Y일때 exception처리)", physicalName = "ctrn_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctrn_yn;

    @ElDtoField(logicalName = "첨부파일", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "req_seq")
    public int getReq_seq(){
        return req_seq;
    }

    @ElVoField(physicalName = "req_seq")
    public void setReq_seq(int req_seq){
        this.req_seq = req_seq;
    }

    @ElVoField(physicalName = "req_clsf")
    public String getReq_clsf(){
        return req_clsf;
    }

    @ElVoField(physicalName = "req_clsf")
    public void setReq_clsf(String req_clsf){
        this.req_clsf = req_clsf;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "req_psn")
    public String getReq_psn(){
        return req_psn;
    }

    @ElVoField(physicalName = "req_psn")
    public void setReq_psn(String req_psn){
        this.req_psn = req_psn;
    }

    @ElVoField(physicalName = "req_dept")
    public String getReq_dept(){
        return req_dept;
    }

    @ElVoField(physicalName = "req_dept")
    public void setReq_dept(String req_dept){
        this.req_dept = req_dept;
    }

    @ElVoField(physicalName = "req_dept_new_ymd")
    public String getReq_dept_new_ymd(){
        return req_dept_new_ymd;
    }

    @ElVoField(physicalName = "req_dept_new_ymd")
    public void setReq_dept_new_ymd(String req_dept_new_ymd){
        this.req_dept_new_ymd = req_dept_new_ymd;
    }

    @ElVoField(physicalName = "ctrl_no")
    public String getCtrl_no(){
        return ctrl_no;
    }

    @ElVoField(physicalName = "ctrl_no")
    public void setCtrl_no(String ctrl_no){
        this.ctrl_no = ctrl_no;
    }

    @ElVoField(physicalName = "ctrl_psn")
    public String getCtrl_psn(){
        return ctrl_psn;
    }

    @ElVoField(physicalName = "ctrl_psn")
    public void setCtrl_psn(String ctrl_psn){
        this.ctrl_psn = ctrl_psn;
    }

    @ElVoField(physicalName = "bugt_ctrl_way")
    public String getBugt_ctrl_way(){
        return bugt_ctrl_way;
    }

    @ElVoField(physicalName = "bugt_ctrl_way")
    public void setBugt_ctrl_way(String bugt_ctrl_way){
        this.bugt_ctrl_way = bugt_ctrl_way;
    }

    @ElVoField(physicalName = "ctrl_ymd")
    public String getCtrl_ymd(){
        return ctrl_ymd;
    }

    @ElVoField(physicalName = "ctrl_ymd")
    public void setCtrl_ymd(String ctrl_ymd){
        this.ctrl_ymd = ctrl_ymd;
    }

    @ElVoField(physicalName = "fomat_unit")
    public String getFomat_unit(){
        return fomat_unit;
    }

    @ElVoField(physicalName = "fomat_unit")
    public void setFomat_unit(String fomat_unit){
        this.fomat_unit = fomat_unit;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
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

    @ElVoField(physicalName = "vend_cd")
    public String getVend_cd(){
        return vend_cd;
    }

    @ElVoField(physicalName = "vend_cd")
    public void setVend_cd(String vend_cd){
        this.vend_cd = vend_cd;
    }

    @ElVoField(physicalName = "vend_nm")
    public String getVend_nm(){
        return vend_nm;
    }

    @ElVoField(physicalName = "vend_nm")
    public void setVend_nm(String vend_nm){
        this.vend_nm = vend_nm;
    }

    @ElVoField(physicalName = "req_amt")
    public long getReq_amt(){
        return req_amt;
    }

    @ElVoField(physicalName = "req_amt")
    public void setReq_amt(long req_amt){
        this.req_amt = req_amt;
    }

    @ElVoField(physicalName = "old_req_amt")
    public long getOld_req_amt(){
        return old_req_amt;
    }

    @ElVoField(physicalName = "old_req_amt")
    public void setOld_req_amt(long old_req_amt){
        this.old_req_amt = old_req_amt;
    }

    @ElVoField(physicalName = "enfrc_amt_cause")
    public long getEnfrc_amt_cause(){
        return enfrc_amt_cause;
    }

    @ElVoField(physicalName = "enfrc_amt_cause")
    public void setEnfrc_amt_cause(long enfrc_amt_cause){
        this.enfrc_amt_cause = enfrc_amt_cause;
    }

    @ElVoField(physicalName = "old_enfrc_amt_cause")
    public long getOld_enfrc_amt_cause(){
        return old_enfrc_amt_cause;
    }

    @ElVoField(physicalName = "old_enfrc_amt_cause")
    public void setOld_enfrc_amt_cause(long old_enfrc_amt_cause){
        this.old_enfrc_amt_cause = old_enfrc_amt_cause;
    }

    @ElVoField(physicalName = "part_all_clsf")
    public String getPart_all_clsf(){
        return part_all_clsf;
    }

    @ElVoField(physicalName = "part_all_clsf")
    public void setPart_all_clsf(String part_all_clsf){
        this.part_all_clsf = part_all_clsf;
    }

    @ElVoField(physicalName = "unslip_amt")
    public long getUnslip_amt(){
        return unslip_amt;
    }

    @ElVoField(physicalName = "unslip_amt")
    public void setUnslip_amt(long unslip_amt){
        this.unslip_amt = unslip_amt;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "unslip_odr")
    public int getUnslip_odr(){
        return unslip_odr;
    }

    @ElVoField(physicalName = "unslip_odr")
    public void setUnslip_odr(int unslip_odr){
        this.unslip_odr = unslip_odr;
    }

    @ElVoField(physicalName = "ctrl_state")
    public String getCtrl_state(){
        return ctrl_state;
    }

    @ElVoField(physicalName = "ctrl_state")
    public void setCtrl_state(String ctrl_state){
        this.ctrl_state = ctrl_state;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "rmk_2")
    public String getRmk_2(){
        return rmk_2;
    }

    @ElVoField(physicalName = "rmk_2")
    public void setRmk_2(String rmk_2){
        this.rmk_2 = rmk_2;
    }

    @ElVoField(physicalName = "rmk_3")
    public String getRmk_3(){
        return rmk_3;
    }

    @ElVoField(physicalName = "rmk_3")
    public void setRmk_3(String rmk_3){
        this.rmk_3 = rmk_3;
    }

    @ElVoField(physicalName = "relat_no")
    public String getRelat_no(){
        return relat_no;
    }

    @ElVoField(physicalName = "relat_no")
    public void setRelat_no(String relat_no){
        this.relat_no = relat_no;
    }

    @ElVoField(physicalName = "trans_amt")
    public long getTrans_amt(){
        return trans_amt;
    }

    @ElVoField(physicalName = "trans_amt")
    public void setTrans_amt(long trans_amt){
        this.trans_amt = trans_amt;
    }

    @ElVoField(physicalName = "trans_unslip_no")
    public String getTrans_unslip_no(){
        return trans_unslip_no;
    }

    @ElVoField(physicalName = "trans_unslip_no")
    public void setTrans_unslip_no(String trans_unslip_no){
        this.trans_unslip_no = trans_unslip_no;
    }

    @ElVoField(physicalName = "trans_unslip_odr")
    public int getTrans_unslip_odr(){
        return trans_unslip_odr;
    }

    @ElVoField(physicalName = "trans_unslip_odr")
    public void setTrans_unslip_odr(int trans_unslip_odr){
        this.trans_unslip_odr = trans_unslip_odr;
    }

    @ElVoField(physicalName = "bugt_yr")
    public String getBugt_yr(){
        return bugt_yr;
    }

    @ElVoField(physicalName = "bugt_yr")
    public void setBugt_yr(String bugt_yr){
        this.bugt_yr = bugt_yr;
    }

    @ElVoField(physicalName = "ctrn_yn")
    public String getCtrn_yn(){
        return ctrn_yn;
    }

    @ElVoField(physicalName = "ctrn_yn")
    public void setCtrn_yn(String ctrn_yn){
        this.ctrn_yn = ctrn_yn;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BblenfrcVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_seq").append("=").append(req_seq).append(",");
        sb.append("req_clsf").append("=").append(req_clsf).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("req_psn").append("=").append(req_psn).append(",");
        sb.append("req_dept").append("=").append(req_dept).append(",");
        sb.append("req_dept_new_ymd").append("=").append(req_dept_new_ymd).append(",");
        sb.append("ctrl_no").append("=").append(ctrl_no).append(",");
        sb.append("ctrl_psn").append("=").append(ctrl_psn).append(",");
        sb.append("bugt_ctrl_way").append("=").append(bugt_ctrl_way).append(",");
        sb.append("ctrl_ymd").append("=").append(ctrl_ymd).append(",");
        sb.append("fomat_unit").append("=").append(fomat_unit).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
        sb.append("expns_cd").append("=").append(expns_cd).append(",");
        sb.append("vend_cd").append("=").append(vend_cd).append(",");
        sb.append("vend_nm").append("=").append(vend_nm).append(",");
        sb.append("req_amt").append("=").append(req_amt).append(",");
        sb.append("old_req_amt").append("=").append(old_req_amt).append(",");
        sb.append("enfrc_amt_cause").append("=").append(enfrc_amt_cause).append(",");
        sb.append("old_enfrc_amt_cause").append("=").append(old_enfrc_amt_cause).append(",");
        sb.append("part_all_clsf").append("=").append(part_all_clsf).append(",");
        sb.append("unslip_amt").append("=").append(unslip_amt).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("unslip_odr").append("=").append(unslip_odr).append(",");
        sb.append("ctrl_state").append("=").append(ctrl_state).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("rmk_2").append("=").append(rmk_2).append(",");
        sb.append("rmk_3").append("=").append(rmk_3).append(",");
        sb.append("relat_no").append("=").append(relat_no).append(",");
        sb.append("trans_amt").append("=").append(trans_amt).append(",");
        sb.append("trans_unslip_no").append("=").append(trans_unslip_no).append(",");
        sb.append("trans_unslip_odr").append("=").append(trans_unslip_odr).append(",");
        sb.append("bugt_yr").append("=").append(bugt_yr).append(",");
        sb.append("ctrn_yn").append("=").append(ctrn_yn).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no);
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
