package kr.re.kitech.biz.ccs.cws.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "CwsAllWorkTimeVo")
public class CwsAllWorkTimeVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CwsAllWorkTimeVo(){
    }

    @ElDtoField(logicalName = "근태관련 기본정보", physicalName = "cwsWorkTimeBasicInfoVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeBasicInfoVo cwsWorkTimeBasicInfoVo;

    @ElDtoField(logicalName = "휴일 정보", physicalName = "cwsWorkTimeAnalCountVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeAnalCountVo cwsWorkTimeAnalCountVo;

    @ElDtoField(logicalName = "근무시간현황 개괄 정보", physicalName = "cwsWorkTimeStatusVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeStatusVo cwsWorkTimeStatusVo;

    @ElDtoField(logicalName = "근무대상일수", physicalName = "cwsWorkDaysVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ccs.cws.vo.CwsWorkDaysVo cwsWorkDaysVo;

    @ElDtoField(logicalName = "실근무시간 요약정보", physicalName = "cwsSmryWorkTimeVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ccs.cws.vo.CwsSmryWorkTimeVo cwsSmryWorkTimeVo;

    @ElDtoField(logicalName = "표준실근무시간 일별 리스트", physicalName = "cwsWorkTimeDaysListVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDetailListVo cwsWorkTimeDaysListVo;

    @ElDtoField(logicalName = "유연실근무시간 일별 리스트", physicalName = "cwsWorkTimeDaysFlexListVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDetailFlexListVo cwsWorkTimeDaysFlexListVo;

    @ElDtoField(logicalName = "표준실근무시간 일별 정보", physicalName = "cwsWorkTimeDaysVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDaysVo cwsWorkTimeDaysVo;

    @ElDtoField(logicalName = "유연실근무시간 일별 정보", physicalName = "cwsWorkTimeDaysFlexVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDaysFlexVo cwsWorkTimeDaysFlexVo;

    @ElDtoField(logicalName = "표준실근무시간 상세정보", physicalName = "cwsWorkTimeDetailVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDetailVo cwsWorkTimeDetailVo;

    @ElDtoField(logicalName = "유연실근무시간 상세정보", physicalName = "cwsWorkTimeDetailFlexVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDetailFlexVo cwsWorkTimeDetailFlexVo;

    @ElVoField(physicalName = "cwsWorkTimeBasicInfoVo")
    public kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeBasicInfoVo getCwsWorkTimeBasicInfoVo(){
        return cwsWorkTimeBasicInfoVo;
    }

    @ElVoField(physicalName = "cwsWorkTimeBasicInfoVo")
    public void setCwsWorkTimeBasicInfoVo(kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeBasicInfoVo cwsWorkTimeBasicInfoVo){
        this.cwsWorkTimeBasicInfoVo = cwsWorkTimeBasicInfoVo;
    }

    @ElVoField(physicalName = "cwsWorkTimeAnalCountVo")
    public kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeAnalCountVo getCwsWorkTimeAnalCountVo(){
        return cwsWorkTimeAnalCountVo;
    }

    @ElVoField(physicalName = "cwsWorkTimeAnalCountVo")
    public void setCwsWorkTimeAnalCountVo(kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeAnalCountVo cwsWorkTimeAnalCountVo){
        this.cwsWorkTimeAnalCountVo = cwsWorkTimeAnalCountVo;
    }

    @ElVoField(physicalName = "cwsWorkTimeStatusVo")
    public kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeStatusVo getCwsWorkTimeStatusVo(){
        return cwsWorkTimeStatusVo;
    }

    @ElVoField(physicalName = "cwsWorkTimeStatusVo")
    public void setCwsWorkTimeStatusVo(kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeStatusVo cwsWorkTimeStatusVo){
        this.cwsWorkTimeStatusVo = cwsWorkTimeStatusVo;
    }

    @ElVoField(physicalName = "cwsWorkDaysVo")
    public kr.re.kitech.biz.ccs.cws.vo.CwsWorkDaysVo getCwsWorkDaysVo(){
        return cwsWorkDaysVo;
    }

    @ElVoField(physicalName = "cwsWorkDaysVo")
    public void setCwsWorkDaysVo(kr.re.kitech.biz.ccs.cws.vo.CwsWorkDaysVo cwsWorkDaysVo){
        this.cwsWorkDaysVo = cwsWorkDaysVo;
    }

    @ElVoField(physicalName = "cwsSmryWorkTimeVo")
    public kr.re.kitech.biz.ccs.cws.vo.CwsSmryWorkTimeVo getCwsSmryWorkTimeVo(){
        return cwsSmryWorkTimeVo;
    }

    @ElVoField(physicalName = "cwsSmryWorkTimeVo")
    public void setCwsSmryWorkTimeVo(kr.re.kitech.biz.ccs.cws.vo.CwsSmryWorkTimeVo cwsSmryWorkTimeVo){
        this.cwsSmryWorkTimeVo = cwsSmryWorkTimeVo;
    }

    @ElVoField(physicalName = "cwsWorkTimeDaysListVo")
    public kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDetailListVo getCwsWorkTimeDaysListVo(){
        return cwsWorkTimeDaysListVo;
    }

    @ElVoField(physicalName = "cwsWorkTimeDaysListVo")
    public void setCwsWorkTimeDaysListVo(kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDetailListVo cwsWorkTimeDaysListVo){
        this.cwsWorkTimeDaysListVo = cwsWorkTimeDaysListVo;
    }

    @ElVoField(physicalName = "cwsWorkTimeDaysFlexListVo")
    public kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDetailFlexListVo getCwsWorkTimeDaysFlexListVo(){
        return cwsWorkTimeDaysFlexListVo;
    }

    @ElVoField(physicalName = "cwsWorkTimeDaysFlexListVo")
    public void setCwsWorkTimeDaysFlexListVo(kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDetailFlexListVo cwsWorkTimeDaysFlexListVo){
        this.cwsWorkTimeDaysFlexListVo = cwsWorkTimeDaysFlexListVo;
    }

    @ElVoField(physicalName = "cwsWorkTimeDaysVo")
    public kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDaysVo getCwsWorkTimeDaysVo(){
        return cwsWorkTimeDaysVo;
    }

    @ElVoField(physicalName = "cwsWorkTimeDaysVo")
    public void setCwsWorkTimeDaysVo(kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDaysVo cwsWorkTimeDaysVo){
        this.cwsWorkTimeDaysVo = cwsWorkTimeDaysVo;
    }

    @ElVoField(physicalName = "cwsWorkTimeDaysFlexVo")
    public kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDaysFlexVo getCwsWorkTimeDaysFlexVo(){
        return cwsWorkTimeDaysFlexVo;
    }

    @ElVoField(physicalName = "cwsWorkTimeDaysFlexVo")
    public void setCwsWorkTimeDaysFlexVo(kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDaysFlexVo cwsWorkTimeDaysFlexVo){
        this.cwsWorkTimeDaysFlexVo = cwsWorkTimeDaysFlexVo;
    }

    @ElVoField(physicalName = "cwsWorkTimeDetailVo")
    public kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDetailVo getCwsWorkTimeDetailVo(){
        return cwsWorkTimeDetailVo;
    }

    @ElVoField(physicalName = "cwsWorkTimeDetailVo")
    public void setCwsWorkTimeDetailVo(kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDetailVo cwsWorkTimeDetailVo){
        this.cwsWorkTimeDetailVo = cwsWorkTimeDetailVo;
    }

    @ElVoField(physicalName = "cwsWorkTimeDetailFlexVo")
    public kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDetailFlexVo getCwsWorkTimeDetailFlexVo(){
        return cwsWorkTimeDetailFlexVo;
    }

    @ElVoField(physicalName = "cwsWorkTimeDetailFlexVo")
    public void setCwsWorkTimeDetailFlexVo(kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeDetailFlexVo cwsWorkTimeDetailFlexVo){
        this.cwsWorkTimeDetailFlexVo = cwsWorkTimeDetailFlexVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CwsAllWorkTimeVo [");
        sb.append("cwsWorkTimeBasicInfoVo").append("=").append(cwsWorkTimeBasicInfoVo).append(",");
        sb.append("cwsWorkTimeAnalCountVo").append("=").append(cwsWorkTimeAnalCountVo).append(",");
        sb.append("cwsWorkTimeStatusVo").append("=").append(cwsWorkTimeStatusVo).append(",");
        sb.append("cwsWorkDaysVo").append("=").append(cwsWorkDaysVo).append(",");
        sb.append("cwsSmryWorkTimeVo").append("=").append(cwsSmryWorkTimeVo).append(",");
        sb.append("cwsWorkTimeDaysListVo").append("=").append(cwsWorkTimeDaysListVo).append(",");
        sb.append("cwsWorkTimeDaysFlexListVo").append("=").append(cwsWorkTimeDaysFlexListVo).append(",");
        sb.append("cwsWorkTimeDaysVo").append("=").append(cwsWorkTimeDaysVo).append(",");
        sb.append("cwsWorkTimeDaysFlexVo").append("=").append(cwsWorkTimeDaysFlexVo).append(",");
        sb.append("cwsWorkTimeDetailVo").append("=").append(cwsWorkTimeDetailVo).append(",");
        sb.append("cwsWorkTimeDetailFlexVo").append("=").append(cwsWorkTimeDetailFlexVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.cwsWorkTimeBasicInfoVo != null ) this.cwsWorkTimeBasicInfoVo._xStreamEnc();
        if( this.cwsWorkTimeAnalCountVo != null ) this.cwsWorkTimeAnalCountVo._xStreamEnc();
        if( this.cwsWorkTimeStatusVo != null ) this.cwsWorkTimeStatusVo._xStreamEnc();
        if( this.cwsWorkDaysVo != null ) this.cwsWorkDaysVo._xStreamEnc();
        if( this.cwsSmryWorkTimeVo != null ) this.cwsSmryWorkTimeVo._xStreamEnc();
        if( this.cwsWorkTimeDaysListVo != null ) this.cwsWorkTimeDaysListVo._xStreamEnc();
        if( this.cwsWorkTimeDaysFlexListVo != null ) this.cwsWorkTimeDaysFlexListVo._xStreamEnc();
        if( this.cwsWorkTimeDaysVo != null ) this.cwsWorkTimeDaysVo._xStreamEnc();
        if( this.cwsWorkTimeDaysFlexVo != null ) this.cwsWorkTimeDaysFlexVo._xStreamEnc();
        if( this.cwsWorkTimeDetailVo != null ) this.cwsWorkTimeDetailVo._xStreamEnc();
        if( this.cwsWorkTimeDetailFlexVo != null ) this.cwsWorkTimeDetailFlexVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        if( this.cwsWorkTimeBasicInfoVo != null ) this.cwsWorkTimeBasicInfoVo._xStreamDec();
        if( this.cwsWorkTimeAnalCountVo != null ) this.cwsWorkTimeAnalCountVo._xStreamDec();
        if( this.cwsWorkTimeStatusVo != null ) this.cwsWorkTimeStatusVo._xStreamDec();
        if( this.cwsWorkDaysVo != null ) this.cwsWorkDaysVo._xStreamDec();
        if( this.cwsSmryWorkTimeVo != null ) this.cwsSmryWorkTimeVo._xStreamDec();
        if( this.cwsWorkTimeDaysListVo != null ) this.cwsWorkTimeDaysListVo._xStreamDec();
        if( this.cwsWorkTimeDaysFlexListVo != null ) this.cwsWorkTimeDaysFlexListVo._xStreamDec();
        if( this.cwsWorkTimeDaysVo != null ) this.cwsWorkTimeDaysVo._xStreamDec();
        if( this.cwsWorkTimeDaysFlexVo != null ) this.cwsWorkTimeDaysFlexVo._xStreamDec();
        if( this.cwsWorkTimeDetailVo != null ) this.cwsWorkTimeDetailVo._xStreamDec();
        if( this.cwsWorkTimeDetailFlexVo != null ) this.cwsWorkTimeDetailFlexVo._xStreamDec();
    }


}
