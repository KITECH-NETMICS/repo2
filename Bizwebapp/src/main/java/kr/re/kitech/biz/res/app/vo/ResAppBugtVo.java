package kr.re.kitech.biz.res.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "사업신청 예산 내역 Vo")
public class ResAppBugtVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResAppBugtVo(){
    }

    @ElDtoField(logicalName = "사업신청번호", physicalName = "bsns_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_req_no;

    @ElDtoField(logicalName = "예산항목", physicalName = "bugt_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_item;

    @ElDtoField(logicalName = "연차", physicalName = "anal", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int anal;

    @ElDtoField(logicalName = "정부출연금", physicalName = "gov_cntrbamt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long gov_cntrbamt;

    @ElDtoField(logicalName = "기업현금", physicalName = "cmpy_cash", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long cmpy_cash;

    @ElDtoField(logicalName = "기업현물", physicalName = "cmpy_goods", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long cmpy_goods;

    @ElDtoField(logicalName = "상대국현물", physicalName = "contpat_goods", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long contpat_goods;

    @ElDtoField(logicalName = "지방정부현금", physicalName = "local_gov_cash", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long local_gov_cash;

    @ElDtoField(logicalName = "대학현금", physicalName = "univ_cash", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long univ_cash;

    @ElDtoField(logicalName = "기타현금", physicalName = "etc_cash", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long etc_cash;

    @ElDtoField(logicalName = "합계", physicalName = "tot_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tot_amt;

    @ElDtoField(logicalName = "현금총금액", physicalName = "cash_tot_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long cash_tot_amt;

    @ElDtoField(logicalName = "현물총금액", physicalName = "goods_tot_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long goods_tot_amt;

    @ElDtoField(logicalName = "비목구분(비목구분)", physicalName = "itm_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String itm_nm;

    @ElDtoField(logicalName = "비목구분명(세부비목명)", physicalName = "bugt_item_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_item_nm;

    @ElDtoField(logicalName = "시작일자", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;

    @ElDtoField(logicalName = "종료일자", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElVoField(physicalName = "bsns_req_no")
    public String getBsns_req_no(){
        return bsns_req_no;
    }

    @ElVoField(physicalName = "bsns_req_no")
    public void setBsns_req_no(String bsns_req_no){
        this.bsns_req_no = bsns_req_no;
    }

    @ElVoField(physicalName = "bugt_item")
    public String getBugt_item(){
        return bugt_item;
    }

    @ElVoField(physicalName = "bugt_item")
    public void setBugt_item(String bugt_item){
        this.bugt_item = bugt_item;
    }

    @ElVoField(physicalName = "anal")
    public int getAnal(){
        return anal;
    }

    @ElVoField(physicalName = "anal")
    public void setAnal(int anal){
        this.anal = anal;
    }

    @ElVoField(physicalName = "gov_cntrbamt")
    public long getGov_cntrbamt(){
        return gov_cntrbamt;
    }

    @ElVoField(physicalName = "gov_cntrbamt")
    public void setGov_cntrbamt(long gov_cntrbamt){
        this.gov_cntrbamt = gov_cntrbamt;
    }

    @ElVoField(physicalName = "cmpy_cash")
    public long getCmpy_cash(){
        return cmpy_cash;
    }

    @ElVoField(physicalName = "cmpy_cash")
    public void setCmpy_cash(long cmpy_cash){
        this.cmpy_cash = cmpy_cash;
    }

    @ElVoField(physicalName = "cmpy_goods")
    public long getCmpy_goods(){
        return cmpy_goods;
    }

    @ElVoField(physicalName = "cmpy_goods")
    public void setCmpy_goods(long cmpy_goods){
        this.cmpy_goods = cmpy_goods;
    }

    @ElVoField(physicalName = "contpat_goods")
    public long getContpat_goods(){
        return contpat_goods;
    }

    @ElVoField(physicalName = "contpat_goods")
    public void setContpat_goods(long contpat_goods){
        this.contpat_goods = contpat_goods;
    }

    @ElVoField(physicalName = "local_gov_cash")
    public long getLocal_gov_cash(){
        return local_gov_cash;
    }

    @ElVoField(physicalName = "local_gov_cash")
    public void setLocal_gov_cash(long local_gov_cash){
        this.local_gov_cash = local_gov_cash;
    }

    @ElVoField(physicalName = "univ_cash")
    public long getUniv_cash(){
        return univ_cash;
    }

    @ElVoField(physicalName = "univ_cash")
    public void setUniv_cash(long univ_cash){
        this.univ_cash = univ_cash;
    }

    @ElVoField(physicalName = "etc_cash")
    public long getEtc_cash(){
        return etc_cash;
    }

    @ElVoField(physicalName = "etc_cash")
    public void setEtc_cash(long etc_cash){
        this.etc_cash = etc_cash;
    }

    @ElVoField(physicalName = "tot_amt")
    public long getTot_amt(){
        return tot_amt;
    }

    @ElVoField(physicalName = "tot_amt")
    public void setTot_amt(long tot_amt){
        this.tot_amt = tot_amt;
    }

    @ElVoField(physicalName = "cash_tot_amt")
    public long getCash_tot_amt(){
        return cash_tot_amt;
    }

    @ElVoField(physicalName = "cash_tot_amt")
    public void setCash_tot_amt(long cash_tot_amt){
        this.cash_tot_amt = cash_tot_amt;
    }

    @ElVoField(physicalName = "goods_tot_amt")
    public long getGoods_tot_amt(){
        return goods_tot_amt;
    }

    @ElVoField(physicalName = "goods_tot_amt")
    public void setGoods_tot_amt(long goods_tot_amt){
        this.goods_tot_amt = goods_tot_amt;
    }

    @ElVoField(physicalName = "itm_nm")
    public String getItm_nm(){
        return itm_nm;
    }

    @ElVoField(physicalName = "itm_nm")
    public void setItm_nm(String itm_nm){
        this.itm_nm = itm_nm;
    }

    @ElVoField(physicalName = "bugt_item_nm")
    public String getBugt_item_nm(){
        return bugt_item_nm;
    }

    @ElVoField(physicalName = "bugt_item_nm")
    public void setBugt_item_nm(String bugt_item_nm){
        this.bugt_item_nm = bugt_item_nm;
    }

    @ElVoField(physicalName = "start_ymd")
    public String getStart_ymd(){
        return start_ymd;
    }

    @ElVoField(physicalName = "start_ymd")
    public void setStart_ymd(String start_ymd){
        this.start_ymd = start_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public String getCls_ymd(){
        return cls_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public void setCls_ymd(String cls_ymd){
        this.cls_ymd = cls_ymd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResAppBugtVo [");
        sb.append("bsns_req_no").append("=").append(bsns_req_no).append(",");
        sb.append("bugt_item").append("=").append(bugt_item).append(",");
        sb.append("anal").append("=").append(anal).append(",");
        sb.append("gov_cntrbamt").append("=").append(gov_cntrbamt).append(",");
        sb.append("cmpy_cash").append("=").append(cmpy_cash).append(",");
        sb.append("cmpy_goods").append("=").append(cmpy_goods).append(",");
        sb.append("contpat_goods").append("=").append(contpat_goods).append(",");
        sb.append("local_gov_cash").append("=").append(local_gov_cash).append(",");
        sb.append("univ_cash").append("=").append(univ_cash).append(",");
        sb.append("etc_cash").append("=").append(etc_cash).append(",");
        sb.append("tot_amt").append("=").append(tot_amt).append(",");
        sb.append("cash_tot_amt").append("=").append(cash_tot_amt).append(",");
        sb.append("goods_tot_amt").append("=").append(goods_tot_amt).append(",");
        sb.append("itm_nm").append("=").append(itm_nm).append(",");
        sb.append("bugt_item_nm").append("=").append(bugt_item_nm).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd);
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
