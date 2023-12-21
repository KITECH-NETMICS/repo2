package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "비용코드검색")
public class FbaItmExpnsListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FbaItmExpnsListVo(){
    }

    @ElDtoField(logicalName = "비용코드검색List", physicalName = "fbaItmExpnsVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.com.vo.FbaItmExpnsVo> fbaItmExpnsVoList;

    @ElVoField(physicalName = "fbaItmExpnsVoList")
    public java.util.List<kr.re.kitech.biz.com.vo.FbaItmExpnsVo> getFbaItmExpnsVoList(){
        return fbaItmExpnsVoList;
    }

    @ElVoField(physicalName = "fbaItmExpnsVoList")
    public void setFbaItmExpnsVoList(java.util.List<kr.re.kitech.biz.com.vo.FbaItmExpnsVo> fbaItmExpnsVoList){
        this.fbaItmExpnsVoList = fbaItmExpnsVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FbaItmExpnsListVo [");
        sb.append("fbaItmExpnsVoList").append("=").append(fbaItmExpnsVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; fbaItmExpnsVoList != null && i < fbaItmExpnsVoList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.FbaItmExpnsVo vo = (kr.re.kitech.biz.com.vo.FbaItmExpnsVo)fbaItmExpnsVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; fbaItmExpnsVoList != null && i < fbaItmExpnsVoList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.FbaItmExpnsVo vo = (kr.re.kitech.biz.com.vo.FbaItmExpnsVo)fbaItmExpnsVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
