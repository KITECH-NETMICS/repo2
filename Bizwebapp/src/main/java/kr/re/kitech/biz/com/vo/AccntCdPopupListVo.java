package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "회계코드마스터")
public class AccntCdPopupListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AccntCdPopupListVo(){
    }

    @ElDtoField(logicalName = "회계코드마스터List", physicalName = "accntCdPopupVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.com.vo.AccntCdPopupVo> accntCdPopupVoList;

    @ElVoField(physicalName = "accntCdPopupVoList")
    public java.util.List<kr.re.kitech.biz.com.vo.AccntCdPopupVo> getAccntCdPopupVoList(){
        return accntCdPopupVoList;
    }

    @ElVoField(physicalName = "accntCdPopupVoList")
    public void setAccntCdPopupVoList(java.util.List<kr.re.kitech.biz.com.vo.AccntCdPopupVo> accntCdPopupVoList){
        this.accntCdPopupVoList = accntCdPopupVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccntCdPopupListVo [");
        sb.append("accntCdPopupVoList").append("=").append(accntCdPopupVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; accntCdPopupVoList != null && i < accntCdPopupVoList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.AccntCdPopupVo vo = (kr.re.kitech.biz.com.vo.AccntCdPopupVo)accntCdPopupVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; accntCdPopupVoList != null && i < accntCdPopupVoList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.AccntCdPopupVo vo = (kr.re.kitech.biz.com.vo.AccntCdPopupVo)accntCdPopupVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
