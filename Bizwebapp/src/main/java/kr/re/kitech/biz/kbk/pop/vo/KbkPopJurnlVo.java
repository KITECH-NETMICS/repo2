package kr.re.kitech.biz.kbk.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "저널권호 팝업 Vo")
public class KbkPopJurnlVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public KbkPopJurnlVo(){
    }

    @ElDtoField(logicalName = "regst_no", physicalName = "regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_no;

    @ElDtoField(logicalName = "centr_cd", physicalName = "centr_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String centr_cd;

    @ElDtoField(logicalName = "jurnl_subj", physicalName = "jurnl_subj", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String jurnl_subj;

    @ElDtoField(logicalName = "issn", physicalName = "issn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issn;

    @ElDtoField(logicalName = "publ_vend", physicalName = "publ_vend", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String publ_vend;

    @ElDtoField(logicalName = "jurnl_clsf_cd", physicalName = "jurnl_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String jurnl_clsf_cd;

    @ElDtoField(logicalName = "cont_yn", physicalName = "cont_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cont_yn;

    @ElDtoField(logicalName = "jurnl_no", physicalName = "jurnl_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String jurnl_no;

    @ElDtoField(logicalName = "jurnl_clsf_nm", physicalName = "jurnl_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String jurnl_clsf_nm;

    @ElVoField(physicalName = "regst_no")
    public String getRegst_no(){
        return regst_no;
    }

    @ElVoField(physicalName = "regst_no")
    public void setRegst_no(String regst_no){
        this.regst_no = regst_no;
    }

    @ElVoField(physicalName = "centr_cd")
    public String getCentr_cd(){
        return centr_cd;
    }

    @ElVoField(physicalName = "centr_cd")
    public void setCentr_cd(String centr_cd){
        this.centr_cd = centr_cd;
    }

    @ElVoField(physicalName = "jurnl_subj")
    public String getJurnl_subj(){
        return jurnl_subj;
    }

    @ElVoField(physicalName = "jurnl_subj")
    public void setJurnl_subj(String jurnl_subj){
        this.jurnl_subj = jurnl_subj;
    }

    @ElVoField(physicalName = "issn")
    public String getIssn(){
        return issn;
    }

    @ElVoField(physicalName = "issn")
    public void setIssn(String issn){
        this.issn = issn;
    }

    @ElVoField(physicalName = "publ_vend")
    public String getPubl_vend(){
        return publ_vend;
    }

    @ElVoField(physicalName = "publ_vend")
    public void setPubl_vend(String publ_vend){
        this.publ_vend = publ_vend;
    }

    @ElVoField(physicalName = "jurnl_clsf_cd")
    public String getJurnl_clsf_cd(){
        return jurnl_clsf_cd;
    }

    @ElVoField(physicalName = "jurnl_clsf_cd")
    public void setJurnl_clsf_cd(String jurnl_clsf_cd){
        this.jurnl_clsf_cd = jurnl_clsf_cd;
    }

    @ElVoField(physicalName = "cont_yn")
    public String getCont_yn(){
        return cont_yn;
    }

    @ElVoField(physicalName = "cont_yn")
    public void setCont_yn(String cont_yn){
        this.cont_yn = cont_yn;
    }

    @ElVoField(physicalName = "jurnl_no")
    public String getJurnl_no(){
        return jurnl_no;
    }

    @ElVoField(physicalName = "jurnl_no")
    public void setJurnl_no(String jurnl_no){
        this.jurnl_no = jurnl_no;
    }

    @ElVoField(physicalName = "jurnl_clsf_nm")
    public String getJurnl_clsf_nm(){
        return jurnl_clsf_nm;
    }

    @ElVoField(physicalName = "jurnl_clsf_nm")
    public void setJurnl_clsf_nm(String jurnl_clsf_nm){
        this.jurnl_clsf_nm = jurnl_clsf_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KbkPopJurnlVo [");
        sb.append("regst_no").append("=").append(regst_no).append(",");
        sb.append("centr_cd").append("=").append(centr_cd).append(",");
        sb.append("jurnl_subj").append("=").append(jurnl_subj).append(",");
        sb.append("issn").append("=").append(issn).append(",");
        sb.append("publ_vend").append("=").append(publ_vend).append(",");
        sb.append("jurnl_clsf_cd").append("=").append(jurnl_clsf_cd).append(",");
        sb.append("cont_yn").append("=").append(cont_yn).append(",");
        sb.append("jurnl_no").append("=").append(jurnl_no).append(",");
        sb.append("jurnl_clsf_nm").append("=").append(jurnl_clsf_nm);
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
