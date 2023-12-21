package kr.re.kitech.biz.ccs.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "출장신청번호 검색팝업 리스트 Vo")
public class CtrTripPopListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CtrTripPopListVo(){
    }

    @ElDtoField(logicalName = "출장신청번호 검색 Vo", physicalName = "gridList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.pop.vo.CtrTripPopVo> gridList;

    @ElVoField(physicalName = "gridList")
    public java.util.List<kr.re.kitech.biz.ccs.pop.vo.CtrTripPopVo> getGridList(){
        return gridList;
    }

    @ElVoField(physicalName = "gridList")
    public void setGridList(java.util.List<kr.re.kitech.biz.ccs.pop.vo.CtrTripPopVo> gridList){
        this.gridList = gridList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrTripPopListVo [");
        sb.append("gridList").append("=").append(gridList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; gridList != null && i < gridList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.pop.vo.CtrTripPopVo vo = (kr.re.kitech.biz.ccs.pop.vo.CtrTripPopVo)gridList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; gridList != null && i < gridList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.pop.vo.CtrTripPopVo vo = (kr.re.kitech.biz.ccs.pop.vo.CtrTripPopVo)gridList.get(i);
            vo._xStreamDec();	 
        }
    }


}
