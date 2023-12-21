package kr.re.kitech.biz.fin.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "이전 집행내역조회 Vo")
public class BblenfrcOldVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public BblenfrcOldVo(){
    }

    @ElDtoField(logicalName = "예산통제자", physicalName = "ctrl_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctrl_psn;

    @ElDtoField(logicalName = "관리항목2", physicalName = "mngmt_item_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_2;

    @ElDtoField(logicalName = "편성단위", physicalName = "fomat_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fomat_unit;

    @ElDtoField(logicalName = "통제번호", physicalName = "ctrl_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctrl_no;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "회계코드", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;

    @ElDtoField(logicalName = "신청금액", physicalName = "req_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long req_amt;

    @ElVoField(physicalName = "ctrl_psn")
    public String getCtrl_psn(){
        return ctrl_psn;
    }

    @ElVoField(physicalName = "ctrl_psn")
    public void setCtrl_psn(String ctrl_psn){
        this.ctrl_psn = ctrl_psn;
    }

    @ElVoField(physicalName = "mngmt_item_2")
    public String getMngmt_item_2(){
        return mngmt_item_2;
    }

    @ElVoField(physicalName = "mngmt_item_2")
    public void setMngmt_item_2(String mngmt_item_2){
        this.mngmt_item_2 = mngmt_item_2;
    }

    @ElVoField(physicalName = "fomat_unit")
    public String getFomat_unit(){
        return fomat_unit;
    }

    @ElVoField(physicalName = "fomat_unit")
    public void setFomat_unit(String fomat_unit){
        this.fomat_unit = fomat_unit;
    }

    @ElVoField(physicalName = "ctrl_no")
    public String getCtrl_no(){
        return ctrl_no;
    }

    @ElVoField(physicalName = "ctrl_no")
    public void setCtrl_no(String ctrl_no){
        this.ctrl_no = ctrl_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "accnt_cd")
    public String getAccnt_cd(){
        return accnt_cd;
    }

    @ElVoField(physicalName = "accnt_cd")
    public void setAccnt_cd(String accnt_cd){
        this.accnt_cd = accnt_cd;
    }

    @ElVoField(physicalName = "req_amt")
    public long getReq_amt(){
        return req_amt;
    }

    @ElVoField(physicalName = "req_amt")
    public void setReq_amt(long req_amt){
        this.req_amt = req_amt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BblenfrcOldVo [");
        sb.append("ctrl_psn").append("=").append(ctrl_psn).append(",");
        sb.append("mngmt_item_2").append("=").append(mngmt_item_2).append(",");
        sb.append("fomat_unit").append("=").append(fomat_unit).append(",");
        sb.append("ctrl_no").append("=").append(ctrl_no).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
        sb.append("req_amt").append("=").append(req_amt);
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
