package kr.re.kitech.biz.pat.pid.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatPidResCrtListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatPidResCrtListVo(){
    }

    @ElDtoField(logicalName = "List Vo", physicalName = "patPidResCrtVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.pid.vo.PatPidResCrtVo> patPidResCrtVoList;

    @ElDtoField(logicalName = "Vo", physicalName = "patPidResCrtVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.pid.vo.PatPidResCrtVo patPidResCrtVo;

    @ElVoField(physicalName = "patPidResCrtVoList")
    public java.util.List<kr.re.kitech.biz.pat.pid.vo.PatPidResCrtVo> getPatPidResCrtVoList(){
        return patPidResCrtVoList;
    }

    @ElVoField(physicalName = "patPidResCrtVoList")
    public void setPatPidResCrtVoList(java.util.List<kr.re.kitech.biz.pat.pid.vo.PatPidResCrtVo> patPidResCrtVoList){
        this.patPidResCrtVoList = patPidResCrtVoList;
    }

    @ElVoField(physicalName = "patPidResCrtVo")
    public kr.re.kitech.biz.pat.pid.vo.PatPidResCrtVo getPatPidResCrtVo(){
        return patPidResCrtVo;
    }

    @ElVoField(physicalName = "patPidResCrtVo")
    public void setPatPidResCrtVo(kr.re.kitech.biz.pat.pid.vo.PatPidResCrtVo patPidResCrtVo){
        this.patPidResCrtVo = patPidResCrtVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatPidResCrtListVo [");
        sb.append("patPidResCrtVoList").append("=").append(patPidResCrtVoList).append(",");
        sb.append("patPidResCrtVo").append("=").append(patPidResCrtVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; patPidResCrtVoList != null && i < patPidResCrtVoList.size() ; i++ ) {
            kr.re.kitech.biz.pat.pid.vo.PatPidResCrtVo vo = (kr.re.kitech.biz.pat.pid.vo.PatPidResCrtVo)patPidResCrtVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.patPidResCrtVo != null ) this.patPidResCrtVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; patPidResCrtVoList != null && i < patPidResCrtVoList.size() ; i++ ) {
            kr.re.kitech.biz.pat.pid.vo.PatPidResCrtVo vo = (kr.re.kitech.biz.pat.pid.vo.PatPidResCrtVo)patPidResCrtVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.patPidResCrtVo != null ) this.patPidResCrtVo._xStreamDec();
    }


}
