package kr.re.kitech.biz.kbk.etc.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "전자정보관리VO")
public class EtcOutUrlVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public EtcOutUrlVo(){
    }

    @ElDtoField(logicalName = "SCI구분", physicalName = "clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String clsf;

    @ElDtoField(logicalName = "subj", physicalName = "subj", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String subj;

    @ElDtoField(logicalName = "설명", physicalName = "url_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String url_rmk;

    @ElDtoField(logicalName = "url", physicalName = "url", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String url;

    @ElDtoField(logicalName = "등록번호", physicalName = "regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_no;

    @ElDtoField(logicalName = "id", physicalName = "id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String id;

    @ElDtoField(logicalName = "pw", physicalName = "pw", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pw;

    @ElDtoField(logicalName = "attach_file_path_img", physicalName = "attach_file_path_img", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_path_img;

    @ElDtoField(logicalName = "attach_file_img", physicalName = "attach_file_img", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_img;

    @ElDtoField(logicalName = "attach_file_no_contnt", physicalName = "attach_file_no_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_contnt;

    @ElDtoField(logicalName = "attach_file_no_use", physicalName = "attach_file_no_use", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_use;

    @ElDtoField(logicalName = "SCI구분코드", physicalName = "clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String clsf_cd;

    @ElDtoField(logicalName = "clsf1", physicalName = "clsf1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String clsf1;

    @ElDtoField(logicalName = "clsf2", physicalName = "clsf2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String clsf2;

    @ElDtoField(logicalName = "clsf3", physicalName = "clsf3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String clsf3;

    @ElDtoField(logicalName = "clsf4", physicalName = "clsf4", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String clsf4;

    @ElDtoField(logicalName = "clsf5", physicalName = "clsf5", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String clsf5;

    @ElDtoField(logicalName = "clsf6", physicalName = "clsf6", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String clsf6;

    @ElVoField(physicalName = "clsf")
    public String getClsf(){
        return clsf;
    }

    @ElVoField(physicalName = "clsf")
    public void setClsf(String clsf){
        this.clsf = clsf;
    }

    @ElVoField(physicalName = "subj")
    public String getSubj(){
        return subj;
    }

    @ElVoField(physicalName = "subj")
    public void setSubj(String subj){
        this.subj = subj;
    }

    @ElVoField(physicalName = "url_rmk")
    public String getUrl_rmk(){
        return url_rmk;
    }

    @ElVoField(physicalName = "url_rmk")
    public void setUrl_rmk(String url_rmk){
        this.url_rmk = url_rmk;
    }

    @ElVoField(physicalName = "url")
    public String getUrl(){
        return url;
    }

    @ElVoField(physicalName = "url")
    public void setUrl(String url){
        this.url = url;
    }

    @ElVoField(physicalName = "regst_no")
    public String getRegst_no(){
        return regst_no;
    }

    @ElVoField(physicalName = "regst_no")
    public void setRegst_no(String regst_no){
        this.regst_no = regst_no;
    }

    @ElVoField(physicalName = "id")
    public String getId(){
        return id;
    }

    @ElVoField(physicalName = "id")
    public void setId(String id){
        this.id = id;
    }

    @ElVoField(physicalName = "pw")
    public String getPw(){
        return pw;
    }

    @ElVoField(physicalName = "pw")
    public void setPw(String pw){
        this.pw = pw;
    }

    @ElVoField(physicalName = "attach_file_path_img")
    public String getAttach_file_path_img(){
        return attach_file_path_img;
    }

    @ElVoField(physicalName = "attach_file_path_img")
    public void setAttach_file_path_img(String attach_file_path_img){
        this.attach_file_path_img = attach_file_path_img;
    }

    @ElVoField(physicalName = "attach_file_img")
    public String getAttach_file_img(){
        return attach_file_img;
    }

    @ElVoField(physicalName = "attach_file_img")
    public void setAttach_file_img(String attach_file_img){
        this.attach_file_img = attach_file_img;
    }

    @ElVoField(physicalName = "attach_file_no_contnt")
    public String getAttach_file_no_contnt(){
        return attach_file_no_contnt;
    }

    @ElVoField(physicalName = "attach_file_no_contnt")
    public void setAttach_file_no_contnt(String attach_file_no_contnt){
        this.attach_file_no_contnt = attach_file_no_contnt;
    }

    @ElVoField(physicalName = "attach_file_no_use")
    public String getAttach_file_no_use(){
        return attach_file_no_use;
    }

    @ElVoField(physicalName = "attach_file_no_use")
    public void setAttach_file_no_use(String attach_file_no_use){
        this.attach_file_no_use = attach_file_no_use;
    }

    @ElVoField(physicalName = "clsf_cd")
    public String getClsf_cd(){
        return clsf_cd;
    }

    @ElVoField(physicalName = "clsf_cd")
    public void setClsf_cd(String clsf_cd){
        this.clsf_cd = clsf_cd;
    }

    @ElVoField(physicalName = "clsf1")
    public String getClsf1(){
        return clsf1;
    }

    @ElVoField(physicalName = "clsf1")
    public void setClsf1(String clsf1){
        this.clsf1 = clsf1;
    }

    @ElVoField(physicalName = "clsf2")
    public String getClsf2(){
        return clsf2;
    }

    @ElVoField(physicalName = "clsf2")
    public void setClsf2(String clsf2){
        this.clsf2 = clsf2;
    }

    @ElVoField(physicalName = "clsf3")
    public String getClsf3(){
        return clsf3;
    }

    @ElVoField(physicalName = "clsf3")
    public void setClsf3(String clsf3){
        this.clsf3 = clsf3;
    }

    @ElVoField(physicalName = "clsf4")
    public String getClsf4(){
        return clsf4;
    }

    @ElVoField(physicalName = "clsf4")
    public void setClsf4(String clsf4){
        this.clsf4 = clsf4;
    }

    @ElVoField(physicalName = "clsf5")
    public String getClsf5(){
        return clsf5;
    }

    @ElVoField(physicalName = "clsf5")
    public void setClsf5(String clsf5){
        this.clsf5 = clsf5;
    }

    @ElVoField(physicalName = "clsf6")
    public String getClsf6(){
        return clsf6;
    }

    @ElVoField(physicalName = "clsf6")
    public void setClsf6(String clsf6){
        this.clsf6 = clsf6;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EtcOutUrlVo [");
        sb.append("clsf").append("=").append(clsf).append(",");
        sb.append("subj").append("=").append(subj).append(",");
        sb.append("url_rmk").append("=").append(url_rmk).append(",");
        sb.append("url").append("=").append(url).append(",");
        sb.append("regst_no").append("=").append(regst_no).append(",");
        sb.append("id").append("=").append(id).append(",");
        sb.append("pw").append("=").append(pw).append(",");
        sb.append("attach_file_path_img").append("=").append(attach_file_path_img).append(",");
        sb.append("attach_file_img").append("=").append(attach_file_img).append(",");
        sb.append("attach_file_no_contnt").append("=").append(attach_file_no_contnt).append(",");
        sb.append("attach_file_no_use").append("=").append(attach_file_no_use).append(",");
        sb.append("clsf_cd").append("=").append(clsf_cd).append(",");
        sb.append("clsf1").append("=").append(clsf1).append(",");
        sb.append("clsf2").append("=").append(clsf2).append(",");
        sb.append("clsf3").append("=").append(clsf3).append(",");
        sb.append("clsf4").append("=").append(clsf4).append(",");
        sb.append("clsf5").append("=").append(clsf5).append(",");
        sb.append("clsf6").append("=").append(clsf6);
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
