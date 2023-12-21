package kr.re.kitech.biz.ass.eqip.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "통합관리계정변경이력 저장 Vo")
public class ResBgAcctmHisInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResBgAcctmHisInfoVo(){
    }

    @ElDtoField(logicalName = "통합계정변경이력 Vo", physicalName = "hisList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ass.eqip.vo.ResBgAcctmHisVo> hisList;

    @ElVoField(physicalName = "hisList")
    public java.util.List<kr.re.kitech.biz.ass.eqip.vo.ResBgAcctmHisVo> getHisList(){
        return hisList;
    }

    @ElVoField(physicalName = "hisList")
    public void setHisList(java.util.List<kr.re.kitech.biz.ass.eqip.vo.ResBgAcctmHisVo> hisList){
        this.hisList = hisList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResBgAcctmHisInfoVo [");
        sb.append("hisList").append("=").append(hisList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; hisList != null && i < hisList.size() ; i++ ) {
            kr.re.kitech.biz.ass.eqip.vo.ResBgAcctmHisVo vo = (kr.re.kitech.biz.ass.eqip.vo.ResBgAcctmHisVo)hisList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; hisList != null && i < hisList.size() ; i++ ) {
            kr.re.kitech.biz.ass.eqip.vo.ResBgAcctmHisVo vo = (kr.re.kitech.biz.ass.eqip.vo.ResBgAcctmHisVo)hisList.get(i);
            vo._xStreamDec();	 
        }
    }


}
