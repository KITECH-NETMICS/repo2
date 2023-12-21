package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "FspPayAdvcAdjstComExp")
public class FspPayAdvcAdjstComVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspPayAdvcAdjstComVo(){
    }

    @ElDtoField(logicalName = "save_tag", physicalName = "save_tag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String save_tag;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "adjst_ymd", physicalName = "adjst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_ymd;

    @ElDtoField(logicalName = "req_no", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "adjst_req_no", physicalName = "adjst_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_req_no;

    @ElDtoField(logicalName = "adjst_req_odr", physicalName = "adjst_req_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_req_odr;

    @ElDtoField(logicalName = "accnt_no", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "accnt_cd", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;

    @ElDtoField(logicalName = "expns_cd", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd;

    @ElDtoField(logicalName = "regst_syspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "updt_syspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;

    @ElDtoField(logicalName = "adjst_psn", physicalName = "adjst_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_psn;

    @ElDtoField(logicalName = "adjst_dept", physicalName = "adjst_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_dept;

    @ElDtoField(logicalName = "recv_amt", physicalName = "recv_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String recv_amt;

    @ElDtoField(logicalName = "adjst_amt", physicalName = "adjst_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_amt;

    @ElDtoField(logicalName = "adjst_detls", physicalName = "adjst_detls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_detls;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "attach_file_no1", physicalName = "attach_file_no1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no1;

    @ElDtoField(logicalName = "attach_file_no2", physicalName = "attach_file_no2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no2;

    @ElDtoField(logicalName = "accnt_rspns", physicalName = "accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns;

    @ElVoField(physicalName = "save_tag")
    public String getSave_tag(){
        return save_tag;
    }

    @ElVoField(physicalName = "save_tag")
    public void setSave_tag(String save_tag){
        this.save_tag = save_tag;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "adjst_ymd")
    public String getAdjst_ymd(){
        return adjst_ymd;
    }

    @ElVoField(physicalName = "adjst_ymd")
    public void setAdjst_ymd(String adjst_ymd){
        this.adjst_ymd = adjst_ymd;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "adjst_req_no")
    public String getAdjst_req_no(){
        return adjst_req_no;
    }

    @ElVoField(physicalName = "adjst_req_no")
    public void setAdjst_req_no(String adjst_req_no){
        this.adjst_req_no = adjst_req_no;
    }

    @ElVoField(physicalName = "adjst_req_odr")
    public String getAdjst_req_odr(){
        return adjst_req_odr;
    }

    @ElVoField(physicalName = "adjst_req_odr")
    public void setAdjst_req_odr(String adjst_req_odr){
        this.adjst_req_odr = adjst_req_odr;
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

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public String getUpdt_syspayno(){
        return updt_syspayno;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public void setUpdt_syspayno(String updt_syspayno){
        this.updt_syspayno = updt_syspayno;
    }

    @ElVoField(physicalName = "adjst_psn")
    public String getAdjst_psn(){
        return adjst_psn;
    }

    @ElVoField(physicalName = "adjst_psn")
    public void setAdjst_psn(String adjst_psn){
        this.adjst_psn = adjst_psn;
    }

    @ElVoField(physicalName = "adjst_dept")
    public String getAdjst_dept(){
        return adjst_dept;
    }

    @ElVoField(physicalName = "adjst_dept")
    public void setAdjst_dept(String adjst_dept){
        this.adjst_dept = adjst_dept;
    }

    @ElVoField(physicalName = "recv_amt")
    public String getRecv_amt(){
        return recv_amt;
    }

    @ElVoField(physicalName = "recv_amt")
    public void setRecv_amt(String recv_amt){
        this.recv_amt = recv_amt;
    }

    @ElVoField(physicalName = "adjst_amt")
    public String getAdjst_amt(){
        return adjst_amt;
    }

    @ElVoField(physicalName = "adjst_amt")
    public void setAdjst_amt(String adjst_amt){
        this.adjst_amt = adjst_amt;
    }

    @ElVoField(physicalName = "adjst_detls")
    public String getAdjst_detls(){
        return adjst_detls;
    }

    @ElVoField(physicalName = "adjst_detls")
    public void setAdjst_detls(String adjst_detls){
        this.adjst_detls = adjst_detls;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "attach_file_no1")
    public String getAttach_file_no1(){
        return attach_file_no1;
    }

    @ElVoField(physicalName = "attach_file_no1")
    public void setAttach_file_no1(String attach_file_no1){
        this.attach_file_no1 = attach_file_no1;
    }

    @ElVoField(physicalName = "attach_file_no2")
    public String getAttach_file_no2(){
        return attach_file_no2;
    }

    @ElVoField(physicalName = "attach_file_no2")
    public void setAttach_file_no2(String attach_file_no2){
        this.attach_file_no2 = attach_file_no2;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public String getAccnt_rspns(){
        return accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public void setAccnt_rspns(String accnt_rspns){
        this.accnt_rspns = accnt_rspns;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspPayAdvcAdjstComVo [");
        sb.append("save_tag").append("=").append(save_tag).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("adjst_ymd").append("=").append(adjst_ymd).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("adjst_req_no").append("=").append(adjst_req_no).append(",");
        sb.append("adjst_req_odr").append("=").append(adjst_req_odr).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
        sb.append("expns_cd").append("=").append(expns_cd).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
        sb.append("adjst_psn").append("=").append(adjst_psn).append(",");
        sb.append("adjst_dept").append("=").append(adjst_dept).append(",");
        sb.append("recv_amt").append("=").append(recv_amt).append(",");
        sb.append("adjst_amt").append("=").append(adjst_amt).append(",");
        sb.append("adjst_detls").append("=").append(adjst_detls).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("attach_file_no1").append("=").append(attach_file_no1).append(",");
        sb.append("attach_file_no2").append("=").append(attach_file_no2).append(",");
        sb.append("accnt_rspns").append("=").append(accnt_rspns);
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
