package kr.re.kitech.biz.res.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "사업신청 Result Vo")
public class ResAppBsnsAppRetVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResAppBsnsAppRetVo(){
    }

    @ElDtoField(logicalName = "사업신청 상세 정보 Vo", physicalName = "mastVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.res.app.vo.ResAppMastVo mastVo;

    @ElDtoField(logicalName = "사업신청 예산 내역 Vo", physicalName = "bugtList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.res.app.vo.ResAppBugtVo> bugtList;

    @ElDtoField(logicalName = "사후결재 Vo", physicalName = "postAprVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.apr.vo.PostAprVo postAprVo;

    @ElDtoField(logicalName = "사업신청 참여연구원 Vo", physicalName = "pareList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.res.app.vo.ResAppPareVo> pareList;

    @ElDtoField(logicalName = "선행연구과제 Vo", physicalName = "prePrjList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.res.app.vo.ResAppPrePrjVo> prePrjList;

    @ElDtoField(logicalName = "연구장비비 통합관리 한도금액 Vo", physicalName = "limitAmtList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ass.eqip.vo.ResEquipLimitAmtVo> limitAmtList;

    @ElDtoField(logicalName = "사업신청기타 Vo", physicalName = "etcVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.res.app.vo.ResBsnsReqEtcVo etcVo;

    @ElDtoField(logicalName = "사업계획서 첨부", physicalName = "fileListA", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileListA;

    @ElDtoField(logicalName = "사업공고문 첨부", physicalName = "fileListB", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileListB;

    @ElVoField(physicalName = "mastVo")
    public kr.re.kitech.biz.res.app.vo.ResAppMastVo getMastVo(){
        return mastVo;
    }

    @ElVoField(physicalName = "mastVo")
    public void setMastVo(kr.re.kitech.biz.res.app.vo.ResAppMastVo mastVo){
        this.mastVo = mastVo;
    }

    @ElVoField(physicalName = "bugtList")
    public java.util.List<kr.re.kitech.biz.res.app.vo.ResAppBugtVo> getBugtList(){
        return bugtList;
    }

    @ElVoField(physicalName = "bugtList")
    public void setBugtList(java.util.List<kr.re.kitech.biz.res.app.vo.ResAppBugtVo> bugtList){
        this.bugtList = bugtList;
    }

    @ElVoField(physicalName = "postAprVo")
    public kr.re.kitech.biz.apr.vo.PostAprVo getPostAprVo(){
        return postAprVo;
    }

    @ElVoField(physicalName = "postAprVo")
    public void setPostAprVo(kr.re.kitech.biz.apr.vo.PostAprVo postAprVo){
        this.postAprVo = postAprVo;
    }

    @ElVoField(physicalName = "pareList")
    public java.util.List<kr.re.kitech.biz.res.app.vo.ResAppPareVo> getPareList(){
        return pareList;
    }

    @ElVoField(physicalName = "pareList")
    public void setPareList(java.util.List<kr.re.kitech.biz.res.app.vo.ResAppPareVo> pareList){
        this.pareList = pareList;
    }

    @ElVoField(physicalName = "prePrjList")
    public java.util.List<kr.re.kitech.biz.res.app.vo.ResAppPrePrjVo> getPrePrjList(){
        return prePrjList;
    }

    @ElVoField(physicalName = "prePrjList")
    public void setPrePrjList(java.util.List<kr.re.kitech.biz.res.app.vo.ResAppPrePrjVo> prePrjList){
        this.prePrjList = prePrjList;
    }

    @ElVoField(physicalName = "limitAmtList")
    public java.util.List<kr.re.kitech.biz.ass.eqip.vo.ResEquipLimitAmtVo> getLimitAmtList(){
        return limitAmtList;
    }

    @ElVoField(physicalName = "limitAmtList")
    public void setLimitAmtList(java.util.List<kr.re.kitech.biz.ass.eqip.vo.ResEquipLimitAmtVo> limitAmtList){
        this.limitAmtList = limitAmtList;
    }

    @ElVoField(physicalName = "etcVo")
    public kr.re.kitech.biz.res.app.vo.ResBsnsReqEtcVo getEtcVo(){
        return etcVo;
    }

    @ElVoField(physicalName = "etcVo")
    public void setEtcVo(kr.re.kitech.biz.res.app.vo.ResBsnsReqEtcVo etcVo){
        this.etcVo = etcVo;
    }

    @ElVoField(physicalName = "fileListA")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileListA(){
        return fileListA;
    }

    @ElVoField(physicalName = "fileListA")
    public void setFileListA(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileListA){
        this.fileListA = fileListA;
    }

    @ElVoField(physicalName = "fileListB")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileListB(){
        return fileListB;
    }

    @ElVoField(physicalName = "fileListB")
    public void setFileListB(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileListB){
        this.fileListB = fileListB;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResAppBsnsAppRetVo [");
        sb.append("mastVo").append("=").append(mastVo).append(",");
        sb.append("bugtList").append("=").append(bugtList).append(",");
        sb.append("postAprVo").append("=").append(postAprVo).append(",");
        sb.append("pareList").append("=").append(pareList).append(",");
        sb.append("prePrjList").append("=").append(prePrjList).append(",");
        sb.append("limitAmtList").append("=").append(limitAmtList).append(",");
        sb.append("etcVo").append("=").append(etcVo).append(",");
        sb.append("fileListA").append("=").append(fileListA).append(",");
        sb.append("fileListB").append("=").append(fileListB);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.mastVo != null ) this.mastVo._xStreamEnc();
        for( int i=0 ; bugtList != null && i < bugtList.size() ; i++ ) {
            kr.re.kitech.biz.res.app.vo.ResAppBugtVo vo = (kr.re.kitech.biz.res.app.vo.ResAppBugtVo)bugtList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.postAprVo != null ) this.postAprVo._xStreamEnc();
        for( int i=0 ; pareList != null && i < pareList.size() ; i++ ) {
            kr.re.kitech.biz.res.app.vo.ResAppPareVo vo = (kr.re.kitech.biz.res.app.vo.ResAppPareVo)pareList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; prePrjList != null && i < prePrjList.size() ; i++ ) {
            kr.re.kitech.biz.res.app.vo.ResAppPrePrjVo vo = (kr.re.kitech.biz.res.app.vo.ResAppPrePrjVo)prePrjList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; limitAmtList != null && i < limitAmtList.size() ; i++ ) {
            kr.re.kitech.biz.ass.eqip.vo.ResEquipLimitAmtVo vo = (kr.re.kitech.biz.ass.eqip.vo.ResEquipLimitAmtVo)limitAmtList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.etcVo != null ) this.etcVo._xStreamEnc();
        for( int i=0 ; fileListA != null && i < fileListA.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileListA.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileListB != null && i < fileListB.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileListB.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.mastVo != null ) this.mastVo._xStreamDec();
        for( int i=0 ; bugtList != null && i < bugtList.size() ; i++ ) {
            kr.re.kitech.biz.res.app.vo.ResAppBugtVo vo = (kr.re.kitech.biz.res.app.vo.ResAppBugtVo)bugtList.get(i);
            vo._xStreamDec();	 
        }
        if( this.postAprVo != null ) this.postAprVo._xStreamDec();
        for( int i=0 ; pareList != null && i < pareList.size() ; i++ ) {
            kr.re.kitech.biz.res.app.vo.ResAppPareVo vo = (kr.re.kitech.biz.res.app.vo.ResAppPareVo)pareList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; prePrjList != null && i < prePrjList.size() ; i++ ) {
            kr.re.kitech.biz.res.app.vo.ResAppPrePrjVo vo = (kr.re.kitech.biz.res.app.vo.ResAppPrePrjVo)prePrjList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; limitAmtList != null && i < limitAmtList.size() ; i++ ) {
            kr.re.kitech.biz.ass.eqip.vo.ResEquipLimitAmtVo vo = (kr.re.kitech.biz.ass.eqip.vo.ResEquipLimitAmtVo)limitAmtList.get(i);
            vo._xStreamDec();	 
        }
        if( this.etcVo != null ) this.etcVo._xStreamDec();
        for( int i=0 ; fileListA != null && i < fileListA.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileListA.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileListB != null && i < fileListB.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileListB.get(i);
            vo._xStreamDec();	 
        }
    }


}
