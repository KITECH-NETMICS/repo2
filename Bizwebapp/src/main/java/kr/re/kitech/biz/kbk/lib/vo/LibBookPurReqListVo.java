package kr.re.kitech.biz.kbk.lib.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "도서구입신청서리스트VO")
public class LibBookPurReqListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public LibBookPurReqListVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "번호", physicalName = "no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String no;

    @ElDtoField(logicalName = "도서명", physicalName = "book_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String book_nm;

    @ElDtoField(logicalName = "저자명", physicalName = "auth_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String auth_nm;

    @ElDtoField(logicalName = "출판사", physicalName = "issu_agncy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_agncy;

    @ElDtoField(logicalName = "신청권수", physicalName = "req_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_qty;

    @ElDtoField(logicalName = "단가", physicalName = "unit_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unit_amt;

    @ElDtoField(logicalName = "통화단위", physicalName = "curncy_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curncy_unit;

    @ElDtoField(logicalName = "합계", physicalName = "tot_expns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_expns;

    @ElDtoField(logicalName = "출판년도", physicalName = "publ_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String publ_yr;

    @ElDtoField(logicalName = "CRUD", physicalName = "rowStatus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rowStatus;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "no")
    public String getNo(){
        return no;
    }

    @ElVoField(physicalName = "no")
    public void setNo(String no){
        this.no = no;
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

    @ElVoField(physicalName = "issu_agncy")
    public String getIssu_agncy(){
        return issu_agncy;
    }

    @ElVoField(physicalName = "issu_agncy")
    public void setIssu_agncy(String issu_agncy){
        this.issu_agncy = issu_agncy;
    }

    @ElVoField(physicalName = "req_qty")
    public String getReq_qty(){
        return req_qty;
    }

    @ElVoField(physicalName = "req_qty")
    public void setReq_qty(String req_qty){
        this.req_qty = req_qty;
    }

    @ElVoField(physicalName = "unit_amt")
    public String getUnit_amt(){
        return unit_amt;
    }

    @ElVoField(physicalName = "unit_amt")
    public void setUnit_amt(String unit_amt){
        this.unit_amt = unit_amt;
    }

    @ElVoField(physicalName = "curncy_unit")
    public String getCurncy_unit(){
        return curncy_unit;
    }

    @ElVoField(physicalName = "curncy_unit")
    public void setCurncy_unit(String curncy_unit){
        this.curncy_unit = curncy_unit;
    }

    @ElVoField(physicalName = "tot_expns")
    public String getTot_expns(){
        return tot_expns;
    }

    @ElVoField(physicalName = "tot_expns")
    public void setTot_expns(String tot_expns){
        this.tot_expns = tot_expns;
    }

    @ElVoField(physicalName = "publ_yr")
    public String getPubl_yr(){
        return publ_yr;
    }

    @ElVoField(physicalName = "publ_yr")
    public void setPubl_yr(String publ_yr){
        this.publ_yr = publ_yr;
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
        sb.append("LibBookPurReqListVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("no").append("=").append(no).append(",");
        sb.append("book_nm").append("=").append(book_nm).append(",");
        sb.append("auth_nm").append("=").append(auth_nm).append(",");
        sb.append("issu_agncy").append("=").append(issu_agncy).append(",");
        sb.append("req_qty").append("=").append(req_qty).append(",");
        sb.append("unit_amt").append("=").append(unit_amt).append(",");
        sb.append("curncy_unit").append("=").append(curncy_unit).append(",");
        sb.append("tot_expns").append("=").append(tot_expns).append(",");
        sb.append("publ_yr").append("=").append(publ_yr).append(",");
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
