package kr.re.kitech.biz.fin.std.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "거래처정보 Vo")
public class XodfVendVo extends kr.re.kitech.biz.fin.std.vo.XodfVendComVo {
    private static final long serialVersionUID = 1L;

    public XodfVendVo(){
    }

    @ElDtoField(logicalName = "시스템구분", physicalName = "sys_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sys_clsf;

    @ElDtoField(logicalName = "거래처구분", physicalName = "vend_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_clsf;

    @ElDtoField(logicalName = "법인주민번호", physicalName = "corp_resid_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String corp_resid_no;

    @ElDtoField(logicalName = "거래처전명", physicalName = "vend_fulnm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_fulnm;

    @ElDtoField(logicalName = "영세율적용여부", physicalName = "zero_taxrts_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String zero_taxrts_yn;

    @ElDtoField(logicalName = "우편번호", physicalName = "postmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String postmt_no;

    @ElDtoField(logicalName = "상세주소", physicalName = "detls_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String detls_addr;

    @ElDtoField(logicalName = "전호번호", physicalName = "tel_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tel_no;

    @ElDtoField(logicalName = "팩스번호", physicalName = "fax", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fax;

    @ElDtoField(logicalName = "국가코드", physicalName = "natn_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String natn_cd;

    @ElDtoField(logicalName = "국내외구분", physicalName = "dom_excpt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dom_excpt_clsf;

    @ElDtoField(logicalName = "구매사용여부", physicalName = "pur_use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_use_yn;

    @ElDtoField(logicalName = "연구사용여부", physicalName = "resch_use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_use_yn;

    @ElDtoField(logicalName = "기술지원사용여부", physicalName = "techsup_use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String techsup_use_yn;

    @ElDtoField(logicalName = "기업유형", physicalName = "cmpy_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_typ;

    @ElDtoField(logicalName = "사용여부", physicalName = "use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_yn;

    @ElDtoField(logicalName = "거래중지일자", physicalName = "tran_stop_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tran_stop_ymd;

    @ElDtoField(logicalName = "거래중지사유", physicalName = "tran_stop_cause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tran_stop_cause;

    @ElVoField(physicalName = "sys_clsf")
    public String getSys_clsf(){
        return sys_clsf;
    }

    @ElVoField(physicalName = "sys_clsf")
    public void setSys_clsf(String sys_clsf){
        this.sys_clsf = sys_clsf;
    }

    @ElVoField(physicalName = "vend_clsf")
    public String getVend_clsf(){
        return vend_clsf;
    }

    @ElVoField(physicalName = "vend_clsf")
    public void setVend_clsf(String vend_clsf){
        this.vend_clsf = vend_clsf;
    }

    @ElVoField(physicalName = "corp_resid_no")
    public String getCorp_resid_no(){
        return corp_resid_no;
    }

    @ElVoField(physicalName = "corp_resid_no")
    public void setCorp_resid_no(String corp_resid_no){
        this.corp_resid_no = corp_resid_no;
    }

    @ElVoField(physicalName = "vend_fulnm")
    public String getVend_fulnm(){
        return vend_fulnm;
    }

    @ElVoField(physicalName = "vend_fulnm")
    public void setVend_fulnm(String vend_fulnm){
        this.vend_fulnm = vend_fulnm;
    }

    @ElVoField(physicalName = "zero_taxrts_yn")
    public String getZero_taxrts_yn(){
        return zero_taxrts_yn;
    }

    @ElVoField(physicalName = "zero_taxrts_yn")
    public void setZero_taxrts_yn(String zero_taxrts_yn){
        this.zero_taxrts_yn = zero_taxrts_yn;
    }

    @ElVoField(physicalName = "postmt_no")
    public String getPostmt_no(){
        return postmt_no;
    }

    @ElVoField(physicalName = "postmt_no")
    public void setPostmt_no(String postmt_no){
        this.postmt_no = postmt_no;
    }

    @ElVoField(physicalName = "detls_addr")
    public String getDetls_addr(){
        return detls_addr;
    }

    @ElVoField(physicalName = "detls_addr")
    public void setDetls_addr(String detls_addr){
        this.detls_addr = detls_addr;
    }

    @ElVoField(physicalName = "tel_no")
    public String getTel_no(){
        return tel_no;
    }

    @ElVoField(physicalName = "tel_no")
    public void setTel_no(String tel_no){
        this.tel_no = tel_no;
    }

    @ElVoField(physicalName = "fax")
    public String getFax(){
        return fax;
    }

    @ElVoField(physicalName = "fax")
    public void setFax(String fax){
        this.fax = fax;
    }

    @ElVoField(physicalName = "natn_cd")
    public String getNatn_cd(){
        return natn_cd;
    }

    @ElVoField(physicalName = "natn_cd")
    public void setNatn_cd(String natn_cd){
        this.natn_cd = natn_cd;
    }

    @ElVoField(physicalName = "dom_excpt_clsf")
    public String getDom_excpt_clsf(){
        return dom_excpt_clsf;
    }

    @ElVoField(physicalName = "dom_excpt_clsf")
    public void setDom_excpt_clsf(String dom_excpt_clsf){
        this.dom_excpt_clsf = dom_excpt_clsf;
    }

    @ElVoField(physicalName = "pur_use_yn")
    public String getPur_use_yn(){
        return pur_use_yn;
    }

    @ElVoField(physicalName = "pur_use_yn")
    public void setPur_use_yn(String pur_use_yn){
        this.pur_use_yn = pur_use_yn;
    }

    @ElVoField(physicalName = "resch_use_yn")
    public String getResch_use_yn(){
        return resch_use_yn;
    }

    @ElVoField(physicalName = "resch_use_yn")
    public void setResch_use_yn(String resch_use_yn){
        this.resch_use_yn = resch_use_yn;
    }

    @ElVoField(physicalName = "techsup_use_yn")
    public String getTechsup_use_yn(){
        return techsup_use_yn;
    }

    @ElVoField(physicalName = "techsup_use_yn")
    public void setTechsup_use_yn(String techsup_use_yn){
        this.techsup_use_yn = techsup_use_yn;
    }

    @ElVoField(physicalName = "cmpy_typ")
    public String getCmpy_typ(){
        return cmpy_typ;
    }

    @ElVoField(physicalName = "cmpy_typ")
    public void setCmpy_typ(String cmpy_typ){
        this.cmpy_typ = cmpy_typ;
    }

    @ElVoField(physicalName = "use_yn")
    public String getUse_yn(){
        return use_yn;
    }

    @ElVoField(physicalName = "use_yn")
    public void setUse_yn(String use_yn){
        this.use_yn = use_yn;
    }

    @ElVoField(physicalName = "tran_stop_ymd")
    public String getTran_stop_ymd(){
        return tran_stop_ymd;
    }

    @ElVoField(physicalName = "tran_stop_ymd")
    public void setTran_stop_ymd(String tran_stop_ymd){
        this.tran_stop_ymd = tran_stop_ymd;
    }

    @ElVoField(physicalName = "tran_stop_cause")
    public String getTran_stop_cause(){
        return tran_stop_cause;
    }

    @ElVoField(physicalName = "tran_stop_cause")
    public void setTran_stop_cause(String tran_stop_cause){
        this.tran_stop_cause = tran_stop_cause;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("XodfVendVo [");
        sb.append("sys_clsf").append("=").append(sys_clsf).append(",");
        sb.append("vend_clsf").append("=").append(vend_clsf).append(",");
        sb.append("corp_resid_no").append("=").append(corp_resid_no).append(",");
        sb.append("vend_fulnm").append("=").append(vend_fulnm).append(",");
        sb.append("zero_taxrts_yn").append("=").append(zero_taxrts_yn).append(",");
        sb.append("postmt_no").append("=").append(postmt_no).append(",");
        sb.append("detls_addr").append("=").append(detls_addr).append(",");
        sb.append("tel_no").append("=").append(tel_no).append(",");
        sb.append("fax").append("=").append(fax).append(",");
        sb.append("natn_cd").append("=").append(natn_cd).append(",");
        sb.append("dom_excpt_clsf").append("=").append(dom_excpt_clsf).append(",");
        sb.append("pur_use_yn").append("=").append(pur_use_yn).append(",");
        sb.append("resch_use_yn").append("=").append(resch_use_yn).append(",");
        sb.append("techsup_use_yn").append("=").append(techsup_use_yn).append(",");
        sb.append("cmpy_typ").append("=").append(cmpy_typ).append(",");
        sb.append("use_yn").append("=").append(use_yn).append(",");
        sb.append("tran_stop_ymd").append("=").append(tran_stop_ymd).append(",");
        sb.append("tran_stop_cause").append("=").append(tran_stop_cause);
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
