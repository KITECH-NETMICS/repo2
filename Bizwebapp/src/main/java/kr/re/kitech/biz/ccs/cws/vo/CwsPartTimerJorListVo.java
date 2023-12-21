package kr.re.kitech.biz.ccs.cws.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "비상근 업무일지")
public class CwsPartTimerJorListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CwsPartTimerJorListVo(){
    }

    @ElDtoField(logicalName = "비상근 업무일지List", physicalName = "cwsPartTimerJorVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.cws.vo.CwsPartTimerJorVo> cwsPartTimerJorVoList;

    @ElDtoField(logicalName = "비상근 업무일지", physicalName = "cwsPartTimerJorVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ccs.cws.vo.CwsPartTimerJorVo cwsPartTimerJorVo;

    @ElVoField(physicalName = "cwsPartTimerJorVoList")
    public java.util.List<kr.re.kitech.biz.ccs.cws.vo.CwsPartTimerJorVo> getCwsPartTimerJorVoList(){
        return cwsPartTimerJorVoList;
    }

    @ElVoField(physicalName = "cwsPartTimerJorVoList")
    public void setCwsPartTimerJorVoList(java.util.List<kr.re.kitech.biz.ccs.cws.vo.CwsPartTimerJorVo> cwsPartTimerJorVoList){
        this.cwsPartTimerJorVoList = cwsPartTimerJorVoList;
    }

    @ElVoField(physicalName = "cwsPartTimerJorVo")
    public kr.re.kitech.biz.ccs.cws.vo.CwsPartTimerJorVo getCwsPartTimerJorVo(){
        return cwsPartTimerJorVo;
    }

    @ElVoField(physicalName = "cwsPartTimerJorVo")
    public void setCwsPartTimerJorVo(kr.re.kitech.biz.ccs.cws.vo.CwsPartTimerJorVo cwsPartTimerJorVo){
        this.cwsPartTimerJorVo = cwsPartTimerJorVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CwsPartTimerJorListVo [");
        sb.append("cwsPartTimerJorVoList").append("=").append(cwsPartTimerJorVoList).append(",");
        sb.append("cwsPartTimerJorVo").append("=").append(cwsPartTimerJorVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; cwsPartTimerJorVoList != null && i < cwsPartTimerJorVoList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cws.vo.CwsPartTimerJorVo vo = (kr.re.kitech.biz.ccs.cws.vo.CwsPartTimerJorVo)cwsPartTimerJorVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.cwsPartTimerJorVo != null ) this.cwsPartTimerJorVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; cwsPartTimerJorVoList != null && i < cwsPartTimerJorVoList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cws.vo.CwsPartTimerJorVo vo = (kr.re.kitech.biz.ccs.cws.vo.CwsPartTimerJorVo)cwsPartTimerJorVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.cwsPartTimerJorVo != null ) this.cwsPartTimerJorVo._xStreamDec();
    }


}
