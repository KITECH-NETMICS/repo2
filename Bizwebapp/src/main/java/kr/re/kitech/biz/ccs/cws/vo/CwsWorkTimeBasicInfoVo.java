package kr.re.kitech.biz.ccs.cws.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "WorkTimeBasicInfoVo")
public class CwsWorkTimeBasicInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CwsWorkTimeBasicInfoVo(){
    }

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "기준년월", physicalName = "yyyymm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String yyyymm;

    @ElDtoField(logicalName = "순번", physicalName = "rank", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rank;

    @ElDtoField(logicalName = "근태코드", physicalName = "commute_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String commute_cd;

    @ElDtoField(logicalName = "근태기타", physicalName = "commute_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String commute_rmk;

    @ElDtoField(logicalName = "생성일", physicalName = "created_at", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String created_at;

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "yyyymm")
    public String getYyyymm(){
        return yyyymm;
    }

    @ElVoField(physicalName = "yyyymm")
    public void setYyyymm(String yyyymm){
        this.yyyymm = yyyymm;
    }

    @ElVoField(physicalName = "rank")
    public String getRank(){
        return rank;
    }

    @ElVoField(physicalName = "rank")
    public void setRank(String rank){
        this.rank = rank;
    }

    @ElVoField(physicalName = "commute_cd")
    public String getCommute_cd(){
        return commute_cd;
    }

    @ElVoField(physicalName = "commute_cd")
    public void setCommute_cd(String commute_cd){
        this.commute_cd = commute_cd;
    }

    @ElVoField(physicalName = "commute_rmk")
    public String getCommute_rmk(){
        return commute_rmk;
    }

    @ElVoField(physicalName = "commute_rmk")
    public void setCommute_rmk(String commute_rmk){
        this.commute_rmk = commute_rmk;
    }

    @ElVoField(physicalName = "created_at")
    public String getCreated_at(){
        return created_at;
    }

    @ElVoField(physicalName = "created_at")
    public void setCreated_at(String created_at){
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CwsWorkTimeBasicInfoVo [");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("yyyymm").append("=").append(yyyymm).append(",");
        sb.append("rank").append("=").append(rank).append(",");
        sb.append("commute_cd").append("=").append(commute_cd).append(",");
        sb.append("commute_rmk").append("=").append(commute_rmk).append(",");
        sb.append("created_at").append("=").append(created_at);
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
