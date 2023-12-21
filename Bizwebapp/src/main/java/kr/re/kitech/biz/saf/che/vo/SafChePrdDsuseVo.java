package kr.re.kitech.biz.saf.che.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "화학제품폐기관리")
public class SafChePrdDsuseVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SafChePrdDsuseVo(){
    }

    @ElDtoField(logicalName = "화학제품폐기신청정보", physicalName = "safChePrdDsuseInfoVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.saf.che.vo.SafChePrdDsuseInfoVo safChePrdDsuseInfoVo;

    @ElDtoField(logicalName = "폐기신청상세정보리스트", physicalName = "dsuseReqInfoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.saf.che.vo.SafChePrdDsuseInfoVo> dsuseReqInfoList;

    @ElDtoField(logicalName = "제품리스트", physicalName = "productList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.saf.che.vo.SafChePrdDsuseInfoVo> productList;

    @ElDtoField(logicalName = "화학제품폐기신청정보", physicalName = "aprSnapVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.saf.che.vo.SafChePrdDsuseInfoVo aprSnapVo;

    @ElDtoField(logicalName = "스냅샷화학물질리스트", physicalName = "snapChmstryList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.saf.che.vo.SafCheChmstryInfoVo> snapChmstryList;

    @ElVoField(physicalName = "safChePrdDsuseInfoVo")
    public kr.re.kitech.biz.saf.che.vo.SafChePrdDsuseInfoVo getSafChePrdDsuseInfoVo(){
        return safChePrdDsuseInfoVo;
    }

    @ElVoField(physicalName = "safChePrdDsuseInfoVo")
    public void setSafChePrdDsuseInfoVo(kr.re.kitech.biz.saf.che.vo.SafChePrdDsuseInfoVo safChePrdDsuseInfoVo){
        this.safChePrdDsuseInfoVo = safChePrdDsuseInfoVo;
    }

    @ElVoField(physicalName = "dsuseReqInfoList")
    public java.util.List<kr.re.kitech.biz.saf.che.vo.SafChePrdDsuseInfoVo> getDsuseReqInfoList(){
        return dsuseReqInfoList;
    }

    @ElVoField(physicalName = "dsuseReqInfoList")
    public void setDsuseReqInfoList(java.util.List<kr.re.kitech.biz.saf.che.vo.SafChePrdDsuseInfoVo> dsuseReqInfoList){
        this.dsuseReqInfoList = dsuseReqInfoList;
    }

    @ElVoField(physicalName = "productList")
    public java.util.List<kr.re.kitech.biz.saf.che.vo.SafChePrdDsuseInfoVo> getProductList(){
        return productList;
    }

    @ElVoField(physicalName = "productList")
    public void setProductList(java.util.List<kr.re.kitech.biz.saf.che.vo.SafChePrdDsuseInfoVo> productList){
        this.productList = productList;
    }

    @ElVoField(physicalName = "aprSnapVo")
    public kr.re.kitech.biz.saf.che.vo.SafChePrdDsuseInfoVo getAprSnapVo(){
        return aprSnapVo;
    }

    @ElVoField(physicalName = "aprSnapVo")
    public void setAprSnapVo(kr.re.kitech.biz.saf.che.vo.SafChePrdDsuseInfoVo aprSnapVo){
        this.aprSnapVo = aprSnapVo;
    }

    @ElVoField(physicalName = "snapChmstryList")
    public java.util.List<kr.re.kitech.biz.saf.che.vo.SafCheChmstryInfoVo> getSnapChmstryList(){
        return snapChmstryList;
    }

    @ElVoField(physicalName = "snapChmstryList")
    public void setSnapChmstryList(java.util.List<kr.re.kitech.biz.saf.che.vo.SafCheChmstryInfoVo> snapChmstryList){
        this.snapChmstryList = snapChmstryList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SafChePrdDsuseVo [");
        sb.append("safChePrdDsuseInfoVo").append("=").append(safChePrdDsuseInfoVo).append(",");
        sb.append("dsuseReqInfoList").append("=").append(dsuseReqInfoList).append(",");
        sb.append("productList").append("=").append(productList).append(",");
        sb.append("aprSnapVo").append("=").append(aprSnapVo).append(",");
        sb.append("snapChmstryList").append("=").append(snapChmstryList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.safChePrdDsuseInfoVo != null ) this.safChePrdDsuseInfoVo._xStreamEnc();
        for( int i=0 ; dsuseReqInfoList != null && i < dsuseReqInfoList.size() ; i++ ) {
            kr.re.kitech.biz.saf.che.vo.SafChePrdDsuseInfoVo vo = (kr.re.kitech.biz.saf.che.vo.SafChePrdDsuseInfoVo)dsuseReqInfoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; productList != null && i < productList.size() ; i++ ) {
            kr.re.kitech.biz.saf.che.vo.SafChePrdDsuseInfoVo vo = (kr.re.kitech.biz.saf.che.vo.SafChePrdDsuseInfoVo)productList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.aprSnapVo != null ) this.aprSnapVo._xStreamEnc();
        for( int i=0 ; snapChmstryList != null && i < snapChmstryList.size() ; i++ ) {
            kr.re.kitech.biz.saf.che.vo.SafCheChmstryInfoVo vo = (kr.re.kitech.biz.saf.che.vo.SafCheChmstryInfoVo)snapChmstryList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.safChePrdDsuseInfoVo != null ) this.safChePrdDsuseInfoVo._xStreamDec();
        for( int i=0 ; dsuseReqInfoList != null && i < dsuseReqInfoList.size() ; i++ ) {
            kr.re.kitech.biz.saf.che.vo.SafChePrdDsuseInfoVo vo = (kr.re.kitech.biz.saf.che.vo.SafChePrdDsuseInfoVo)dsuseReqInfoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; productList != null && i < productList.size() ; i++ ) {
            kr.re.kitech.biz.saf.che.vo.SafChePrdDsuseInfoVo vo = (kr.re.kitech.biz.saf.che.vo.SafChePrdDsuseInfoVo)productList.get(i);
            vo._xStreamDec();	 
        }
        if( this.aprSnapVo != null ) this.aprSnapVo._xStreamDec();
        for( int i=0 ; snapChmstryList != null && i < snapChmstryList.size() ; i++ ) {
            kr.re.kitech.biz.saf.che.vo.SafCheChmstryInfoVo vo = (kr.re.kitech.biz.saf.che.vo.SafCheChmstryInfoVo)snapChmstryList.get(i);
            vo._xStreamDec();	 
        }
    }


}
