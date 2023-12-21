package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "결재전 검증 체크 Vo")
public class CheckSrcVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CheckSrcVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "출장시작일", physicalName = "biztrip_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_start_ymd;

    @ElDtoField(logicalName = "출장종료일", physicalName = "biztrip_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_cls_ymd;

    @ElDtoField(logicalName = "출장자", physicalName = "biztrip_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_psn_syspayno;

    @ElDtoField(logicalName = "출발시간", physicalName = "start_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_time;

    @ElDtoField(logicalName = "도착시간", physicalName = "arriv_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String arriv_time;

    @ElDtoField(logicalName = "출장목적구분", physicalName = "goal_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String goal_clsf;

    @ElDtoField(logicalName = "출장비없음여부", physicalName = "no_trvel_expns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String no_trvel_expns;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "회계코드", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;

    @ElDtoField(logicalName = "비용코드", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd;

    @ElDtoField(logicalName = "출장자Vo", physicalName = "psnList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.ctr.vo.BiztripPsnVo> psnList;

    @ElDtoField(logicalName = "조합원코드", physicalName = "commute_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String commute_cd;

    @ElDtoField(logicalName = "조회날짜", physicalName = "ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ymd;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "biztrip_start_ymd")
    public String getBiztrip_start_ymd(){
        return biztrip_start_ymd;
    }

    @ElVoField(physicalName = "biztrip_start_ymd")
    public void setBiztrip_start_ymd(String biztrip_start_ymd){
        this.biztrip_start_ymd = biztrip_start_ymd;
    }

    @ElVoField(physicalName = "biztrip_cls_ymd")
    public String getBiztrip_cls_ymd(){
        return biztrip_cls_ymd;
    }

    @ElVoField(physicalName = "biztrip_cls_ymd")
    public void setBiztrip_cls_ymd(String biztrip_cls_ymd){
        this.biztrip_cls_ymd = biztrip_cls_ymd;
    }

    @ElVoField(physicalName = "biztrip_psn_syspayno")
    public String getBiztrip_psn_syspayno(){
        return biztrip_psn_syspayno;
    }

    @ElVoField(physicalName = "biztrip_psn_syspayno")
    public void setBiztrip_psn_syspayno(String biztrip_psn_syspayno){
        this.biztrip_psn_syspayno = biztrip_psn_syspayno;
    }

    @ElVoField(physicalName = "start_time")
    public String getStart_time(){
        return start_time;
    }

    @ElVoField(physicalName = "start_time")
    public void setStart_time(String start_time){
        this.start_time = start_time;
    }

    @ElVoField(physicalName = "arriv_time")
    public String getArriv_time(){
        return arriv_time;
    }

    @ElVoField(physicalName = "arriv_time")
    public void setArriv_time(String arriv_time){
        this.arriv_time = arriv_time;
    }

    @ElVoField(physicalName = "goal_clsf")
    public String getGoal_clsf(){
        return goal_clsf;
    }

    @ElVoField(physicalName = "goal_clsf")
    public void setGoal_clsf(String goal_clsf){
        this.goal_clsf = goal_clsf;
    }

    @ElVoField(physicalName = "no_trvel_expns")
    public String getNo_trvel_expns(){
        return no_trvel_expns;
    }

    @ElVoField(physicalName = "no_trvel_expns")
    public void setNo_trvel_expns(String no_trvel_expns){
        this.no_trvel_expns = no_trvel_expns;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "accnt_cd")
    public String getAccnt_cd(){
        return accnt_cd;
    }

    @ElVoField(physicalName = "accnt_cd")
    public void setAccnt_cd(String accnt_cd){
        this.accnt_cd = accnt_cd;
    }

    @ElVoField(physicalName = "expns_cd")
    public String getExpns_cd(){
        return expns_cd;
    }

    @ElVoField(physicalName = "expns_cd")
    public void setExpns_cd(String expns_cd){
        this.expns_cd = expns_cd;
    }

    @ElVoField(physicalName = "psnList")
    public java.util.List<kr.re.kitech.biz.ccs.ctr.vo.BiztripPsnVo> getPsnList(){
        return psnList;
    }

    @ElVoField(physicalName = "psnList")
    public void setPsnList(java.util.List<kr.re.kitech.biz.ccs.ctr.vo.BiztripPsnVo> psnList){
        this.psnList = psnList;
    }

    @ElVoField(physicalName = "commute_cd")
    public String getCommute_cd(){
        return commute_cd;
    }

    @ElVoField(physicalName = "commute_cd")
    public void setCommute_cd(String commute_cd){
        this.commute_cd = commute_cd;
    }

    @ElVoField(physicalName = "ymd")
    public String getYmd(){
        return ymd;
    }

    @ElVoField(physicalName = "ymd")
    public void setYmd(String ymd){
        this.ymd = ymd;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CheckSrcVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("biztrip_start_ymd").append("=").append(biztrip_start_ymd).append(",");
        sb.append("biztrip_cls_ymd").append("=").append(biztrip_cls_ymd).append(",");
        sb.append("biztrip_psn_syspayno").append("=").append(biztrip_psn_syspayno).append(",");
        sb.append("start_time").append("=").append(start_time).append(",");
        sb.append("arriv_time").append("=").append(arriv_time).append(",");
        sb.append("goal_clsf").append("=").append(goal_clsf).append(",");
        sb.append("no_trvel_expns").append("=").append(no_trvel_expns).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
        sb.append("expns_cd").append("=").append(expns_cd).append(",");
        sb.append("psnList").append("=").append(psnList).append(",");
        sb.append("commute_cd").append("=").append(commute_cd).append(",");
        sb.append("ymd").append("=").append(ymd).append(",");
        sb.append("syspayno").append("=").append(syspayno);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; psnList != null && i < psnList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.BiztripPsnVo vo = (kr.re.kitech.biz.ccs.ctr.vo.BiztripPsnVo)psnList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; psnList != null && i < psnList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.BiztripPsnVo vo = (kr.re.kitech.biz.ccs.ctr.vo.BiztripPsnVo)psnList.get(i);
            vo._xStreamDec();	 
        }
    }


}
