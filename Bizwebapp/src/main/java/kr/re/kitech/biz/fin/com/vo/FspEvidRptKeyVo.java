package kr.re.kitech.biz.fin.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "전자증빙 레포트 key")
public class FspEvidRptKeyVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspEvidRptKeyVo(){
    }

    @ElDtoField(logicalName = "증빙관리번호", physicalName = "evid_mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evid_mngmt_no;

    @ElDtoField(logicalName = "증빙항목코드", physicalName = "evid_item_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evid_item_cd;

    @ElDtoField(logicalName = "순번", physicalName = "seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int seq;

    @ElDtoField(logicalName = "증빙항목순번", physicalName = "evid_mngmt_seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int evid_mngmt_seq;

    @ElDtoField(logicalName = "키컬럼", physicalName = "key_col", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String key_col;

    @ElDtoField(logicalName = "키값", physicalName = "key_val", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String key_val;

    @ElVoField(physicalName = "evid_mngmt_no")
    public String getEvid_mngmt_no(){
        return evid_mngmt_no;
    }

    @ElVoField(physicalName = "evid_mngmt_no")
    public void setEvid_mngmt_no(String evid_mngmt_no){
        this.evid_mngmt_no = evid_mngmt_no;
    }

    @ElVoField(physicalName = "evid_item_cd")
    public String getEvid_item_cd(){
        return evid_item_cd;
    }

    @ElVoField(physicalName = "evid_item_cd")
    public void setEvid_item_cd(String evid_item_cd){
        this.evid_item_cd = evid_item_cd;
    }

    @ElVoField(physicalName = "seq")
    public int getSeq(){
        return seq;
    }

    @ElVoField(physicalName = "seq")
    public void setSeq(int seq){
        this.seq = seq;
    }

    @ElVoField(physicalName = "evid_mngmt_seq")
    public int getEvid_mngmt_seq(){
        return evid_mngmt_seq;
    }

    @ElVoField(physicalName = "evid_mngmt_seq")
    public void setEvid_mngmt_seq(int evid_mngmt_seq){
        this.evid_mngmt_seq = evid_mngmt_seq;
    }

    @ElVoField(physicalName = "key_col")
    public String getKey_col(){
        return key_col;
    }

    @ElVoField(physicalName = "key_col")
    public void setKey_col(String key_col){
        this.key_col = key_col;
    }

    @ElVoField(physicalName = "key_val")
    public String getKey_val(){
        return key_val;
    }

    @ElVoField(physicalName = "key_val")
    public void setKey_val(String key_val){
        this.key_val = key_val;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspEvidRptKeyVo [");
        sb.append("evid_mngmt_no").append("=").append(evid_mngmt_no).append(",");
        sb.append("evid_item_cd").append("=").append(evid_item_cd).append(",");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("evid_mngmt_seq").append("=").append(evid_mngmt_seq).append(",");
        sb.append("key_col").append("=").append(key_col).append(",");
        sb.append("key_val").append("=").append(key_val);
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
