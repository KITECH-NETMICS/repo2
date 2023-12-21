package kr.re.kitech.biz.fin.fnd.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class FspSlipHMerListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspSlipHMerListVo(){
    }

    @ElDtoField(logicalName = "List Vo", physicalName = "fspSlipHMerVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.fnd.vo.FspSlipHMerVo> fspSlipHMerVoList;

    @ElDtoField(logicalName = "Single Vo", physicalName = "fspSlipHMerVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.fnd.vo.FspSlipHMerVo fspSlipHMerVo;

    @ElDtoField(logicalName = "출금결의내역 조회", physicalName = "fspSlipHVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.fnd.vo.FspSlipHVo> fspSlipHVoList;

    @ElVoField(physicalName = "fspSlipHMerVoList")
    public java.util.List<kr.re.kitech.biz.fin.fnd.vo.FspSlipHMerVo> getFspSlipHMerVoList(){
        return fspSlipHMerVoList;
    }

    @ElVoField(physicalName = "fspSlipHMerVoList")
    public void setFspSlipHMerVoList(java.util.List<kr.re.kitech.biz.fin.fnd.vo.FspSlipHMerVo> fspSlipHMerVoList){
        this.fspSlipHMerVoList = fspSlipHMerVoList;
    }

    @ElVoField(physicalName = "fspSlipHMerVo")
    public kr.re.kitech.biz.fin.fnd.vo.FspSlipHMerVo getFspSlipHMerVo(){
        return fspSlipHMerVo;
    }

    @ElVoField(physicalName = "fspSlipHMerVo")
    public void setFspSlipHMerVo(kr.re.kitech.biz.fin.fnd.vo.FspSlipHMerVo fspSlipHMerVo){
        this.fspSlipHMerVo = fspSlipHMerVo;
    }

    @ElVoField(physicalName = "fspSlipHVoList")
    public java.util.List<kr.re.kitech.biz.fin.fnd.vo.FspSlipHVo> getFspSlipHVoList(){
        return fspSlipHVoList;
    }

    @ElVoField(physicalName = "fspSlipHVoList")
    public void setFspSlipHVoList(java.util.List<kr.re.kitech.biz.fin.fnd.vo.FspSlipHVo> fspSlipHVoList){
        this.fspSlipHVoList = fspSlipHVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspSlipHMerListVo [");
        sb.append("fspSlipHMerVoList").append("=").append(fspSlipHMerVoList).append(",");
        sb.append("fspSlipHMerVo").append("=").append(fspSlipHMerVo).append(",");
        sb.append("fspSlipHVoList").append("=").append(fspSlipHVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; fspSlipHMerVoList != null && i < fspSlipHMerVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.fnd.vo.FspSlipHMerVo vo = (kr.re.kitech.biz.fin.fnd.vo.FspSlipHMerVo)fspSlipHMerVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.fspSlipHMerVo != null ) this.fspSlipHMerVo._xStreamEnc();
        for( int i=0 ; fspSlipHVoList != null && i < fspSlipHVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.fnd.vo.FspSlipHVo vo = (kr.re.kitech.biz.fin.fnd.vo.FspSlipHVo)fspSlipHVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; fspSlipHMerVoList != null && i < fspSlipHMerVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.fnd.vo.FspSlipHMerVo vo = (kr.re.kitech.biz.fin.fnd.vo.FspSlipHMerVo)fspSlipHMerVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.fspSlipHMerVo != null ) this.fspSlipHMerVo._xStreamDec();
        for( int i=0 ; fspSlipHVoList != null && i < fspSlipHVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.fnd.vo.FspSlipHVo vo = (kr.re.kitech.biz.fin.fnd.vo.FspSlipHVo)fspSlipHVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
