package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "LcpMouDomTabExp")
public class LcpMouDomTabVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public LcpMouDomTabVo(){
    }

    @ElDtoField(logicalName = "agncyCd", physicalName = "agncy_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_cd;

    @ElDtoField(logicalName = "mouNo", physicalName = "mou_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_no;

    @ElDtoField(logicalName = "type", physicalName = "type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String type;

    @ElDtoField(logicalName = "mouContrctYmd", physicalName = "mou_contrct_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_contrct_ymd;

    @ElDtoField(logicalName = "mouSubj", physicalName = "mou_subj", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_subj;

    @ElDtoField(logicalName = "mouClsYmd", physicalName = "mou_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_cls_ymd;

    @ElDtoField(logicalName = "valitationYn", physicalName = "valitation_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String valitation_yn;

    @ElDtoField(logicalName = "mouTerm", physicalName = "mou_term", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_term;

    @ElDtoField(logicalName = "mouContnt", physicalName = "mou_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_contnt;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "krcharAgncyNm", physicalName = "krchar_agncy_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String krchar_agncy_nm;

    @ElDtoField(logicalName = "mouKnd", physicalName = "mou_knd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_knd;

    @ElDtoField(logicalName = "agncy_nm", physicalName = "agncy_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_nm;

    @ElVoField(physicalName = "agncy_cd")
    public String getAgncy_cd(){
        return agncy_cd;
    }

    @ElVoField(physicalName = "agncy_cd")
    public void setAgncy_cd(String agncy_cd){
        this.agncy_cd = agncy_cd;
    }

    @ElVoField(physicalName = "mou_no")
    public String getMou_no(){
        return mou_no;
    }

    @ElVoField(physicalName = "mou_no")
    public void setMou_no(String mou_no){
        this.mou_no = mou_no;
    }

    @ElVoField(physicalName = "type")
    public String getType(){
        return type;
    }

    @ElVoField(physicalName = "type")
    public void setType(String type){
        this.type = type;
    }

    @ElVoField(physicalName = "mou_contrct_ymd")
    public String getMou_contrct_ymd(){
        return mou_contrct_ymd;
    }

    @ElVoField(physicalName = "mou_contrct_ymd")
    public void setMou_contrct_ymd(String mou_contrct_ymd){
        this.mou_contrct_ymd = mou_contrct_ymd;
    }

    @ElVoField(physicalName = "mou_subj")
    public String getMou_subj(){
        return mou_subj;
    }

    @ElVoField(physicalName = "mou_subj")
    public void setMou_subj(String mou_subj){
        this.mou_subj = mou_subj;
    }

    @ElVoField(physicalName = "mou_cls_ymd")
    public String getMou_cls_ymd(){
        return mou_cls_ymd;
    }

    @ElVoField(physicalName = "mou_cls_ymd")
    public void setMou_cls_ymd(String mou_cls_ymd){
        this.mou_cls_ymd = mou_cls_ymd;
    }

    @ElVoField(physicalName = "valitation_yn")
    public String getValitation_yn(){
        return valitation_yn;
    }

    @ElVoField(physicalName = "valitation_yn")
    public void setValitation_yn(String valitation_yn){
        this.valitation_yn = valitation_yn;
    }

    @ElVoField(physicalName = "mou_term")
    public String getMou_term(){
        return mou_term;
    }

    @ElVoField(physicalName = "mou_term")
    public void setMou_term(String mou_term){
        this.mou_term = mou_term;
    }

    @ElVoField(physicalName = "mou_contnt")
    public String getMou_contnt(){
        return mou_contnt;
    }

    @ElVoField(physicalName = "mou_contnt")
    public void setMou_contnt(String mou_contnt){
        this.mou_contnt = mou_contnt;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "krchar_agncy_nm")
    public String getKrchar_agncy_nm(){
        return krchar_agncy_nm;
    }

    @ElVoField(physicalName = "krchar_agncy_nm")
    public void setKrchar_agncy_nm(String krchar_agncy_nm){
        this.krchar_agncy_nm = krchar_agncy_nm;
    }

    @ElVoField(physicalName = "mou_knd")
    public String getMou_knd(){
        return mou_knd;
    }

    @ElVoField(physicalName = "mou_knd")
    public void setMou_knd(String mou_knd){
        this.mou_knd = mou_knd;
    }

    @ElVoField(physicalName = "agncy_nm")
    public String getAgncy_nm(){
        return agncy_nm;
    }

    @ElVoField(physicalName = "agncy_nm")
    public void setAgncy_nm(String agncy_nm){
        this.agncy_nm = agncy_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LcpMouDomTabVo [");
        sb.append("agncy_cd").append("=").append(agncy_cd).append(",");
        sb.append("mou_no").append("=").append(mou_no).append(",");
        sb.append("type").append("=").append(type).append(",");
        sb.append("mou_contrct_ymd").append("=").append(mou_contrct_ymd).append(",");
        sb.append("mou_subj").append("=").append(mou_subj).append(",");
        sb.append("mou_cls_ymd").append("=").append(mou_cls_ymd).append(",");
        sb.append("valitation_yn").append("=").append(valitation_yn).append(",");
        sb.append("mou_term").append("=").append(mou_term).append(",");
        sb.append("mou_contnt").append("=").append(mou_contnt).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("krchar_agncy_nm").append("=").append(krchar_agncy_nm).append(",");
        sb.append("mou_knd").append("=").append(mou_knd).append(",");
        sb.append("agncy_nm").append("=").append(agncy_nm);
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
