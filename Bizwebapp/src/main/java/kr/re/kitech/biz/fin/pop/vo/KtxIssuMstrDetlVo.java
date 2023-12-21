package kr.re.kitech.biz.fin.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "전자세금계산서 팝업 조회 Vo")
public class KtxIssuMstrDetlVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public KtxIssuMstrDetlVo(){
    }

    @ElDtoField(logicalName = "매입계산서 Vo", physicalName = "mstrVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrVo mstrVo;

    @ElDtoField(logicalName = "전자세금계산서 품목 Vo", physicalName = "detlList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.pop.vo.KtxIssuDetailVo> detlList;

    @ElVoField(physicalName = "mstrVo")
    public kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrVo getMstrVo(){
        return mstrVo;
    }

    @ElVoField(physicalName = "mstrVo")
    public void setMstrVo(kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrVo mstrVo){
        this.mstrVo = mstrVo;
    }

    @ElVoField(physicalName = "detlList")
    public java.util.List<kr.re.kitech.biz.fin.pop.vo.KtxIssuDetailVo> getDetlList(){
        return detlList;
    }

    @ElVoField(physicalName = "detlList")
    public void setDetlList(java.util.List<kr.re.kitech.biz.fin.pop.vo.KtxIssuDetailVo> detlList){
        this.detlList = detlList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KtxIssuMstrDetlVo [");
        sb.append("mstrVo").append("=").append(mstrVo).append(",");
        sb.append("detlList").append("=").append(detlList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.mstrVo != null ) this.mstrVo._xStreamEnc();
        for( int i=0 ; detlList != null && i < detlList.size() ; i++ ) {
            kr.re.kitech.biz.fin.pop.vo.KtxIssuDetailVo vo = (kr.re.kitech.biz.fin.pop.vo.KtxIssuDetailVo)detlList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.mstrVo != null ) this.mstrVo._xStreamDec();
        for( int i=0 ; detlList != null && i < detlList.size() ; i++ ) {
            kr.re.kitech.biz.fin.pop.vo.KtxIssuDetailVo vo = (kr.re.kitech.biz.fin.pop.vo.KtxIssuDetailVo)detlList.get(i);
            vo._xStreamDec();	 
        }
    }


}
