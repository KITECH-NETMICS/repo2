package kr.re.kitech.biz.api.server.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "상벌사항Vo")
public class ApiEipHumRewardVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ApiEipHumRewardVo(){
    }

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "repu_clsf", physicalName = "repu_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String repu_clsf;

    @ElDtoField(logicalName = "occr_ymd", physicalName = "occr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occr_ymd;

    @ElDtoField(logicalName = "cls_ymd", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "reward_no", physicalName = "reward_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reward_no;

    @ElDtoField(logicalName = "repu_knd", physicalName = "repu_knd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String repu_knd;

    @ElDtoField(logicalName = "repu_knd_nm", physicalName = "repu_knd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String repu_knd_nm;

    @ElDtoField(logicalName = "restrc_resn", physicalName = "restrc_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String restrc_resn;

    @ElDtoField(logicalName = "order_no", physicalName = "order_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String order_no;

    @ElDtoField(logicalName = "impl_agncy", physicalName = "impl_agncy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String impl_agncy;

    @ElDtoField(logicalName = "repu_contnt", physicalName = "repu_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String repu_contnt;

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "repu_clsf")
    public String getRepu_clsf(){
        return repu_clsf;
    }

    @ElVoField(physicalName = "repu_clsf")
    public void setRepu_clsf(String repu_clsf){
        this.repu_clsf = repu_clsf;
    }

    @ElVoField(physicalName = "occr_ymd")
    public String getOccr_ymd(){
        return occr_ymd;
    }

    @ElVoField(physicalName = "occr_ymd")
    public void setOccr_ymd(String occr_ymd){
        this.occr_ymd = occr_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public String getCls_ymd(){
        return cls_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public void setCls_ymd(String cls_ymd){
        this.cls_ymd = cls_ymd;
    }

    @ElVoField(physicalName = "reward_no")
    public String getReward_no(){
        return reward_no;
    }

    @ElVoField(physicalName = "reward_no")
    public void setReward_no(String reward_no){
        this.reward_no = reward_no;
    }

    @ElVoField(physicalName = "repu_knd")
    public String getRepu_knd(){
        return repu_knd;
    }

    @ElVoField(physicalName = "repu_knd")
    public void setRepu_knd(String repu_knd){
        this.repu_knd = repu_knd;
    }

    @ElVoField(physicalName = "repu_knd_nm")
    public String getRepu_knd_nm(){
        return repu_knd_nm;
    }

    @ElVoField(physicalName = "repu_knd_nm")
    public void setRepu_knd_nm(String repu_knd_nm){
        this.repu_knd_nm = repu_knd_nm;
    }

    @ElVoField(physicalName = "restrc_resn")
    public String getRestrc_resn(){
        return restrc_resn;
    }

    @ElVoField(physicalName = "restrc_resn")
    public void setRestrc_resn(String restrc_resn){
        this.restrc_resn = restrc_resn;
    }

    @ElVoField(physicalName = "order_no")
    public String getOrder_no(){
        return order_no;
    }

    @ElVoField(physicalName = "order_no")
    public void setOrder_no(String order_no){
        this.order_no = order_no;
    }

    @ElVoField(physicalName = "impl_agncy")
    public String getImpl_agncy(){
        return impl_agncy;
    }

    @ElVoField(physicalName = "impl_agncy")
    public void setImpl_agncy(String impl_agncy){
        this.impl_agncy = impl_agncy;
    }

    @ElVoField(physicalName = "repu_contnt")
    public String getRepu_contnt(){
        return repu_contnt;
    }

    @ElVoField(physicalName = "repu_contnt")
    public void setRepu_contnt(String repu_contnt){
        this.repu_contnt = repu_contnt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiEipHumRewardVo [");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("repu_clsf").append("=").append(repu_clsf).append(",");
        sb.append("occr_ymd").append("=").append(occr_ymd).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("reward_no").append("=").append(reward_no).append(",");
        sb.append("repu_knd").append("=").append(repu_knd).append(",");
        sb.append("repu_knd_nm").append("=").append(repu_knd_nm).append(",");
        sb.append("restrc_resn").append("=").append(restrc_resn).append(",");
        sb.append("order_no").append("=").append(order_no).append(",");
        sb.append("impl_agncy").append("=").append(impl_agncy).append(",");
        sb.append("repu_contnt").append("=").append(repu_contnt);
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
