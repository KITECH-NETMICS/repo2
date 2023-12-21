package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "콘도기본정보")
public class CgsCondoMasterVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CgsCondoMasterVo(){
    }

    @ElDtoField(logicalName = "콘도명", physicalName = "condo_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String condo_nm;

    @ElDtoField(logicalName = "지역명", physicalName = "region_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String region_nm;

    @ElDtoField(logicalName = "콘도번호", physicalName = "condo_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String condo_no;

    @ElDtoField(logicalName = "콘도홈페이지주소", physicalName = "condo_homepg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String condo_homepg;

    @ElDtoField(logicalName = "콘도설명", physicalName = "condo_desc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String condo_desc;

    @ElDtoField(logicalName = "사용여부", physicalName = "condo_use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String condo_use_yn;

    @ElDtoField(logicalName = "계약시작일자", physicalName = "contrct_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_start_ymd;

    @ElDtoField(logicalName = "계약종료일자", physicalName = "contrct_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_cls_ymd;

    @ElDtoField(logicalName = "저장구분", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElVoField(physicalName = "condo_nm")
    public String getCondo_nm(){
        return condo_nm;
    }

    @ElVoField(physicalName = "condo_nm")
    public void setCondo_nm(String condo_nm){
        this.condo_nm = condo_nm;
    }

    @ElVoField(physicalName = "region_nm")
    public String getRegion_nm(){
        return region_nm;
    }

    @ElVoField(physicalName = "region_nm")
    public void setRegion_nm(String region_nm){
        this.region_nm = region_nm;
    }

    @ElVoField(physicalName = "condo_no")
    public String getCondo_no(){
        return condo_no;
    }

    @ElVoField(physicalName = "condo_no")
    public void setCondo_no(String condo_no){
        this.condo_no = condo_no;
    }

    @ElVoField(physicalName = "condo_homepg")
    public String getCondo_homepg(){
        return condo_homepg;
    }

    @ElVoField(physicalName = "condo_homepg")
    public void setCondo_homepg(String condo_homepg){
        this.condo_homepg = condo_homepg;
    }

    @ElVoField(physicalName = "condo_desc")
    public String getCondo_desc(){
        return condo_desc;
    }

    @ElVoField(physicalName = "condo_desc")
    public void setCondo_desc(String condo_desc){
        this.condo_desc = condo_desc;
    }

    @ElVoField(physicalName = "condo_use_yn")
    public String getCondo_use_yn(){
        return condo_use_yn;
    }

    @ElVoField(physicalName = "condo_use_yn")
    public void setCondo_use_yn(String condo_use_yn){
        this.condo_use_yn = condo_use_yn;
    }

    @ElVoField(physicalName = "contrct_start_ymd")
    public String getContrct_start_ymd(){
        return contrct_start_ymd;
    }

    @ElVoField(physicalName = "contrct_start_ymd")
    public void setContrct_start_ymd(String contrct_start_ymd){
        this.contrct_start_ymd = contrct_start_ymd;
    }

    @ElVoField(physicalName = "contrct_cls_ymd")
    public String getContrct_cls_ymd(){
        return contrct_cls_ymd;
    }

    @ElVoField(physicalName = "contrct_cls_ymd")
    public void setContrct_cls_ymd(String contrct_cls_ymd){
        this.contrct_cls_ymd = contrct_cls_ymd;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CgsCondoMasterVo [");
        sb.append("condo_nm").append("=").append(condo_nm).append(",");
        sb.append("region_nm").append("=").append(region_nm).append(",");
        sb.append("condo_no").append("=").append(condo_no).append(",");
        sb.append("condo_homepg").append("=").append(condo_homepg).append(",");
        sb.append("condo_desc").append("=").append(condo_desc).append(",");
        sb.append("condo_use_yn").append("=").append(condo_use_yn).append(",");
        sb.append("contrct_start_ymd").append("=").append(contrct_start_ymd).append(",");
        sb.append("contrct_cls_ymd").append("=").append(contrct_cls_ymd).append(",");
        sb.append("cud_type").append("=").append(cud_type);
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
