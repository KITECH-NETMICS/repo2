package kr.re.kitech.biz.apr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "예산통제 조회 Vo")
public class BugtCtrlSrcVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public BugtCtrlSrcVo(){
    }

    @ElDtoField(logicalName = "결재자", physicalName = "endpoints", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String endpoints;

    @ElDtoField(logicalName = "조회구분", physicalName = "req_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_clsf;

    @ElDtoField(logicalName = "조회조건", physicalName = "src_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String src_nm;

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "예산통제자", physicalName = "bugt_ctrl_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_psn;

    @ElVoField(physicalName = "endpoints")
    public String getEndpoints(){
        return endpoints;
    }

    @ElVoField(physicalName = "endpoints")
    public void setEndpoints(String endpoints){
        this.endpoints = endpoints;
    }

    @ElVoField(physicalName = "req_clsf")
    public String getReq_clsf(){
        return req_clsf;
    }

    @ElVoField(physicalName = "req_clsf")
    public void setReq_clsf(String req_clsf){
        this.req_clsf = req_clsf;
    }

    @ElVoField(physicalName = "src_nm")
    public String getSrc_nm(){
        return src_nm;
    }

    @ElVoField(physicalName = "src_nm")
    public void setSrc_nm(String src_nm){
        this.src_nm = src_nm;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn")
    public String getBugt_ctrl_psn(){
        return bugt_ctrl_psn;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn")
    public void setBugt_ctrl_psn(String bugt_ctrl_psn){
        this.bugt_ctrl_psn = bugt_ctrl_psn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BugtCtrlSrcVo [");
        sb.append("endpoints").append("=").append(endpoints).append(",");
        sb.append("req_clsf").append("=").append(req_clsf).append(",");
        sb.append("src_nm").append("=").append(src_nm).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("bugt_ctrl_psn").append("=").append(bugt_ctrl_psn);
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
