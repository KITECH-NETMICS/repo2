package kr.re.kitech.biz.ccs.csf.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "보안안전교육ListVo")
public class CsfSecrtEduListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CsfSecrtEduListVo(){
    }

    @ElDtoField(logicalName = "보안안전교육Vo", physicalName = "csfSecrtEduVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.csf.vo.CsfSecrtEduVo> csfSecrtEduVoList;

    @ElVoField(physicalName = "csfSecrtEduVoList")
    public java.util.List<kr.re.kitech.biz.ccs.csf.vo.CsfSecrtEduVo> getCsfSecrtEduVoList(){
        return csfSecrtEduVoList;
    }

    @ElVoField(physicalName = "csfSecrtEduVoList")
    public void setCsfSecrtEduVoList(java.util.List<kr.re.kitech.biz.ccs.csf.vo.CsfSecrtEduVo> csfSecrtEduVoList){
        this.csfSecrtEduVoList = csfSecrtEduVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CsfSecrtEduListVo [");
        sb.append("csfSecrtEduVoList").append("=").append(csfSecrtEduVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; csfSecrtEduVoList != null && i < csfSecrtEduVoList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.csf.vo.CsfSecrtEduVo vo = (kr.re.kitech.biz.ccs.csf.vo.CsfSecrtEduVo)csfSecrtEduVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; csfSecrtEduVoList != null && i < csfSecrtEduVoList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.csf.vo.CsfSecrtEduVo vo = (kr.re.kitech.biz.ccs.csf.vo.CsfSecrtEduVo)csfSecrtEduVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
