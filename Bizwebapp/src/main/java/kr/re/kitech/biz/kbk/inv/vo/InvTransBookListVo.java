package kr.re.kitech.biz.kbk.inv.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "단행본폐기이관현황 리스트 Vo")
public class InvTransBookListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public InvTransBookListVo(){
    }

    @ElDtoField(logicalName = "단행본폐기이관현황 상세 Vo", physicalName = "invTransBookVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.kbk.inv.vo.InvTransBookVo> invTransBookVoList;

    @ElVoField(physicalName = "invTransBookVoList")
    public java.util.List<kr.re.kitech.biz.kbk.inv.vo.InvTransBookVo> getInvTransBookVoList(){
        return invTransBookVoList;
    }

    @ElVoField(physicalName = "invTransBookVoList")
    public void setInvTransBookVoList(java.util.List<kr.re.kitech.biz.kbk.inv.vo.InvTransBookVo> invTransBookVoList){
        this.invTransBookVoList = invTransBookVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvTransBookListVo [");
        sb.append("invTransBookVoList").append("=").append(invTransBookVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; invTransBookVoList != null && i < invTransBookVoList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.inv.vo.InvTransBookVo vo = (kr.re.kitech.biz.kbk.inv.vo.InvTransBookVo)invTransBookVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; invTransBookVoList != null && i < invTransBookVoList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.inv.vo.InvTransBookVo vo = (kr.re.kitech.biz.kbk.inv.vo.InvTransBookVo)invTransBookVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
