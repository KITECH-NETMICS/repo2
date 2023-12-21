package kr.re.kitech.biz.fin.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "예산체크 Vo")
public class BugtChkVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public BugtChkVo(){
    }

    @ElDtoField(logicalName = "결과코드", physicalName = "res_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_code;

    @ElDtoField(logicalName = "예산년도", physicalName = "bugt_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_yr;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "회계코드", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;

    @ElDtoField(logicalName = "개인번호", physicalName = "relat_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat_no;

    @ElDtoField(logicalName = "예산금액", physicalName = "bugt_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long bugt_amt;

    @ElDtoField(logicalName = "종료년도", physicalName = "close_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String close_yr;

    @ElDtoField(logicalName = "계정집행내역카운트", physicalName = "bugt_cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int bugt_cnt;

    @ElDtoField(logicalName = "계정년마감체크", physicalName = "yr_cls_cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int yr_cls_cnt;

    @ElVoField(physicalName = "res_code")
    public String getRes_code(){
        return res_code;
    }

    @ElVoField(physicalName = "res_code")
    public void setRes_code(String res_code){
        this.res_code = res_code;
    }

    @ElVoField(physicalName = "bugt_yr")
    public String getBugt_yr(){
        return bugt_yr;
    }

    @ElVoField(physicalName = "bugt_yr")
    public void setBugt_yr(String bugt_yr){
        this.bugt_yr = bugt_yr;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "accnt_cd")
    public String getAccnt_cd(){
        return accnt_cd;
    }

    @ElVoField(physicalName = "accnt_cd")
    public void setAccnt_cd(String accnt_cd){
        this.accnt_cd = accnt_cd;
    }

    @ElVoField(physicalName = "relat_no")
    public String getRelat_no(){
        return relat_no;
    }

    @ElVoField(physicalName = "relat_no")
    public void setRelat_no(String relat_no){
        this.relat_no = relat_no;
    }

    @ElVoField(physicalName = "bugt_amt")
    public long getBugt_amt(){
        return bugt_amt;
    }

    @ElVoField(physicalName = "bugt_amt")
    public void setBugt_amt(long bugt_amt){
        this.bugt_amt = bugt_amt;
    }

    @ElVoField(physicalName = "close_yr")
    public String getClose_yr(){
        return close_yr;
    }

    @ElVoField(physicalName = "close_yr")
    public void setClose_yr(String close_yr){
        this.close_yr = close_yr;
    }

    @ElVoField(physicalName = "bugt_cnt")
    public int getBugt_cnt(){
        return bugt_cnt;
    }

    @ElVoField(physicalName = "bugt_cnt")
    public void setBugt_cnt(int bugt_cnt){
        this.bugt_cnt = bugt_cnt;
    }

    @ElVoField(physicalName = "yr_cls_cnt")
    public int getYr_cls_cnt(){
        return yr_cls_cnt;
    }

    @ElVoField(physicalName = "yr_cls_cnt")
    public void setYr_cls_cnt(int yr_cls_cnt){
        this.yr_cls_cnt = yr_cls_cnt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BugtChkVo [");
        sb.append("res_code").append("=").append(res_code).append(",");
        sb.append("bugt_yr").append("=").append(bugt_yr).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
        sb.append("relat_no").append("=").append(relat_no).append(",");
        sb.append("bugt_amt").append("=").append(bugt_amt).append(",");
        sb.append("close_yr").append("=").append(close_yr).append(",");
        sb.append("bugt_cnt").append("=").append(bugt_cnt).append(",");
        sb.append("yr_cls_cnt").append("=").append(yr_cls_cnt);
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
