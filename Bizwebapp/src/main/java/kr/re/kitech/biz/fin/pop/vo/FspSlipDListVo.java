package kr.re.kitech.biz.fin.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "결의내역대체처리 검색 리스트 Vo")
public class FspSlipDListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspSlipDListVo(){
    }

    @ElDtoField(logicalName = "결의서디테일VO", physicalName = "slipList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.pop.vo.TransSlipVo> slipList;

    @ElVoField(physicalName = "slipList")
    public java.util.List<kr.re.kitech.biz.fin.pop.vo.TransSlipVo> getSlipList(){
        return slipList;
    }

    @ElVoField(physicalName = "slipList")
    public void setSlipList(java.util.List<kr.re.kitech.biz.fin.pop.vo.TransSlipVo> slipList){
        this.slipList = slipList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspSlipDListVo [");
        sb.append("slipList").append("=").append(slipList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; slipList != null && i < slipList.size() ; i++ ) {
            kr.re.kitech.biz.fin.pop.vo.TransSlipVo vo = (kr.re.kitech.biz.fin.pop.vo.TransSlipVo)slipList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; slipList != null && i < slipList.size() ; i++ ) {
            kr.re.kitech.biz.fin.pop.vo.TransSlipVo vo = (kr.re.kitech.biz.fin.pop.vo.TransSlipVo)slipList.get(i);
            vo._xStreamDec();	 
        }
    }


}
