package kr.re.kitech.biz.xom.core.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "엑셀헤더")
public class ExcelHeaderVo extends com.inswave.elfw.core.CommVO {
    private static final long serialVersionUID = 1L;

    public ExcelHeaderVo(){
    }

    @ElDtoField(logicalName = "헤더명", physicalName = "cellName", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String cellName;

    @ElDtoField(logicalName = "헤더사이즈", physicalName = "cellSize", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String cellSize;

    @ElVoField(physicalName = "cellName")
    public String getCellName(){
        String ret = this.cellName;
        return ret;
    }

    @ElVoField(physicalName = "cellName")
    public void setCellName(String cellName){
        this.cellName = cellName;
    }

    @ElVoField(physicalName = "cellSize")
    public String getCellSize(){
        String ret = this.cellSize;
        return ret;
    }

    @ElVoField(physicalName = "cellSize")
    public void setCellSize(String cellSize){
        this.cellSize = cellSize;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExcelHeaderVo [");
        sb.append("cellName").append("=").append(cellName).append(",");
        sb.append("cellSize").append("=").append(cellSize);
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
