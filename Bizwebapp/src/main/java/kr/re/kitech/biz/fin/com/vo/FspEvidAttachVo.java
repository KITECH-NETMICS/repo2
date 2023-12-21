package kr.re.kitech.biz.fin.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "전자증빙저장Vo")
public class FspEvidAttachVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspEvidAttachVo(){
    }

    @ElDtoField(logicalName = "증빙관리번호", physicalName = "evid_mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evid_mngmt_no;

    @ElDtoField(logicalName = "문서ID", physicalName = "doc_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String doc_id;

    @ElDtoField(logicalName = "증빙항목코드", physicalName = "evid_item_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evid_item_cd;

    @ElDtoField(logicalName = "증빙항목순번", physicalName = "item_seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "동일코드가 존재할때 구분별 순번부여")
    private int item_seq;

    @ElDtoField(logicalName = "증빙항목명", physicalName = "evid_item_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evid_item_nm;

    @ElDtoField(logicalName = "증빙항목순번", physicalName = "evid_mngmt_seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int evid_mngmt_seq;

    @ElDtoField(logicalName = "증빙타입", physicalName = "evid_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evid_type;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "결의순번", physicalName = "unslip_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int unslip_odr;

    @ElDtoField(logicalName = "필수여부", physicalName = "essen_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String essen_ex;

    @ElDtoField(logicalName = "유일여부", physicalName = "unique_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unique_yn;

    @ElDtoField(logicalName = "자동여부", physicalName = "auto_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String auto_yn;

    @ElDtoField(logicalName = "관리항목코드", physicalName = "mngmt_item_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_cd;

    @ElDtoField(logicalName = "서비스ID", physicalName = "service_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String service_id;

    @ElDtoField(logicalName = "키컬럼", physicalName = "key_col", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String key_col;

    @ElDtoField(logicalName = "키값", physicalName = "key_val", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String key_val;

    @ElVoField(physicalName = "evid_mngmt_no")
    public String getEvid_mngmt_no(){
        return evid_mngmt_no;
    }

    @ElVoField(physicalName = "evid_mngmt_no")
    public void setEvid_mngmt_no(String evid_mngmt_no){
        this.evid_mngmt_no = evid_mngmt_no;
    }

    @ElVoField(physicalName = "doc_id")
    public String getDoc_id(){
        return doc_id;
    }

    @ElVoField(physicalName = "doc_id")
    public void setDoc_id(String doc_id){
        this.doc_id = doc_id;
    }

    @ElVoField(physicalName = "evid_item_cd")
    public String getEvid_item_cd(){
        return evid_item_cd;
    }

    @ElVoField(physicalName = "evid_item_cd")
    public void setEvid_item_cd(String evid_item_cd){
        this.evid_item_cd = evid_item_cd;
    }

    @ElVoField(physicalName = "item_seq")
    public int getItem_seq(){
        return item_seq;
    }

    @ElVoField(physicalName = "item_seq")
    public void setItem_seq(int item_seq){
        this.item_seq = item_seq;
    }

    @ElVoField(physicalName = "evid_item_nm")
    public String getEvid_item_nm(){
        return evid_item_nm;
    }

    @ElVoField(physicalName = "evid_item_nm")
    public void setEvid_item_nm(String evid_item_nm){
        this.evid_item_nm = evid_item_nm;
    }

    @ElVoField(physicalName = "evid_mngmt_seq")
    public int getEvid_mngmt_seq(){
        return evid_mngmt_seq;
    }

    @ElVoField(physicalName = "evid_mngmt_seq")
    public void setEvid_mngmt_seq(int evid_mngmt_seq){
        this.evid_mngmt_seq = evid_mngmt_seq;
    }

    @ElVoField(physicalName = "evid_type")
    public String getEvid_type(){
        return evid_type;
    }

    @ElVoField(physicalName = "evid_type")
    public void setEvid_type(String evid_type){
        this.evid_type = evid_type;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
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

    @ElVoField(physicalName = "essen_ex")
    public String getEssen_ex(){
        return essen_ex;
    }

    @ElVoField(physicalName = "essen_ex")
    public void setEssen_ex(String essen_ex){
        this.essen_ex = essen_ex;
    }

    @ElVoField(physicalName = "unique_yn")
    public String getUnique_yn(){
        return unique_yn;
    }

    @ElVoField(physicalName = "unique_yn")
    public void setUnique_yn(String unique_yn){
        this.unique_yn = unique_yn;
    }

    @ElVoField(physicalName = "auto_yn")
    public String getAuto_yn(){
        return auto_yn;
    }

    @ElVoField(physicalName = "auto_yn")
    public void setAuto_yn(String auto_yn){
        this.auto_yn = auto_yn;
    }

    @ElVoField(physicalName = "mngmt_item_cd")
    public String getMngmt_item_cd(){
        return mngmt_item_cd;
    }

    @ElVoField(physicalName = "mngmt_item_cd")
    public void setMngmt_item_cd(String mngmt_item_cd){
        this.mngmt_item_cd = mngmt_item_cd;
    }

    @ElVoField(physicalName = "service_id")
    public String getService_id(){
        return service_id;
    }

    @ElVoField(physicalName = "service_id")
    public void setService_id(String service_id){
        this.service_id = service_id;
    }

    @ElVoField(physicalName = "key_col")
    public String getKey_col(){
        return key_col;
    }

    @ElVoField(physicalName = "key_col")
    public void setKey_col(String key_col){
        this.key_col = key_col;
    }

    @ElVoField(physicalName = "key_val")
    public String getKey_val(){
        return key_val;
    }

    @ElVoField(physicalName = "key_val")
    public void setKey_val(String key_val){
        this.key_val = key_val;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspEvidAttachVo [");
        sb.append("evid_mngmt_no").append("=").append(evid_mngmt_no).append(",");
        sb.append("doc_id").append("=").append(doc_id).append(",");
        sb.append("evid_item_cd").append("=").append(evid_item_cd).append(",");
        sb.append("item_seq").append("=").append(item_seq).append(",");
        sb.append("evid_item_nm").append("=").append(evid_item_nm).append(",");
        sb.append("evid_mngmt_seq").append("=").append(evid_mngmt_seq).append(",");
        sb.append("evid_type").append("=").append(evid_type).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("unslip_odr").append("=").append(unslip_odr).append(",");
        sb.append("essen_ex").append("=").append(essen_ex).append(",");
        sb.append("unique_yn").append("=").append(unique_yn).append(",");
        sb.append("auto_yn").append("=").append(auto_yn).append(",");
        sb.append("mngmt_item_cd").append("=").append(mngmt_item_cd).append(",");
        sb.append("service_id").append("=").append(service_id).append(",");
        sb.append("key_col").append("=").append(key_col).append(",");
        sb.append("key_val").append("=").append(key_val);
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
