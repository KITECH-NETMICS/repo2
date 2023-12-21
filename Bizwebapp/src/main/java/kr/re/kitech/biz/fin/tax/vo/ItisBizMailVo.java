package kr.re.kitech.biz.fin.tax.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "매출계산서 재발행 Vo")
public class ItisBizMailVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ItisBizMailVo(){
    }

    @ElDtoField(logicalName = "계산서번호", physicalName = "issu_seqno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_seqno;

    @ElDtoField(logicalName = "메일순번", physicalName = "mail_seqno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mail_seqno;

    @ElDtoField(logicalName = "전자계산서발행일련번호", physicalName = "issu_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_id;

    @ElDtoField(logicalName = "공급자 사업자번호", physicalName = "corp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String corp_no;

    @ElDtoField(logicalName = "메일 sender", physicalName = "snd_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String snd_addr;

    @ElDtoField(logicalName = "메일받는자 주소", physicalName = "res_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_addr;

    @ElDtoField(logicalName = "공급받는자 담당자 이메일1", physicalName = "buyr_chrg_email1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_email1;

    @ElDtoField(logicalName = "공급받는자 담당자 이메일2", physicalName = "buyr_chrg_email2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_email2;

    @ElDtoField(logicalName = "응답코드", physicalName = "err_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String err_cd;

    @ElDtoField(logicalName = "응답 상태코드", physicalName = "stat_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String stat_code;

    @ElVoField(physicalName = "issu_seqno")
    public String getIssu_seqno(){
        return issu_seqno;
    }

    @ElVoField(physicalName = "issu_seqno")
    public void setIssu_seqno(String issu_seqno){
        this.issu_seqno = issu_seqno;
    }

    @ElVoField(physicalName = "mail_seqno")
    public String getMail_seqno(){
        return mail_seqno;
    }

    @ElVoField(physicalName = "mail_seqno")
    public void setMail_seqno(String mail_seqno){
        this.mail_seqno = mail_seqno;
    }

    @ElVoField(physicalName = "issu_id")
    public String getIssu_id(){
        return issu_id;
    }

    @ElVoField(physicalName = "issu_id")
    public void setIssu_id(String issu_id){
        this.issu_id = issu_id;
    }

    @ElVoField(physicalName = "corp_no")
    public String getCorp_no(){
        return corp_no;
    }

    @ElVoField(physicalName = "corp_no")
    public void setCorp_no(String corp_no){
        this.corp_no = corp_no;
    }

    @ElVoField(physicalName = "snd_addr")
    public String getSnd_addr(){
        return snd_addr;
    }

    @ElVoField(physicalName = "snd_addr")
    public void setSnd_addr(String snd_addr){
        this.snd_addr = snd_addr;
    }

    @ElVoField(physicalName = "res_addr")
    public String getRes_addr(){
        return res_addr;
    }

    @ElVoField(physicalName = "res_addr")
    public void setRes_addr(String res_addr){
        this.res_addr = res_addr;
    }

    @ElVoField(physicalName = "buyr_chrg_email1")
    public String getBuyr_chrg_email1(){
        return buyr_chrg_email1;
    }

    @ElVoField(physicalName = "buyr_chrg_email1")
    public void setBuyr_chrg_email1(String buyr_chrg_email1){
        this.buyr_chrg_email1 = buyr_chrg_email1;
    }

    @ElVoField(physicalName = "buyr_chrg_email2")
    public String getBuyr_chrg_email2(){
        return buyr_chrg_email2;
    }

    @ElVoField(physicalName = "buyr_chrg_email2")
    public void setBuyr_chrg_email2(String buyr_chrg_email2){
        this.buyr_chrg_email2 = buyr_chrg_email2;
    }

    @ElVoField(physicalName = "err_cd")
    public String getErr_cd(){
        return err_cd;
    }

    @ElVoField(physicalName = "err_cd")
    public void setErr_cd(String err_cd){
        this.err_cd = err_cd;
    }

    @ElVoField(physicalName = "stat_code")
    public String getStat_code(){
        return stat_code;
    }

    @ElVoField(physicalName = "stat_code")
    public void setStat_code(String stat_code){
        this.stat_code = stat_code;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ItisBizMailVo [");
        sb.append("issu_seqno").append("=").append(issu_seqno).append(",");
        sb.append("mail_seqno").append("=").append(mail_seqno).append(",");
        sb.append("issu_id").append("=").append(issu_id).append(",");
        sb.append("corp_no").append("=").append(corp_no).append(",");
        sb.append("snd_addr").append("=").append(snd_addr).append(",");
        sb.append("res_addr").append("=").append(res_addr).append(",");
        sb.append("buyr_chrg_email1").append("=").append(buyr_chrg_email1).append(",");
        sb.append("buyr_chrg_email2").append("=").append(buyr_chrg_email2).append(",");
        sb.append("err_cd").append("=").append(err_cd).append(",");
        sb.append("stat_code").append("=").append(stat_code);
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
