package kr.re.kitech.biz.ccs.cws.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "출퇴근기록미이행사유서 리스트")
public class CwsTagExceptListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CwsTagExceptListVo(){
    }

    @ElDtoField(logicalName = "출퇴근기록 미이행 사유서 리스트", physicalName = "cwsTagExceptVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.cws.vo.CwsTagExceptVo> cwsTagExceptVoList;

    @ElDtoField(logicalName = "출퇴근기록 미이행 사유서", physicalName = "cwsTagExceptVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ccs.cws.vo.CwsTagExceptVo cwsTagExceptVo;

    @ElVoField(physicalName = "cwsTagExceptVoList")
    public java.util.List<kr.re.kitech.biz.ccs.cws.vo.CwsTagExceptVo> getCwsTagExceptVoList(){
        return cwsTagExceptVoList;
    }

    @ElVoField(physicalName = "cwsTagExceptVoList")
    public void setCwsTagExceptVoList(java.util.List<kr.re.kitech.biz.ccs.cws.vo.CwsTagExceptVo> cwsTagExceptVoList){
        this.cwsTagExceptVoList = cwsTagExceptVoList;
    }

    @ElVoField(physicalName = "cwsTagExceptVo")
    public kr.re.kitech.biz.ccs.cws.vo.CwsTagExceptVo getCwsTagExceptVo(){
        return cwsTagExceptVo;
    }

    @ElVoField(physicalName = "cwsTagExceptVo")
    public void setCwsTagExceptVo(kr.re.kitech.biz.ccs.cws.vo.CwsTagExceptVo cwsTagExceptVo){
        this.cwsTagExceptVo = cwsTagExceptVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CwsTagExceptListVo [");
        sb.append("cwsTagExceptVoList").append("=").append(cwsTagExceptVoList).append(",");
        sb.append("cwsTagExceptVo").append("=").append(cwsTagExceptVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; cwsTagExceptVoList != null && i < cwsTagExceptVoList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cws.vo.CwsTagExceptVo vo = (kr.re.kitech.biz.ccs.cws.vo.CwsTagExceptVo)cwsTagExceptVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.cwsTagExceptVo != null ) this.cwsTagExceptVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; cwsTagExceptVoList != null && i < cwsTagExceptVoList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cws.vo.CwsTagExceptVo vo = (kr.re.kitech.biz.ccs.cws.vo.CwsTagExceptVo)cwsTagExceptVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.cwsTagExceptVo != null ) this.cwsTagExceptVo._xStreamDec();
    }


}
