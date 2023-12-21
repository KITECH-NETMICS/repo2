package kr.re.kitech.biz.fin.mail.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "소액물품검수결의 메일발송 Vo")
public class SmlItmCheckMailVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SmlItmCheckMailVo(){
    }

    @ElDtoField(logicalName = "검수번호", physicalName = "check_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String check_no;

    @ElDtoField(logicalName = "금액", physicalName = "check_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long check_amt;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "계정번호_비용코드", physicalName = "accnt_expns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_expns;

    @ElDtoField(logicalName = "비용코드", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd;

    @ElDtoField(logicalName = "납품일자", physicalName = "delvr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String delvr_ymd;

    @ElDtoField(logicalName = "검수일자", physicalName = "check_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String check_ymd;

    @ElDtoField(logicalName = "검수자 이메일", physicalName = "check_psn_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String check_psn_email;

    @ElDtoField(logicalName = "입회검수자 이메일", physicalName = "entsch_check_psn_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entsch_check_psn_email;

    @ElDtoField(logicalName = "자산담당자 이메일", physicalName = "chgr_psn_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chgr_psn_email;

    @ElVoField(physicalName = "check_no")
    public String getCheck_no(){
        return check_no;
    }

    @ElVoField(physicalName = "check_no")
    public void setCheck_no(String check_no){
        this.check_no = check_no;
    }

    @ElVoField(physicalName = "check_amt")
    public long getCheck_amt(){
        return check_amt;
    }

    @ElVoField(physicalName = "check_amt")
    public void setCheck_amt(long check_amt){
        this.check_amt = check_amt;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "accnt_expns")
    public String getAccnt_expns(){
        return accnt_expns;
    }

    @ElVoField(physicalName = "accnt_expns")
    public void setAccnt_expns(String accnt_expns){
        this.accnt_expns = accnt_expns;
    }

    @ElVoField(physicalName = "expns_cd")
    public String getExpns_cd(){
        return expns_cd;
    }

    @ElVoField(physicalName = "expns_cd")
    public void setExpns_cd(String expns_cd){
        this.expns_cd = expns_cd;
    }

    @ElVoField(physicalName = "delvr_ymd")
    public String getDelvr_ymd(){
        return delvr_ymd;
    }

    @ElVoField(physicalName = "delvr_ymd")
    public void setDelvr_ymd(String delvr_ymd){
        this.delvr_ymd = delvr_ymd;
    }

    @ElVoField(physicalName = "check_ymd")
    public String getCheck_ymd(){
        return check_ymd;
    }

    @ElVoField(physicalName = "check_ymd")
    public void setCheck_ymd(String check_ymd){
        this.check_ymd = check_ymd;
    }

    @ElVoField(physicalName = "check_psn_email")
    public String getCheck_psn_email(){
        return check_psn_email;
    }

    @ElVoField(physicalName = "check_psn_email")
    public void setCheck_psn_email(String check_psn_email){
        this.check_psn_email = check_psn_email;
    }

    @ElVoField(physicalName = "entsch_check_psn_email")
    public String getEntsch_check_psn_email(){
        return entsch_check_psn_email;
    }

    @ElVoField(physicalName = "entsch_check_psn_email")
    public void setEntsch_check_psn_email(String entsch_check_psn_email){
        this.entsch_check_psn_email = entsch_check_psn_email;
    }

    @ElVoField(physicalName = "chgr_psn_email")
    public String getChgr_psn_email(){
        return chgr_psn_email;
    }

    @ElVoField(physicalName = "chgr_psn_email")
    public void setChgr_psn_email(String chgr_psn_email){
        this.chgr_psn_email = chgr_psn_email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SmlItmCheckMailVo [");
        sb.append("check_no").append("=").append(check_no).append(",");
        sb.append("check_amt").append("=").append(check_amt).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("accnt_expns").append("=").append(accnt_expns).append(",");
        sb.append("expns_cd").append("=").append(expns_cd).append(",");
        sb.append("delvr_ymd").append("=").append(delvr_ymd).append(",");
        sb.append("check_ymd").append("=").append(check_ymd).append(",");
        sb.append("check_psn_email").append("=").append(check_psn_email).append(",");
        sb.append("entsch_check_psn_email").append("=").append(entsch_check_psn_email).append(",");
        sb.append("chgr_psn_email").append("=").append(chgr_psn_email);
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
