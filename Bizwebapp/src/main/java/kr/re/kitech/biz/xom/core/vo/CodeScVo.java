package kr.re.kitech.biz.xom.core.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "공통코드 검색 객체")
public class CodeScVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CodeScVo(){
    }

    @ElDtoField(logicalName = "그룹코드", physicalName = "grpCd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String grpCd;

    @ElDtoField(logicalName = "그룹코드(DB조회)", physicalName = "dbGrpCd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dbGrpCd;

    @ElDtoField(logicalName = "데이터프리픽스", physicalName = "dataPrefix", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dataPrefix;

    @ElVoField(physicalName = "grpCd")
    public String getGrpCd(){
        return grpCd;
    }

    @ElVoField(physicalName = "grpCd")
    public void setGrpCd(String grpCd){
        this.grpCd = grpCd;
    }

    @ElVoField(physicalName = "dbGrpCd")
    public String getDbGrpCd(){
        return dbGrpCd;
    }

    @ElVoField(physicalName = "dbGrpCd")
    public void setDbGrpCd(String dbGrpCd){
        this.dbGrpCd = dbGrpCd;
    }

    @ElVoField(physicalName = "dataPrefix")
    public String getDataPrefix(){
        return dataPrefix;
    }

    @ElVoField(physicalName = "dataPrefix")
    public void setDataPrefix(String dataPrefix){
        this.dataPrefix = dataPrefix;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CodeScVo [");
        sb.append("grpCd").append("=").append(grpCd).append(",");
        sb.append("dbGrpCd").append("=").append(dbGrpCd).append(",");
        sb.append("dataPrefix").append("=").append(dataPrefix);
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
