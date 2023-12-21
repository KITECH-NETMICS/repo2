package kr.re.kitech.biz.fin.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "집행내역 삭제 Vo")
public class DelBblEnfrcVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public DelBblEnfrcVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "신청순번", physicalName = "req_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_seq;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "부분전체구분", physicalName = "part_all_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String part_all_clsf;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "req_seq")
    public String getReq_seq(){
        return req_seq;
    }

    @ElVoField(physicalName = "req_seq")
    public void setReq_seq(String req_seq){
        this.req_seq = req_seq;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "part_all_clsf")
    public String getPart_all_clsf(){
        return part_all_clsf;
    }

    @ElVoField(physicalName = "part_all_clsf")
    public void setPart_all_clsf(String part_all_clsf){
        this.part_all_clsf = part_all_clsf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DelBblEnfrcVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_seq").append("=").append(req_seq).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("part_all_clsf").append("=").append(part_all_clsf);
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
