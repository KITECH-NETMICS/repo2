package kr.re.kitech.biz.api.client.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "CSR 요청/응답 객체")
public class CsrVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CsrVo(){
    }

    @ElDtoField(logicalName = "요청서 제목", physicalName = "changeTitle", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String changeTitle;

    @ElDtoField(logicalName = "희망완료일", physicalName = "expectedDt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expectedDt;

    @ElDtoField(logicalName = "결재 담당자 ID", physicalName = "nextLoginId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nextLoginId;

    @ElDtoField(logicalName = "문서 작성자 ID", physicalName = "userLoginId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String userLoginId;

    @ElDtoField(logicalName = "부서 코드", physicalName = "userDepId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String userDepId;

    @ElDtoField(logicalName = "요청 상세 내용", physicalName = "changeReason", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String changeReason;

    @ElDtoField(logicalName = "업무코드", physicalName = "midCategory", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String midCategory;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attachFileNo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attachFileNo;

    @ElDtoField(logicalName = "인스턴스ID", physicalName = "instId", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int instId;

    @ElDtoField(logicalName = "성공여부", physicalName = "successYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String successYn;

    @ElDtoField(logicalName = "csrType", physicalName = "csrType", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String csrType;

    @ElDtoField(logicalName = "만족도 코드", physicalName = "satisfaction", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int satisfaction;

    @ElDtoField(logicalName = "에러메시지", physicalName = "errMsg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String errMsg;

    @ElDtoField(logicalName = "요청일자", physicalName = "writeDt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String writeDt;

    @ElDtoField(logicalName = "요청자 사번", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "최근변경일", physicalName = "statusDt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String statusDt;

    @ElDtoField(logicalName = "진행상태", physicalName = "status", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String status;

    @ElDtoField(logicalName = "진행상태", physicalName = "statusNm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String statusNm;

    @ElDtoField(logicalName = "작업결과", physicalName = "workResult", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String workResult;

    @ElDtoField(logicalName = "기대효과", physicalName = "expectedEffect", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expectedEffect;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "attachVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> attachVoList;

    @ElDtoField(logicalName = "리스트Vo", physicalName = "csrVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.api.client.vo.CsrListVo> csrVoList;

    @ElDtoField(logicalName = "요청업무", physicalName = "bizNm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bizNm;

    @ElDtoField(logicalName = "(검색)요청일자 시작", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;

    @ElDtoField(logicalName = "(검색)요청일자 종료", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "(검색)요청자 이름", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElVoField(physicalName = "changeTitle")
    public String getChangeTitle(){
        return changeTitle;
    }

    @ElVoField(physicalName = "changeTitle")
    public void setChangeTitle(String changeTitle){
        this.changeTitle = changeTitle;
    }

    @ElVoField(physicalName = "expectedDt")
    public String getExpectedDt(){
        return expectedDt;
    }

    @ElVoField(physicalName = "expectedDt")
    public void setExpectedDt(String expectedDt){
        this.expectedDt = expectedDt;
    }

    @ElVoField(physicalName = "nextLoginId")
    public String getNextLoginId(){
        return nextLoginId;
    }

    @ElVoField(physicalName = "nextLoginId")
    public void setNextLoginId(String nextLoginId){
        this.nextLoginId = nextLoginId;
    }

    @ElVoField(physicalName = "userLoginId")
    public String getUserLoginId(){
        return userLoginId;
    }

    @ElVoField(physicalName = "userLoginId")
    public void setUserLoginId(String userLoginId){
        this.userLoginId = userLoginId;
    }

    @ElVoField(physicalName = "userDepId")
    public String getUserDepId(){
        return userDepId;
    }

    @ElVoField(physicalName = "userDepId")
    public void setUserDepId(String userDepId){
        this.userDepId = userDepId;
    }

    @ElVoField(physicalName = "changeReason")
    public String getChangeReason(){
        return changeReason;
    }

    @ElVoField(physicalName = "changeReason")
    public void setChangeReason(String changeReason){
        this.changeReason = changeReason;
    }

    @ElVoField(physicalName = "midCategory")
    public String getMidCategory(){
        return midCategory;
    }

    @ElVoField(physicalName = "midCategory")
    public void setMidCategory(String midCategory){
        this.midCategory = midCategory;
    }

    @ElVoField(physicalName = "attachFileNo")
    public String getAttachFileNo(){
        return attachFileNo;
    }

    @ElVoField(physicalName = "attachFileNo")
    public void setAttachFileNo(String attachFileNo){
        this.attachFileNo = attachFileNo;
    }

    @ElVoField(physicalName = "instId")
    public int getInstId(){
        return instId;
    }

    @ElVoField(physicalName = "instId")
    public void setInstId(int instId){
        this.instId = instId;
    }

    @ElVoField(physicalName = "successYn")
    public String getSuccessYn(){
        return successYn;
    }

    @ElVoField(physicalName = "successYn")
    public void setSuccessYn(String successYn){
        this.successYn = successYn;
    }

    @ElVoField(physicalName = "csrType")
    public String getCsrType(){
        return csrType;
    }

    @ElVoField(physicalName = "csrType")
    public void setCsrType(String csrType){
        this.csrType = csrType;
    }

    @ElVoField(physicalName = "satisfaction")
    public int getSatisfaction(){
        return satisfaction;
    }

    @ElVoField(physicalName = "satisfaction")
    public void setSatisfaction(int satisfaction){
        this.satisfaction = satisfaction;
    }

    @ElVoField(physicalName = "errMsg")
    public String getErrMsg(){
        return errMsg;
    }

    @ElVoField(physicalName = "errMsg")
    public void setErrMsg(String errMsg){
        this.errMsg = errMsg;
    }

    @ElVoField(physicalName = "writeDt")
    public String getWriteDt(){
        return writeDt;
    }

    @ElVoField(physicalName = "writeDt")
    public void setWriteDt(String writeDt){
        this.writeDt = writeDt;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "statusDt")
    public String getStatusDt(){
        return statusDt;
    }

    @ElVoField(physicalName = "statusDt")
    public void setStatusDt(String statusDt){
        this.statusDt = statusDt;
    }

    @ElVoField(physicalName = "status")
    public String getStatus(){
        return status;
    }

    @ElVoField(physicalName = "status")
    public void setStatus(String status){
        this.status = status;
    }

    @ElVoField(physicalName = "statusNm")
    public String getStatusNm(){
        return statusNm;
    }

    @ElVoField(physicalName = "statusNm")
    public void setStatusNm(String statusNm){
        this.statusNm = statusNm;
    }

    @ElVoField(physicalName = "workResult")
    public String getWorkResult(){
        return workResult;
    }

    @ElVoField(physicalName = "workResult")
    public void setWorkResult(String workResult){
        this.workResult = workResult;
    }

    @ElVoField(physicalName = "expectedEffect")
    public String getExpectedEffect(){
        return expectedEffect;
    }

    @ElVoField(physicalName = "expectedEffect")
    public void setExpectedEffect(String expectedEffect){
        this.expectedEffect = expectedEffect;
    }

    @ElVoField(physicalName = "attachVoList")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getAttachVoList(){
        return attachVoList;
    }

    @ElVoField(physicalName = "attachVoList")
    public void setAttachVoList(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> attachVoList){
        this.attachVoList = attachVoList;
    }

    @ElVoField(physicalName = "csrVoList")
    public java.util.List<kr.re.kitech.biz.api.client.vo.CsrListVo> getCsrVoList(){
        return csrVoList;
    }

    @ElVoField(physicalName = "csrVoList")
    public void setCsrVoList(java.util.List<kr.re.kitech.biz.api.client.vo.CsrListVo> csrVoList){
        this.csrVoList = csrVoList;
    }

    @ElVoField(physicalName = "bizNm")
    public String getBizNm(){
        return bizNm;
    }

    @ElVoField(physicalName = "bizNm")
    public void setBizNm(String bizNm){
        this.bizNm = bizNm;
    }

    @ElVoField(physicalName = "start_ymd")
    public String getStart_ymd(){
        return start_ymd;
    }

    @ElVoField(physicalName = "start_ymd")
    public void setStart_ymd(String start_ymd){
        this.start_ymd = start_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public String getCls_ymd(){
        return cls_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public void setCls_ymd(String cls_ymd){
        this.cls_ymd = cls_ymd;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CsrVo [");
        sb.append("changeTitle").append("=").append(changeTitle).append(",");
        sb.append("expectedDt").append("=").append(expectedDt).append(",");
        sb.append("nextLoginId").append("=").append(nextLoginId).append(",");
        sb.append("userLoginId").append("=").append(userLoginId).append(",");
        sb.append("userDepId").append("=").append(userDepId).append(",");
        sb.append("changeReason").append("=").append(changeReason).append(",");
        sb.append("midCategory").append("=").append(midCategory).append(",");
        sb.append("attachFileNo").append("=").append(attachFileNo).append(",");
        sb.append("instId").append("=").append(instId).append(",");
        sb.append("successYn").append("=").append(successYn).append(",");
        sb.append("csrType").append("=").append(csrType).append(",");
        sb.append("satisfaction").append("=").append(satisfaction).append(",");
        sb.append("errMsg").append("=").append(errMsg).append(",");
        sb.append("writeDt").append("=").append(writeDt).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("statusDt").append("=").append(statusDt).append(",");
        sb.append("status").append("=").append(status).append(",");
        sb.append("statusNm").append("=").append(statusNm).append(",");
        sb.append("workResult").append("=").append(workResult).append(",");
        sb.append("expectedEffect").append("=").append(expectedEffect).append(",");
        sb.append("attachVoList").append("=").append(attachVoList).append(",");
        sb.append("csrVoList").append("=").append(csrVoList).append(",");
        sb.append("bizNm").append("=").append(bizNm).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("nm").append("=").append(nm);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; attachVoList != null && i < attachVoList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)attachVoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; csrVoList != null && i < csrVoList.size() ; i++ ) {
            kr.re.kitech.biz.api.client.vo.CsrListVo vo = (kr.re.kitech.biz.api.client.vo.CsrListVo)csrVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; attachVoList != null && i < attachVoList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)attachVoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; csrVoList != null && i < csrVoList.size() ; i++ ) {
            kr.re.kitech.biz.api.client.vo.CsrListVo vo = (kr.re.kitech.biz.api.client.vo.CsrListVo)csrVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
