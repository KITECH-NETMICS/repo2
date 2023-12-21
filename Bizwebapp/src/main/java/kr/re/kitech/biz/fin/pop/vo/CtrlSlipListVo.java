package kr.re.kitech.biz.fin.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "일반결의 통제내역결의처리 리스트 Vo")
public class CtrlSlipListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CtrlSlipListVo(){
    }

    @ElDtoField(logicalName = "통제내역 결의처리 팝업 Vo", physicalName = "ctrlList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.pop.vo.CtrlSlipVo> ctrlList;

    @ElVoField(physicalName = "ctrlList")
    public java.util.List<kr.re.kitech.biz.fin.pop.vo.CtrlSlipVo> getCtrlList(){
        return ctrlList;
    }

    @ElVoField(physicalName = "ctrlList")
    public void setCtrlList(java.util.List<kr.re.kitech.biz.fin.pop.vo.CtrlSlipVo> ctrlList){
        this.ctrlList = ctrlList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrlSlipListVo [");
        sb.append("ctrlList").append("=").append(ctrlList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; ctrlList != null && i < ctrlList.size() ; i++ ) {
            kr.re.kitech.biz.fin.pop.vo.CtrlSlipVo vo = (kr.re.kitech.biz.fin.pop.vo.CtrlSlipVo)ctrlList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; ctrlList != null && i < ctrlList.size() ; i++ ) {
            kr.re.kitech.biz.fin.pop.vo.CtrlSlipVo vo = (kr.re.kitech.biz.fin.pop.vo.CtrlSlipVo)ctrlList.get(i);
            vo._xStreamDec();	 
        }
    }


}
