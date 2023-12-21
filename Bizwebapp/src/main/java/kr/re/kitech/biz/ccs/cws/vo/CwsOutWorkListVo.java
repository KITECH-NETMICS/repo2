package kr.re.kitech.biz.ccs.cws.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "재택근무신청")
public class CwsOutWorkListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CwsOutWorkListVo(){
    }

    @ElDtoField(logicalName = "재택근무신청List", physicalName = "cwsOutWorkVoList", type = "", typeKind = "List", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.cws.vo.CwsOutWorkVo> cwsOutWorkVoList;

    @ElDtoField(logicalName = "재택근무신청Vo", physicalName = "cwsOutWorkVo", type = "", typeKind = "Vo", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ccs.cws.vo.CwsOutWorkVo cwsOutWorkVo;

    @ElDtoField(logicalName = "재택근무카운트", physicalName = "cwsOutWorkCnt", type = "int", typeKind = "", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int cwsOutWorkCnt;

    @ElVoField(physicalName = "cwsOutWorkVoList")
    public java.util.List<kr.re.kitech.biz.ccs.cws.vo.CwsOutWorkVo> getCwsOutWorkVoList(){
        return cwsOutWorkVoList;
    }

    @ElVoField(physicalName = "cwsOutWorkVoList")
    public void setCwsOutWorkVoList(java.util.List<kr.re.kitech.biz.ccs.cws.vo.CwsOutWorkVo> cwsOutWorkVoList){
        this.cwsOutWorkVoList = cwsOutWorkVoList;
    }

    @ElVoField(physicalName = "cwsOutWorkVo")
    public kr.re.kitech.biz.ccs.cws.vo.CwsOutWorkVo getCwsOutWorkVo(){
        return cwsOutWorkVo;
    }

    @ElVoField(physicalName = "cwsOutWorkVo")
    public void setCwsOutWorkVo(kr.re.kitech.biz.ccs.cws.vo.CwsOutWorkVo cwsOutWorkVo){
        this.cwsOutWorkVo = cwsOutWorkVo;
    }

    @ElVoField(physicalName = "cwsOutWorkCnt")
    public int getCwsOutWorkCnt(){
        return cwsOutWorkCnt;
    }

    @ElVoField(physicalName = "cwsOutWorkCnt")
    public void setCwsOutWorkCnt(int cwsOutWorkCnt){
        this.cwsOutWorkCnt = cwsOutWorkCnt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CwsOutWorkListVo [");
        sb.append("cwsOutWorkVoList").append("=").append(cwsOutWorkVoList).append(",");
        sb.append("cwsOutWorkVo").append("=").append(cwsOutWorkVo).append(",");
        sb.append("cwsOutWorkCnt").append("=").append(cwsOutWorkCnt);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; cwsOutWorkVoList != null && i < cwsOutWorkVoList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cws.vo.CwsOutWorkVo vo = (kr.re.kitech.biz.ccs.cws.vo.CwsOutWorkVo)cwsOutWorkVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.cwsOutWorkVo != null ) this.cwsOutWorkVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; cwsOutWorkVoList != null && i < cwsOutWorkVoList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cws.vo.CwsOutWorkVo vo = (kr.re.kitech.biz.ccs.cws.vo.CwsOutWorkVo)cwsOutWorkVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.cwsOutWorkVo != null ) this.cwsOutWorkVo._xStreamDec();
    }


}
