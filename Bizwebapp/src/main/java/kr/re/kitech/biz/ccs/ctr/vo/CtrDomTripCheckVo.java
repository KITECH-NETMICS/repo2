package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "국내출장 검증 Vo")
public class CtrDomTripCheckVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CtrDomTripCheckVo(){
    }

    @ElDtoField(logicalName = "검증결과", physicalName = "rst_val", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rst_val;

    @ElDtoField(logicalName = "출장기간 중복검증 Vo", physicalName = "prdDupList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.ctr.vo.PeriodDupVo> prdDupList;

    @ElDtoField(logicalName = "국내출장 과제 미참여인원 목록 Vo", physicalName = "noJoinList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.ctr.vo.NoJoinPsnVo> noJoinList;

    @ElVoField(physicalName = "rst_val")
    public String getRst_val(){
        return rst_val;
    }

    @ElVoField(physicalName = "rst_val")
    public void setRst_val(String rst_val){
        this.rst_val = rst_val;
    }

    @ElVoField(physicalName = "prdDupList")
    public java.util.List<kr.re.kitech.biz.ccs.ctr.vo.PeriodDupVo> getPrdDupList(){
        return prdDupList;
    }

    @ElVoField(physicalName = "prdDupList")
    public void setPrdDupList(java.util.List<kr.re.kitech.biz.ccs.ctr.vo.PeriodDupVo> prdDupList){
        this.prdDupList = prdDupList;
    }

    @ElVoField(physicalName = "noJoinList")
    public java.util.List<kr.re.kitech.biz.ccs.ctr.vo.NoJoinPsnVo> getNoJoinList(){
        return noJoinList;
    }

    @ElVoField(physicalName = "noJoinList")
    public void setNoJoinList(java.util.List<kr.re.kitech.biz.ccs.ctr.vo.NoJoinPsnVo> noJoinList){
        this.noJoinList = noJoinList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrDomTripCheckVo [");
        sb.append("rst_val").append("=").append(rst_val).append(",");
        sb.append("prdDupList").append("=").append(prdDupList).append(",");
        sb.append("noJoinList").append("=").append(noJoinList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; prdDupList != null && i < prdDupList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.PeriodDupVo vo = (kr.re.kitech.biz.ccs.ctr.vo.PeriodDupVo)prdDupList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; noJoinList != null && i < noJoinList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.NoJoinPsnVo vo = (kr.re.kitech.biz.ccs.ctr.vo.NoJoinPsnVo)noJoinList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; prdDupList != null && i < prdDupList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.PeriodDupVo vo = (kr.re.kitech.biz.ccs.ctr.vo.PeriodDupVo)prdDupList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; noJoinList != null && i < noJoinList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.NoJoinPsnVo vo = (kr.re.kitech.biz.ccs.ctr.vo.NoJoinPsnVo)noJoinList.get(i);
            vo._xStreamDec();	 
        }
    }


}
