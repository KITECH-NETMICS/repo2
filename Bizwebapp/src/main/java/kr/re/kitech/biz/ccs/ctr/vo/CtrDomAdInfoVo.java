package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "국내출장정산 정보 Vo")
public class CtrDomAdInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CtrDomAdInfoVo(){
    }

    @ElDtoField(logicalName = "국내출장정산 Vo", physicalName = "tripAdVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ccs.ctr.vo.CtrDomAdFormVo tripAdVo;

    @ElDtoField(logicalName = "국내출장 동반자 Vo", physicalName = "compnList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrDomCompnVo> compnList;

    @ElDtoField(logicalName = "국내출장정산경로Vo", physicalName = "pathList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrDomPathVo> pathList;

    @ElDtoField(logicalName = "국내출장경로Vo", physicalName = "reqPathList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrDomPathVo> reqPathList;

    @ElDtoField(logicalName = "국내출장정산 경비 Vo", physicalName = "expnsList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrDomExpnsVo> expnsList;

    @ElDtoField(logicalName = "국내출장 지급내역 Vo", physicalName = "payList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrDomPayVo> payList;

    @ElDtoField(logicalName = "국내출장 계정내역 Vo", physicalName = "accntList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrDomAccntVo> accntList;

    @ElDtoField(logicalName = "국내출장기타경비 Vo", physicalName = "feeVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ccs.ctr.vo.CtrDomFeeVo feeVo;

    @ElDtoField(logicalName = "출장정산 GPS Vo", physicalName = "gpsList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrTripGpsVo> gpsList;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "evidFileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> evidFileList;

    @ElDtoField(logicalName = "(결재)출장 항공마일리지  Vo", physicalName = "mileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrAirMileUseAprVo> mileList;

    @ElVoField(physicalName = "tripAdVo")
    public kr.re.kitech.biz.ccs.ctr.vo.CtrDomAdFormVo getTripAdVo(){
        return tripAdVo;
    }

    @ElVoField(physicalName = "tripAdVo")
    public void setTripAdVo(kr.re.kitech.biz.ccs.ctr.vo.CtrDomAdFormVo tripAdVo){
        this.tripAdVo = tripAdVo;
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

    @ElVoField(physicalName = "reqPathList")
    public java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrDomPathVo> getReqPathList(){
        return reqPathList;
    }

    @ElVoField(physicalName = "reqPathList")
    public void setReqPathList(java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrDomPathVo> reqPathList){
        this.reqPathList = reqPathList;
    }

    @ElVoField(physicalName = "expnsList")
    public java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrDomExpnsVo> getExpnsList(){
        return expnsList;
    }

    @ElVoField(physicalName = "expnsList")
    public void setExpnsList(java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrDomExpnsVo> expnsList){
        this.expnsList = expnsList;
    }

    @ElVoField(physicalName = "payList")
    public java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrDomPayVo> getPayList(){
        return payList;
    }

    @ElVoField(physicalName = "payList")
    public void setPayList(java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrDomPayVo> payList){
        this.payList = payList;
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

    @ElVoField(physicalName = "gpsList")
    public java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrTripGpsVo> getGpsList(){
        return gpsList;
    }

    @ElVoField(physicalName = "gpsList")
    public void setGpsList(java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrTripGpsVo> gpsList){
        this.gpsList = gpsList;
    }

    @ElVoField(physicalName = "fileList")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList(){
        return fileList;
    }

    @ElVoField(physicalName = "fileList")
    public void setFileList(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList){
        this.fileList = fileList;
    }

    @ElVoField(physicalName = "evidFileList")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getEvidFileList(){
        return evidFileList;
    }

    @ElVoField(physicalName = "evidFileList")
    public void setEvidFileList(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> evidFileList){
        this.evidFileList = evidFileList;
    }

    @ElVoField(physicalName = "mileList")
    public java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrAirMileUseAprVo> getMileList(){
        return mileList;
    }

    @ElVoField(physicalName = "mileList")
    public void setMileList(java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrAirMileUseAprVo> mileList){
        this.mileList = mileList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrDomAdInfoVo [");
        sb.append("tripAdVo").append("=").append(tripAdVo).append(",");
        sb.append("compnList").append("=").append(compnList).append(",");
        sb.append("pathList").append("=").append(pathList).append(",");
        sb.append("reqPathList").append("=").append(reqPathList).append(",");
        sb.append("expnsList").append("=").append(expnsList).append(",");
        sb.append("payList").append("=").append(payList).append(",");
        sb.append("accntList").append("=").append(accntList).append(",");
        sb.append("feeVo").append("=").append(feeVo).append(",");
        sb.append("gpsList").append("=").append(gpsList).append(",");
        sb.append("fileList").append("=").append(fileList).append(",");
        sb.append("evidFileList").append("=").append(evidFileList).append(",");
        sb.append("mileList").append("=").append(mileList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.tripAdVo != null ) this.tripAdVo._xStreamEnc();
        for( int i=0 ; compnList != null && i < compnList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrDomCompnVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrDomCompnVo)compnList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; pathList != null && i < pathList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrDomPathVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrDomPathVo)pathList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; reqPathList != null && i < reqPathList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrDomPathVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrDomPathVo)reqPathList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; expnsList != null && i < expnsList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrDomExpnsVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrDomExpnsVo)expnsList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; payList != null && i < payList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrDomPayVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrDomPayVo)payList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; accntList != null && i < accntList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrDomAccntVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrDomAccntVo)accntList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.feeVo != null ) this.feeVo._xStreamEnc();
        for( int i=0 ; gpsList != null && i < gpsList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrTripGpsVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrTripGpsVo)gpsList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; evidFileList != null && i < evidFileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)evidFileList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; mileList != null && i < mileList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrAirMileUseAprVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrAirMileUseAprVo)mileList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.tripAdVo != null ) this.tripAdVo._xStreamDec();
        for( int i=0 ; compnList != null && i < compnList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrDomCompnVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrDomCompnVo)compnList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; pathList != null && i < pathList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrDomPathVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrDomPathVo)pathList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; reqPathList != null && i < reqPathList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrDomPathVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrDomPathVo)reqPathList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; expnsList != null && i < expnsList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrDomExpnsVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrDomExpnsVo)expnsList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; payList != null && i < payList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrDomPayVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrDomPayVo)payList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; accntList != null && i < accntList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrDomAccntVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrDomAccntVo)accntList.get(i);
            vo._xStreamDec();	 
        }
        if( this.feeVo != null ) this.feeVo._xStreamDec();
        for( int i=0 ; gpsList != null && i < gpsList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrTripGpsVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrTripGpsVo)gpsList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; evidFileList != null && i < evidFileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)evidFileList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; mileList != null && i < mileList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrAirMileUseAprVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrAirMileUseAprVo)mileList.get(i);
            vo._xStreamDec();	 
        }
    }


}
