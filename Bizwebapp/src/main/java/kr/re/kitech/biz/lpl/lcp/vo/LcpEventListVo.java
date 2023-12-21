package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class LcpEventListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public LcpEventListVo(){
    }

    @ElDtoField(logicalName = "ListVo", physicalName = "lcpEventVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpEventVo> lcpEventVoList;

    @ElDtoField(logicalName = "Vo", physicalName = "lcpEventVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.lpl.lcp.vo.LcpEventVo lcpEventVo;

    @ElDtoField(logicalName = "국제행사비용리스트", physicalName = "lcpEventExpnsVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpEventExpnsVo> lcpEventExpnsVoList;

    @ElVoField(physicalName = "lcpEventVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpEventVo> getLcpEventVoList(){
        return lcpEventVoList;
    }

    @ElVoField(physicalName = "lcpEventVoList")
    public void setLcpEventVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpEventVo> lcpEventVoList){
        this.lcpEventVoList = lcpEventVoList;
    }

    @ElVoField(physicalName = "lcpEventVo")
    public kr.re.kitech.biz.lpl.lcp.vo.LcpEventVo getLcpEventVo(){
        return lcpEventVo;
    }

    @ElVoField(physicalName = "lcpEventVo")
    public void setLcpEventVo(kr.re.kitech.biz.lpl.lcp.vo.LcpEventVo lcpEventVo){
        this.lcpEventVo = lcpEventVo;
    }

    @ElVoField(physicalName = "lcpEventExpnsVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpEventExpnsVo> getLcpEventExpnsVoList(){
        return lcpEventExpnsVoList;
    }

    @ElVoField(physicalName = "lcpEventExpnsVoList")
    public void setLcpEventExpnsVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpEventExpnsVo> lcpEventExpnsVoList){
        this.lcpEventExpnsVoList = lcpEventExpnsVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LcpEventListVo [");
        sb.append("lcpEventVoList").append("=").append(lcpEventVoList).append(",");
        sb.append("lcpEventVo").append("=").append(lcpEventVo).append(",");
        sb.append("lcpEventExpnsVoList").append("=").append(lcpEventExpnsVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; lcpEventVoList != null && i < lcpEventVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.LcpEventVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpEventVo)lcpEventVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.lcpEventVo != null ) this.lcpEventVo._xStreamEnc();
        for( int i=0 ; lcpEventExpnsVoList != null && i < lcpEventExpnsVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.LcpEventExpnsVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpEventExpnsVo)lcpEventExpnsVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; lcpEventVoList != null && i < lcpEventVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.LcpEventVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpEventVo)lcpEventVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.lcpEventVo != null ) this.lcpEventVo._xStreamDec();
        for( int i=0 ; lcpEventExpnsVoList != null && i < lcpEventExpnsVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.LcpEventExpnsVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpEventExpnsVo)lcpEventExpnsVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
