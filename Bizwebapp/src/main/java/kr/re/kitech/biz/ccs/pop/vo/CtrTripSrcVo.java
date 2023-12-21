package kr.re.kitech.biz.ccs.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "출장검색조건 Vo")
public class CtrTripSrcVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CtrTripSrcVo(){
    }

    @ElDtoField(logicalName = "시작일자", physicalName = "from_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String from_ymd;

    @ElDtoField(logicalName = "종료일자", physicalName = "to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String to_ymd;

    @ElDtoField(logicalName = "출장신청(정산)번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "출장자", physicalName = "biztrip_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_psn_syspayno;

    @ElDtoField(logicalName = "출장쿼리구분", physicalName = "flag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "출장쿼리구분")
    private String flag;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "조회타입", physicalName = "type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String type;

    @ElDtoField(logicalName = "직급구분", physicalName = "posi_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_clsf;

    @ElDtoField(logicalName = "도착지", physicalName = "arriv_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String arriv_region;

    @ElDtoField(logicalName = "출발지", physicalName = "start_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_region;

    @ElDtoField(logicalName = "삭제검증로직 flag", physicalName = "del_flag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String del_flag;

    @ElDtoField(logicalName = "출장신청번호", physicalName = "biztrip_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_req_no;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "대외활동구분", physicalName = "act_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String act_clsf;

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

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "biztrip_psn_syspayno")
    public String getBiztrip_psn_syspayno(){
        return biztrip_psn_syspayno;
    }

    @ElVoField(physicalName = "biztrip_psn_syspayno")
    public void setBiztrip_psn_syspayno(String biztrip_psn_syspayno){
        this.biztrip_psn_syspayno = biztrip_psn_syspayno;
    }

    @ElVoField(physicalName = "flag")
    public String getFlag(){
        return flag;
    }

    @ElVoField(physicalName = "flag")
    public void setFlag(String flag){
        this.flag = flag;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "type")
    public String getType(){
        return type;
    }

    @ElVoField(physicalName = "type")
    public void setType(String type){
        this.type = type;
    }

    @ElVoField(physicalName = "posi_clsf")
    public String getPosi_clsf(){
        return posi_clsf;
    }

    @ElVoField(physicalName = "posi_clsf")
    public void setPosi_clsf(String posi_clsf){
        this.posi_clsf = posi_clsf;
    }

    @ElVoField(physicalName = "arriv_region")
    public String getArriv_region(){
        return arriv_region;
    }

    @ElVoField(physicalName = "arriv_region")
    public void setArriv_region(String arriv_region){
        this.arriv_region = arriv_region;
    }

    @ElVoField(physicalName = "start_region")
    public String getStart_region(){
        return start_region;
    }

    @ElVoField(physicalName = "start_region")
    public void setStart_region(String start_region){
        this.start_region = start_region;
    }

    @ElVoField(physicalName = "del_flag")
    public String getDel_flag(){
        return del_flag;
    }

    @ElVoField(physicalName = "del_flag")
    public void setDel_flag(String del_flag){
        this.del_flag = del_flag;
    }

    @ElVoField(physicalName = "biztrip_req_no")
    public String getBiztrip_req_no(){
        return biztrip_req_no;
    }

    @ElVoField(physicalName = "biztrip_req_no")
    public void setBiztrip_req_no(String biztrip_req_no){
        this.biztrip_req_no = biztrip_req_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "act_clsf")
    public String getAct_clsf(){
        return act_clsf;
    }

    @ElVoField(physicalName = "act_clsf")
    public void setAct_clsf(String act_clsf){
        this.act_clsf = act_clsf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrTripSrcVo [");
        sb.append("from_ymd").append("=").append(from_ymd).append(",");
        sb.append("to_ymd").append("=").append(to_ymd).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("biztrip_psn_syspayno").append("=").append(biztrip_psn_syspayno).append(",");
        sb.append("flag").append("=").append(flag).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("type").append("=").append(type).append(",");
        sb.append("posi_clsf").append("=").append(posi_clsf).append(",");
        sb.append("arriv_region").append("=").append(arriv_region).append(",");
        sb.append("start_region").append("=").append(start_region).append(",");
        sb.append("del_flag").append("=").append(del_flag).append(",");
        sb.append("biztrip_req_no").append("=").append(biztrip_req_no).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("act_clsf").append("=").append(act_clsf);
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
