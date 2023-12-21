package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "계정번호마스터")
public class AccntNoPopupListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AccntNoPopupListVo(){
    }

    @ElDtoField(logicalName = "계정번호마스터List", physicalName = "accntNoPopupVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.com.vo.AccntNoPopupVo> accntNoPopupVoList;

    @ElVoField(physicalName = "accntNoPopupVoList")
    public java.util.List<kr.re.kitech.biz.com.vo.AccntNoPopupVo> getAccntNoPopupVoList(){
        return accntNoPopupVoList;
    }

    @ElVoField(physicalName = "accntNoPopupVoList")
    public void setAccntNoPopupVoList(java.util.List<kr.re.kitech.biz.com.vo.AccntNoPopupVo> accntNoPopupVoList){
        this.accntNoPopupVoList = accntNoPopupVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccntNoPopupListVo [");
        sb.append("accntNoPopupVoList").append("=").append(accntNoPopupVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; accntNoPopupVoList != null && i < accntNoPopupVoList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.AccntNoPopupVo vo = (kr.re.kitech.biz.com.vo.AccntNoPopupVo)accntNoPopupVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; accntNoPopupVoList != null && i < accntNoPopupVoList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.AccntNoPopupVo vo = (kr.re.kitech.biz.com.vo.AccntNoPopupVo)accntNoPopupVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
