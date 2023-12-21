package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "계정번호마스터")
public class PrjNoInfPopupListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PrjNoInfPopupListVo(){
    }

    @ElDtoField(logicalName = "과제번호마스터", physicalName = "prjNoInfPopupVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.com.vo.ResInpPacoVo> prjNoInfPopupVoList;

    @ElVoField(physicalName = "prjNoInfPopupVoList")
    public java.util.List<kr.re.kitech.biz.com.vo.ResInpPacoVo> getPrjNoInfPopupVoList(){
        return prjNoInfPopupVoList;
    }

    @ElVoField(physicalName = "prjNoInfPopupVoList")
    public void setPrjNoInfPopupVoList(java.util.List<kr.re.kitech.biz.com.vo.ResInpPacoVo> prjNoInfPopupVoList){
        this.prjNoInfPopupVoList = prjNoInfPopupVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrjNoInfPopupListVo [");
        sb.append("prjNoInfPopupVoList").append("=").append(prjNoInfPopupVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; prjNoInfPopupVoList != null && i < prjNoInfPopupVoList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.ResInpPacoVo vo = (kr.re.kitech.biz.com.vo.ResInpPacoVo)prjNoInfPopupVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; prjNoInfPopupVoList != null && i < prjNoInfPopupVoList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.ResInpPacoVo vo = (kr.re.kitech.biz.com.vo.ResInpPacoVo)prjNoInfPopupVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
