package kr.re.kitech.biz.fin.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "전자증빙조회Vo")
public class FbaExpnsEvidVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FbaExpnsEvidVo(){
    }

    @ElDtoField(logicalName = "문서ID", physicalName = "doc_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String doc_id;

    @ElDtoField(logicalName = "증빙항목코드", physicalName = "evid_item_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evid_item_cd;

    @ElDtoField(logicalName = "비용코드", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd;

    @ElDtoField(logicalName = "구분", physicalName = "clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String clsf;

    @ElDtoField(logicalName = "일반여부", physicalName = "common_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String common_yn;

    @ElDtoField(logicalName = "자동여부", physicalName = "auto_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String auto_yn;

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "결의순번", physicalName = "unslip_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int unslip_odr;

    @ElDtoField(logicalName = "증빙관리번호", physicalName = "evid_mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evid_mngmt_no;

    @ElDtoField(logicalName = "크리스피드 전자증빙삭세신청번호", physicalName = "rqst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rqst_no;

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

    @ElVoField(physicalName = "expns_cd")
    public String getExpns_cd(){
        return expns_cd;
    }

    @ElVoField(physicalName = "expns_cd")
    public void setExpns_cd(String expns_cd){
        this.expns_cd = expns_cd;
    }

    @ElVoField(physicalName = "clsf")
    public String getClsf(){
        return clsf;
    }

    @ElVoField(physicalName = "clsf")
    public void setClsf(String clsf){
        this.clsf = clsf;
    }

    @ElVoField(physicalName = "common_yn")
    public String getCommon_yn(){
        return common_yn;
    }

    @ElVoField(physicalName = "common_yn")
    public void setCommon_yn(String common_yn){
        this.common_yn = common_yn;
    }

    @ElVoField(physicalName = "auto_yn")
    public String getAuto_yn(){
        return auto_yn;
    }

    @ElVoField(physicalName = "auto_yn")
    public void setAuto_yn(String auto_yn){
        this.auto_yn = auto_yn;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "unslip_odr")
    public int getUnslip_odr(){
        return unslip_odr;
    }

    @ElVoField(physicalName = "unslip_odr")
    public void setUnslip_odr(int unslip_odr){
        this.unslip_odr = unslip_odr;
    }

    @ElVoField(physicalName = "evid_mngmt_no")
    public String getEvid_mngmt_no(){
        return evid_mngmt_no;
    }

    @ElVoField(physicalName = "evid_mngmt_no")
    public void setEvid_mngmt_no(String evid_mngmt_no){
        this.evid_mngmt_no = evid_mngmt_no;
    }

    @ElVoField(physicalName = "rqst_no")
    public String getRqst_no(){
        return rqst_no;
    }

    @ElVoField(physicalName = "rqst_no")
    public void setRqst_no(String rqst_no){
        this.rqst_no = rqst_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FbaExpnsEvidVo [");
        sb.append("doc_id").append("=").append(doc_id).append(",");
        sb.append("evid_item_cd").append("=").append(evid_item_cd).append(",");
        sb.append("expns_cd").append("=").append(expns_cd).append(",");
        sb.append("clsf").append("=").append(clsf).append(",");
        sb.append("common_yn").append("=").append(common_yn).append(",");
        sb.append("auto_yn").append("=").append(auto_yn).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("unslip_odr").append("=").append(unslip_odr).append(",");
        sb.append("evid_mngmt_no").append("=").append(evid_mngmt_no).append(",");
        sb.append("rqst_no").append("=").append(rqst_no);
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
