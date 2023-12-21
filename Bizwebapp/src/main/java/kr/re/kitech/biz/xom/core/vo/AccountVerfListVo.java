package kr.re.kitech.biz.xom.core.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "계좌검증 리스트 Vo")
public class AccountVerfListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AccountVerfListVo(){
    }

    @ElDtoField(logicalName = "계좌검증 Vo", physicalName = "accList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AccountVerfVo> accList;

    @ElVoField(physicalName = "accList")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AccountVerfVo> getAccList(){
        return accList;
    }

    @ElVoField(physicalName = "accList")
    public void setAccList(java.util.List<kr.re.kitech.biz.xom.core.vo.AccountVerfVo> accList){
        this.accList = accList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccountVerfListVo [");
        sb.append("accList").append("=").append(accList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; accList != null && i < accList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AccountVerfVo vo = (kr.re.kitech.biz.xom.core.vo.AccountVerfVo)accList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; accList != null && i < accList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AccountVerfVo vo = (kr.re.kitech.biz.xom.core.vo.AccountVerfVo)accList.get(i);
            vo._xStreamDec();	 
        }
    }


}
