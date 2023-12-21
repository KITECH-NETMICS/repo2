package kr.re.kitech.biz.fin.spm.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "경비결의목록 List Vo")
public class FinSpmSlipListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FinSpmSlipListVo(){
    }

    @ElDtoField(logicalName = "경비결의목록 조회Vo", physicalName = "finSlipVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.spm.vo.FinSpmSlipVo> finSlipVoList;

    @ElVoField(physicalName = "finSlipVoList")
    public java.util.List<kr.re.kitech.biz.fin.spm.vo.FinSpmSlipVo> getFinSlipVoList(){
        return finSlipVoList;
    }

    @ElVoField(physicalName = "finSlipVoList")
    public void setFinSlipVoList(java.util.List<kr.re.kitech.biz.fin.spm.vo.FinSpmSlipVo> finSlipVoList){
        this.finSlipVoList = finSlipVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinSpmSlipListVo [");
        sb.append("finSlipVoList").append("=").append(finSlipVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; finSlipVoList != null && i < finSlipVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spm.vo.FinSpmSlipVo vo = (kr.re.kitech.biz.fin.spm.vo.FinSpmSlipVo)finSlipVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; finSlipVoList != null && i < finSlipVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spm.vo.FinSpmSlipVo vo = (kr.re.kitech.biz.fin.spm.vo.FinSpmSlipVo)finSlipVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
