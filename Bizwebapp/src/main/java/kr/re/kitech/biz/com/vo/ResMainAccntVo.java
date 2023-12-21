package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "메인과제마스터")
public class ResMainAccntVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResMainAccntVo(){
    }

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String accnt_no;

    @ElDtoField(logicalName = "과제번호", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String prj_no;

    @ElDtoField(logicalName = "과제명", physicalName = "prj_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String prj_nm;

    @ElDtoField(logicalName = "사업구분", physicalName = "bsns_cd_inout", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String bsns_cd_inout;

    @ElDtoField(logicalName = "연구책임자", physicalName = "curr_resch_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String curr_resch_rspns_nm;

    @ElDtoField(logicalName = "소속", physicalName = "curr_resch_rspns_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String curr_resch_rspns_dept_nm;

    @ElDtoField(logicalName = "curr_resch_rspns_posi_nm   직급", physicalName = "curr_resch_rspns_posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String curr_resch_rspns_posi_nm;

    @ElDtoField(logicalName = "과제상태", physicalName = "prj_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String prj_state;

    @ElDtoField(logicalName = "연구기간", physicalName = "thyr_yr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String thyr_yr_ymd;

    @ElDtoField(logicalName = "1차년도과제유무", physicalName = "cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private int cnt;

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        String ret = this.accnt_no;
        return ret;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "prj_no")
    public String getPrj_no(){
        String ret = this.prj_no;
        return ret;
    }

    @ElVoField(physicalName = "prj_no")
    public void setPrj_no(String prj_no){
        this.prj_no = prj_no;
    }

    @ElVoField(physicalName = "prj_nm")
    public String getPrj_nm(){
        String ret = this.prj_nm;
        return ret;
    }

    @ElVoField(physicalName = "prj_nm")
    public void setPrj_nm(String prj_nm){
        this.prj_nm = prj_nm;
    }

    @ElVoField(physicalName = "bsns_cd_inout")
    public String getBsns_cd_inout(){
        String ret = this.bsns_cd_inout;
        return ret;
    }

    @ElVoField(physicalName = "bsns_cd_inout")
    public void setBsns_cd_inout(String bsns_cd_inout){
        this.bsns_cd_inout = bsns_cd_inout;
    }

    @ElVoField(physicalName = "curr_resch_rspns_nm")
    public String getCurr_resch_rspns_nm(){
        String ret = this.curr_resch_rspns_nm;
        return ret;
    }

    @ElVoField(physicalName = "curr_resch_rspns_nm")
    public void setCurr_resch_rspns_nm(String curr_resch_rspns_nm){
        this.curr_resch_rspns_nm = curr_resch_rspns_nm;
    }

    @ElVoField(physicalName = "curr_resch_rspns_dept_nm")
    public String getCurr_resch_rspns_dept_nm(){
        String ret = this.curr_resch_rspns_dept_nm;
        return ret;
    }

    @ElVoField(physicalName = "curr_resch_rspns_dept_nm")
    public void setCurr_resch_rspns_dept_nm(String curr_resch_rspns_dept_nm){
        this.curr_resch_rspns_dept_nm = curr_resch_rspns_dept_nm;
    }

    @ElVoField(physicalName = "curr_resch_rspns_posi_nm")
    public String getCurr_resch_rspns_posi_nm(){
        String ret = this.curr_resch_rspns_posi_nm;
        return ret;
    }

    @ElVoField(physicalName = "curr_resch_rspns_posi_nm")
    public void setCurr_resch_rspns_posi_nm(String curr_resch_rspns_posi_nm){
        this.curr_resch_rspns_posi_nm = curr_resch_rspns_posi_nm;
    }

    @ElVoField(physicalName = "prj_state")
    public String getPrj_state(){
        String ret = this.prj_state;
        return ret;
    }

    @ElVoField(physicalName = "prj_state")
    public void setPrj_state(String prj_state){
        this.prj_state = prj_state;
    }

    @ElVoField(physicalName = "thyr_yr_ymd")
    public String getThyr_yr_ymd(){
        String ret = this.thyr_yr_ymd;
        return ret;
    }

    @ElVoField(physicalName = "thyr_yr_ymd")
    public void setThyr_yr_ymd(String thyr_yr_ymd){
        this.thyr_yr_ymd = thyr_yr_ymd;
    }

    @ElVoField(physicalName = "cnt")
    public int getCnt(){
        return cnt;
    }

    @ElVoField(physicalName = "cnt")
    public void setCnt(int cnt){
        this.cnt = cnt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrjNoMAccntVo [");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("prj_no").append("=").append(prj_no).append(",");
        sb.append("prj_nm").append("=").append(prj_nm).append(",");
        sb.append("bsns_cd_inout").append("=").append(bsns_cd_inout).append(",");
        sb.append("curr_resch_rspns_nm").append("=").append(curr_resch_rspns_nm).append(",");
        sb.append("curr_resch_rspns_dept_nm").append("=").append(curr_resch_rspns_dept_nm).append(",");
        sb.append("curr_resch_rspns_posi_nm").append("=").append(curr_resch_rspns_posi_nm).append(",");
        sb.append("prj_state").append("=").append(prj_state).append(",");
        sb.append("thyr_yr_ymd").append("=").append(thyr_yr_ymd).append(",");
        sb.append("cnt").append("=").append(cnt);
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
