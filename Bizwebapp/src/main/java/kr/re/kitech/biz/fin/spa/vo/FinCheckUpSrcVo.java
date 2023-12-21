package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "소액물품검수 조회 Vo")
public class FinCheckUpSrcVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FinCheckUpSrcVo(){
    }

    @ElDtoField(logicalName = "검수번호", physicalName = "check_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String check_no;

    @ElDtoField(logicalName = "적요", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "검사자사번", physicalName = "check_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String check_psn;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "검수입회자", physicalName = "entsch_check_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entsch_check_psn;

    @ElDtoField(logicalName = "비용코드", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd;

    @ElDtoField(logicalName = "부서코드", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "결의여부", physicalName = "slip_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_yn;

    @ElDtoField(logicalName = "증빙구분", physicalName = "evid_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evid_clsf;

    @ElDtoField(logicalName = "검색시작일", physicalName = "check_ymd_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String check_ymd_st;

    @ElDtoField(logicalName = "검색종료일", physicalName = "check_ymd_ed", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String check_ymd_ed;

    @ElDtoField(logicalName = "모바일구분", physicalName = "isMbi", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String isMbi;

    @ElDtoField(logicalName = "증빙관리번호", physicalName = "evid_mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evid_mngmt_no;

    @ElDtoField(logicalName = "거래처명", physicalName = "vend_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_nm;

    @ElVoField(physicalName = "check_no")
    public String getCheck_no(){
        return check_no;
    }

    @ElVoField(physicalName = "check_no")
    public void setCheck_no(String check_no){
        this.check_no = check_no;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "check_psn")
    public String getCheck_psn(){
        return check_psn;
    }

    @ElVoField(physicalName = "check_psn")
    public void setCheck_psn(String check_psn){
        this.check_psn = check_psn;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "entsch_check_psn")
    public String getEntsch_check_psn(){
        return entsch_check_psn;
    }

    @ElVoField(physicalName = "entsch_check_psn")
    public void setEntsch_check_psn(String entsch_check_psn){
        this.entsch_check_psn = entsch_check_psn;
    }

    @ElVoField(physicalName = "expns_cd")
    public String getExpns_cd(){
        return expns_cd;
    }

    @ElVoField(physicalName = "expns_cd")
    public void setExpns_cd(String expns_cd){
        this.expns_cd = expns_cd;
    }

    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }

    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "slip_yn")
    public String getSlip_yn(){
        return slip_yn;
    }

    @ElVoField(physicalName = "slip_yn")
    public void setSlip_yn(String slip_yn){
        this.slip_yn = slip_yn;
    }

    @ElVoField(physicalName = "evid_clsf")
    public String getEvid_clsf(){
        return evid_clsf;
    }

    @ElVoField(physicalName = "evid_clsf")
    public void setEvid_clsf(String evid_clsf){
        this.evid_clsf = evid_clsf;
    }

    @ElVoField(physicalName = "check_ymd_st")
    public String getCheck_ymd_st(){
        return check_ymd_st;
    }

    @ElVoField(physicalName = "check_ymd_st")
    public void setCheck_ymd_st(String check_ymd_st){
        this.check_ymd_st = check_ymd_st;
    }

    @ElVoField(physicalName = "check_ymd_ed")
    public String getCheck_ymd_ed(){
        return check_ymd_ed;
    }

    @ElVoField(physicalName = "check_ymd_ed")
    public void setCheck_ymd_ed(String check_ymd_ed){
        this.check_ymd_ed = check_ymd_ed;
    }

    @ElVoField(physicalName = "isMbi")
    public String getIsMbi(){
        return isMbi;
    }

    @ElVoField(physicalName = "isMbi")
    public void setIsMbi(String isMbi){
        this.isMbi = isMbi;
    }

    @ElVoField(physicalName = "evid_mngmt_no")
    public String getEvid_mngmt_no(){
        return evid_mngmt_no;
    }

    @ElVoField(physicalName = "evid_mngmt_no")
    public void setEvid_mngmt_no(String evid_mngmt_no){
        this.evid_mngmt_no = evid_mngmt_no;
    }

    @ElVoField(physicalName = "vend_nm")
    public String getVend_nm(){
        return vend_nm;
    }

    @ElVoField(physicalName = "vend_nm")
    public void setVend_nm(String vend_nm){
        this.vend_nm = vend_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinCheckUpSrcVo [");
        sb.append("check_no").append("=").append(check_no).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("check_psn").append("=").append(check_psn).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("entsch_check_psn").append("=").append(entsch_check_psn).append(",");
        sb.append("expns_cd").append("=").append(expns_cd).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("slip_yn").append("=").append(slip_yn).append(",");
        sb.append("evid_clsf").append("=").append(evid_clsf).append(",");
        sb.append("check_ymd_st").append("=").append(check_ymd_st).append(",");
        sb.append("check_ymd_ed").append("=").append(check_ymd_ed).append(",");
        sb.append("isMbi").append("=").append(isMbi).append(",");
        sb.append("evid_mngmt_no").append("=").append(evid_mngmt_no).append(",");
        sb.append("vend_nm").append("=").append(vend_nm);
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
