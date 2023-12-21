package kr.re.kitech.biz.ccs.cws.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "유연근무 일별 리스트")
public class CwsWorkTimeDetailFlexListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CwsWorkTimeDetailFlexListVo(){
    }

    @ElDtoField(logicalName = "WorkTimeDays", physicalName = "cwsWorkTimeDaysFlexVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDaysFlexVo> cwsWorkTimeDaysFlexVo;

    @ElVoField(physicalName = "cwsWorkTimeDaysFlexVo")
    public java.util.List<kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDaysFlexVo> getCwsWorkTimeDaysFlexVo(){
        return cwsWorkTimeDaysFlexVo;
    }

    @ElVoField(physicalName = "cwsWorkTimeDaysFlexVo")
    public void setCwsWorkTimeDaysFlexVo(java.util.List<kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDaysFlexVo> cwsWorkTimeDaysFlexVo){
        this.cwsWorkTimeDaysFlexVo = cwsWorkTimeDaysFlexVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CwsWorkTimeDetailFlexListVo [");
        sb.append("cwsWorkTimeDaysFlexVo").append("=").append(cwsWorkTimeDaysFlexVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; cwsWorkTimeDaysFlexVo != null && i < cwsWorkTimeDaysFlexVo.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDaysFlexVo vo = (kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDaysFlexVo)cwsWorkTimeDaysFlexVo.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; cwsWorkTimeDaysFlexVo != null && i < cwsWorkTimeDaysFlexVo.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDaysFlexVo vo = (kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDaysFlexVo)cwsWorkTimeDaysFlexVo.get(i);
            vo._xStreamDec();	 
        }
    }


}
