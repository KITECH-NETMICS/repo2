package kr.re.kitech.biz.pat.chr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatMastrExp")
public class PatMastrVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatMastrVo(){
  }

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;
  
    @ElDtoField(logicalName = "mngmtNo", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;
  
    @ElDtoField(logicalName = "patClsf", physicalName = "pat_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_clsf;
  
    @ElDtoField(logicalName = "smitappCompltPsn", physicalName = "smitapp_complt_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_complt_psn;
  
    @ElDtoField(logicalName = "smitappCompltEmpno", physicalName = "smitapp_complt_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_complt_empno;
  
    @ElDtoField(logicalName = "smitappCompltNm", physicalName = "smitapp_complt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_complt_nm;
  
    @ElDtoField(logicalName = "smitappCompltYmd", physicalName = "smitapp_complt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_complt_ymd;
  
    @ElDtoField(logicalName = "smitappNo", physicalName = "smitapp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_no;
  
    @ElDtoField(logicalName = "smitappYmd", physicalName = "smitapp_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_ymd;
  
    @ElDtoField(logicalName = "smitappRegYmd", physicalName = "smitapp_reg_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_reg_ymd;
  
    @ElDtoField(logicalName = "smitappNatnCd", physicalName = "smitapp_natn_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_natn_cd;
  
    @ElDtoField(logicalName = "smitappNatnNm", physicalName = "smitapp_natn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_natn_nm;
  
    @ElDtoField(logicalName = "smitappWay", physicalName = "smitapp_way", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_way;
  
    @ElDtoField(logicalName = "smitappWayNm", physicalName = "smitapp_way_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_way_nm;
  
    @ElDtoField(logicalName = "intrnSmitappNo", physicalName = "intrn_smitapp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intrn_smitapp_no;
  
    @ElDtoField(logicalName = "intrnSmitappYmd", physicalName = "intrn_smitapp_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intrn_smitapp_ymd;
  
    @ElDtoField(logicalName = "smitappOccrClsf", physicalName = "smitapp_occr_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_occr_clsf;
  
    @ElDtoField(logicalName = "smitappOccrClsfNm", physicalName = "smitapp_occr_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_occr_clsf_nm;
  
    @ElDtoField(logicalName = "smitappKrnNm", physicalName = "smitapp_krn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_krn_nm;
  
    @ElDtoField(logicalName = "smitappEngNm", physicalName = "smitapp_eng_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_eng_nm;
  
    @ElDtoField(logicalName = "prityrgtMainRspnsNo", physicalName = "prityrgt_main_rspns_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prityrgt_main_rspns_no;
  
    @ElDtoField(logicalName = "prityrgtMainRspnsYmd", physicalName = "prityrgt_main_rspns_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prityrgt_main_rspns_ymd;
  
    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;
  
    @ElDtoField(logicalName = "state", physicalName = "state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state;
  
    @ElDtoField(logicalName = "rightExpirYmd", physicalName = "right_expir_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String right_expir_ymd;
  
    @ElDtoField(logicalName = "ipc01", physicalName = "ipc_01", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_01;
  
    @ElDtoField(logicalName = "ipc0101", physicalName = "ipc_01_01", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_01_01;
  
    @ElDtoField(logicalName = "ipc0102", physicalName = "ipc_01_02", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_01_02;
  
    @ElDtoField(logicalName = "ipc0103", physicalName = "ipc_01_03", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_01_03;
  
    @ElDtoField(logicalName = "ipc0104", physicalName = "ipc_01_04", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_01_04;
  
    @ElDtoField(logicalName = "ipc02", physicalName = "ipc_02", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_02;
  
    @ElDtoField(logicalName = "ipc0201", physicalName = "ipc_02_01", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_02_01;
  
    @ElDtoField(logicalName = "ipc0202", physicalName = "ipc_02_02", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_02_02;
  
    @ElDtoField(logicalName = "ipc0203", physicalName = "ipc_02_03", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_02_03;
  
    @ElDtoField(logicalName = "ipc0204", physicalName = "ipc_02_04", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_02_04;
  
    @ElDtoField(logicalName = "ipc03", physicalName = "ipc_03", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_03;
  
    @ElDtoField(logicalName = "ipc0301", physicalName = "ipc_03_01", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_03_01;
  
    @ElDtoField(logicalName = "ipc0302", physicalName = "ipc_03_02", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_03_02;
  
    @ElDtoField(logicalName = "ipc0303", physicalName = "ipc_03_03", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_03_03;
  
    @ElDtoField(logicalName = "ipc0304", physicalName = "ipc_03_04", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_03_04;
  
    @ElDtoField(logicalName = "examReflectClsf", physicalName = "exam_reflect_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exam_reflect_clsf;
  
    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }
  
    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }
  
    @ElVoField(physicalName = "mngmt_no")
    public String getMngmt_no(){
        return mngmt_no;
    }
  
    @ElVoField(physicalName = "mngmt_no")
    public void setMngmt_no(String mngmt_no){
        this.mngmt_no = mngmt_no;
    }
  
    @ElVoField(physicalName = "pat_clsf")
    public String getPat_clsf(){
        return pat_clsf;
    }
  
    @ElVoField(physicalName = "pat_clsf")
    public void setPat_clsf(String pat_clsf){
        this.pat_clsf = pat_clsf;
    }
  
    @ElVoField(physicalName = "smitapp_complt_psn")
    public String getSmitapp_complt_psn(){
        return smitapp_complt_psn;
    }
  
    @ElVoField(physicalName = "smitapp_complt_psn")
    public void setSmitapp_complt_psn(String smitapp_complt_psn){
        this.smitapp_complt_psn = smitapp_complt_psn;
    }
  
    @ElVoField(physicalName = "smitapp_complt_empno")
    public String getSmitapp_complt_empno(){
        return smitapp_complt_empno;
    }
  
    @ElVoField(physicalName = "smitapp_complt_empno")
    public void setSmitapp_complt_empno(String smitapp_complt_empno){
        this.smitapp_complt_empno = smitapp_complt_empno;
    }
  
    @ElVoField(physicalName = "smitapp_complt_nm")
    public String getSmitapp_complt_nm(){
        return smitapp_complt_nm;
    }
  
    @ElVoField(physicalName = "smitapp_complt_nm")
    public void setSmitapp_complt_nm(String smitapp_complt_nm){
        this.smitapp_complt_nm = smitapp_complt_nm;
    }
  
    @ElVoField(physicalName = "smitapp_complt_ymd")
    public String getSmitapp_complt_ymd(){
        return smitapp_complt_ymd;
    }
  
    @ElVoField(physicalName = "smitapp_complt_ymd")
    public void setSmitapp_complt_ymd(String smitapp_complt_ymd){
        this.smitapp_complt_ymd = smitapp_complt_ymd;
    }
  
    @ElVoField(physicalName = "smitapp_no")
    public String getSmitapp_no(){
        return smitapp_no;
    }
  
    @ElVoField(physicalName = "smitapp_no")
    public void setSmitapp_no(String smitapp_no){
        this.smitapp_no = smitapp_no;
    }
  
    @ElVoField(physicalName = "smitapp_ymd")
    public String getSmitapp_ymd(){
        return smitapp_ymd;
    }
  
    @ElVoField(physicalName = "smitapp_ymd")
    public void setSmitapp_ymd(String smitapp_ymd){
        this.smitapp_ymd = smitapp_ymd;
    }
  
    @ElVoField(physicalName = "smitapp_reg_ymd")
    public String getSmitapp_reg_ymd(){
        return smitapp_reg_ymd;
    }
  
    @ElVoField(physicalName = "smitapp_reg_ymd")
    public void setSmitapp_reg_ymd(String smitapp_reg_ymd){
        this.smitapp_reg_ymd = smitapp_reg_ymd;
    }
  
    @ElVoField(physicalName = "smitapp_natn_cd")
    public String getSmitapp_natn_cd(){
        return smitapp_natn_cd;
    }
  
    @ElVoField(physicalName = "smitapp_natn_cd")
    public void setSmitapp_natn_cd(String smitapp_natn_cd){
        this.smitapp_natn_cd = smitapp_natn_cd;
    }
  
    @ElVoField(physicalName = "smitapp_natn_nm")
    public String getSmitapp_natn_nm(){
        return smitapp_natn_nm;
    }
  
    @ElVoField(physicalName = "smitapp_natn_nm")
    public void setSmitapp_natn_nm(String smitapp_natn_nm){
        this.smitapp_natn_nm = smitapp_natn_nm;
    }
  
    @ElVoField(physicalName = "smitapp_way")
    public String getSmitapp_way(){
        return smitapp_way;
    }
  
    @ElVoField(physicalName = "smitapp_way")
    public void setSmitapp_way(String smitapp_way){
        this.smitapp_way = smitapp_way;
    }
  
    @ElVoField(physicalName = "smitapp_way_nm")
    public String getSmitapp_way_nm(){
        return smitapp_way_nm;
    }
  
    @ElVoField(physicalName = "smitapp_way_nm")
    public void setSmitapp_way_nm(String smitapp_way_nm){
        this.smitapp_way_nm = smitapp_way_nm;
    }
  
    @ElVoField(physicalName = "intrn_smitapp_no")
    public String getIntrn_smitapp_no(){
        return intrn_smitapp_no;
    }
  
    @ElVoField(physicalName = "intrn_smitapp_no")
    public void setIntrn_smitapp_no(String intrn_smitapp_no){
        this.intrn_smitapp_no = intrn_smitapp_no;
    }
  
    @ElVoField(physicalName = "intrn_smitapp_ymd")
    public String getIntrn_smitapp_ymd(){
        return intrn_smitapp_ymd;
    }
  
    @ElVoField(physicalName = "intrn_smitapp_ymd")
    public void setIntrn_smitapp_ymd(String intrn_smitapp_ymd){
        this.intrn_smitapp_ymd = intrn_smitapp_ymd;
    }
  
    @ElVoField(physicalName = "smitapp_occr_clsf")
    public String getSmitapp_occr_clsf(){
        return smitapp_occr_clsf;
    }
  
    @ElVoField(physicalName = "smitapp_occr_clsf")
    public void setSmitapp_occr_clsf(String smitapp_occr_clsf){
        this.smitapp_occr_clsf = smitapp_occr_clsf;
    }
  
    @ElVoField(physicalName = "smitapp_occr_clsf_nm")
    public String getSmitapp_occr_clsf_nm(){
        return smitapp_occr_clsf_nm;
    }
  
    @ElVoField(physicalName = "smitapp_occr_clsf_nm")
    public void setSmitapp_occr_clsf_nm(String smitapp_occr_clsf_nm){
        this.smitapp_occr_clsf_nm = smitapp_occr_clsf_nm;
    }
  
    @ElVoField(physicalName = "smitapp_krn_nm")
    public String getSmitapp_krn_nm(){
        return smitapp_krn_nm;
    }
  
    @ElVoField(physicalName = "smitapp_krn_nm")
    public void setSmitapp_krn_nm(String smitapp_krn_nm){
        this.smitapp_krn_nm = smitapp_krn_nm;
    }
  
    @ElVoField(physicalName = "smitapp_eng_nm")
    public String getSmitapp_eng_nm(){
        return smitapp_eng_nm;
    }
  
    @ElVoField(physicalName = "smitapp_eng_nm")
    public void setSmitapp_eng_nm(String smitapp_eng_nm){
        this.smitapp_eng_nm = smitapp_eng_nm;
    }
  
    @ElVoField(physicalName = "prityrgt_main_rspns_no")
    public String getPrityrgt_main_rspns_no(){
        return prityrgt_main_rspns_no;
    }
  
    @ElVoField(physicalName = "prityrgt_main_rspns_no")
    public void setPrityrgt_main_rspns_no(String prityrgt_main_rspns_no){
        this.prityrgt_main_rspns_no = prityrgt_main_rspns_no;
    }
  
    @ElVoField(physicalName = "prityrgt_main_rspns_ymd")
    public String getPrityrgt_main_rspns_ymd(){
        return prityrgt_main_rspns_ymd;
    }
  
    @ElVoField(physicalName = "prityrgt_main_rspns_ymd")
    public void setPrityrgt_main_rspns_ymd(String prityrgt_main_rspns_ymd){
        this.prityrgt_main_rspns_ymd = prityrgt_main_rspns_ymd;
    }
  
    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }
  
    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }
  
    @ElVoField(physicalName = "state")
    public String getState(){
        return state;
    }
  
    @ElVoField(physicalName = "state")
    public void setState(String state){
        this.state = state;
    }
  
    @ElVoField(physicalName = "right_expir_ymd")
    public String getRight_expir_ymd(){
        return right_expir_ymd;
    }
  
    @ElVoField(physicalName = "right_expir_ymd")
    public void setRight_expir_ymd(String right_expir_ymd){
        this.right_expir_ymd = right_expir_ymd;
    }
  
    @ElVoField(physicalName = "ipc_01")
    public String getIpc_01(){
        return ipc_01;
    }
  
    @ElVoField(physicalName = "ipc_01")
    public void setIpc_01(String ipc_01){
        this.ipc_01 = ipc_01;
    }
  
    @ElVoField(physicalName = "ipc_01_01")
    public String getIpc_01_01(){
        return ipc_01_01;
    }
  
    @ElVoField(physicalName = "ipc_01_01")
    public void setIpc_01_01(String ipc_01_01){
        this.ipc_01_01 = ipc_01_01;
    }
  
    @ElVoField(physicalName = "ipc_01_02")
    public String getIpc_01_02(){
        return ipc_01_02;
    }
  
    @ElVoField(physicalName = "ipc_01_02")
    public void setIpc_01_02(String ipc_01_02){
        this.ipc_01_02 = ipc_01_02;
    }
  
    @ElVoField(physicalName = "ipc_01_03")
    public String getIpc_01_03(){
        return ipc_01_03;
    }
  
    @ElVoField(physicalName = "ipc_01_03")
    public void setIpc_01_03(String ipc_01_03){
        this.ipc_01_03 = ipc_01_03;
    }
  
    @ElVoField(physicalName = "ipc_01_04")
    public String getIpc_01_04(){
        return ipc_01_04;
    }
  
    @ElVoField(physicalName = "ipc_01_04")
    public void setIpc_01_04(String ipc_01_04){
        this.ipc_01_04 = ipc_01_04;
    }
  
    @ElVoField(physicalName = "ipc_02")
    public String getIpc_02(){
        return ipc_02;
    }
  
    @ElVoField(physicalName = "ipc_02")
    public void setIpc_02(String ipc_02){
        this.ipc_02 = ipc_02;
    }
  
    @ElVoField(physicalName = "ipc_02_01")
    public String getIpc_02_01(){
        return ipc_02_01;
    }
  
    @ElVoField(physicalName = "ipc_02_01")
    public void setIpc_02_01(String ipc_02_01){
        this.ipc_02_01 = ipc_02_01;
    }
  
    @ElVoField(physicalName = "ipc_02_02")
    public String getIpc_02_02(){
        return ipc_02_02;
    }
  
    @ElVoField(physicalName = "ipc_02_02")
    public void setIpc_02_02(String ipc_02_02){
        this.ipc_02_02 = ipc_02_02;
    }
  
    @ElVoField(physicalName = "ipc_02_03")
    public String getIpc_02_03(){
        return ipc_02_03;
    }
  
    @ElVoField(physicalName = "ipc_02_03")
    public void setIpc_02_03(String ipc_02_03){
        this.ipc_02_03 = ipc_02_03;
    }
  
    @ElVoField(physicalName = "ipc_02_04")
    public String getIpc_02_04(){
        return ipc_02_04;
    }
  
    @ElVoField(physicalName = "ipc_02_04")
    public void setIpc_02_04(String ipc_02_04){
        this.ipc_02_04 = ipc_02_04;
    }
  
    @ElVoField(physicalName = "ipc_03")
    public String getIpc_03(){
        return ipc_03;
    }
  
    @ElVoField(physicalName = "ipc_03")
    public void setIpc_03(String ipc_03){
        this.ipc_03 = ipc_03;
    }
  
    @ElVoField(physicalName = "ipc_03_01")
    public String getIpc_03_01(){
        return ipc_03_01;
    }
  
    @ElVoField(physicalName = "ipc_03_01")
    public void setIpc_03_01(String ipc_03_01){
        this.ipc_03_01 = ipc_03_01;
    }
  
    @ElVoField(physicalName = "ipc_03_02")
    public String getIpc_03_02(){
        return ipc_03_02;
    }
  
    @ElVoField(physicalName = "ipc_03_02")
    public void setIpc_03_02(String ipc_03_02){
        this.ipc_03_02 = ipc_03_02;
    }
  
    @ElVoField(physicalName = "ipc_03_03")
    public String getIpc_03_03(){
        return ipc_03_03;
    }
  
    @ElVoField(physicalName = "ipc_03_03")
    public void setIpc_03_03(String ipc_03_03){
        this.ipc_03_03 = ipc_03_03;
    }
  
    @ElVoField(physicalName = "ipc_03_04")
    public String getIpc_03_04(){
        return ipc_03_04;
    }
  
    @ElVoField(physicalName = "ipc_03_04")
    public void setIpc_03_04(String ipc_03_04){
        this.ipc_03_04 = ipc_03_04;
    }
  
    @ElVoField(physicalName = "exam_reflect_clsf")
    public String getExam_reflect_clsf(){
        return exam_reflect_clsf;
    }
  
    @ElVoField(physicalName = "exam_reflect_clsf")
    public void setExam_reflect_clsf(String exam_reflect_clsf){
        this.exam_reflect_clsf = exam_reflect_clsf;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatMastrVo [");
      sb.append("req_no").append("=").append(req_no).append(",");
      sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
      sb.append("pat_clsf").append("=").append(pat_clsf).append(",");
      sb.append("smitapp_complt_psn").append("=").append(smitapp_complt_psn).append(",");
      sb.append("smitapp_complt_empno").append("=").append(smitapp_complt_empno).append(",");
      sb.append("smitapp_complt_nm").append("=").append(smitapp_complt_nm).append(",");
      sb.append("smitapp_complt_ymd").append("=").append(smitapp_complt_ymd).append(",");
      sb.append("smitapp_no").append("=").append(smitapp_no).append(",");
      sb.append("smitapp_ymd").append("=").append(smitapp_ymd).append(",");
      sb.append("smitapp_reg_ymd").append("=").append(smitapp_reg_ymd).append(",");
      sb.append("smitapp_natn_cd").append("=").append(smitapp_natn_cd).append(",");
      sb.append("smitapp_natn_nm").append("=").append(smitapp_natn_nm).append(",");
      sb.append("smitapp_way").append("=").append(smitapp_way).append(",");
      sb.append("smitapp_way_nm").append("=").append(smitapp_way_nm).append(",");
      sb.append("intrn_smitapp_no").append("=").append(intrn_smitapp_no).append(",");
      sb.append("intrn_smitapp_ymd").append("=").append(intrn_smitapp_ymd).append(",");
      sb.append("smitapp_occr_clsf").append("=").append(smitapp_occr_clsf).append(",");
      sb.append("smitapp_occr_clsf_nm").append("=").append(smitapp_occr_clsf_nm).append(",");
      sb.append("smitapp_krn_nm").append("=").append(smitapp_krn_nm).append(",");
      sb.append("smitapp_eng_nm").append("=").append(smitapp_eng_nm).append(",");
      sb.append("prityrgt_main_rspns_no").append("=").append(prityrgt_main_rspns_no).append(",");
      sb.append("prityrgt_main_rspns_ymd").append("=").append(prityrgt_main_rspns_ymd).append(",");
      sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
      sb.append("state").append("=").append(state).append(",");
      sb.append("right_expir_ymd").append("=").append(right_expir_ymd).append(",");
      sb.append("ipc_01").append("=").append(ipc_01).append(",");
      sb.append("ipc_01_01").append("=").append(ipc_01_01).append(",");
      sb.append("ipc_01_02").append("=").append(ipc_01_02).append(",");
      sb.append("ipc_01_03").append("=").append(ipc_01_03).append(",");
      sb.append("ipc_01_04").append("=").append(ipc_01_04).append(",");
      sb.append("ipc_02").append("=").append(ipc_02).append(",");
      sb.append("ipc_02_01").append("=").append(ipc_02_01).append(",");
      sb.append("ipc_02_02").append("=").append(ipc_02_02).append(",");
      sb.append("ipc_02_03").append("=").append(ipc_02_03).append(",");
      sb.append("ipc_02_04").append("=").append(ipc_02_04).append(",");
      sb.append("ipc_03").append("=").append(ipc_03).append(",");
      sb.append("ipc_03_01").append("=").append(ipc_03_01).append(",");
      sb.append("ipc_03_02").append("=").append(ipc_03_02).append(",");
      sb.append("ipc_03_03").append("=").append(ipc_03_03).append(",");
      sb.append("ipc_03_04").append("=").append(ipc_03_04).append(",");
      sb.append("exam_reflect_clsf").append("=").append(exam_reflect_clsf);
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