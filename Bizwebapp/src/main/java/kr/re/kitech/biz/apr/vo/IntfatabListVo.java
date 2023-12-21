package kr.re.kitech.biz.apr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "결재 반려, 작성중 리스트")
public class IntfatabListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public IntfatabListVo(){
    }

    @ElDtoField(logicalName = "결재 반려, 작성중 리스트", physicalName = "intfatabListVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.apr.vo.IntfatabVo> intfatabListVo;

    @ElVoField(physicalName = "intfatabListVo")
    public java.util.List<kr.re.kitech.biz.apr.vo.IntfatabVo> getIntfatabListVo(){
        return intfatabListVo;
    }

    @ElVoField(physicalName = "intfatabListVo")
    public void setIntfatabListVo(java.util.List<kr.re.kitech.biz.apr.vo.IntfatabVo> intfatabListVo){
        this.intfatabListVo = intfatabListVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IntfatabListVo [");
        sb.append("intfatabListVo").append("=").append(intfatabListVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; intfatabListVo != null && i < intfatabListVo.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.IntfatabVo vo = (kr.re.kitech.biz.apr.vo.IntfatabVo)intfatabListVo.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; intfatabListVo != null && i < intfatabListVo.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.IntfatabVo vo = (kr.re.kitech.biz.apr.vo.IntfatabVo)intfatabListVo.get(i);
            vo._xStreamDec();	 
        }
    }


}
