package kr.re.kitech.biz.res.rte.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "소연심의디테일 Vo")
public class ResSmlRvewDVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResSmlRvewDVo(){
    }

    @ElDtoField(logicalName = "키1", physicalName = "key_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String key_1;

    @ElDtoField(logicalName = "키2", physicalName = "key_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String key_2;

    @ElDtoField(logicalName = "순번", physicalName = "seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int seq;

    @ElDtoField(logicalName = "업무구분", physicalName = "biz_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biz_clsf;

    @ElDtoField(logicalName = "(부)업무구분", physicalName = "sub_biz_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sub_biz_clsf;

    @ElDtoField(logicalName = "안건구분", physicalName = "item_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_clsf;

    @ElDtoField(logicalName = "안건제목", physicalName = "rvew_objct", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rvew_objct;

    @ElDtoField(logicalName = "주요대상자", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "소연심의담당자", physicalName = "chrg_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chrg_psn;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "총괄위(지심위)구분", physicalName = "cmt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmt_clsf;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElVoField(physicalName = "key_1")
    public String getKey_1(){
        return key_1;
    }

    @ElVoField(physicalName = "key_1")
    public void setKey_1(String key_1){
        this.key_1 = key_1;
    }

    @ElVoField(physicalName = "key_2")
    public String getKey_2(){
        return key_2;
    }

    @ElVoField(physicalName = "key_2")
    public void setKey_2(String key_2){
        this.key_2 = key_2;
    }

    @ElVoField(physicalName = "seq")
    public int getSeq(){
        return seq;
    }

    @ElVoField(physicalName = "seq")
    public void setSeq(int seq){
        this.seq = seq;
    }

    @ElVoField(physicalName = "biz_clsf")
    public String getBiz_clsf(){
        return biz_clsf;
    }

    @ElVoField(physicalName = "biz_clsf")
    public void setBiz_clsf(String biz_clsf){
        this.biz_clsf = biz_clsf;
    }

    @ElVoField(physicalName = "sub_biz_clsf")
    public String getSub_biz_clsf(){
        return sub_biz_clsf;
    }

    @ElVoField(physicalName = "sub_biz_clsf")
    public void setSub_biz_clsf(String sub_biz_clsf){
        this.sub_biz_clsf = sub_biz_clsf;
    }

    @ElVoField(physicalName = "item_clsf")
    public String getItem_clsf(){
        return item_clsf;
    }

    @ElVoField(physicalName = "item_clsf")
    public void setItem_clsf(String item_clsf){
        this.item_clsf = item_clsf;
    }

    @ElVoField(physicalName = "rvew_objct")
    public String getRvew_objct(){
        return rvew_objct;
    }

    @ElVoField(physicalName = "rvew_objct")
    public void setRvew_objct(String rvew_objct){
        this.rvew_objct = rvew_objct;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "chrg_psn")
    public String getChrg_psn(){
        return chrg_psn;
    }

    @ElVoField(physicalName = "chrg_psn")
    public void setChrg_psn(String chrg_psn){
        this.chrg_psn = chrg_psn;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "cmt_clsf")
    public String getCmt_clsf(){
        return cmt_clsf;
    }

    @ElVoField(physicalName = "cmt_clsf")
    public void setCmt_clsf(String cmt_clsf){
        this.cmt_clsf = cmt_clsf;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResSmlRvewDVo [");
        sb.append("key_1").append("=").append(key_1).append(",");
        sb.append("key_2").append("=").append(key_2).append(",");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("biz_clsf").append("=").append(biz_clsf).append(",");
        sb.append("sub_biz_clsf").append("=").append(sub_biz_clsf).append(",");
        sb.append("item_clsf").append("=").append(item_clsf).append(",");
        sb.append("rvew_objct").append("=").append(rvew_objct).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("chrg_psn").append("=").append(chrg_psn).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("cmt_clsf").append("=").append(cmt_clsf).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no);
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
