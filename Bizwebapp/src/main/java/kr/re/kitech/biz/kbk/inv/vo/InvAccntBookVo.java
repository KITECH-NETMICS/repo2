package kr.re.kitech.biz.kbk.inv.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "계정별 도서구입현황 Vo")
public class InvAccntBookVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public InvAccntBookVo(){
    }

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "등록번호", physicalName = "regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_no;

    @ElDtoField(logicalName = "등록일자", physicalName = "regst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_ymd;

    @ElDtoField(logicalName = "도서명", physicalName = "book_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String book_nm;

    @ElDtoField(logicalName = "저자명", physicalName = "auth_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String auth_nm;

    @ElDtoField(logicalName = "구입금액", physicalName = "pur_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_amt;

    @ElDtoField(logicalName = "구입방법", physicalName = "pur_way_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_way_cd;

    @ElDtoField(logicalName = "검색 시작일자", physicalName = "regst_fr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_fr_ymd;

    @ElDtoField(logicalName = "검색 종료일자", physicalName = "regst_to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_to_ymd;

    @ElDtoField(logicalName = "권수", physicalName = "no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String no;

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "regst_no")
    public String getRegst_no(){
        return regst_no;
    }

    @ElVoField(physicalName = "regst_no")
    public void setRegst_no(String regst_no){
        this.regst_no = regst_no;
    }

    @ElVoField(physicalName = "regst_ymd")
    public String getRegst_ymd(){
        return regst_ymd;
    }

    @ElVoField(physicalName = "regst_ymd")
    public void setRegst_ymd(String regst_ymd){
        this.regst_ymd = regst_ymd;
    }

    @ElVoField(physicalName = "book_nm")
    public String getBook_nm(){
        return book_nm;
    }

    @ElVoField(physicalName = "book_nm")
    public void setBook_nm(String book_nm){
        this.book_nm = book_nm;
    }

    @ElVoField(physicalName = "auth_nm")
    public String getAuth_nm(){
        return auth_nm;
    }

    @ElVoField(physicalName = "auth_nm")
    public void setAuth_nm(String auth_nm){
        this.auth_nm = auth_nm;
    }

    @ElVoField(physicalName = "pur_amt")
    public String getPur_amt(){
        return pur_amt;
    }

    @ElVoField(physicalName = "pur_amt")
    public void setPur_amt(String pur_amt){
        this.pur_amt = pur_amt;
    }

    @ElVoField(physicalName = "pur_way_cd")
    public String getPur_way_cd(){
        return pur_way_cd;
    }

    @ElVoField(physicalName = "pur_way_cd")
    public void setPur_way_cd(String pur_way_cd){
        this.pur_way_cd = pur_way_cd;
    }

    @ElVoField(physicalName = "regst_fr_ymd")
    public String getRegst_fr_ymd(){
        return regst_fr_ymd;
    }

    @ElVoField(physicalName = "regst_fr_ymd")
    public void setRegst_fr_ymd(String regst_fr_ymd){
        this.regst_fr_ymd = regst_fr_ymd;
    }

    @ElVoField(physicalName = "regst_to_ymd")
    public String getRegst_to_ymd(){
        return regst_to_ymd;
    }

    @ElVoField(physicalName = "regst_to_ymd")
    public void setRegst_to_ymd(String regst_to_ymd){
        this.regst_to_ymd = regst_to_ymd;
    }

    @ElVoField(physicalName = "no")
    public String getNo(){
        return no;
    }

    @ElVoField(physicalName = "no")
    public void setNo(String no){
        this.no = no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvAccntBookVo [");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("regst_no").append("=").append(regst_no).append(",");
        sb.append("regst_ymd").append("=").append(regst_ymd).append(",");
        sb.append("book_nm").append("=").append(book_nm).append(",");
        sb.append("auth_nm").append("=").append(auth_nm).append(",");
        sb.append("pur_amt").append("=").append(pur_amt).append(",");
        sb.append("pur_way_cd").append("=").append(pur_way_cd).append(",");
        sb.append("regst_fr_ymd").append("=").append(regst_fr_ymd).append(",");
        sb.append("regst_to_ymd").append("=").append(regst_to_ymd).append(",");
        sb.append("no").append("=").append(no);
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
