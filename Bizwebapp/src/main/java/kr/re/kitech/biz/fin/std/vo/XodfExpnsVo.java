package kr.re.kitech.biz.fin.std.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "비용코드 검색")
public class XodfExpnsVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public XodfExpnsVo(){
    }

    @ElDtoField(logicalName = "비용구분", physicalName = "expns_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_clsf;

    @ElDtoField(logicalName = "비용코드", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd;

    @ElDtoField(logicalName = "비용코드명", physicalName = "expns_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd_nm;

    @ElDtoField(logicalName = "비용설명", physicalName = "desc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String desc;

    @ElDtoField(logicalName = "출력순서", physicalName = "prt_seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int prt_seq;

    @ElDtoField(logicalName = "사용유무", physicalName = "use_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_ex;

    @ElDtoField(logicalName = "사용중지일자", physicalName = "use_stop_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_stop_ymd;

    @ElDtoField(logicalName = "증빙유무", physicalName = "evid_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evid_yn;

    @ElDtoField(logicalName = "서비스Id", physicalName = "service_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String service_id;

    @ElVoField(physicalName = "expns_clsf")
    public String getExpns_clsf(){
        return expns_clsf;
    }

    @ElVoField(physicalName = "expns_clsf")
    public void setExpns_clsf(String expns_clsf){
        this.expns_clsf = expns_clsf;
    }

    @ElVoField(physicalName = "expns_cd")
    public String getExpns_cd(){
        return expns_cd;
    }

    @ElVoField(physicalName = "expns_cd")
    public void setExpns_cd(String expns_cd){
        this.expns_cd = expns_cd;
    }

    @ElVoField(physicalName = "expns_cd_nm")
    public String getExpns_cd_nm(){
        return expns_cd_nm;
    }

    @ElVoField(physicalName = "expns_cd_nm")
    public void setExpns_cd_nm(String expns_cd_nm){
        this.expns_cd_nm = expns_cd_nm;
    }

    @ElVoField(physicalName = "desc")
    public String getDesc(){
        return desc;
    }

    @ElVoField(physicalName = "desc")
    public void setDesc(String desc){
        this.desc = desc;
    }

    @ElVoField(physicalName = "prt_seq")
    public int getPrt_seq(){
        return prt_seq;
    }

    @ElVoField(physicalName = "prt_seq")
    public void setPrt_seq(int prt_seq){
        this.prt_seq = prt_seq;
    }

    @ElVoField(physicalName = "use_ex")
    public String getUse_ex(){
        return use_ex;
    }

    @ElVoField(physicalName = "use_ex")
    public void setUse_ex(String use_ex){
        this.use_ex = use_ex;
    }

    @ElVoField(physicalName = "use_stop_ymd")
    public String getUse_stop_ymd(){
        return use_stop_ymd;
    }

    @ElVoField(physicalName = "use_stop_ymd")
    public void setUse_stop_ymd(String use_stop_ymd){
        this.use_stop_ymd = use_stop_ymd;
    }

    @ElVoField(physicalName = "evid_yn")
    public String getEvid_yn(){
        return evid_yn;
    }

    @ElVoField(physicalName = "evid_yn")
    public void setEvid_yn(String evid_yn){
        this.evid_yn = evid_yn;
    }

    @ElVoField(physicalName = "service_id")
    public String getService_id(){
        return service_id;
    }

    @ElVoField(physicalName = "service_id")
    public void setService_id(String service_id){
        this.service_id = service_id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("XodfExpnsVo [");
        sb.append("expns_clsf").append("=").append(expns_clsf).append(",");
        sb.append("expns_cd").append("=").append(expns_cd).append(",");
        sb.append("expns_cd_nm").append("=").append(expns_cd_nm).append(",");
        sb.append("desc").append("=").append(desc).append(",");
        sb.append("prt_seq").append("=").append(prt_seq).append(",");
        sb.append("use_ex").append("=").append(use_ex).append(",");
        sb.append("use_stop_ymd").append("=").append(use_stop_ymd).append(",");
        sb.append("evid_yn").append("=").append(evid_yn).append(",");
        sb.append("service_id").append("=").append(service_id);
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
