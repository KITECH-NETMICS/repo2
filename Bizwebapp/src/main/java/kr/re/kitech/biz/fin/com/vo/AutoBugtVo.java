package kr.re.kitech.biz.fin.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "예산자동통제여부 Vo")
public class AutoBugtVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AutoBugtVo(){
    }

    @ElDtoField(logicalName = "계정책임자", physicalName = "accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "자동통제여부", physicalName = "bugt_auto_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_auto_yn;

    @ElDtoField(logicalName = "예산통제자", physicalName = "bugt_ctrl_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_psn;

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "문서ID", physicalName = "docu_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String docu_id;

    @ElDtoField(logicalName = "계정번호 공통 Vo", physicalName = "accntList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.std.vo.ComResBgAcctmVo> accntList;

    @ElVoField(physicalName = "accnt_rspns")
    public String getAccnt_rspns(){
        return accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public void setAccnt_rspns(String accnt_rspns){
        this.accnt_rspns = accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "bugt_auto_yn")
    public String getBugt_auto_yn(){
        return bugt_auto_yn;
    }

    @ElVoField(physicalName = "bugt_auto_yn")
    public void setBugt_auto_yn(String bugt_auto_yn){
        this.bugt_auto_yn = bugt_auto_yn;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn")
    public String getBugt_ctrl_psn(){
        return bugt_ctrl_psn;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn")
    public void setBugt_ctrl_psn(String bugt_ctrl_psn){
        this.bugt_ctrl_psn = bugt_ctrl_psn;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "docu_id")
    public String getDocu_id(){
        return docu_id;
    }

    @ElVoField(physicalName = "docu_id")
    public void setDocu_id(String docu_id){
        this.docu_id = docu_id;
    }

    @ElVoField(physicalName = "accntList")
    public java.util.List<kr.re.kitech.biz.fin.std.vo.ComResBgAcctmVo> getAccntList(){
        return accntList;
    }

    @ElVoField(physicalName = "accntList")
    public void setAccntList(java.util.List<kr.re.kitech.biz.fin.std.vo.ComResBgAcctmVo> accntList){
        this.accntList = accntList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AutoBugtVo [");
        sb.append("accnt_rspns").append("=").append(accnt_rspns).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("bugt_auto_yn").append("=").append(bugt_auto_yn).append(",");
        sb.append("bugt_ctrl_psn").append("=").append(bugt_ctrl_psn).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("docu_id").append("=").append(docu_id).append(",");
        sb.append("accntList").append("=").append(accntList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; accntList != null && i < accntList.size() ; i++ ) {
            kr.re.kitech.biz.fin.std.vo.ComResBgAcctmVo vo = (kr.re.kitech.biz.fin.std.vo.ComResBgAcctmVo)accntList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; accntList != null && i < accntList.size() ; i++ ) {
            kr.re.kitech.biz.fin.std.vo.ComResBgAcctmVo vo = (kr.re.kitech.biz.fin.std.vo.ComResBgAcctmVo)accntList.get(i);
            vo._xStreamDec();	 
        }
    }


}
