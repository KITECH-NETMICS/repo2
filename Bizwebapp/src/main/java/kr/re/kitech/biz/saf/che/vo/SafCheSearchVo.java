package kr.re.kitech.biz.saf.che.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "화학물질폐기신청조회조건정보")
public class SafCheSearchVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SafCheSearchVo(){
    }

    @ElDtoField(logicalName = "화학제품폐기신청조회조건", physicalName = "infoVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.saf.che.vo.SafCheSearchInfoVo infoVo;

    @ElDtoField(logicalName = "사용번호리스트", physicalName = "useReqNoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.saf.che.vo.SafCheSearchInfoVo> useReqNoList;

    @ElDtoField(logicalName = "제품번호리스트", physicalName = "productList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.saf.che.vo.SafCheSearchInfoVo> productList;

    @ElDtoField(logicalName = "요청번호리스트", physicalName = "reqNoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.saf.che.vo.SafCheSearchInfoVo> reqNoList;

    @ElVoField(physicalName = "infoVo")
    public kr.re.kitech.biz.saf.che.vo.SafCheSearchInfoVo getInfoVo(){
        return infoVo;
    }

    @ElVoField(physicalName = "infoVo")
    public void setInfoVo(kr.re.kitech.biz.saf.che.vo.SafCheSearchInfoVo infoVo){
        this.infoVo = infoVo;
    }

    @ElVoField(physicalName = "useReqNoList")
    public java.util.List<kr.re.kitech.biz.saf.che.vo.SafCheSearchInfoVo> getUseReqNoList(){
        return useReqNoList;
    }

    @ElVoField(physicalName = "useReqNoList")
    public void setUseReqNoList(java.util.List<kr.re.kitech.biz.saf.che.vo.SafCheSearchInfoVo> useReqNoList){
        this.useReqNoList = useReqNoList;
    }

    @ElVoField(physicalName = "productList")
    public java.util.List<kr.re.kitech.biz.saf.che.vo.SafCheSearchInfoVo> getProductList(){
        return productList;
    }

    @ElVoField(physicalName = "productList")
    public void setProductList(java.util.List<kr.re.kitech.biz.saf.che.vo.SafCheSearchInfoVo> productList){
        this.productList = productList;
    }

    @ElVoField(physicalName = "reqNoList")
    public java.util.List<kr.re.kitech.biz.saf.che.vo.SafCheSearchInfoVo> getReqNoList(){
        return reqNoList;
    }

    @ElVoField(physicalName = "reqNoList")
    public void setReqNoList(java.util.List<kr.re.kitech.biz.saf.che.vo.SafCheSearchInfoVo> reqNoList){
        this.reqNoList = reqNoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SafCheSearchVo [");
        sb.append("infoVo").append("=").append(infoVo).append(",");
        sb.append("useReqNoList").append("=").append(useReqNoList).append(",");
        sb.append("productList").append("=").append(productList).append(",");
        sb.append("reqNoList").append("=").append(reqNoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.infoVo != null ) this.infoVo._xStreamEnc();
        for( int i=0 ; useReqNoList != null && i < useReqNoList.size() ; i++ ) {
            kr.re.kitech.biz.saf.che.vo.SafCheSearchInfoVo vo = (kr.re.kitech.biz.saf.che.vo.SafCheSearchInfoVo)useReqNoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; productList != null && i < productList.size() ; i++ ) {
            kr.re.kitech.biz.saf.che.vo.SafCheSearchInfoVo vo = (kr.re.kitech.biz.saf.che.vo.SafCheSearchInfoVo)productList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; reqNoList != null && i < reqNoList.size() ; i++ ) {
            kr.re.kitech.biz.saf.che.vo.SafCheSearchInfoVo vo = (kr.re.kitech.biz.saf.che.vo.SafCheSearchInfoVo)reqNoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.infoVo != null ) this.infoVo._xStreamDec();
        for( int i=0 ; useReqNoList != null && i < useReqNoList.size() ; i++ ) {
            kr.re.kitech.biz.saf.che.vo.SafCheSearchInfoVo vo = (kr.re.kitech.biz.saf.che.vo.SafCheSearchInfoVo)useReqNoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; productList != null && i < productList.size() ; i++ ) {
            kr.re.kitech.biz.saf.che.vo.SafCheSearchInfoVo vo = (kr.re.kitech.biz.saf.che.vo.SafCheSearchInfoVo)productList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; reqNoList != null && i < reqNoList.size() ; i++ ) {
            kr.re.kitech.biz.saf.che.vo.SafCheSearchInfoVo vo = (kr.re.kitech.biz.saf.che.vo.SafCheSearchInfoVo)reqNoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
