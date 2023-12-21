package kr.re.kitech.biz.pat.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatPpoMasterFileSearchExp")
public class PatMasterFileSearchPopVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatMasterFileSearchPopVo(){
    }

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "mngmtNo", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;

    @ElDtoField(logicalName = "patClsf", physicalName = "pat_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_clsf;

    @ElDtoField(logicalName = "rptSrhAttachFile", physicalName = "rpt_srh_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_srh_attach_file;

    @ElDtoField(logicalName = "rptAnnounceAttachFile", physicalName = "rpt_announce_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_announce_attach_file;

    @ElDtoField(logicalName = "pctAttachFileNo", physicalName = "pct_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pct_attach_file_no;

    @ElDtoField(logicalName = "etcAttachFileNo", physicalName = "etc_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String etc_attach_file_no;

    @ElDtoField(logicalName = "outDeedAttachFileNo", physicalName = "out_deed_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String out_deed_attach_file_no;

    @ElDtoField(logicalName = "comApplyAttachFileNo", physicalName = "com_apply_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String com_apply_attach_file_no;

    @ElDtoField(logicalName = "attachFileNo2", physicalName = "attach_file_no_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_2;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "mngmt_no")
    public String getMngmt_no(){
        return mngmt_no;
    }

    @ElVoField(physicalName = "mngmt_no")
    public void setMngmt_no(String mngmt_no){
        this.mngmt_no = mngmt_no;
    }

    @ElVoField(physicalName = "pat_clsf")
    public String getPat_clsf(){
        return pat_clsf;
    }

    @ElVoField(physicalName = "pat_clsf")
    public void setPat_clsf(String pat_clsf){
        this.pat_clsf = pat_clsf;
    }

    @ElVoField(physicalName = "rpt_srh_attach_file")
    public String getRpt_srh_attach_file(){
        return rpt_srh_attach_file;
    }

    @ElVoField(physicalName = "rpt_srh_attach_file")
    public void setRpt_srh_attach_file(String rpt_srh_attach_file){
        this.rpt_srh_attach_file = rpt_srh_attach_file;
    }

    @ElVoField(physicalName = "rpt_announce_attach_file")
    public String getRpt_announce_attach_file(){
        return rpt_announce_attach_file;
    }

    @ElVoField(physicalName = "rpt_announce_attach_file")
    public void setRpt_announce_attach_file(String rpt_announce_attach_file){
        this.rpt_announce_attach_file = rpt_announce_attach_file;
    }

    @ElVoField(physicalName = "pct_attach_file_no")
    public String getPct_attach_file_no(){
        return pct_attach_file_no;
    }

    @ElVoField(physicalName = "pct_attach_file_no")
    public void setPct_attach_file_no(String pct_attach_file_no){
        this.pct_attach_file_no = pct_attach_file_no;
    }

    @ElVoField(physicalName = "etc_attach_file_no")
    public String getEtc_attach_file_no(){
        return etc_attach_file_no;
    }

    @ElVoField(physicalName = "etc_attach_file_no")
    public void setEtc_attach_file_no(String etc_attach_file_no){
        this.etc_attach_file_no = etc_attach_file_no;
    }

    @ElVoField(physicalName = "out_deed_attach_file_no")
    public String getOut_deed_attach_file_no(){
        return out_deed_attach_file_no;
    }

    @ElVoField(physicalName = "out_deed_attach_file_no")
    public void setOut_deed_attach_file_no(String out_deed_attach_file_no){
        this.out_deed_attach_file_no = out_deed_attach_file_no;
    }

    @ElVoField(physicalName = "com_apply_attach_file_no")
    public String getCom_apply_attach_file_no(){
        return com_apply_attach_file_no;
    }

    @ElVoField(physicalName = "com_apply_attach_file_no")
    public void setCom_apply_attach_file_no(String com_apply_attach_file_no){
        this.com_apply_attach_file_no = com_apply_attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no_2")
    public String getAttach_file_no_2(){
        return attach_file_no_2;
    }

    @ElVoField(physicalName = "attach_file_no_2")
    public void setAttach_file_no_2(String attach_file_no_2){
        this.attach_file_no_2 = attach_file_no_2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatMasterFileSearchPopVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
        sb.append("pat_clsf").append("=").append(pat_clsf).append(",");
        sb.append("rpt_srh_attach_file").append("=").append(rpt_srh_attach_file).append(",");
        sb.append("rpt_announce_attach_file").append("=").append(rpt_announce_attach_file).append(",");
        sb.append("pct_attach_file_no").append("=").append(pct_attach_file_no).append(",");
        sb.append("etc_attach_file_no").append("=").append(etc_attach_file_no).append(",");
        sb.append("out_deed_attach_file_no").append("=").append(out_deed_attach_file_no).append(",");
        sb.append("com_apply_attach_file_no").append("=").append(com_apply_attach_file_no).append(",");
        sb.append("attach_file_no_2").append("=").append(attach_file_no_2);
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
