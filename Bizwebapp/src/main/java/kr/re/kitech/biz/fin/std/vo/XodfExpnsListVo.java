package kr.re.kitech.biz.fin.std.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "비용코드 리스트 Vo")
public class XodfExpnsListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public XodfExpnsListVo(){
    }

    @ElDtoField(logicalName = "비용코드 검색", physicalName = "expnsList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.std.vo.XodfExpnsVo> expnsList;

    @ElVoField(physicalName = "expnsList")
    public java.util.List<kr.re.kitech.biz.fin.std.vo.XodfExpnsVo> getExpnsList(){
        return expnsList;
    }

    @ElVoField(physicalName = "expnsList")
    public void setExpnsList(java.util.List<kr.re.kitech.biz.fin.std.vo.XodfExpnsVo> expnsList){
        this.expnsList = expnsList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("XodfExpnsListVo [");
        sb.append("expnsList").append("=").append(expnsList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; expnsList != null && i < expnsList.size() ; i++ ) {
            kr.re.kitech.biz.fin.std.vo.XodfExpnsVo vo = (kr.re.kitech.biz.fin.std.vo.XodfExpnsVo)expnsList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; expnsList != null && i < expnsList.size() ; i++ ) {
            kr.re.kitech.biz.fin.std.vo.XodfExpnsVo vo = (kr.re.kitech.biz.fin.std.vo.XodfExpnsVo)expnsList.get(i);
            vo._xStreamDec();	 
        }
    }


}
