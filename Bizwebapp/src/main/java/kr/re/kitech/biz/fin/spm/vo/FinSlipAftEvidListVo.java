package kr.re.kitech.biz.fin.spm.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "사후증빙 리스트 Vo")
public class FinSlipAftEvidListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FinSlipAftEvidListVo(){
    }

    @ElDtoField(logicalName = "결의유형", physicalName = "slip_typ_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_typ_nm;

    @ElDtoField(logicalName = "확정결의번호", physicalName = "slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_no;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "적요", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "결의금액", physicalName = "unslip_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_amt;

    @ElDtoField(logicalName = "확정자", physicalName = "decsn_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_psn;

    @ElDtoField(logicalName = "결의일자", physicalName = "accnt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_ymd;

    @ElDtoField(logicalName = "작성자", physicalName = "wrte_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_psn;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "요약", physicalName = "summary", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String summary;

    @ElDtoField(logicalName = "하위결의서적용여부", physicalName = "aply_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aply_yn;

    @ElVoField(physicalName = "slip_typ_nm")
    public String getSlip_typ_nm(){
        return slip_typ_nm;
    }

    @ElVoField(physicalName = "slip_typ_nm")
    public void setSlip_typ_nm(String slip_typ_nm){
        this.slip_typ_nm = slip_typ_nm;
    }

    @ElVoField(physicalName = "slip_no")
    public String getSlip_no(){
        return slip_no;
    }

    @ElVoField(physicalName = "slip_no")
    public void setSlip_no(String slip_no){
        this.slip_no = slip_no;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "unslip_amt")
    public String getUnslip_amt(){
        return unslip_amt;
    }

    @ElVoField(physicalName = "unslip_amt")
    public void setUnslip_amt(String unslip_amt){
        this.unslip_amt = unslip_amt;
    }

    @ElVoField(physicalName = "decsn_psn")
    public String getDecsn_psn(){
        return decsn_psn;
    }

    @ElVoField(physicalName = "decsn_psn")
    public void setDecsn_psn(String decsn_psn){
        this.decsn_psn = decsn_psn;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public String getAccnt_ymd(){
        return accnt_ymd;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public void setAccnt_ymd(String accnt_ymd){
        this.accnt_ymd = accnt_ymd;
    }

    @ElVoField(physicalName = "wrte_psn")
    public String getWrte_psn(){
        return wrte_psn;
    }

    @ElVoField(physicalName = "wrte_psn")
    public void setWrte_psn(String wrte_psn){
        this.wrte_psn = wrte_psn;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "summary")
    public String getSummary(){
        return summary;
    }

    @ElVoField(physicalName = "summary")
    public void setSummary(String summary){
        this.summary = summary;
    }

    @ElVoField(physicalName = "aply_yn")
    public String getAply_yn(){
        return aply_yn;
    }

    @ElVoField(physicalName = "aply_yn")
    public void setAply_yn(String aply_yn){
        this.aply_yn = aply_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinSlipAftEvidListVo [");
        sb.append("slip_typ_nm").append("=").append(slip_typ_nm).append(",");
        sb.append("slip_no").append("=").append(slip_no).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("unslip_amt").append("=").append(unslip_amt).append(",");
        sb.append("decsn_psn").append("=").append(decsn_psn).append(",");
        sb.append("accnt_ymd").append("=").append(accnt_ymd).append(",");
        sb.append("wrte_psn").append("=").append(wrte_psn).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("summary").append("=").append(summary).append(",");
        sb.append("aply_yn").append("=").append(aply_yn);
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
