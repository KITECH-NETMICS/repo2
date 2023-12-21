package kr.re.kitech.biz.fin.spm.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "회의록 상세 조회 Vo")
public class FspMeetDetlInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspMeetDetlInfoVo(){
    }

    @ElDtoField(logicalName = "회의참석자 Vo", physicalName = "attendList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.spm.vo.FspMeetAttendVo> attendList;

    @ElDtoField(logicalName = "회의록상세 Vo", physicalName = "detlVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.spm.vo.FspMeetDetlsVo detlVo;

    @ElDtoField(logicalName = "지출증빙 Vo", physicalName = "evidList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.spm.vo.FspMeetEvidVo> evidList;

    @ElDtoField(logicalName = "회의록 근태정보 Vo", physicalName = "workList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.spm.vo.FspMeetWorkTimeVo> workList;

    @ElDtoField(logicalName = "결의서헤더VO", physicalName = "slipHVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.com.vo.FspSlipHVo slipHVo;

    @ElVoField(physicalName = "attendList")
    public java.util.List<kr.re.kitech.biz.fin.spm.vo.FspMeetAttendVo> getAttendList(){
        return attendList;
    }

    @ElVoField(physicalName = "attendList")
    public void setAttendList(java.util.List<kr.re.kitech.biz.fin.spm.vo.FspMeetAttendVo> attendList){
        this.attendList = attendList;
    }

    @ElVoField(physicalName = "detlVo")
    public kr.re.kitech.biz.fin.spm.vo.FspMeetDetlsVo getDetlVo(){
        return detlVo;
    }

    @ElVoField(physicalName = "detlVo")
    public void setDetlVo(kr.re.kitech.biz.fin.spm.vo.FspMeetDetlsVo detlVo){
        this.detlVo = detlVo;
    }

    @ElVoField(physicalName = "evidList")
    public java.util.List<kr.re.kitech.biz.fin.spm.vo.FspMeetEvidVo> getEvidList(){
        return evidList;
    }

    @ElVoField(physicalName = "evidList")
    public void setEvidList(java.util.List<kr.re.kitech.biz.fin.spm.vo.FspMeetEvidVo> evidList){
        this.evidList = evidList;
    }

    @ElVoField(physicalName = "workList")
    public java.util.List<kr.re.kitech.biz.fin.spm.vo.FspMeetWorkTimeVo> getWorkList(){
        return workList;
    }

    @ElVoField(physicalName = "workList")
    public void setWorkList(java.util.List<kr.re.kitech.biz.fin.spm.vo.FspMeetWorkTimeVo> workList){
        this.workList = workList;
    }

    @ElVoField(physicalName = "slipHVo")
    public kr.re.kitech.biz.fin.com.vo.FspSlipHVo getSlipHVo(){
        return slipHVo;
    }

    @ElVoField(physicalName = "slipHVo")
    public void setSlipHVo(kr.re.kitech.biz.fin.com.vo.FspSlipHVo slipHVo){
        this.slipHVo = slipHVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspMeetDetlInfoVo [");
        sb.append("attendList").append("=").append(attendList).append(",");
        sb.append("detlVo").append("=").append(detlVo).append(",");
        sb.append("evidList").append("=").append(evidList).append(",");
        sb.append("workList").append("=").append(workList).append(",");
        sb.append("slipHVo").append("=").append(slipHVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; attendList != null && i < attendList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spm.vo.FspMeetAttendVo vo = (kr.re.kitech.biz.fin.spm.vo.FspMeetAttendVo)attendList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.detlVo != null ) this.detlVo._xStreamEnc();
        for( int i=0 ; evidList != null && i < evidList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spm.vo.FspMeetEvidVo vo = (kr.re.kitech.biz.fin.spm.vo.FspMeetEvidVo)evidList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; workList != null && i < workList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spm.vo.FspMeetWorkTimeVo vo = (kr.re.kitech.biz.fin.spm.vo.FspMeetWorkTimeVo)workList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.slipHVo != null ) this.slipHVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; attendList != null && i < attendList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spm.vo.FspMeetAttendVo vo = (kr.re.kitech.biz.fin.spm.vo.FspMeetAttendVo)attendList.get(i);
            vo._xStreamDec();	 
        }
        if( this.detlVo != null ) this.detlVo._xStreamDec();
        for( int i=0 ; evidList != null && i < evidList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spm.vo.FspMeetEvidVo vo = (kr.re.kitech.biz.fin.spm.vo.FspMeetEvidVo)evidList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; workList != null && i < workList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spm.vo.FspMeetWorkTimeVo vo = (kr.re.kitech.biz.fin.spm.vo.FspMeetWorkTimeVo)workList.get(i);
            vo._xStreamDec();	 
        }
        if( this.slipHVo != null ) this.slipHVo._xStreamDec();
    }


}
