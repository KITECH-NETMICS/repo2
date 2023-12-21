package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "연구기자재_시작품내역")
public class ResinpmateVo extends kr.re.kitech.biz.com.vo.ResInpPareVo {
    private static final long serialVersionUID = 1L;

    public ResinpmateVo(){
    }

    @ElDtoField(logicalName = "기자재순번", physicalName = "equip_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_odr;

    @ElDtoField(logicalName = "기자재구분", physicalName = "equip_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_clsf;

    @ElDtoField(logicalName = "품명", physicalName = "gdnm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String gdnm;

    @ElDtoField(logicalName = "금액", physicalName = "amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String amt;

    @ElDtoField(logicalName = "수량", physicalName = "qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String qty;

    @ElDtoField(logicalName = "연차", physicalName = "anal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String anal;

    @ElDtoField(logicalName = "ETUB아이디", physicalName = "etub_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String etub_id;

    @ElDtoField(logicalName = "심의구분", physicalName = "consttn_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String consttn_clsf;

    @ElDtoField(logicalName = "심의여부기관구분", physicalName = "consttn_plce_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String consttn_plce_clsf;

    @ElDtoField(logicalName = "미심의사유", physicalName = "consttn_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String consttn_resn;

    @ElDtoField(logicalName = "심의기관", physicalName = "consttn_plce", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String consttn_plce;

    @ElDtoField(logicalName = "심의번호", physicalName = "consttn_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String consttn_no;

    @ElDtoField(logicalName = "심의일자", physicalName = "consttn_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String consttn_ymd;

    @ElDtoField(logicalName = "첨부파일", physicalName = "attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file;

    @ElDtoField(logicalName = "기자재구분명", physicalName = "equip_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_clsf_nm;

    @ElDtoField(logicalName = "구매요구번호", physicalName = "pur_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_req_no;

    @ElVoField(physicalName = "equip_odr")
    public String getEquip_odr(){
        return equip_odr;
    }

    @ElVoField(physicalName = "equip_odr")
    public void setEquip_odr(String equip_odr){
        this.equip_odr = equip_odr;
    }

    @ElVoField(physicalName = "equip_clsf")
    public String getEquip_clsf(){
        return equip_clsf;
    }

    @ElVoField(physicalName = "equip_clsf")
    public void setEquip_clsf(String equip_clsf){
        this.equip_clsf = equip_clsf;
    }

    @ElVoField(physicalName = "gdnm")
    public String getGdnm(){
        return gdnm;
    }

    @ElVoField(physicalName = "gdnm")
    public void setGdnm(String gdnm){
        this.gdnm = gdnm;
    }

    @ElVoField(physicalName = "amt")
    public String getAmt(){
        return amt;
    }

    @ElVoField(physicalName = "amt")
    public void setAmt(String amt){
        this.amt = amt;
    }

    @ElVoField(physicalName = "qty")
    public String getQty(){
        return qty;
    }

    @ElVoField(physicalName = "qty")
    public void setQty(String qty){
        this.qty = qty;
    }

    @ElVoField(physicalName = "anal")
    public String getAnal(){
        return anal;
    }

    @ElVoField(physicalName = "anal")
    public void setAnal(String anal){
        this.anal = anal;
    }

    @ElVoField(physicalName = "etub_id")
    public String getEtub_id(){
        return etub_id;
    }

    @ElVoField(physicalName = "etub_id")
    public void setEtub_id(String etub_id){
        this.etub_id = etub_id;
    }

    @ElVoField(physicalName = "consttn_clsf")
    public String getConsttn_clsf(){
        return consttn_clsf;
    }

    @ElVoField(physicalName = "consttn_clsf")
    public void setConsttn_clsf(String consttn_clsf){
        this.consttn_clsf = consttn_clsf;
    }

    @ElVoField(physicalName = "consttn_plce_clsf")
    public String getConsttn_plce_clsf(){
        return consttn_plce_clsf;
    }

    @ElVoField(physicalName = "consttn_plce_clsf")
    public void setConsttn_plce_clsf(String consttn_plce_clsf){
        this.consttn_plce_clsf = consttn_plce_clsf;
    }

    @ElVoField(physicalName = "consttn_resn")
    public String getConsttn_resn(){
        return consttn_resn;
    }

    @ElVoField(physicalName = "consttn_resn")
    public void setConsttn_resn(String consttn_resn){
        this.consttn_resn = consttn_resn;
    }

    @ElVoField(physicalName = "consttn_plce")
    public String getConsttn_plce(){
        return consttn_plce;
    }

    @ElVoField(physicalName = "consttn_plce")
    public void setConsttn_plce(String consttn_plce){
        this.consttn_plce = consttn_plce;
    }

    @ElVoField(physicalName = "consttn_no")
    public String getConsttn_no(){
        return consttn_no;
    }

    @ElVoField(physicalName = "consttn_no")
    public void setConsttn_no(String consttn_no){
        this.consttn_no = consttn_no;
    }

    @ElVoField(physicalName = "consttn_ymd")
    public String getConsttn_ymd(){
        return consttn_ymd;
    }

    @ElVoField(physicalName = "consttn_ymd")
    public void setConsttn_ymd(String consttn_ymd){
        this.consttn_ymd = consttn_ymd;
    }

    @ElVoField(physicalName = "attach_file")
    public String getAttach_file(){
        return attach_file;
    }

    @ElVoField(physicalName = "attach_file")
    public void setAttach_file(String attach_file){
        this.attach_file = attach_file;
    }

    @ElVoField(physicalName = "equip_clsf_nm")
    public String getEquip_clsf_nm(){
        return equip_clsf_nm;
    }

    @ElVoField(physicalName = "equip_clsf_nm")
    public void setEquip_clsf_nm(String equip_clsf_nm){
        this.equip_clsf_nm = equip_clsf_nm;
    }

    @ElVoField(physicalName = "pur_req_no")
    public String getPur_req_no(){
        return pur_req_no;
    }

    @ElVoField(physicalName = "pur_req_no")
    public void setPur_req_no(String pur_req_no){
        this.pur_req_no = pur_req_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResinpmateVo [");
        sb.append("equip_odr").append("=").append(equip_odr).append(",");
        sb.append("equip_clsf").append("=").append(equip_clsf).append(",");
        sb.append("gdnm").append("=").append(gdnm).append(",");
        sb.append("amt").append("=").append(amt).append(",");
        sb.append("qty").append("=").append(qty).append(",");
        sb.append("anal").append("=").append(anal).append(",");
        sb.append("etub_id").append("=").append(etub_id).append(",");
        sb.append("consttn_clsf").append("=").append(consttn_clsf).append(",");
        sb.append("consttn_plce_clsf").append("=").append(consttn_plce_clsf).append(",");
        sb.append("consttn_resn").append("=").append(consttn_resn).append(",");
        sb.append("consttn_plce").append("=").append(consttn_plce).append(",");
        sb.append("consttn_no").append("=").append(consttn_no).append(",");
        sb.append("consttn_ymd").append("=").append(consttn_ymd).append(",");
        sb.append("attach_file").append("=").append(attach_file).append(",");
        sb.append("equip_clsf_nm").append("=").append(equip_clsf_nm).append(",");
        sb.append("pur_req_no").append("=").append(pur_req_no);
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
