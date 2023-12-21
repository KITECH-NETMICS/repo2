package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "외부강의신고 결재신청 Vo")
public class CvnTripAprVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CvnTripAprVo(){
    }

    @ElDtoField(logicalName = "외부강의신고", physicalName = "cvnVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ccs.ctr.vo.CtrTripInviteVo cvnVo;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;

    @ElDtoField(logicalName = "외부강의신고 월간현황 Vo", physicalName = "accrList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CvnTripReqMonthVo> accrList;

    @ElVoField(physicalName = "cvnVo")
    public kr.re.kitech.biz.ccs.ctr.vo.CtrTripInviteVo getCvnVo(){
        return cvnVo;
    }

    @ElVoField(physicalName = "cvnVo")
    public void setCvnVo(kr.re.kitech.biz.ccs.ctr.vo.CtrTripInviteVo cvnVo){
        this.cvnVo = cvnVo;
    }

    @ElVoField(physicalName = "fileList")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList(){
        return fileList;
    }

    @ElVoField(physicalName = "fileList")
    public void setFileList(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList){
        this.fileList = fileList;
    }

    @ElVoField(physicalName = "accrList")
    public java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CvnTripReqMonthVo> getAccrList(){
        return accrList;
    }

    @ElVoField(physicalName = "accrList")
    public void setAccrList(java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CvnTripReqMonthVo> accrList){
        this.accrList = accrList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CvnTripAprVo [");
        sb.append("cvnVo").append("=").append(cvnVo).append(",");
        sb.append("fileList").append("=").append(fileList).append(",");
        sb.append("accrList").append("=").append(accrList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.cvnVo != null ) this.cvnVo._xStreamEnc();
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; accrList != null && i < accrList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CvnTripReqMonthVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CvnTripReqMonthVo)accrList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.cvnVo != null ) this.cvnVo._xStreamDec();
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; accrList != null && i < accrList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CvnTripReqMonthVo vo = (kr.re.kitech.biz.ccs.ctr.vo.CvnTripReqMonthVo)accrList.get(i);
            vo._xStreamDec();	 
        }
    }


}
