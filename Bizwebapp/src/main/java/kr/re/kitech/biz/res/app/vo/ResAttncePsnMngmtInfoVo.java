package kr.re.kitech.biz.res.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "참여연구원 사전등록 Vo")
public class ResAttncePsnMngmtInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResAttncePsnMngmtInfoVo(){
    }

    @ElDtoField(logicalName = "참여연구원사전등록 마스터 Vo", physicalName = "mstrVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.res.app.vo.ResPareMngmtMstrVo mstrVo;

    @ElDtoField(logicalName = "참여연구원사전등록(참여연구원조회) Vo", physicalName = "pareList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.res.app.vo.ResAppPareVo> pareList;

    @ElVoField(physicalName = "mstrVo")
    public kr.re.kitech.biz.res.app.vo.ResPareMngmtMstrVo getMstrVo(){
        return mstrVo;
    }

    @ElVoField(physicalName = "mstrVo")
    public void setMstrVo(kr.re.kitech.biz.res.app.vo.ResPareMngmtMstrVo mstrVo){
        this.mstrVo = mstrVo;
    }

    @ElVoField(physicalName = "pareList")
    public java.util.List<kr.re.kitech.biz.res.app.vo.ResAppPareVo> getPareList(){
        return pareList;
    }

    @ElVoField(physicalName = "pareList")
    public void setPareList(java.util.List<kr.re.kitech.biz.res.app.vo.ResAppPareVo> pareList){
        this.pareList = pareList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResAttncePsnMngmtInfoVo [");
        sb.append("mstrVo").append("=").append(mstrVo).append(",");
        sb.append("pareList").append("=").append(pareList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.mstrVo != null ) this.mstrVo._xStreamEnc();
        for( int i=0 ; pareList != null && i < pareList.size() ; i++ ) {
            kr.re.kitech.biz.res.app.vo.ResAppPareVo vo = (kr.re.kitech.biz.res.app.vo.ResAppPareVo)pareList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.mstrVo != null ) this.mstrVo._xStreamDec();
        for( int i=0 ; pareList != null && i < pareList.size() ; i++ ) {
            kr.re.kitech.biz.res.app.vo.ResAppPareVo vo = (kr.re.kitech.biz.res.app.vo.ResAppPareVo)pareList.get(i);
            vo._xStreamDec();	 
        }
    }


}
