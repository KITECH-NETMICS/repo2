package kr.re.kitech.biz.fin.fnd.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class FndCardSelectListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FndCardSelectListVo(){
    }

    @ElDtoField(logicalName = "List Vo", physicalName = "fndCardSelectVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.fnd.vo.FndCardSelectVo> fndCardSelectVoList;

    @ElDtoField(logicalName = "Single Vo", physicalName = "fndCardSelectVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.fnd.vo.FndCardSelectVo fndCardSelectVo;

    @ElDtoField(logicalName = "FndCardSelectExp", physicalName = "fndCardUseSelectVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.fnd.vo.FndCardUseSelectVo> fndCardUseSelectVoList;

    @ElVoField(physicalName = "fndCardSelectVoList")
    public java.util.List<kr.re.kitech.biz.fin.fnd.vo.FndCardSelectVo> getFndCardSelectVoList(){
        return fndCardSelectVoList;
    }

    @ElVoField(physicalName = "fndCardSelectVoList")
    public void setFndCardSelectVoList(java.util.List<kr.re.kitech.biz.fin.fnd.vo.FndCardSelectVo> fndCardSelectVoList){
        this.fndCardSelectVoList = fndCardSelectVoList;
    }

    @ElVoField(physicalName = "fndCardSelectVo")
    public kr.re.kitech.biz.fin.fnd.vo.FndCardSelectVo getFndCardSelectVo(){
        return fndCardSelectVo;
    }

    @ElVoField(physicalName = "fndCardSelectVo")
    public void setFndCardSelectVo(kr.re.kitech.biz.fin.fnd.vo.FndCardSelectVo fndCardSelectVo){
        this.fndCardSelectVo = fndCardSelectVo;
    }

    @ElVoField(physicalName = "fndCardUseSelectVoList")
    public java.util.List<kr.re.kitech.biz.fin.fnd.vo.FndCardUseSelectVo> getFndCardUseSelectVoList(){
        return fndCardUseSelectVoList;
    }

    @ElVoField(physicalName = "fndCardUseSelectVoList")
    public void setFndCardUseSelectVoList(java.util.List<kr.re.kitech.biz.fin.fnd.vo.FndCardUseSelectVo> fndCardUseSelectVoList){
        this.fndCardUseSelectVoList = fndCardUseSelectVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FndCardSelectListVo [");
        sb.append("fndCardSelectVoList").append("=").append(fndCardSelectVoList).append(",");
        sb.append("fndCardSelectVo").append("=").append(fndCardSelectVo).append(",");
        sb.append("fndCardUseSelectVoList").append("=").append(fndCardUseSelectVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; fndCardSelectVoList != null && i < fndCardSelectVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.fnd.vo.FndCardSelectVo vo = (kr.re.kitech.biz.fin.fnd.vo.FndCardSelectVo)fndCardSelectVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.fndCardSelectVo != null ) this.fndCardSelectVo._xStreamEnc();
        for( int i=0 ; fndCardUseSelectVoList != null && i < fndCardUseSelectVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.fnd.vo.FndCardUseSelectVo vo = (kr.re.kitech.biz.fin.fnd.vo.FndCardUseSelectVo)fndCardUseSelectVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; fndCardSelectVoList != null && i < fndCardSelectVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.fnd.vo.FndCardSelectVo vo = (kr.re.kitech.biz.fin.fnd.vo.FndCardSelectVo)fndCardSelectVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.fndCardSelectVo != null ) this.fndCardSelectVo._xStreamDec();
        for( int i=0 ; fndCardUseSelectVoList != null && i < fndCardUseSelectVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.fnd.vo.FndCardUseSelectVo vo = (kr.re.kitech.biz.fin.fnd.vo.FndCardUseSelectVo)fndCardUseSelectVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
