package kr.re.kitech.biz.epu.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "계정번호마스터")
public class ProdItemListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ProdItemListVo(){
    }

    @ElDtoField(logicalName = "품목코드Vo", physicalName = "dataListVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.epu.pop.vo.ProdItemVo> dataListVo;

    @ElVoField(physicalName = "dataListVo")
    public java.util.List<kr.re.kitech.biz.epu.pop.vo.ProdItemVo> getDataListVo(){
        return dataListVo;
    }

    @ElVoField(physicalName = "dataListVo")
    public void setDataListVo(java.util.List<kr.re.kitech.biz.epu.pop.vo.ProdItemVo> dataListVo){
        this.dataListVo = dataListVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProdItemListVo [");
        sb.append("dataListVo").append("=").append(dataListVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; dataListVo != null && i < dataListVo.size() ; i++ ) {
            kr.re.kitech.biz.epu.pop.vo.ProdItemVo vo = (kr.re.kitech.biz.epu.pop.vo.ProdItemVo)dataListVo.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; dataListVo != null && i < dataListVo.size() ; i++ ) {
            kr.re.kitech.biz.epu.pop.vo.ProdItemVo vo = (kr.re.kitech.biz.epu.pop.vo.ProdItemVo)dataListVo.get(i);
            vo._xStreamDec();	 
        }
    }


}
