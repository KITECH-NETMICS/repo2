package kr.re.kitech.biz.kbk.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "저널권호 팝업 Vo")
public class KbkPopJurnlListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public KbkPopJurnlListVo(){
    }

    @ElDtoField(logicalName = "저널권호 팝업 Vo", physicalName = "kbkPopJurnlVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.kbk.pop.vo.KbkPopJurnlVo> kbkPopJurnlVoList;

    @ElVoField(physicalName = "kbkPopJurnlVoList")
    public java.util.List<kr.re.kitech.biz.kbk.pop.vo.KbkPopJurnlVo> getKbkPopJurnlVoList(){
        return kbkPopJurnlVoList;
    }

    @ElVoField(physicalName = "kbkPopJurnlVoList")
    public void setKbkPopJurnlVoList(java.util.List<kr.re.kitech.biz.kbk.pop.vo.KbkPopJurnlVo> kbkPopJurnlVoList){
        this.kbkPopJurnlVoList = kbkPopJurnlVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KbkPopJurnlListVo [");
        sb.append("kbkPopJurnlVoList").append("=").append(kbkPopJurnlVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; kbkPopJurnlVoList != null && i < kbkPopJurnlVoList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.pop.vo.KbkPopJurnlVo vo = (kr.re.kitech.biz.kbk.pop.vo.KbkPopJurnlVo)kbkPopJurnlVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; kbkPopJurnlVoList != null && i < kbkPopJurnlVoList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.pop.vo.KbkPopJurnlVo vo = (kr.re.kitech.biz.kbk.pop.vo.KbkPopJurnlVo)kbkPopJurnlVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
