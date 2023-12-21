package kr.re.kitech.biz.epu.ord.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "발주계획관리 Vo")
public class EpuOrdPlanInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public EpuOrdPlanInfoVo(){
    }

    @ElDtoField(logicalName = "발주계획상세 Vo", physicalName = "mastrVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.epu.ord.vo.EpuOrdMastrVo mastrVo;

    @ElDtoField(logicalName = "발주계획-구매의뢰내역 Vo", physicalName = "itemList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.epu.ord.vo.EpuOrdReqItemVo> itemList;

    @ElDtoField(logicalName = "발주계획-지명업체 Vo", physicalName = "vendList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.epu.ord.vo.EpuOrnomVendVo> vendList;

    @ElDtoField(logicalName = "발주계획 지역제한 Vo", physicalName = "areaList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.epu.ord.vo.EpuOrdLimitAreaVo> areaList;

    @ElDtoField(logicalName = "발주계획 업종제한 Vo", physicalName = "ctgrList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.epu.ord.vo.EpuOrdLimitClsfVo> ctgrList;

    @ElDtoField(logicalName = "발주계획 삭제 Vo", physicalName = "delVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.epu.ord.vo.EpuOrdDelVo delVo;

    @ElDtoField(logicalName = "구매요구 계정내역 Vo", physicalName = "accntList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.epu.req.vo.PurReqAccntVo> accntList;

    @ElDtoField(logicalName = "구매요구 공통 Vo", physicalName = "purReqList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.epu.req.vo.PurReqComVo> purReqList;

    @ElDtoField(logicalName = "발주계획 결재정보 Vo", physicalName = "chkVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.epu.ord.vo.EpuOrdCheckVo chkVo;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "fileList_A", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_A;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "fileList_B", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_B;

    @ElDtoField(logicalName = "공종별 전체 지분율 Vo", physicalName = "constClsfList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.epu.ord.vo.EpuOrdLimitConstClsfVo> constClsfList;

    @ElVoField(physicalName = "mastrVo")
    public kr.re.kitech.biz.epu.ord.vo.EpuOrdMastrVo getMastrVo(){
        return mastrVo;
    }

    @ElVoField(physicalName = "mastrVo")
    public void setMastrVo(kr.re.kitech.biz.epu.ord.vo.EpuOrdMastrVo mastrVo){
        this.mastrVo = mastrVo;
    }

    @ElVoField(physicalName = "itemList")
    public java.util.List<kr.re.kitech.biz.epu.ord.vo.EpuOrdReqItemVo> getItemList(){
        return itemList;
    }

    @ElVoField(physicalName = "itemList")
    public void setItemList(java.util.List<kr.re.kitech.biz.epu.ord.vo.EpuOrdReqItemVo> itemList){
        this.itemList = itemList;
    }

    @ElVoField(physicalName = "vendList")
    public java.util.List<kr.re.kitech.biz.epu.ord.vo.EpuOrnomVendVo> getVendList(){
        return vendList;
    }

    @ElVoField(physicalName = "vendList")
    public void setVendList(java.util.List<kr.re.kitech.biz.epu.ord.vo.EpuOrnomVendVo> vendList){
        this.vendList = vendList;
    }

    @ElVoField(physicalName = "areaList")
    public java.util.List<kr.re.kitech.biz.epu.ord.vo.EpuOrdLimitAreaVo> getAreaList(){
        return areaList;
    }

    @ElVoField(physicalName = "areaList")
    public void setAreaList(java.util.List<kr.re.kitech.biz.epu.ord.vo.EpuOrdLimitAreaVo> areaList){
        this.areaList = areaList;
    }

    @ElVoField(physicalName = "ctgrList")
    public java.util.List<kr.re.kitech.biz.epu.ord.vo.EpuOrdLimitClsfVo> getCtgrList(){
        return ctgrList;
    }

    @ElVoField(physicalName = "ctgrList")
    public void setCtgrList(java.util.List<kr.re.kitech.biz.epu.ord.vo.EpuOrdLimitClsfVo> ctgrList){
        this.ctgrList = ctgrList;
    }

    @ElVoField(physicalName = "delVo")
    public kr.re.kitech.biz.epu.ord.vo.EpuOrdDelVo getDelVo(){
        return delVo;
    }

    @ElVoField(physicalName = "delVo")
    public void setDelVo(kr.re.kitech.biz.epu.ord.vo.EpuOrdDelVo delVo){
        this.delVo = delVo;
    }

    @ElVoField(physicalName = "accntList")
    public java.util.List<kr.re.kitech.biz.epu.req.vo.PurReqAccntVo> getAccntList(){
        return accntList;
    }

    @ElVoField(physicalName = "accntList")
    public void setAccntList(java.util.List<kr.re.kitech.biz.epu.req.vo.PurReqAccntVo> accntList){
        this.accntList = accntList;
    }

    @ElVoField(physicalName = "purReqList")
    public java.util.List<kr.re.kitech.biz.epu.req.vo.PurReqComVo> getPurReqList(){
        return purReqList;
    }

    @ElVoField(physicalName = "purReqList")
    public void setPurReqList(java.util.List<kr.re.kitech.biz.epu.req.vo.PurReqComVo> purReqList){
        this.purReqList = purReqList;
    }

    @ElVoField(physicalName = "chkVo")
    public kr.re.kitech.biz.epu.ord.vo.EpuOrdCheckVo getChkVo(){
        return chkVo;
    }

    @ElVoField(physicalName = "chkVo")
    public void setChkVo(kr.re.kitech.biz.epu.ord.vo.EpuOrdCheckVo chkVo){
        this.chkVo = chkVo;
    }

    @ElVoField(physicalName = "fileList_A")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList_A(){
        return fileList_A;
    }

    @ElVoField(physicalName = "fileList_A")
    public void setFileList_A(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_A){
        this.fileList_A = fileList_A;
    }

    @ElVoField(physicalName = "fileList_B")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList_B(){
        return fileList_B;
    }

    @ElVoField(physicalName = "fileList_B")
    public void setFileList_B(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_B){
        this.fileList_B = fileList_B;
    }

    @ElVoField(physicalName = "constClsfList")
    public java.util.List<kr.re.kitech.biz.epu.ord.vo.EpuOrdLimitConstClsfVo> getConstClsfList(){
        return constClsfList;
    }

    @ElVoField(physicalName = "constClsfList")
    public void setConstClsfList(java.util.List<kr.re.kitech.biz.epu.ord.vo.EpuOrdLimitConstClsfVo> constClsfList){
        this.constClsfList = constClsfList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EpuOrdPlanInfoVo [");
        sb.append("mastrVo").append("=").append(mastrVo).append(",");
        sb.append("itemList").append("=").append(itemList).append(",");
        sb.append("vendList").append("=").append(vendList).append(",");
        sb.append("areaList").append("=").append(areaList).append(",");
        sb.append("ctgrList").append("=").append(ctgrList).append(",");
        sb.append("delVo").append("=").append(delVo).append(",");
        sb.append("accntList").append("=").append(accntList).append(",");
        sb.append("purReqList").append("=").append(purReqList).append(",");
        sb.append("chkVo").append("=").append(chkVo).append(",");
        sb.append("fileList_A").append("=").append(fileList_A).append(",");
        sb.append("fileList_B").append("=").append(fileList_B).append(",");
        sb.append("constClsfList").append("=").append(constClsfList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.mastrVo != null ) this.mastrVo._xStreamEnc();
        for( int i=0 ; itemList != null && i < itemList.size() ; i++ ) {
            kr.re.kitech.biz.epu.ord.vo.EpuOrdReqItemVo vo = (kr.re.kitech.biz.epu.ord.vo.EpuOrdReqItemVo)itemList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; vendList != null && i < vendList.size() ; i++ ) {
            kr.re.kitech.biz.epu.ord.vo.EpuOrnomVendVo vo = (kr.re.kitech.biz.epu.ord.vo.EpuOrnomVendVo)vendList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; areaList != null && i < areaList.size() ; i++ ) {
            kr.re.kitech.biz.epu.ord.vo.EpuOrdLimitAreaVo vo = (kr.re.kitech.biz.epu.ord.vo.EpuOrdLimitAreaVo)areaList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; ctgrList != null && i < ctgrList.size() ; i++ ) {
            kr.re.kitech.biz.epu.ord.vo.EpuOrdLimitClsfVo vo = (kr.re.kitech.biz.epu.ord.vo.EpuOrdLimitClsfVo)ctgrList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.delVo != null ) this.delVo._xStreamEnc();
        for( int i=0 ; accntList != null && i < accntList.size() ; i++ ) {
            kr.re.kitech.biz.epu.req.vo.PurReqAccntVo vo = (kr.re.kitech.biz.epu.req.vo.PurReqAccntVo)accntList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; purReqList != null && i < purReqList.size() ; i++ ) {
            kr.re.kitech.biz.epu.req.vo.PurReqComVo vo = (kr.re.kitech.biz.epu.req.vo.PurReqComVo)purReqList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.chkVo != null ) this.chkVo._xStreamEnc();
        for( int i=0 ; fileList_A != null && i < fileList_A.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_A.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileList_B != null && i < fileList_B.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_B.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; constClsfList != null && i < constClsfList.size() ; i++ ) {
            kr.re.kitech.biz.epu.ord.vo.EpuOrdLimitConstClsfVo vo = (kr.re.kitech.biz.epu.ord.vo.EpuOrdLimitConstClsfVo)constClsfList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.mastrVo != null ) this.mastrVo._xStreamDec();
        for( int i=0 ; itemList != null && i < itemList.size() ; i++ ) {
            kr.re.kitech.biz.epu.ord.vo.EpuOrdReqItemVo vo = (kr.re.kitech.biz.epu.ord.vo.EpuOrdReqItemVo)itemList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; vendList != null && i < vendList.size() ; i++ ) {
            kr.re.kitech.biz.epu.ord.vo.EpuOrnomVendVo vo = (kr.re.kitech.biz.epu.ord.vo.EpuOrnomVendVo)vendList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; areaList != null && i < areaList.size() ; i++ ) {
            kr.re.kitech.biz.epu.ord.vo.EpuOrdLimitAreaVo vo = (kr.re.kitech.biz.epu.ord.vo.EpuOrdLimitAreaVo)areaList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; ctgrList != null && i < ctgrList.size() ; i++ ) {
            kr.re.kitech.biz.epu.ord.vo.EpuOrdLimitClsfVo vo = (kr.re.kitech.biz.epu.ord.vo.EpuOrdLimitClsfVo)ctgrList.get(i);
            vo._xStreamDec();	 
        }
        if( this.delVo != null ) this.delVo._xStreamDec();
        for( int i=0 ; accntList != null && i < accntList.size() ; i++ ) {
            kr.re.kitech.biz.epu.req.vo.PurReqAccntVo vo = (kr.re.kitech.biz.epu.req.vo.PurReqAccntVo)accntList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; purReqList != null && i < purReqList.size() ; i++ ) {
            kr.re.kitech.biz.epu.req.vo.PurReqComVo vo = (kr.re.kitech.biz.epu.req.vo.PurReqComVo)purReqList.get(i);
            vo._xStreamDec();	 
        }
        if( this.chkVo != null ) this.chkVo._xStreamDec();
        for( int i=0 ; fileList_A != null && i < fileList_A.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_A.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList_B != null && i < fileList_B.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_B.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; constClsfList != null && i < constClsfList.size() ; i++ ) {
            kr.re.kitech.biz.epu.ord.vo.EpuOrdLimitConstClsfVo vo = (kr.re.kitech.biz.epu.ord.vo.EpuOrdLimitConstClsfVo)constClsfList.get(i);
            vo._xStreamDec();	 
        }
    }


}
