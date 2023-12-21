package kr.re.kitech.biz.sup.tec.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "기술지원 입금의뢰 Vo")
public class SptTecDepstInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptTecDepstInfoVo(){
    }

    @ElDtoField(logicalName = "입금의뢰 Vo", physicalName = "depstVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo depstVo;

    @ElDtoField(logicalName = "기술지원입금의뢰목록 Vo", physicalName = "rcptList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.sup.tec.vo.SptTecDepstVo> rcptList;

    @ElVoField(physicalName = "depstVo")
    public kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo getDepstVo(){
        return depstVo;
    }

    @ElVoField(physicalName = "depstVo")
    public void setDepstVo(kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo depstVo){
        this.depstVo = depstVo;
    }

    @ElVoField(physicalName = "rcptList")
    public java.util.List<kr.re.kitech.biz.sup.tec.vo.SptTecDepstVo> getRcptList(){
        return rcptList;
    }

    @ElVoField(physicalName = "rcptList")
    public void setRcptList(java.util.List<kr.re.kitech.biz.sup.tec.vo.SptTecDepstVo> rcptList){
        this.rcptList = rcptList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptTecDepstInfoVo [");
        sb.append("depstVo").append("=").append(depstVo).append(",");
        sb.append("rcptList").append("=").append(rcptList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.depstVo != null ) this.depstVo._xStreamEnc();
        for( int i=0 ; rcptList != null && i < rcptList.size() ; i++ ) {
            kr.re.kitech.biz.sup.tec.vo.SptTecDepstVo vo = (kr.re.kitech.biz.sup.tec.vo.SptTecDepstVo)rcptList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.depstVo != null ) this.depstVo._xStreamDec();
        for( int i=0 ; rcptList != null && i < rcptList.size() ; i++ ) {
            kr.re.kitech.biz.sup.tec.vo.SptTecDepstVo vo = (kr.re.kitech.biz.sup.tec.vo.SptTecDepstVo)rcptList.get(i);
            vo._xStreamDec();	 
        }
    }


}
