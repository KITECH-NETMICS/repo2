package kr.re.kitech.biz.epu.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "계약번호찾기팝업VO")
public class EpuContrctChngVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public EpuContrctChngVo(){
    }

    @ElDtoField(logicalName = "inoutPsnClsfCd", physicalName = "inout_psn_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inout_psn_clsf_cd;

    @ElDtoField(logicalName = "purReqNo", physicalName = "pur_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_req_no;

    @ElDtoField(logicalName = "contrctNo", physicalName = "contrct_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_no;

    @ElDtoField(logicalName = "startYmd", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;

    @ElDtoField(logicalName = "endYmd", physicalName = "end_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String end_ymd;

    @ElDtoField(logicalName = "contrctNm", physicalName = "contrct_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_nm;

    @ElDtoField(logicalName = "chargRegionClsf", physicalName = "charg_region_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_region_clsf;

    @ElDtoField(logicalName = "sn", physicalName = "sn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sn;

    @ElDtoField(logicalName = "reqDeptCd", physicalName = "req_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_cd;

    @ElDtoField(logicalName = "inoutPsnClsfDesc", physicalName = "inout_psn_clsf_desc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inout_psn_clsf_desc;

    @ElDtoField(logicalName = "chngSeq", physicalName = "chng_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chng_seq;

    @ElDtoField(logicalName = "contrctYmd", physicalName = "contrct_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_ymd;

    @ElDtoField(logicalName = "progressState", physicalName = "progress_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String progress_state;

    @ElDtoField(logicalName = "vendNm", physicalName = "vend_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_nm;

    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "clsf", physicalName = "clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String clsf;

    @ElDtoField(logicalName = "contrctVendCd", physicalName = "contrct_vend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_vend_cd;

    @ElDtoField(logicalName = "chargSyspayno", physicalName = "charg_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_syspayno;

    @ElDtoField(logicalName = "userMainSyspayno", physicalName = "user_main_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_main_syspayno;

    @ElDtoField(logicalName = "reqYmd", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "chargEmpnm", physicalName = "charg_empnm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_empnm;

    @ElDtoField(logicalName = "userMain_nm", physicalName = "user_main_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_main_nm;

    @ElDtoField(logicalName = "", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "", physicalName = "fomat_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fomat_unit;

    @ElDtoField(logicalName = "", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElVoField(physicalName = "inout_psn_clsf_cd")
    public String getInout_psn_clsf_cd(){
        return inout_psn_clsf_cd;
    }

    @ElVoField(physicalName = "inout_psn_clsf_cd")
    public void setInout_psn_clsf_cd(String inout_psn_clsf_cd){
        this.inout_psn_clsf_cd = inout_psn_clsf_cd;
    }

    @ElVoField(physicalName = "pur_req_no")
    public String getPur_req_no(){
        return pur_req_no;
    }

    @ElVoField(physicalName = "pur_req_no")
    public void setPur_req_no(String pur_req_no){
        this.pur_req_no = pur_req_no;
    }

    @ElVoField(physicalName = "contrct_no")
    public String getContrct_no(){
        return contrct_no;
    }

    @ElVoField(physicalName = "contrct_no")
    public void setContrct_no(String contrct_no){
        this.contrct_no = contrct_no;
    }

    @ElVoField(physicalName = "start_ymd")
    public String getStart_ymd(){
        return start_ymd;
    }

    @ElVoField(physicalName = "start_ymd")
    public void setStart_ymd(String start_ymd){
        this.start_ymd = start_ymd;
    }

    @ElVoField(physicalName = "end_ymd")
    public String getEnd_ymd(){
        return end_ymd;
    }

    @ElVoField(physicalName = "end_ymd")
    public void setEnd_ymd(String end_ymd){
        this.end_ymd = end_ymd;
    }

    @ElVoField(physicalName = "contrct_nm")
    public String getContrct_nm(){
        return contrct_nm;
    }

    @ElVoField(physicalName = "contrct_nm")
    public void setContrct_nm(String contrct_nm){
        this.contrct_nm = contrct_nm;
    }

    @ElVoField(physicalName = "charg_region_clsf")
    public String getCharg_region_clsf(){
        return charg_region_clsf;
    }

    @ElVoField(physicalName = "charg_region_clsf")
    public void setCharg_region_clsf(String charg_region_clsf){
        this.charg_region_clsf = charg_region_clsf;
    }

    @ElVoField(physicalName = "sn")
    public String getSn(){
        return sn;
    }

    @ElVoField(physicalName = "sn")
    public void setSn(String sn){
        this.sn = sn;
    }

    @ElVoField(physicalName = "req_dept_cd")
    public String getReq_dept_cd(){
        return req_dept_cd;
    }

    @ElVoField(physicalName = "req_dept_cd")
    public void setReq_dept_cd(String req_dept_cd){
        this.req_dept_cd = req_dept_cd;
    }

    @ElVoField(physicalName = "inout_psn_clsf_desc")
    public String getInout_psn_clsf_desc(){
        return inout_psn_clsf_desc;
    }

    @ElVoField(physicalName = "inout_psn_clsf_desc")
    public void setInout_psn_clsf_desc(String inout_psn_clsf_desc){
        this.inout_psn_clsf_desc = inout_psn_clsf_desc;
    }

    @ElVoField(physicalName = "chng_seq")
    public String getChng_seq(){
        return chng_seq;
    }

    @ElVoField(physicalName = "chng_seq")
    public void setChng_seq(String chng_seq){
        this.chng_seq = chng_seq;
    }

    @ElVoField(physicalName = "contrct_ymd")
    public String getContrct_ymd(){
        return contrct_ymd;
    }

    @ElVoField(physicalName = "contrct_ymd")
    public void setContrct_ymd(String contrct_ymd){
        this.contrct_ymd = contrct_ymd;
    }

    @ElVoField(physicalName = "progress_state")
    public String getProgress_state(){
        return progress_state;
    }

    @ElVoField(physicalName = "progress_state")
    public void setProgress_state(String progress_state){
        this.progress_state = progress_state;
    }

    @ElVoField(physicalName = "vend_nm")
    public String getVend_nm(){
        return vend_nm;
    }

    @ElVoField(physicalName = "vend_nm")
    public void setVend_nm(String vend_nm){
        this.vend_nm = vend_nm;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "clsf")
    public String getClsf(){
        return clsf;
    }

    @ElVoField(physicalName = "clsf")
    public void setClsf(String clsf){
        this.clsf = clsf;
    }

    @ElVoField(physicalName = "contrct_vend_cd")
    public String getContrct_vend_cd(){
        return contrct_vend_cd;
    }

    @ElVoField(physicalName = "contrct_vend_cd")
    public void setContrct_vend_cd(String contrct_vend_cd){
        this.contrct_vend_cd = contrct_vend_cd;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public String getCharg_syspayno(){
        return charg_syspayno;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public void setCharg_syspayno(String charg_syspayno){
        this.charg_syspayno = charg_syspayno;
    }

    @ElVoField(physicalName = "user_main_syspayno")
    public String getUser_main_syspayno(){
        return user_main_syspayno;
    }

    @ElVoField(physicalName = "user_main_syspayno")
    public void setUser_main_syspayno(String user_main_syspayno){
        this.user_main_syspayno = user_main_syspayno;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "charg_empnm")
    public String getCharg_empnm(){
        return charg_empnm;
    }

    @ElVoField(physicalName = "charg_empnm")
    public void setCharg_empnm(String charg_empnm){
        this.charg_empnm = charg_empnm;
    }

    @ElVoField(physicalName = "user_main_nm")
    public String getUser_main_nm(){
        return user_main_nm;
    }

    @ElVoField(physicalName = "user_main_nm")
    public void setUser_main_nm(String user_main_nm){
        this.user_main_nm = user_main_nm;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "fomat_unit")
    public String getFomat_unit(){
        return fomat_unit;
    }

    @ElVoField(physicalName = "fomat_unit")
    public void setFomat_unit(String fomat_unit){
        this.fomat_unit = fomat_unit;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EpuContrctChngVo [");
        sb.append("inout_psn_clsf_cd").append("=").append(inout_psn_clsf_cd).append(",");
        sb.append("pur_req_no").append("=").append(pur_req_no).append(",");
        sb.append("contrct_no").append("=").append(contrct_no).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("end_ymd").append("=").append(end_ymd).append(",");
        sb.append("contrct_nm").append("=").append(contrct_nm).append(",");
        sb.append("charg_region_clsf").append("=").append(charg_region_clsf).append(",");
        sb.append("sn").append("=").append(sn).append(",");
        sb.append("req_dept_cd").append("=").append(req_dept_cd).append(",");
        sb.append("inout_psn_clsf_desc").append("=").append(inout_psn_clsf_desc).append(",");
        sb.append("chng_seq").append("=").append(chng_seq).append(",");
        sb.append("contrct_ymd").append("=").append(contrct_ymd).append(",");
        sb.append("progress_state").append("=").append(progress_state).append(",");
        sb.append("vend_nm").append("=").append(vend_nm).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("clsf").append("=").append(clsf).append(",");
        sb.append("contrct_vend_cd").append("=").append(contrct_vend_cd).append(",");
        sb.append("charg_syspayno").append("=").append(charg_syspayno).append(",");
        sb.append("user_main_syspayno").append("=").append(user_main_syspayno).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("charg_empnm").append("=").append(charg_empnm).append(",");
        sb.append("user_main_nm").append("=").append(user_main_nm).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("fomat_unit").append("=").append(fomat_unit).append(",");
        sb.append("empno").append("=").append(empno);
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
