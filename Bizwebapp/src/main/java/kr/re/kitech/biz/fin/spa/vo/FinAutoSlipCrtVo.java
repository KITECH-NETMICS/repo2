package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "자동결의생성 Vo")
public class FinAutoSlipCrtVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FinAutoSlipCrtVo(){
    }

    @ElDtoField(logicalName = "결의일자", physicalName = "slip_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_ymd;

    @ElDtoField(logicalName = "결의유형", physicalName = "slip_typ_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_typ_cd;

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "헤더적요", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "건수", physicalName = "cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int cnt;

    @ElDtoField(logicalName = "신청서공통Vo(ResEquipFeeReqVo에서 사용)", physicalName = "reqNoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.com.vo.ComReqVo> reqNoList;

    @ElVoField(physicalName = "slip_ymd")
    public String getSlip_ymd(){
        return slip_ymd;
    }

    @ElVoField(physicalName = "slip_ymd")
    public void setSlip_ymd(String slip_ymd){
        this.slip_ymd = slip_ymd;
    }

    @ElVoField(physicalName = "slip_typ_cd")
    public String getSlip_typ_cd(){
        return slip_typ_cd;
    }

    @ElVoField(physicalName = "slip_typ_cd")
    public void setSlip_typ_cd(String slip_typ_cd){
        this.slip_typ_cd = slip_typ_cd;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "cnt")
    public int getCnt(){
        return cnt;
    }

    @ElVoField(physicalName = "cnt")
    public void setCnt(int cnt){
        this.cnt = cnt;
    }

    @ElVoField(physicalName = "reqNoList")
    public java.util.List<kr.re.kitech.biz.fin.com.vo.ComReqVo> getReqNoList(){
        return reqNoList;
    }

    @ElVoField(physicalName = "reqNoList")
    public void setReqNoList(java.util.List<kr.re.kitech.biz.fin.com.vo.ComReqVo> reqNoList){
        this.reqNoList = reqNoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinAutoSlipCrtVo [");
        sb.append("slip_ymd").append("=").append(slip_ymd).append(",");
        sb.append("slip_typ_cd").append("=").append(slip_typ_cd).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("cnt").append("=").append(cnt).append(",");
        sb.append("reqNoList").append("=").append(reqNoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; reqNoList != null && i < reqNoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.ComReqVo vo = (kr.re.kitech.biz.fin.com.vo.ComReqVo)reqNoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; reqNoList != null && i < reqNoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.ComReqVo vo = (kr.re.kitech.biz.fin.com.vo.ComReqVo)reqNoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
