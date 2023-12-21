package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "국내출장 과제 미참여인원 목록 Vo")
public class NoJoinPsnVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public NoJoinPsnVo(){
    }

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "계정시작일자", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;

    @ElDtoField(logicalName = "계정종료일자", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "참여연구원여부", physicalName = "attnce_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attnce_nm;

    @ElDtoField(logicalName = "참여시작일자", physicalName = "attnce_prd_orign_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attnce_prd_orign_ymd;

    @ElDtoField(logicalName = "참여종료일자", physicalName = "attnce_prd_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attnce_prd_cls_ymd;

    @ElDtoField(logicalName = "출장자", physicalName = "biztrip_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_psn_nm;

    @ElDtoField(logicalName = "기간 적합여부", physicalName = "man_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String man_yn;

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
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

    @ElVoField(physicalName = "attnce_nm")
    public String getAttnce_nm(){
        return attnce_nm;
    }

    @ElVoField(physicalName = "attnce_nm")
    public void setAttnce_nm(String attnce_nm){
        this.attnce_nm = attnce_nm;
    }

    @ElVoField(physicalName = "attnce_prd_orign_ymd")
    public String getAttnce_prd_orign_ymd(){
        return attnce_prd_orign_ymd;
    }

    @ElVoField(physicalName = "attnce_prd_orign_ymd")
    public void setAttnce_prd_orign_ymd(String attnce_prd_orign_ymd){
        this.attnce_prd_orign_ymd = attnce_prd_orign_ymd;
    }

    @ElVoField(physicalName = "attnce_prd_cls_ymd")
    public String getAttnce_prd_cls_ymd(){
        return attnce_prd_cls_ymd;
    }

    @ElVoField(physicalName = "attnce_prd_cls_ymd")
    public void setAttnce_prd_cls_ymd(String attnce_prd_cls_ymd){
        this.attnce_prd_cls_ymd = attnce_prd_cls_ymd;
    }

    @ElVoField(physicalName = "biztrip_psn_nm")
    public String getBiztrip_psn_nm(){
        return biztrip_psn_nm;
    }

    @ElVoField(physicalName = "biztrip_psn_nm")
    public void setBiztrip_psn_nm(String biztrip_psn_nm){
        this.biztrip_psn_nm = biztrip_psn_nm;
    }

    @ElVoField(physicalName = "man_yn")
    public String getMan_yn(){
        return man_yn;
    }

    @ElVoField(physicalName = "man_yn")
    public void setMan_yn(String man_yn){
        this.man_yn = man_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrPrjNotJoinPsnVo [");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("attnce_nm").append("=").append(attnce_nm).append(",");
        sb.append("attnce_prd_orign_ymd").append("=").append(attnce_prd_orign_ymd).append(",");
        sb.append("attnce_prd_cls_ymd").append("=").append(attnce_prd_cls_ymd).append(",");
        sb.append("biztrip_psn_nm").append("=").append(biztrip_psn_nm).append(",");
        sb.append("man_yn").append("=").append(man_yn);
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
