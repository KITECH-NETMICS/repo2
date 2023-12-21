package kr.re.kitech.biz.res.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "업무구분 코드 통합Vo")
public class ResBsnsCodeDepthListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResBsnsCodeDepthListVo(){
    }

    @ElDtoField(logicalName = "업무구분 코드 통합Vo", physicalName = "depth1Vo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.res.com.vo.ResBsnsCodeDepthVo> depth1Vo;

    @ElDtoField(logicalName = "업무구분 코드 통합Vo", physicalName = "depth2Vo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.res.com.vo.ResBsnsCodeDepthVo> depth2Vo;

    @ElDtoField(logicalName = "업무구분 코드 통합Vo", physicalName = "depth3Vo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.res.com.vo.ResBsnsCodeDepthVo> depth3Vo;

    @ElVoField(physicalName = "depth1Vo")
    public java.util.List<kr.re.kitech.biz.res.com.vo.ResBsnsCodeDepthVo> getDepth1Vo(){
        return depth1Vo;
    }

    @ElVoField(physicalName = "depth1Vo")
    public void setDepth1Vo(java.util.List<kr.re.kitech.biz.res.com.vo.ResBsnsCodeDepthVo> depth1Vo){
        this.depth1Vo = depth1Vo;
    }

    @ElVoField(physicalName = "depth2Vo")
    public java.util.List<kr.re.kitech.biz.res.com.vo.ResBsnsCodeDepthVo> getDepth2Vo(){
        return depth2Vo;
    }

    @ElVoField(physicalName = "depth2Vo")
    public void setDepth2Vo(java.util.List<kr.re.kitech.biz.res.com.vo.ResBsnsCodeDepthVo> depth2Vo){
        this.depth2Vo = depth2Vo;
    }

    @ElVoField(physicalName = "depth3Vo")
    public java.util.List<kr.re.kitech.biz.res.com.vo.ResBsnsCodeDepthVo> getDepth3Vo(){
        return depth3Vo;
    }

    @ElVoField(physicalName = "depth3Vo")
    public void setDepth3Vo(java.util.List<kr.re.kitech.biz.res.com.vo.ResBsnsCodeDepthVo> depth3Vo){
        this.depth3Vo = depth3Vo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResBsnsCodeDepthListVo [");
        sb.append("depth1Vo").append("=").append(depth1Vo).append(",");
        sb.append("depth2Vo").append("=").append(depth2Vo).append(",");
        sb.append("depth3Vo").append("=").append(depth3Vo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; depth1Vo != null && i < depth1Vo.size() ; i++ ) {
            kr.re.kitech.biz.res.com.vo.ResBsnsCodeDepthVo vo = (kr.re.kitech.biz.res.com.vo.ResBsnsCodeDepthVo)depth1Vo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; depth2Vo != null && i < depth2Vo.size() ; i++ ) {
            kr.re.kitech.biz.res.com.vo.ResBsnsCodeDepthVo vo = (kr.re.kitech.biz.res.com.vo.ResBsnsCodeDepthVo)depth2Vo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; depth3Vo != null && i < depth3Vo.size() ; i++ ) {
            kr.re.kitech.biz.res.com.vo.ResBsnsCodeDepthVo vo = (kr.re.kitech.biz.res.com.vo.ResBsnsCodeDepthVo)depth3Vo.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; depth1Vo != null && i < depth1Vo.size() ; i++ ) {
            kr.re.kitech.biz.res.com.vo.ResBsnsCodeDepthVo vo = (kr.re.kitech.biz.res.com.vo.ResBsnsCodeDepthVo)depth1Vo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; depth2Vo != null && i < depth2Vo.size() ; i++ ) {
            kr.re.kitech.biz.res.com.vo.ResBsnsCodeDepthVo vo = (kr.re.kitech.biz.res.com.vo.ResBsnsCodeDepthVo)depth2Vo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; depth3Vo != null && i < depth3Vo.size() ; i++ ) {
            kr.re.kitech.biz.res.com.vo.ResBsnsCodeDepthVo vo = (kr.re.kitech.biz.res.com.vo.ResBsnsCodeDepthVo)depth3Vo.get(i);
            vo._xStreamDec();	 
        }
    }


}
