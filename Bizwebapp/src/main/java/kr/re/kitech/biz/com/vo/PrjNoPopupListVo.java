package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "계정번호마스터")
public class PrjNoPopupListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PrjNoPopupListVo(){
    }

    @ElDtoField(logicalName = "연구기자재", physicalName = "mateList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.com.vo.ResinpmateVo> mateList;

    @ElDtoField(logicalName = "연차과제리스트", physicalName = "inpYearList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.com.vo.PrjNoInpYearVo> inpYearList;

    @ElDtoField(logicalName = "과제 참여업체 Vo", physicalName = "pacoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.com.vo.ResInpPacoVo> pacoList;

    @ElDtoField(logicalName = "참여연구원 Vo", physicalName = "pareList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.com.vo.ResInpPareVo> pareList;

    @ElDtoField(logicalName = "메인과제마스터", physicalName = "mainVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.com.vo.ResMainAccntVo mainVo;

    @ElVoField(physicalName = "mateList")
    public java.util.List<kr.re.kitech.biz.com.vo.ResinpmateVo> getMateList(){
        return mateList;
    }

    @ElVoField(physicalName = "mateList")
    public void setMateList(java.util.List<kr.re.kitech.biz.com.vo.ResinpmateVo> mateList){
        this.mateList = mateList;
    }

    @ElVoField(physicalName = "inpYearList")
    public java.util.List<kr.re.kitech.biz.com.vo.PrjNoInpYearVo> getInpYearList(){
        return inpYearList;
    }

    @ElVoField(physicalName = "inpYearList")
    public void setInpYearList(java.util.List<kr.re.kitech.biz.com.vo.PrjNoInpYearVo> inpYearList){
        this.inpYearList = inpYearList;
    }

    @ElVoField(physicalName = "pacoList")
    public java.util.List<kr.re.kitech.biz.com.vo.ResInpPacoVo> getPacoList(){
        return pacoList;
    }

    @ElVoField(physicalName = "pacoList")
    public void setPacoList(java.util.List<kr.re.kitech.biz.com.vo.ResInpPacoVo> pacoList){
        this.pacoList = pacoList;
    }

    @ElVoField(physicalName = "pareList")
    public java.util.List<kr.re.kitech.biz.com.vo.ResInpPareVo> getPareList(){
        return pareList;
    }

    @ElVoField(physicalName = "pareList")
    public void setPareList(java.util.List<kr.re.kitech.biz.com.vo.ResInpPareVo> pareList){
        this.pareList = pareList;
    }

    @ElVoField(physicalName = "mainVo")
    public kr.re.kitech.biz.com.vo.ResMainAccntVo getMainVo(){
        return mainVo;
    }

    @ElVoField(physicalName = "mainVo")
    public void setMainVo(kr.re.kitech.biz.com.vo.ResMainAccntVo mainVo){
        this.mainVo = mainVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrjNoPopupListVo [");
        sb.append("mateList").append("=").append(mateList).append(",");
        sb.append("inpYearList").append("=").append(inpYearList).append(",");
        sb.append("pacoList").append("=").append(pacoList).append(",");
        sb.append("pareList").append("=").append(pareList).append(",");
        sb.append("mainVo").append("=").append(mainVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; mateList != null && i < mateList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.ResinpmateVo vo = (kr.re.kitech.biz.com.vo.ResinpmateVo)mateList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; inpYearList != null && i < inpYearList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.PrjNoInpYearVo vo = (kr.re.kitech.biz.com.vo.PrjNoInpYearVo)inpYearList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; pacoList != null && i < pacoList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.ResInpPacoVo vo = (kr.re.kitech.biz.com.vo.ResInpPacoVo)pacoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; pareList != null && i < pareList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.ResInpPareVo vo = (kr.re.kitech.biz.com.vo.ResInpPareVo)pareList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.mainVo != null ) this.mainVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; mateList != null && i < mateList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.ResinpmateVo vo = (kr.re.kitech.biz.com.vo.ResinpmateVo)mateList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; inpYearList != null && i < inpYearList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.PrjNoInpYearVo vo = (kr.re.kitech.biz.com.vo.PrjNoInpYearVo)inpYearList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; pacoList != null && i < pacoList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.ResInpPacoVo vo = (kr.re.kitech.biz.com.vo.ResInpPacoVo)pacoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; pareList != null && i < pareList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.ResInpPareVo vo = (kr.re.kitech.biz.com.vo.ResInpPareVo)pareList.get(i);
            vo._xStreamDec();	 
        }
        if( this.mainVo != null ) this.mainVo._xStreamDec();
    }


}
