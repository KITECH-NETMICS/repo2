package kr.re.kitech.biz.xom.core.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "마이메뉴")
public class UserListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public UserListVo(){
    }

    @ElDtoField(logicalName = "사용자리스트", physicalName = "users", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.UserVo> users;

    @ElVoField(physicalName = "users")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.UserVo> getUsers(){
        return users;
    }

    @ElVoField(physicalName = "users")
    public void setUsers(java.util.List<kr.re.kitech.biz.xom.core.vo.UserVo> users){
        this.users = users;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserListVo [");
        sb.append("users").append("=").append(users);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; users != null && i < users.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.UserVo vo = (kr.re.kitech.biz.xom.core.vo.UserVo)users.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; users != null && i < users.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.UserVo vo = (kr.re.kitech.biz.xom.core.vo.UserVo)users.get(i);
            vo._xStreamDec();	 
        }
    }


}
