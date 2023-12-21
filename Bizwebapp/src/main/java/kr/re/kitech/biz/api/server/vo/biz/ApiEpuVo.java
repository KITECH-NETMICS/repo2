package kr.re.kitech.biz.api.server.vo.biz;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "EpuProcess SQL 전용 Vo")
public class ApiEpuVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ApiEpuVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "pur_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_req_no;

    @ElDtoField(logicalName = "상태코드", physicalName = "state_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state_cd;

    @ElDtoField(logicalName = "구매담당자 사번", physicalName = "charg_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_syspayno;

    @ElDtoField(logicalName = "구매담당자 부서코드", physicalName = "charg_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_dept_cd;

    @ElDtoField(logicalName = "구매담당자 부서신설일", physicalName = "charg_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_dept_new_ymd;

    @ElDtoField(logicalName = "구매담당자 편성코드(지역코드:FCC)", physicalName = "charg_region_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_region_clsf;

    @ElDtoField(logicalName = "구매담당자 본부코드", physicalName = "charg_divsn_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_divsn_dept;

    @ElDtoField(logicalName = "구매담당자 관리주체(계약관리주체)코드", physicalName = "cont_mgmt_mbody", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cont_mgmt_mbody;

    @ElDtoField(logicalName = "적격심사 결과 문서번호", physicalName = "tech_eval_assist_doc_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_eval_assist_doc_no;

    @ElVoField(physicalName = "pur_req_no")
    public String getPur_req_no(){
        return pur_req_no;
    }

    @ElVoField(physicalName = "pur_req_no")
    public void setPur_req_no(String pur_req_no){
        this.pur_req_no = pur_req_no;
    }

    @ElVoField(physicalName = "state_cd")
    public String getState_cd(){
        return state_cd;
    }

    @ElVoField(physicalName = "state_cd")
    public void setState_cd(String state_cd){
        this.state_cd = state_cd;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public String getCharg_syspayno(){
        return charg_syspayno;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public void setCharg_syspayno(String charg_syspayno){
        this.charg_syspayno = charg_syspayno;
    }

    @ElVoField(physicalName = "charg_dept_cd")
    public String getCharg_dept_cd(){
        return charg_dept_cd;
    }

    @ElVoField(physicalName = "charg_dept_cd")
    public void setCharg_dept_cd(String charg_dept_cd){
        this.charg_dept_cd = charg_dept_cd;
    }

    @ElVoField(physicalName = "charg_dept_new_ymd")
    public String getCharg_dept_new_ymd(){
        return charg_dept_new_ymd;
    }

    @ElVoField(physicalName = "charg_dept_new_ymd")
    public void setCharg_dept_new_ymd(String charg_dept_new_ymd){
        this.charg_dept_new_ymd = charg_dept_new_ymd;
    }

    @ElVoField(physicalName = "charg_region_clsf")
    public String getCharg_region_clsf(){
        return charg_region_clsf;
    }

    @ElVoField(physicalName = "charg_region_clsf")
    public void setCharg_region_clsf(String charg_region_clsf){
        this.charg_region_clsf = charg_region_clsf;
    }

    @ElVoField(physicalName = "charg_divsn_dept")
    public String getCharg_divsn_dept(){
        return charg_divsn_dept;
    }

    @ElVoField(physicalName = "charg_divsn_dept")
    public void setCharg_divsn_dept(String charg_divsn_dept){
        this.charg_divsn_dept = charg_divsn_dept;
    }

    @ElVoField(physicalName = "cont_mgmt_mbody")
    public String getCont_mgmt_mbody(){
        return cont_mgmt_mbody;
    }

    @ElVoField(physicalName = "cont_mgmt_mbody")
    public void setCont_mgmt_mbody(String cont_mgmt_mbody){
        this.cont_mgmt_mbody = cont_mgmt_mbody;
    }

    @ElVoField(physicalName = "tech_eval_assist_doc_no")
    public String getTech_eval_assist_doc_no(){
        return tech_eval_assist_doc_no;
    }

    @ElVoField(physicalName = "tech_eval_assist_doc_no")
    public void setTech_eval_assist_doc_no(String tech_eval_assist_doc_no){
        this.tech_eval_assist_doc_no = tech_eval_assist_doc_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiEpuVo [");
        sb.append("pur_req_no").append("=").append(pur_req_no).append(",");
        sb.append("state_cd").append("=").append(state_cd).append(",");
        sb.append("charg_syspayno").append("=").append(charg_syspayno).append(",");
        sb.append("charg_dept_cd").append("=").append(charg_dept_cd).append(",");
        sb.append("charg_dept_new_ymd").append("=").append(charg_dept_new_ymd).append(",");
        sb.append("charg_region_clsf").append("=").append(charg_region_clsf).append(",");
        sb.append("charg_divsn_dept").append("=").append(charg_divsn_dept).append(",");
        sb.append("cont_mgmt_mbody").append("=").append(cont_mgmt_mbody).append(",");
        sb.append("tech_eval_assist_doc_no").append("=").append(tech_eval_assist_doc_no);
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
