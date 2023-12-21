package kr.re.kitech.biz.fin.tax.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "기타소득 리스트 Vo")
public class FtxEtcIncomListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FtxEtcIncomListVo(){
    }

    @ElDtoField(logicalName = "ListVo", physicalName = "ftxEtcIncomVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.tax.vo.FtxEtcIncomVo> ftxEtcIncomVoList;

    @ElDtoField(logicalName = " Vo", physicalName = "ftxEtcIncomVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.tax.vo.FtxEtcIncomVo ftxEtcIncomVo;

    @ElVoField(physicalName = "ftxEtcIncomVoList")
    public java.util.List<kr.re.kitech.biz.fin.tax.vo.FtxEtcIncomVo> getFtxEtcIncomVoList(){
        return ftxEtcIncomVoList;
    }

    @ElVoField(physicalName = "ftxEtcIncomVoList")
    public void setFtxEtcIncomVoList(java.util.List<kr.re.kitech.biz.fin.tax.vo.FtxEtcIncomVo> ftxEtcIncomVoList){
        this.ftxEtcIncomVoList = ftxEtcIncomVoList;
    }

    @ElVoField(physicalName = "ftxEtcIncomVo")
    public kr.re.kitech.biz.fin.tax.vo.FtxEtcIncomVo getFtxEtcIncomVo(){
        return ftxEtcIncomVo;
    }

    @ElVoField(physicalName = "ftxEtcIncomVo")
    public void setFtxEtcIncomVo(kr.re.kitech.biz.fin.tax.vo.FtxEtcIncomVo ftxEtcIncomVo){
        this.ftxEtcIncomVo = ftxEtcIncomVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FtxEtcIncomListVo [");
        sb.append("ftxEtcIncomVoList").append("=").append(ftxEtcIncomVoList).append(",");
        sb.append("ftxEtcIncomVo").append("=").append(ftxEtcIncomVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; ftxEtcIncomVoList != null && i < ftxEtcIncomVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.tax.vo.FtxEtcIncomVo vo = (kr.re.kitech.biz.fin.tax.vo.FtxEtcIncomVo)ftxEtcIncomVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.ftxEtcIncomVo != null ) this.ftxEtcIncomVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; ftxEtcIncomVoList != null && i < ftxEtcIncomVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.tax.vo.FtxEtcIncomVo vo = (kr.re.kitech.biz.fin.tax.vo.FtxEtcIncomVo)ftxEtcIncomVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.ftxEtcIncomVo != null ) this.ftxEtcIncomVo._xStreamDec();
    }


}
