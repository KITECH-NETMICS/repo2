package kr.re.kitech.biz.epu.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "견적서 리스트 Vo")
public class PurReqEvalListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PurReqEvalListVo(){
    }

    @ElDtoField(logicalName = "견적서 Vo", physicalName = "evalList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.epu.pop.vo.PurReqEvalVo> evalList;

    @ElVoField(physicalName = "evalList")
    public java.util.List<kr.re.kitech.biz.epu.pop.vo.PurReqEvalVo> getEvalList(){
        return evalList;
    }

    @ElVoField(physicalName = "evalList")
    public void setEvalList(java.util.List<kr.re.kitech.biz.epu.pop.vo.PurReqEvalVo> evalList){
        this.evalList = evalList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurReqEvalListVo [");
        sb.append("evalList").append("=").append(evalList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; evalList != null && i < evalList.size() ; i++ ) {
            kr.re.kitech.biz.epu.pop.vo.PurReqEvalVo vo = (kr.re.kitech.biz.epu.pop.vo.PurReqEvalVo)evalList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; evalList != null && i < evalList.size() ; i++ ) {
            kr.re.kitech.biz.epu.pop.vo.PurReqEvalVo vo = (kr.re.kitech.biz.epu.pop.vo.PurReqEvalVo)evalList.get(i);
            vo._xStreamDec();	 
        }
    }


}
