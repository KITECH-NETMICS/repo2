package kr.re.kitech.biz.pat.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "지식재산권 조회 Vo")
public class PatSrcVo extends kr.re.kitech.biz.pat.app.vo.PatComVo {
    private static final long serialVersionUID = 1L;

    public PatSrcVo(){
    }

    @ElDtoField(logicalName = "변경구분", physicalName = "skate_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String skate_clsf;

    @ElDtoField(logicalName = "변경차수", physicalName = "his_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String his_seq;

    @ElDtoField(logicalName = "변경신청번호", physicalName = "elecapp_docu_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String elecapp_docu_no;

    @ElDtoField(logicalName = "순번", physicalName = "seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seq;

    @ElDtoField(logicalName = "참조키", physicalName = "ref_key", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ref_key;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "현재업무상태", physicalName = "curr_state_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curr_state_cd;

    @ElDtoField(logicalName = "조회구분", physicalName = "src_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String src_clsf;

    @ElVoField(physicalName = "skate_clsf")
    public String getSkate_clsf(){
        return skate_clsf;
    }

    @ElVoField(physicalName = "skate_clsf")
    public void setSkate_clsf(String skate_clsf){
        this.skate_clsf = skate_clsf;
    }

    @ElVoField(physicalName = "his_seq")
    public String getHis_seq(){
        return his_seq;
    }

    @ElVoField(physicalName = "his_seq")
    public void setHis_seq(String his_seq){
        this.his_seq = his_seq;
    }

    @ElVoField(physicalName = "elecapp_docu_no")
    public String getElecapp_docu_no(){
        return elecapp_docu_no;
    }

    @ElVoField(physicalName = "elecapp_docu_no")
    public void setElecapp_docu_no(String elecapp_docu_no){
        this.elecapp_docu_no = elecapp_docu_no;
    }

    @ElVoField(physicalName = "seq")
    public String getSeq(){
        return seq;
    }

    @ElVoField(physicalName = "seq")
    public void setSeq(String seq){
        this.seq = seq;
    }

    @ElVoField(physicalName = "ref_key")
    public String getRef_key(){
        return ref_key;
    }

    @ElVoField(physicalName = "ref_key")
    public void setRef_key(String ref_key){
        this.ref_key = ref_key;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "curr_state_cd")
    public String getCurr_state_cd(){
        return curr_state_cd;
    }

    @ElVoField(physicalName = "curr_state_cd")
    public void setCurr_state_cd(String curr_state_cd){
        this.curr_state_cd = curr_state_cd;
    }

    @ElVoField(physicalName = "src_clsf")
    public String getSrc_clsf(){
        return src_clsf;
    }

    @ElVoField(physicalName = "src_clsf")
    public void setSrc_clsf(String src_clsf){
        this.src_clsf = src_clsf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatSrcVo [");
        sb.append("skate_clsf").append("=").append(skate_clsf).append(",");
        sb.append("his_seq").append("=").append(his_seq).append(",");
        sb.append("elecapp_docu_no").append("=").append(elecapp_docu_no).append(",");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("ref_key").append("=").append(ref_key).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("curr_state_cd").append("=").append(curr_state_cd).append(",");
        sb.append("src_clsf").append("=").append(src_clsf);
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
