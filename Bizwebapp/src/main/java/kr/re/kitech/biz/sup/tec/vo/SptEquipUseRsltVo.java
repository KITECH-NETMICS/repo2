package kr.re.kitech.biz.sup.tec.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "장비사용일지 Vo")
public class SptEquipUseRsltVo extends kr.re.kitech.biz.sup.tec.vo.SptTecEquipComVo {
    private static final long serialVersionUID = 1L;

    public SptEquipUseRsltVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "작업구분", physicalName = "job_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_clsf;

    @ElDtoField(logicalName = "기술지원요청번호", physicalName = "tech_sup_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_sup_req_no;

    @ElDtoField(logicalName = "순번", physicalName = "tech_sup_seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int tech_sup_seq;

    @ElDtoField(logicalName = "장비사용자", physicalName = "equip_use_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_use_syspayno;

    @ElDtoField(logicalName = "장비사용시작일자", physicalName = "equip_use_start_day", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_use_start_day;

    @ElDtoField(logicalName = "장비사용종료일자", physicalName = "equip_use_cls_day", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_use_cls_day;

    @ElDtoField(logicalName = "사용구분", physicalName = "use_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_clsf;

    @ElDtoField(logicalName = "사용자구분", physicalName = "user_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_clsf;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "사용형태", physicalName = "use_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_type;

    @ElDtoField(logicalName = "기업유형", physicalName = "cmpy_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_type;

    @ElDtoField(logicalName = "비고", physicalName = "job_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_rmk;

    @ElDtoField(logicalName = "장비상태", physicalName = "equip_status", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_status;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "job_clsf")
    public String getJob_clsf(){
        return job_clsf;
    }

    @ElVoField(physicalName = "job_clsf")
    public void setJob_clsf(String job_clsf){
        this.job_clsf = job_clsf;
    }

    @ElVoField(physicalName = "tech_sup_req_no")
    public String getTech_sup_req_no(){
        return tech_sup_req_no;
    }

    @ElVoField(physicalName = "tech_sup_req_no")
    public void setTech_sup_req_no(String tech_sup_req_no){
        this.tech_sup_req_no = tech_sup_req_no;
    }

    @ElVoField(physicalName = "tech_sup_seq")
    public int getTech_sup_seq(){
        return tech_sup_seq;
    }

    @ElVoField(physicalName = "tech_sup_seq")
    public void setTech_sup_seq(int tech_sup_seq){
        this.tech_sup_seq = tech_sup_seq;
    }

    @ElVoField(physicalName = "equip_use_syspayno")
    public String getEquip_use_syspayno(){
        return equip_use_syspayno;
    }

    @ElVoField(physicalName = "equip_use_syspayno")
    public void setEquip_use_syspayno(String equip_use_syspayno){
        this.equip_use_syspayno = equip_use_syspayno;
    }

    @ElVoField(physicalName = "equip_use_start_day")
    public String getEquip_use_start_day(){
        return equip_use_start_day;
    }

    @ElVoField(physicalName = "equip_use_start_day")
    public void setEquip_use_start_day(String equip_use_start_day){
        this.equip_use_start_day = equip_use_start_day;
    }

    @ElVoField(physicalName = "equip_use_cls_day")
    public String getEquip_use_cls_day(){
        return equip_use_cls_day;
    }

    @ElVoField(physicalName = "equip_use_cls_day")
    public void setEquip_use_cls_day(String equip_use_cls_day){
        this.equip_use_cls_day = equip_use_cls_day;
    }

    @ElVoField(physicalName = "use_clsf")
    public String getUse_clsf(){
        return use_clsf;
    }

    @ElVoField(physicalName = "use_clsf")
    public void setUse_clsf(String use_clsf){
        this.use_clsf = use_clsf;
    }

    @ElVoField(physicalName = "user_clsf")
    public String getUser_clsf(){
        return user_clsf;
    }

    @ElVoField(physicalName = "user_clsf")
    public void setUser_clsf(String user_clsf){
        this.user_clsf = user_clsf;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "use_type")
    public String getUse_type(){
        return use_type;
    }

    @ElVoField(physicalName = "use_type")
    public void setUse_type(String use_type){
        this.use_type = use_type;
    }

    @ElVoField(physicalName = "cmpy_type")
    public String getCmpy_type(){
        return cmpy_type;
    }

    @ElVoField(physicalName = "cmpy_type")
    public void setCmpy_type(String cmpy_type){
        this.cmpy_type = cmpy_type;
    }

    @ElVoField(physicalName = "job_rmk")
    public String getJob_rmk(){
        return job_rmk;
    }

    @ElVoField(physicalName = "job_rmk")
    public void setJob_rmk(String job_rmk){
        this.job_rmk = job_rmk;
    }

    @ElVoField(physicalName = "equip_status")
    public String getEquip_status(){
        return equip_status;
    }

    @ElVoField(physicalName = "equip_status")
    public void setEquip_status(String equip_status){
        this.equip_status = equip_status;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptEquipUseRsltVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("job_clsf").append("=").append(job_clsf).append(",");
        sb.append("tech_sup_req_no").append("=").append(tech_sup_req_no).append(",");
        sb.append("tech_sup_seq").append("=").append(tech_sup_seq).append(",");
        sb.append("equip_use_syspayno").append("=").append(equip_use_syspayno).append(",");
        sb.append("equip_use_start_day").append("=").append(equip_use_start_day).append(",");
        sb.append("equip_use_cls_day").append("=").append(equip_use_cls_day).append(",");
        sb.append("use_clsf").append("=").append(use_clsf).append(",");
        sb.append("user_clsf").append("=").append(user_clsf).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("use_type").append("=").append(use_type).append(",");
        sb.append("cmpy_type").append("=").append(cmpy_type).append(",");
        sb.append("job_rmk").append("=").append(job_rmk).append(",");
        sb.append("equip_status").append("=").append(equip_status).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no);
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
