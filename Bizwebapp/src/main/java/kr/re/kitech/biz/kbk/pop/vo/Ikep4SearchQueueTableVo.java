package kr.re.kitech.biz.kbk.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "업무정보 색인 증분작업을 위한 큐테이블Vo")
public class Ikep4SearchQueueTableVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public Ikep4SearchQueueTableVo(){
    }

    @ElDtoField(logicalName = "테이블명", physicalName = "table_name", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String table_name;

    @ElDtoField(logicalName = "검색키워드", physicalName = "srchkey", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String srchkey;

    @ElDtoField(logicalName = "action", physicalName = "action", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String action;

    @ElVoField(physicalName = "table_name")
    public String getTable_name(){
        return table_name;
    }

    @ElVoField(physicalName = "table_name")
    public void setTable_name(String table_name){
        this.table_name = table_name;
    }

    @ElVoField(physicalName = "srchkey")
    public String getSrchkey(){
        return srchkey;
    }

    @ElVoField(physicalName = "srchkey")
    public void setSrchkey(String srchkey){
        this.srchkey = srchkey;
    }

    @ElVoField(physicalName = "action")
    public String getAction(){
        return action;
    }

    @ElVoField(physicalName = "action")
    public void setAction(String action){
        this.action = action;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ikep4SearchQueueTableVo [");
        sb.append("table_name").append("=").append(table_name).append(",");
        sb.append("srchkey").append("=").append(srchkey).append(",");
        sb.append("action").append("=").append(action);
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
