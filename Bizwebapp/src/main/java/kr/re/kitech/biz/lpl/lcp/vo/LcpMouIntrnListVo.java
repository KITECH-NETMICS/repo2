package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class LcpMouIntrnListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public LcpMouIntrnListVo(){
    }

    @ElDtoField(logicalName = "ListVo", physicalName = "lcpMouIntrnVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouIntrnVo> lcpMouIntrnVoList;

    @ElDtoField(logicalName = "Vo", physicalName = "lcpMouIntrnVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.lpl.lcp.vo.LcpMouIntrnVo lcpMouIntrnVo;

    @ElDtoField(logicalName = "ListVo", physicalName = "lcpMouDomAgencyVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo> lcpMouDomAgencyVoList;

    @ElDtoField(logicalName = "ListVo", physicalName = "lcpMouAfactVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouAfactVo> lcpMouAfactVoList;

    @ElVoField(physicalName = "lcpMouIntrnVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouIntrnVo> getLcpMouIntrnVoList(){
        return lcpMouIntrnVoList;
    }

    @ElVoField(physicalName = "lcpMouIntrnVoList")
    public void setLcpMouIntrnVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouIntrnVo> lcpMouIntrnVoList){
        this.lcpMouIntrnVoList = lcpMouIntrnVoList;
    }

    @ElVoField(physicalName = "lcpMouIntrnVo")
    public kr.re.kitech.biz.lpl.lcp.vo.LcpMouIntrnVo getLcpMouIntrnVo(){
        return lcpMouIntrnVo;
    }

    @ElVoField(physicalName = "lcpMouIntrnVo")
    public void setLcpMouIntrnVo(kr.re.kitech.biz.lpl.lcp.vo.LcpMouIntrnVo lcpMouIntrnVo){
        this.lcpMouIntrnVo = lcpMouIntrnVo;
    }

    @ElVoField(physicalName = "lcpMouDomAgencyVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo> getLcpMouDomAgencyVoList(){
        return lcpMouDomAgencyVoList;
    }

    @ElVoField(physicalName = "lcpMouDomAgencyVoList")
    public void setLcpMouDomAgencyVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo> lcpMouDomAgencyVoList){
        this.lcpMouDomAgencyVoList = lcpMouDomAgencyVoList;
    }

    @ElVoField(physicalName = "lcpMouAfactVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouAfactVo> getLcpMouAfactVoList(){
        return lcpMouAfactVoList;
    }

    @ElVoField(physicalName = "lcpMouAfactVoList")
    public void setLcpMouAfactVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouAfactVo> lcpMouAfactVoList){
        this.lcpMouAfactVoList = lcpMouAfactVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LcpMouIntrnListVo [");
        sb.append("lcpMouIntrnVoList").append("=").append(lcpMouIntrnVoList).append(",");
        sb.append("lcpMouIntrnVo").append("=").append(lcpMouIntrnVo).append(",");
        sb.append("lcpMouDomAgencyVoList").append("=").append(lcpMouDomAgencyVoList).append(",");
        sb.append("lcpMouAfactVoList").append("=").append(lcpMouAfactVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; lcpMouIntrnVoList != null && i < lcpMouIntrnVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.LcpMouIntrnVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpMouIntrnVo)lcpMouIntrnVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.lcpMouIntrnVo != null ) this.lcpMouIntrnVo._xStreamEnc();
        for( int i=0 ; lcpMouDomAgencyVoList != null && i < lcpMouDomAgencyVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo)lcpMouDomAgencyVoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; lcpMouAfactVoList != null && i < lcpMouAfactVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.LcpMouAfactVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpMouAfactVo)lcpMouAfactVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; lcpMouIntrnVoList != null && i < lcpMouIntrnVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.LcpMouIntrnVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpMouIntrnVo)lcpMouIntrnVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.lcpMouIntrnVo != null ) this.lcpMouIntrnVo._xStreamDec();
        for( int i=0 ; lcpMouDomAgencyVoList != null && i < lcpMouDomAgencyVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo)lcpMouDomAgencyVoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; lcpMouAfactVoList != null && i < lcpMouAfactVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.LcpMouAfactVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpMouAfactVo)lcpMouAfactVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
