package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "항공마일리지 정보 Vo")
public class CtrAirMileInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CtrAirMileInfoVo(){
    }

    @ElDtoField(logicalName = "항공마일리지 Vo", physicalName = "airMileUseList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.pop.vo.CtrAirMileUseVo> airMileUseList;

    @ElDtoField(logicalName = "항공마일리지 출장정보 Vo", physicalName = "tripVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ccs.pop.vo.CtrAirMileTripVo tripVo;

    @ElVoField(physicalName = "airMileUseList")
    public java.util.List<kr.re.kitech.biz.ccs.pop.vo.CtrAirMileUseVo> getAirMileUseList(){
        return airMileUseList;
    }

    @ElVoField(physicalName = "airMileUseList")
    public void setAirMileUseList(java.util.List<kr.re.kitech.biz.ccs.pop.vo.CtrAirMileUseVo> airMileUseList){
        this.airMileUseList = airMileUseList;
    }

    @ElVoField(physicalName = "tripVo")
    public kr.re.kitech.biz.ccs.pop.vo.CtrAirMileTripVo getTripVo(){
        return tripVo;
    }

    @ElVoField(physicalName = "tripVo")
    public void setTripVo(kr.re.kitech.biz.ccs.pop.vo.CtrAirMileTripVo tripVo){
        this.tripVo = tripVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrAirMileInfoVo [");
        sb.append("airMileUseList").append("=").append(airMileUseList).append(",");
        sb.append("tripVo").append("=").append(tripVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; airMileUseList != null && i < airMileUseList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.pop.vo.CtrAirMileUseVo vo = (kr.re.kitech.biz.ccs.pop.vo.CtrAirMileUseVo)airMileUseList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.tripVo != null ) this.tripVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; airMileUseList != null && i < airMileUseList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.pop.vo.CtrAirMileUseVo vo = (kr.re.kitech.biz.ccs.pop.vo.CtrAirMileUseVo)airMileUseList.get(i);
            vo._xStreamDec();	 
        }
        if( this.tripVo != null ) this.tripVo._xStreamDec();
    }


}
