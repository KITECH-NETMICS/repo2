package kr.re.kitech.biz.kbk.etc.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "전자정보관리 VO List")
public class EtcOutUrlListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public EtcOutUrlListVo(){
    }

    @ElDtoField(logicalName = "전자정보관리VO", physicalName = "etcOutUrlVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.kbk.etc.vo.EtcOutUrlVo> etcOutUrlVoList;

    @ElVoField(physicalName = "etcOutUrlVoList")
    public java.util.List<kr.re.kitech.biz.kbk.etc.vo.EtcOutUrlVo> getEtcOutUrlVoList(){
        return etcOutUrlVoList;
    }

    @ElVoField(physicalName = "etcOutUrlVoList")
    public void setEtcOutUrlVoList(java.util.List<kr.re.kitech.biz.kbk.etc.vo.EtcOutUrlVo> etcOutUrlVoList){
        this.etcOutUrlVoList = etcOutUrlVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EtcOutUrlListVo [");
        sb.append("etcOutUrlVoList").append("=").append(etcOutUrlVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; etcOutUrlVoList != null && i < etcOutUrlVoList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.etc.vo.EtcOutUrlVo vo = (kr.re.kitech.biz.kbk.etc.vo.EtcOutUrlVo)etcOutUrlVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; etcOutUrlVoList != null && i < etcOutUrlVoList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.etc.vo.EtcOutUrlVo vo = (kr.re.kitech.biz.kbk.etc.vo.EtcOutUrlVo)etcOutUrlVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
