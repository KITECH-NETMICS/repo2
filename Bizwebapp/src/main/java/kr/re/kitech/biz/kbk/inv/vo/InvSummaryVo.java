package kr.re.kitech.biz.kbk.inv.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "통계관리 Vo")
public class InvSummaryVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public InvSummaryVo(){
    }

    @ElDtoField(logicalName = "합계", physicalName = "centrnm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String centrnm;

    @ElDtoField(logicalName = "소장수", physicalName = "bookcnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bookcnt;

    @ElDtoField(logicalName = "대출수", physicalName = "loancnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loancnt;

    @ElVoField(physicalName = "centrnm")
    public String getCentrnm(){
        return centrnm;
    }

    @ElVoField(physicalName = "centrnm")
    public void setCentrnm(String centrnm){
        this.centrnm = centrnm;
    }

    @ElVoField(physicalName = "bookcnt")
    public String getBookcnt(){
        return bookcnt;
    }

    @ElVoField(physicalName = "bookcnt")
    public void setBookcnt(String bookcnt){
        this.bookcnt = bookcnt;
    }

    @ElVoField(physicalName = "loancnt")
    public String getLoancnt(){
        return loancnt;
    }

    @ElVoField(physicalName = "loancnt")
    public void setLoancnt(String loancnt){
        this.loancnt = loancnt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LibSummaryVo [");
        sb.append("centrnm").append("=").append(centrnm).append(",");
        sb.append("bookcnt").append("=").append(bookcnt).append(",");
        sb.append("loancnt").append("=").append(loancnt);
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
