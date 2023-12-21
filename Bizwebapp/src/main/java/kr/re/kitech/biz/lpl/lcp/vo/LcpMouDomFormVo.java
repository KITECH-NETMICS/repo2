package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "LcpMouDomFormExp")
public class LcpMouDomFormVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public LcpMouDomFormVo(){
    }

    @ElDtoField(logicalName = "mouNo", physicalName = "mou_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_no;

    @ElDtoField(logicalName = "charg_tel", physicalName = "charg_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_tel;

    @ElDtoField(logicalName = "mouContrctYmd", physicalName = "mou_contrct_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_contrct_ymd;

    @ElDtoField(logicalName = "mouSubj", physicalName = "mou_subj", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_subj;

    @ElDtoField(logicalName = "mouClsYmd", physicalName = "mou_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_cls_ymd;

    @ElDtoField(logicalName = "contrctAgncy", physicalName = "contrct_agncy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_agncy;

    @ElDtoField(logicalName = "openYn", physicalName = "open_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String open_yn;

    @ElDtoField(logicalName = "chargSyspayno", physicalName = "charg_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_syspayno;

    @ElDtoField(logicalName = "chargNm", physicalName = "charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_nm;

    @ElDtoField(logicalName = "chargEmpno", physicalName = "charg_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_empno;

    @ElDtoField(logicalName = "contrctPsnDeptCd", physicalName = "contrct_psn_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_psn_dept_cd;

    @ElDtoField(logicalName = "contrctPsnDeptNewYmd", physicalName = "contrct_psn_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_psn_dept_new_ymd;

    @ElDtoField(logicalName = "contrctPsnDeptNm", physicalName = "contrct_psn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_psn_dept_nm;

    @ElDtoField(logicalName = "contrctPsnPosiNm", physicalName = "contrct_psn_posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_psn_posi_nm;

    @ElDtoField(logicalName = "mouGoal", physicalName = "mou_goal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_goal;

    @ElDtoField(logicalName = "mouContnt", physicalName = "mou_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_contnt;

    @ElDtoField(logicalName = "expecEfct", physicalName = "expec_efct", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expec_efct;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "validAttachNo", physicalName = "validAttachNo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String validAttachNo;

    @ElDtoField(logicalName = "cud_type", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "afc_del_row_odr", physicalName = "afc_del_row_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String afc_del_row_odr;

    @ElDtoField(logicalName = "mou_knd", physicalName = "mou_knd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_knd;

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

    @ElVoField(physicalName = "mou_no")
    public String getMou_no(){
        return mou_no;
    }

    @ElVoField(physicalName = "mou_no")
    public void setMou_no(String mou_no){
        this.mou_no = mou_no;
    }

    @ElVoField(physicalName = "charg_tel")
    public String getCharg_tel(){
        return charg_tel;
    }

    @ElVoField(physicalName = "charg_tel")
    public void setCharg_tel(String charg_tel){
        this.charg_tel = charg_tel;
    }

    @ElVoField(physicalName = "mou_contrct_ymd")
    public String getMou_contrct_ymd(){
        return mou_contrct_ymd;
    }

    @ElVoField(physicalName = "mou_contrct_ymd")
    public void setMou_contrct_ymd(String mou_contrct_ymd){
        this.mou_contrct_ymd = mou_contrct_ymd;
    }

    @ElVoField(physicalName = "mou_subj")
    public String getMou_subj(){
        return mou_subj;
    }

    @ElVoField(physicalName = "mou_subj")
    public void setMou_subj(String mou_subj){
        this.mou_subj = mou_subj;
    }

    @ElVoField(physicalName = "mou_cls_ymd")
    public String getMou_cls_ymd(){
        return mou_cls_ymd;
    }

    @ElVoField(physicalName = "mou_cls_ymd")
    public void setMou_cls_ymd(String mou_cls_ymd){
        this.mou_cls_ymd = mou_cls_ymd;
    }

    @ElVoField(physicalName = "contrct_agncy")
    public String getContrct_agncy(){
        return contrct_agncy;
    }

    @ElVoField(physicalName = "contrct_agncy")
    public void setContrct_agncy(String contrct_agncy){
        this.contrct_agncy = contrct_agncy;
    }

    @ElVoField(physicalName = "open_yn")
    public String getOpen_yn(){
        return open_yn;
    }

    @ElVoField(physicalName = "open_yn")
    public void setOpen_yn(String open_yn){
        this.open_yn = open_yn;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public String getCharg_syspayno(){
        return charg_syspayno;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public void setCharg_syspayno(String charg_syspayno){
        this.charg_syspayno = charg_syspayno;
    }

    @ElVoField(physicalName = "charg_nm")
    public String getCharg_nm(){
        return charg_nm;
    }

    @ElVoField(physicalName = "charg_nm")
    public void setCharg_nm(String charg_nm){
        this.charg_nm = charg_nm;
    }

    @ElVoField(physicalName = "charg_empno")
    public String getCharg_empno(){
        return charg_empno;
    }

    @ElVoField(physicalName = "charg_empno")
    public void setCharg_empno(String charg_empno){
        this.charg_empno = charg_empno;
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

    @ElVoField(physicalName = "expec_efct")
    public String getExpec_efct(){
        return expec_efct;
    }

    @ElVoField(physicalName = "expec_efct")
    public void setExpec_efct(String expec_efct){
        this.expec_efct = expec_efct;
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

    @ElVoField(physicalName = "validAttachNo")
    public String getValidAttachNo(){
        return validAttachNo;
    }

    @ElVoField(physicalName = "validAttachNo")
    public void setValidAttachNo(String validAttachNo){
        this.validAttachNo = validAttachNo;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "afc_del_row_odr")
    public String getAfc_del_row_odr(){
        return afc_del_row_odr;
    }

    @ElVoField(physicalName = "afc_del_row_odr")
    public void setAfc_del_row_odr(String afc_del_row_odr){
        this.afc_del_row_odr = afc_del_row_odr;
    }

    @ElVoField(physicalName = "mou_knd")
    public String getMou_knd(){
        return mou_knd;
    }

    @ElVoField(physicalName = "mou_knd")
    public void setMou_knd(String mou_knd){
        this.mou_knd = mou_knd;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LcpMouDomFormVo [");
        sb.append("mou_no").append("=").append(mou_no).append(",");
        sb.append("charg_tel").append("=").append(charg_tel).append(",");
        sb.append("mou_contrct_ymd").append("=").append(mou_contrct_ymd).append(",");
        sb.append("mou_subj").append("=").append(mou_subj).append(",");
        sb.append("mou_cls_ymd").append("=").append(mou_cls_ymd).append(",");
        sb.append("contrct_agncy").append("=").append(contrct_agncy).append(",");
        sb.append("open_yn").append("=").append(open_yn).append(",");
        sb.append("charg_syspayno").append("=").append(charg_syspayno).append(",");
        sb.append("charg_nm").append("=").append(charg_nm).append(",");
        sb.append("charg_empno").append("=").append(charg_empno).append(",");
        sb.append("contrct_psn_dept_cd").append("=").append(contrct_psn_dept_cd).append(",");
        sb.append("contrct_psn_dept_new_ymd").append("=").append(contrct_psn_dept_new_ymd).append(",");
        sb.append("contrct_psn_dept_nm").append("=").append(contrct_psn_dept_nm).append(",");
        sb.append("contrct_psn_posi_nm").append("=").append(contrct_psn_posi_nm).append(",");
        sb.append("mou_goal").append("=").append(mou_goal).append(",");
        sb.append("mou_contnt").append("=").append(mou_contnt).append(",");
        sb.append("expec_efct").append("=").append(expec_efct).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("validAttachNo").append("=").append(validAttachNo).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("afc_del_row_odr").append("=").append(afc_del_row_odr).append(",");
        sb.append("mou_knd").append("=").append(mou_knd).append(",");
        sb.append("afc_row_flag").append("=").append(afc_row_flag).append(",");
        sb.append("agy_del_row_odr").append("=").append(agy_del_row_odr).append(",");
        sb.append("agy_row_flag").append("=").append(agy_row_flag).append(",");
        sb.append("afc_del_odr").append("=").append(afc_del_odr).append(",");
        sb.append("agy_del_odr").append("=").append(agy_del_odr).append(",");
        sb.append("regst_psn_syspayno").append("=").append(regst_psn_syspayno).append(",");
        sb.append("updt_psn_syspayno").append("=").append(updt_psn_syspayno);
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
