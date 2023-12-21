package kr.re.kitech.biz.sup.tec.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "미수수탁 반제신청 Vo")
public class SptTecRepayReqInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptTecRepayReqInfoVo(){
    }

    @ElDtoField(logicalName = "입금의뢰 Vo", physicalName = "depstList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo> depstList;

    @ElDtoField(logicalName = "미수수탁청구정보 Vo", physicalName = "demndVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.sup.tec.vo.SptFtxBillHVo demndVo;

    @ElVoField(physicalName = "depstList")
    public java.util.List<kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo> getDepstList(){
        return depstList;
    }

    @ElVoField(physicalName = "depstList")
    public void setDepstList(java.util.List<kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo> depstList){
        this.depstList = depstList;
    }

    @ElVoField(physicalName = "demndVo")
    public kr.re.kitech.biz.sup.tec.vo.SptFtxBillHVo getDemndVo(){
        return demndVo;
    }

    @ElVoField(physicalName = "demndVo")
    public void setDemndVo(kr.re.kitech.biz.sup.tec.vo.SptFtxBillHVo demndVo){
        this.demndVo = demndVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptTecRepayReqInfoVo [");
        sb.append("depstList").append("=").append(depstList).append(",");
        sb.append("demndVo").append("=").append(demndVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; depstList != null && i < depstList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo vo = (kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo)depstList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.demndVo != null ) this.demndVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; depstList != null && i < depstList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo vo = (kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo)depstList.get(i);
            vo._xStreamDec();	 
        }
        if( this.demndVo != null ) this.demndVo._xStreamDec();
    }


}
