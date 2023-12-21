package kr.re.kitech.biz.xom.core.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "마이메뉴")
public class MymenuListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public MymenuListVo(){
    }

    @ElDtoField(logicalName = "마이메뉴List", physicalName = "mymenuVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.MymenuVo> mymenuVoList;

    @ElDtoField(logicalName = "삭제된 마이메뉴List", physicalName = "delMyMenuVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.MymenuVo> delMyMenuVoList;

    @ElVoField(physicalName = "mymenuVoList")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.MymenuVo> getMymenuVoList(){
        return mymenuVoList;
    }

    @ElVoField(physicalName = "mymenuVoList")
    public void setMymenuVoList(java.util.List<kr.re.kitech.biz.xom.core.vo.MymenuVo> mymenuVoList){
        this.mymenuVoList = mymenuVoList;
    }

    @ElVoField(physicalName = "delMyMenuVoList")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.MymenuVo> getDelMyMenuVoList(){
        return delMyMenuVoList;
    }

    @ElVoField(physicalName = "delMyMenuVoList")
    public void setDelMyMenuVoList(java.util.List<kr.re.kitech.biz.xom.core.vo.MymenuVo> delMyMenuVoList){
        this.delMyMenuVoList = delMyMenuVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MymenuListVo [");
        sb.append("mymenuVoList").append("=").append(mymenuVoList).append(",");
        sb.append("delMyMenuVoList").append("=").append(delMyMenuVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; mymenuVoList != null && i < mymenuVoList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.MymenuVo vo = (kr.re.kitech.biz.xom.core.vo.MymenuVo)mymenuVoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; delMyMenuVoList != null && i < delMyMenuVoList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.MymenuVo vo = (kr.re.kitech.biz.xom.core.vo.MymenuVo)delMyMenuVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; mymenuVoList != null && i < mymenuVoList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.MymenuVo vo = (kr.re.kitech.biz.xom.core.vo.MymenuVo)mymenuVoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; delMyMenuVoList != null && i < delMyMenuVoList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.MymenuVo vo = (kr.re.kitech.biz.xom.core.vo.MymenuVo)delMyMenuVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
