package kr.re.kitech.biz.kbk.bmg.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "Bmg 업무 관련 검색 Vo")
public class BmgBookReportListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public BmgBookReportListVo(){
    }

    @ElDtoField(logicalName = "Bmg 업무 관련 검색 Vo", physicalName = "bmgBookReportVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.kbk.bmg.vo.BmgBookReportVo> bmgBookReportVoList;

    @ElVoField(physicalName = "bmgBookReportVoList")
    public java.util.List<kr.re.kitech.biz.kbk.bmg.vo.BmgBookReportVo> getBmgBookReportVoList(){
        return bmgBookReportVoList;
    }

    @ElVoField(physicalName = "bmgBookReportVoList")
    public void setBmgBookReportVoList(java.util.List<kr.re.kitech.biz.kbk.bmg.vo.BmgBookReportVo> bmgBookReportVoList){
        this.bmgBookReportVoList = bmgBookReportVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BmgBookReportListVo [");
        sb.append("bmgBookReportVoList").append("=").append(bmgBookReportVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; bmgBookReportVoList != null && i < bmgBookReportVoList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.bmg.vo.BmgBookReportVo vo = (kr.re.kitech.biz.kbk.bmg.vo.BmgBookReportVo)bmgBookReportVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; bmgBookReportVoList != null && i < bmgBookReportVoList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.bmg.vo.BmgBookReportVo vo = (kr.re.kitech.biz.kbk.bmg.vo.BmgBookReportVo)bmgBookReportVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
