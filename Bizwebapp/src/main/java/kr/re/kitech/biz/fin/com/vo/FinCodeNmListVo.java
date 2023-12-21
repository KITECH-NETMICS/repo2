package kr.re.kitech.biz.fin.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "콤보용 코드 리스트 Vo")
public class FinCodeNmListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FinCodeNmListVo(){
    }

    @ElDtoField(logicalName = "코드조회 Vo ", physicalName = "codeNmList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.com.vo.FinCodeNmVo> codeNmList;

    @ElVoField(physicalName = "codeNmList")
    public java.util.List<kr.re.kitech.biz.fin.com.vo.FinCodeNmVo> getCodeNmList(){
        return codeNmList;
    }

    @ElVoField(physicalName = "codeNmList")
    public void setCodeNmList(java.util.List<kr.re.kitech.biz.fin.com.vo.FinCodeNmVo> codeNmList){
        this.codeNmList = codeNmList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinCodeNmListVo [");
        sb.append("codeNmList").append("=").append(codeNmList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; codeNmList != null && i < codeNmList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FinCodeNmVo vo = (kr.re.kitech.biz.fin.com.vo.FinCodeNmVo)codeNmList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; codeNmList != null && i < codeNmList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FinCodeNmVo vo = (kr.re.kitech.biz.fin.com.vo.FinCodeNmVo)codeNmList.get(i);
            vo._xStreamDec();	 
        }
    }


}
