package kr.re.kitech.biz.ass.eqip.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "제우스장비 Vo")
public class NtisRegNoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public NtisRegNoVo(){
    }

    @ElDtoField(logicalName = "ZEUS등록번호", physicalName = "equip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_no;

    @ElDtoField(logicalName = "장비명(국문)", physicalName = "kor_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String kor_nm;

    @ElDtoField(logicalName = "장비명(영문)", physicalName = "eng_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eng_nm;

    @ElDtoField(logicalName = "보유기관", physicalName = "director_nms", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String director_nms;

    @ElDtoField(logicalName = "총괄책임자", physicalName = "organ_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String organ_nm;

    @ElDtoField(logicalName = "자산번호", physicalName = "aset_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_no;

    @ElDtoField(logicalName = "자산명", physicalName = "aset_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_nm;

    @ElDtoField(logicalName = "zeus 장비번호", physicalName = "ntis_reg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ntis_reg_no;

    @ElDtoField(logicalName = "연구책임자 성명", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "연구책임자 개인번호", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "재원구분", physicalName = "finnc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String finnc;

    @ElDtoField(logicalName = "취득금액", physicalName = "intro_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long intro_amt;

    @ElDtoField(logicalName = "취득일자", physicalName = "intro_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intro_ymd;

    @ElDtoField(logicalName = "설치주소", physicalName = "posi_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_addr;

    @ElDtoField(logicalName = "설치주소상세", physicalName = "posi_addr_detls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_addr_detls;

    @ElDtoField(logicalName = "실무책임자", physicalName = "user_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_nm;

    @ElDtoField(logicalName = "장비명(영문명)", physicalName = "aset_eng_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_eng_nm;

    @ElVoField(physicalName = "equip_no")
    public String getEquip_no(){
        return equip_no;
    }

    @ElVoField(physicalName = "equip_no")
    public void setEquip_no(String equip_no){
        this.equip_no = equip_no;
    }

    @ElVoField(physicalName = "kor_nm")
    public String getKor_nm(){
        return kor_nm;
    }

    @ElVoField(physicalName = "kor_nm")
    public void setKor_nm(String kor_nm){
        this.kor_nm = kor_nm;
    }

    @ElVoField(physicalName = "eng_nm")
    public String getEng_nm(){
        return eng_nm;
    }

    @ElVoField(physicalName = "eng_nm")
    public void setEng_nm(String eng_nm){
        this.eng_nm = eng_nm;
    }

    @ElVoField(physicalName = "director_nms")
    public String getDirector_nms(){
        return director_nms;
    }

    @ElVoField(physicalName = "director_nms")
    public void setDirector_nms(String director_nms){
        this.director_nms = director_nms;
    }

    @ElVoField(physicalName = "organ_nm")
    public String getOrgan_nm(){
        return organ_nm;
    }

    @ElVoField(physicalName = "organ_nm")
    public void setOrgan_nm(String organ_nm){
        this.organ_nm = organ_nm;
    }

    @ElVoField(physicalName = "aset_no")
    public String getAset_no(){
        return aset_no;
    }

    @ElVoField(physicalName = "aset_no")
    public void setAset_no(String aset_no){
        this.aset_no = aset_no;
    }

    @ElVoField(physicalName = "aset_nm")
    public String getAset_nm(){
        return aset_nm;
    }

    @ElVoField(physicalName = "aset_nm")
    public void setAset_nm(String aset_nm){
        this.aset_nm = aset_nm;
    }

    @ElVoField(physicalName = "ntis_reg_no")
    public String getNtis_reg_no(){
        return ntis_reg_no;
    }

    @ElVoField(physicalName = "ntis_reg_no")
    public void setNtis_reg_no(String ntis_reg_no){
        this.ntis_reg_no = ntis_reg_no;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "finnc")
    public String getFinnc(){
        return finnc;
    }

    @ElVoField(physicalName = "finnc")
    public void setFinnc(String finnc){
        this.finnc = finnc;
    }

    @ElVoField(physicalName = "intro_amt")
    public long getIntro_amt(){
        return intro_amt;
    }

    @ElVoField(physicalName = "intro_amt")
    public void setIntro_amt(long intro_amt){
        this.intro_amt = intro_amt;
    }

    @ElVoField(physicalName = "intro_ymd")
    public String getIntro_ymd(){
        return intro_ymd;
    }

    @ElVoField(physicalName = "intro_ymd")
    public void setIntro_ymd(String intro_ymd){
        this.intro_ymd = intro_ymd;
    }

    @ElVoField(physicalName = "posi_addr")
    public String getPosi_addr(){
        return posi_addr;
    }

    @ElVoField(physicalName = "posi_addr")
    public void setPosi_addr(String posi_addr){
        this.posi_addr = posi_addr;
    }

    @ElVoField(physicalName = "posi_addr_detls")
    public String getPosi_addr_detls(){
        return posi_addr_detls;
    }

    @ElVoField(physicalName = "posi_addr_detls")
    public void setPosi_addr_detls(String posi_addr_detls){
        this.posi_addr_detls = posi_addr_detls;
    }

    @ElVoField(physicalName = "user_nm")
    public String getUser_nm(){
        return user_nm;
    }

    @ElVoField(physicalName = "user_nm")
    public void setUser_nm(String user_nm){
        this.user_nm = user_nm;
    }

    @ElVoField(physicalName = "aset_eng_nm")
    public String getAset_eng_nm(){
        return aset_eng_nm;
    }

    @ElVoField(physicalName = "aset_eng_nm")
    public void setAset_eng_nm(String aset_eng_nm){
        this.aset_eng_nm = aset_eng_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NtisRegNoVo [");
        sb.append("equip_no").append("=").append(equip_no).append(",");
        sb.append("kor_nm").append("=").append(kor_nm).append(",");
        sb.append("eng_nm").append("=").append(eng_nm).append(",");
        sb.append("director_nms").append("=").append(director_nms).append(",");
        sb.append("organ_nm").append("=").append(organ_nm).append(",");
        sb.append("aset_no").append("=").append(aset_no).append(",");
        sb.append("aset_nm").append("=").append(aset_nm).append(",");
        sb.append("ntis_reg_no").append("=").append(ntis_reg_no).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("finnc").append("=").append(finnc).append(",");
        sb.append("intro_amt").append("=").append(intro_amt).append(",");
        sb.append("intro_ymd").append("=").append(intro_ymd).append(",");
        sb.append("posi_addr").append("=").append(posi_addr).append(",");
        sb.append("posi_addr_detls").append("=").append(posi_addr_detls).append(",");
        sb.append("user_nm").append("=").append(user_nm).append(",");
        sb.append("aset_eng_nm").append("=").append(aset_eng_nm);
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
