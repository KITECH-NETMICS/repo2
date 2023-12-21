package kr.re.kitech.biz.ccs.cwl.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class CwlLoanMidRepayReqListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CwlLoanMidRepayReqListVo(){
    }

    @ElDtoField(logicalName = "ListVo", physicalName = "cwlLoanMidRepayReqVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.cwl.vo.CwlLoanMidRepayReqVo> cwlLoanMidRepayReqVoList;

    @ElDtoField(logicalName = "Vo", physicalName = "cwlLoanMidRepayReqVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ccs.cwl.vo.CwlLoanMidRepayReqVo cwlLoanMidRepayReqVo;

    @ElDtoField(logicalName = "상조회대출금마스터", physicalName = "cwlLoanMasterVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ccs.cwl.vo.CwlLoanMasterVo cwlLoanMasterVo;

    @ElVoField(physicalName = "cwlLoanMidRepayReqVoList")
    public java.util.List<kr.re.kitech.biz.ccs.cwl.vo.CwlLoanMidRepayReqVo> getCwlLoanMidRepayReqVoList(){
        return cwlLoanMidRepayReqVoList;
    }

    @ElVoField(physicalName = "cwlLoanMidRepayReqVoList")
    public void setCwlLoanMidRepayReqVoList(java.util.List<kr.re.kitech.biz.ccs.cwl.vo.CwlLoanMidRepayReqVo> cwlLoanMidRepayReqVoList){
        this.cwlLoanMidRepayReqVoList = cwlLoanMidRepayReqVoList;
    }

    @ElVoField(physicalName = "cwlLoanMidRepayReqVo")
    public kr.re.kitech.biz.ccs.cwl.vo.CwlLoanMidRepayReqVo getCwlLoanMidRepayReqVo(){
        return cwlLoanMidRepayReqVo;
    }

    @ElVoField(physicalName = "cwlLoanMidRepayReqVo")
    public void setCwlLoanMidRepayReqVo(kr.re.kitech.biz.ccs.cwl.vo.CwlLoanMidRepayReqVo cwlLoanMidRepayReqVo){
        this.cwlLoanMidRepayReqVo = cwlLoanMidRepayReqVo;
    }

    @ElVoField(physicalName = "cwlLoanMasterVo")
    public kr.re.kitech.biz.ccs.cwl.vo.CwlLoanMasterVo getCwlLoanMasterVo(){
        return cwlLoanMasterVo;
    }

    @ElVoField(physicalName = "cwlLoanMasterVo")
    public void setCwlLoanMasterVo(kr.re.kitech.biz.ccs.cwl.vo.CwlLoanMasterVo cwlLoanMasterVo){
        this.cwlLoanMasterVo = cwlLoanMasterVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CwlLoanMidRepayReqListVo [");
        sb.append("cwlLoanMidRepayReqVoList").append("=").append(cwlLoanMidRepayReqVoList).append(",");
        sb.append("cwlLoanMidRepayReqVo").append("=").append(cwlLoanMidRepayReqVo).append(",");
        sb.append("cwlLoanMasterVo").append("=").append(cwlLoanMasterVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; cwlLoanMidRepayReqVoList != null && i < cwlLoanMidRepayReqVoList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cwl.vo.CwlLoanMidRepayReqVo vo = (kr.re.kitech.biz.ccs.cwl.vo.CwlLoanMidRepayReqVo)cwlLoanMidRepayReqVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.cwlLoanMidRepayReqVo != null ) this.cwlLoanMidRepayReqVo._xStreamEnc();
        if( this.cwlLoanMasterVo != null ) this.cwlLoanMasterVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; cwlLoanMidRepayReqVoList != null && i < cwlLoanMidRepayReqVoList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cwl.vo.CwlLoanMidRepayReqVo vo = (kr.re.kitech.biz.ccs.cwl.vo.CwlLoanMidRepayReqVo)cwlLoanMidRepayReqVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.cwlLoanMidRepayReqVo != null ) this.cwlLoanMidRepayReqVo._xStreamDec();
        if( this.cwlLoanMasterVo != null ) this.cwlLoanMasterVo._xStreamDec();
    }


}
