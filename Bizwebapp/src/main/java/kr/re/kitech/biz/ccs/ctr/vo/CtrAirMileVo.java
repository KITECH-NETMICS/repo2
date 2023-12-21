package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "항공사별 개인 마일리지 Vo")
public class CtrAirMileVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CtrAirMileVo(){
    }

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "항공사", physicalName = "air_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String air_cd;

    @ElDtoField(logicalName = "신청마일리지", physicalName = "req_mile", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int req_mile;

    @ElDtoField(logicalName = "(구)신청마일리지", physicalName = "cu_req_mile", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int cu_req_mile;

    @ElDtoField(logicalName = "사용마일리지", physicalName = "use_mile", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int use_mile;

    @ElDtoField(logicalName = "(구)사용마일리지", physicalName = "cu_use_mile", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int cu_use_mile;

    @ElDtoField(logicalName = "ext_mile", physicalName = "ext_mile", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int ext_mile;

    @ElDtoField(logicalName = "전체마일리지", physicalName = "totl_mile", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int totl_mile;

    @ElDtoField(logicalName = "(구)공적생성마일리지", physicalName = "cu_pub_new_mile", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int cu_pub_new_mile;

    @ElDtoField(logicalName = "공적생성마일리지", physicalName = "pub_new_mile", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int pub_new_mile;

    @ElDtoField(logicalName = "이용가능마일리지", physicalName = "able_mile", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int able_mile;

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "air_cd")
    public String getAir_cd(){
        return air_cd;
    }

    @ElVoField(physicalName = "air_cd")
    public void setAir_cd(String air_cd){
        this.air_cd = air_cd;
    }

    @ElVoField(physicalName = "req_mile")
    public int getReq_mile(){
        return req_mile;
    }

    @ElVoField(physicalName = "req_mile")
    public void setReq_mile(int req_mile){
        this.req_mile = req_mile;
    }

    @ElVoField(physicalName = "cu_req_mile")
    public int getCu_req_mile(){
        return cu_req_mile;
    }

    @ElVoField(physicalName = "cu_req_mile")
    public void setCu_req_mile(int cu_req_mile){
        this.cu_req_mile = cu_req_mile;
    }

    @ElVoField(physicalName = "use_mile")
    public int getUse_mile(){
        return use_mile;
    }

    @ElVoField(physicalName = "use_mile")
    public void setUse_mile(int use_mile){
        this.use_mile = use_mile;
    }

    @ElVoField(physicalName = "cu_use_mile")
    public int getCu_use_mile(){
        return cu_use_mile;
    }

    @ElVoField(physicalName = "cu_use_mile")
    public void setCu_use_mile(int cu_use_mile){
        this.cu_use_mile = cu_use_mile;
    }

    @ElVoField(physicalName = "ext_mile")
    public int getExt_mile(){
        return ext_mile;
    }

    @ElVoField(physicalName = "ext_mile")
    public void setExt_mile(int ext_mile){
        this.ext_mile = ext_mile;
    }

    @ElVoField(physicalName = "totl_mile")
    public int getTotl_mile(){
        return totl_mile;
    }

    @ElVoField(physicalName = "totl_mile")
    public void setTotl_mile(int totl_mile){
        this.totl_mile = totl_mile;
    }

    @ElVoField(physicalName = "cu_pub_new_mile")
    public int getCu_pub_new_mile(){
        return cu_pub_new_mile;
    }

    @ElVoField(physicalName = "cu_pub_new_mile")
    public void setCu_pub_new_mile(int cu_pub_new_mile){
        this.cu_pub_new_mile = cu_pub_new_mile;
    }

    @ElVoField(physicalName = "pub_new_mile")
    public int getPub_new_mile(){
        return pub_new_mile;
    }

    @ElVoField(physicalName = "pub_new_mile")
    public void setPub_new_mile(int pub_new_mile){
        this.pub_new_mile = pub_new_mile;
    }

    @ElVoField(physicalName = "able_mile")
    public int getAble_mile(){
        return able_mile;
    }

    @ElVoField(physicalName = "able_mile")
    public void setAble_mile(int able_mile){
        this.able_mile = able_mile;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrAirMileVo [");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("air_cd").append("=").append(air_cd).append(",");
        sb.append("req_mile").append("=").append(req_mile).append(",");
        sb.append("cu_req_mile").append("=").append(cu_req_mile).append(",");
        sb.append("use_mile").append("=").append(use_mile).append(",");
        sb.append("cu_use_mile").append("=").append(cu_use_mile).append(",");
        sb.append("ext_mile").append("=").append(ext_mile).append(",");
        sb.append("totl_mile").append("=").append(totl_mile).append(",");
        sb.append("cu_pub_new_mile").append("=").append(cu_pub_new_mile).append(",");
        sb.append("pub_new_mile").append("=").append(pub_new_mile).append(",");
        sb.append("able_mile").append("=").append(able_mile);
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
