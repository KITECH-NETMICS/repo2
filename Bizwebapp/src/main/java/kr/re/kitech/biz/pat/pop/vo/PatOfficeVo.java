package kr.re.kitech.biz.pat.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "특허사무서 Vo")
public class PatOfficeVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatOfficeVo(){
    }

    @ElDtoField(logicalName = "특허사무소ID", physicalName = "patofic_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_cd;

    @ElDtoField(logicalName = "특허사무소명", physicalName = "patofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_nm;

    @ElDtoField(logicalName = "특허사무소 연락처", physicalName = "patofic_contac_loc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_contac_loc;

    @ElDtoField(logicalName = "주담당자 ID", physicalName = "charg_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_id;

    @ElDtoField(logicalName = "주담당자", physicalName = "charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_nm;

    @ElDtoField(logicalName = "연락처", physicalName = "contac_loc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contac_loc;

    @ElDtoField(logicalName = "전문분야", physicalName = "fultxt_fild", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fultxt_fild;

    @ElDtoField(logicalName = "협약일", physicalName = "mou_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_daytm;

    @ElDtoField(logicalName = "협약유무", physicalName = "mou_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_ex;

    @ElDtoField(logicalName = "조회구분", physicalName = "src_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String src_clsf;

    @ElDtoField(logicalName = "담당업무", physicalName = "chang_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chang_clsf;

    @ElDtoField(logicalName = "건수/비율/점수", physicalName = "score", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String score;

    @ElDtoField(logicalName = "시작일자", physicalName = "from_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String from_ymd;

    @ElDtoField(logicalName = "종료일자", physicalName = "to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String to_ymd;

    @ElDtoField(logicalName = "이메일", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

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

    @ElVoField(physicalName = "patofic_contac_loc")
    public String getPatofic_contac_loc(){
        return patofic_contac_loc;
    }

    @ElVoField(physicalName = "patofic_contac_loc")
    public void setPatofic_contac_loc(String patofic_contac_loc){
        this.patofic_contac_loc = patofic_contac_loc;
    }

    @ElVoField(physicalName = "charg_id")
    public String getCharg_id(){
        return charg_id;
    }

    @ElVoField(physicalName = "charg_id")
    public void setCharg_id(String charg_id){
        this.charg_id = charg_id;
    }

    @ElVoField(physicalName = "charg_nm")
    public String getCharg_nm(){
        return charg_nm;
    }

    @ElVoField(physicalName = "charg_nm")
    public void setCharg_nm(String charg_nm){
        this.charg_nm = charg_nm;
    }

    @ElVoField(physicalName = "contac_loc")
    public String getContac_loc(){
        return contac_loc;
    }

    @ElVoField(physicalName = "contac_loc")
    public void setContac_loc(String contac_loc){
        this.contac_loc = contac_loc;
    }

    @ElVoField(physicalName = "fultxt_fild")
    public String getFultxt_fild(){
        return fultxt_fild;
    }

    @ElVoField(physicalName = "fultxt_fild")
    public void setFultxt_fild(String fultxt_fild){
        this.fultxt_fild = fultxt_fild;
    }

    @ElVoField(physicalName = "mou_daytm")
    public String getMou_daytm(){
        return mou_daytm;
    }

    @ElVoField(physicalName = "mou_daytm")
    public void setMou_daytm(String mou_daytm){
        this.mou_daytm = mou_daytm;
    }

    @ElVoField(physicalName = "mou_ex")
    public String getMou_ex(){
        return mou_ex;
    }

    @ElVoField(physicalName = "mou_ex")
    public void setMou_ex(String mou_ex){
        this.mou_ex = mou_ex;
    }

    @ElVoField(physicalName = "src_clsf")
    public String getSrc_clsf(){
        return src_clsf;
    }

    @ElVoField(physicalName = "src_clsf")
    public void setSrc_clsf(String src_clsf){
        this.src_clsf = src_clsf;
    }

    @ElVoField(physicalName = "chang_clsf")
    public String getChang_clsf(){
        return chang_clsf;
    }

    @ElVoField(physicalName = "chang_clsf")
    public void setChang_clsf(String chang_clsf){
        this.chang_clsf = chang_clsf;
    }

    @ElVoField(physicalName = "score")
    public String getScore(){
        return score;
    }

    @ElVoField(physicalName = "score")
    public void setScore(String score){
        this.score = score;
    }

    @ElVoField(physicalName = "from_ymd")
    public String getFrom_ymd(){
        return from_ymd;
    }

    @ElVoField(physicalName = "from_ymd")
    public void setFrom_ymd(String from_ymd){
        this.from_ymd = from_ymd;
    }

    @ElVoField(physicalName = "to_ymd")
    public String getTo_ymd(){
        return to_ymd;
    }

    @ElVoField(physicalName = "to_ymd")
    public void setTo_ymd(String to_ymd){
        this.to_ymd = to_ymd;
    }

    @ElVoField(physicalName = "email")
    public String getEmail(){
        return email;
    }

    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatOfficeVo [");
        sb.append("patofic_cd").append("=").append(patofic_cd).append(",");
        sb.append("patofic_nm").append("=").append(patofic_nm).append(",");
        sb.append("patofic_contac_loc").append("=").append(patofic_contac_loc).append(",");
        sb.append("charg_id").append("=").append(charg_id).append(",");
        sb.append("charg_nm").append("=").append(charg_nm).append(",");
        sb.append("contac_loc").append("=").append(contac_loc).append(",");
        sb.append("fultxt_fild").append("=").append(fultxt_fild).append(",");
        sb.append("mou_daytm").append("=").append(mou_daytm).append(",");
        sb.append("mou_ex").append("=").append(mou_ex).append(",");
        sb.append("src_clsf").append("=").append(src_clsf).append(",");
        sb.append("chang_clsf").append("=").append(chang_clsf).append(",");
        sb.append("score").append("=").append(score).append(",");
        sb.append("from_ymd").append("=").append(from_ymd).append(",");
        sb.append("to_ymd").append("=").append(to_ymd).append(",");
        sb.append("email").append("=").append(email);
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
