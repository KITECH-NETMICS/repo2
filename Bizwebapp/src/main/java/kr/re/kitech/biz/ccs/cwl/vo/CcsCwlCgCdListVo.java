package kr.re.kitech.biz.ccs.cwl.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "경조사비 리스트")
public class CcsCwlCgCdListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CcsCwlCgCdListVo(){
    }

    @ElDtoField(logicalName = "경조사비 신청 목록", physicalName = "ccsCwlCgCdVoList", type = "", typeKind = "List", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.cwl.vo.CcsCwlCgCdVo> ccsCwlCgCdVoList;

    @ElVoField(physicalName = "ccsCwlCgCdVoList")
    public java.util.List<kr.re.kitech.biz.ccs.cwl.vo.CcsCwlCgCdVo> getCcsCwlCgCdVoList(){
        return ccsCwlCgCdVoList;
    }

    @ElVoField(physicalName = "ccsCwlCgCdVoList")
    public void setCcsCwlCgCdVoList(java.util.List<kr.re.kitech.biz.ccs.cwl.vo.CcsCwlCgCdVo> ccsCwlCgCdVoList){
        this.ccsCwlCgCdVoList = ccsCwlCgCdVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CcsCwlCgCdListVo [");
        sb.append("ccsCwlCgCdVoList").append("=").append(ccsCwlCgCdVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; ccsCwlCgCdVoList != null && i < ccsCwlCgCdVoList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cwl.vo.CcsCwlCgCdVo vo = (kr.re.kitech.biz.ccs.cwl.vo.CcsCwlCgCdVo)ccsCwlCgCdVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; ccsCwlCgCdVoList != null && i < ccsCwlCgCdVoList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cwl.vo.CcsCwlCgCdVo vo = (kr.re.kitech.biz.ccs.cwl.vo.CcsCwlCgCdVo)ccsCwlCgCdVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
