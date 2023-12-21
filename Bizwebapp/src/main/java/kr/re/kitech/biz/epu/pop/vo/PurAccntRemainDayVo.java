package kr.re.kitech.biz.epu.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "구매 계정잔여일수 Vo")
public class PurAccntRemainDayVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PurAccntRemainDayVo(){
    }

    @ElDtoField(logicalName = "잔여일수", physicalName = "date_between", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int date_between;

    @ElDtoField(logicalName = "구매마감일조정여부", physicalName = "ctrl_gbn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctrl_gbn;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElVoField(physicalName = "date_between")
    public int getDate_between(){
        return date_between;
    }

    @ElVoField(physicalName = "date_between")
    public void setDate_between(int date_between){
        this.date_between = date_between;
    }

    @ElVoField(physicalName = "ctrl_gbn")
    public String getCtrl_gbn(){
        return ctrl_gbn;
    }

    @ElVoField(physicalName = "ctrl_gbn")
    public void setCtrl_gbn(String ctrl_gbn){
        this.ctrl_gbn = ctrl_gbn;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurAccntRemainDayVo [");
        sb.append("date_between").append("=").append(date_between).append(",");
        sb.append("ctrl_gbn").append("=").append(ctrl_gbn).append(",");
        sb.append("accnt_no").append("=").append(accnt_no);
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
