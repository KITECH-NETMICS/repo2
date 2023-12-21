package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "결재 제약 List")
public class AppvConstraintListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AppvConstraintListVo(){
    }

    @ElDtoField(logicalName = "결재 제약 Vo List", physicalName = "appvConstraintVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.com.vo.AppvConstraintVo> appvConstraintVoList;

    @ElDtoField(logicalName = "베타테스터", physicalName = "betaTesterVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.com.vo.BetaTesterVo betaTesterVo;

    @ElVoField(physicalName = "appvConstraintVoList")
    public java.util.List<kr.re.kitech.biz.com.vo.AppvConstraintVo> getAppvConstraintVoList(){
        return appvConstraintVoList;
    }

    @ElVoField(physicalName = "appvConstraintVoList")
    public void setAppvConstraintVoList(java.util.List<kr.re.kitech.biz.com.vo.AppvConstraintVo> appvConstraintVoList){
        this.appvConstraintVoList = appvConstraintVoList;
    }

    @ElVoField(physicalName = "betaTesterVo")
    public kr.re.kitech.biz.com.vo.BetaTesterVo getBetaTesterVo(){
        return betaTesterVo;
    }

    @ElVoField(physicalName = "betaTesterVo")
    public void setBetaTesterVo(kr.re.kitech.biz.com.vo.BetaTesterVo betaTesterVo){
        this.betaTesterVo = betaTesterVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AppvConstraintListVo [");
        sb.append("appvConstraintVoList").append("=").append(appvConstraintVoList).append(",");
        sb.append("betaTesterVo").append("=").append(betaTesterVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; appvConstraintVoList != null && i < appvConstraintVoList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.AppvConstraintVo vo = (kr.re.kitech.biz.com.vo.AppvConstraintVo)appvConstraintVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.betaTesterVo != null ) this.betaTesterVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; appvConstraintVoList != null && i < appvConstraintVoList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.AppvConstraintVo vo = (kr.re.kitech.biz.com.vo.AppvConstraintVo)appvConstraintVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.betaTesterVo != null ) this.betaTesterVo._xStreamDec();
    }


}
