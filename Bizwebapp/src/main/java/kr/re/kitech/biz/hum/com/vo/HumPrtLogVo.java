package kr.re.kitech.biz.hum.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "HumAnaUserInfo")
public class HumPrtLogVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumPrtLogVo(){
    }

    @ElDtoField(logicalName = "prtKnd", physicalName = "prt_knd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_knd;

    @ElDtoField(logicalName = "reqSyspayno", physicalName = "req_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_syspayno;

    @ElDtoField(logicalName = "reqYmd", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "useRsn", physicalName = "use_rsn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_rsn;

    @ElDtoField(logicalName = "useLoc", physicalName = "use_loc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_loc;

    @ElDtoField(logicalName = "prtContnt", physicalName = "prt_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_contnt;

    @ElDtoField(logicalName = "regstSyspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElVoField(physicalName = "prt_knd")
    public String getPrt_knd(){
        return prt_knd;
    }

    @ElVoField(physicalName = "prt_knd")
    public void setPrt_knd(String prt_knd){
        this.prt_knd = prt_knd;
    }

    @ElVoField(physicalName = "req_syspayno")
    public String getReq_syspayno(){
        return req_syspayno;
    }

    @ElVoField(physicalName = "req_syspayno")
    public void setReq_syspayno(String req_syspayno){
        this.req_syspayno = req_syspayno;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "use_rsn")
    public String getUse_rsn(){
        return use_rsn;
    }

    @ElVoField(physicalName = "use_rsn")
    public void setUse_rsn(String use_rsn){
        this.use_rsn = use_rsn;
    }

    @ElVoField(physicalName = "use_loc")
    public String getUse_loc(){
        return use_loc;
    }

    @ElVoField(physicalName = "use_loc")
    public void setUse_loc(String use_loc){
        this.use_loc = use_loc;
    }

    @ElVoField(physicalName = "prt_contnt")
    public String getPrt_contnt(){
        return prt_contnt;
    }

    @ElVoField(physicalName = "prt_contnt")
    public void setPrt_contnt(String prt_contnt){
        this.prt_contnt = prt_contnt;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumPrtLogVo [");
        sb.append("prt_knd").append("=").append(prt_knd).append(",");
        sb.append("req_syspayno").append("=").append(req_syspayno).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("use_rsn").append("=").append(use_rsn).append(",");
        sb.append("use_loc").append("=").append(use_loc).append(",");
        sb.append("prt_contnt").append("=").append(prt_contnt).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno);
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
