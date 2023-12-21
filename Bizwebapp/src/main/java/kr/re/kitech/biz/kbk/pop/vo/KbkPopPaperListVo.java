package kr.re.kitech.biz.kbk.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "발표논문 팝업 상세 리스트")
public class KbkPopPaperListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public KbkPopPaperListVo(){
    }

    @ElDtoField(logicalName = "발표논문 팝업 상세 Vo", physicalName = "kbkPopPaperDetailVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.kbk.pop.vo.KbkPopPaperDetailVo> kbkPopPaperDetailVoList;

    @ElVoField(physicalName = "kbkPopPaperDetailVoList")
    public java.util.List<kr.re.kitech.biz.kbk.pop.vo.KbkPopPaperDetailVo> getKbkPopPaperDetailVoList(){
        return kbkPopPaperDetailVoList;
    }

    @ElVoField(physicalName = "kbkPopPaperDetailVoList")
    public void setKbkPopPaperDetailVoList(java.util.List<kr.re.kitech.biz.kbk.pop.vo.KbkPopPaperDetailVo> kbkPopPaperDetailVoList){
        this.kbkPopPaperDetailVoList = kbkPopPaperDetailVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KbkPopPaperListVo [");
        sb.append("kbkPopPaperDetailVoList").append("=").append(kbkPopPaperDetailVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; kbkPopPaperDetailVoList != null && i < kbkPopPaperDetailVoList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.pop.vo.KbkPopPaperDetailVo vo = (kr.re.kitech.biz.kbk.pop.vo.KbkPopPaperDetailVo)kbkPopPaperDetailVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; kbkPopPaperDetailVoList != null && i < kbkPopPaperDetailVoList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.pop.vo.KbkPopPaperDetailVo vo = (kr.re.kitech.biz.kbk.pop.vo.KbkPopPaperDetailVo)kbkPopPaperDetailVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
