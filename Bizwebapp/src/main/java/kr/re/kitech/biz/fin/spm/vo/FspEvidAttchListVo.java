package kr.re.kitech.biz.fin.spm.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "전자증빙리스트 조회 Vo")
public class FspEvidAttchListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspEvidAttchListVo(){
    }

    @ElDtoField(logicalName = "전자증빙저장Vo", physicalName = "gridList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.com.vo.FspEvidAttachVo> gridList;

    @ElDtoField(logicalName = "전자증빙조회Vo", physicalName = "expnsEvidVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.com.vo.FbaExpnsEvidVo expnsEvidVo;

    @ElVoField(physicalName = "gridList")
    public java.util.List<kr.re.kitech.biz.fin.com.vo.FspEvidAttachVo> getGridList(){
        return gridList;
    }

    @ElVoField(physicalName = "gridList")
    public void setGridList(java.util.List<kr.re.kitech.biz.fin.com.vo.FspEvidAttachVo> gridList){
        this.gridList = gridList;
    }

    @ElVoField(physicalName = "expnsEvidVo")
    public kr.re.kitech.biz.fin.com.vo.FbaExpnsEvidVo getExpnsEvidVo(){
        return expnsEvidVo;
    }

    @ElVoField(physicalName = "expnsEvidVo")
    public void setExpnsEvidVo(kr.re.kitech.biz.fin.com.vo.FbaExpnsEvidVo expnsEvidVo){
        this.expnsEvidVo = expnsEvidVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspEvidAttchListVo [");
        sb.append("gridList").append("=").append(gridList).append(",");
        sb.append("expnsEvidVo").append("=").append(expnsEvidVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; gridList != null && i < gridList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FspEvidAttachVo vo = (kr.re.kitech.biz.fin.com.vo.FspEvidAttachVo)gridList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.expnsEvidVo != null ) this.expnsEvidVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; gridList != null && i < gridList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FspEvidAttachVo vo = (kr.re.kitech.biz.fin.com.vo.FspEvidAttachVo)gridList.get(i);
            vo._xStreamDec();	 
        }
        if( this.expnsEvidVo != null ) this.expnsEvidVo._xStreamDec();
    }


}
