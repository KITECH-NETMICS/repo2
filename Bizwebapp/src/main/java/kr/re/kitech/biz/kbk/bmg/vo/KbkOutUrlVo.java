package kr.re.kitech.biz.kbk.bmg.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "전자정보VO")
public class KbkOutUrlVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public KbkOutUrlVo(){
    }

    @ElDtoField(logicalName = "등록번호", physicalName = "regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_no;

    @ElDtoField(logicalName = "구분코드", physicalName = "clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String clsf_cd;

    @ElDtoField(logicalName = "구분명", physicalName = "clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String clsf_nm;

    @ElDtoField(logicalName = "구분코드VO", physicalName = "clsfVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.kbk.bmg.vo.KbkClsfVo> clsfVo;

    @ElDtoField(logicalName = "제목", physicalName = "subj", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String subj;

    @ElDtoField(logicalName = "URL", physicalName = "url", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String url;

    @ElDtoField(logicalName = "URL적요", physicalName = "url_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String url_rmk;

    @ElDtoField(logicalName = "ID", physicalName = "id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String id;

    @ElDtoField(logicalName = "PW", physicalName = "pw", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pw;

    @ElDtoField(logicalName = "첨부파일경로(이미지)", physicalName = "attach_file_path_img", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_path_img;

    @ElDtoField(logicalName = "첨부파일(이미지)", physicalName = "attach_file_img", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_img;

    @ElDtoField(logicalName = "첨부파일번호(목차)", physicalName = "attach_file_no_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_contnt;

    @ElDtoField(logicalName = "첨부파일번호(사용자메뉴얼)", physicalName = "attach_file_no_use", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_use;

    @ElDtoField(logicalName = "등록자시스템개인번호", physicalName = "regst_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_psn_syspayno;

    @ElDtoField(logicalName = "등록일시", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "수정자시스템개인번호", physicalName = "updt_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_psn_syspayno;

    @ElDtoField(logicalName = "수정일시", physicalName = "updt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_daytm;

    @ElDtoField(logicalName = "시스템번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElVoField(physicalName = "regst_no")
    public String getRegst_no(){
        return regst_no;
    }

    @ElVoField(physicalName = "regst_no")
    public void setRegst_no(String regst_no){
        this.regst_no = regst_no;
    }

    @ElVoField(physicalName = "clsf_cd")
    public String getClsf_cd(){
        return clsf_cd;
    }

    @ElVoField(physicalName = "clsf_cd")
    public void setClsf_cd(String clsf_cd){
        this.clsf_cd = clsf_cd;
    }

    @ElVoField(physicalName = "clsf_nm")
    public String getClsf_nm(){
        return clsf_nm;
    }

    @ElVoField(physicalName = "clsf_nm")
    public void setClsf_nm(String clsf_nm){
        this.clsf_nm = clsf_nm;
    }

    @ElVoField(physicalName = "clsfVo")
    public java.util.List<kr.re.kitech.biz.kbk.bmg.vo.KbkClsfVo> getClsfVo(){
        return clsfVo;
    }

    @ElVoField(physicalName = "clsfVo")
    public void setClsfVo(java.util.List<kr.re.kitech.biz.kbk.bmg.vo.KbkClsfVo> clsfVo){
        this.clsfVo = clsfVo;
    }

    @ElVoField(physicalName = "subj")
    public String getSubj(){
        return subj;
    }

    @ElVoField(physicalName = "subj")
    public void setSubj(String subj){
        this.subj = subj;
    }

    @ElVoField(physicalName = "url")
    public String getUrl(){
        return url;
    }

    @ElVoField(physicalName = "url")
    public void setUrl(String url){
        this.url = url;
    }

    @ElVoField(physicalName = "url_rmk")
    public String getUrl_rmk(){
        return url_rmk;
    }

    @ElVoField(physicalName = "url_rmk")
    public void setUrl_rmk(String url_rmk){
        this.url_rmk = url_rmk;
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

    @ElVoField(physicalName = "regst_psn_syspayno")
    public String getRegst_psn_syspayno(){
        return regst_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public void setRegst_psn_syspayno(String regst_psn_syspayno){
        this.regst_psn_syspayno = regst_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        return regst_daytm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public String getUpdt_psn_syspayno(){
        return updt_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public void setUpdt_psn_syspayno(String updt_psn_syspayno){
        this.updt_psn_syspayno = updt_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_daytm")
    public String getUpdt_daytm(){
        return updt_daytm;
    }

    @ElVoField(physicalName = "updt_daytm")
    public void setUpdt_daytm(String updt_daytm){
        this.updt_daytm = updt_daytm;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KbkOutUrlVo [");
        sb.append("regst_no").append("=").append(regst_no).append(",");
        sb.append("clsf_cd").append("=").append(clsf_cd).append(",");
        sb.append("clsf_nm").append("=").append(clsf_nm).append(",");
        sb.append("clsfVo").append("=").append(clsfVo).append(",");
        sb.append("subj").append("=").append(subj).append(",");
        sb.append("url").append("=").append(url).append(",");
        sb.append("url_rmk").append("=").append(url_rmk).append(",");
        sb.append("id").append("=").append(id).append(",");
        sb.append("pw").append("=").append(pw).append(",");
        sb.append("attach_file_path_img").append("=").append(attach_file_path_img).append(",");
        sb.append("attach_file_img").append("=").append(attach_file_img).append(",");
        sb.append("attach_file_no_contnt").append("=").append(attach_file_no_contnt).append(",");
        sb.append("attach_file_no_use").append("=").append(attach_file_no_use).append(",");
        sb.append("regst_psn_syspayno").append("=").append(regst_psn_syspayno).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("updt_psn_syspayno").append("=").append(updt_psn_syspayno).append(",");
        sb.append("updt_daytm").append("=").append(updt_daytm).append(",");
        sb.append("syspayno").append("=").append(syspayno);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; clsfVo != null && i < clsfVo.size() ; i++ ) {
            kr.re.kitech.biz.kbk.bmg.vo.KbkClsfVo vo = (kr.re.kitech.biz.kbk.bmg.vo.KbkClsfVo)clsfVo.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; clsfVo != null && i < clsfVo.size() ; i++ ) {
            kr.re.kitech.biz.kbk.bmg.vo.KbkClsfVo vo = (kr.re.kitech.biz.kbk.bmg.vo.KbkClsfVo)clsfVo.get(i);
            vo._xStreamDec();	 
        }
    }


}
