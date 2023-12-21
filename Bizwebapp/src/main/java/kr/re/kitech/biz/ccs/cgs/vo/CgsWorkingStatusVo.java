package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "CgsWorkingStatusExp")
public class CgsWorkingStatusVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CgsWorkingStatusVo(){
    }

    @ElDtoField(logicalName = "month", physicalName = "month", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String month;

    @ElDtoField(logicalName = "day", physicalName = "day", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String day;

    @ElDtoField(logicalName = "year", physicalName = "year", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String year;

    @ElDtoField(logicalName = "deptCd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "startYmd", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;

    @ElDtoField(logicalName = "clsYmd", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "title", physicalName = "title", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String title;

    @ElDtoField(logicalName = "scheduleId", physicalName = "scheduleId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String scheduleId;

    @ElDtoField(logicalName = "repeatType", physicalName = "repeatType", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String repeatType;

    @ElDtoField(logicalName = "repeatPeriod", physicalName = "repeatPeriod", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String repeatPeriod;

    @ElDtoField(logicalName = "repeatPeriodOption", physicalName = "repeatPeriodOption", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String repeatPeriodOption;

    @ElDtoField(logicalName = "repeatStartDate", physicalName = "repeatStartDate", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String repeatStartDate;

    @ElDtoField(logicalName = "repeatEndDate", physicalName = "repeatEndDate", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String repeatEndDate;

    @ElDtoField(logicalName = "categoryId", physicalName = "categoryId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String categoryId;

    @ElDtoField(logicalName = "workspaceId", physicalName = "workspaceId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String workspaceId;

    @ElDtoField(logicalName = "place", physicalName = "place", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String place;

    @ElDtoField(logicalName = "wholeday", physicalName = "wholeday", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wholeday;

    @ElDtoField(logicalName = "schedulePublic", physicalName = "schedulePublic", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String schedulePublic;

    @ElDtoField(logicalName = "attendanceRequest", physicalName = "attendanceRequest", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attendanceRequest;

    @ElDtoField(logicalName = "registerId", physicalName = "registerId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String registerId;

    @ElDtoField(logicalName = "sendmail", physicalName = "sendmail", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sendmail;

    @ElDtoField(logicalName = "color", physicalName = "color", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String color;

    @ElDtoField(logicalName = "facilityId", physicalName = "facilityId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String facilityId;

    @ElDtoField(logicalName = "scheduleType", physicalName = "scheduleType", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String scheduleType;

    @ElDtoField(logicalName = "scheduleGroupId", physicalName = "scheduleGroupId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String scheduleGroupId;

    @ElDtoField(logicalName = "categoryName", physicalName = "categoryName", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String categoryName;

    @ElDtoField(logicalName = "icon", physicalName = "icon", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String icon;

    @ElDtoField(logicalName = "participantId", physicalName = "participantId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String participantId;

    @ElDtoField(logicalName = "systemName", physicalName = "system_name", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String system_name;

    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "partTimeHours", physicalName = "partTimeHours", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String partTimeHours;

    @ElDtoField(logicalName = "end_ymd", physicalName = "end_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String end_ymd;

    @ElVoField(physicalName = "month")
    public String getMonth(){
        return month;
    }

    @ElVoField(physicalName = "month")
    public void setMonth(String month){
        this.month = month;
    }

    @ElVoField(physicalName = "day")
    public String getDay(){
        return day;
    }

    @ElVoField(physicalName = "day")
    public void setDay(String day){
        this.day = day;
    }

    @ElVoField(physicalName = "year")
    public String getYear(){
        return year;
    }

    @ElVoField(physicalName = "year")
    public void setYear(String year){
        this.year = year;
    }

    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }

    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
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

    @ElVoField(physicalName = "title")
    public String getTitle(){
        return title;
    }

    @ElVoField(physicalName = "title")
    public void setTitle(String title){
        this.title = title;
    }

    @ElVoField(physicalName = "scheduleId")
    public String getScheduleId(){
        return scheduleId;
    }

    @ElVoField(physicalName = "scheduleId")
    public void setScheduleId(String scheduleId){
        this.scheduleId = scheduleId;
    }

    @ElVoField(physicalName = "repeatType")
    public String getRepeatType(){
        return repeatType;
    }

    @ElVoField(physicalName = "repeatType")
    public void setRepeatType(String repeatType){
        this.repeatType = repeatType;
    }

    @ElVoField(physicalName = "repeatPeriod")
    public String getRepeatPeriod(){
        return repeatPeriod;
    }

    @ElVoField(physicalName = "repeatPeriod")
    public void setRepeatPeriod(String repeatPeriod){
        this.repeatPeriod = repeatPeriod;
    }

    @ElVoField(physicalName = "repeatPeriodOption")
    public String getRepeatPeriodOption(){
        return repeatPeriodOption;
    }

    @ElVoField(physicalName = "repeatPeriodOption")
    public void setRepeatPeriodOption(String repeatPeriodOption){
        this.repeatPeriodOption = repeatPeriodOption;
    }

    @ElVoField(physicalName = "repeatStartDate")
    public String getRepeatStartDate(){
        return repeatStartDate;
    }

    @ElVoField(physicalName = "repeatStartDate")
    public void setRepeatStartDate(String repeatStartDate){
        this.repeatStartDate = repeatStartDate;
    }

    @ElVoField(physicalName = "repeatEndDate")
    public String getRepeatEndDate(){
        return repeatEndDate;
    }

    @ElVoField(physicalName = "repeatEndDate")
    public void setRepeatEndDate(String repeatEndDate){
        this.repeatEndDate = repeatEndDate;
    }

    @ElVoField(physicalName = "categoryId")
    public String getCategoryId(){
        return categoryId;
    }

    @ElVoField(physicalName = "categoryId")
    public void setCategoryId(String categoryId){
        this.categoryId = categoryId;
    }

    @ElVoField(physicalName = "workspaceId")
    public String getWorkspaceId(){
        return workspaceId;
    }

    @ElVoField(physicalName = "workspaceId")
    public void setWorkspaceId(String workspaceId){
        this.workspaceId = workspaceId;
    }

    @ElVoField(physicalName = "place")
    public String getPlace(){
        return place;
    }

    @ElVoField(physicalName = "place")
    public void setPlace(String place){
        this.place = place;
    }

    @ElVoField(physicalName = "wholeday")
    public String getWholeday(){
        return wholeday;
    }

    @ElVoField(physicalName = "wholeday")
    public void setWholeday(String wholeday){
        this.wholeday = wholeday;
    }

    @ElVoField(physicalName = "schedulePublic")
    public String getSchedulePublic(){
        return schedulePublic;
    }

    @ElVoField(physicalName = "schedulePublic")
    public void setSchedulePublic(String schedulePublic){
        this.schedulePublic = schedulePublic;
    }

    @ElVoField(physicalName = "attendanceRequest")
    public String getAttendanceRequest(){
        return attendanceRequest;
    }

    @ElVoField(physicalName = "attendanceRequest")
    public void setAttendanceRequest(String attendanceRequest){
        this.attendanceRequest = attendanceRequest;
    }

    @ElVoField(physicalName = "registerId")
    public String getRegisterId(){
        return registerId;
    }

    @ElVoField(physicalName = "registerId")
    public void setRegisterId(String registerId){
        this.registerId = registerId;
    }

    @ElVoField(physicalName = "sendmail")
    public String getSendmail(){
        return sendmail;
    }

    @ElVoField(physicalName = "sendmail")
    public void setSendmail(String sendmail){
        this.sendmail = sendmail;
    }

    @ElVoField(physicalName = "color")
    public String getColor(){
        return color;
    }

    @ElVoField(physicalName = "color")
    public void setColor(String color){
        this.color = color;
    }

    @ElVoField(physicalName = "facilityId")
    public String getFacilityId(){
        return facilityId;
    }

    @ElVoField(physicalName = "facilityId")
    public void setFacilityId(String facilityId){
        this.facilityId = facilityId;
    }

    @ElVoField(physicalName = "scheduleType")
    public String getScheduleType(){
        return scheduleType;
    }

    @ElVoField(physicalName = "scheduleType")
    public void setScheduleType(String scheduleType){
        this.scheduleType = scheduleType;
    }

    @ElVoField(physicalName = "scheduleGroupId")
    public String getScheduleGroupId(){
        return scheduleGroupId;
    }

    @ElVoField(physicalName = "scheduleGroupId")
    public void setScheduleGroupId(String scheduleGroupId){
        this.scheduleGroupId = scheduleGroupId;
    }

    @ElVoField(physicalName = "categoryName")
    public String getCategoryName(){
        return categoryName;
    }

    @ElVoField(physicalName = "categoryName")
    public void setCategoryName(String categoryName){
        this.categoryName = categoryName;
    }

    @ElVoField(physicalName = "icon")
    public String getIcon(){
        return icon;
    }

    @ElVoField(physicalName = "icon")
    public void setIcon(String icon){
        this.icon = icon;
    }

    @ElVoField(physicalName = "participantId")
    public String getParticipantId(){
        return participantId;
    }

    @ElVoField(physicalName = "participantId")
    public void setParticipantId(String participantId){
        this.participantId = participantId;
    }

    @ElVoField(physicalName = "system_name")
    public String getSystem_name(){
        return system_name;
    }

    @ElVoField(physicalName = "system_name")
    public void setSystem_name(String system_name){
        this.system_name = system_name;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "partTimeHours")
    public String getPartTimeHours(){
        return partTimeHours;
    }

    @ElVoField(physicalName = "partTimeHours")
    public void setPartTimeHours(String partTimeHours){
        this.partTimeHours = partTimeHours;
    }

    @ElVoField(physicalName = "end_ymd")
    public String getEnd_ymd(){
        return end_ymd;
    }

    @ElVoField(physicalName = "end_ymd")
    public void setEnd_ymd(String end_ymd){
        this.end_ymd = end_ymd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CgsWorkingStatusVo [");
        sb.append("month").append("=").append(month).append(",");
        sb.append("day").append("=").append(day).append(",");
        sb.append("year").append("=").append(year).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("title").append("=").append(title).append(",");
        sb.append("scheduleId").append("=").append(scheduleId).append(",");
        sb.append("repeatType").append("=").append(repeatType).append(",");
        sb.append("repeatPeriod").append("=").append(repeatPeriod).append(",");
        sb.append("repeatPeriodOption").append("=").append(repeatPeriodOption).append(",");
        sb.append("repeatStartDate").append("=").append(repeatStartDate).append(",");
        sb.append("repeatEndDate").append("=").append(repeatEndDate).append(",");
        sb.append("categoryId").append("=").append(categoryId).append(",");
        sb.append("workspaceId").append("=").append(workspaceId).append(",");
        sb.append("place").append("=").append(place).append(",");
        sb.append("wholeday").append("=").append(wholeday).append(",");
        sb.append("schedulePublic").append("=").append(schedulePublic).append(",");
        sb.append("attendanceRequest").append("=").append(attendanceRequest).append(",");
        sb.append("registerId").append("=").append(registerId).append(",");
        sb.append("sendmail").append("=").append(sendmail).append(",");
        sb.append("color").append("=").append(color).append(",");
        sb.append("facilityId").append("=").append(facilityId).append(",");
        sb.append("scheduleType").append("=").append(scheduleType).append(",");
        sb.append("scheduleGroupId").append("=").append(scheduleGroupId).append(",");
        sb.append("categoryName").append("=").append(categoryName).append(",");
        sb.append("icon").append("=").append(icon).append(",");
        sb.append("participantId").append("=").append(participantId).append(",");
        sb.append("system_name").append("=").append(system_name).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("partTimeHours").append("=").append(partTimeHours).append(",");
        sb.append("end_ymd").append("=").append(end_ymd);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
    }


    @Override
    public void _xStreamDec() {
    }


}
