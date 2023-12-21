package kr.re.kitech.biz.hum.apy.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "퇴직신청")
public class HumApyDeptChkVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumApyDeptChkVo(){
    }

    @ElDtoField(logicalName = "확인사항코드", physicalName = "affir_item_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String affir_item_cd;

    @ElDtoField(logicalName = "코드명", physicalName = "cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String cd_nm;

    @ElDtoField(logicalName = "mngmt_item_1", physicalName = "mngmt_item_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String mngmt_item_1;

    @ElDtoField(logicalName = "이름", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String nm;

    @ElDtoField(logicalName = "반납여부", physicalName = "retrn_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String retrn_yn;

    @ElDtoField(logicalName = "확인여부", physicalName = "affir_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String affir_yn;

    @ElDtoField(logicalName = "확인일자", physicalName = "affir_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String affir_ymd;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String rmk;

    @ElDtoField(logicalName = "문서번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_no;

    @ElDtoField(logicalName = "부서코드", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String dept_cd;

    @ElDtoField(logicalName = "부서신설일", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "affir_syspayno", physicalName = "affir_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String affir_syspayno;

    @ElDtoField(logicalName = "로우상태", physicalName = "rowStatus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String rowStatus;

    @ElVoField(physicalName = "affir_item_cd")
    public String getAffir_item_cd(){
        String ret = this.affir_item_cd;
        return ret;
    }

    @ElVoField(physicalName = "affir_item_cd")
    public void setAffir_item_cd(String affir_item_cd){
        this.affir_item_cd = affir_item_cd;
    }

    @ElVoField(physicalName = "cd_nm")
    public String getCd_nm(){
        String ret = this.cd_nm;
        return ret;
    }

    @ElVoField(physicalName = "cd_nm")
    public void setCd_nm(String cd_nm){
        this.cd_nm = cd_nm;
    }

    @ElVoField(physicalName = "mngmt_item_1")
    public String getMngmt_item_1(){
        String ret = this.mngmt_item_1;
        return ret;
    }

    @ElVoField(physicalName = "mngmt_item_1")
    public void setMngmt_item_1(String mngmt_item_1){
        this.mngmt_item_1 = mngmt_item_1;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        String ret = this.nm;
        return ret;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "retrn_yn")
    public String getRetrn_yn(){
        String ret = this.retrn_yn;
        return ret;
    }

    @ElVoField(physicalName = "retrn_yn")
    public void setRetrn_yn(String retrn_yn){
        this.retrn_yn = retrn_yn;
    }

    @ElVoField(physicalName = "affir_yn")
    public String getAffir_yn(){
        String ret = this.affir_yn;
        return ret;
    }

    @ElVoField(physicalName = "affir_yn")
    public void setAffir_yn(String affir_yn){
        this.affir_yn = affir_yn;
    }

    @ElVoField(physicalName = "affir_ymd")
    public String getAffir_ymd(){
        String ret = this.affir_ymd;
        return ret;
    }

    @ElVoField(physicalName = "affir_ymd")
    public void setAffir_ymd(String affir_ymd){
        this.affir_ymd = affir_ymd;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        String ret = this.rmk;
        return ret;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        String ret = this.req_no;
        return ret;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        String ret = this.dept_cd;
        return ret;
    }

    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public String getDept_new_ymd(){
        String ret = this.dept_new_ymd;
        return ret;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public void setDept_new_ymd(String dept_new_ymd){
        this.dept_new_ymd = dept_new_ymd;
    }

    @ElVoField(physicalName = "affir_syspayno")
    public String getAffir_syspayno(){
        String ret = this.affir_syspayno;
        return ret;
    }

    @ElVoField(physicalName = "affir_syspayno")
    public void setAffir_syspayno(String affir_syspayno){
        this.affir_syspayno = affir_syspayno;
    }

    @ElVoField(physicalName = "rowStatus")
    public String getRowStatus(){
        String ret = this.rowStatus;
        return ret;
    }

    @ElVoField(physicalName = "rowStatus")
    public void setRowStatus(String rowStatus){
        this.rowStatus = rowStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumApyDeptChkVo [");
        sb.append("affir_item_cd").append("=").append(affir_item_cd).append(",");
        sb.append("cd_nm").append("=").append(cd_nm).append(",");
        sb.append("mngmt_item_1").append("=").append(mngmt_item_1).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("retrn_yn").append("=").append(retrn_yn).append(",");
        sb.append("affir_yn").append("=").append(affir_yn).append(",");
        sb.append("affir_ymd").append("=").append(affir_ymd).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("affir_syspayno").append("=").append(affir_syspayno).append(",");
        sb.append("rowStatus").append("=").append(rowStatus);
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
