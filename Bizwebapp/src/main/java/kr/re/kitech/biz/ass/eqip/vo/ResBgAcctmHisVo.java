package kr.re.kitech.biz.ass.eqip.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "통합계정변경이력 Vo")
public class ResBgAcctmHisVo extends kr.re.kitech.biz.fin.std.vo.ResBgAcctMVo {
    private static final long serialVersionUID = 1L;

    public ResBgAcctmHisVo(){
    }

    @ElDtoField(logicalName = "변경순번", physicalName = "seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int seq;

    @ElDtoField(logicalName = "통합관리단위", physicalName = "intgr_mngmt_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intgr_mngmt_unit;

    @ElDtoField(logicalName = "관리번호", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;

    @ElDtoField(logicalName = "예실 계정책임자개인번호", physicalName = "relat_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat_no;

    @ElDtoField(logicalName = "관리부서", physicalName = "mngmt_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_dept;

    @ElDtoField(logicalName = "한도금액", physicalName = "accm_lmt_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accm_lmt_amt;

    @ElDtoField(logicalName = "등록일자", physicalName = "regst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_ymd;

    @ElDtoField(logicalName = "변경일자", physicalName = "chng_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chng_ymd;

    @ElDtoField(logicalName = "변경자", physicalName = "chng_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chng_psn;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "계정구분", physicalName = "accnt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_clsf;

    @ElVoField(physicalName = "seq")
    public int getSeq(){
        return seq;
    }

    @ElVoField(physicalName = "seq")
    public void setSeq(int seq){
        this.seq = seq;
    }

    @ElVoField(physicalName = "intgr_mngmt_unit")
    public String getIntgr_mngmt_unit(){
        return intgr_mngmt_unit;
    }

    @ElVoField(physicalName = "intgr_mngmt_unit")
    public void setIntgr_mngmt_unit(String intgr_mngmt_unit){
        this.intgr_mngmt_unit = intgr_mngmt_unit;
    }

    @ElVoField(physicalName = "mngmt_no")
    public String getMngmt_no(){
        return mngmt_no;
    }

    @ElVoField(physicalName = "mngmt_no")
    public void setMngmt_no(String mngmt_no){
        this.mngmt_no = mngmt_no;
    }

    @ElVoField(physicalName = "relat_no")
    public String getRelat_no(){
        return relat_no;
    }

    @ElVoField(physicalName = "relat_no")
    public void setRelat_no(String relat_no){
        this.relat_no = relat_no;
    }

    @ElVoField(physicalName = "mngmt_dept")
    public String getMngmt_dept(){
        return mngmt_dept;
    }

    @ElVoField(physicalName = "mngmt_dept")
    public void setMngmt_dept(String mngmt_dept){
        this.mngmt_dept = mngmt_dept;
    }

    @ElVoField(physicalName = "accm_lmt_amt")
    public String getAccm_lmt_amt(){
        return accm_lmt_amt;
    }

    @ElVoField(physicalName = "accm_lmt_amt")
    public void setAccm_lmt_amt(String accm_lmt_amt){
        this.accm_lmt_amt = accm_lmt_amt;
    }

    @ElVoField(physicalName = "regst_ymd")
    public String getRegst_ymd(){
        return regst_ymd;
    }

    @ElVoField(physicalName = "regst_ymd")
    public void setRegst_ymd(String regst_ymd){
        this.regst_ymd = regst_ymd;
    }

    @ElVoField(physicalName = "chng_ymd")
    public String getChng_ymd(){
        return chng_ymd;
    }

    @ElVoField(physicalName = "chng_ymd")
    public void setChng_ymd(String chng_ymd){
        this.chng_ymd = chng_ymd;
    }

    @ElVoField(physicalName = "chng_psn")
    public String getChng_psn(){
        return chng_psn;
    }

    @ElVoField(physicalName = "chng_psn")
    public void setChng_psn(String chng_psn){
        this.chng_psn = chng_psn;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "accnt_clsf")
    public String getAccnt_clsf(){
        return accnt_clsf;
    }

    @ElVoField(physicalName = "accnt_clsf")
    public void setAccnt_clsf(String accnt_clsf){
        this.accnt_clsf = accnt_clsf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResBgAcctmHisVo [");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("intgr_mngmt_unit").append("=").append(intgr_mngmt_unit).append(",");
        sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
        sb.append("relat_no").append("=").append(relat_no).append(",");
        sb.append("mngmt_dept").append("=").append(mngmt_dept).append(",");
        sb.append("accm_lmt_amt").append("=").append(accm_lmt_amt).append(",");
        sb.append("regst_ymd").append("=").append(regst_ymd).append(",");
        sb.append("chng_ymd").append("=").append(chng_ymd).append(",");
        sb.append("chng_psn").append("=").append(chng_psn).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("accnt_clsf").append("=").append(accnt_clsf);
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
