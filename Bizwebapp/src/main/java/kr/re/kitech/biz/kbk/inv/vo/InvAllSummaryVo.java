package kr.re.kitech.biz.kbk.inv.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "통계관리 Vo")
public class InvAllSummaryVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public InvAllSummaryVo(){
    }

    @ElDtoField(logicalName = "통계관리 Vo", physicalName = "invBookSummaryVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.kbk.inv.vo.InvSummaryVo> invBookSummaryVo;

    @ElDtoField(logicalName = "통계관리 Vo", physicalName = "invReportSummaryVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.kbk.inv.vo.InvSummaryVo> invReportSummaryVo;

    @ElDtoField(logicalName = "통계관리 Vo", physicalName = "invJournalSummaryVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.kbk.inv.vo.InvSummaryVo> invJournalSummaryVo;

    @ElVoField(physicalName = "invBookSummaryVo")
    public java.util.List<kr.re.kitech.biz.kbk.inv.vo.InvSummaryVo> getInvBookSummaryVo(){
        return invBookSummaryVo;
    }

    @ElVoField(physicalName = "invBookSummaryVo")
    public void setInvBookSummaryVo(java.util.List<kr.re.kitech.biz.kbk.inv.vo.InvSummaryVo> invBookSummaryVo){
        this.invBookSummaryVo = invBookSummaryVo;
    }

    @ElVoField(physicalName = "invReportSummaryVo")
    public java.util.List<kr.re.kitech.biz.kbk.inv.vo.InvSummaryVo> getInvReportSummaryVo(){
        return invReportSummaryVo;
    }

    @ElVoField(physicalName = "invReportSummaryVo")
    public void setInvReportSummaryVo(java.util.List<kr.re.kitech.biz.kbk.inv.vo.InvSummaryVo> invReportSummaryVo){
        this.invReportSummaryVo = invReportSummaryVo;
    }

    @ElVoField(physicalName = "invJournalSummaryVo")
    public java.util.List<kr.re.kitech.biz.kbk.inv.vo.InvSummaryVo> getInvJournalSummaryVo(){
        return invJournalSummaryVo;
    }

    @ElVoField(physicalName = "invJournalSummaryVo")
    public void setInvJournalSummaryVo(java.util.List<kr.re.kitech.biz.kbk.inv.vo.InvSummaryVo> invJournalSummaryVo){
        this.invJournalSummaryVo = invJournalSummaryVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvAllSummaryVo [");
        sb.append("invBookSummaryVo").append("=").append(invBookSummaryVo).append(",");
        sb.append("invReportSummaryVo").append("=").append(invReportSummaryVo).append(",");
        sb.append("invJournalSummaryVo").append("=").append(invJournalSummaryVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; invBookSummaryVo != null && i < invBookSummaryVo.size() ; i++ ) {
            kr.re.kitech.biz.kbk.inv.vo.InvSummaryVo vo = (kr.re.kitech.biz.kbk.inv.vo.InvSummaryVo)invBookSummaryVo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; invReportSummaryVo != null && i < invReportSummaryVo.size() ; i++ ) {
            kr.re.kitech.biz.kbk.inv.vo.InvSummaryVo vo = (kr.re.kitech.biz.kbk.inv.vo.InvSummaryVo)invReportSummaryVo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; invJournalSummaryVo != null && i < invJournalSummaryVo.size() ; i++ ) {
            kr.re.kitech.biz.kbk.inv.vo.InvSummaryVo vo = (kr.re.kitech.biz.kbk.inv.vo.InvSummaryVo)invJournalSummaryVo.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; invBookSummaryVo != null && i < invBookSummaryVo.size() ; i++ ) {
            kr.re.kitech.biz.kbk.inv.vo.InvSummaryVo vo = (kr.re.kitech.biz.kbk.inv.vo.InvSummaryVo)invBookSummaryVo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; invReportSummaryVo != null && i < invReportSummaryVo.size() ; i++ ) {
            kr.re.kitech.biz.kbk.inv.vo.InvSummaryVo vo = (kr.re.kitech.biz.kbk.inv.vo.InvSummaryVo)invReportSummaryVo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; invJournalSummaryVo != null && i < invJournalSummaryVo.size() ; i++ ) {
            kr.re.kitech.biz.kbk.inv.vo.InvSummaryVo vo = (kr.re.kitech.biz.kbk.inv.vo.InvSummaryVo)invJournalSummaryVo.get(i);
            vo._xStreamDec();	 
        }
    }


}
