package kr.re.kitech.biz.apr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "회계코드마스터")
public class AppFormListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AppFormListVo(){
    }

    @ElDtoField(logicalName = "신청서양식함마스터List", physicalName = "appFormVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.apr.vo.AppFormVo> appFormVoList;

    @ElVoField(physicalName = "appFormVoList")
    public java.util.List<kr.re.kitech.biz.apr.vo.AppFormVo> getAppFormVoList(){
        return appFormVoList;
    }

    @ElVoField(physicalName = "appFormVoList")
    public void setAppFormVoList(java.util.List<kr.re.kitech.biz.apr.vo.AppFormVo> appFormVoList){
        this.appFormVoList = appFormVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AppFormListVo [");
        sb.append("appFormVoList").append("=").append(appFormVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; appFormVoList != null && i < appFormVoList.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.AppFormVo vo = (kr.re.kitech.biz.apr.vo.AppFormVo)appFormVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; appFormVoList != null && i < appFormVoList.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.AppFormVo vo = (kr.re.kitech.biz.apr.vo.AppFormVo)appFormVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
