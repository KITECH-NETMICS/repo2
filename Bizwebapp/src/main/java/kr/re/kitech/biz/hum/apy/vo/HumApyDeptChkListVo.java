package kr.re.kitech.biz.hum.apy.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "퇴직신청")
public class HumApyDeptChkListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumApyDeptChkListVo(){
    }

    @ElDtoField(logicalName = "퇴직신청", physicalName = "humApyDeptChkVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyDeptChkVo> humApyDeptChkVoList;

    @ElVoField(physicalName = "humApyDeptChkVoList")
    public java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyDeptChkVo> getHumApyDeptChkVoList(){
        return humApyDeptChkVoList;
    }

    @ElVoField(physicalName = "humApyDeptChkVoList")
    public void setHumApyDeptChkVoList(java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyDeptChkVo> humApyDeptChkVoList){
        this.humApyDeptChkVoList = humApyDeptChkVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumApyDeptChkListVo [");
        sb.append("humApyDeptChkVoList").append("=").append(humApyDeptChkVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; humApyDeptChkVoList != null && i < humApyDeptChkVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.apy.vo.HumApyDeptChkVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyDeptChkVo)humApyDeptChkVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; humApyDeptChkVoList != null && i < humApyDeptChkVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.apy.vo.HumApyDeptChkVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyDeptChkVo)humApyDeptChkVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
