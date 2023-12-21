package kr.re.kitech.biz.fin.tax.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "인수자산 수익관리 상세목록 List Vo")
public class FinAcqAsetPlanVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FinAcqAsetPlanVo(){
    }

    @ElDtoField(logicalName = "인수자산 계획마스터리스트 Vo", physicalName = "finAcqAsetPlanMstrListVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.tax.vo.FinAcqAsetPlanMstrVo> finAcqAsetPlanMstrListVo;

    @ElDtoField(logicalName = "인수자산 계획디테일리스트 Vo", physicalName = "finAcqAsetPlanDtlListVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.tax.vo.FinAcqAsetPlanDtlVo> finAcqAsetPlanDtlListVo;

    @ElDtoField(logicalName = "인수자산 계획마스터 Vo", physicalName = "finAcqAsetPlanMstrVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.tax.vo.FinAcqAsetPlanMstrVo finAcqAsetPlanMstrVo;

    @ElDtoField(logicalName = "인수자산 계획디테일 Vo", physicalName = "finAcqAsetPlanDtlVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.tax.vo.FinAcqAsetPlanDtlVo finAcqAsetPlanDtlVo;

    @ElVoField(physicalName = "finAcqAsetPlanMstrListVo")
    public java.util.List<kr.re.kitech.biz.fin.tax.vo.FinAcqAsetPlanMstrVo> getFinAcqAsetPlanMstrListVo(){
        return finAcqAsetPlanMstrListVo;
    }

    @ElVoField(physicalName = "finAcqAsetPlanMstrListVo")
    public void setFinAcqAsetPlanMstrListVo(java.util.List<kr.re.kitech.biz.fin.tax.vo.FinAcqAsetPlanMstrVo> finAcqAsetPlanMstrListVo){
        this.finAcqAsetPlanMstrListVo = finAcqAsetPlanMstrListVo;
    }

    @ElVoField(physicalName = "finAcqAsetPlanDtlListVo")
    public java.util.List<kr.re.kitech.biz.fin.tax.vo.FinAcqAsetPlanDtlVo> getFinAcqAsetPlanDtlListVo(){
        return finAcqAsetPlanDtlListVo;
    }

    @ElVoField(physicalName = "finAcqAsetPlanDtlListVo")
    public void setFinAcqAsetPlanDtlListVo(java.util.List<kr.re.kitech.biz.fin.tax.vo.FinAcqAsetPlanDtlVo> finAcqAsetPlanDtlListVo){
        this.finAcqAsetPlanDtlListVo = finAcqAsetPlanDtlListVo;
    }

    @ElVoField(physicalName = "finAcqAsetPlanMstrVo")
    public kr.re.kitech.biz.fin.tax.vo.FinAcqAsetPlanMstrVo getFinAcqAsetPlanMstrVo(){
        return finAcqAsetPlanMstrVo;
    }

    @ElVoField(physicalName = "finAcqAsetPlanMstrVo")
    public void setFinAcqAsetPlanMstrVo(kr.re.kitech.biz.fin.tax.vo.FinAcqAsetPlanMstrVo finAcqAsetPlanMstrVo){
        this.finAcqAsetPlanMstrVo = finAcqAsetPlanMstrVo;
    }

    @ElVoField(physicalName = "finAcqAsetPlanDtlVo")
    public kr.re.kitech.biz.fin.tax.vo.FinAcqAsetPlanDtlVo getFinAcqAsetPlanDtlVo(){
        return finAcqAsetPlanDtlVo;
    }

    @ElVoField(physicalName = "finAcqAsetPlanDtlVo")
    public void setFinAcqAsetPlanDtlVo(kr.re.kitech.biz.fin.tax.vo.FinAcqAsetPlanDtlVo finAcqAsetPlanDtlVo){
        this.finAcqAsetPlanDtlVo = finAcqAsetPlanDtlVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinAcqAsetPlanMstrListVo [");
        sb.append("finAcqAsetPlanMstrListVo").append("=").append(finAcqAsetPlanMstrListVo).append(",");
        sb.append("finAcqAsetPlanDtlListVo").append("=").append(finAcqAsetPlanDtlListVo).append(",");
        sb.append("finAcqAsetPlanMstrVo").append("=").append(finAcqAsetPlanMstrVo).append(",");
        sb.append("finAcqAsetPlanDtlVo").append("=").append(finAcqAsetPlanDtlVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; finAcqAsetPlanMstrListVo != null && i < finAcqAsetPlanMstrListVo.size() ; i++ ) {
            kr.re.kitech.biz.fin.tax.vo.FinAcqAsetPlanMstrVo vo = (kr.re.kitech.biz.fin.tax.vo.FinAcqAsetPlanMstrVo)finAcqAsetPlanMstrListVo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; finAcqAsetPlanDtlListVo != null && i < finAcqAsetPlanDtlListVo.size() ; i++ ) {
            kr.re.kitech.biz.fin.tax.vo.FinAcqAsetPlanDtlVo vo = (kr.re.kitech.biz.fin.tax.vo.FinAcqAsetPlanDtlVo)finAcqAsetPlanDtlListVo.get(i);
            vo._xStreamEnc();	 
        }
        if( this.finAcqAsetPlanMstrVo != null ) this.finAcqAsetPlanMstrVo._xStreamEnc();
        if( this.finAcqAsetPlanDtlVo != null ) this.finAcqAsetPlanDtlVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; finAcqAsetPlanMstrListVo != null && i < finAcqAsetPlanMstrListVo.size() ; i++ ) {
            kr.re.kitech.biz.fin.tax.vo.FinAcqAsetPlanMstrVo vo = (kr.re.kitech.biz.fin.tax.vo.FinAcqAsetPlanMstrVo)finAcqAsetPlanMstrListVo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; finAcqAsetPlanDtlListVo != null && i < finAcqAsetPlanDtlListVo.size() ; i++ ) {
            kr.re.kitech.biz.fin.tax.vo.FinAcqAsetPlanDtlVo vo = (kr.re.kitech.biz.fin.tax.vo.FinAcqAsetPlanDtlVo)finAcqAsetPlanDtlListVo.get(i);
            vo._xStreamDec();	 
        }
        if( this.finAcqAsetPlanMstrVo != null ) this.finAcqAsetPlanMstrVo._xStreamDec();
        if( this.finAcqAsetPlanDtlVo != null ) this.finAcqAsetPlanDtlVo._xStreamDec();
    }


}
