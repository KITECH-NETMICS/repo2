package kr.re.kitech.biz.apr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "BPM 결재대기함 리스트")
public class AprWorkListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AprWorkListVo(){
    }

    @ElDtoField(logicalName = "BPM 결재대기함", physicalName = "workListVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.apr.vo.AprWorkVo> workListVo;

    @ElVoField(physicalName = "workListVo")
    public java.util.List<kr.re.kitech.biz.apr.vo.AprWorkVo> getWorkListVo(){
        return workListVo;
    }

    @ElVoField(physicalName = "workListVo")
    public void setWorkListVo(java.util.List<kr.re.kitech.biz.apr.vo.AprWorkVo> workListVo){
        this.workListVo = workListVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AprWorkListVo [");
        sb.append("workListVo").append("=").append(workListVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; workListVo != null && i < workListVo.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.AprWorkVo vo = (kr.re.kitech.biz.apr.vo.AprWorkVo)workListVo.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; workListVo != null && i < workListVo.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.AprWorkVo vo = (kr.re.kitech.biz.apr.vo.AprWorkVo)workListVo.get(i);
            vo._xStreamDec();	 
        }
    }


}
