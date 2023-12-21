package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "휴가사용내역(팝업) Vo")
public class CgslappPsnViewVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CgslappPsnViewVo(){
    }

    @ElDtoField(logicalName = "휴가원 개인정보", physicalName = "humVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ccs.cgs.vo.CgslappHumVo humVo;

    @ElDtoField(logicalName = "휴가사용내역", physicalName = "holiList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgslappHoliVo> holiList;

    @ElDtoField(logicalName = "휴가 공제내역", physicalName = "dedctList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgslappDedctVo> dedctList;

    @ElDtoField(logicalName = "보상휴가 적립내역", physicalName = "rewrdList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgslappCreComVo> rewrdList;

    @ElDtoField(logicalName = "연차현황", physicalName = "lappInfoVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ccs.cgs.vo.CgslappInfoVo lappInfoVo;

    @ElVoField(physicalName = "humVo")
    public kr.re.kitech.biz.ccs.cgs.vo.CgslappHumVo getHumVo(){
        return humVo;
    }

    @ElVoField(physicalName = "humVo")
    public void setHumVo(kr.re.kitech.biz.ccs.cgs.vo.CgslappHumVo humVo){
        this.humVo = humVo;
    }

    @ElVoField(physicalName = "holiList")
    public java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgslappHoliVo> getHoliList(){
        return holiList;
    }

    @ElVoField(physicalName = "holiList")
    public void setHoliList(java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgslappHoliVo> holiList){
        this.holiList = holiList;
    }

    @ElVoField(physicalName = "dedctList")
    public java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgslappDedctVo> getDedctList(){
        return dedctList;
    }

    @ElVoField(physicalName = "dedctList")
    public void setDedctList(java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgslappDedctVo> dedctList){
        this.dedctList = dedctList;
    }

    @ElVoField(physicalName = "rewrdList")
    public java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgslappCreComVo> getRewrdList(){
        return rewrdList;
    }

    @ElVoField(physicalName = "rewrdList")
    public void setRewrdList(java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgslappCreComVo> rewrdList){
        this.rewrdList = rewrdList;
    }

    @ElVoField(physicalName = "lappInfoVo")
    public kr.re.kitech.biz.ccs.cgs.vo.CgslappInfoVo getLappInfoVo(){
        return lappInfoVo;
    }

    @ElVoField(physicalName = "lappInfoVo")
    public void setLappInfoVo(kr.re.kitech.biz.ccs.cgs.vo.CgslappInfoVo lappInfoVo){
        this.lappInfoVo = lappInfoVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CgslappPsnViewVo [");
        sb.append("humVo").append("=").append(humVo).append(",");
        sb.append("holiList").append("=").append(holiList).append(",");
        sb.append("dedctList").append("=").append(dedctList).append(",");
        sb.append("rewrdList").append("=").append(rewrdList).append(",");
        sb.append("lappInfoVo").append("=").append(lappInfoVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.humVo != null ) this.humVo._xStreamEnc();
        for( int i=0 ; holiList != null && i < holiList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cgs.vo.CgslappHoliVo vo = (kr.re.kitech.biz.ccs.cgs.vo.CgslappHoliVo)holiList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; dedctList != null && i < dedctList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cgs.vo.CgslappDedctVo vo = (kr.re.kitech.biz.ccs.cgs.vo.CgslappDedctVo)dedctList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; rewrdList != null && i < rewrdList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cgs.vo.CgslappCreComVo vo = (kr.re.kitech.biz.ccs.cgs.vo.CgslappCreComVo)rewrdList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.lappInfoVo != null ) this.lappInfoVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        if( this.humVo != null ) this.humVo._xStreamDec();
        for( int i=0 ; holiList != null && i < holiList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cgs.vo.CgslappHoliVo vo = (kr.re.kitech.biz.ccs.cgs.vo.CgslappHoliVo)holiList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; dedctList != null && i < dedctList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cgs.vo.CgslappDedctVo vo = (kr.re.kitech.biz.ccs.cgs.vo.CgslappDedctVo)dedctList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; rewrdList != null && i < rewrdList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cgs.vo.CgslappCreComVo vo = (kr.re.kitech.biz.ccs.cgs.vo.CgslappCreComVo)rewrdList.get(i);
            vo._xStreamDec();	 
        }
        if( this.lappInfoVo != null ) this.lappInfoVo._xStreamDec();
    }


}
