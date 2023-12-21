package kr.re.kitech.biz.apr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "결재의견")
public class DocCommentsVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public DocCommentsVo(){
    }

    @ElDtoField(logicalName = "아이디", physicalName = "id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "seq_doc_comments", attr = "")
    private String id;

    @ElDtoField(logicalName = "인스턴스아이디", physicalName = "instance_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String instance_id;

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_no;

    @ElDtoField(logicalName = "내용", physicalName = "contents", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String contents;

    @ElDtoField(logicalName = "타입", physicalName = "opt_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String opt_type;

    @ElDtoField(logicalName = "UID", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String empno;

    @ElDtoField(logicalName = "성명", physicalName = "empname", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String empname;

    @ElDtoField(logicalName = "직무명", physicalName = "emptitle", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String emptitle;

    @ElDtoField(logicalName = "tracingtag", physicalName = "tracingtag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String tracingtag;

    @ElDtoField(logicalName = "등록일자", physicalName = "created_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String created_date;

    @ElDtoField(logicalName = "등록자", physicalName = "created_by", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String created_by;

    @ElDtoField(logicalName = "수정일자", physicalName = "updated_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String updated_date;

    @ElDtoField(logicalName = "수정자", physicalName = "updated_by", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String updated_by;

    @ElVoField(physicalName = "id")
    public String getId(){
        String ret = this.id;
        return ret;
    }

    @ElVoField(physicalName = "id")
    public void setId(String id){
        this.id = id;
    }

    @ElVoField(physicalName = "instance_id")
    public String getInstance_id(){
        String ret = this.instance_id;
        return ret;
    }

    @ElVoField(physicalName = "instance_id")
    public void setInstance_id(String instance_id){
        this.instance_id = instance_id;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        String ret = this.req_no;
        return ret;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "contents")
    public String getContents(){
        String ret = this.contents;
        return ret;
    }

    @ElVoField(physicalName = "contents")
    public void setContents(String contents){
        this.contents = contents;
    }

    @ElVoField(physicalName = "opt_type")
    public String getOpt_type(){
        String ret = this.opt_type;
        return ret;
    }

    @ElVoField(physicalName = "opt_type")
    public void setOpt_type(String opt_type){
        this.opt_type = opt_type;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        String ret = this.empno;
        return ret;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "empname")
    public String getEmpname(){
        String ret = this.empname;
        return ret;
    }

    @ElVoField(physicalName = "empname")
    public void setEmpname(String empname){
        this.empname = empname;
    }

    @ElVoField(physicalName = "emptitle")
    public String getEmptitle(){
        String ret = this.emptitle;
        return ret;
    }

    @ElVoField(physicalName = "emptitle")
    public void setEmptitle(String emptitle){
        this.emptitle = emptitle;
    }

    @ElVoField(physicalName = "tracingtag")
    public String getTracingtag(){
        String ret = this.tracingtag;
        return ret;
    }

    @ElVoField(physicalName = "tracingtag")
    public void setTracingtag(String tracingtag){
        this.tracingtag = tracingtag;
    }

    @ElVoField(physicalName = "created_date")
    public String getCreated_date(){
        String ret = this.created_date;
        return ret;
    }

    @ElVoField(physicalName = "created_date")
    public void setCreated_date(String created_date){
        this.created_date = created_date;
    }

    @ElVoField(physicalName = "created_by")
    public String getCreated_by(){
        String ret = this.created_by;
        return ret;
    }

    @ElVoField(physicalName = "created_by")
    public void setCreated_by(String created_by){
        this.created_by = created_by;
    }

    @ElVoField(physicalName = "updated_date")
    public String getUpdated_date(){
        String ret = this.updated_date;
        return ret;
    }

    @ElVoField(physicalName = "updated_date")
    public void setUpdated_date(String updated_date){
        this.updated_date = updated_date;
    }

    @ElVoField(physicalName = "updated_by")
    public String getUpdated_by(){
        String ret = this.updated_by;
        return ret;
    }

    @ElVoField(physicalName = "updated_by")
    public void setUpdated_by(String updated_by){
        this.updated_by = updated_by;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DocCommentsVo [");
        sb.append("id").append("=").append(id).append(",");
        sb.append("instance_id").append("=").append(instance_id).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("contents").append("=").append(contents).append(",");
        sb.append("opt_type").append("=").append(opt_type).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("empname").append("=").append(empname).append(",");
        sb.append("emptitle").append("=").append(emptitle).append(",");
        sb.append("tracingtag").append("=").append(tracingtag).append(",");
        sb.append("created_date").append("=").append(created_date).append(",");
        sb.append("created_by").append("=").append(created_by).append(",");
        sb.append("updated_date").append("=").append(updated_date).append(",");
        sb.append("updated_by").append("=").append(updated_by);
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
