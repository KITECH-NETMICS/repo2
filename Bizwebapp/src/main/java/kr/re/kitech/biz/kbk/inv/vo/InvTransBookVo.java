package kr.re.kitech.biz.kbk.inv.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "단행본폐기이관현황 상세 Vo")
public class InvTransBookVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public InvTransBookVo(){
    }

    @ElDtoField(logicalName = "등록번호", physicalName = "regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_no;

    @ElDtoField(logicalName = "등록일자", physicalName = "regst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_ymd;

    @ElDtoField(logicalName = "센터구분", physicalName = "centr_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String centr_cd;

    @ElDtoField(logicalName = "구입방법", physicalName = "pur_way_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_way_cd;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "비용코드", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd;

    @ElDtoField(logicalName = "화폐단위", physicalName = "curncy_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curncy_unit;

    @ElDtoField(logicalName = "구입금액", physicalName = "pur_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_amt;

    @ElDtoField(logicalName = "ISBN", physicalName = "isbn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String isbn;

    @ElDtoField(logicalName = "서명", physicalName = "book_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String book_nm;

    @ElDtoField(logicalName = "사료유형", physicalName = "data_typ_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String data_typ_cd;

    @ElDtoField(logicalName = "국가구분", physicalName = "natn_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String natn_cd;

    @ElDtoField(logicalName = "출판지", physicalName = "publ_form", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String publ_form;

    @ElDtoField(logicalName = "저자", physicalName = "auth_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String auth_nm;

    @ElDtoField(logicalName = "출판년도", physicalName = "publ_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String publ_yr;

    @ElDtoField(logicalName = "출판사", physicalName = "publ_vend", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String publ_vend;

    @ElDtoField(logicalName = "분류기호", physicalName = "clsfsgn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String clsfsgn;

    @ElDtoField(logicalName = "저자기호", physicalName = "authcd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String authcd;

    @ElDtoField(logicalName = "복본", physicalName = "copy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String copy;

    @ElDtoField(logicalName = "페이지", physicalName = "page", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String page;

    @ElDtoField(logicalName = "일러", physicalName = "ill", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ill;

    @ElDtoField(logicalName = "사진", physicalName = "photo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String photo;

    @ElDtoField(logicalName = "테이블", physicalName = "tbl", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tbl;

    @ElDtoField(logicalName = "크기", physicalName = "size", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String size;

    @ElDtoField(logicalName = "키워드", physicalName = "kwd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String kwd;

    @ElDtoField(logicalName = "목차", physicalName = "contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contnt;

    @ElDtoField(logicalName = "부록_CD", physicalName = "apdix_cdrom", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apdix_cdrom;

    @ElDtoField(logicalName = "부록_책자", physicalName = "apdix_book", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apdix_book;

    @ElDtoField(logicalName = "계정명", physicalName = "accnt_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_nm;

    @ElDtoField(logicalName = "폐기/이관 구분", physicalName = "abol_trans_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String abol_trans_clsf;

    @ElDtoField(logicalName = "폐기/이관 일자", physicalName = "abol_trans_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String abol_trans_ymd;

    @ElDtoField(logicalName = "검색 폐기/이관 시작 일자", physicalName = "abol_trans_fr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String abol_trans_fr_ymd;

    @ElDtoField(logicalName = "검색 폐기/이관 종료 일자", physicalName = "abol_trans_to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String abol_trans_to_ymd;

    @ElDtoField(logicalName = "폐기/이관 이유", physicalName = "abol_trans_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String abol_trans_resn;

    @ElDtoField(logicalName = "이관처", physicalName = "trans", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans;

    @ElDtoField(logicalName = "vol", physicalName = "vol", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vol;

    @ElDtoField(logicalName = "상태", physicalName = "rowStatus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rowStatus;

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

    @ElVoField(physicalName = "centr_cd")
    public String getCentr_cd(){
        return centr_cd;
    }

    @ElVoField(physicalName = "centr_cd")
    public void setCentr_cd(String centr_cd){
        this.centr_cd = centr_cd;
    }

    @ElVoField(physicalName = "pur_way_cd")
    public String getPur_way_cd(){
        return pur_way_cd;
    }

    @ElVoField(physicalName = "pur_way_cd")
    public void setPur_way_cd(String pur_way_cd){
        this.pur_way_cd = pur_way_cd;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "expns_cd")
    public String getExpns_cd(){
        return expns_cd;
    }

    @ElVoField(physicalName = "expns_cd")
    public void setExpns_cd(String expns_cd){
        this.expns_cd = expns_cd;
    }

    @ElVoField(physicalName = "curncy_unit")
    public String getCurncy_unit(){
        return curncy_unit;
    }

    @ElVoField(physicalName = "curncy_unit")
    public void setCurncy_unit(String curncy_unit){
        this.curncy_unit = curncy_unit;
    }

    @ElVoField(physicalName = "pur_amt")
    public String getPur_amt(){
        return pur_amt;
    }

    @ElVoField(physicalName = "pur_amt")
    public void setPur_amt(String pur_amt){
        this.pur_amt = pur_amt;
    }

    @ElVoField(physicalName = "isbn")
    public String getIsbn(){
        return isbn;
    }

    @ElVoField(physicalName = "isbn")
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    @ElVoField(physicalName = "book_nm")
    public String getBook_nm(){
        return book_nm;
    }

    @ElVoField(physicalName = "book_nm")
    public void setBook_nm(String book_nm){
        this.book_nm = book_nm;
    }

    @ElVoField(physicalName = "data_typ_cd")
    public String getData_typ_cd(){
        return data_typ_cd;
    }

    @ElVoField(physicalName = "data_typ_cd")
    public void setData_typ_cd(String data_typ_cd){
        this.data_typ_cd = data_typ_cd;
    }

    @ElVoField(physicalName = "natn_cd")
    public String getNatn_cd(){
        return natn_cd;
    }

    @ElVoField(physicalName = "natn_cd")
    public void setNatn_cd(String natn_cd){
        this.natn_cd = natn_cd;
    }

    @ElVoField(physicalName = "publ_form")
    public String getPubl_form(){
        return publ_form;
    }

    @ElVoField(physicalName = "publ_form")
    public void setPubl_form(String publ_form){
        this.publ_form = publ_form;
    }

    @ElVoField(physicalName = "auth_nm")
    public String getAuth_nm(){
        return auth_nm;
    }

    @ElVoField(physicalName = "auth_nm")
    public void setAuth_nm(String auth_nm){
        this.auth_nm = auth_nm;
    }

    @ElVoField(physicalName = "publ_yr")
    public String getPubl_yr(){
        return publ_yr;
    }

    @ElVoField(physicalName = "publ_yr")
    public void setPubl_yr(String publ_yr){
        this.publ_yr = publ_yr;
    }

    @ElVoField(physicalName = "publ_vend")
    public String getPubl_vend(){
        return publ_vend;
    }

    @ElVoField(physicalName = "publ_vend")
    public void setPubl_vend(String publ_vend){
        this.publ_vend = publ_vend;
    }

    @ElVoField(physicalName = "clsfsgn")
    public String getClsfsgn(){
        return clsfsgn;
    }

    @ElVoField(physicalName = "clsfsgn")
    public void setClsfsgn(String clsfsgn){
        this.clsfsgn = clsfsgn;
    }

    @ElVoField(physicalName = "authcd")
    public String getAuthcd(){
        return authcd;
    }

    @ElVoField(physicalName = "authcd")
    public void setAuthcd(String authcd){
        this.authcd = authcd;
    }

    @ElVoField(physicalName = "copy")
    public String getCopy(){
        return copy;
    }

    @ElVoField(physicalName = "copy")
    public void setCopy(String copy){
        this.copy = copy;
    }

    @ElVoField(physicalName = "page")
    public String getPage(){
        return page;
    }

    @ElVoField(physicalName = "page")
    public void setPage(String page){
        this.page = page;
    }

    @ElVoField(physicalName = "ill")
    public String getIll(){
        return ill;
    }

    @ElVoField(physicalName = "ill")
    public void setIll(String ill){
        this.ill = ill;
    }

    @ElVoField(physicalName = "photo")
    public String getPhoto(){
        return photo;
    }

    @ElVoField(physicalName = "photo")
    public void setPhoto(String photo){
        this.photo = photo;
    }

    @ElVoField(physicalName = "tbl")
    public String getTbl(){
        return tbl;
    }

    @ElVoField(physicalName = "tbl")
    public void setTbl(String tbl){
        this.tbl = tbl;
    }

    @ElVoField(physicalName = "size")
    public String getSize(){
        return size;
    }

    @ElVoField(physicalName = "size")
    public void setSize(String size){
        this.size = size;
    }

    @ElVoField(physicalName = "kwd")
    public String getKwd(){
        return kwd;
    }

    @ElVoField(physicalName = "kwd")
    public void setKwd(String kwd){
        this.kwd = kwd;
    }

    @ElVoField(physicalName = "contnt")
    public String getContnt(){
        return contnt;
    }

    @ElVoField(physicalName = "contnt")
    public void setContnt(String contnt){
        this.contnt = contnt;
    }

    @ElVoField(physicalName = "apdix_cdrom")
    public String getApdix_cdrom(){
        return apdix_cdrom;
    }

    @ElVoField(physicalName = "apdix_cdrom")
    public void setApdix_cdrom(String apdix_cdrom){
        this.apdix_cdrom = apdix_cdrom;
    }

    @ElVoField(physicalName = "apdix_book")
    public String getApdix_book(){
        return apdix_book;
    }

    @ElVoField(physicalName = "apdix_book")
    public void setApdix_book(String apdix_book){
        this.apdix_book = apdix_book;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public String getAccnt_no_nm(){
        return accnt_no_nm;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public void setAccnt_no_nm(String accnt_no_nm){
        this.accnt_no_nm = accnt_no_nm;
    }

    @ElVoField(physicalName = "abol_trans_clsf")
    public String getAbol_trans_clsf(){
        return abol_trans_clsf;
    }

    @ElVoField(physicalName = "abol_trans_clsf")
    public void setAbol_trans_clsf(String abol_trans_clsf){
        this.abol_trans_clsf = abol_trans_clsf;
    }

    @ElVoField(physicalName = "abol_trans_ymd")
    public String getAbol_trans_ymd(){
        return abol_trans_ymd;
    }

    @ElVoField(physicalName = "abol_trans_ymd")
    public void setAbol_trans_ymd(String abol_trans_ymd){
        this.abol_trans_ymd = abol_trans_ymd;
    }

    @ElVoField(physicalName = "abol_trans_fr_ymd")
    public String getAbol_trans_fr_ymd(){
        return abol_trans_fr_ymd;
    }

    @ElVoField(physicalName = "abol_trans_fr_ymd")
    public void setAbol_trans_fr_ymd(String abol_trans_fr_ymd){
        this.abol_trans_fr_ymd = abol_trans_fr_ymd;
    }

    @ElVoField(physicalName = "abol_trans_to_ymd")
    public String getAbol_trans_to_ymd(){
        return abol_trans_to_ymd;
    }

    @ElVoField(physicalName = "abol_trans_to_ymd")
    public void setAbol_trans_to_ymd(String abol_trans_to_ymd){
        this.abol_trans_to_ymd = abol_trans_to_ymd;
    }

    @ElVoField(physicalName = "abol_trans_resn")
    public String getAbol_trans_resn(){
        return abol_trans_resn;
    }

    @ElVoField(physicalName = "abol_trans_resn")
    public void setAbol_trans_resn(String abol_trans_resn){
        this.abol_trans_resn = abol_trans_resn;
    }

    @ElVoField(physicalName = "trans")
    public String getTrans(){
        return trans;
    }

    @ElVoField(physicalName = "trans")
    public void setTrans(String trans){
        this.trans = trans;
    }

    @ElVoField(physicalName = "vol")
    public String getVol(){
        return vol;
    }

    @ElVoField(physicalName = "vol")
    public void setVol(String vol){
        this.vol = vol;
    }

    @ElVoField(physicalName = "rowStatus")
    public String getRowStatus(){
        return rowStatus;
    }

    @ElVoField(physicalName = "rowStatus")
    public void setRowStatus(String rowStatus){
        this.rowStatus = rowStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvTransBookVo [");
        sb.append("regst_no").append("=").append(regst_no).append(",");
        sb.append("regst_ymd").append("=").append(regst_ymd).append(",");
        sb.append("centr_cd").append("=").append(centr_cd).append(",");
        sb.append("pur_way_cd").append("=").append(pur_way_cd).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("expns_cd").append("=").append(expns_cd).append(",");
        sb.append("curncy_unit").append("=").append(curncy_unit).append(",");
        sb.append("pur_amt").append("=").append(pur_amt).append(",");
        sb.append("isbn").append("=").append(isbn).append(",");
        sb.append("book_nm").append("=").append(book_nm).append(",");
        sb.append("data_typ_cd").append("=").append(data_typ_cd).append(",");
        sb.append("natn_cd").append("=").append(natn_cd).append(",");
        sb.append("publ_form").append("=").append(publ_form).append(",");
        sb.append("auth_nm").append("=").append(auth_nm).append(",");
        sb.append("publ_yr").append("=").append(publ_yr).append(",");
        sb.append("publ_vend").append("=").append(publ_vend).append(",");
        sb.append("clsfsgn").append("=").append(clsfsgn).append(",");
        sb.append("authcd").append("=").append(authcd).append(",");
        sb.append("copy").append("=").append(copy).append(",");
        sb.append("page").append("=").append(page).append(",");
        sb.append("ill").append("=").append(ill).append(",");
        sb.append("photo").append("=").append(photo).append(",");
        sb.append("tbl").append("=").append(tbl).append(",");
        sb.append("size").append("=").append(size).append(",");
        sb.append("kwd").append("=").append(kwd).append(",");
        sb.append("contnt").append("=").append(contnt).append(",");
        sb.append("apdix_cdrom").append("=").append(apdix_cdrom).append(",");
        sb.append("apdix_book").append("=").append(apdix_book).append(",");
        sb.append("accnt_no_nm").append("=").append(accnt_no_nm).append(",");
        sb.append("abol_trans_clsf").append("=").append(abol_trans_clsf).append(",");
        sb.append("abol_trans_ymd").append("=").append(abol_trans_ymd).append(",");
        sb.append("abol_trans_fr_ymd").append("=").append(abol_trans_fr_ymd).append(",");
        sb.append("abol_trans_to_ymd").append("=").append(abol_trans_to_ymd).append(",");
        sb.append("abol_trans_resn").append("=").append(abol_trans_resn).append(",");
        sb.append("trans").append("=").append(trans).append(",");
        sb.append("vol").append("=").append(vol).append(",");
        sb.append("rowStatus").append("=").append(rowStatus);
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
