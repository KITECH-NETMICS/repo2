package kr.re.kitech.biz.fin.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "일반결의 채무반제처리 회계코드 리스트Vo")
public class AccntCdListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AccntCdListVo(){
    }

    @ElDtoField(logicalName = "채무반제처리 회계코드 Vo", physicalName = "accntList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.pop.vo.AccntCdVo> accntList;

    @ElVoField(physicalName = "accntList")
    public java.util.List<kr.re.kitech.biz.fin.pop.vo.AccntCdVo> getAccntList(){
        return accntList;
    }

    @ElVoField(physicalName = "accntList")
    public void setAccntList(java.util.List<kr.re.kitech.biz.fin.pop.vo.AccntCdVo> accntList){
        this.accntList = accntList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccntCdListVo [");
        sb.append("accntList").append("=").append(accntList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; accntList != null && i < accntList.size() ; i++ ) {
            kr.re.kitech.biz.fin.pop.vo.AccntCdVo vo = (kr.re.kitech.biz.fin.pop.vo.AccntCdVo)accntList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; accntList != null && i < accntList.size() ; i++ ) {
            kr.re.kitech.biz.fin.pop.vo.AccntCdVo vo = (kr.re.kitech.biz.fin.pop.vo.AccntCdVo)accntList.get(i);
            vo._xStreamDec();	 
        }
    }


}
