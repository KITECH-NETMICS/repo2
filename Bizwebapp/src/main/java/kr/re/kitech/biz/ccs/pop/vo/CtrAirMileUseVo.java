package kr.re.kitech.biz.ccs.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "항공마일리지 사용 Vo")
public class CtrAirMileUseVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CtrAirMileUseVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "순번", physicalName = "seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int seq;

    @ElDtoField(logicalName = "국내외구분", physicalName = "in_out_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String in_out_clsf;

    @ElDtoField(logicalName = "출장신청번호", physicalName = "biztrip_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_req_no;

    @ElDtoField(logicalName = "출장정산번호", physicalName = "biztrip_report_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_report_no;

    @ElDtoField(logicalName = "사용자", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "사용자명", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "개인번호", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "보유마일리지", physicalName = "own_mile", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int own_mile;

    @ElDtoField(logicalName = "공적생성마일리지", physicalName = "pub_new_mile", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int pub_new_mile;

    @ElDtoField(logicalName = "공적생성마일리지(구)", physicalName = "cu_pub_new_mile", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int cu_pub_new_mile;

    @ElDtoField(logicalName = "공적사용마일리지", physicalName = "pub_use_mile", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int pub_use_mile;

    @ElDtoField(logicalName = "공적사용마일리지(구)", physicalName = "cu_pub_use_mile", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int cu_pub_use_mile;

    @ElDtoField(logicalName = "사적사용마일리지", physicalName = "per_use_mile", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int per_use_mile;

    @ElDtoField(logicalName = "신청서 첨부파일", physicalName = "attach_file_no_req", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_req;

    @ElDtoField(logicalName = "신고서 첨부파일", physicalName = "attach_file_no_report", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_report;

    @ElDtoField(logicalName = "항공사", physicalName = "air_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String air_cd;

    @ElDtoField(logicalName = "항공사명", physicalName = "air_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String air_nm;

    @ElDtoField(logicalName = "좌석등급", physicalName = "seat_grd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seat_grd;

    @ElDtoField(logicalName = "미사용사유", physicalName = "unuse_cause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unuse_cause;

    @ElDtoField(logicalName = "신청자", physicalName = "req_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn;

    @ElDtoField(logicalName = "비고", physicalName = "req_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_rmk;

    @ElDtoField(logicalName = "신고자", physicalName = "report_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String report_psn;

    @ElDtoField(logicalName = "신고일자", physicalName = "report_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String report_ymd;

    @ElDtoField(logicalName = "신고서비고", physicalName = "report_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String report_rmk;

    @ElDtoField(logicalName = "마일리지사용유무", physicalName = "use_mile_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_mile_yn;

    @ElDtoField(logicalName = "마일리지 활용방법", physicalName = "mile_case", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mile_case;

    @ElDtoField(logicalName = "마일리지 사용사유", physicalName = "use_cause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_cause;

    @ElDtoField(logicalName = "운행구분", physicalName = "way_trip", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String way_trip;

    @ElDtoField(logicalName = "탑승일", physicalName = "cal_boarding_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cal_boarding_ymd;

    @ElDtoField(logicalName = "신고서결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "항공운임비", physicalName = "air_fee", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long air_fee;

    @ElDtoField(logicalName = "운임신청액", physicalName = "air_real_fee", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long air_real_fee;

    @ElDtoField(logicalName = "항공사취소여부", physicalName = "air_cd_chang_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String air_cd_chang_yn;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "seq")
    public int getSeq(){
        return seq;
    }

    @ElVoField(physicalName = "seq")
    public void setSeq(int seq){
        this.seq = seq;
    }

    @ElVoField(physicalName = "in_out_clsf")
    public String getIn_out_clsf(){
        return in_out_clsf;
    }

    @ElVoField(physicalName = "in_out_clsf")
    public void setIn_out_clsf(String in_out_clsf){
        this.in_out_clsf = in_out_clsf;
    }

    @ElVoField(physicalName = "biztrip_req_no")
    public String getBiztrip_req_no(){
        return biztrip_req_no;
    }

    @ElVoField(physicalName = "biztrip_req_no")
    public void setBiztrip_req_no(String biztrip_req_no){
        this.biztrip_req_no = biztrip_req_no;
    }

    @ElVoField(physicalName = "biztrip_report_no")
    public String getBiztrip_report_no(){
        return biztrip_report_no;
    }

    @ElVoField(physicalName = "biztrip_report_no")
    public void setBiztrip_report_no(String biztrip_report_no){
        this.biztrip_report_no = biztrip_report_no;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "own_mile")
    public int getOwn_mile(){
        return own_mile;
    }

    @ElVoField(physicalName = "own_mile")
    public void setOwn_mile(int own_mile){
        this.own_mile = own_mile;
    }

    @ElVoField(physicalName = "pub_new_mile")
    public int getPub_new_mile(){
        return pub_new_mile;
    }

    @ElVoField(physicalName = "pub_new_mile")
    public void setPub_new_mile(int pub_new_mile){
        this.pub_new_mile = pub_new_mile;
    }

    @ElVoField(physicalName = "cu_pub_new_mile")
    public int getCu_pub_new_mile(){
        return cu_pub_new_mile;
    }

    @ElVoField(physicalName = "cu_pub_new_mile")
    public void setCu_pub_new_mile(int cu_pub_new_mile){
        this.cu_pub_new_mile = cu_pub_new_mile;
    }

    @ElVoField(physicalName = "pub_use_mile")
    public int getPub_use_mile(){
        return pub_use_mile;
    }

    @ElVoField(physicalName = "pub_use_mile")
    public void setPub_use_mile(int pub_use_mile){
        this.pub_use_mile = pub_use_mile;
    }

    @ElVoField(physicalName = "cu_pub_use_mile")
    public int getCu_pub_use_mile(){
        return cu_pub_use_mile;
    }

    @ElVoField(physicalName = "cu_pub_use_mile")
    public void setCu_pub_use_mile(int cu_pub_use_mile){
        this.cu_pub_use_mile = cu_pub_use_mile;
    }

    @ElVoField(physicalName = "per_use_mile")
    public int getPer_use_mile(){
        return per_use_mile;
    }

    @ElVoField(physicalName = "per_use_mile")
    public void setPer_use_mile(int per_use_mile){
        this.per_use_mile = per_use_mile;
    }

    @ElVoField(physicalName = "attach_file_no_req")
    public String getAttach_file_no_req(){
        return attach_file_no_req;
    }

    @ElVoField(physicalName = "attach_file_no_req")
    public void setAttach_file_no_req(String attach_file_no_req){
        this.attach_file_no_req = attach_file_no_req;
    }

    @ElVoField(physicalName = "attach_file_no_report")
    public String getAttach_file_no_report(){
        return attach_file_no_report;
    }

    @ElVoField(physicalName = "attach_file_no_report")
    public void setAttach_file_no_report(String attach_file_no_report){
        this.attach_file_no_report = attach_file_no_report;
    }

    @ElVoField(physicalName = "air_cd")
    public String getAir_cd(){
        return air_cd;
    }

    @ElVoField(physicalName = "air_cd")
    public void setAir_cd(String air_cd){
        this.air_cd = air_cd;
    }

    @ElVoField(physicalName = "air_nm")
    public String getAir_nm(){
        return air_nm;
    }

    @ElVoField(physicalName = "air_nm")
    public void setAir_nm(String air_nm){
        this.air_nm = air_nm;
    }

    @ElVoField(physicalName = "seat_grd")
    public String getSeat_grd(){
        return seat_grd;
    }

    @ElVoField(physicalName = "seat_grd")
    public void setSeat_grd(String seat_grd){
        this.seat_grd = seat_grd;
    }

    @ElVoField(physicalName = "unuse_cause")
    public String getUnuse_cause(){
        return unuse_cause;
    }

    @ElVoField(physicalName = "unuse_cause")
    public void setUnuse_cause(String unuse_cause){
        this.unuse_cause = unuse_cause;
    }

    @ElVoField(physicalName = "req_psn")
    public String getReq_psn(){
        return req_psn;
    }

    @ElVoField(physicalName = "req_psn")
    public void setReq_psn(String req_psn){
        this.req_psn = req_psn;
    }

    @ElVoField(physicalName = "req_rmk")
    public String getReq_rmk(){
        return req_rmk;
    }

    @ElVoField(physicalName = "req_rmk")
    public void setReq_rmk(String req_rmk){
        this.req_rmk = req_rmk;
    }

    @ElVoField(physicalName = "report_psn")
    public String getReport_psn(){
        return report_psn;
    }

    @ElVoField(physicalName = "report_psn")
    public void setReport_psn(String report_psn){
        this.report_psn = report_psn;
    }

    @ElVoField(physicalName = "report_ymd")
    public String getReport_ymd(){
        return report_ymd;
    }

    @ElVoField(physicalName = "report_ymd")
    public void setReport_ymd(String report_ymd){
        this.report_ymd = report_ymd;
    }

    @ElVoField(physicalName = "report_rmk")
    public String getReport_rmk(){
        return report_rmk;
    }

    @ElVoField(physicalName = "report_rmk")
    public void setReport_rmk(String report_rmk){
        this.report_rmk = report_rmk;
    }

    @ElVoField(physicalName = "use_mile_yn")
    public String getUse_mile_yn(){
        return use_mile_yn;
    }

    @ElVoField(physicalName = "use_mile_yn")
    public void setUse_mile_yn(String use_mile_yn){
        this.use_mile_yn = use_mile_yn;
    }

    @ElVoField(physicalName = "mile_case")
    public String getMile_case(){
        return mile_case;
    }

    @ElVoField(physicalName = "mile_case")
    public void setMile_case(String mile_case){
        this.mile_case = mile_case;
    }

    @ElVoField(physicalName = "use_cause")
    public String getUse_cause(){
        return use_cause;
    }

    @ElVoField(physicalName = "use_cause")
    public void setUse_cause(String use_cause){
        this.use_cause = use_cause;
    }

    @ElVoField(physicalName = "way_trip")
    public String getWay_trip(){
        return way_trip;
    }

    @ElVoField(physicalName = "way_trip")
    public void setWay_trip(String way_trip){
        this.way_trip = way_trip;
    }

    @ElVoField(physicalName = "cal_boarding_ymd")
    public String getCal_boarding_ymd(){
        return cal_boarding_ymd;
    }

    @ElVoField(physicalName = "cal_boarding_ymd")
    public void setCal_boarding_ymd(String cal_boarding_ymd){
        this.cal_boarding_ymd = cal_boarding_ymd;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "air_fee")
    public long getAir_fee(){
        return air_fee;
    }

    @ElVoField(physicalName = "air_fee")
    public void setAir_fee(long air_fee){
        this.air_fee = air_fee;
    }

    @ElVoField(physicalName = "air_real_fee")
    public long getAir_real_fee(){
        return air_real_fee;
    }

    @ElVoField(physicalName = "air_real_fee")
    public void setAir_real_fee(long air_real_fee){
        this.air_real_fee = air_real_fee;
    }

    @ElVoField(physicalName = "air_cd_chang_yn")
    public String getAir_cd_chang_yn(){
        return air_cd_chang_yn;
    }

    @ElVoField(physicalName = "air_cd_chang_yn")
    public void setAir_cd_chang_yn(String air_cd_chang_yn){
        this.air_cd_chang_yn = air_cd_chang_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrAirMileUseVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("in_out_clsf").append("=").append(in_out_clsf).append(",");
        sb.append("biztrip_req_no").append("=").append(biztrip_req_no).append(",");
        sb.append("biztrip_report_no").append("=").append(biztrip_report_no).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("own_mile").append("=").append(own_mile).append(",");
        sb.append("pub_new_mile").append("=").append(pub_new_mile).append(",");
        sb.append("cu_pub_new_mile").append("=").append(cu_pub_new_mile).append(",");
        sb.append("pub_use_mile").append("=").append(pub_use_mile).append(",");
        sb.append("cu_pub_use_mile").append("=").append(cu_pub_use_mile).append(",");
        sb.append("per_use_mile").append("=").append(per_use_mile).append(",");
        sb.append("attach_file_no_req").append("=").append(attach_file_no_req).append(",");
        sb.append("attach_file_no_report").append("=").append(attach_file_no_report).append(",");
        sb.append("air_cd").append("=").append(air_cd).append(",");
        sb.append("air_nm").append("=").append(air_nm).append(",");
        sb.append("seat_grd").append("=").append(seat_grd).append(",");
        sb.append("unuse_cause").append("=").append(unuse_cause).append(",");
        sb.append("req_psn").append("=").append(req_psn).append(",");
        sb.append("req_rmk").append("=").append(req_rmk).append(",");
        sb.append("report_psn").append("=").append(report_psn).append(",");
        sb.append("report_ymd").append("=").append(report_ymd).append(",");
        sb.append("report_rmk").append("=").append(report_rmk).append(",");
        sb.append("use_mile_yn").append("=").append(use_mile_yn).append(",");
        sb.append("mile_case").append("=").append(mile_case).append(",");
        sb.append("use_cause").append("=").append(use_cause).append(",");
        sb.append("way_trip").append("=").append(way_trip).append(",");
        sb.append("cal_boarding_ymd").append("=").append(cal_boarding_ymd).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("air_fee").append("=").append(air_fee).append(",");
        sb.append("air_real_fee").append("=").append(air_real_fee).append(",");
        sb.append("air_cd_chang_yn").append("=").append(air_cd_chang_yn);
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
