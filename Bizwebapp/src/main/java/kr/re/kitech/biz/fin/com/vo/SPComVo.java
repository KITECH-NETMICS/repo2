package kr.re.kitech.biz.fin.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "프로시저 호출 공통 Vo")
public class SPComVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SPComVo(){
    }

    @ElDtoField(logicalName = "sql_err", physicalName = "ss_sql", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int ss_sql;

    @ElDtoField(logicalName = "isam_err", physicalName = "ss_isam", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int ss_isam;

    @ElDtoField(logicalName = "error_info", physicalName = "ss_desc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ss_desc;

    @ElVoField(physicalName = "ss_sql")
    public int getSs_sql(){
        return ss_sql;
    }

    @ElVoField(physicalName = "ss_sql")
    public void setSs_sql(int ss_sql){
        this.ss_sql = ss_sql;
    }

    @ElVoField(physicalName = "ss_isam")
    public int getSs_isam(){
        return ss_isam;
    }

    @ElVoField(physicalName = "ss_isam")
    public void setSs_isam(int ss_isam){
        this.ss_isam = ss_isam;
    }

    @ElVoField(physicalName = "ss_desc")
    public String getSs_desc(){
        return ss_desc;
    }

    @ElVoField(physicalName = "ss_desc")
    public void setSs_desc(String ss_desc){
        this.ss_desc = ss_desc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SPCallComVo [");
        sb.append("ss_sql").append("=").append(ss_sql).append(",");
        sb.append("ss_isam").append("=").append(ss_isam).append(",");
        sb.append("ss_desc").append("=").append(ss_desc);
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
