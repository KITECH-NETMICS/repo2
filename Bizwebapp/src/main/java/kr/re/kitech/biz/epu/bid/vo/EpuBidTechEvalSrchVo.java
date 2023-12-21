package kr.re.kitech.biz.epu.bid.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "기술평가요청 조회조건")
public class EpuBidTechEvalSrchVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public EpuBidTechEvalSrchVo(){
    }

    @ElDtoField(logicalName = "개찰시작일", physicalName = "open_ymd_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String open_ymd_st;

    @ElDtoField(logicalName = "개찰종료일", physicalName = "open_ymd_ed", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String open_ymd_ed;

    @ElDtoField(logicalName = "eval_clsf_cd", physicalName = "eval_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_clsf_cd;

    @ElDtoField(logicalName = "bid_title", physicalName = "bid_title", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_title;

    @ElDtoField(logicalName = "pur_req_no", physicalName = "pur_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_req_no;

    @ElDtoField(logicalName = "bid_ord_no", physicalName = "bid_ord_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_ord_no;

    @ElDtoField(logicalName = "bid_noti_no", physicalName = "bid_noti_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_noti_no;

    @ElDtoField(logicalName = "renoti_after_yn", physicalName = "renoti_after_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String renoti_after_yn;

    @ElDtoField(logicalName = "partcode", physicalName = "partcode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String partcode;

    @ElDtoField(logicalName = "dept_typ", physicalName = "dept_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_typ;

    @ElDtoField(logicalName = "ord_chg_no", physicalName = "ord_chg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ord_chg_no;

    @ElDtoField(logicalName = "tech_eval_doc_no", physicalName = "tech_eval_doc_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_eval_doc_no;

    @ElDtoField(logicalName = "tech_eval_assist_doc_no", physicalName = "tech_eval_assist_doc_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_eval_assist_doc_no;

    @ElDtoField(logicalName = "chg_no", physicalName = "chg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chg_no;

    @ElDtoField(logicalName = "role_type", physicalName = "role_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String role_type;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "defname", physicalName = "defname", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String defname;

    @ElDtoField(logicalName = "title", physicalName = "title", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String title;

    @ElDtoField(logicalName = "name", physicalName = "name", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String name;

    @ElVoField(physicalName = "open_ymd_st")
    public String getOpen_ymd_st(){
        return open_ymd_st;
    }

    @ElVoField(physicalName = "open_ymd_st")
    public void setOpen_ymd_st(String open_ymd_st){
        this.open_ymd_st = open_ymd_st;
    }

    @ElVoField(physicalName = "open_ymd_ed")
    public String getOpen_ymd_ed(){
        return open_ymd_ed;
    }

    @ElVoField(physicalName = "open_ymd_ed")
    public void setOpen_ymd_ed(String open_ymd_ed){
        this.open_ymd_ed = open_ymd_ed;
    }

    @ElVoField(physicalName = "eval_clsf_cd")
    public String getEval_clsf_cd(){
        return eval_clsf_cd;
    }

    @ElVoField(physicalName = "eval_clsf_cd")
    public void setEval_clsf_cd(String eval_clsf_cd){
        this.eval_clsf_cd = eval_clsf_cd;
    }

    @ElVoField(physicalName = "bid_title")
    public String getBid_title(){
        return bid_title;
    }

    @ElVoField(physicalName = "bid_title")
    public void setBid_title(String bid_title){
        this.bid_title = bid_title;
    }

    @ElVoField(physicalName = "pur_req_no")
    public String getPur_req_no(){
        return pur_req_no;
    }

    @ElVoField(physicalName = "pur_req_no")
    public void setPur_req_no(String pur_req_no){
        this.pur_req_no = pur_req_no;
    }

    @ElVoField(physicalName = "bid_ord_no")
    public String getBid_ord_no(){
        return bid_ord_no;
    }

    @ElVoField(physicalName = "bid_ord_no")
    public void setBid_ord_no(String bid_ord_no){
        this.bid_ord_no = bid_ord_no;
    }

    @ElVoField(physicalName = "bid_noti_no")
    public String getBid_noti_no(){
        return bid_noti_no;
    }

    @ElVoField(physicalName = "bid_noti_no")
    public void setBid_noti_no(String bid_noti_no){
        this.bid_noti_no = bid_noti_no;
    }

    @ElVoField(physicalName = "renoti_after_yn")
    public String getRenoti_after_yn(){
        return renoti_after_yn;
    }

    @ElVoField(physicalName = "renoti_after_yn")
    public void setRenoti_after_yn(String renoti_after_yn){
        this.renoti_after_yn = renoti_after_yn;
    }

    @ElVoField(physicalName = "partcode")
    public String getPartcode(){
        return partcode;
    }

    @ElVoField(physicalName = "partcode")
    public void setPartcode(String partcode){
        this.partcode = partcode;
    }

    @ElVoField(physicalName = "dept_typ")
    public String getDept_typ(){
        return dept_typ;
    }

    @ElVoField(physicalName = "dept_typ")
    public void setDept_typ(String dept_typ){
        this.dept_typ = dept_typ;
    }

    @ElVoField(physicalName = "ord_chg_no")
    public String getOrd_chg_no(){
        return ord_chg_no;
    }

    @ElVoField(physicalName = "ord_chg_no")
    public void setOrd_chg_no(String ord_chg_no){
        this.ord_chg_no = ord_chg_no;
    }

    @ElVoField(physicalName = "tech_eval_doc_no")
    public String getTech_eval_doc_no(){
        return tech_eval_doc_no;
    }

    @ElVoField(physicalName = "tech_eval_doc_no")
    public void setTech_eval_doc_no(String tech_eval_doc_no){
        this.tech_eval_doc_no = tech_eval_doc_no;
    }

    @ElVoField(physicalName = "tech_eval_assist_doc_no")
    public String getTech_eval_assist_doc_no(){
        return tech_eval_assist_doc_no;
    }

    @ElVoField(physicalName = "tech_eval_assist_doc_no")
    public void setTech_eval_assist_doc_no(String tech_eval_assist_doc_no){
        this.tech_eval_assist_doc_no = tech_eval_assist_doc_no;
    }

    @ElVoField(physicalName = "chg_no")
    public String getChg_no(){
        return chg_no;
    }

    @ElVoField(physicalName = "chg_no")
    public void setChg_no(String chg_no){
        this.chg_no = chg_no;
    }

    @ElVoField(physicalName = "role_type")
    public String getRole_type(){
        return role_type;
    }

    @ElVoField(physicalName = "role_type")
    public void setRole_type(String role_type){
        this.role_type = role_type;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "defname")
    public String getDefname(){
        return defname;
    }

    @ElVoField(physicalName = "defname")
    public void setDefname(String defname){
        this.defname = defname;
    }

    @ElVoField(physicalName = "title")
    public String getTitle(){
        return title;
    }

    @ElVoField(physicalName = "title")
    public void setTitle(String title){
        this.title = title;
    }

    @ElVoField(physicalName = "name")
    public String getName(){
        return name;
    }

    @ElVoField(physicalName = "name")
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EpuBidTechEvalSrchVo [");
        sb.append("open_ymd_st").append("=").append(open_ymd_st).append(",");
        sb.append("open_ymd_ed").append("=").append(open_ymd_ed).append(",");
        sb.append("eval_clsf_cd").append("=").append(eval_clsf_cd).append(",");
        sb.append("bid_title").append("=").append(bid_title).append(",");
        sb.append("pur_req_no").append("=").append(pur_req_no).append(",");
        sb.append("bid_ord_no").append("=").append(bid_ord_no).append(",");
        sb.append("bid_noti_no").append("=").append(bid_noti_no).append(",");
        sb.append("renoti_after_yn").append("=").append(renoti_after_yn).append(",");
        sb.append("partcode").append("=").append(partcode).append(",");
        sb.append("dept_typ").append("=").append(dept_typ).append(",");
        sb.append("ord_chg_no").append("=").append(ord_chg_no).append(",");
        sb.append("tech_eval_doc_no").append("=").append(tech_eval_doc_no).append(",");
        sb.append("tech_eval_assist_doc_no").append("=").append(tech_eval_assist_doc_no).append(",");
        sb.append("chg_no").append("=").append(chg_no).append(",");
        sb.append("role_type").append("=").append(role_type).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("defname").append("=").append(defname).append(",");
        sb.append("title").append("=").append(title).append(",");
        sb.append("name").append("=").append(name);
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
