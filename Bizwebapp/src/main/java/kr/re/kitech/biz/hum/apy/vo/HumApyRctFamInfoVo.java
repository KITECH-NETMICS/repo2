package kr.re.kitech.biz.hum.apy.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "가족수당신청 가족정보")
public class HumApyRctFamInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumApyRctFamInfoVo(){
    }

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "residNo", physicalName = "resid_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resid_no;

    @ElDtoField(logicalName = "age", physicalName = "age", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String age;

    @ElDtoField(logicalName = "relat", physicalName = "relat", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat;

    @ElDtoField(logicalName = "relatNm", physicalName = "relat_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat_nm;

    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "ocptNm", physicalName = "ocpt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ocpt_nm;

    @ElDtoField(logicalName = "educ", physicalName = "educ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ;

    @ElDtoField(logicalName = "educNm", physicalName = "educ_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_nm;

    @ElDtoField(logicalName = "addr", physicalName = "addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr;

    @ElDtoField(logicalName = "detlsAddr", physicalName = "detls_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String detls_addr;

    @ElDtoField(logicalName = "psinsrYn", physicalName = "psinsr_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psinsr_yn;

    @ElDtoField(logicalName = "cohbtYn", physicalName = "cohbt_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cohbt_yn;

    @ElDtoField(logicalName = "obstYn", physicalName = "obst_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String obst_yn;

    @ElDtoField(logicalName = "humanDedctYn", physicalName = "human_dedct_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String human_dedct_yn;

    @ElDtoField(logicalName = "famPayamtYn", physicalName = "fam_payamt_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fam_payamt_yn;

    @ElDtoField(logicalName = "exceptYn", physicalName = "except_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String except_yn;

    @ElDtoField(logicalName = "payamtOccrYmd", physicalName = "payamt_occr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String payamt_occr_ymd;

    @ElDtoField(logicalName = "payamtClsYmd", physicalName = "payamt_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String payamt_cls_ymd;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "delFlag", physicalName = "del_flag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String del_flag;

    @ElDtoField(logicalName = "bfClsf", physicalName = "bf_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bf_clsf;

    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "cudType", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "postmt_no", physicalName = "postmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String postmt_no;

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "resid_no")
    public String getResid_no(){
        return resid_no;
    }

    @ElVoField(physicalName = "resid_no")
    public void setResid_no(String resid_no){
        this.resid_no = resid_no;
    }

    @ElVoField(physicalName = "age")
    public String getAge(){
        return age;
    }

    @ElVoField(physicalName = "age")
    public void setAge(String age){
        this.age = age;
    }

    @ElVoField(physicalName = "relat")
    public String getRelat(){
        return relat;
    }

    @ElVoField(physicalName = "relat")
    public void setRelat(String relat){
        this.relat = relat;
    }

    @ElVoField(physicalName = "relat_nm")
    public String getRelat_nm(){
        return relat_nm;
    }

    @ElVoField(physicalName = "relat_nm")
    public void setRelat_nm(String relat_nm){
        this.relat_nm = relat_nm;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "ocpt_nm")
    public String getOcpt_nm(){
        return ocpt_nm;
    }

    @ElVoField(physicalName = "ocpt_nm")
    public void setOcpt_nm(String ocpt_nm){
        this.ocpt_nm = ocpt_nm;
    }

    @ElVoField(physicalName = "educ")
    public String getEduc(){
        return educ;
    }

    @ElVoField(physicalName = "educ")
    public void setEduc(String educ){
        this.educ = educ;
    }

    @ElVoField(physicalName = "educ_nm")
    public String getEduc_nm(){
        return educ_nm;
    }

    @ElVoField(physicalName = "educ_nm")
    public void setEduc_nm(String educ_nm){
        this.educ_nm = educ_nm;
    }

    @ElVoField(physicalName = "addr")
    public String getAddr(){
        return addr;
    }

    @ElVoField(physicalName = "addr")
    public void setAddr(String addr){
        this.addr = addr;
    }

    @ElVoField(physicalName = "detls_addr")
    public String getDetls_addr(){
        return detls_addr;
    }

    @ElVoField(physicalName = "detls_addr")
    public void setDetls_addr(String detls_addr){
        this.detls_addr = detls_addr;
    }

    @ElVoField(physicalName = "psinsr_yn")
    public String getPsinsr_yn(){
        return psinsr_yn;
    }

    @ElVoField(physicalName = "psinsr_yn")
    public void setPsinsr_yn(String psinsr_yn){
        this.psinsr_yn = psinsr_yn;
    }

    @ElVoField(physicalName = "cohbt_yn")
    public String getCohbt_yn(){
        return cohbt_yn;
    }

    @ElVoField(physicalName = "cohbt_yn")
    public void setCohbt_yn(String cohbt_yn){
        this.cohbt_yn = cohbt_yn;
    }

    @ElVoField(physicalName = "obst_yn")
    public String getObst_yn(){
        return obst_yn;
    }

    @ElVoField(physicalName = "obst_yn")
    public void setObst_yn(String obst_yn){
        this.obst_yn = obst_yn;
    }

    @ElVoField(physicalName = "human_dedct_yn")
    public String getHuman_dedct_yn(){
        return human_dedct_yn;
    }

    @ElVoField(physicalName = "human_dedct_yn")
    public void setHuman_dedct_yn(String human_dedct_yn){
        this.human_dedct_yn = human_dedct_yn;
    }

    @ElVoField(physicalName = "fam_payamt_yn")
    public String getFam_payamt_yn(){
        return fam_payamt_yn;
    }

    @ElVoField(physicalName = "fam_payamt_yn")
    public void setFam_payamt_yn(String fam_payamt_yn){
        this.fam_payamt_yn = fam_payamt_yn;
    }

    @ElVoField(physicalName = "except_yn")
    public String getExcept_yn(){
        return except_yn;
    }

    @ElVoField(physicalName = "except_yn")
    public void setExcept_yn(String except_yn){
        this.except_yn = except_yn;
    }

    @ElVoField(physicalName = "payamt_occr_ymd")
    public String getPayamt_occr_ymd(){
        return payamt_occr_ymd;
    }

    @ElVoField(physicalName = "payamt_occr_ymd")
    public void setPayamt_occr_ymd(String payamt_occr_ymd){
        this.payamt_occr_ymd = payamt_occr_ymd;
    }

    @ElVoField(physicalName = "payamt_cls_ymd")
    public String getPayamt_cls_ymd(){
        return payamt_cls_ymd;
    }

    @ElVoField(physicalName = "payamt_cls_ymd")
    public void setPayamt_cls_ymd(String payamt_cls_ymd){
        this.payamt_cls_ymd = payamt_cls_ymd;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "del_flag")
    public String getDel_flag(){
        return del_flag;
    }

    @ElVoField(physicalName = "del_flag")
    public void setDel_flag(String del_flag){
        this.del_flag = del_flag;
    }

    @ElVoField(physicalName = "bf_clsf")
    public String getBf_clsf(){
        return bf_clsf;
    }

    @ElVoField(physicalName = "bf_clsf")
    public void setBf_clsf(String bf_clsf){
        this.bf_clsf = bf_clsf;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "postmt_no")
    public String getPostmt_no(){
        return postmt_no;
    }

    @ElVoField(physicalName = "postmt_no")
    public void setPostmt_no(String postmt_no){
        this.postmt_no = postmt_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumApyRctFamInfoVo [");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("resid_no").append("=").append(resid_no).append(",");
        sb.append("age").append("=").append(age).append(",");
        sb.append("relat").append("=").append(relat).append(",");
        sb.append("relat_nm").append("=").append(relat_nm).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("ocpt_nm").append("=").append(ocpt_nm).append(",");
        sb.append("educ").append("=").append(educ).append(",");
        sb.append("educ_nm").append("=").append(educ_nm).append(",");
        sb.append("addr").append("=").append(addr).append(",");
        sb.append("detls_addr").append("=").append(detls_addr).append(",");
        sb.append("psinsr_yn").append("=").append(psinsr_yn).append(",");
        sb.append("cohbt_yn").append("=").append(cohbt_yn).append(",");
        sb.append("obst_yn").append("=").append(obst_yn).append(",");
        sb.append("human_dedct_yn").append("=").append(human_dedct_yn).append(",");
        sb.append("fam_payamt_yn").append("=").append(fam_payamt_yn).append(",");
        sb.append("except_yn").append("=").append(except_yn).append(",");
        sb.append("payamt_occr_ymd").append("=").append(payamt_occr_ymd).append(",");
        sb.append("payamt_cls_ymd").append("=").append(payamt_cls_ymd).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("del_flag").append("=").append(del_flag).append(",");
        sb.append("bf_clsf").append("=").append(bf_clsf).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("postmt_no").append("=").append(postmt_no);
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
