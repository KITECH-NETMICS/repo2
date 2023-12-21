package kr.re.kitech.biz.fin.tax.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "인수자산 계획마스터 Vo")
public class FinAcqAsetPlanMstrVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FinAcqAsetPlanMstrVo(){
    }

    @ElDtoField(logicalName = "자산번호", physicalName = "aset_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_no;

    @ElDtoField(logicalName = "자산명", physicalName = "aset_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_nm;

    @ElDtoField(logicalName = "취득일자", physicalName = "intro_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intro_ymd;

    @ElDtoField(logicalName = "인수금액", physicalName = "intro_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intro_amt;

    @ElDtoField(logicalName = "계획생성여부", physicalName = "plan_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String plan_yn;

    @ElDtoField(logicalName = "계획번호", physicalName = "plan_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String plan_req_no;

    @ElDtoField(logicalName = "계획기간", physicalName = "plan_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String plan_ymd;

    @ElDtoField(logicalName = "총공급가액", physicalName = "suply_value", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double suply_value;

    @ElDtoField(logicalName = "총부가세액", physicalName = "add_tax", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double add_tax;

    @ElDtoField(logicalName = "도입일자", physicalName = "acq_intro_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String acq_intro_ymd;

    @ElDtoField(logicalName = "취득일자시작일자", physicalName = "from_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String from_ymd;

    @ElDtoField(logicalName = "취득일자종료일자", physicalName = "to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String to_ymd;

    @ElDtoField(logicalName = "자산구분", physicalName = "aset_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_clsf;

    @ElDtoField(logicalName = "담당자", physicalName = "chrg_info", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chrg_info;

    @ElDtoField(logicalName = "계획시작일", physicalName = "plan_st_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String plan_st_ymd;

    @ElDtoField(logicalName = "계획종료일", physicalName = "plan_ed_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String plan_ed_ymd;

    @ElVoField(physicalName = "aset_no")
    public String getAset_no(){
        return aset_no;
    }

    @ElVoField(physicalName = "aset_no")
    public void setAset_no(String aset_no){
        this.aset_no = aset_no;
    }

    @ElVoField(physicalName = "aset_nm")
    public String getAset_nm(){
        return aset_nm;
    }

    @ElVoField(physicalName = "aset_nm")
    public void setAset_nm(String aset_nm){
        this.aset_nm = aset_nm;
    }

    @ElVoField(physicalName = "intro_ymd")
    public String getIntro_ymd(){
        return intro_ymd;
    }

    @ElVoField(physicalName = "intro_ymd")
    public void setIntro_ymd(String intro_ymd){
        this.intro_ymd = intro_ymd;
    }

    @ElVoField(physicalName = "intro_amt")
    public String getIntro_amt(){
        return intro_amt;
    }

    @ElVoField(physicalName = "intro_amt")
    public void setIntro_amt(String intro_amt){
        this.intro_amt = intro_amt;
    }

    @ElVoField(physicalName = "plan_yn")
    public String getPlan_yn(){
        return plan_yn;
    }

    @ElVoField(physicalName = "plan_yn")
    public void setPlan_yn(String plan_yn){
        this.plan_yn = plan_yn;
    }

    @ElVoField(physicalName = "plan_req_no")
    public String getPlan_req_no(){
        return plan_req_no;
    }

    @ElVoField(physicalName = "plan_req_no")
    public void setPlan_req_no(String plan_req_no){
        this.plan_req_no = plan_req_no;
    }

    @ElVoField(physicalName = "plan_ymd")
    public String getPlan_ymd(){
        return plan_ymd;
    }

    @ElVoField(physicalName = "plan_ymd")
    public void setPlan_ymd(String plan_ymd){
        this.plan_ymd = plan_ymd;
    }

    @ElVoField(physicalName = "suply_value")
    public double getSuply_value(){
        return suply_value;
    }

    @ElVoField(physicalName = "suply_value")
    public void setSuply_value(double suply_value){
        this.suply_value = suply_value;
    }

    @ElVoField(physicalName = "add_tax")
    public double getAdd_tax(){
        return add_tax;
    }

    @ElVoField(physicalName = "add_tax")
    public void setAdd_tax(double add_tax){
        this.add_tax = add_tax;
    }

    @ElVoField(physicalName = "acq_intro_ymd")
    public String getAcq_intro_ymd(){
        return acq_intro_ymd;
    }

    @ElVoField(physicalName = "acq_intro_ymd")
    public void setAcq_intro_ymd(String acq_intro_ymd){
        this.acq_intro_ymd = acq_intro_ymd;
    }

    @ElVoField(physicalName = "from_ymd")
    public String getFrom_ymd(){
        return from_ymd;
    }

    @ElVoField(physicalName = "from_ymd")
    public void setFrom_ymd(String from_ymd){
        this.from_ymd = from_ymd;
    }

    @ElVoField(physicalName = "to_ymd")
    public String getTo_ymd(){
        return to_ymd;
    }

    @ElVoField(physicalName = "to_ymd")
    public void setTo_ymd(String to_ymd){
        this.to_ymd = to_ymd;
    }

    @ElVoField(physicalName = "aset_clsf")
    public String getAset_clsf(){
        return aset_clsf;
    }

    @ElVoField(physicalName = "aset_clsf")
    public void setAset_clsf(String aset_clsf){
        this.aset_clsf = aset_clsf;
    }

    @ElVoField(physicalName = "chrg_info")
    public String getChrg_info(){
        return chrg_info;
    }

    @ElVoField(physicalName = "chrg_info")
    public void setChrg_info(String chrg_info){
        this.chrg_info = chrg_info;
    }

    @ElVoField(physicalName = "plan_st_ymd")
    public String getPlan_st_ymd(){
        return plan_st_ymd;
    }

    @ElVoField(physicalName = "plan_st_ymd")
    public void setPlan_st_ymd(String plan_st_ymd){
        this.plan_st_ymd = plan_st_ymd;
    }

    @ElVoField(physicalName = "plan_ed_ymd")
    public String getPlan_ed_ymd(){
        return plan_ed_ymd;
    }

    @ElVoField(physicalName = "plan_ed_ymd")
    public void setPlan_ed_ymd(String plan_ed_ymd){
        this.plan_ed_ymd = plan_ed_ymd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinAcqAsetPlanMstrVo [");
        sb.append("aset_no").append("=").append(aset_no).append(",");
        sb.append("aset_nm").append("=").append(aset_nm).append(",");
        sb.append("intro_ymd").append("=").append(intro_ymd).append(",");
        sb.append("intro_amt").append("=").append(intro_amt).append(",");
        sb.append("plan_yn").append("=").append(plan_yn).append(",");
        sb.append("plan_req_no").append("=").append(plan_req_no).append(",");
        sb.append("plan_ymd").append("=").append(plan_ymd).append(",");
        sb.append("suply_value").append("=").append(suply_value).append(",");
        sb.append("add_tax").append("=").append(add_tax).append(",");
        sb.append("acq_intro_ymd").append("=").append(acq_intro_ymd).append(",");
        sb.append("from_ymd").append("=").append(from_ymd).append(",");
        sb.append("to_ymd").append("=").append(to_ymd).append(",");
        sb.append("aset_clsf").append("=").append(aset_clsf).append(",");
        sb.append("chrg_info").append("=").append(chrg_info).append(",");
        sb.append("plan_st_ymd").append("=").append(plan_st_ymd).append(",");
        sb.append("plan_ed_ymd").append("=").append(plan_ed_ymd);
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
