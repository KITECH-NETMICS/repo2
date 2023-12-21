package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "리스트 Vo")
public class XodrBarCodeListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public XodrBarCodeListVo(){
    }

    @ElDtoField(logicalName = "test", physicalName = "listVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.ctr.vo.XodfBarCodeVo> listVo;

    @ElVoField(physicalName = "listVo")
    public java.util.List<kr.re.kitech.biz.ccs.ctr.vo.XodfBarCodeVo> getListVo(){
        return listVo;
    }

    @ElVoField(physicalName = "listVo")
    public void setListVo(java.util.List<kr.re.kitech.biz.ccs.ctr.vo.XodfBarCodeVo> listVo){
        this.listVo = listVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("XodrBarCodeListVo [");
        sb.append("listVo").append("=").append(listVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; listVo != null && i < listVo.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.XodfBarCodeVo vo = (kr.re.kitech.biz.ccs.ctr.vo.XodfBarCodeVo)listVo.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; listVo != null && i < listVo.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.XodfBarCodeVo vo = (kr.re.kitech.biz.ccs.ctr.vo.XodfBarCodeVo)listVo.get(i);
            vo._xStreamDec();	 
        }
    }


}
