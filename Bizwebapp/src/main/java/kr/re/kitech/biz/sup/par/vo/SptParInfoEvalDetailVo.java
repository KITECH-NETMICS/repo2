package kr.re.kitech.biz.sup.par.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "SptParInfoEvalDetailExp")
public class SptParInfoEvalDetailVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptParInfoEvalDetailVo(){
    }

    @ElDtoField(logicalName = "파트너기업유지심사서 Vo", physicalName = "SptParInfoEvalVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.sup.par.vo.SptParInfoEvalVo SptParInfoEvalVo;
    
    @ElDtoField(logicalName = "파트너기업 Vo", physicalName = "SptParBaseVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.sup.par.vo.SptParBaseVo SptParBaseVo;

    @ElDtoField(logicalName = "파트너기업 담당자 Vo", physicalName = "SptParCustChargVoList", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.sup.par.vo.SptParCustChargVo> SptParCustChargVoList;

    @ElDtoField(logicalName = "기업지원프로그램 Vo", physicalName = "SptParCustProVoList", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.sup.par.vo.SptParCustProVo> SptParCustProVoList;

    @ElVoField(physicalName = "SptParInfoEvalVo")
    public kr.re.kitech.biz.sup.par.vo.SptParInfoEvalVo getSptParInfoEvalVo(){
        return SptParInfoEvalVo;
    }

    @ElVoField(physicalName = "SptParInfoEvalVo")
    public void setSptParInfoEvalVo(kr.re.kitech.biz.sup.par.vo.SptParInfoEvalVo SptParInfoEvalVo){
        this.SptParInfoEvalVo = SptParInfoEvalVo;
    }
    
    @ElVoField(physicalName = "SptParBaseVo")
    public kr.re.kitech.biz.sup.par.vo.SptParBaseVo getSptParBaseVo(){
    	return SptParBaseVo;
    }
    
    @ElVoField(physicalName = "SptParBaseVo")
    public void setSptParBaseVo(kr.re.kitech.biz.sup.par.vo.SptParBaseVo SptParBaseVo){
    	this.SptParBaseVo = SptParBaseVo;
    }

    @ElVoField(physicalName = "SptParCustChargVoList")
    public java.util.List<kr.re.kitech.biz.sup.par.vo.SptParCustChargVo> getSptParCustChargVoList(){
        return SptParCustChargVoList;
    }

    @ElVoField(physicalName = "SptParCustChargVoList")
    public void setSptParCustChargVoList(java.util.List<kr.re.kitech.biz.sup.par.vo.SptParCustChargVo> SptParCustChargVoList){
        this.SptParCustChargVoList = SptParCustChargVoList;
    }
    
    @ElVoField(physicalName = "SptParCustProVoList")
    public java.util.List<kr.re.kitech.biz.sup.par.vo.SptParCustProVo> getSptParCustProVoList(){
    	return SptParCustProVoList;
    }
    
    @ElVoField(physicalName = "SptParCustProVoList")
    public void setSptParCustProVoList(java.util.List<kr.re.kitech.biz.sup.par.vo.SptParCustProVo> SptParCustProVoList){
    	this.SptParCustProVoList = SptParCustProVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptParInfoEvalDetailVo [");
        sb.append("SptParInfoEvalVo").append("=").append(SptParInfoEvalVo).append(",");
        sb.append("SptParBaseVo").append("=").append(SptParBaseVo).append(",");
        sb.append("SptParCustChargVoList").append("=").append(SptParCustChargVoList).append(",");
        sb.append("SptParCustProVoList").append("=").append(SptParCustProVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.SptParInfoEvalVo != null ) this.SptParInfoEvalVo._xStreamEnc();
        if( this.SptParBaseVo != null ) this.SptParBaseVo._xStreamEnc();
        for( int i=0 ; SptParCustChargVoList != null && i < SptParCustChargVoList.size() ; i++ ) {
            kr.re.kitech.biz.sup.par.vo.SptParCustChargVo vo = (kr.re.kitech.biz.sup.par.vo.SptParCustChargVo)SptParCustChargVoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; SptParCustProVoList != null && i < SptParCustProVoList.size() ; i++ ) {
        	kr.re.kitech.biz.sup.par.vo.SptParCustProVo vo = (kr.re.kitech.biz.sup.par.vo.SptParCustProVo)SptParCustProVoList.get(i);
        	vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.SptParInfoEvalVo != null ) this.SptParInfoEvalVo._xStreamDec();
        if( this.SptParBaseVo != null ) this.SptParBaseVo._xStreamDec();
        for( int i=0 ; SptParCustChargVoList != null && i < SptParCustChargVoList.size() ; i++ ) {
            kr.re.kitech.biz.sup.par.vo.SptParCustChargVo vo = (kr.re.kitech.biz.sup.par.vo.SptParCustChargVo)SptParCustChargVoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; SptParCustProVoList != null && i < SptParCustProVoList.size() ; i++ ) {
        	kr.re.kitech.biz.sup.par.vo.SptParCustProVo vo = (kr.re.kitech.biz.sup.par.vo.SptParCustProVo)SptParCustProVoList.get(i);
        	vo._xStreamDec();	 
        }
    }


}
