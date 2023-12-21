package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class LcpMouDomListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public LcpMouDomListVo(){
    }

    @ElDtoField(logicalName = "ListVo", physicalName = "lcpMouDomVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomVo> lcpMouDomVoList;

    @ElDtoField(logicalName = "Vo", physicalName = "lcpMouDomVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomVo lcpMouDomVo;

    @ElDtoField(logicalName = "상세조회", physicalName = "lcpMouDomFormVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomFormVo lcpMouDomFormVo;

    @ElDtoField(logicalName = "국내협약 사후관리", physicalName = "lcpMouDomAftrVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAftrVo> lcpMouDomAftrVoList;

    @ElDtoField(logicalName = "국내협약긴관정보조회", physicalName = "lcpMouDomAgencyVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo> lcpMouDomAgencyVoList;

    @ElDtoField(logicalName = "국내협약 사용자 조회", physicalName = "lcpMouUserVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouUserVo> lcpMouUserVoList;

    @ElVoField(physicalName = "lcpMouDomVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomVo> getLcpMouDomVoList(){
        return lcpMouDomVoList;
    }

    @ElVoField(physicalName = "lcpMouDomVoList")
    public void setLcpMouDomVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomVo> lcpMouDomVoList){
        this.lcpMouDomVoList = lcpMouDomVoList;
    }

    @ElVoField(physicalName = "lcpMouDomVo")
    public kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomVo getLcpMouDomVo(){
        return lcpMouDomVo;
    }

    @ElVoField(physicalName = "lcpMouDomVo")
    public void setLcpMouDomVo(kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomVo lcpMouDomVo){
        this.lcpMouDomVo = lcpMouDomVo;
    }

    @ElVoField(physicalName = "lcpMouDomFormVo")
    public kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomFormVo getLcpMouDomFormVo(){
        return lcpMouDomFormVo;
    }

    @ElVoField(physicalName = "lcpMouDomFormVo")
    public void setLcpMouDomFormVo(kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomFormVo lcpMouDomFormVo){
        this.lcpMouDomFormVo = lcpMouDomFormVo;
    }

    @ElVoField(physicalName = "lcpMouDomAftrVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAftrVo> getLcpMouDomAftrVoList(){
        return lcpMouDomAftrVoList;
    }

    @ElVoField(physicalName = "lcpMouDomAftrVoList")
    public void setLcpMouDomAftrVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAftrVo> lcpMouDomAftrVoList){
        this.lcpMouDomAftrVoList = lcpMouDomAftrVoList;
    }

    @ElVoField(physicalName = "lcpMouDomAgencyVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo> getLcpMouDomAgencyVoList(){
        return lcpMouDomAgencyVoList;
    }

    @ElVoField(physicalName = "lcpMouDomAgencyVoList")
    public void setLcpMouDomAgencyVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo> lcpMouDomAgencyVoList){
        this.lcpMouDomAgencyVoList = lcpMouDomAgencyVoList;
    }

    @ElVoField(physicalName = "lcpMouUserVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouUserVo> getLcpMouUserVoList(){
        return lcpMouUserVoList;
    }

    @ElVoField(physicalName = "lcpMouUserVoList")
    public void setLcpMouUserVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouUserVo> lcpMouUserVoList){
        this.lcpMouUserVoList = lcpMouUserVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LcpMouDomListVo [");
        sb.append("lcpMouDomVoList").append("=").append(lcpMouDomVoList).append(",");
        sb.append("lcpMouDomVo").append("=").append(lcpMouDomVo).append(",");
        sb.append("lcpMouDomFormVo").append("=").append(lcpMouDomFormVo).append(",");
        sb.append("lcpMouDomAftrVoList").append("=").append(lcpMouDomAftrVoList).append(",");
        sb.append("lcpMouDomAgencyVoList").append("=").append(lcpMouDomAgencyVoList).append(",");
        sb.append("lcpMouUserVoList").append("=").append(lcpMouUserVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; lcpMouDomVoList != null && i < lcpMouDomVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomVo)lcpMouDomVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.lcpMouDomVo != null ) this.lcpMouDomVo._xStreamEnc();
        if( this.lcpMouDomFormVo != null ) this.lcpMouDomFormVo._xStreamEnc();
        for( int i=0 ; lcpMouDomAftrVoList != null && i < lcpMouDomAftrVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAftrVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAftrVo)lcpMouDomAftrVoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; lcpMouDomAgencyVoList != null && i < lcpMouDomAgencyVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo)lcpMouDomAgencyVoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; lcpMouUserVoList != null && i < lcpMouUserVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.LcpMouUserVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpMouUserVo)lcpMouUserVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; lcpMouDomVoList != null && i < lcpMouDomVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomVo)lcpMouDomVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.lcpMouDomVo != null ) this.lcpMouDomVo._xStreamDec();
        if( this.lcpMouDomFormVo != null ) this.lcpMouDomFormVo._xStreamDec();
        for( int i=0 ; lcpMouDomAftrVoList != null && i < lcpMouDomAftrVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAftrVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAftrVo)lcpMouDomAftrVoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; lcpMouDomAgencyVoList != null && i < lcpMouDomAgencyVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomAgencyVo)lcpMouDomAgencyVoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; lcpMouUserVoList != null && i < lcpMouUserVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.LcpMouUserVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpMouUserVo)lcpMouUserVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
