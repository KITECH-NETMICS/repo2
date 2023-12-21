package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "휴일근무내역 및 대체휴일가능일 Vo")
public class DayOffInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public DayOffInfoVo(){
    }

    @ElDtoField(logicalName = "휴무일내역 Vo", physicalName = "offList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrBizTripRstVo> offList;

    @ElDtoField(logicalName = "날짜 Vo", physicalName = "dtList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.com.vo.XomDtMstVo> dtList;

    @ElVoField(physicalName = "offList")
    public java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrBizTripRstVo> getOffList(){
        return offList;
    }

    @ElVoField(physicalName = "offList")
    public void setOffList(java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrBizTripRstVo> offList){
        this.offList = offList;
    }

    @ElVoField(physicalName = "dtList")
    public java.util.List<kr.re.kitech.biz.com.vo.XomDtMstVo> getDtList(){
        return dtList;
    }

    @ElVoField(physicalName = "dtList")
    public void setDtList(java.util.List<kr.re.kitech.biz.com.vo.XomDtMstVo> dtList){
        this.dtList = dtList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DayOffInfoVo [");
        sb.append("offList").append("=").append(offList).append(",");
        sb.append("dtList").append("=").append(dtList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; offList != null && i < offList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrBizTripRstVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrBizTripRstVo)offList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; dtList != null && i < dtList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.XomDtMstVo vo = (kr.re.kitech.biz.com.vo.XomDtMstVo)dtList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; offList != null && i < offList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrBizTripRstVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrBizTripRstVo)offList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; dtList != null && i < dtList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.XomDtMstVo vo = (kr.re.kitech.biz.com.vo.XomDtMstVo)dtList.get(i);
            vo._xStreamDec();	 
        }
    }


}
