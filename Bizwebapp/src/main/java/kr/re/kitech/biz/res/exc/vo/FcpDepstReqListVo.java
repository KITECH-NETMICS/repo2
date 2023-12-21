package kr.re.kitech.biz.res.exc.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "연구비반제신청 리스트 Vo")
public class FcpDepstReqListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FcpDepstReqListVo(){
    }

    @ElDtoField(logicalName = "입금의뢰 Vo", physicalName = "depstList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo> depstList;

    @ElVoField(physicalName = "depstList")
    public java.util.List<kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo> getDepstList(){
        return depstList;
    }

    @ElVoField(physicalName = "depstList")
    public void setDepstList(java.util.List<kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo> depstList){
        this.depstList = depstList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FcpDepstReqListVo [");
        sb.append("depstList").append("=").append(depstList);
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
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; depstList != null && i < depstList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo vo = (kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo)depstList.get(i);
            vo._xStreamDec();	 
        }
    }


}
