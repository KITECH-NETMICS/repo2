package kr.re.kitech.biz.xom.core.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "유저 환경설정 Vo")
public class UserAppvConfigVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public UserAppvConfigVo(){
    }

    @ElDtoField(logicalName = "유저 환경설정 VO", physicalName = "configVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.xom.core.vo.ApprvConfigVo configVo;

    @ElDtoField(logicalName = "대결상세 Vo", physicalName = "detlList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AppvDelegatorDetailVo> detlList;

    @ElDtoField(logicalName = "환경설정대결 Vo", physicalName = "dlgtVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.xom.core.vo.AppvDelegatorVo dlgtVo;

    @ElDtoField(logicalName = "환경설정대결 Vo", physicalName = "userList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AppvDelegatorVo> userList;

    @ElVoField(physicalName = "configVo")
    public kr.re.kitech.biz.xom.core.vo.ApprvConfigVo getConfigVo(){
        return configVo;
    }

    @ElVoField(physicalName = "configVo")
    public void setConfigVo(kr.re.kitech.biz.xom.core.vo.ApprvConfigVo configVo){
        this.configVo = configVo;
    }

    @ElVoField(physicalName = "detlList")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AppvDelegatorDetailVo> getDetlList(){
        return detlList;
    }

    @ElVoField(physicalName = "detlList")
    public void setDetlList(java.util.List<kr.re.kitech.biz.xom.core.vo.AppvDelegatorDetailVo> detlList){
        this.detlList = detlList;
    }

    @ElVoField(physicalName = "dlgtVo")
    public kr.re.kitech.biz.xom.core.vo.AppvDelegatorVo getDlgtVo(){
        return dlgtVo;
    }

    @ElVoField(physicalName = "dlgtVo")
    public void setDlgtVo(kr.re.kitech.biz.xom.core.vo.AppvDelegatorVo dlgtVo){
        this.dlgtVo = dlgtVo;
    }

    @ElVoField(physicalName = "userList")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AppvDelegatorVo> getUserList(){
        return userList;
    }

    @ElVoField(physicalName = "userList")
    public void setUserList(java.util.List<kr.re.kitech.biz.xom.core.vo.AppvDelegatorVo> userList){
        this.userList = userList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserAppvConfigVo [");
        sb.append("configVo").append("=").append(configVo).append(",");
        sb.append("detlList").append("=").append(detlList).append(",");
        sb.append("dlgtVo").append("=").append(dlgtVo).append(",");
        sb.append("userList").append("=").append(userList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.configVo != null ) this.configVo._xStreamEnc();
        for( int i=0 ; detlList != null && i < detlList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AppvDelegatorDetailVo vo = (kr.re.kitech.biz.xom.core.vo.AppvDelegatorDetailVo)detlList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.dlgtVo != null ) this.dlgtVo._xStreamEnc();
        for( int i=0 ; userList != null && i < userList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AppvDelegatorVo vo = (kr.re.kitech.biz.xom.core.vo.AppvDelegatorVo)userList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.configVo != null ) this.configVo._xStreamDec();
        for( int i=0 ; detlList != null && i < detlList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AppvDelegatorDetailVo vo = (kr.re.kitech.biz.xom.core.vo.AppvDelegatorDetailVo)detlList.get(i);
            vo._xStreamDec();	 
        }
        if( this.dlgtVo != null ) this.dlgtVo._xStreamDec();
        for( int i=0 ; userList != null && i < userList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AppvDelegatorVo vo = (kr.re.kitech.biz.xom.core.vo.AppvDelegatorVo)userList.get(i);
            vo._xStreamDec();	 
        }
    }


}
