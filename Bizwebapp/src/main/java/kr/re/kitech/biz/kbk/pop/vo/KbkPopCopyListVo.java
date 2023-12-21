package kr.re.kitech.biz.kbk.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "원문복사 팝업 Vo List")
public class KbkPopCopyListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public KbkPopCopyListVo(){
    }

    @ElDtoField(logicalName = "원문복사 팝업 Vo", physicalName = "kbkPopCopyVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.kbk.pop.vo.KbkPopCopyVo> kbkPopCopyVoList;

    @ElVoField(physicalName = "kbkPopCopyVoList")
    public java.util.List<kr.re.kitech.biz.kbk.pop.vo.KbkPopCopyVo> getKbkPopCopyVoList(){
        return kbkPopCopyVoList;
    }

    @ElVoField(physicalName = "kbkPopCopyVoList")
    public void setKbkPopCopyVoList(java.util.List<kr.re.kitech.biz.kbk.pop.vo.KbkPopCopyVo> kbkPopCopyVoList){
        this.kbkPopCopyVoList = kbkPopCopyVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KbkPopCopyListVo [");
        sb.append("kbkPopCopyVoList").append("=").append(kbkPopCopyVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; kbkPopCopyVoList != null && i < kbkPopCopyVoList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.pop.vo.KbkPopCopyVo vo = (kr.re.kitech.biz.kbk.pop.vo.KbkPopCopyVo)kbkPopCopyVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; kbkPopCopyVoList != null && i < kbkPopCopyVoList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.pop.vo.KbkPopCopyVo vo = (kr.re.kitech.biz.kbk.pop.vo.KbkPopCopyVo)kbkPopCopyVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
