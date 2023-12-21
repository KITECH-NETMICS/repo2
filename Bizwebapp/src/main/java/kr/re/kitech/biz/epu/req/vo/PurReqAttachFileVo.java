package kr.re.kitech.biz.epu.req.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "구매요구 첨부서류 Vo")
public class PurReqAttachFileVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PurReqAttachFileVo(){
    }

    @ElDtoField(logicalName = "첨부서류", physicalName = "cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_nm;

    @ElDtoField(logicalName = "최초 코드명", physicalName = "org_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String org_cd_nm;

    @ElDtoField(logicalName = "첨부서류코드", physicalName = "cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd;

    @ElDtoField(logicalName = "첨부서류 설명", physicalName = "cd_desc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_desc;

    @ElDtoField(logicalName = "서비스아이디", physicalName = "serviceId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String serviceId;

    @ElDtoField(logicalName = "특정물품구매사유서 결재번호", physicalName = "elecapp_docu_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String elecapp_docu_no;

    @ElDtoField(logicalName = "첨부여부", physicalName = "cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int cnt;

    @ElVoField(physicalName = "cd_nm")
    public String getCd_nm(){
        return cd_nm;
    }

    @ElVoField(physicalName = "cd_nm")
    public void setCd_nm(String cd_nm){
        this.cd_nm = cd_nm;
    }

    @ElVoField(physicalName = "org_cd_nm")
    public String getOrg_cd_nm(){
        return org_cd_nm;
    }

    @ElVoField(physicalName = "org_cd_nm")
    public void setOrg_cd_nm(String org_cd_nm){
        this.org_cd_nm = org_cd_nm;
    }

    @ElVoField(physicalName = "cd")
    public String getCd(){
        return cd;
    }

    @ElVoField(physicalName = "cd")
    public void setCd(String cd){
        this.cd = cd;
    }

    @ElVoField(physicalName = "cd_desc")
    public String getCd_desc(){
        return cd_desc;
    }

    @ElVoField(physicalName = "cd_desc")
    public void setCd_desc(String cd_desc){
        this.cd_desc = cd_desc;
    }

    @ElVoField(physicalName = "serviceId")
    public String getServiceId(){
        return serviceId;
    }

    @ElVoField(physicalName = "serviceId")
    public void setServiceId(String serviceId){
        this.serviceId = serviceId;
    }

    @ElVoField(physicalName = "elecapp_docu_no")
    public String getElecapp_docu_no(){
        return elecapp_docu_no;
    }

    @ElVoField(physicalName = "elecapp_docu_no")
    public void setElecapp_docu_no(String elecapp_docu_no){
        this.elecapp_docu_no = elecapp_docu_no;
    }

    @ElVoField(physicalName = "cnt")
    public int getCnt(){
        return cnt;
    }

    @ElVoField(physicalName = "cnt")
    public void setCnt(int cnt){
        this.cnt = cnt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurReqAttachFileVo [");
        sb.append("cd_nm").append("=").append(cd_nm).append(",");
        sb.append("org_cd_nm").append("=").append(org_cd_nm).append(",");
        sb.append("cd").append("=").append(cd).append(",");
        sb.append("cd_desc").append("=").append(cd_desc).append(",");
        sb.append("serviceId").append("=").append(serviceId).append(",");
        sb.append("elecapp_docu_no").append("=").append(elecapp_docu_no).append(",");
        sb.append("cnt").append("=").append(cnt);
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
