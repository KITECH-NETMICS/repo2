package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "레포트 정보 Vo")
public class OzrInFoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public OzrInFoVo(){
    }

    @ElDtoField(logicalName = "ozr 경로", physicalName = "ozrPath", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ozrPath;

    @ElDtoField(logicalName = "odi 명", physicalName = "odiNm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String odiNm;

    @ElDtoField(logicalName = "디스플레이명", physicalName = "displayName", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String displayName;

    @ElDtoField(logicalName = "레포트 아이템 코드", physicalName = "ozrCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ozrCode;

    @ElDtoField(logicalName = "양식코드", physicalName = "formAlias", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String formAlias;

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "레포트키", physicalName = "key_col", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String key_col;

    @ElDtoField(logicalName = "레포트출력 양식코드 Vo", physicalName = "formList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.com.vo.FormAliasVo> formList;

    @ElDtoField(logicalName = "구분", physicalName = "clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String clsf;

    @ElVoField(physicalName = "ozrPath")
    public String getOzrPath(){
        return ozrPath;
    }

    @ElVoField(physicalName = "ozrPath")
    public void setOzrPath(String ozrPath){
        this.ozrPath = ozrPath;
    }

    @ElVoField(physicalName = "odiNm")
    public String getOdiNm(){
        return odiNm;
    }

    @ElVoField(physicalName = "odiNm")
    public void setOdiNm(String odiNm){
        this.odiNm = odiNm;
    }

    @ElVoField(physicalName = "displayName")
    public String getDisplayName(){
        return displayName;
    }

    @ElVoField(physicalName = "displayName")
    public void setDisplayName(String displayName){
        this.displayName = displayName;
    }

    @ElVoField(physicalName = "ozrCode")
    public String getOzrCode(){
        return ozrCode;
    }

    @ElVoField(physicalName = "ozrCode")
    public void setOzrCode(String ozrCode){
        this.ozrCode = ozrCode;
    }

    @ElVoField(physicalName = "formAlias")
    public String getFormAlias(){
        return formAlias;
    }

    @ElVoField(physicalName = "formAlias")
    public void setFormAlias(String formAlias){
        this.formAlias = formAlias;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "key_col")
    public String getKey_col(){
        return key_col;
    }

    @ElVoField(physicalName = "key_col")
    public void setKey_col(String key_col){
        this.key_col = key_col;
    }

    @ElVoField(physicalName = "formList")
    public java.util.List<kr.re.kitech.biz.com.vo.FormAliasVo> getFormList(){
        return formList;
    }

    @ElVoField(physicalName = "formList")
    public void setFormList(java.util.List<kr.re.kitech.biz.com.vo.FormAliasVo> formList){
        this.formList = formList;
    }

    @ElVoField(physicalName = "clsf")
    public String getClsf(){
        return clsf;
    }

    @ElVoField(physicalName = "clsf")
    public void setClsf(String clsf){
        this.clsf = clsf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OzrInFoVo [");
        sb.append("ozrPath").append("=").append(ozrPath).append(",");
        sb.append("odiNm").append("=").append(odiNm).append(",");
        sb.append("displayName").append("=").append(displayName).append(",");
        sb.append("ozrCode").append("=").append(ozrCode).append(",");
        sb.append("formAlias").append("=").append(formAlias).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("key_col").append("=").append(key_col).append(",");
        sb.append("formList").append("=").append(formList).append(",");
        sb.append("clsf").append("=").append(clsf);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; formList != null && i < formList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.FormAliasVo vo = (kr.re.kitech.biz.com.vo.FormAliasVo)formList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; formList != null && i < formList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.FormAliasVo vo = (kr.re.kitech.biz.com.vo.FormAliasVo)formList.get(i);
            vo._xStreamDec();	 
        }
    }


}
