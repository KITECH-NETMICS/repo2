package kr.re.kitech.biz.pat.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "관리번호 생성 VO")
public class PatCrtMngmtNoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatCrtMngmtNoVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "지재권구분", physicalName = "pat_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_clsf;

    @ElDtoField(logicalName = "국내외구분", physicalName = "dom_oversea_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dom_oversea_clsf;

    @ElDtoField(logicalName = "출원희망국가코드", physicalName = "smitapp_hope_natn_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_hope_natn_cd;

    @ElDtoField(logicalName = "출원희망국가명", physicalName = "smitapp_hope_natn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_hope_natn_nm;

    @ElDtoField(logicalName = "건수", physicalName = "cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int cnt;

    @ElDtoField(logicalName = "특허사무소", physicalName = "patofic_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_cd;

    @ElDtoField(logicalName = "특허사무소명", physicalName = "patofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_nm;

    @ElDtoField(logicalName = "특허사무소담당자ID", physicalName = "patofic_charg_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_charg_id;

    @ElDtoField(logicalName = "특허사무소담당자명", physicalName = "patofic_charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_charg_nm;

    @ElDtoField(logicalName = "특허사무소담당자연락처", physicalName = "patofic_contac_loc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_contac_loc;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "pat_clsf")
    public String getPat_clsf(){
        return pat_clsf;
    }

    @ElVoField(physicalName = "pat_clsf")
    public void setPat_clsf(String pat_clsf){
        this.pat_clsf = pat_clsf;
    }

    @ElVoField(physicalName = "dom_oversea_clsf")
    public String getDom_oversea_clsf(){
        return dom_oversea_clsf;
    }

    @ElVoField(physicalName = "dom_oversea_clsf")
    public void setDom_oversea_clsf(String dom_oversea_clsf){
        this.dom_oversea_clsf = dom_oversea_clsf;
    }

    @ElVoField(physicalName = "smitapp_hope_natn_cd")
    public String getSmitapp_hope_natn_cd(){
        return smitapp_hope_natn_cd;
    }

    @ElVoField(physicalName = "smitapp_hope_natn_cd")
    public void setSmitapp_hope_natn_cd(String smitapp_hope_natn_cd){
        this.smitapp_hope_natn_cd = smitapp_hope_natn_cd;
    }

    @ElVoField(physicalName = "smitapp_hope_natn_nm")
    public String getSmitapp_hope_natn_nm(){
        return smitapp_hope_natn_nm;
    }

    @ElVoField(physicalName = "smitapp_hope_natn_nm")
    public void setSmitapp_hope_natn_nm(String smitapp_hope_natn_nm){
        this.smitapp_hope_natn_nm = smitapp_hope_natn_nm;
    }

    @ElVoField(physicalName = "cnt")
    public int getCnt(){
        return cnt;
    }

    @ElVoField(physicalName = "cnt")
    public void setCnt(int cnt){
        this.cnt = cnt;
    }

    @ElVoField(physicalName = "patofic_cd")
    public String getPatofic_cd(){
        return patofic_cd;
    }

    @ElVoField(physicalName = "patofic_cd")
    public void setPatofic_cd(String patofic_cd){
        this.patofic_cd = patofic_cd;
    }

    @ElVoField(physicalName = "patofic_nm")
    public String getPatofic_nm(){
        return patofic_nm;
    }

    @ElVoField(physicalName = "patofic_nm")
    public void setPatofic_nm(String patofic_nm){
        this.patofic_nm = patofic_nm;
    }

    @ElVoField(physicalName = "patofic_charg_id")
    public String getPatofic_charg_id(){
        return patofic_charg_id;
    }

    @ElVoField(physicalName = "patofic_charg_id")
    public void setPatofic_charg_id(String patofic_charg_id){
        this.patofic_charg_id = patofic_charg_id;
    }

    @ElVoField(physicalName = "patofic_charg_nm")
    public String getPatofic_charg_nm(){
        return patofic_charg_nm;
    }

    @ElVoField(physicalName = "patofic_charg_nm")
    public void setPatofic_charg_nm(String patofic_charg_nm){
        this.patofic_charg_nm = patofic_charg_nm;
    }

    @ElVoField(physicalName = "patofic_contac_loc")
    public String getPatofic_contac_loc(){
        return patofic_contac_loc;
    }

    @ElVoField(physicalName = "patofic_contac_loc")
    public void setPatofic_contac_loc(String patofic_contac_loc){
        this.patofic_contac_loc = patofic_contac_loc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatCrtMngmtNoVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("pat_clsf").append("=").append(pat_clsf).append(",");
        sb.append("dom_oversea_clsf").append("=").append(dom_oversea_clsf).append(",");
        sb.append("smitapp_hope_natn_cd").append("=").append(smitapp_hope_natn_cd).append(",");
        sb.append("smitapp_hope_natn_nm").append("=").append(smitapp_hope_natn_nm).append(",");
        sb.append("cnt").append("=").append(cnt).append(",");
        sb.append("patofic_cd").append("=").append(patofic_cd).append(",");
        sb.append("patofic_nm").append("=").append(patofic_nm).append(",");
        sb.append("patofic_charg_id").append("=").append(patofic_charg_id).append(",");
        sb.append("patofic_charg_nm").append("=").append(patofic_charg_nm).append(",");
        sb.append("patofic_contac_loc").append("=").append(patofic_contac_loc);
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
