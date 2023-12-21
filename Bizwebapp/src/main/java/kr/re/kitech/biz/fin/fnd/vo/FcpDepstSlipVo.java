package kr.re.kitech.biz.fin.fnd.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "입금결의 Vo")
public class FcpDepstSlipVo extends kr.re.kitech.biz.fin.com.vo.FspSlipHVo {
    private static final long serialVersionUID = 1L;

    public FcpDepstSlipVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "신청구분", physicalName = "req_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "1 연구비 청구, 2입금, 3기술료청구, 4 기술료(주식,어음) ")
    private String req_clsf;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "req_clsf")
    public String getReq_clsf(){
        return req_clsf;
    }

    @ElVoField(physicalName = "req_clsf")
    public void setReq_clsf(String req_clsf){
        this.req_clsf = req_clsf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FcpDepstSlipVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_clsf").append("=").append(req_clsf);
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
