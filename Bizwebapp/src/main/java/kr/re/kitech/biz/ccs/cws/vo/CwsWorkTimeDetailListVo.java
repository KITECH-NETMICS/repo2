package kr.re.kitech.biz.ccs.cws.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "표준근무 일별 리스트Vo")
public class CwsWorkTimeDetailListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CwsWorkTimeDetailListVo(){
    }

    @ElDtoField(logicalName = "표준근무 일별 리스트", physicalName = "cwsWorkTimeDaysVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDaysVo> cwsWorkTimeDaysVo;

    @ElVoField(physicalName = "cwsWorkTimeDaysVo")
    public java.util.List<kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDaysVo> getCwsWorkTimeDaysVo(){
        return cwsWorkTimeDaysVo;
    }

    @ElVoField(physicalName = "cwsWorkTimeDaysVo")
    public void setCwsWorkTimeDaysVo(java.util.List<kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDaysVo> cwsWorkTimeDaysVo){
        this.cwsWorkTimeDaysVo = cwsWorkTimeDaysVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CwsWorkTimeDetailListVo [");
        sb.append("cwsWorkTimeDaysVo").append("=").append(cwsWorkTimeDaysVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; cwsWorkTimeDaysVo != null && i < cwsWorkTimeDaysVo.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDaysVo vo = (kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDaysVo)cwsWorkTimeDaysVo.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; cwsWorkTimeDaysVo != null && i < cwsWorkTimeDaysVo.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDaysVo vo = (kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDaysVo)cwsWorkTimeDaysVo.get(i);
            vo._xStreamDec();	 
        }
    }


}
