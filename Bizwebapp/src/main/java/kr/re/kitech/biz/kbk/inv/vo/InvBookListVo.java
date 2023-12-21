package kr.re.kitech.biz.kbk.inv.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "단행본관리 리스트 Vo")
public class InvBookListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public InvBookListVo(){
    }

    @ElDtoField(logicalName = "단행본 관리 Vo", physicalName = "invBookListVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.kbk.inv.vo.InvBookVo> invBookListVo;

    @ElVoField(physicalName = "invBookListVo")
    public java.util.List<kr.re.kitech.biz.kbk.inv.vo.InvBookVo> getInvBookListVo(){
        return invBookListVo;
    }

    @ElVoField(physicalName = "invBookListVo")
    public void setInvBookListVo(java.util.List<kr.re.kitech.biz.kbk.inv.vo.InvBookVo> invBookListVo){
        this.invBookListVo = invBookListVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvBookListVo [");
        sb.append("invBookListVo").append("=").append(invBookListVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; invBookListVo != null && i < invBookListVo.size() ; i++ ) {
            kr.re.kitech.biz.kbk.inv.vo.InvBookVo vo = (kr.re.kitech.biz.kbk.inv.vo.InvBookVo)invBookListVo.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; invBookListVo != null && i < invBookListVo.size() ; i++ ) {
            kr.re.kitech.biz.kbk.inv.vo.InvBookVo vo = (kr.re.kitech.biz.kbk.inv.vo.InvBookVo)invBookListVo.get(i);
            vo._xStreamDec();	 
        }
    }


}
