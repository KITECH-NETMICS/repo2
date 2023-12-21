package kr.re.kitech.biz.apr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "결재의견 리스트")
public class DocCommentsListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public DocCommentsListVo(){
    }

    @ElDtoField(logicalName = "결재의견", physicalName = "docCommentsVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.apr.vo.DocCommentsVo> docCommentsVo;

    @ElVoField(physicalName = "docCommentsVo")
    public java.util.List<kr.re.kitech.biz.apr.vo.DocCommentsVo> getDocCommentsVo(){
        return docCommentsVo;
    }

    @ElVoField(physicalName = "docCommentsVo")
    public void setDocCommentsVo(java.util.List<kr.re.kitech.biz.apr.vo.DocCommentsVo> docCommentsVo){
        this.docCommentsVo = docCommentsVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DocCommentsListVo [");
        sb.append("docCommentsVo").append("=").append(docCommentsVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; docCommentsVo != null && i < docCommentsVo.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.DocCommentsVo vo = (kr.re.kitech.biz.apr.vo.DocCommentsVo)docCommentsVo.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; docCommentsVo != null && i < docCommentsVo.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.DocCommentsVo vo = (kr.re.kitech.biz.apr.vo.DocCommentsVo)docCommentsVo.get(i);
            vo._xStreamDec();	 
        }
    }


}
