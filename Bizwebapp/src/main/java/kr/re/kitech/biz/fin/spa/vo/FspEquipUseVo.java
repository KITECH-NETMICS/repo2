package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "FspEquipUseExp")
public class FspEquipUseVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspEquipUseVo(){
    }

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "useOdr", physicalName = "use_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int use_odr;

    @ElDtoField(logicalName = "job_clsf", physicalName = "job_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_clsf;

    @ElDtoField(logicalName = "rcptPsnSyspayno", physicalName = "rcptPsnSyspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcptPsnSyspayno;

    @ElDtoField(logicalName = "equipNo", physicalName = "equip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_no;

    @ElDtoField(logicalName = "assetName", physicalName = "asset_name", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String asset_name;

    @ElDtoField(logicalName = "useStartYmd", physicalName = "use_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_start_ymd;

    @ElDtoField(logicalName = "useClsYmd", physicalName = "use_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_cls_ymd;

    @ElDtoField(logicalName = "useStartTime", physicalName = "use_start_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_start_time;

    @ElDtoField(logicalName = "useClsTime", physicalName = "use_cls_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_cls_time;

    @ElDtoField(logicalName = "useTime", physicalName = "use_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_time;

    @ElDtoField(logicalName = "useUnitPrice", physicalName = "use_unit_price", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_unit_price;

    @ElDtoField(logicalName = "useAmt", physicalName = "use_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_amt;

    @ElDtoField(logicalName = "treatQty", physicalName = "treat_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String treat_qty;

    @ElDtoField(logicalName = "useStartMinute", physicalName = "use_start_minute", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_start_minute;

    @ElDtoField(logicalName = "useClsMinute", physicalName = "use_cls_minute", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_cls_minute;

    @ElDtoField(logicalName = "use_clsf", physicalName = "use_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_clsf;

    @ElDtoField(logicalName = "use_usg", physicalName = "use_usg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_usg;

    @ElDtoField(logicalName = "use_dept", physicalName = "use_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_dept;

    @ElDtoField(logicalName = "use_dept_new_ymd", physicalName = "use_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_dept_new_ymd;

    @ElDtoField(logicalName = "req_psn", physicalName = "req_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn;

    @ElDtoField(logicalName = "regst_syspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "updt_syspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;

    @ElDtoField(logicalName = "cnt", physicalName = "cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int cnt;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "use_odr")
    public int getUse_odr(){
        return use_odr;
    }

    @ElVoField(physicalName = "use_odr")
    public void setUse_odr(int use_odr){
        this.use_odr = use_odr;
    }

    @ElVoField(physicalName = "job_clsf")
    public String getJob_clsf(){
        return job_clsf;
    }

    @ElVoField(physicalName = "job_clsf")
    public void setJob_clsf(String job_clsf){
        this.job_clsf = job_clsf;
    }

    @ElVoField(physicalName = "rcptPsnSyspayno")
    public String getRcptPsnSyspayno(){
        return rcptPsnSyspayno;
    }

    @ElVoField(physicalName = "rcptPsnSyspayno")
    public void setRcptPsnSyspayno(String rcptPsnSyspayno){
        this.rcptPsnSyspayno = rcptPsnSyspayno;
    }

    @ElVoField(physicalName = "equip_no")
    public String getEquip_no(){
        return equip_no;
    }

    @ElVoField(physicalName = "equip_no")
    public void setEquip_no(String equip_no){
        this.equip_no = equip_no;
    }

    @ElVoField(physicalName = "asset_name")
    public String getAsset_name(){
        return asset_name;
    }

    @ElVoField(physicalName = "asset_name")
    public void setAsset_name(String asset_name){
        this.asset_name = asset_name;
    }

    @ElVoField(physicalName = "use_start_ymd")
    public String getUse_start_ymd(){
        return use_start_ymd;
    }

    @ElVoField(physicalName = "use_start_ymd")
    public void setUse_start_ymd(String use_start_ymd){
        this.use_start_ymd = use_start_ymd;
    }

    @ElVoField(physicalName = "use_cls_ymd")
    public String getUse_cls_ymd(){
        return use_cls_ymd;
    }

    @ElVoField(physicalName = "use_cls_ymd")
    public void setUse_cls_ymd(String use_cls_ymd){
        this.use_cls_ymd = use_cls_ymd;
    }

    @ElVoField(physicalName = "use_start_time")
    public String getUse_start_time(){
        return use_start_time;
    }

    @ElVoField(physicalName = "use_start_time")
    public void setUse_start_time(String use_start_time){
        this.use_start_time = use_start_time;
    }

    @ElVoField(physicalName = "use_cls_time")
    public String getUse_cls_time(){
        return use_cls_time;
    }

    @ElVoField(physicalName = "use_cls_time")
    public void setUse_cls_time(String use_cls_time){
        this.use_cls_time = use_cls_time;
    }

    @ElVoField(physicalName = "use_time")
    public String getUse_time(){
        return use_time;
    }

    @ElVoField(physicalName = "use_time")
    public void setUse_time(String use_time){
        this.use_time = use_time;
    }

    @ElVoField(physicalName = "use_unit_price")
    public String getUse_unit_price(){
        return use_unit_price;
    }

    @ElVoField(physicalName = "use_unit_price")
    public void setUse_unit_price(String use_unit_price){
        this.use_unit_price = use_unit_price;
    }

    @ElVoField(physicalName = "use_amt")
    public String getUse_amt(){
        return use_amt;
    }

    @ElVoField(physicalName = "use_amt")
    public void setUse_amt(String use_amt){
        this.use_amt = use_amt;
    }

    @ElVoField(physicalName = "treat_qty")
    public String getTreat_qty(){
        return treat_qty;
    }

    @ElVoField(physicalName = "treat_qty")
    public void setTreat_qty(String treat_qty){
        this.treat_qty = treat_qty;
    }

    @ElVoField(physicalName = "use_start_minute")
    public String getUse_start_minute(){
        return use_start_minute;
    }

    @ElVoField(physicalName = "use_start_minute")
    public void setUse_start_minute(String use_start_minute){
        this.use_start_minute = use_start_minute;
    }

    @ElVoField(physicalName = "use_cls_minute")
    public String getUse_cls_minute(){
        return use_cls_minute;
    }

    @ElVoField(physicalName = "use_cls_minute")
    public void setUse_cls_minute(String use_cls_minute){
        this.use_cls_minute = use_cls_minute;
    }

    @ElVoField(physicalName = "use_clsf")
    public String getUse_clsf(){
        return use_clsf;
    }

    @ElVoField(physicalName = "use_clsf")
    public void setUse_clsf(String use_clsf){
        this.use_clsf = use_clsf;
    }

    @ElVoField(physicalName = "use_usg")
    public String getUse_usg(){
        return use_usg;
    }

    @ElVoField(physicalName = "use_usg")
    public void setUse_usg(String use_usg){
        this.use_usg = use_usg;
    }

    @ElVoField(physicalName = "use_dept")
    public String getUse_dept(){
        return use_dept;
    }

    @ElVoField(physicalName = "use_dept")
    public void setUse_dept(String use_dept){
        this.use_dept = use_dept;
    }

    @ElVoField(physicalName = "use_dept_new_ymd")
    public String getUse_dept_new_ymd(){
        return use_dept_new_ymd;
    }

    @ElVoField(physicalName = "use_dept_new_ymd")
    public void setUse_dept_new_ymd(String use_dept_new_ymd){
        this.use_dept_new_ymd = use_dept_new_ymd;
    }

    @ElVoField(physicalName = "req_psn")
    public String getReq_psn(){
        return req_psn;
    }

    @ElVoField(physicalName = "req_psn")
    public void setReq_psn(String req_psn){
        this.req_psn = req_psn;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public String getUpdt_syspayno(){
        return updt_syspayno;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public void setUpdt_syspayno(String updt_syspayno){
        this.updt_syspayno = updt_syspayno;
    }

    @ElVoField(physicalName = "cnt")
    public int getCnt(){
        return cnt;
    }

    @ElVoField(physicalName = "cnt")
    public void setCnt(int cnt){
        this.cnt = cnt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspEquipUseVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("use_odr").append("=").append(use_odr).append(",");
        sb.append("job_clsf").append("=").append(job_clsf).append(",");
        sb.append("rcptPsnSyspayno").append("=").append(rcptPsnSyspayno).append(",");
        sb.append("equip_no").append("=").append(equip_no).append(",");
        sb.append("asset_name").append("=").append(asset_name).append(",");
        sb.append("use_start_ymd").append("=").append(use_start_ymd).append(",");
        sb.append("use_cls_ymd").append("=").append(use_cls_ymd).append(",");
        sb.append("use_start_time").append("=").append(use_start_time).append(",");
        sb.append("use_cls_time").append("=").append(use_cls_time).append(",");
        sb.append("use_time").append("=").append(use_time).append(",");
        sb.append("use_unit_price").append("=").append(use_unit_price).append(",");
        sb.append("use_amt").append("=").append(use_amt).append(",");
        sb.append("treat_qty").append("=").append(treat_qty).append(",");
        sb.append("use_start_minute").append("=").append(use_start_minute).append(",");
        sb.append("use_cls_minute").append("=").append(use_cls_minute).append(",");
        sb.append("use_clsf").append("=").append(use_clsf).append(",");
        sb.append("use_usg").append("=").append(use_usg).append(",");
        sb.append("use_dept").append("=").append(use_dept).append(",");
        sb.append("use_dept_new_ymd").append("=").append(use_dept_new_ymd).append(",");
        sb.append("req_psn").append("=").append(req_psn).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
        sb.append("cnt").append("=").append(cnt);
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
