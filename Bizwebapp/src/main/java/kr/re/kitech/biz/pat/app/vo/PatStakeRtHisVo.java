package kr.re.kitech.biz.pat.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "지재권변경이력 Vo")
public class PatStakeRtHisVo extends kr.re.kitech.biz.pat.app.vo.PatCoinvntPsnVo {
    private static final long serialVersionUID = 1L;

    public PatStakeRtHisVo(){
    }

    @ElDtoField(logicalName = "결재번호", physicalName = "elecapp_docu_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String elecapp_docu_no;

    @ElDtoField(logicalName = "변경구분", physicalName = "skate_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String skate_clsf;

    @ElDtoField(logicalName = "입력일자", physicalName = "input_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String input_ymd;

    @ElDtoField(logicalName = "이력순번", physicalName = "his_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String his_seq;

    @ElDtoField(logicalName = "업체코드", physicalName = "vend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_cd;

    @ElDtoField(logicalName = "업체명", physicalName = "vend_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_nm;

    @ElDtoField(logicalName = "사업자등록번호", physicalName = "vend_bsn_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_bsn_no;

    @ElDtoField(logicalName = "대표자", physicalName = "charg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg;

    @ElDtoField(logicalName = "사건특이사항", physicalName = "acdt_unusual_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String acdt_unusual_item;

    @ElDtoField(logicalName = "변경상태", physicalName = "chng_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chng_state;

    @ElDtoField(logicalName = "업체유형", physicalName = "vend_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_type;

    @ElDtoField(logicalName = "신청자개인번호", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "신청자명", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "근무구분", physicalName = "work_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_clsf;

    @ElDtoField(logicalName = "출원일자", physicalName = "smitapp_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_ymd;

    @ElDtoField(logicalName = "담당자", physicalName = "charg_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_syspayno;

    @ElVoField(physicalName = "elecapp_docu_no")
    public String getElecapp_docu_no(){
        return elecapp_docu_no;
    }

    @ElVoField(physicalName = "elecapp_docu_no")
    public void setElecapp_docu_no(String elecapp_docu_no){
        this.elecapp_docu_no = elecapp_docu_no;
    }

    @ElVoField(physicalName = "skate_clsf")
    public String getSkate_clsf(){
        return skate_clsf;
    }

    @ElVoField(physicalName = "skate_clsf")
    public void setSkate_clsf(String skate_clsf){
        this.skate_clsf = skate_clsf;
    }

    @ElVoField(physicalName = "input_ymd")
    public String getInput_ymd(){
        return input_ymd;
    }

    @ElVoField(physicalName = "input_ymd")
    public void setInput_ymd(String input_ymd){
        this.input_ymd = input_ymd;
    }

    @ElVoField(physicalName = "his_seq")
    public String getHis_seq(){
        return his_seq;
    }

    @ElVoField(physicalName = "his_seq")
    public void setHis_seq(String his_seq){
        this.his_seq = his_seq;
    }

    @ElVoField(physicalName = "vend_cd")
    public String getVend_cd(){
        return vend_cd;
    }

    @ElVoField(physicalName = "vend_cd")
    public void setVend_cd(String vend_cd){
        this.vend_cd = vend_cd;
    }

    @ElVoField(physicalName = "vend_nm")
    public String getVend_nm(){
        return vend_nm;
    }

    @ElVoField(physicalName = "vend_nm")
    public void setVend_nm(String vend_nm){
        this.vend_nm = vend_nm;
    }

    @ElVoField(physicalName = "vend_bsn_no")
    public String getVend_bsn_no(){
        return vend_bsn_no;
    }

    @ElVoField(physicalName = "vend_bsn_no")
    public void setVend_bsn_no(String vend_bsn_no){
        this.vend_bsn_no = vend_bsn_no;
    }

    @ElVoField(physicalName = "charg")
    public String getCharg(){
        return charg;
    }

    @ElVoField(physicalName = "charg")
    public void setCharg(String charg){
        this.charg = charg;
    }

    @ElVoField(physicalName = "acdt_unusual_item")
    public String getAcdt_unusual_item(){
        return acdt_unusual_item;
    }

    @ElVoField(physicalName = "acdt_unusual_item")
    public void setAcdt_unusual_item(String acdt_unusual_item){
        this.acdt_unusual_item = acdt_unusual_item;
    }

    @ElVoField(physicalName = "chng_state")
    public String getChng_state(){
        return chng_state;
    }

    @ElVoField(physicalName = "chng_state")
    public void setChng_state(String chng_state){
        this.chng_state = chng_state;
    }

    @ElVoField(physicalName = "vend_type")
    public String getVend_type(){
        return vend_type;
    }

    @ElVoField(physicalName = "vend_type")
    public void setVend_type(String vend_type){
        this.vend_type = vend_type;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "work_clsf")
    public String getWork_clsf(){
        return work_clsf;
    }

    @ElVoField(physicalName = "work_clsf")
    public void setWork_clsf(String work_clsf){
        this.work_clsf = work_clsf;
    }

    @ElVoField(physicalName = "smitapp_ymd")
    public String getSmitapp_ymd(){
        return smitapp_ymd;
    }

    @ElVoField(physicalName = "smitapp_ymd")
    public void setSmitapp_ymd(String smitapp_ymd){
        this.smitapp_ymd = smitapp_ymd;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public String getCharg_syspayno(){
        return charg_syspayno;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public void setCharg_syspayno(String charg_syspayno){
        this.charg_syspayno = charg_syspayno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatStakeRtHisVo [");
        sb.append("elecapp_docu_no").append("=").append(elecapp_docu_no).append(",");
        sb.append("skate_clsf").append("=").append(skate_clsf).append(",");
        sb.append("input_ymd").append("=").append(input_ymd).append(",");
        sb.append("his_seq").append("=").append(his_seq).append(",");
        sb.append("vend_cd").append("=").append(vend_cd).append(",");
        sb.append("vend_nm").append("=").append(vend_nm).append(",");
        sb.append("vend_bsn_no").append("=").append(vend_bsn_no).append(",");
        sb.append("charg").append("=").append(charg).append(",");
        sb.append("acdt_unusual_item").append("=").append(acdt_unusual_item).append(",");
        sb.append("chng_state").append("=").append(chng_state).append(",");
        sb.append("vend_type").append("=").append(vend_type).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("work_clsf").append("=").append(work_clsf).append(",");
        sb.append("smitapp_ymd").append("=").append(smitapp_ymd).append(",");
        sb.append("charg_syspayno").append("=").append(charg_syspayno);
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
