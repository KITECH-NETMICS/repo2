package kr.re.kitech.biz.api.server.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = " 교육일정마감VO")
public class ApiEipEduDeadlineVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ApiEipEduDeadlineVo(){
    }

    @ElDtoField(logicalName = "educ_year", physicalName = "educ_year", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String educ_year;

    @ElDtoField(logicalName = "사번", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String empno;

    @ElDtoField(logicalName = "이름", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String nm;

    @ElDtoField(logicalName = "ID", physicalName = "id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String id;

    @ElDtoField(logicalName = "교육구분", physicalName = "cd_gb", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String cd_gb;

    @ElDtoField(logicalName = "교육명", physicalName = "cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String cd_nm;

    @ElDtoField(logicalName = "교육이수마감일", physicalName = "educ_enddate", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String educ_enddate;

    @ElDtoField(logicalName = "디데이", physicalName = "dday", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String dday;

    @ElDtoField(logicalName = "의무횟수", physicalName = "duty_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String duty_cnt;

    @ElDtoField(logicalName = "의무시간", physicalName = "duty_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String duty_time;

    @ElDtoField(logicalName = "이수횟수", physicalName = "educ_count", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String educ_count;

    @ElDtoField(logicalName = "이수시간", physicalName = "educ_times", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String educ_times;

    @ElDtoField(logicalName = "자가이수점검여부", physicalName = "self_chk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String self_chk;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String syspayno;

    @ElDtoField(logicalName = "URL", physicalName = "URL", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String URL;

    @ElVoField(physicalName = "educ_year")
    public String getEduc_year(){
        String ret = this.educ_year;
        return ret;
    }

    @ElVoField(physicalName = "educ_year")
    public void setEduc_year(String educ_year){
        this.educ_year = educ_year;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        String ret = this.empno;
        return ret;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        String ret = this.nm;
        return ret;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "id")
    public String getId(){
        String ret = this.id;
        return ret;
    }

    @ElVoField(physicalName = "id")
    public void setId(String id){
        this.id = id;
    }

    @ElVoField(physicalName = "cd_gb")
    public String getCd_gb(){
        String ret = this.cd_gb;
        return ret;
    }

    @ElVoField(physicalName = "cd_gb")
    public void setCd_gb(String cd_gb){
        this.cd_gb = cd_gb;
    }

    @ElVoField(physicalName = "cd_nm")
    public String getCd_nm(){
        String ret = this.cd_nm;
        return ret;
    }

    @ElVoField(physicalName = "cd_nm")
    public void setCd_nm(String cd_nm){
        this.cd_nm = cd_nm;
    }

    @ElVoField(physicalName = "educ_enddate")
    public String getEduc_enddate(){
        String ret = this.educ_enddate;
        return ret;
    }

    @ElVoField(physicalName = "educ_enddate")
    public void setEduc_enddate(String educ_enddate){
        this.educ_enddate = educ_enddate;
    }

    @ElVoField(physicalName = "dday")
    public String getDday(){
        String ret = this.dday;
        return ret;
    }

    @ElVoField(physicalName = "dday")
    public void setDday(String dday){
        this.dday = dday;
    }

    @ElVoField(physicalName = "duty_cnt")
    public String getDuty_cnt(){
        String ret = this.duty_cnt;
        return ret;
    }

    @ElVoField(physicalName = "duty_cnt")
    public void setDuty_cnt(String duty_cnt){
        this.duty_cnt = duty_cnt;
    }

    @ElVoField(physicalName = "duty_time")
    public String getDuty_time(){
        String ret = this.duty_time;
        return ret;
    }

    @ElVoField(physicalName = "duty_time")
    public void setDuty_time(String duty_time){
        this.duty_time = duty_time;
    }

    @ElVoField(physicalName = "educ_count")
    public String getEduc_count(){
        String ret = this.educ_count;
        return ret;
    }

    @ElVoField(physicalName = "educ_count")
    public void setEduc_count(String educ_count){
        this.educ_count = educ_count;
    }

    @ElVoField(physicalName = "educ_times")
    public String getEduc_times(){
        String ret = this.educ_times;
        return ret;
    }

    @ElVoField(physicalName = "educ_times")
    public void setEduc_times(String educ_times){
        this.educ_times = educ_times;
    }

    @ElVoField(physicalName = "self_chk")
    public String getSelf_chk(){
        String ret = this.self_chk;
        return ret;
    }

    @ElVoField(physicalName = "self_chk")
    public void setSelf_chk(String self_chk){
        this.self_chk = self_chk;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        String ret = this.syspayno;
        return ret;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "URL")
    public String getURL(){
        String ret = this.URL;
        return ret;
    }

    @ElVoField(physicalName = "URL")
    public void setURL(String URL){
        this.URL = URL;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiEipEduDeadlineVo [");
        sb.append("educ_year").append("=").append(educ_year).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("id").append("=").append(id).append(",");
        sb.append("cd_gb").append("=").append(cd_gb).append(",");
        sb.append("cd_nm").append("=").append(cd_nm).append(",");
        sb.append("educ_enddate").append("=").append(educ_enddate).append(",");
        sb.append("dday").append("=").append(dday).append(",");
        sb.append("duty_cnt").append("=").append(duty_cnt).append(",");
        sb.append("duty_time").append("=").append(duty_time).append(",");
        sb.append("educ_count").append("=").append(educ_count).append(",");
        sb.append("educ_times").append("=").append(educ_times).append(",");
        sb.append("self_chk").append("=").append(self_chk).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("URL").append("=").append(URL);
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
