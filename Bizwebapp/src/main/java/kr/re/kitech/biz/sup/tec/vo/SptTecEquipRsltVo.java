package kr.re.kitech.biz.sup.tec.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "기술지원장비사용실적정보 Vo")
public class SptTecEquipRsltVo extends kr.re.kitech.biz.sup.tec.vo.SptTecEquipComVo {
    private static final long serialVersionUID = 1L;

    public SptTecEquipRsltVo(){
    }

    @ElDtoField(logicalName = "상담접수번호", physicalName = "cunsl_rcpt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cunsl_rcpt_no;

    @ElDtoField(logicalName = "기술지원접수번호", physicalName = "tech_supt_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_supt_req_no;

    @ElDtoField(logicalName = "일련번호", physicalName = "seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int seq;

    @ElDtoField(logicalName = "자산명", physicalName = "aset_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_nm;

    @ElDtoField(logicalName = "작업시작일자", physicalName = "equip_use_start_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_use_start_daytm;

    @ElDtoField(logicalName = "작업종료일자", physicalName = "equip_use_cls_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_use_cls_daytm;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "자산상태", physicalName = "aset_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_state;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "업종", physicalName = "big_item_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String big_item_clsf;

    @ElDtoField(logicalName = "품목", physicalName = "middle_item_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String middle_item_clsf;

    @ElDtoField(logicalName = "세부품목", physicalName = "small_item_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String small_item_clsf;

    @ElDtoField(logicalName = "장비사용일지신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElVoField(physicalName = "cunsl_rcpt_no")
    public String getCunsl_rcpt_no(){
        return cunsl_rcpt_no;
    }

    @ElVoField(physicalName = "cunsl_rcpt_no")
    public void setCunsl_rcpt_no(String cunsl_rcpt_no){
        this.cunsl_rcpt_no = cunsl_rcpt_no;
    }

    @ElVoField(physicalName = "tech_supt_req_no")
    public String getTech_supt_req_no(){
        return tech_supt_req_no;
    }

    @ElVoField(physicalName = "tech_supt_req_no")
    public void setTech_supt_req_no(String tech_supt_req_no){
        this.tech_supt_req_no = tech_supt_req_no;
    }

    @ElVoField(physicalName = "seq")
    public int getSeq(){
        return seq;
    }

    @ElVoField(physicalName = "seq")
    public void setSeq(int seq){
        this.seq = seq;
    }

    @ElVoField(physicalName = "aset_nm")
    public String getAset_nm(){
        return aset_nm;
    }

    @ElVoField(physicalName = "aset_nm")
    public void setAset_nm(String aset_nm){
        this.aset_nm = aset_nm;
    }

    @ElVoField(physicalName = "equip_use_start_daytm")
    public String getEquip_use_start_daytm(){
        return equip_use_start_daytm;
    }

    @ElVoField(physicalName = "equip_use_start_daytm")
    public void setEquip_use_start_daytm(String equip_use_start_daytm){
        this.equip_use_start_daytm = equip_use_start_daytm;
    }

    @ElVoField(physicalName = "equip_use_cls_daytm")
    public String getEquip_use_cls_daytm(){
        return equip_use_cls_daytm;
    }

    @ElVoField(physicalName = "equip_use_cls_daytm")
    public void setEquip_use_cls_daytm(String equip_use_cls_daytm){
        this.equip_use_cls_daytm = equip_use_cls_daytm;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "aset_state")
    public String getAset_state(){
        return aset_state;
    }

    @ElVoField(physicalName = "aset_state")
    public void setAset_state(String aset_state){
        this.aset_state = aset_state;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "big_item_clsf")
    public String getBig_item_clsf(){
        return big_item_clsf;
    }

    @ElVoField(physicalName = "big_item_clsf")
    public void setBig_item_clsf(String big_item_clsf){
        this.big_item_clsf = big_item_clsf;
    }

    @ElVoField(physicalName = "middle_item_clsf")
    public String getMiddle_item_clsf(){
        return middle_item_clsf;
    }

    @ElVoField(physicalName = "middle_item_clsf")
    public void setMiddle_item_clsf(String middle_item_clsf){
        this.middle_item_clsf = middle_item_clsf;
    }

    @ElVoField(physicalName = "small_item_clsf")
    public String getSmall_item_clsf(){
        return small_item_clsf;
    }

    @ElVoField(physicalName = "small_item_clsf")
    public void setSmall_item_clsf(String small_item_clsf){
        this.small_item_clsf = small_item_clsf;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptTecEquipRsltVo [");
        sb.append("cunsl_rcpt_no").append("=").append(cunsl_rcpt_no).append(",");
        sb.append("tech_supt_req_no").append("=").append(tech_supt_req_no).append(",");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("aset_nm").append("=").append(aset_nm).append(",");
        sb.append("equip_use_start_daytm").append("=").append(equip_use_start_daytm).append(",");
        sb.append("equip_use_cls_daytm").append("=").append(equip_use_cls_daytm).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("aset_state").append("=").append(aset_state).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("big_item_clsf").append("=").append(big_item_clsf).append(",");
        sb.append("middle_item_clsf").append("=").append(middle_item_clsf).append(",");
        sb.append("small_item_clsf").append("=").append(small_item_clsf).append(",");
        sb.append("req_no").append("=").append(req_no);
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
