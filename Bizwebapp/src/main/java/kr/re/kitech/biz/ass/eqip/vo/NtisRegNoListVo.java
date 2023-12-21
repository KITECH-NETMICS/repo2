package kr.re.kitech.biz.ass.eqip.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "제우스장비 List Vo")
public class NtisRegNoListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public NtisRegNoListVo(){
    }

    @ElDtoField(logicalName = "제우스장비 Vo", physicalName = "equipList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ass.eqip.vo.NtisRegNoVo> equipList;

    @ElVoField(physicalName = "equipList")
    public java.util.List<kr.re.kitech.biz.ass.eqip.vo.NtisRegNoVo> getEquipList(){
        return equipList;
    }

    @ElVoField(physicalName = "equipList")
    public void setEquipList(java.util.List<kr.re.kitech.biz.ass.eqip.vo.NtisRegNoVo> equipList){
        this.equipList = equipList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NtisReqNoListVo [");
        sb.append("equipList").append("=").append(equipList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; equipList != null && i < equipList.size() ; i++ ) {
            kr.re.kitech.biz.ass.eqip.vo.NtisRegNoVo vo = (kr.re.kitech.biz.ass.eqip.vo.NtisRegNoVo)equipList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; equipList != null && i < equipList.size() ; i++ ) {
            kr.re.kitech.biz.ass.eqip.vo.NtisRegNoVo vo = (kr.re.kitech.biz.ass.eqip.vo.NtisRegNoVo)equipList.get(i);
            vo._xStreamDec();	 
        }
    }


}
