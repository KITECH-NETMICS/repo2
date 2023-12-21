package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "휴가원_연월차")
public class CgsAnUlmHoldVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CgsAnUlmHoldVo(){
    }

    @ElDtoField(logicalName = "승인연도", physicalName = "anal_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String anal_yr;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String syspayno;

    @ElDtoField(logicalName = "개인번호", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String empno;

    @ElDtoField(logicalName = "성명", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String nm;

    @ElDtoField(logicalName = "직급코드", physicalName = "posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String posi_cd;

    @ElDtoField(logicalName = "직급명", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String posi_nm;

    @ElDtoField(logicalName = "부서코드", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String dept_cd;

    @ElDtoField(logicalName = "부서명", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String dept_nm;

    @ElDtoField(logicalName = "보상휴가생성", physicalName = "reward_tot", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String reward_tot;

    @ElDtoField(logicalName = "보상휴가사용", physicalName = "reward_use", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String reward_use;

    @ElDtoField(logicalName = "보상휴가잔여", physicalName = "reward_remain", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String reward_remain;

    @ElDtoField(logicalName = "입사일자", physicalName = "entr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String entr_ymd;

    @ElDtoField(logicalName = "입사일자", physicalName = "w_entr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String w_entr_ymd;

    @ElDtoField(logicalName = "생성년차", physicalName = "creat_anal_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String creat_anal_qty;

    @ElDtoField(logicalName = "저축연차", physicalName = "cryfwd_anal_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String cryfwd_anal_qty;

    @ElDtoField(logicalName = "사용연차", physicalName = "use_anal_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String use_anal_qty;

    @ElDtoField(logicalName = "잔여연차", physicalName = "remidr_anal_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String remidr_anal_qty;

    @ElDtoField(logicalName = "소멸예정연차", physicalName = "expire_daycnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String expire_daycnt;

    @ElDtoField(logicalName = "소멸예정일", physicalName = "expire_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String expire_ymd;

    @ElDtoField(logicalName = "의무사용연차", physicalName = "duty_use_anal_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String duty_use_anal_qty;

    @ElDtoField(logicalName = "creat_mhold_qty", physicalName = "creat_mhold_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String creat_mhold_qty;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String rmk;

    @ElDtoField(logicalName = "final_ymd", physicalName = "final_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String final_ymd;

    @ElDtoField(logicalName = "직종코드", physicalName = "occugrp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String occugrp_cd;

    @ElDtoField(logicalName = "직종명", physicalName = "occugrp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String occugrp_nm;

    @ElDtoField(logicalName = "근무형태", physicalName = "commute_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String commute_cd;

    @ElDtoField(logicalName = "상위부서명", physicalName = "up_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String up_dept_nm;

    @ElDtoField(logicalName = "퇴직일자", physicalName = "retire_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String retire_ymd;

    @ElDtoField(logicalName = "잔여연차00", physicalName = "remidr_save_qty00", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String remidr_save_qty00;

    @ElDtoField(logicalName = "잔여연차01", physicalName = "remidr_save_qty01", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String remidr_save_qty01;

    @ElDtoField(logicalName = "잔여연차02", physicalName = "remidr_save_qty02", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String remidr_save_qty02;

    @ElDtoField(logicalName = "잔여연차03", physicalName = "remidr_save_qty03", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String remidr_save_qty03;

    @ElDtoField(logicalName = "잔여연차04", physicalName = "remidr_save_qty04", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String remidr_save_qty04;

    @ElDtoField(logicalName = "잔여연차05", physicalName = "remidr_save_qty05", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String remidr_save_qty05;

    @ElDtoField(logicalName = "잔여연차06", physicalName = "remidr_save_qty06", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String remidr_save_qty06;

    @ElDtoField(logicalName = "잔여연차07", physicalName = "remidr_save_qty07", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String remidr_save_qty07;

    @ElDtoField(logicalName = "잔여연차08", physicalName = "remidr_save_qty08", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String remidr_save_qty08;

    @ElDtoField(logicalName = "잔여연차09", physicalName = "remidr_save_qty09", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String remidr_save_qty09;

    @ElDtoField(logicalName = "잔여연차10", physicalName = "remidr_save_qty10", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String remidr_save_qty10;

    @ElVoField(physicalName = "anal_yr")
    public String getAnal_yr(){
        String ret = this.anal_yr;
        return ret;
    }

    @ElVoField(physicalName = "anal_yr")
    public void setAnal_yr(String anal_yr){
        this.anal_yr = anal_yr;
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

    @ElVoField(physicalName = "posi_cd")
    public String getPosi_cd(){
        String ret = this.posi_cd;
        return ret;
    }

    @ElVoField(physicalName = "posi_cd")
    public void setPosi_cd(String posi_cd){
        this.posi_cd = posi_cd;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        String ret = this.posi_nm;
        return ret;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        String ret = this.dept_cd;
        return ret;
    }

    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        String ret = this.dept_nm;
        return ret;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "reward_tot")
    public String getReward_tot(){
        String ret = this.reward_tot;
        return ret;
    }

    @ElVoField(physicalName = "reward_tot")
    public void setReward_tot(String reward_tot){
        this.reward_tot = reward_tot;
    }

    @ElVoField(physicalName = "reward_use")
    public String getReward_use(){
        String ret = this.reward_use;
        return ret;
    }

    @ElVoField(physicalName = "reward_use")
    public void setReward_use(String reward_use){
        this.reward_use = reward_use;
    }

    @ElVoField(physicalName = "reward_remain")
    public String getReward_remain(){
        String ret = this.reward_remain;
        return ret;
    }

    @ElVoField(physicalName = "reward_remain")
    public void setReward_remain(String reward_remain){
        this.reward_remain = reward_remain;
    }

    @ElVoField(physicalName = "entr_ymd")
    public String getEntr_ymd(){
        String ret = this.entr_ymd;
        return ret;
    }

    @ElVoField(physicalName = "entr_ymd")
    public void setEntr_ymd(String entr_ymd){
        this.entr_ymd = entr_ymd;
    }

    @ElVoField(physicalName = "w_entr_ymd")
    public String getW_entr_ymd(){
        String ret = this.w_entr_ymd;
        return ret;
    }

    @ElVoField(physicalName = "w_entr_ymd")
    public void setW_entr_ymd(String w_entr_ymd){
        this.w_entr_ymd = w_entr_ymd;
    }

    @ElVoField(physicalName = "creat_anal_qty")
    public String getCreat_anal_qty(){
        String ret = this.creat_anal_qty;
        return ret;
    }

    @ElVoField(physicalName = "creat_anal_qty")
    public void setCreat_anal_qty(String creat_anal_qty){
        this.creat_anal_qty = creat_anal_qty;
    }

    @ElVoField(physicalName = "cryfwd_anal_qty")
    public String getCryfwd_anal_qty(){
        String ret = this.cryfwd_anal_qty;
        return ret;
    }

    @ElVoField(physicalName = "cryfwd_anal_qty")
    public void setCryfwd_anal_qty(String cryfwd_anal_qty){
        this.cryfwd_anal_qty = cryfwd_anal_qty;
    }

    @ElVoField(physicalName = "use_anal_qty")
    public String getUse_anal_qty(){
        String ret = this.use_anal_qty;
        return ret;
    }

    @ElVoField(physicalName = "use_anal_qty")
    public void setUse_anal_qty(String use_anal_qty){
        this.use_anal_qty = use_anal_qty;
    }

    @ElVoField(physicalName = "remidr_anal_qty")
    public String getRemidr_anal_qty(){
        String ret = this.remidr_anal_qty;
        return ret;
    }

    @ElVoField(physicalName = "remidr_anal_qty")
    public void setRemidr_anal_qty(String remidr_anal_qty){
        this.remidr_anal_qty = remidr_anal_qty;
    }

    @ElVoField(physicalName = "expire_daycnt")
    public String getExpire_daycnt(){
        String ret = this.expire_daycnt;
        return ret;
    }

    @ElVoField(physicalName = "expire_daycnt")
    public void setExpire_daycnt(String expire_daycnt){
        this.expire_daycnt = expire_daycnt;
    }

    @ElVoField(physicalName = "expire_ymd")
    public String getExpire_ymd(){
        String ret = this.expire_ymd;
        return ret;
    }

    @ElVoField(physicalName = "expire_ymd")
    public void setExpire_ymd(String expire_ymd){
        this.expire_ymd = expire_ymd;
    }

    @ElVoField(physicalName = "duty_use_anal_qty")
    public String getDuty_use_anal_qty(){
        String ret = this.duty_use_anal_qty;
        return ret;
    }

    @ElVoField(physicalName = "duty_use_anal_qty")
    public void setDuty_use_anal_qty(String duty_use_anal_qty){
        this.duty_use_anal_qty = duty_use_anal_qty;
    }

    @ElVoField(physicalName = "creat_mhold_qty")
    public String getCreat_mhold_qty(){
        String ret = this.creat_mhold_qty;
        return ret;
    }

    @ElVoField(physicalName = "creat_mhold_qty")
    public void setCreat_mhold_qty(String creat_mhold_qty){
        this.creat_mhold_qty = creat_mhold_qty;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        String ret = this.rmk;
        return ret;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "final_ymd")
    public String getFinal_ymd(){
        String ret = this.final_ymd;
        return ret;
    }

    @ElVoField(physicalName = "final_ymd")
    public void setFinal_ymd(String final_ymd){
        this.final_ymd = final_ymd;
    }

    @ElVoField(physicalName = "occugrp_cd")
    public String getOccugrp_cd(){
        String ret = this.occugrp_cd;
        return ret;
    }

    @ElVoField(physicalName = "occugrp_cd")
    public void setOccugrp_cd(String occugrp_cd){
        this.occugrp_cd = occugrp_cd;
    }

    @ElVoField(physicalName = "occugrp_nm")
    public String getOccugrp_nm(){
        String ret = this.occugrp_nm;
        return ret;
    }

    @ElVoField(physicalName = "occugrp_nm")
    public void setOccugrp_nm(String occugrp_nm){
        this.occugrp_nm = occugrp_nm;
    }

    @ElVoField(physicalName = "commute_cd")
    public String getCommute_cd(){
        String ret = this.commute_cd;
        return ret;
    }

    @ElVoField(physicalName = "commute_cd")
    public void setCommute_cd(String commute_cd){
        this.commute_cd = commute_cd;
    }

    @ElVoField(physicalName = "up_dept_nm")
    public String getUp_dept_nm(){
        String ret = this.up_dept_nm;
        return ret;
    }

    @ElVoField(physicalName = "up_dept_nm")
    public void setUp_dept_nm(String up_dept_nm){
        this.up_dept_nm = up_dept_nm;
    }

    @ElVoField(physicalName = "retire_ymd")
    public String getRetire_ymd(){
        String ret = this.retire_ymd;
        return ret;
    }

    @ElVoField(physicalName = "retire_ymd")
    public void setRetire_ymd(String retire_ymd){
        this.retire_ymd = retire_ymd;
    }

    @ElVoField(physicalName = "remidr_save_qty00")
    public String getRemidr_save_qty00(){
        String ret = this.remidr_save_qty00;
        return ret;
    }

    @ElVoField(physicalName = "remidr_save_qty00")
    public void setRemidr_save_qty00(String remidr_save_qty00){
        this.remidr_save_qty00 = remidr_save_qty00;
    }

    @ElVoField(physicalName = "remidr_save_qty01")
    public String getRemidr_save_qty01(){
        String ret = this.remidr_save_qty01;
        return ret;
    }

    @ElVoField(physicalName = "remidr_save_qty01")
    public void setRemidr_save_qty01(String remidr_save_qty01){
        this.remidr_save_qty01 = remidr_save_qty01;
    }

    @ElVoField(physicalName = "remidr_save_qty02")
    public String getRemidr_save_qty02(){
        String ret = this.remidr_save_qty02;
        return ret;
    }

    @ElVoField(physicalName = "remidr_save_qty02")
    public void setRemidr_save_qty02(String remidr_save_qty02){
        this.remidr_save_qty02 = remidr_save_qty02;
    }

    @ElVoField(physicalName = "remidr_save_qty03")
    public String getRemidr_save_qty03(){
        String ret = this.remidr_save_qty03;
        return ret;
    }

    @ElVoField(physicalName = "remidr_save_qty03")
    public void setRemidr_save_qty03(String remidr_save_qty03){
        this.remidr_save_qty03 = remidr_save_qty03;
    }

    @ElVoField(physicalName = "remidr_save_qty04")
    public String getRemidr_save_qty04(){
        String ret = this.remidr_save_qty04;
        return ret;
    }

    @ElVoField(physicalName = "remidr_save_qty04")
    public void setRemidr_save_qty04(String remidr_save_qty04){
        this.remidr_save_qty04 = remidr_save_qty04;
    }

    @ElVoField(physicalName = "remidr_save_qty05")
    public String getRemidr_save_qty05(){
        String ret = this.remidr_save_qty05;
        return ret;
    }

    @ElVoField(physicalName = "remidr_save_qty05")
    public void setRemidr_save_qty05(String remidr_save_qty05){
        this.remidr_save_qty05 = remidr_save_qty05;
    }

    @ElVoField(physicalName = "remidr_save_qty06")
    public String getRemidr_save_qty06(){
        String ret = this.remidr_save_qty06;
        return ret;
    }

    @ElVoField(physicalName = "remidr_save_qty06")
    public void setRemidr_save_qty06(String remidr_save_qty06){
        this.remidr_save_qty06 = remidr_save_qty06;
    }

    @ElVoField(physicalName = "remidr_save_qty07")
    public String getRemidr_save_qty07(){
        String ret = this.remidr_save_qty07;
        return ret;
    }

    @ElVoField(physicalName = "remidr_save_qty07")
    public void setRemidr_save_qty07(String remidr_save_qty07){
        this.remidr_save_qty07 = remidr_save_qty07;
    }

    @ElVoField(physicalName = "remidr_save_qty08")
    public String getRemidr_save_qty08(){
        String ret = this.remidr_save_qty08;
        return ret;
    }

    @ElVoField(physicalName = "remidr_save_qty08")
    public void setRemidr_save_qty08(String remidr_save_qty08){
        this.remidr_save_qty08 = remidr_save_qty08;
    }

    @ElVoField(physicalName = "remidr_save_qty09")
    public String getRemidr_save_qty09(){
        String ret = this.remidr_save_qty09;
        return ret;
    }

    @ElVoField(physicalName = "remidr_save_qty09")
    public void setRemidr_save_qty09(String remidr_save_qty09){
        this.remidr_save_qty09 = remidr_save_qty09;
    }

    @ElVoField(physicalName = "remidr_save_qty10")
    public String getRemidr_save_qty10(){
        String ret = this.remidr_save_qty10;
        return ret;
    }

    @ElVoField(physicalName = "remidr_save_qty10")
    public void setRemidr_save_qty10(String remidr_save_qty10){
        this.remidr_save_qty10 = remidr_save_qty10;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CgsAnUlmHoldVo [");
        sb.append("anal_yr").append("=").append(anal_yr).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("posi_cd").append("=").append(posi_cd).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("reward_tot").append("=").append(reward_tot).append(",");
        sb.append("reward_use").append("=").append(reward_use).append(",");
        sb.append("reward_remain").append("=").append(reward_remain).append(",");
        sb.append("entr_ymd").append("=").append(entr_ymd).append(",");
        sb.append("w_entr_ymd").append("=").append(w_entr_ymd).append(",");
        sb.append("creat_anal_qty").append("=").append(creat_anal_qty).append(",");
        sb.append("cryfwd_anal_qty").append("=").append(cryfwd_anal_qty).append(",");
        sb.append("use_anal_qty").append("=").append(use_anal_qty).append(",");
        sb.append("remidr_anal_qty").append("=").append(remidr_anal_qty).append(",");
        sb.append("expire_daycnt").append("=").append(expire_daycnt).append(",");
        sb.append("expire_ymd").append("=").append(expire_ymd).append(",");
        sb.append("duty_use_anal_qty").append("=").append(duty_use_anal_qty).append(",");
        sb.append("creat_mhold_qty").append("=").append(creat_mhold_qty).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("final_ymd").append("=").append(final_ymd).append(",");
        sb.append("occugrp_cd").append("=").append(occugrp_cd).append(",");
        sb.append("occugrp_nm").append("=").append(occugrp_nm).append(",");
        sb.append("commute_cd").append("=").append(commute_cd).append(",");
        sb.append("up_dept_nm").append("=").append(up_dept_nm).append(",");
        sb.append("retire_ymd").append("=").append(retire_ymd).append(",");
        sb.append("remidr_save_qty00").append("=").append(remidr_save_qty00).append(",");
        sb.append("remidr_save_qty01").append("=").append(remidr_save_qty01).append(",");
        sb.append("remidr_save_qty02").append("=").append(remidr_save_qty02).append(",");
        sb.append("remidr_save_qty03").append("=").append(remidr_save_qty03).append(",");
        sb.append("remidr_save_qty04").append("=").append(remidr_save_qty04).append(",");
        sb.append("remidr_save_qty05").append("=").append(remidr_save_qty05).append(",");
        sb.append("remidr_save_qty06").append("=").append(remidr_save_qty06).append(",");
        sb.append("remidr_save_qty07").append("=").append(remidr_save_qty07).append(",");
        sb.append("remidr_save_qty08").append("=").append(remidr_save_qty08).append(",");
        sb.append("remidr_save_qty09").append("=").append(remidr_save_qty09).append(",");
        sb.append("remidr_save_qty10").append("=").append(remidr_save_qty10);
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
