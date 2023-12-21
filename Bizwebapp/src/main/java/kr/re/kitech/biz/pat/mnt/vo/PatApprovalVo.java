package kr.re.kitech.biz.pat.mnt.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatApprovalExp")
public class PatApprovalVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatApprovalVo(){
    }

    @ElDtoField(logicalName = "ext1_cd", physicalName = "ext1_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ext1_cd;

    @ElDtoField(logicalName = "ext3_cd", physicalName = "ext3_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ext3_cd;

    @ElDtoField(logicalName = "ext2_cd", physicalName = "ext2_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ext2_cd;

    @ElDtoField(logicalName = "info_cd", physicalName = "info_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String info_cd;

    @ElDtoField(logicalName = "result", physicalName = "result", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String result;

    @ElDtoField(logicalName = "manager_id", physicalName = "manager_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String manager_id;

    @ElDtoField(logicalName = "apr_state", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "state_inform_flag", physicalName = "state_inform_flag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state_inform_flag;

    @ElDtoField(logicalName = "ui_id", physicalName = "ui_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ui_id;

    @ElDtoField(logicalName = "reporter_id", physicalName = "reporter_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reporter_id;

    @ElDtoField(logicalName = "req_no", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "login_user_id", physicalName = "login_user_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String login_user_id;

    @ElDtoField(logicalName = "docu_clsf", physicalName = "docu_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String docu_clsf;

    @ElDtoField(logicalName = "cud_type", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "rightmnt_div", physicalName = "rightmnt_div", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rightmnt_div;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElVoField(physicalName = "ext1_cd")
    public String getExt1_cd(){
        return ext1_cd;
    }

    @ElVoField(physicalName = "ext1_cd")
    public void setExt1_cd(String ext1_cd){
        this.ext1_cd = ext1_cd;
    }

    @ElVoField(physicalName = "ext3_cd")
    public String getExt3_cd(){
        return ext3_cd;
    }

    @ElVoField(physicalName = "ext3_cd")
    public void setExt3_cd(String ext3_cd){
        this.ext3_cd = ext3_cd;
    }

    @ElVoField(physicalName = "ext2_cd")
    public String getExt2_cd(){
        return ext2_cd;
    }

    @ElVoField(physicalName = "ext2_cd")
    public void setExt2_cd(String ext2_cd){
        this.ext2_cd = ext2_cd;
    }

    @ElVoField(physicalName = "info_cd")
    public String getInfo_cd(){
        return info_cd;
    }

    @ElVoField(physicalName = "info_cd")
    public void setInfo_cd(String info_cd){
        this.info_cd = info_cd;
    }

    @ElVoField(physicalName = "result")
    public String getResult(){
        return result;
    }

    @ElVoField(physicalName = "result")
    public void setResult(String result){
        this.result = result;
    }

    @ElVoField(physicalName = "manager_id")
    public String getManager_id(){
        return manager_id;
    }

    @ElVoField(physicalName = "manager_id")
    public void setManager_id(String manager_id){
        this.manager_id = manager_id;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "state_inform_flag")
    public String getState_inform_flag(){
        return state_inform_flag;
    }

    @ElVoField(physicalName = "state_inform_flag")
    public void setState_inform_flag(String state_inform_flag){
        this.state_inform_flag = state_inform_flag;
    }

    @ElVoField(physicalName = "ui_id")
    public String getUi_id(){
        return ui_id;
    }

    @ElVoField(physicalName = "ui_id")
    public void setUi_id(String ui_id){
        this.ui_id = ui_id;
    }

    @ElVoField(physicalName = "reporter_id")
    public String getReporter_id(){
        return reporter_id;
    }

    @ElVoField(physicalName = "reporter_id")
    public void setReporter_id(String reporter_id){
        this.reporter_id = reporter_id;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "login_user_id")
    public String getLogin_user_id(){
        return login_user_id;
    }

    @ElVoField(physicalName = "login_user_id")
    public void setLogin_user_id(String login_user_id){
        this.login_user_id = login_user_id;
    }

    @ElVoField(physicalName = "docu_clsf")
    public String getDocu_clsf(){
        return docu_clsf;
    }

    @ElVoField(physicalName = "docu_clsf")
    public void setDocu_clsf(String docu_clsf){
        this.docu_clsf = docu_clsf;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "rightmnt_div")
    public String getRightmnt_div(){
        return rightmnt_div;
    }

    @ElVoField(physicalName = "rightmnt_div")
    public void setRightmnt_div(String rightmnt_div){
        this.rightmnt_div = rightmnt_div;
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
        sb.append("PatApprovalVo [");
        sb.append("ext1_cd").append("=").append(ext1_cd).append(",");
        sb.append("ext3_cd").append("=").append(ext3_cd).append(",");
        sb.append("ext2_cd").append("=").append(ext2_cd).append(",");
        sb.append("info_cd").append("=").append(info_cd).append(",");
        sb.append("result").append("=").append(result).append(",");
        sb.append("manager_id").append("=").append(manager_id).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("state_inform_flag").append("=").append(state_inform_flag).append(",");
        sb.append("ui_id").append("=").append(ui_id).append(",");
        sb.append("reporter_id").append("=").append(reporter_id).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("login_user_id").append("=").append(login_user_id).append(",");
        sb.append("docu_clsf").append("=").append(docu_clsf).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("rightmnt_div").append("=").append(rightmnt_div).append(",");
        sb.append("syspayno").append("=").append(syspayno);
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
