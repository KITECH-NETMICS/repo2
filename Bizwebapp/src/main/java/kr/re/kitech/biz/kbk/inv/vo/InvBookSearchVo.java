package kr.re.kitech.biz.kbk.inv.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "단행본 관리 검색 Vo")
public class InvBookSearchVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public InvBookSearchVo(){
    }

    @ElDtoField(logicalName = "등록번호", physicalName = "regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_no;

    @ElDtoField(logicalName = "분류기호", physicalName = "clsfsgn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String clsfsgn;

    @ElDtoField(logicalName = "센터구분", physicalName = "centr_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String centr_cd;

    @ElDtoField(logicalName = "저자명", physicalName = "auth_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String auth_nm;

    @ElDtoField(logicalName = "키워드", physicalName = "kwd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String kwd;

    @ElDtoField(logicalName = "출판사", physicalName = "publ_vend", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String publ_vend;

    @ElDtoField(logicalName = "도서명", physicalName = "book_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String book_nm;

    @ElDtoField(logicalName = "엑셀Provider다운로드여부", physicalName = "isExcel", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private boolean isExcel;

    @ElDtoField(logicalName = "시작일자", physicalName = "from_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String from_ymd;

    @ElDtoField(logicalName = "종료일자", physicalName = "to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String to_ymd;

    @ElVoField(physicalName = "regst_no")
    public String getRegst_no(){
        return regst_no;
    }

    @ElVoField(physicalName = "regst_no")
    public void setRegst_no(String regst_no){
        this.regst_no = regst_no;
    }

    @ElVoField(physicalName = "clsfsgn")
    public String getClsfsgn(){
        return clsfsgn;
    }

    @ElVoField(physicalName = "clsfsgn")
    public void setClsfsgn(String clsfsgn){
        this.clsfsgn = clsfsgn;
    }

    @ElVoField(physicalName = "centr_cd")
    public String getCentr_cd(){
        return centr_cd;
    }

    @ElVoField(physicalName = "centr_cd")
    public void setCentr_cd(String centr_cd){
        this.centr_cd = centr_cd;
    }

    @ElVoField(physicalName = "auth_nm")
    public String getAuth_nm(){
        return auth_nm;
    }

    @ElVoField(physicalName = "auth_nm")
    public void setAuth_nm(String auth_nm){
        this.auth_nm = auth_nm;
    }

    @ElVoField(physicalName = "kwd")
    public String getKwd(){
        return kwd;
    }

    @ElVoField(physicalName = "kwd")
    public void setKwd(String kwd){
        this.kwd = kwd;
    }

    @ElVoField(physicalName = "publ_vend")
    public String getPubl_vend(){
        return publ_vend;
    }

    @ElVoField(physicalName = "publ_vend")
    public void setPubl_vend(String publ_vend){
        this.publ_vend = publ_vend;
    }

    @ElVoField(physicalName = "book_nm")
    public String getBook_nm(){
        return book_nm;
    }

    @ElVoField(physicalName = "book_nm")
    public void setBook_nm(String book_nm){
        this.book_nm = book_nm;
    }

    @ElVoField(physicalName = "isExcel")
    public boolean isIsExcel(){
        return isExcel;
    }

    @ElVoField(physicalName = "isExcel")
    public void setIsExcel(boolean isExcel){
        this.isExcel = isExcel;
    }

    @ElVoField(physicalName = "from_ymd")
    public String getFrom_ymd(){
        return from_ymd;
    }

    @ElVoField(physicalName = "from_ymd")
    public void setFrom_ymd(String from_ymd){
        this.from_ymd = from_ymd;
    }

    @ElVoField(physicalName = "to_ymd")
    public String getTo_ymd(){
        return to_ymd;
    }

    @ElVoField(physicalName = "to_ymd")
    public void setTo_ymd(String to_ymd){
        this.to_ymd = to_ymd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvBookSearchVo [");
        sb.append("regst_no").append("=").append(regst_no).append(",");
        sb.append("clsfsgn").append("=").append(clsfsgn).append(",");
        sb.append("centr_cd").append("=").append(centr_cd).append(",");
        sb.append("auth_nm").append("=").append(auth_nm).append(",");
        sb.append("kwd").append("=").append(kwd).append(",");
        sb.append("publ_vend").append("=").append(publ_vend).append(",");
        sb.append("book_nm").append("=").append(book_nm).append(",");
        sb.append("isExcel").append("=").append(isExcel).append(",");
        sb.append("from_ymd").append("=").append(from_ymd).append(",");
        sb.append("to_ymd").append("=").append(to_ymd);
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
