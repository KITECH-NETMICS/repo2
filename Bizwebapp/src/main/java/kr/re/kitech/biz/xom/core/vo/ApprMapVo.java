package kr.re.kitech.biz.xom.core.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "양식함 tree Vo")
public class ApprMapVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ApprMapVo(){
    }

    @ElDtoField(logicalName = "depth", physicalName = "depth", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int depth;

    @ElDtoField(logicalName = "양식명", physicalName = "appname", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appname;

    @ElDtoField(logicalName = "양식별칭", physicalName = "procdefalias", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String procdefalias;

    @ElDtoField(logicalName = "공통코드APR", physicalName = "cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd;

    @ElDtoField(logicalName = "div", physicalName = "div", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String div;

    @ElDtoField(logicalName = "mdiv", physicalName = "mdiv", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mdiv;

    @ElVoField(physicalName = "depth")
    public int getDepth(){
        return depth;
    }

    @ElVoField(physicalName = "depth")
    public void setDepth(int depth){
        this.depth = depth;
    }

    @ElVoField(physicalName = "appname")
    public String getAppname(){
        return appname;
    }

    @ElVoField(physicalName = "appname")
    public void setAppname(String appname){
        this.appname = appname;
    }

    @ElVoField(physicalName = "procdefalias")
    public String getProcdefalias(){
        return procdefalias;
    }

    @ElVoField(physicalName = "procdefalias")
    public void setProcdefalias(String procdefalias){
        this.procdefalias = procdefalias;
    }

    @ElVoField(physicalName = "cd")
    public String getCd(){
        return cd;
    }

    @ElVoField(physicalName = "cd")
    public void setCd(String cd){
        this.cd = cd;
    }

    @ElVoField(physicalName = "div")
    public String getDiv(){
        return div;
    }

    @ElVoField(physicalName = "div")
    public void setDiv(String div){
        this.div = div;
    }

    @ElVoField(physicalName = "mdiv")
    public String getMdiv(){
        return mdiv;
    }

    @ElVoField(physicalName = "mdiv")
    public void setMdiv(String mdiv){
        this.mdiv = mdiv;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApprMapVo [");
        sb.append("depth").append("=").append(depth).append(",");
        sb.append("appname").append("=").append(appname).append(",");
        sb.append("procdefalias").append("=").append(procdefalias).append(",");
        sb.append("cd").append("=").append(cd).append(",");
        sb.append("div").append("=").append(div).append(",");
        sb.append("mdiv").append("=").append(mdiv);
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
