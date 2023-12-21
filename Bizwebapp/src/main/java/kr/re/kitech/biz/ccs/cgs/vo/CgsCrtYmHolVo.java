package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "연차생성 Vo")
public class CgsCrtYmHolVo extends kr.re.kitech.biz.api.server.vo.biz.CgsAnnlHoliVo {
    private static final long serialVersionUID = 1L;

    public CgsCrtYmHolVo(){
    }

    @ElDtoField(logicalName = "입사일자", physicalName = "entr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entr_ymd;

    @ElDtoField(logicalName = "금년 사용 연차", physicalName = "cur_hol_used", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double cur_hol_used;

    @ElDtoField(logicalName = "전년 잔여 연차", physicalName = "pre_hol_remain", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double pre_hol_remain;

    @ElDtoField(logicalName = "금년 소멸예정연차", physicalName = "expired_cnt", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double expired_cnt;

    @ElDtoField(logicalName = "전년 소멸 연차", physicalName = "pre_expire_qty", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double pre_expire_qty;

    @ElDtoField(logicalName = "보상 이월", physicalName = "cryfwd_com_qty", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double cryfwd_com_qty;

    @ElDtoField(logicalName = "전년 소멸예정연차가 차감된 저축연차", physicalName = "cryfwd_anal_qty", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double cryfwd_anal_qty;

    @ElDtoField(logicalName = "보상 생성", physicalName = "creat_com_qty", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double creat_com_qty;

    @ElDtoField(logicalName = "보상 사용", physicalName = "use_com_qty", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double use_com_qty;

    @ElDtoField(logicalName = "금년 생성연차", physicalName = "creat_anal_qty", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double creat_anal_qty;

    @ElDtoField(logicalName = "", physicalName = "creat_mhold_qty", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double creat_mhold_qty;

    @ElDtoField(logicalName = "잔여연차", physicalName = "remidr_anal_qty", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double remidr_anal_qty;

    @ElDtoField(logicalName = "", physicalName = "duty_use_anal_qty", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double duty_use_anal_qty;

    @ElDtoField(logicalName = "", physicalName = "use_anal_qty", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double use_anal_qty;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "", physicalName = "final_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String final_ymd;

    @ElDtoField(logicalName = "", physicalName = "create_save_qty00", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double create_save_qty00;

    @ElDtoField(logicalName = "계산년도-1년 저축", physicalName = "create_save_qty01", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long create_save_qty01;

    @ElDtoField(logicalName = "계산년도-2년 저축", physicalName = "create_save_qty02", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double create_save_qty02;

    @ElDtoField(logicalName = "계산년도-3년 저축", physicalName = "create_save_qty03", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double create_save_qty03;

    @ElDtoField(logicalName = "계산년도-4년 저축", physicalName = "create_save_qty04", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double create_save_qty04;

    @ElDtoField(logicalName = "계산년도-5년 저축", physicalName = "create_save_qty05", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double create_save_qty05;

    @ElDtoField(logicalName = "계산년도-6년 저축", physicalName = "create_save_qty06", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double create_save_qty06;

    @ElDtoField(logicalName = "계산년도-7년 저축", physicalName = "create_save_qty07", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double create_save_qty07;

    @ElDtoField(logicalName = "계산년도-8년 저축", physicalName = "create_save_qty08", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double create_save_qty08;

    @ElDtoField(logicalName = "계산년도-9년 저축", physicalName = "create_save_qty09", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double create_save_qty09;

    @ElDtoField(logicalName = "계산년도-10년 저축", physicalName = "create_save_qty10", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double create_save_qty10;

    @ElDtoField(logicalName = "당해년 사용연차", physicalName = "use_save_qty00", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double use_save_qty00;

    @ElDtoField(logicalName = "저축1년 사용", physicalName = "use_save_qty01", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double use_save_qty01;

    @ElDtoField(logicalName = "저축2년 사용", physicalName = "use_save_qty02", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double use_save_qty02;

    @ElDtoField(logicalName = "저축3년 사용", physicalName = "use_save_qty03", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double use_save_qty03;

    @ElDtoField(logicalName = "저축4년 사용", physicalName = "use_save_qty04", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double use_save_qty04;

    @ElDtoField(logicalName = "저축5년 사용", physicalName = "use_save_qty05", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double use_save_qty05;

    @ElDtoField(logicalName = "저축6년 사용", physicalName = "use_save_qty06", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double use_save_qty06;

    @ElDtoField(logicalName = "저축7년 사용", physicalName = "use_save_qty07", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double use_save_qty07;

    @ElDtoField(logicalName = "저축8년 사용", physicalName = "use_save_qty08", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double use_save_qty08;

    @ElDtoField(logicalName = "저축9년 사용", physicalName = "use_save_qty09", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double use_save_qty09;

    @ElDtoField(logicalName = "저축10년 사용", physicalName = "use_save_qty10", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double use_save_qty10;

    @ElDtoField(logicalName = "", physicalName = "remidr_save_qty01", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double remidr_save_qty01;

    @ElDtoField(logicalName = "", physicalName = "remidr_save_qty02", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double remidr_save_qty02;

    @ElDtoField(logicalName = "", physicalName = "remidr_save_qty03", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double remidr_save_qty03;

    @ElDtoField(logicalName = "", physicalName = "remidr_save_qty04", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double remidr_save_qty04;

    @ElDtoField(logicalName = "", physicalName = "remidr_save_qty05", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double remidr_save_qty05;

    @ElDtoField(logicalName = "", physicalName = "remidr_save_qty06", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double remidr_save_qty06;

    @ElDtoField(logicalName = "", physicalName = "remidr_save_qty07", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double remidr_save_qty07;

    @ElDtoField(logicalName = "", physicalName = "remidr_save_qty08", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double remidr_save_qty08;

    @ElDtoField(logicalName = "", physicalName = "remidr_save_qty09", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double remidr_save_qty09;

    @ElDtoField(logicalName = "", physicalName = "remidr_save_qty10", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double remidr_save_qty10;

    @ElDtoField(logicalName = "아르바이트 대상자 랭크", physicalName = "rank", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rank;

    @ElVoField(physicalName = "entr_ymd")
    public String getEntr_ymd(){
        return entr_ymd;
    }

    @ElVoField(physicalName = "entr_ymd")
    public void setEntr_ymd(String entr_ymd){
        this.entr_ymd = entr_ymd;
    }

    @ElVoField(physicalName = "cur_hol_used")
    public double getCur_hol_used(){
        return cur_hol_used;
    }

    @ElVoField(physicalName = "cur_hol_used")
    public void setCur_hol_used(double cur_hol_used){
        this.cur_hol_used = cur_hol_used;
    }

    @ElVoField(physicalName = "pre_hol_remain")
    public double getPre_hol_remain(){
        return pre_hol_remain;
    }

    @ElVoField(physicalName = "pre_hol_remain")
    public void setPre_hol_remain(double pre_hol_remain){
        this.pre_hol_remain = pre_hol_remain;
    }

    @ElVoField(physicalName = "expired_cnt")
    public double getExpired_cnt(){
        return expired_cnt;
    }

    @ElVoField(physicalName = "expired_cnt")
    public void setExpired_cnt(double expired_cnt){
        this.expired_cnt = expired_cnt;
    }

    @ElVoField(physicalName = "pre_expire_qty")
    public double getPre_expire_qty(){
        return pre_expire_qty;
    }

    @ElVoField(physicalName = "pre_expire_qty")
    public void setPre_expire_qty(double pre_expire_qty){
        this.pre_expire_qty = pre_expire_qty;
    }

    @ElVoField(physicalName = "cryfwd_com_qty")
    public double getCryfwd_com_qty(){
        return cryfwd_com_qty;
    }

    @ElVoField(physicalName = "cryfwd_com_qty")
    public void setCryfwd_com_qty(double cryfwd_com_qty){
        this.cryfwd_com_qty = cryfwd_com_qty;
    }

    @ElVoField(physicalName = "cryfwd_anal_qty")
    public double getCryfwd_anal_qty(){
        return cryfwd_anal_qty;
    }

    @ElVoField(physicalName = "cryfwd_anal_qty")
    public void setCryfwd_anal_qty(double cryfwd_anal_qty){
        this.cryfwd_anal_qty = cryfwd_anal_qty;
    }

    @ElVoField(physicalName = "creat_com_qty")
    public double getCreat_com_qty(){
        return creat_com_qty;
    }

    @ElVoField(physicalName = "creat_com_qty")
    public void setCreat_com_qty(double creat_com_qty){
        this.creat_com_qty = creat_com_qty;
    }

    @ElVoField(physicalName = "use_com_qty")
    public double getUse_com_qty(){
        return use_com_qty;
    }

    @ElVoField(physicalName = "use_com_qty")
    public void setUse_com_qty(double use_com_qty){
        this.use_com_qty = use_com_qty;
    }

    @ElVoField(physicalName = "creat_anal_qty")
    public double getCreat_anal_qty(){
        return creat_anal_qty;
    }

    @ElVoField(physicalName = "creat_anal_qty")
    public void setCreat_anal_qty(double creat_anal_qty){
        this.creat_anal_qty = creat_anal_qty;
    }

    @ElVoField(physicalName = "creat_mhold_qty")
    public double getCreat_mhold_qty(){
        return creat_mhold_qty;
    }

    @ElVoField(physicalName = "creat_mhold_qty")
    public void setCreat_mhold_qty(double creat_mhold_qty){
        this.creat_mhold_qty = creat_mhold_qty;
    }

    @ElVoField(physicalName = "remidr_anal_qty")
    public double getRemidr_anal_qty(){
        return remidr_anal_qty;
    }

    @ElVoField(physicalName = "remidr_anal_qty")
    public void setRemidr_anal_qty(double remidr_anal_qty){
        this.remidr_anal_qty = remidr_anal_qty;
    }

    @ElVoField(physicalName = "duty_use_anal_qty")
    public double getDuty_use_anal_qty(){
        return duty_use_anal_qty;
    }

    @ElVoField(physicalName = "duty_use_anal_qty")
    public void setDuty_use_anal_qty(double duty_use_anal_qty){
        this.duty_use_anal_qty = duty_use_anal_qty;
    }

    @ElVoField(physicalName = "use_anal_qty")
    public double getUse_anal_qty(){
        return use_anal_qty;
    }

    @ElVoField(physicalName = "use_anal_qty")
    public void setUse_anal_qty(double use_anal_qty){
        this.use_anal_qty = use_anal_qty;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "final_ymd")
    public String getFinal_ymd(){
        return final_ymd;
    }

    @ElVoField(physicalName = "final_ymd")
    public void setFinal_ymd(String final_ymd){
        this.final_ymd = final_ymd;
    }

    @ElVoField(physicalName = "create_save_qty00")
    public double getCreate_save_qty00(){
        return create_save_qty00;
    }

    @ElVoField(physicalName = "create_save_qty00")
    public void setCreate_save_qty00(double create_save_qty00){
        this.create_save_qty00 = create_save_qty00;
    }

    @ElVoField(physicalName = "create_save_qty01")
    public long getCreate_save_qty01(){
        return create_save_qty01;
    }

    @ElVoField(physicalName = "create_save_qty01")
    public void setCreate_save_qty01(long create_save_qty01){
        this.create_save_qty01 = create_save_qty01;
    }

    @ElVoField(physicalName = "create_save_qty02")
    public double getCreate_save_qty02(){
        return create_save_qty02;
    }

    @ElVoField(physicalName = "create_save_qty02")
    public void setCreate_save_qty02(double create_save_qty02){
        this.create_save_qty02 = create_save_qty02;
    }

    @ElVoField(physicalName = "create_save_qty03")
    public double getCreate_save_qty03(){
        return create_save_qty03;
    }

    @ElVoField(physicalName = "create_save_qty03")
    public void setCreate_save_qty03(double create_save_qty03){
        this.create_save_qty03 = create_save_qty03;
    }

    @ElVoField(physicalName = "create_save_qty04")
    public double getCreate_save_qty04(){
        return create_save_qty04;
    }

    @ElVoField(physicalName = "create_save_qty04")
    public void setCreate_save_qty04(double create_save_qty04){
        this.create_save_qty04 = create_save_qty04;
    }

    @ElVoField(physicalName = "create_save_qty05")
    public double getCreate_save_qty05(){
        return create_save_qty05;
    }

    @ElVoField(physicalName = "create_save_qty05")
    public void setCreate_save_qty05(double create_save_qty05){
        this.create_save_qty05 = create_save_qty05;
    }

    @ElVoField(physicalName = "create_save_qty06")
    public double getCreate_save_qty06(){
        return create_save_qty06;
    }

    @ElVoField(physicalName = "create_save_qty06")
    public void setCreate_save_qty06(double create_save_qty06){
        this.create_save_qty06 = create_save_qty06;
    }

    @ElVoField(physicalName = "create_save_qty07")
    public double getCreate_save_qty07(){
        return create_save_qty07;
    }

    @ElVoField(physicalName = "create_save_qty07")
    public void setCreate_save_qty07(double create_save_qty07){
        this.create_save_qty07 = create_save_qty07;
    }

    @ElVoField(physicalName = "create_save_qty08")
    public double getCreate_save_qty08(){
        return create_save_qty08;
    }

    @ElVoField(physicalName = "create_save_qty08")
    public void setCreate_save_qty08(double create_save_qty08){
        this.create_save_qty08 = create_save_qty08;
    }

    @ElVoField(physicalName = "create_save_qty09")
    public double getCreate_save_qty09(){
        return create_save_qty09;
    }

    @ElVoField(physicalName = "create_save_qty09")
    public void setCreate_save_qty09(double create_save_qty09){
        this.create_save_qty09 = create_save_qty09;
    }

    @ElVoField(physicalName = "create_save_qty10")
    public double getCreate_save_qty10(){
        return create_save_qty10;
    }

    @ElVoField(physicalName = "create_save_qty10")
    public void setCreate_save_qty10(double create_save_qty10){
        this.create_save_qty10 = create_save_qty10;
    }

    @ElVoField(physicalName = "use_save_qty00")
    public double getUse_save_qty00(){
        return use_save_qty00;
    }

    @ElVoField(physicalName = "use_save_qty00")
    public void setUse_save_qty00(double use_save_qty00){
        this.use_save_qty00 = use_save_qty00;
    }

    @ElVoField(physicalName = "use_save_qty01")
    public double getUse_save_qty01(){
        return use_save_qty01;
    }

    @ElVoField(physicalName = "use_save_qty01")
    public void setUse_save_qty01(double use_save_qty01){
        this.use_save_qty01 = use_save_qty01;
    }

    @ElVoField(physicalName = "use_save_qty02")
    public double getUse_save_qty02(){
        return use_save_qty02;
    }

    @ElVoField(physicalName = "use_save_qty02")
    public void setUse_save_qty02(double use_save_qty02){
        this.use_save_qty02 = use_save_qty02;
    }

    @ElVoField(physicalName = "use_save_qty03")
    public double getUse_save_qty03(){
        return use_save_qty03;
    }

    @ElVoField(physicalName = "use_save_qty03")
    public void setUse_save_qty03(double use_save_qty03){
        this.use_save_qty03 = use_save_qty03;
    }

    @ElVoField(physicalName = "use_save_qty04")
    public double getUse_save_qty04(){
        return use_save_qty04;
    }

    @ElVoField(physicalName = "use_save_qty04")
    public void setUse_save_qty04(double use_save_qty04){
        this.use_save_qty04 = use_save_qty04;
    }

    @ElVoField(physicalName = "use_save_qty05")
    public double getUse_save_qty05(){
        return use_save_qty05;
    }

    @ElVoField(physicalName = "use_save_qty05")
    public void setUse_save_qty05(double use_save_qty05){
        this.use_save_qty05 = use_save_qty05;
    }

    @ElVoField(physicalName = "use_save_qty06")
    public double getUse_save_qty06(){
        return use_save_qty06;
    }

    @ElVoField(physicalName = "use_save_qty06")
    public void setUse_save_qty06(double use_save_qty06){
        this.use_save_qty06 = use_save_qty06;
    }

    @ElVoField(physicalName = "use_save_qty07")
    public double getUse_save_qty07(){
        return use_save_qty07;
    }

    @ElVoField(physicalName = "use_save_qty07")
    public void setUse_save_qty07(double use_save_qty07){
        this.use_save_qty07 = use_save_qty07;
    }

    @ElVoField(physicalName = "use_save_qty08")
    public double getUse_save_qty08(){
        return use_save_qty08;
    }

    @ElVoField(physicalName = "use_save_qty08")
    public void setUse_save_qty08(double use_save_qty08){
        this.use_save_qty08 = use_save_qty08;
    }

    @ElVoField(physicalName = "use_save_qty09")
    public double getUse_save_qty09(){
        return use_save_qty09;
    }

    @ElVoField(physicalName = "use_save_qty09")
    public void setUse_save_qty09(double use_save_qty09){
        this.use_save_qty09 = use_save_qty09;
    }

    @ElVoField(physicalName = "use_save_qty10")
    public double getUse_save_qty10(){
        return use_save_qty10;
    }

    @ElVoField(physicalName = "use_save_qty10")
    public void setUse_save_qty10(double use_save_qty10){
        this.use_save_qty10 = use_save_qty10;
    }

    @ElVoField(physicalName = "remidr_save_qty01")
    public double getRemidr_save_qty01(){
        return remidr_save_qty01;
    }

    @ElVoField(physicalName = "remidr_save_qty01")
    public void setRemidr_save_qty01(double remidr_save_qty01){
        this.remidr_save_qty01 = remidr_save_qty01;
    }

    @ElVoField(physicalName = "remidr_save_qty02")
    public double getRemidr_save_qty02(){
        return remidr_save_qty02;
    }

    @ElVoField(physicalName = "remidr_save_qty02")
    public void setRemidr_save_qty02(double remidr_save_qty02){
        this.remidr_save_qty02 = remidr_save_qty02;
    }

    @ElVoField(physicalName = "remidr_save_qty03")
    public double getRemidr_save_qty03(){
        return remidr_save_qty03;
    }

    @ElVoField(physicalName = "remidr_save_qty03")
    public void setRemidr_save_qty03(double remidr_save_qty03){
        this.remidr_save_qty03 = remidr_save_qty03;
    }

    @ElVoField(physicalName = "remidr_save_qty04")
    public double getRemidr_save_qty04(){
        return remidr_save_qty04;
    }

    @ElVoField(physicalName = "remidr_save_qty04")
    public void setRemidr_save_qty04(double remidr_save_qty04){
        this.remidr_save_qty04 = remidr_save_qty04;
    }

    @ElVoField(physicalName = "remidr_save_qty05")
    public double getRemidr_save_qty05(){
        return remidr_save_qty05;
    }

    @ElVoField(physicalName = "remidr_save_qty05")
    public void setRemidr_save_qty05(double remidr_save_qty05){
        this.remidr_save_qty05 = remidr_save_qty05;
    }

    @ElVoField(physicalName = "remidr_save_qty06")
    public double getRemidr_save_qty06(){
        return remidr_save_qty06;
    }

    @ElVoField(physicalName = "remidr_save_qty06")
    public void setRemidr_save_qty06(double remidr_save_qty06){
        this.remidr_save_qty06 = remidr_save_qty06;
    }

    @ElVoField(physicalName = "remidr_save_qty07")
    public double getRemidr_save_qty07(){
        return remidr_save_qty07;
    }

    @ElVoField(physicalName = "remidr_save_qty07")
    public void setRemidr_save_qty07(double remidr_save_qty07){
        this.remidr_save_qty07 = remidr_save_qty07;
    }

    @ElVoField(physicalName = "remidr_save_qty08")
    public double getRemidr_save_qty08(){
        return remidr_save_qty08;
    }

    @ElVoField(physicalName = "remidr_save_qty08")
    public void setRemidr_save_qty08(double remidr_save_qty08){
        this.remidr_save_qty08 = remidr_save_qty08;
    }

    @ElVoField(physicalName = "remidr_save_qty09")
    public double getRemidr_save_qty09(){
        return remidr_save_qty09;
    }

    @ElVoField(physicalName = "remidr_save_qty09")
    public void setRemidr_save_qty09(double remidr_save_qty09){
        this.remidr_save_qty09 = remidr_save_qty09;
    }

    @ElVoField(physicalName = "remidr_save_qty10")
    public double getRemidr_save_qty10(){
        return remidr_save_qty10;
    }

    @ElVoField(physicalName = "remidr_save_qty10")
    public void setRemidr_save_qty10(double remidr_save_qty10){
        this.remidr_save_qty10 = remidr_save_qty10;
    }

    @ElVoField(physicalName = "rank")
    public String getRank(){
        return rank;
    }

    @ElVoField(physicalName = "rank")
    public void setRank(String rank){
        this.rank = rank;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CgsCrtYmHolVo [");
        sb.append("entr_ymd").append("=").append(entr_ymd).append(",");
        sb.append("cur_hol_used").append("=").append(cur_hol_used).append(",");
        sb.append("pre_hol_remain").append("=").append(pre_hol_remain).append(",");
        sb.append("expired_cnt").append("=").append(expired_cnt).append(",");
        sb.append("pre_expire_qty").append("=").append(pre_expire_qty).append(",");
        sb.append("cryfwd_com_qty").append("=").append(cryfwd_com_qty).append(",");
        sb.append("cryfwd_anal_qty").append("=").append(cryfwd_anal_qty).append(",");
        sb.append("creat_com_qty").append("=").append(creat_com_qty).append(",");
        sb.append("use_com_qty").append("=").append(use_com_qty).append(",");
        sb.append("creat_anal_qty").append("=").append(creat_anal_qty).append(",");
        sb.append("creat_mhold_qty").append("=").append(creat_mhold_qty).append(",");
        sb.append("remidr_anal_qty").append("=").append(remidr_anal_qty).append(",");
        sb.append("duty_use_anal_qty").append("=").append(duty_use_anal_qty).append(",");
        sb.append("use_anal_qty").append("=").append(use_anal_qty).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("final_ymd").append("=").append(final_ymd).append(",");
        sb.append("create_save_qty00").append("=").append(create_save_qty00).append(",");
        sb.append("create_save_qty01").append("=").append(create_save_qty01).append(",");
        sb.append("create_save_qty02").append("=").append(create_save_qty02).append(",");
        sb.append("create_save_qty03").append("=").append(create_save_qty03).append(",");
        sb.append("create_save_qty04").append("=").append(create_save_qty04).append(",");
        sb.append("create_save_qty05").append("=").append(create_save_qty05).append(",");
        sb.append("create_save_qty06").append("=").append(create_save_qty06).append(",");
        sb.append("create_save_qty07").append("=").append(create_save_qty07).append(",");
        sb.append("create_save_qty08").append("=").append(create_save_qty08).append(",");
        sb.append("create_save_qty09").append("=").append(create_save_qty09).append(",");
        sb.append("create_save_qty10").append("=").append(create_save_qty10).append(",");
        sb.append("use_save_qty00").append("=").append(use_save_qty00).append(",");
        sb.append("use_save_qty01").append("=").append(use_save_qty01).append(",");
        sb.append("use_save_qty02").append("=").append(use_save_qty02).append(",");
        sb.append("use_save_qty03").append("=").append(use_save_qty03).append(",");
        sb.append("use_save_qty04").append("=").append(use_save_qty04).append(",");
        sb.append("use_save_qty05").append("=").append(use_save_qty05).append(",");
        sb.append("use_save_qty06").append("=").append(use_save_qty06).append(",");
        sb.append("use_save_qty07").append("=").append(use_save_qty07).append(",");
        sb.append("use_save_qty08").append("=").append(use_save_qty08).append(",");
        sb.append("use_save_qty09").append("=").append(use_save_qty09).append(",");
        sb.append("use_save_qty10").append("=").append(use_save_qty10).append(",");
        sb.append("remidr_save_qty01").append("=").append(remidr_save_qty01).append(",");
        sb.append("remidr_save_qty02").append("=").append(remidr_save_qty02).append(",");
        sb.append("remidr_save_qty03").append("=").append(remidr_save_qty03).append(",");
        sb.append("remidr_save_qty04").append("=").append(remidr_save_qty04).append(",");
        sb.append("remidr_save_qty05").append("=").append(remidr_save_qty05).append(",");
        sb.append("remidr_save_qty06").append("=").append(remidr_save_qty06).append(",");
        sb.append("remidr_save_qty07").append("=").append(remidr_save_qty07).append(",");
        sb.append("remidr_save_qty08").append("=").append(remidr_save_qty08).append(",");
        sb.append("remidr_save_qty09").append("=").append(remidr_save_qty09).append(",");
        sb.append("remidr_save_qty10").append("=").append(remidr_save_qty10).append(",");
        sb.append("rank").append("=").append(rank);
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
