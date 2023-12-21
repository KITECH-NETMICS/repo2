package kr.re.kitech.biz.kbk.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "원내보고서 리스트")
public class KbkPopReportListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public KbkPopReportListVo(){
    }

    @ElDtoField(logicalName = "보고서 상세", physicalName = "kbkPopReportDetailVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.kbk.pop.vo.KbkPopReportDetailVo> kbkPopReportDetailVoList;

    @ElVoField(physicalName = "kbkPopReportDetailVoList")
    public java.util.List<kr.re.kitech.biz.kbk.pop.vo.KbkPopReportDetailVo> getKbkPopReportDetailVoList(){
        return kbkPopReportDetailVoList;
    }

    @ElVoField(physicalName = "kbkPopReportDetailVoList")
    public void setKbkPopReportDetailVoList(java.util.List<kr.re.kitech.biz.kbk.pop.vo.KbkPopReportDetailVo> kbkPopReportDetailVoList){
        this.kbkPopReportDetailVoList = kbkPopReportDetailVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KbkPopReportListVo [");
        sb.append("kbkPopReportDetailVoList").append("=").append(kbkPopReportDetailVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; kbkPopReportDetailVoList != null && i < kbkPopReportDetailVoList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.pop.vo.KbkPopReportDetailVo vo = (kr.re.kitech.biz.kbk.pop.vo.KbkPopReportDetailVo)kbkPopReportDetailVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; kbkPopReportDetailVoList != null && i < kbkPopReportDetailVoList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.pop.vo.KbkPopReportDetailVo vo = (kr.re.kitech.biz.kbk.pop.vo.KbkPopReportDetailVo)kbkPopReportDetailVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
