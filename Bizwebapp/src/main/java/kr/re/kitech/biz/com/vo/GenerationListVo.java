package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "공통채번")
public class GenerationListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public GenerationListVo(){
    }

    @ElDtoField(logicalName = "공통채번List", physicalName = "GenerationVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.com.vo.GenerationVo> GenerationVoList;

    @ElVoField(physicalName = "GenerationVoList")
    public java.util.List<kr.re.kitech.biz.com.vo.GenerationVo> getGenerationVoList(){
        return GenerationVoList;
    }

    @ElVoField(physicalName = "GenerationVoList")
    public void setGenerationVoList(java.util.List<kr.re.kitech.biz.com.vo.GenerationVo> GenerationVoList){
        this.GenerationVoList = GenerationVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GenerationListVo [");
        sb.append("GenerationVoList").append("=").append(GenerationVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; GenerationVoList != null && i < GenerationVoList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.GenerationVo vo = (kr.re.kitech.biz.com.vo.GenerationVo)GenerationVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; GenerationVoList != null && i < GenerationVoList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.GenerationVo vo = (kr.re.kitech.biz.com.vo.GenerationVo)GenerationVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
