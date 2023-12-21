package kr.re.kitech.biz.api.server.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "APIEIPBIZ리스트VO")
public class ApiEipBizListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ApiEipBizListVo(){
    }

    @ElDtoField(logicalName = "회의록VO", physicalName = "apiEipMNoteVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipMNoteVo> apiEipMNoteVoList;

    @ElDtoField(logicalName = "교육일정마감VO", physicalName = "apiEipEduDeadlineVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipEduDeadlineVo> apiEipEduDeadlineVo;

    @ElDtoField(logicalName = "회의실신청VO", physicalName = "apiEipMRoomReqVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipMRoomReqVo> apiEipMRoomReqVo;

    @ElDtoField(logicalName = "기숙사신청VO", physicalName = "apiEipDormReqVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipDormReqVo> apiEipDormReqVo;

    @ElDtoField(logicalName = "목표근무시간VO", physicalName = "apiEipWrkGoalTimeVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipWrkGoalTimeVo> apiEipWrkGoalTimeVo;

    @ElDtoField(logicalName = "출장정산미처리VO", physicalName = "apiEipTripUnproVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipTripUnproVo> apiEipTripUnproVo;

    @ElDtoField(logicalName = "카드미처리VO", physicalName = "apiEipCardUnproVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipCardUnproVo> apiEipCardUnproVo;

    @ElDtoField(logicalName = "직원재실현황VO", physicalName = "apiEipHumCompVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipHumCompVo> apiEipHumCompVo;

    @ElDtoField(logicalName = "보직자재실현황VO", physicalName = "apiEipPosiCompVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipPosiCompVo> apiEipPosiCompVo;

    @ElDtoField(logicalName = "과제정보VO", physicalName = "apiEipPrjInfoVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipPrjInfoVo> apiEipPrjInfoVo;

    @ElDtoField(logicalName = "출장현황결재VO", physicalName = "apiEipTripPayVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipTripPayVo> apiEipTripPayVo;

    @ElDtoField(logicalName = "휴가신청VO", physicalName = "apiEipVacaReqVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipVacaReqVo> apiEipVacaReqVo;

    @ElDtoField(logicalName = "연차결재진행VO", physicalName = "apiEipAnnPayProVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipAnnPayProVo> apiEipAnnPayProVo;

    @ElDtoField(logicalName = "카드결재진행VO", physicalName = "apiEipCardPayProVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipCardPayProVo> apiEipCardPayProVo;

    @ElDtoField(logicalName = "발령이력Vo", physicalName = "apiEipHumAppoVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipHumAppoVo> apiEipHumAppoVo;

    @ElDtoField(logicalName = "교육이력Vo", physicalName = "apiEipHumEducVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipHumEducVo> apiEipHumEducVo;

    @ElDtoField(logicalName = "인사평가Vo", physicalName = "apiEipHumEvalVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipHumEvalVo> apiEipHumEvalVo;

    @ElDtoField(logicalName = "상벌사항Vo", physicalName = "apiEipHumRewardVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipHumRewardVo> apiEipHumRewardVo;

    @ElDtoField(logicalName = "연구보고서Vo", physicalName = "apiEipResReportVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipResReportVo> apiEipResReportVo;

    @ElVoField(physicalName = "apiEipMNoteVoList")
    public java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipMNoteVo> getApiEipMNoteVoList(){
        return apiEipMNoteVoList;
    }

    @ElVoField(physicalName = "apiEipMNoteVoList")
    public void setApiEipMNoteVoList(java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipMNoteVo> apiEipMNoteVoList){
        this.apiEipMNoteVoList = apiEipMNoteVoList;
    }

    @ElVoField(physicalName = "apiEipEduDeadlineVo")
    public java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipEduDeadlineVo> getApiEipEduDeadlineVo(){
        return apiEipEduDeadlineVo;
    }

    @ElVoField(physicalName = "apiEipEduDeadlineVo")
    public void setApiEipEduDeadlineVo(java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipEduDeadlineVo> apiEipEduDeadlineVo){
        this.apiEipEduDeadlineVo = apiEipEduDeadlineVo;
    }

    @ElVoField(physicalName = "apiEipMRoomReqVo")
    public java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipMRoomReqVo> getApiEipMRoomReqVo(){
        return apiEipMRoomReqVo;
    }

    @ElVoField(physicalName = "apiEipMRoomReqVo")
    public void setApiEipMRoomReqVo(java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipMRoomReqVo> apiEipMRoomReqVo){
        this.apiEipMRoomReqVo = apiEipMRoomReqVo;
    }

    @ElVoField(physicalName = "apiEipDormReqVo")
    public java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipDormReqVo> getApiEipDormReqVo(){
        return apiEipDormReqVo;
    }

    @ElVoField(physicalName = "apiEipDormReqVo")
    public void setApiEipDormReqVo(java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipDormReqVo> apiEipDormReqVo){
        this.apiEipDormReqVo = apiEipDormReqVo;
    }

    @ElVoField(physicalName = "apiEipWrkGoalTimeVo")
    public java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipWrkGoalTimeVo> getApiEipWrkGoalTimeVo(){
        return apiEipWrkGoalTimeVo;
    }

    @ElVoField(physicalName = "apiEipWrkGoalTimeVo")
    public void setApiEipWrkGoalTimeVo(java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipWrkGoalTimeVo> apiEipWrkGoalTimeVo){
        this.apiEipWrkGoalTimeVo = apiEipWrkGoalTimeVo;
    }

    @ElVoField(physicalName = "apiEipTripUnproVo")
    public java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipTripUnproVo> getApiEipTripUnproVo(){
        return apiEipTripUnproVo;
    }

    @ElVoField(physicalName = "apiEipTripUnproVo")
    public void setApiEipTripUnproVo(java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipTripUnproVo> apiEipTripUnproVo){
        this.apiEipTripUnproVo = apiEipTripUnproVo;
    }

    @ElVoField(physicalName = "apiEipCardUnproVo")
    public java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipCardUnproVo> getApiEipCardUnproVo(){
        return apiEipCardUnproVo;
    }

    @ElVoField(physicalName = "apiEipCardUnproVo")
    public void setApiEipCardUnproVo(java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipCardUnproVo> apiEipCardUnproVo){
        this.apiEipCardUnproVo = apiEipCardUnproVo;
    }

    @ElVoField(physicalName = "apiEipHumCompVo")
    public java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipHumCompVo> getApiEipHumCompVo(){
        return apiEipHumCompVo;
    }

    @ElVoField(physicalName = "apiEipHumCompVo")
    public void setApiEipHumCompVo(java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipHumCompVo> apiEipHumCompVo){
        this.apiEipHumCompVo = apiEipHumCompVo;
    }

    @ElVoField(physicalName = "apiEipPosiCompVo")
    public java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipPosiCompVo> getApiEipPosiCompVo(){
        return apiEipPosiCompVo;
    }

    @ElVoField(physicalName = "apiEipPosiCompVo")
    public void setApiEipPosiCompVo(java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipPosiCompVo> apiEipPosiCompVo){
        this.apiEipPosiCompVo = apiEipPosiCompVo;
    }

    @ElVoField(physicalName = "apiEipPrjInfoVo")
    public java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipPrjInfoVo> getApiEipPrjInfoVo(){
        return apiEipPrjInfoVo;
    }

    @ElVoField(physicalName = "apiEipPrjInfoVo")
    public void setApiEipPrjInfoVo(java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipPrjInfoVo> apiEipPrjInfoVo){
        this.apiEipPrjInfoVo = apiEipPrjInfoVo;
    }

    @ElVoField(physicalName = "apiEipTripPayVo")
    public java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipTripPayVo> getApiEipTripPayVo(){
        return apiEipTripPayVo;
    }

    @ElVoField(physicalName = "apiEipTripPayVo")
    public void setApiEipTripPayVo(java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipTripPayVo> apiEipTripPayVo){
        this.apiEipTripPayVo = apiEipTripPayVo;
    }

    @ElVoField(physicalName = "apiEipVacaReqVo")
    public java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipVacaReqVo> getApiEipVacaReqVo(){
        return apiEipVacaReqVo;
    }

    @ElVoField(physicalName = "apiEipVacaReqVo")
    public void setApiEipVacaReqVo(java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipVacaReqVo> apiEipVacaReqVo){
        this.apiEipVacaReqVo = apiEipVacaReqVo;
    }

    @ElVoField(physicalName = "apiEipAnnPayProVo")
    public java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipAnnPayProVo> getApiEipAnnPayProVo(){
        return apiEipAnnPayProVo;
    }

    @ElVoField(physicalName = "apiEipAnnPayProVo")
    public void setApiEipAnnPayProVo(java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipAnnPayProVo> apiEipAnnPayProVo){
        this.apiEipAnnPayProVo = apiEipAnnPayProVo;
    }

    @ElVoField(physicalName = "apiEipCardPayProVo")
    public java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipCardPayProVo> getApiEipCardPayProVo(){
        return apiEipCardPayProVo;
    }

    @ElVoField(physicalName = "apiEipCardPayProVo")
    public void setApiEipCardPayProVo(java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipCardPayProVo> apiEipCardPayProVo){
        this.apiEipCardPayProVo = apiEipCardPayProVo;
    }

    @ElVoField(physicalName = "apiEipHumAppoVo")
    public java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipHumAppoVo> getApiEipHumAppoVo(){
        return apiEipHumAppoVo;
    }

    @ElVoField(physicalName = "apiEipHumAppoVo")
    public void setApiEipHumAppoVo(java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipHumAppoVo> apiEipHumAppoVo){
        this.apiEipHumAppoVo = apiEipHumAppoVo;
    }

    @ElVoField(physicalName = "apiEipHumEducVo")
    public java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipHumEducVo> getApiEipHumEducVo(){
        return apiEipHumEducVo;
    }

    @ElVoField(physicalName = "apiEipHumEducVo")
    public void setApiEipHumEducVo(java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipHumEducVo> apiEipHumEducVo){
        this.apiEipHumEducVo = apiEipHumEducVo;
    }

    @ElVoField(physicalName = "apiEipHumEvalVo")
    public java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipHumEvalVo> getApiEipHumEvalVo(){
        return apiEipHumEvalVo;
    }

    @ElVoField(physicalName = "apiEipHumEvalVo")
    public void setApiEipHumEvalVo(java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipHumEvalVo> apiEipHumEvalVo){
        this.apiEipHumEvalVo = apiEipHumEvalVo;
    }

    @ElVoField(physicalName = "apiEipHumRewardVo")
    public java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipHumRewardVo> getApiEipHumRewardVo(){
        return apiEipHumRewardVo;
    }

    @ElVoField(physicalName = "apiEipHumRewardVo")
    public void setApiEipHumRewardVo(java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipHumRewardVo> apiEipHumRewardVo){
        this.apiEipHumRewardVo = apiEipHumRewardVo;
    }

    @ElVoField(physicalName = "apiEipResReportVo")
    public java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipResReportVo> getApiEipResReportVo(){
        return apiEipResReportVo;
    }

    @ElVoField(physicalName = "apiEipResReportVo")
    public void setApiEipResReportVo(java.util.List<kr.re.kitech.biz.api.server.vo.ApiEipResReportVo> apiEipResReportVo){
        this.apiEipResReportVo = apiEipResReportVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiEipBizListVo [");
        sb.append("apiEipMNoteVoList").append("=").append(apiEipMNoteVoList).append(",");
        sb.append("apiEipEduDeadlineVo").append("=").append(apiEipEduDeadlineVo).append(",");
        sb.append("apiEipMRoomReqVo").append("=").append(apiEipMRoomReqVo).append(",");
        sb.append("apiEipDormReqVo").append("=").append(apiEipDormReqVo).append(",");
        sb.append("apiEipWrkGoalTimeVo").append("=").append(apiEipWrkGoalTimeVo).append(",");
        sb.append("apiEipTripUnproVo").append("=").append(apiEipTripUnproVo).append(",");
        sb.append("apiEipCardUnproVo").append("=").append(apiEipCardUnproVo).append(",");
        sb.append("apiEipHumCompVo").append("=").append(apiEipHumCompVo).append(",");
        sb.append("apiEipPosiCompVo").append("=").append(apiEipPosiCompVo).append(",");
        sb.append("apiEipPrjInfoVo").append("=").append(apiEipPrjInfoVo).append(",");
        sb.append("apiEipTripPayVo").append("=").append(apiEipTripPayVo).append(",");
        sb.append("apiEipVacaReqVo").append("=").append(apiEipVacaReqVo).append(",");
        sb.append("apiEipAnnPayProVo").append("=").append(apiEipAnnPayProVo).append(",");
        sb.append("apiEipCardPayProVo").append("=").append(apiEipCardPayProVo).append(",");
        sb.append("apiEipHumAppoVo").append("=").append(apiEipHumAppoVo).append(",");
        sb.append("apiEipHumEducVo").append("=").append(apiEipHumEducVo).append(",");
        sb.append("apiEipHumEvalVo").append("=").append(apiEipHumEvalVo).append(",");
        sb.append("apiEipHumRewardVo").append("=").append(apiEipHumRewardVo).append(",");
        sb.append("apiEipResReportVo").append("=").append(apiEipResReportVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; apiEipMNoteVoList != null && i < apiEipMNoteVoList.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipMNoteVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipMNoteVo)apiEipMNoteVoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; apiEipEduDeadlineVo != null && i < apiEipEduDeadlineVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipEduDeadlineVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipEduDeadlineVo)apiEipEduDeadlineVo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; apiEipMRoomReqVo != null && i < apiEipMRoomReqVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipMRoomReqVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipMRoomReqVo)apiEipMRoomReqVo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; apiEipDormReqVo != null && i < apiEipDormReqVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipDormReqVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipDormReqVo)apiEipDormReqVo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; apiEipWrkGoalTimeVo != null && i < apiEipWrkGoalTimeVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipWrkGoalTimeVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipWrkGoalTimeVo)apiEipWrkGoalTimeVo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; apiEipTripUnproVo != null && i < apiEipTripUnproVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipTripUnproVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipTripUnproVo)apiEipTripUnproVo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; apiEipCardUnproVo != null && i < apiEipCardUnproVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipCardUnproVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipCardUnproVo)apiEipCardUnproVo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; apiEipHumCompVo != null && i < apiEipHumCompVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipHumCompVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipHumCompVo)apiEipHumCompVo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; apiEipPosiCompVo != null && i < apiEipPosiCompVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipPosiCompVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipPosiCompVo)apiEipPosiCompVo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; apiEipPrjInfoVo != null && i < apiEipPrjInfoVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipPrjInfoVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipPrjInfoVo)apiEipPrjInfoVo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; apiEipTripPayVo != null && i < apiEipTripPayVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipTripPayVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipTripPayVo)apiEipTripPayVo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; apiEipVacaReqVo != null && i < apiEipVacaReqVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipVacaReqVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipVacaReqVo)apiEipVacaReqVo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; apiEipAnnPayProVo != null && i < apiEipAnnPayProVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipAnnPayProVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipAnnPayProVo)apiEipAnnPayProVo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; apiEipCardPayProVo != null && i < apiEipCardPayProVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipCardPayProVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipCardPayProVo)apiEipCardPayProVo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; apiEipHumAppoVo != null && i < apiEipHumAppoVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipHumAppoVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipHumAppoVo)apiEipHumAppoVo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; apiEipHumEducVo != null && i < apiEipHumEducVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipHumEducVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipHumEducVo)apiEipHumEducVo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; apiEipHumEvalVo != null && i < apiEipHumEvalVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipHumEvalVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipHumEvalVo)apiEipHumEvalVo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; apiEipHumRewardVo != null && i < apiEipHumRewardVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipHumRewardVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipHumRewardVo)apiEipHumRewardVo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; apiEipResReportVo != null && i < apiEipResReportVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipResReportVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipResReportVo)apiEipResReportVo.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; apiEipMNoteVoList != null && i < apiEipMNoteVoList.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipMNoteVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipMNoteVo)apiEipMNoteVoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; apiEipEduDeadlineVo != null && i < apiEipEduDeadlineVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipEduDeadlineVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipEduDeadlineVo)apiEipEduDeadlineVo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; apiEipMRoomReqVo != null && i < apiEipMRoomReqVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipMRoomReqVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipMRoomReqVo)apiEipMRoomReqVo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; apiEipDormReqVo != null && i < apiEipDormReqVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipDormReqVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipDormReqVo)apiEipDormReqVo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; apiEipWrkGoalTimeVo != null && i < apiEipWrkGoalTimeVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipWrkGoalTimeVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipWrkGoalTimeVo)apiEipWrkGoalTimeVo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; apiEipTripUnproVo != null && i < apiEipTripUnproVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipTripUnproVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipTripUnproVo)apiEipTripUnproVo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; apiEipCardUnproVo != null && i < apiEipCardUnproVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipCardUnproVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipCardUnproVo)apiEipCardUnproVo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; apiEipHumCompVo != null && i < apiEipHumCompVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipHumCompVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipHumCompVo)apiEipHumCompVo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; apiEipPosiCompVo != null && i < apiEipPosiCompVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipPosiCompVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipPosiCompVo)apiEipPosiCompVo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; apiEipPrjInfoVo != null && i < apiEipPrjInfoVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipPrjInfoVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipPrjInfoVo)apiEipPrjInfoVo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; apiEipTripPayVo != null && i < apiEipTripPayVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipTripPayVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipTripPayVo)apiEipTripPayVo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; apiEipVacaReqVo != null && i < apiEipVacaReqVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipVacaReqVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipVacaReqVo)apiEipVacaReqVo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; apiEipAnnPayProVo != null && i < apiEipAnnPayProVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipAnnPayProVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipAnnPayProVo)apiEipAnnPayProVo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; apiEipCardPayProVo != null && i < apiEipCardPayProVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipCardPayProVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipCardPayProVo)apiEipCardPayProVo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; apiEipHumAppoVo != null && i < apiEipHumAppoVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipHumAppoVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipHumAppoVo)apiEipHumAppoVo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; apiEipHumEducVo != null && i < apiEipHumEducVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipHumEducVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipHumEducVo)apiEipHumEducVo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; apiEipHumEvalVo != null && i < apiEipHumEvalVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipHumEvalVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipHumEvalVo)apiEipHumEvalVo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; apiEipHumRewardVo != null && i < apiEipHumRewardVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipHumRewardVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipHumRewardVo)apiEipHumRewardVo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; apiEipResReportVo != null && i < apiEipResReportVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiEipResReportVo vo = (kr.re.kitech.biz.api.server.vo.ApiEipResReportVo)apiEipResReportVo.get(i);
            vo._xStreamDec();	 
        }
    }


}
