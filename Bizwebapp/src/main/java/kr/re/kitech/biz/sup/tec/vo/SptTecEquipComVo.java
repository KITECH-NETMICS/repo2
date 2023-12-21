package kr.re.kitech.biz.sup.tec.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "기술지원장비공통 Vo")
public class SptTecEquipComVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptTecEquipComVo(){
    }

    @ElDtoField(logicalName = "고객번호", physicalName = "cust_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cust_no;

    @ElDtoField(logicalName = "사용장비", physicalName = "equip_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_cd;

    @ElDtoField(logicalName = "작업시간", physicalName = "job_time", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int job_time;

    @ElDtoField(logicalName = "시료수", physicalName = "treat_qty", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int treat_qty;

    @ElDtoField(logicalName = "작업시작시간", physicalName = "equip_use_start_hour", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_use_start_hour;

    @ElDtoField(logicalName = "작업시작분", physicalName = "equip_use_start_minute", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_use_start_minute;

    @ElDtoField(logicalName = "작업종료시간", physicalName = "equip_use_cls_hour", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_use_cls_hour;

    @ElDtoField(logicalName = "작업종료분", physicalName = "equip_use_cls_minute", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_use_cls_minute;

    @ElVoField(physicalName = "cust_no")
    public String getCust_no(){
        return cust_no;
    }

    @ElVoField(physicalName = "cust_no")
    public void setCust_no(String cust_no){
        this.cust_no = cust_no;
    }

    @ElVoField(physicalName = "equip_cd")
    public String getEquip_cd(){
        return equip_cd;
    }

    @ElVoField(physicalName = "equip_cd")
    public void setEquip_cd(String equip_cd){
        this.equip_cd = equip_cd;
    }

    @ElVoField(physicalName = "job_time")
    public int getJob_time(){
        return job_time;
    }

    @ElVoField(physicalName = "job_time")
    public void setJob_time(int job_time){
        this.job_time = job_time;
    }

    @ElVoField(physicalName = "treat_qty")
    public int getTreat_qty(){
        return treat_qty;
    }

    @ElVoField(physicalName = "treat_qty")
    public void setTreat_qty(int treat_qty){
        this.treat_qty = treat_qty;
    }

    @ElVoField(physicalName = "equip_use_start_hour")
    public String getEquip_use_start_hour(){
        return equip_use_start_hour;
    }

    @ElVoField(physicalName = "equip_use_start_hour")
    public void setEquip_use_start_hour(String equip_use_start_hour){
        this.equip_use_start_hour = equip_use_start_hour;
    }

    @ElVoField(physicalName = "equip_use_start_minute")
    public String getEquip_use_start_minute(){
        return equip_use_start_minute;
    }

    @ElVoField(physicalName = "equip_use_start_minute")
    public void setEquip_use_start_minute(String equip_use_start_minute){
        this.equip_use_start_minute = equip_use_start_minute;
    }

    @ElVoField(physicalName = "equip_use_cls_hour")
    public String getEquip_use_cls_hour(){
        return equip_use_cls_hour;
    }

    @ElVoField(physicalName = "equip_use_cls_hour")
    public void setEquip_use_cls_hour(String equip_use_cls_hour){
        this.equip_use_cls_hour = equip_use_cls_hour;
    }

    @ElVoField(physicalName = "equip_use_cls_minute")
    public String getEquip_use_cls_minute(){
        return equip_use_cls_minute;
    }

    @ElVoField(physicalName = "equip_use_cls_minute")
    public void setEquip_use_cls_minute(String equip_use_cls_minute){
        this.equip_use_cls_minute = equip_use_cls_minute;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptTecEquipComVo [");
        sb.append("cust_no").append("=").append(cust_no).append(",");
        sb.append("equip_cd").append("=").append(equip_cd).append(",");
        sb.append("job_time").append("=").append(job_time).append(",");
        sb.append("treat_qty").append("=").append(treat_qty).append(",");
        sb.append("equip_use_start_hour").append("=").append(equip_use_start_hour).append(",");
        sb.append("equip_use_start_minute").append("=").append(equip_use_start_minute).append(",");
        sb.append("equip_use_cls_hour").append("=").append(equip_use_cls_hour).append(",");
        sb.append("equip_use_cls_minute").append("=").append(equip_use_cls_minute);
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
