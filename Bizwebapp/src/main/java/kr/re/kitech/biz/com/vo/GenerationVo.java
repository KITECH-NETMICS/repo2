package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "공통채번")
public class GenerationVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public GenerationVo(){
    }

    @ElDtoField(logicalName = "업무구분", physicalName = "sys_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sys_clsf;

    @ElDtoField(logicalName = "결의구분", physicalName = "slip_typ_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_typ_cd;

    @ElDtoField(logicalName = "채번번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "문서구분", physicalName = "docu_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String docu_clsf;

    @ElDtoField(logicalName = "사용연도", physicalName = "yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String yr;

    @ElDtoField(logicalName = "사용월", physicalName = "month", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String month;

    @ElDtoField(logicalName = "생성번호", physicalName = "genrt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String genrt_no;

    @ElDtoField(logicalName = "비고", physicalName = "etc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String etc;

    @ElDtoField(logicalName = "구분값", physicalName = "cd_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_clsf;

    @ElDtoField(logicalName = "등록일자", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "채번결합", physicalName = "gen_no_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String gen_no_seq;

    @ElDtoField(logicalName = "구분값", physicalName = "no_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String no_clsf;

    @ElDtoField(logicalName = "통제번호", physicalName = "creat_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String creat_no;

    @ElDtoField(logicalName = "생성일자", physicalName = "creat_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String creat_ymd;

    @ElDtoField(logicalName = "생성순번", physicalName = "creat_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String creat_odr;

    @ElDtoField(logicalName = "증빙구분", physicalName = "is_evid", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private boolean is_evid;

    @ElVoField(physicalName = "sys_clsf")
    public String getSys_clsf(){
        return sys_clsf;
    }

    @ElVoField(physicalName = "sys_clsf")
    public void setSys_clsf(String sys_clsf){
        this.sys_clsf = sys_clsf;
    }

    @ElVoField(physicalName = "slip_typ_cd")
    public String getSlip_typ_cd(){
        return slip_typ_cd;
    }

    @ElVoField(physicalName = "slip_typ_cd")
    public void setSlip_typ_cd(String slip_typ_cd){
        this.slip_typ_cd = slip_typ_cd;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "docu_clsf")
    public String getDocu_clsf(){
        return docu_clsf;
    }

    @ElVoField(physicalName = "docu_clsf")
    public void setDocu_clsf(String docu_clsf){
        this.docu_clsf = docu_clsf;
    }

    @ElVoField(physicalName = "yr")
    public String getYr(){
        return yr;
    }

    @ElVoField(physicalName = "yr")
    public void setYr(String yr){
        this.yr = yr;
    }

    @ElVoField(physicalName = "month")
    public String getMonth(){
        return month;
    }

    @ElVoField(physicalName = "month")
    public void setMonth(String month){
        this.month = month;
    }

    @ElVoField(physicalName = "genrt_no")
    public String getGenrt_no(){
        return genrt_no;
    }

    @ElVoField(physicalName = "genrt_no")
    public void setGenrt_no(String genrt_no){
        this.genrt_no = genrt_no;
    }

    @ElVoField(physicalName = "etc")
    public String getEtc(){
        return etc;
    }

    @ElVoField(physicalName = "etc")
    public void setEtc(String etc){
        this.etc = etc;
    }

    @ElVoField(physicalName = "cd_clsf")
    public String getCd_clsf(){
        return cd_clsf;
    }

    @ElVoField(physicalName = "cd_clsf")
    public void setCd_clsf(String cd_clsf){
        this.cd_clsf = cd_clsf;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        return regst_daytm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "gen_no_seq")
    public String getGen_no_seq(){
        return gen_no_seq;
    }

    @ElVoField(physicalName = "gen_no_seq")
    public void setGen_no_seq(String gen_no_seq){
        this.gen_no_seq = gen_no_seq;
    }

    @ElVoField(physicalName = "no_clsf")
    public String getNo_clsf(){
        return no_clsf;
    }

    @ElVoField(physicalName = "no_clsf")
    public void setNo_clsf(String no_clsf){
        this.no_clsf = no_clsf;
    }

    @ElVoField(physicalName = "creat_no")
    public String getCreat_no(){
        return creat_no;
    }

    @ElVoField(physicalName = "creat_no")
    public void setCreat_no(String creat_no){
        this.creat_no = creat_no;
    }

    @ElVoField(physicalName = "creat_ymd")
    public String getCreat_ymd(){
        return creat_ymd;
    }

    @ElVoField(physicalName = "creat_ymd")
    public void setCreat_ymd(String creat_ymd){
        this.creat_ymd = creat_ymd;
    }

    @ElVoField(physicalName = "creat_odr")
    public String getCreat_odr(){
        return creat_odr;
    }

    @ElVoField(physicalName = "creat_odr")
    public void setCreat_odr(String creat_odr){
        this.creat_odr = creat_odr;
    }

    @ElVoField(physicalName = "is_evid")
    public boolean isIs_evid(){
        return is_evid;
    }

    @ElVoField(physicalName = "is_evid")
    public void setIs_evid(boolean is_evid){
        this.is_evid = is_evid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GenerationVo [");
        sb.append("sys_clsf").append("=").append(sys_clsf).append(",");
        sb.append("slip_typ_cd").append("=").append(slip_typ_cd).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("docu_clsf").append("=").append(docu_clsf).append(",");
        sb.append("yr").append("=").append(yr).append(",");
        sb.append("month").append("=").append(month).append(",");
        sb.append("genrt_no").append("=").append(genrt_no).append(",");
        sb.append("etc").append("=").append(etc).append(",");
        sb.append("cd_clsf").append("=").append(cd_clsf).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("gen_no_seq").append("=").append(gen_no_seq).append(",");
        sb.append("no_clsf").append("=").append(no_clsf).append(",");
        sb.append("creat_no").append("=").append(creat_no).append(",");
        sb.append("creat_ymd").append("=").append(creat_ymd).append(",");
        sb.append("creat_odr").append("=").append(creat_odr).append(",");
        sb.append("is_evid").append("=").append(is_evid);
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
