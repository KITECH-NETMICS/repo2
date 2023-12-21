package kr.re.kitech.biz.kbk.inv.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "연구보고서 리스트")
public class InvReportListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public InvReportListVo(){
    }

    @ElDtoField(logicalName = "연구보고서 상세", physicalName = "invReportVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.kbk.inv.vo.InvReportVo> invReportVoList;

    @ElVoField(physicalName = "invReportVoList")
    public java.util.List<kr.re.kitech.biz.kbk.inv.vo.InvReportVo> getInvReportVoList(){
        return invReportVoList;
    }

    @ElVoField(physicalName = "invReportVoList")
    public void setInvReportVoList(java.util.List<kr.re.kitech.biz.kbk.inv.vo.InvReportVo> invReportVoList){
        this.invReportVoList = invReportVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvReportListVo [");
        sb.append("invReportVoList").append("=").append(invReportVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; invReportVoList != null && i < invReportVoList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.inv.vo.InvReportVo vo = (kr.re.kitech.biz.kbk.inv.vo.InvReportVo)invReportVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; invReportVoList != null && i < invReportVoList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.inv.vo.InvReportVo vo = (kr.re.kitech.biz.kbk.inv.vo.InvReportVo)invReportVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
