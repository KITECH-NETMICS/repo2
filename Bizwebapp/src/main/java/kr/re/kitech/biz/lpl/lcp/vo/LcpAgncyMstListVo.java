package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class LcpAgncyMstListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public LcpAgncyMstListVo(){
    }

    @ElDtoField(logicalName = "ListVo", physicalName = "lcpAgncyMstVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstVo> lcpAgncyMstVoList;

    @ElDtoField(logicalName = "Vo", physicalName = "lcpAgncyMstVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstVo lcpAgncyMstVo;

    @ElDtoField(logicalName = "대외기관협력(국내협약조회)", physicalName = "lcpMouDomTabVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomTabVo> lcpMouDomTabVoList;

    @ElDtoField(logicalName = "대외기관협력공동연구)", physicalName = "resinpMastTabVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.ResinpMastTabVo> resinpMastTabVoList;

    @ElDtoField(logicalName = "대외기관협력(해외, 주재국 출장조회)", physicalName = "ctrOverTabVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.CtrOverTabVo> ctrOverTabVoList;

    @ElDtoField(logicalName = "대외기관협력(귀빈조회)", physicalName = "losVipTabVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LosVipTabVo> losVipTabVoList;

    @ElDtoField(logicalName = "대외기관협력 (행사조회)", physicalName = "lcpEventTabVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpEventTabVo> lcpEventTabVoList;

    @ElVoField(physicalName = "lcpAgncyMstVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstVo> getLcpAgncyMstVoList(){
        return lcpAgncyMstVoList;
    }

    @ElVoField(physicalName = "lcpAgncyMstVoList")
    public void setLcpAgncyMstVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstVo> lcpAgncyMstVoList){
        this.lcpAgncyMstVoList = lcpAgncyMstVoList;
    }

    @ElVoField(physicalName = "lcpAgncyMstVo")
    public kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstVo getLcpAgncyMstVo(){
        return lcpAgncyMstVo;
    }

    @ElVoField(physicalName = "lcpAgncyMstVo")
    public void setLcpAgncyMstVo(kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstVo lcpAgncyMstVo){
        this.lcpAgncyMstVo = lcpAgncyMstVo;
    }

    @ElVoField(physicalName = "lcpMouDomTabVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomTabVo> getLcpMouDomTabVoList(){
        return lcpMouDomTabVoList;
    }

    @ElVoField(physicalName = "lcpMouDomTabVoList")
    public void setLcpMouDomTabVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomTabVo> lcpMouDomTabVoList){
        this.lcpMouDomTabVoList = lcpMouDomTabVoList;
    }

    @ElVoField(physicalName = "resinpMastTabVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.ResinpMastTabVo> getResinpMastTabVoList(){
        return resinpMastTabVoList;
    }

    @ElVoField(physicalName = "resinpMastTabVoList")
    public void setResinpMastTabVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.ResinpMastTabVo> resinpMastTabVoList){
        this.resinpMastTabVoList = resinpMastTabVoList;
    }

    @ElVoField(physicalName = "ctrOverTabVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.CtrOverTabVo> getCtrOverTabVoList(){
        return ctrOverTabVoList;
    }

    @ElVoField(physicalName = "ctrOverTabVoList")
    public void setCtrOverTabVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.CtrOverTabVo> ctrOverTabVoList){
        this.ctrOverTabVoList = ctrOverTabVoList;
    }

    @ElVoField(physicalName = "losVipTabVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LosVipTabVo> getLosVipTabVoList(){
        return losVipTabVoList;
    }

    @ElVoField(physicalName = "losVipTabVoList")
    public void setLosVipTabVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LosVipTabVo> losVipTabVoList){
        this.losVipTabVoList = losVipTabVoList;
    }

    @ElVoField(physicalName = "lcpEventTabVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpEventTabVo> getLcpEventTabVoList(){
        return lcpEventTabVoList;
    }

    @ElVoField(physicalName = "lcpEventTabVoList")
    public void setLcpEventTabVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LcpEventTabVo> lcpEventTabVoList){
        this.lcpEventTabVoList = lcpEventTabVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LcpAgncyMstListVo [");
        sb.append("lcpAgncyMstVoList").append("=").append(lcpAgncyMstVoList).append(",");
        sb.append("lcpAgncyMstVo").append("=").append(lcpAgncyMstVo).append(",");
        sb.append("lcpMouDomTabVoList").append("=").append(lcpMouDomTabVoList).append(",");
        sb.append("resinpMastTabVoList").append("=").append(resinpMastTabVoList).append(",");
        sb.append("ctrOverTabVoList").append("=").append(ctrOverTabVoList).append(",");
        sb.append("losVipTabVoList").append("=").append(losVipTabVoList).append(",");
        sb.append("lcpEventTabVoList").append("=").append(lcpEventTabVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; lcpAgncyMstVoList != null && i < lcpAgncyMstVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstVo)lcpAgncyMstVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.lcpAgncyMstVo != null ) this.lcpAgncyMstVo._xStreamEnc();
        for( int i=0 ; lcpMouDomTabVoList != null && i < lcpMouDomTabVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomTabVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomTabVo)lcpMouDomTabVoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; resinpMastTabVoList != null && i < resinpMastTabVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.ResinpMastTabVo vo = (kr.re.kitech.biz.lpl.lcp.vo.ResinpMastTabVo)resinpMastTabVoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; ctrOverTabVoList != null && i < ctrOverTabVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.CtrOverTabVo vo = (kr.re.kitech.biz.lpl.lcp.vo.CtrOverTabVo)ctrOverTabVoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; losVipTabVoList != null && i < losVipTabVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.LosVipTabVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LosVipTabVo)losVipTabVoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; lcpEventTabVoList != null && i < lcpEventTabVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.LcpEventTabVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpEventTabVo)lcpEventTabVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; lcpAgncyMstVoList != null && i < lcpAgncyMstVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstVo)lcpAgncyMstVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.lcpAgncyMstVo != null ) this.lcpAgncyMstVo._xStreamDec();
        for( int i=0 ; lcpMouDomTabVoList != null && i < lcpMouDomTabVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomTabVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomTabVo)lcpMouDomTabVoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; resinpMastTabVoList != null && i < resinpMastTabVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.ResinpMastTabVo vo = (kr.re.kitech.biz.lpl.lcp.vo.ResinpMastTabVo)resinpMastTabVoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; ctrOverTabVoList != null && i < ctrOverTabVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.CtrOverTabVo vo = (kr.re.kitech.biz.lpl.lcp.vo.CtrOverTabVo)ctrOverTabVoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; losVipTabVoList != null && i < losVipTabVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.LosVipTabVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LosVipTabVo)losVipTabVoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; lcpEventTabVoList != null && i < lcpEventTabVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.LcpEventTabVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LcpEventTabVo)lcpEventTabVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
