package kr.re.kitech.biz.fin.spm.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "관리항목 리스트 Vo")
public class FspSlipMngmtListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspSlipMngmtListVo(){
    }

    @ElDtoField(logicalName = "결의서관리항목 VO", physicalName = "mngmtList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo> mngmtList;

    @ElVoField(physicalName = "mngmtList")
    public java.util.List<kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo> getMngmtList(){
        return mngmtList;
    }

    @ElVoField(physicalName = "mngmtList")
    public void setMngmtList(java.util.List<kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo> mngmtList){
        this.mngmtList = mngmtList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspSlipMngmtListVo [");
        sb.append("mngmtList").append("=").append(mngmtList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; mngmtList != null && i < mngmtList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo vo = (kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo)mngmtList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; mngmtList != null && i < mngmtList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo vo = (kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo)mngmtList.get(i);
            vo._xStreamDec();	 
        }
    }


}
