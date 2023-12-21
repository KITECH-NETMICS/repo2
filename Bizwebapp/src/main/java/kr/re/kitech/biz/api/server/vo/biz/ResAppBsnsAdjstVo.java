package kr.re.kitech.biz.api.server.vo.biz;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "결재완료 후 사업조정회의 Vo")
public class ResAppBsnsAdjstVo extends kr.re.kitech.biz.res.rte.vo.ResSmlRvewDVo {
    private static final long serialVersionUID = 1L;

    public ResAppBsnsAdjstVo(){
    }

    @ElDtoField(logicalName = "참여유형", physicalName = "prj_knd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_knd;

    @ElDtoField(logicalName = "RFP번호", physicalName = "rfp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rfp_no;

    @ElDtoField(logicalName = "공고번호", physicalName = "bsns_noti_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_noti_no;

    @ElDtoField(logicalName = "관계부처", physicalName = "bsns_cd_ofic", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_ofic;

    @ElDtoField(logicalName = "세부사업명", physicalName = "bsns_nm_detls_bsns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_nm_detls_bsns;

    @ElDtoField(logicalName = "사업명", physicalName = "bsns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_nm;

    @ElDtoField(logicalName = "삭제여부", physicalName = "delete_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String delete_yn;

    @ElVoField(physicalName = "prj_knd")
    public String getPrj_knd(){
        return prj_knd;
    }

    @ElVoField(physicalName = "prj_knd")
    public void setPrj_knd(String prj_knd){
        this.prj_knd = prj_knd;
    }

    @ElVoField(physicalName = "rfp_no")
    public String getRfp_no(){
        return rfp_no;
    }

    @ElVoField(physicalName = "rfp_no")
    public void setRfp_no(String rfp_no){
        this.rfp_no = rfp_no;
    }

    @ElVoField(physicalName = "bsns_noti_no")
    public String getBsns_noti_no(){
        return bsns_noti_no;
    }

    @ElVoField(physicalName = "bsns_noti_no")
    public void setBsns_noti_no(String bsns_noti_no){
        this.bsns_noti_no = bsns_noti_no;
    }

    @ElVoField(physicalName = "bsns_cd_ofic")
    public String getBsns_cd_ofic(){
        return bsns_cd_ofic;
    }

    @ElVoField(physicalName = "bsns_cd_ofic")
    public void setBsns_cd_ofic(String bsns_cd_ofic){
        this.bsns_cd_ofic = bsns_cd_ofic;
    }

    @ElVoField(physicalName = "bsns_nm_detls_bsns")
    public String getBsns_nm_detls_bsns(){
        return bsns_nm_detls_bsns;
    }

    @ElVoField(physicalName = "bsns_nm_detls_bsns")
    public void setBsns_nm_detls_bsns(String bsns_nm_detls_bsns){
        this.bsns_nm_detls_bsns = bsns_nm_detls_bsns;
    }

    @ElVoField(physicalName = "bsns_nm")
    public String getBsns_nm(){
        return bsns_nm;
    }

    @ElVoField(physicalName = "bsns_nm")
    public void setBsns_nm(String bsns_nm){
        this.bsns_nm = bsns_nm;
    }

    @ElVoField(physicalName = "delete_yn")
    public String getDelete_yn(){
        return delete_yn;
    }

    @ElVoField(physicalName = "delete_yn")
    public void setDelete_yn(String delete_yn){
        this.delete_yn = delete_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResAppBsnsAdjstVo [");
        sb.append("prj_knd").append("=").append(prj_knd).append(",");
        sb.append("rfp_no").append("=").append(rfp_no).append(",");
        sb.append("bsns_noti_no").append("=").append(bsns_noti_no).append(",");
        sb.append("bsns_cd_ofic").append("=").append(bsns_cd_ofic).append(",");
        sb.append("bsns_nm_detls_bsns").append("=").append(bsns_nm_detls_bsns).append(",");
        sb.append("bsns_nm").append("=").append(bsns_nm).append(",");
        sb.append("delete_yn").append("=").append(delete_yn);
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
