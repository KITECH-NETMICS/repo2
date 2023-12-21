package kr.re.kitech.biz.fin.rcms.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "SaveBeitpaListVo")
public class SaveBeitpaListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SaveBeitpaListVo(){
    }

    @ElDtoField(logicalName = "List Vo", physicalName = "SaveBeitpaVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.rcms.vo.SaveBeitpaVo> SaveBeitpaVoList;

    @ElDtoField(logicalName = "Single Vo", physicalName = "SaveBeitpaVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.rcms.vo.SaveBeitpaVo SaveBeitpaVo;

    @ElVoField(physicalName = "SaveBeitpaVoList")
    public java.util.List<kr.re.kitech.biz.fin.rcms.vo.SaveBeitpaVo> getSaveBeitpaVoList(){
        return SaveBeitpaVoList;
    }

    @ElVoField(physicalName = "SaveBeitpaVoList")
    public void setSaveBeitpaVoList(java.util.List<kr.re.kitech.biz.fin.rcms.vo.SaveBeitpaVo> SaveBeitpaVoList){
        this.SaveBeitpaVoList = SaveBeitpaVoList;
    }

    @ElVoField(physicalName = "SaveBeitpaVo")
    public kr.re.kitech.biz.fin.rcms.vo.SaveBeitpaVo getSaveBeitpaVo(){
        return SaveBeitpaVo;
    }

    @ElVoField(physicalName = "SaveBeitpaVo")
    public void setSaveBeitpaVo(kr.re.kitech.biz.fin.rcms.vo.SaveBeitpaVo SaveBeitpaVo){
        this.SaveBeitpaVo = SaveBeitpaVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SaveBeitpaListVo [");
        sb.append("SaveBeitpaVoList").append("=").append(SaveBeitpaVoList).append(",");
        sb.append("SaveBeitpaVo").append("=").append(SaveBeitpaVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; SaveBeitpaVoList != null && i < SaveBeitpaVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.rcms.vo.SaveBeitpaVo vo = (kr.re.kitech.biz.fin.rcms.vo.SaveBeitpaVo)SaveBeitpaVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.SaveBeitpaVo != null ) this.SaveBeitpaVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; SaveBeitpaVoList != null && i < SaveBeitpaVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.rcms.vo.SaveBeitpaVo vo = (kr.re.kitech.biz.fin.rcms.vo.SaveBeitpaVo)SaveBeitpaVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.SaveBeitpaVo != null ) this.SaveBeitpaVo._xStreamDec();
    }


}
