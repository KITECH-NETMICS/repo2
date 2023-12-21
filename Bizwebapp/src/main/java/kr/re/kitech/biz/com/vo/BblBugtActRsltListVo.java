package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "예실정보마스터")
public class BblBugtActRsltListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public BblBugtActRsltListVo(){
    }

    @ElDtoField(logicalName = "예실팝업Vo", physicalName = "bblBugtActRsltVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.com.vo.BblBugtActRsltVo> bblBugtActRsltVoList;

    @ElVoField(physicalName = "bblBugtActRsltVoList")
    public java.util.List<kr.re.kitech.biz.com.vo.BblBugtActRsltVo> getBblBugtActRsltVoList(){
        return bblBugtActRsltVoList;
    }

    @ElVoField(physicalName = "bblBugtActRsltVoList")
    public void setBblBugtActRsltVoList(java.util.List<kr.re.kitech.biz.com.vo.BblBugtActRsltVo> bblBugtActRsltVoList){
        this.bblBugtActRsltVoList = bblBugtActRsltVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BblBugtActRsltListVo [");
        sb.append("bblBugtActRsltVoList").append("=").append(bblBugtActRsltVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; bblBugtActRsltVoList != null && i < bblBugtActRsltVoList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.BblBugtActRsltVo vo = (kr.re.kitech.biz.com.vo.BblBugtActRsltVo)bblBugtActRsltVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; bblBugtActRsltVoList != null && i < bblBugtActRsltVoList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.BblBugtActRsltVo vo = (kr.re.kitech.biz.com.vo.BblBugtActRsltVo)bblBugtActRsltVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
