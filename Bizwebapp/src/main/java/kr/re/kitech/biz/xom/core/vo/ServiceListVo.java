package kr.re.kitech.biz.xom.core.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "메뉴정보 리스트(LDAP)")
public class ServiceListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ServiceListVo(){
    }

    @ElDtoField(logicalName = "Ldap 서비스(메뉴)", physicalName = "serviceVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.ServiceVo> serviceVoList;

    @ElVoField(physicalName = "serviceVoList")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.ServiceVo> getServiceVoList(){
        return serviceVoList;
    }

    @ElVoField(physicalName = "serviceVoList")
    public void setServiceVoList(java.util.List<kr.re.kitech.biz.xom.core.vo.ServiceVo> serviceVoList){
        this.serviceVoList = serviceVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ServiceListVo [");
        sb.append("serviceVoList").append("=").append(serviceVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; serviceVoList != null && i < serviceVoList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.ServiceVo vo = (kr.re.kitech.biz.xom.core.vo.ServiceVo)serviceVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; serviceVoList != null && i < serviceVoList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.ServiceVo vo = (kr.re.kitech.biz.xom.core.vo.ServiceVo)serviceVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
