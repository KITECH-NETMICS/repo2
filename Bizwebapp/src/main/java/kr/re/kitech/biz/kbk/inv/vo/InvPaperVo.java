package kr.re.kitech.biz.kbk.inv.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "발표논문 Vo")
public class InvPaperVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public InvPaperVo(){
    }

    @ElDtoField(logicalName = "등록번호", physicalName = "regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_no;

    @ElDtoField(logicalName = "등록일자", physicalName = "regst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_ymd;

    @ElDtoField(logicalName = "접수번호", physicalName = "rcpt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_no;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "연구책임자", physicalName = "resch_respn_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_respn_psn;

    @ElDtoField(logicalName = "논문명", physicalName = "paper_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String paper_nm;

    @ElDtoField(logicalName = "게재지명", physicalName = "publpapr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String publpapr_nm;

    @ElDtoField(logicalName = "등록일자from", physicalName = "regst_fr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_fr_ymd;

    @ElDtoField(logicalName = "등록일자to", physicalName = "regst_to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_to_ymd;

    @ElVoField(physicalName = "regst_no")
    public String getRegst_no(){
        return regst_no;
    }

    @ElVoField(physicalName = "regst_no")
    public void setRegst_no(String regst_no){
        this.regst_no = regst_no;
    }

    @ElVoField(physicalName = "regst_ymd")
    public String getRegst_ymd(){
        return regst_ymd;
    }

    @ElVoField(physicalName = "regst_ymd")
    public void setRegst_ymd(String regst_ymd){
        this.regst_ymd = regst_ymd;
    }

    @ElVoField(physicalName = "rcpt_no")
    public String getRcpt_no(){
        return rcpt_no;
    }

    @ElVoField(physicalName = "rcpt_no")
    public void setRcpt_no(String rcpt_no){
        this.rcpt_no = rcpt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "resch_respn_psn")
    public String getResch_respn_psn(){
        return resch_respn_psn;
    }

    @ElVoField(physicalName = "resch_respn_psn")
    public void setResch_respn_psn(String resch_respn_psn){
        this.resch_respn_psn = resch_respn_psn;
    }

    @ElVoField(physicalName = "paper_nm")
    public String getPaper_nm(){
        return paper_nm;
    }

    @ElVoField(physicalName = "paper_nm")
    public void setPaper_nm(String paper_nm){
        this.paper_nm = paper_nm;
    }

    @ElVoField(physicalName = "publpapr_nm")
    public String getPublpapr_nm(){
        return publpapr_nm;
    }

    @ElVoField(physicalName = "publpapr_nm")
    public void setPublpapr_nm(String publpapr_nm){
        this.publpapr_nm = publpapr_nm;
    }

    @ElVoField(physicalName = "regst_fr_ymd")
    public String getRegst_fr_ymd(){
        return regst_fr_ymd;
    }

    @ElVoField(physicalName = "regst_fr_ymd")
    public void setRegst_fr_ymd(String regst_fr_ymd){
        this.regst_fr_ymd = regst_fr_ymd;
    }

    @ElVoField(physicalName = "regst_to_ymd")
    public String getRegst_to_ymd(){
        return regst_to_ymd;
    }

    @ElVoField(physicalName = "regst_to_ymd")
    public void setRegst_to_ymd(String regst_to_ymd){
        this.regst_to_ymd = regst_to_ymd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvPaperVo [");
        sb.append("regst_no").append("=").append(regst_no).append(",");
        sb.append("regst_ymd").append("=").append(regst_ymd).append(",");
        sb.append("rcpt_no").append("=").append(rcpt_no).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("resch_respn_psn").append("=").append(resch_respn_psn).append(",");
        sb.append("paper_nm").append("=").append(paper_nm).append(",");
        sb.append("publpapr_nm").append("=").append(publpapr_nm).append(",");
        sb.append("regst_fr_ymd").append("=").append(regst_fr_ymd).append(",");
        sb.append("regst_to_ymd").append("=").append(regst_to_ymd);
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
