package kr.re.kitech.biz.fin.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "삭제이력Vo")
public class XomxDelHistoryVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public XomxDelHistoryVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "내용", physicalName = "doc_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String doc_contnt;

    @ElDtoField(logicalName = "서비스아이디", physicalName = "srv_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String srv_id;

    @ElDtoField(logicalName = "삭제자", physicalName = "delete_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String delete_syspayno;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "doc_contnt")
    public String getDoc_contnt(){
        return doc_contnt;
    }

    @ElVoField(physicalName = "doc_contnt")
    public void setDoc_contnt(String doc_contnt){
        this.doc_contnt = doc_contnt;
    }

    @ElVoField(physicalName = "srv_id")
    public String getSrv_id(){
        return srv_id;
    }

    @ElVoField(physicalName = "srv_id")
    public void setSrv_id(String srv_id){
        this.srv_id = srv_id;
    }

    @ElVoField(physicalName = "delete_syspayno")
    public String getDelete_syspayno(){
        return delete_syspayno;
    }

    @ElVoField(physicalName = "delete_syspayno")
    public void setDelete_syspayno(String delete_syspayno){
        this.delete_syspayno = delete_syspayno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("XomxDelHistoryVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("doc_contnt").append("=").append(doc_contnt).append(",");
        sb.append("srv_id").append("=").append(srv_id).append(",");
        sb.append("delete_syspayno").append("=").append(delete_syspayno);
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
