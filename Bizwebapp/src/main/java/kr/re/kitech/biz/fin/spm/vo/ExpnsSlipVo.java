package kr.re.kitech.biz.fin.spm.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "카드결의상세 조회 Vo")
public class ExpnsSlipVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ExpnsSlipVo(){
    }

    @ElDtoField(logicalName = "결의서헤더VO", physicalName = "slipHVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.com.vo.FspSlipHVo slipHVo;

    @ElDtoField(logicalName = "결의서디테일VO", physicalName = "slipDList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.com.vo.FspSlipDVo> slipDList;

    @ElDtoField(logicalName = "증빙사용합계Vo", physicalName = "evidSumVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.spm.vo.ExpnsAmtSummryVo evidSumVo;

    @ElVoField(physicalName = "slipHVo")
    public kr.re.kitech.biz.fin.com.vo.FspSlipHVo getSlipHVo(){
        return slipHVo;
    }

    @ElVoField(physicalName = "slipHVo")
    public void setSlipHVo(kr.re.kitech.biz.fin.com.vo.FspSlipHVo slipHVo){
        this.slipHVo = slipHVo;
    }

    @ElVoField(physicalName = "slipDList")
    public java.util.List<kr.re.kitech.biz.fin.com.vo.FspSlipDVo> getSlipDList(){
        return slipDList;
    }

    @ElVoField(physicalName = "slipDList")
    public void setSlipDList(java.util.List<kr.re.kitech.biz.fin.com.vo.FspSlipDVo> slipDList){
        this.slipDList = slipDList;
    }

    @ElVoField(physicalName = "evidSumVo")
    public kr.re.kitech.biz.fin.spm.vo.ExpnsAmtSummryVo getEvidSumVo(){
        return evidSumVo;
    }

    @ElVoField(physicalName = "evidSumVo")
    public void setEvidSumVo(kr.re.kitech.biz.fin.spm.vo.ExpnsAmtSummryVo evidSumVo){
        this.evidSumVo = evidSumVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExpnsSlipVo [");
        sb.append("slipHVo").append("=").append(slipHVo).append(",");
        sb.append("slipDList").append("=").append(slipDList).append(",");
        sb.append("evidSumVo").append("=").append(evidSumVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.slipHVo != null ) this.slipHVo._xStreamEnc();
        for( int i=0 ; slipDList != null && i < slipDList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FspSlipDVo vo = (kr.re.kitech.biz.fin.com.vo.FspSlipDVo)slipDList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.evidSumVo != null ) this.evidSumVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        if( this.slipHVo != null ) this.slipHVo._xStreamDec();
        for( int i=0 ; slipDList != null && i < slipDList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FspSlipDVo vo = (kr.re.kitech.biz.fin.com.vo.FspSlipDVo)slipDList.get(i);
            vo._xStreamDec();	 
        }
        if( this.evidSumVo != null ) this.evidSumVo._xStreamDec();
    }


}
