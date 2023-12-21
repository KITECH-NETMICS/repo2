package kr.re.kitech.biz.xom.core.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "유저 환경설정 VO")
public class ApprvConfigVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ApprvConfigVo(){
    }

    @ElDtoField(logicalName = "시스템 개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "자동전결사용여부", physicalName = "auto_rule_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String auto_rule_yn;

    @ElDtoField(logicalName = "대결사용여부", physicalName = "dlgt_use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dlgt_use_yn;

    @ElDtoField(logicalName = "기본정렬", physicalName = "sort_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sort_odr;

    @ElDtoField(logicalName = "목록개수", physicalName = "row_per_page", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int row_per_page;

    @ElDtoField(logicalName = "결재요청 수신여부", physicalName = "appr_recv_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appr_recv_yn;

    @ElDtoField(logicalName = "모바일 수신여부", physicalName = "sms_recv_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sms_recv_yn;

    @ElDtoField(logicalName = "대결설정 알림 수신여부", physicalName = "dlgt_alrm_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dlgt_alrm_yn;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "auto_rule_yn")
    public String getAuto_rule_yn(){
        return auto_rule_yn;
    }

    @ElVoField(physicalName = "auto_rule_yn")
    public void setAuto_rule_yn(String auto_rule_yn){
        this.auto_rule_yn = auto_rule_yn;
    }

    @ElVoField(physicalName = "dlgt_use_yn")
    public String getDlgt_use_yn(){
        return dlgt_use_yn;
    }

    @ElVoField(physicalName = "dlgt_use_yn")
    public void setDlgt_use_yn(String dlgt_use_yn){
        this.dlgt_use_yn = dlgt_use_yn;
    }

    @ElVoField(physicalName = "sort_odr")
    public String getSort_odr(){
        return sort_odr;
    }

    @ElVoField(physicalName = "sort_odr")
    public void setSort_odr(String sort_odr){
        this.sort_odr = sort_odr;
    }

    @ElVoField(physicalName = "row_per_page")
    public int getRow_per_page(){
        return row_per_page;
    }

    @ElVoField(physicalName = "row_per_page")
    public void setRow_per_page(int row_per_page){
        this.row_per_page = row_per_page;
    }

    @ElVoField(physicalName = "appr_recv_yn")
    public String getAppr_recv_yn(){
        return appr_recv_yn;
    }

    @ElVoField(physicalName = "appr_recv_yn")
    public void setAppr_recv_yn(String appr_recv_yn){
        this.appr_recv_yn = appr_recv_yn;
    }

    @ElVoField(physicalName = "sms_recv_yn")
    public String getSms_recv_yn(){
        return sms_recv_yn;
    }

    @ElVoField(physicalName = "sms_recv_yn")
    public void setSms_recv_yn(String sms_recv_yn){
        this.sms_recv_yn = sms_recv_yn;
    }

    @ElVoField(physicalName = "dlgt_alrm_yn")
    public String getDlgt_alrm_yn(){
        return dlgt_alrm_yn;
    }

    @ElVoField(physicalName = "dlgt_alrm_yn")
    public void setDlgt_alrm_yn(String dlgt_alrm_yn){
        this.dlgt_alrm_yn = dlgt_alrm_yn;
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
        sb.append("ApprvConfigVo [");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("auto_rule_yn").append("=").append(auto_rule_yn).append(",");
        sb.append("dlgt_use_yn").append("=").append(dlgt_use_yn).append(",");
        sb.append("sort_odr").append("=").append(sort_odr).append(",");
        sb.append("row_per_page").append("=").append(row_per_page).append(",");
        sb.append("appr_recv_yn").append("=").append(appr_recv_yn).append(",");
        sb.append("sms_recv_yn").append("=").append(sms_recv_yn).append(",");
        sb.append("dlgt_alrm_yn").append("=").append(dlgt_alrm_yn).append(",");
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
