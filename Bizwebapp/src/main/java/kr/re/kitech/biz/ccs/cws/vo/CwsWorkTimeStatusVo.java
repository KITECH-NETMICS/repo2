package kr.re.kitech.biz.ccs.cws.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "WorkTimeStatusVo")
public class CwsWorkTimeStatusVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CwsWorkTimeStatusVo(){
    }

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "개인번호", physicalName = "empnm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empnm;

    @ElDtoField(logicalName = "기준일", physicalName = "basedate", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String basedate;

    @ElDtoField(logicalName = "근태제외코드", physicalName = "except_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String except_cd;

    @ElDtoField(logicalName = "근태코드", physicalName = "commute_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String commute_cd;

    @ElDtoField(logicalName = "근무형태", physicalName = "work_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_type;

    @ElDtoField(logicalName = "산정기간", physicalName = "preiod_label", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String preiod_label;

    @ElDtoField(logicalName = "목표근무시간", physicalName = "target_times", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String target_times;

    @ElDtoField(logicalName = "현재근무시간", physicalName = "cur_work_tiems", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cur_work_tiems;

    @ElDtoField(logicalName = "근무예정시간", physicalName = "wll_remain_times", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wll_remain_times;

    @ElDtoField(logicalName = "시간외신청시간_전체", physicalName = "extend_times", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String extend_times;

    @ElDtoField(logicalName = "시간외신청시간", physicalName = "ctr_extend_times", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctr_extend_times;

    @ElDtoField(logicalName = "월간보상휴가시간", physicalName = "mon_comp_sav_times", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mon_comp_sav_times;

    @ElDtoField(logicalName = "월간사용보상휴가시간", physicalName = "mon_comp_use_times", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mon_comp_use_times;

    @ElDtoField(logicalName = "주간사용보상휴가시간", physicalName = "wek_comp_use_times", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wek_comp_use_times;

    @ElDtoField(logicalName = "월간대체휴일", physicalName = "mon_alt_days", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mon_alt_days;

    @ElDtoField(logicalName = "주간대체휴일", physicalName = "wek_alt_days", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wek_alt_days;

    @ElDtoField(logicalName = "사용보상휴가", physicalName = "comp_use_times", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String comp_use_times;

    @ElDtoField(logicalName = "대체휴일", physicalName = "alt_days", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String alt_days;

    @ElDtoField(logicalName = "목표시간_분", physicalName = "target_min", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String target_min;

    @ElDtoField(logicalName = "현재시간_분", physicalName = "cur_work_min", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cur_work_min;

    @ElDtoField(logicalName = "남은시간_분", physicalName = "wll_remain_min", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wll_remain_min;

    @ElDtoField(logicalName = "연장시간_분", physicalName = "extend_min", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String extend_min;

    @ElDtoField(logicalName = "시간외신청시간_분", physicalName = "ctr_extend_min", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctr_extend_min;

    @ElDtoField(logicalName = "월간보상휴가_분", physicalName = "mon_comp_sav_min", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mon_comp_sav_min;

    @ElDtoField(logicalName = "월간보상휴가사용_분", physicalName = "mon_comp_use_min", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mon_comp_use_min;

    @ElDtoField(logicalName = "주간보상휴가사용_분", physicalName = "wek_comp_use_min", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wek_comp_use_min;

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "empnm")
    public String getEmpnm(){
        return empnm;
    }

    @ElVoField(physicalName = "empnm")
    public void setEmpnm(String empnm){
        this.empnm = empnm;
    }

    @ElVoField(physicalName = "basedate")
    public String getBasedate(){
        return basedate;
    }

    @ElVoField(physicalName = "basedate")
    public void setBasedate(String basedate){
        this.basedate = basedate;
    }

    @ElVoField(physicalName = "except_cd")
    public String getExcept_cd(){
        return except_cd;
    }

    @ElVoField(physicalName = "except_cd")
    public void setExcept_cd(String except_cd){
        this.except_cd = except_cd;
    }

    @ElVoField(physicalName = "commute_cd")
    public String getCommute_cd(){
        return commute_cd;
    }

    @ElVoField(physicalName = "commute_cd")
    public void setCommute_cd(String commute_cd){
        this.commute_cd = commute_cd;
    }

    @ElVoField(physicalName = "work_type")
    public String getWork_type(){
        return work_type;
    }

    @ElVoField(physicalName = "work_type")
    public void setWork_type(String work_type){
        this.work_type = work_type;
    }

    @ElVoField(physicalName = "preiod_label")
    public String getPreiod_label(){
        return preiod_label;
    }

    @ElVoField(physicalName = "preiod_label")
    public void setPreiod_label(String preiod_label){
        this.preiod_label = preiod_label;
    }

    @ElVoField(physicalName = "target_times")
    public String getTarget_times(){
        return target_times;
    }

    @ElVoField(physicalName = "target_times")
    public void setTarget_times(String target_times){
        this.target_times = target_times;
    }

    @ElVoField(physicalName = "cur_work_tiems")
    public String getCur_work_tiems(){
        return cur_work_tiems;
    }

    @ElVoField(physicalName = "cur_work_tiems")
    public void setCur_work_tiems(String cur_work_tiems){
        this.cur_work_tiems = cur_work_tiems;
    }

    @ElVoField(physicalName = "wll_remain_times")
    public String getWll_remain_times(){
        return wll_remain_times;
    }

    @ElVoField(physicalName = "wll_remain_times")
    public void setWll_remain_times(String wll_remain_times){
        this.wll_remain_times = wll_remain_times;
    }

    @ElVoField(physicalName = "extend_times")
    public String getExtend_times(){
        return extend_times;
    }

    @ElVoField(physicalName = "extend_times")
    public void setExtend_times(String extend_times){
        this.extend_times = extend_times;
    }

    @ElVoField(physicalName = "ctr_extend_times")
    public String getCtr_extend_times(){
        return ctr_extend_times;
    }

    @ElVoField(physicalName = "ctr_extend_times")
    public void setCtr_extend_times(String ctr_extend_times){
        this.ctr_extend_times = ctr_extend_times;
    }

    @ElVoField(physicalName = "mon_comp_sav_times")
    public String getMon_comp_sav_times(){
        return mon_comp_sav_times;
    }

    @ElVoField(physicalName = "mon_comp_sav_times")
    public void setMon_comp_sav_times(String mon_comp_sav_times){
        this.mon_comp_sav_times = mon_comp_sav_times;
    }

    @ElVoField(physicalName = "mon_comp_use_times")
    public String getMon_comp_use_times(){
        return mon_comp_use_times;
    }

    @ElVoField(physicalName = "mon_comp_use_times")
    public void setMon_comp_use_times(String mon_comp_use_times){
        this.mon_comp_use_times = mon_comp_use_times;
    }

    @ElVoField(physicalName = "wek_comp_use_times")
    public String getWek_comp_use_times(){
        return wek_comp_use_times;
    }

    @ElVoField(physicalName = "wek_comp_use_times")
    public void setWek_comp_use_times(String wek_comp_use_times){
        this.wek_comp_use_times = wek_comp_use_times;
    }

    @ElVoField(physicalName = "mon_alt_days")
    public String getMon_alt_days(){
        return mon_alt_days;
    }

    @ElVoField(physicalName = "mon_alt_days")
    public void setMon_alt_days(String mon_alt_days){
        this.mon_alt_days = mon_alt_days;
    }

    @ElVoField(physicalName = "wek_alt_days")
    public String getWek_alt_days(){
        return wek_alt_days;
    }

    @ElVoField(physicalName = "wek_alt_days")
    public void setWek_alt_days(String wek_alt_days){
        this.wek_alt_days = wek_alt_days;
    }

    @ElVoField(physicalName = "comp_use_times")
    public String getComp_use_times(){
        return comp_use_times;
    }

    @ElVoField(physicalName = "comp_use_times")
    public void setComp_use_times(String comp_use_times){
        this.comp_use_times = comp_use_times;
    }

    @ElVoField(physicalName = "alt_days")
    public String getAlt_days(){
        return alt_days;
    }

    @ElVoField(physicalName = "alt_days")
    public void setAlt_days(String alt_days){
        this.alt_days = alt_days;
    }

    @ElVoField(physicalName = "target_min")
    public String getTarget_min(){
        return target_min;
    }

    @ElVoField(physicalName = "target_min")
    public void setTarget_min(String target_min){
        this.target_min = target_min;
    }

    @ElVoField(physicalName = "cur_work_min")
    public String getCur_work_min(){
        return cur_work_min;
    }

    @ElVoField(physicalName = "cur_work_min")
    public void setCur_work_min(String cur_work_min){
        this.cur_work_min = cur_work_min;
    }

    @ElVoField(physicalName = "wll_remain_min")
    public String getWll_remain_min(){
        return wll_remain_min;
    }

    @ElVoField(physicalName = "wll_remain_min")
    public void setWll_remain_min(String wll_remain_min){
        this.wll_remain_min = wll_remain_min;
    }

    @ElVoField(physicalName = "extend_min")
    public String getExtend_min(){
        return extend_min;
    }

    @ElVoField(physicalName = "extend_min")
    public void setExtend_min(String extend_min){
        this.extend_min = extend_min;
    }

    @ElVoField(physicalName = "ctr_extend_min")
    public String getCtr_extend_min(){
        return ctr_extend_min;
    }

    @ElVoField(physicalName = "ctr_extend_min")
    public void setCtr_extend_min(String ctr_extend_min){
        this.ctr_extend_min = ctr_extend_min;
    }

    @ElVoField(physicalName = "mon_comp_sav_min")
    public String getMon_comp_sav_min(){
        return mon_comp_sav_min;
    }

    @ElVoField(physicalName = "mon_comp_sav_min")
    public void setMon_comp_sav_min(String mon_comp_sav_min){
        this.mon_comp_sav_min = mon_comp_sav_min;
    }

    @ElVoField(physicalName = "mon_comp_use_min")
    public String getMon_comp_use_min(){
        return mon_comp_use_min;
    }

    @ElVoField(physicalName = "mon_comp_use_min")
    public void setMon_comp_use_min(String mon_comp_use_min){
        this.mon_comp_use_min = mon_comp_use_min;
    }

    @ElVoField(physicalName = "wek_comp_use_min")
    public String getWek_comp_use_min(){
        return wek_comp_use_min;
    }

    @ElVoField(physicalName = "wek_comp_use_min")
    public void setWek_comp_use_min(String wek_comp_use_min){
        this.wek_comp_use_min = wek_comp_use_min;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CwsWorkTimeStatusVo [");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("empnm").append("=").append(empnm).append(",");
        sb.append("basedate").append("=").append(basedate).append(",");
        sb.append("except_cd").append("=").append(except_cd).append(",");
        sb.append("commute_cd").append("=").append(commute_cd).append(",");
        sb.append("work_type").append("=").append(work_type).append(",");
        sb.append("preiod_label").append("=").append(preiod_label).append(",");
        sb.append("target_times").append("=").append(target_times).append(",");
        sb.append("cur_work_tiems").append("=").append(cur_work_tiems).append(",");
        sb.append("wll_remain_times").append("=").append(wll_remain_times).append(",");
        sb.append("extend_times").append("=").append(extend_times).append(",");
        sb.append("ctr_extend_times").append("=").append(ctr_extend_times).append(",");
        sb.append("mon_comp_sav_times").append("=").append(mon_comp_sav_times).append(",");
        sb.append("mon_comp_use_times").append("=").append(mon_comp_use_times).append(",");
        sb.append("wek_comp_use_times").append("=").append(wek_comp_use_times).append(",");
        sb.append("mon_alt_days").append("=").append(mon_alt_days).append(",");
        sb.append("wek_alt_days").append("=").append(wek_alt_days).append(",");
        sb.append("comp_use_times").append("=").append(comp_use_times).append(",");
        sb.append("alt_days").append("=").append(alt_days).append(",");
        sb.append("target_min").append("=").append(target_min).append(",");
        sb.append("cur_work_min").append("=").append(cur_work_min).append(",");
        sb.append("wll_remain_min").append("=").append(wll_remain_min).append(",");
        sb.append("extend_min").append("=").append(extend_min).append(",");
        sb.append("ctr_extend_min").append("=").append(ctr_extend_min).append(",");
        sb.append("mon_comp_sav_min").append("=").append(mon_comp_sav_min).append(",");
        sb.append("mon_comp_use_min").append("=").append(mon_comp_use_min).append(",");
        sb.append("wek_comp_use_min").append("=").append(wek_comp_use_min);
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
