package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "출장신청Vo")
public class CtrTripReqVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CtrTripReqVo(){
    }

    @ElDtoField(logicalName = "국내출장신청 조회 Vo", physicalName = "tripVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ccs.ctr.vo.CtrDomTripVo tripVo;

    @ElDtoField(logicalName = "현장출장 방문처 Vo", physicalName = "vstList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.ctr.vo.SptCtrBizTripVendVo> vstList;

    @ElDtoField(logicalName = "국내출장 동반자 Vo", physicalName = "compnList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrDomCompnVo> compnList;

    @ElDtoField(logicalName = "국내출장경로Vo", physicalName = "pathList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrDomPathVo> pathList;

    @ElDtoField(logicalName = "국내출장 활동내역 Vo", physicalName = "schdList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrDomSchedVo> schdList;

    @ElDtoField(logicalName = "국내출장 계정내역 Vo", physicalName = "accntList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrDomAccntVo> accntList;

    @ElDtoField(logicalName = "국내출장기타경비 Vo", physicalName = "feeVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ccs.ctr.vo.CtrDomFeeVo feeVo;

    @ElDtoField(logicalName = "국내출장 출장자 Vo", physicalName = "compnVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ccs.ctr.vo.CtrDomCompnVo compnVo;

    @ElDtoField(logicalName = "휴무일내역 Vo", physicalName = "offList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrBizTripRstVo> offList;

    @ElDtoField(logicalName = "국내출장 지급내역 Vo", physicalName = "payList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrDomPayVo> payList;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;

    @ElVoField(physicalName = "tripVo")
    public kr.re.kitech.biz.ccs.ctr.vo.CtrDomTripVo getTripVo(){
        return tripVo;
    }

    @ElVoField(physicalName = "tripVo")
    public void setTripVo(kr.re.kitech.biz.ccs.ctr.vo.CtrDomTripVo tripVo){
        this.tripVo = tripVo;
    }

    @ElVoField(physicalName = "vstList")
    public java.util.List<kr.re.kitech.biz.ccs.ctr.vo.SptCtrBizTripVendVo> getVstList(){
        return vstList;
    }

    @ElVoField(physicalName = "vstList")
    public void setVstList(java.util.List<kr.re.kitech.biz.ccs.ctr.vo.SptCtrBizTripVendVo> vstList){
        this.vstList = vstList;
    }

    @ElVoField(physicalName = "compnList")
    public java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrDomCompnVo> getCompnList(){
        return compnList;
    }

    @ElVoField(physicalName = "compnList")
    public void setCompnList(java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrDomCompnVo> compnList){
        this.compnList = compnList;
    }

    @ElVoField(physicalName = "pathList")
    public java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrDomPathVo> getPathList(){
        return pathList;
    }

    @ElVoField(physicalName = "pathList")
    public void setPathList(java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrDomPathVo> pathList){
        this.pathList = pathList;
    }

    @ElVoField(physicalName = "schdList")
    public java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrDomSchedVo> getSchdList(){
        return schdList;
    }

    @ElVoField(physicalName = "schdList")
    public void setSchdList(java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrDomSchedVo> schdList){
        this.schdList = schdList;
    }

    @ElVoField(physicalName = "accntList")
    public java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrDomAccntVo> getAccntList(){
        return accntList;
    }

    @ElVoField(physicalName = "accntList")
    public void setAccntList(java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrDomAccntVo> accntList){
        this.accntList = accntList;
    }

    @ElVoField(physicalName = "feeVo")
    public kr.re.kitech.biz.ccs.ctr.vo.CtrDomFeeVo getFeeVo(){
        return feeVo;
    }

    @ElVoField(physicalName = "feeVo")
    public void setFeeVo(kr.re.kitech.biz.ccs.ctr.vo.CtrDomFeeVo feeVo){
        this.feeVo = feeVo;
    }

    @ElVoField(physicalName = "compnVo")
    public kr.re.kitech.biz.ccs.ctr.vo.CtrDomCompnVo getCompnVo(){
        return compnVo;
    }

    @ElVoField(physicalName = "compnVo")
    public void setCompnVo(kr.re.kitech.biz.ccs.ctr.vo.CtrDomCompnVo compnVo){
        this.compnVo = compnVo;
    }

    @ElVoField(physicalName = "offList")
    public java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrBizTripRstVo> getOffList(){
        return offList;
    }

    @ElVoField(physicalName = "offList")
    public void setOffList(java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrBizTripRstVo> offList){
        this.offList = offList;
    }

    @ElVoField(physicalName = "payList")
    public java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrDomPayVo> getPayList(){
        return payList;
    }

    @ElVoField(physicalName = "payList")
    public void setPayList(java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrDomPayVo> payList){
        this.payList = payList;
    }

    @ElVoField(physicalName = "fileList")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList(){
        return fileList;
    }

    @ElVoField(physicalName = "fileList")
    public void setFileList(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList){
        this.fileList = fileList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrTripReqVo [");
        sb.append("tripVo").append("=").append(tripVo).append(",");
        sb.append("vstList").append("=").append(vstList).append(",");
        sb.append("compnList").append("=").append(compnList).append(",");
        sb.append("pathList").append("=").append(pathList).append(",");
        sb.append("schdList").append("=").append(schdList).append(",");
        sb.append("accntList").append("=").append(accntList).append(",");
        sb.append("feeVo").append("=").append(feeVo).append(",");
        sb.append("compnVo").append("=").append(compnVo).append(",");
        sb.append("offList").append("=").append(offList).append(",");
        sb.append("payList").append("=").append(payList).append(",");
        sb.append("fileList").append("=").append(fileList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.tripVo != null ) this.tripVo._xStreamEnc();
        for( int i=0 ; vstList != null && i < vstList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.SptCtrBizTripVendVo vo = (kr.re.kitech.biz.ccs.ctr.vo.SptCtrBizTripVendVo)vstList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; compnList != null && i < compnList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrDomCompnVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrDomCompnVo)compnList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; pathList != null && i < pathList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrDomPathVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrDomPathVo)pathList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; schdList != null && i < schdList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrDomSchedVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrDomSchedVo)schdList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; accntList != null && i < accntList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrDomAccntVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrDomAccntVo)accntList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.feeVo != null ) this.feeVo._xStreamEnc();
        if( this.compnVo != null ) this.compnVo._xStreamEnc();
        for( int i=0 ; offList != null && i < offList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrBizTripRstVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrBizTripRstVo)offList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; payList != null && i < payList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrDomPayVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrDomPayVo)payList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.tripVo != null ) this.tripVo._xStreamDec();
        for( int i=0 ; vstList != null && i < vstList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.SptCtrBizTripVendVo vo = (kr.re.kitech.biz.ccs.ctr.vo.SptCtrBizTripVendVo)vstList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; compnList != null && i < compnList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrDomCompnVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrDomCompnVo)compnList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; pathList != null && i < pathList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrDomPathVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrDomPathVo)pathList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; schdList != null && i < schdList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrDomSchedVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrDomSchedVo)schdList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; accntList != null && i < accntList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrDomAccntVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrDomAccntVo)accntList.get(i);
            vo._xStreamDec();	 
        }
        if( this.feeVo != null ) this.feeVo._xStreamDec();
        if( this.compnVo != null ) this.compnVo._xStreamDec();
        for( int i=0 ; offList != null && i < offList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrBizTripRstVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrBizTripRstVo)offList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; payList != null && i < payList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrDomPayVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrDomPayVo)payList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamDec();	 
        }
    }


}
