package kr.re.kitech.biz.hum.apy.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "퇴직신청")
public class HumApySvrSaveVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumApySvrSaveVo(){
    }

    @ElDtoField(logicalName = "퇴직신청", physicalName = "humApySvrVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private kr.re.kitech.biz.hum.apy.vo.HumApySvrVo humApySvrVo;

    @ElDtoField(logicalName = "부서체크리스", physicalName = "humApyDeptChkVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyDeptChkVo> humApyDeptChkVoList;

    @ElVoField(physicalName = "humApySvrVo")
    public kr.re.kitech.biz.hum.apy.vo.HumApySvrVo getHumApySvrVo(){
        return humApySvrVo;
    }

    @ElVoField(physicalName = "humApySvrVo")
    public void setHumApySvrVo(kr.re.kitech.biz.hum.apy.vo.HumApySvrVo humApySvrVo){
        this.humApySvrVo = humApySvrVo;
    }

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
        sb.append("HumApySvrSaveVo [");
        sb.append("humApySvrVo").append("=").append(humApySvrVo).append(",");
        sb.append("humApyDeptChkVoList").append("=").append(humApyDeptChkVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.humApySvrVo != null ) this.humApySvrVo._xStreamEnc();
        for( int i=0 ; humApyDeptChkVoList != null && i < humApyDeptChkVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.apy.vo.HumApyDeptChkVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyDeptChkVo)humApyDeptChkVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.humApySvrVo != null ) this.humApySvrVo._xStreamDec();
        for( int i=0 ; humApyDeptChkVoList != null && i < humApyDeptChkVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.apy.vo.HumApyDeptChkVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyDeptChkVo)humApyDeptChkVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
