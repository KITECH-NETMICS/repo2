package kr.re.kitech.biz.sup.tec.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "기업지원 카드결재내역 Vo")
public class SptApplTableVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptApplTableVo(){
    }

    @ElDtoField(logicalName = "기술지원접수번호", physicalName = "kolas_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String kolas_no;

    @ElDtoField(logicalName = "승인번호", physicalName = "appl_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appl_no;

    @ElDtoField(logicalName = "승인일자", physicalName = "appl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appl_ymd;

    @ElDtoField(logicalName = "승인취소구분", physicalName = "gubun_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String gubun_cd;

    @ElDtoField(logicalName = "삭제여부", physicalName = "del_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String del_yn;

    @ElVoField(physicalName = "kolas_no")
    public String getKolas_no(){
        return kolas_no;
    }

    @ElVoField(physicalName = "kolas_no")
    public void setKolas_no(String kolas_no){
        this.kolas_no = kolas_no;
    }

    @ElVoField(physicalName = "appl_no")
    public String getAppl_no(){
        return appl_no;
    }

    @ElVoField(physicalName = "appl_no")
    public void setAppl_no(String appl_no){
        this.appl_no = appl_no;
    }

    @ElVoField(physicalName = "appl_ymd")
    public String getAppl_ymd(){
        return appl_ymd;
    }

    @ElVoField(physicalName = "appl_ymd")
    public void setAppl_ymd(String appl_ymd){
        this.appl_ymd = appl_ymd;
    }

    @ElVoField(physicalName = "gubun_cd")
    public String getGubun_cd(){
        return gubun_cd;
    }

    @ElVoField(physicalName = "gubun_cd")
    public void setGubun_cd(String gubun_cd){
        this.gubun_cd = gubun_cd;
    }

    @ElVoField(physicalName = "del_yn")
    public String getDel_yn(){
        return del_yn;
    }

    @ElVoField(physicalName = "del_yn")
    public void setDel_yn(String del_yn){
        this.del_yn = del_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptApplTableVo [");
        sb.append("kolas_no").append("=").append(kolas_no).append(",");
        sb.append("appl_no").append("=").append(appl_no).append(",");
        sb.append("appl_ymd").append("=").append(appl_ymd).append(",");
        sb.append("gubun_cd").append("=").append(gubun_cd).append(",");
        sb.append("del_yn").append("=").append(del_yn);
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
