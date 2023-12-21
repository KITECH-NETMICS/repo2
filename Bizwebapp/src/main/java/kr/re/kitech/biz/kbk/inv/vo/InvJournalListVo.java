package kr.re.kitech.biz.kbk.inv.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "저널관리ListVo")
public class InvJournalListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public InvJournalListVo(){
    }

    @ElDtoField(logicalName = "저널관리Vo", physicalName = "invJournalVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.kbk.inv.vo.InvJournalVo> invJournalVoList;

    @ElVoField(physicalName = "invJournalVoList")
    public java.util.List<kr.re.kitech.biz.kbk.inv.vo.InvJournalVo> getInvJournalVoList(){
        return invJournalVoList;
    }

    @ElVoField(physicalName = "invJournalVoList")
    public void setInvJournalVoList(java.util.List<kr.re.kitech.biz.kbk.inv.vo.InvJournalVo> invJournalVoList){
        this.invJournalVoList = invJournalVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvJournalListVo [");
        sb.append("invJournalVoList").append("=").append(invJournalVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; invJournalVoList != null && i < invJournalVoList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.inv.vo.InvJournalVo vo = (kr.re.kitech.biz.kbk.inv.vo.InvJournalVo)invJournalVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; invJournalVoList != null && i < invJournalVoList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.inv.vo.InvJournalVo vo = (kr.re.kitech.biz.kbk.inv.vo.InvJournalVo)invJournalVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
