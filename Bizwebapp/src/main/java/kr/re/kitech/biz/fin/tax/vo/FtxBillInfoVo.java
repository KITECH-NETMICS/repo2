package kr.re.kitech.biz.fin.tax.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "매출계산서 등록팝업 조회 Vo")
public class FtxBillInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FtxBillInfoVo(){
    }

    @ElDtoField(logicalName = "매출계산서 세부내역 Vo", physicalName = "billDList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.tax.vo.FtxBillDVo> billDList;

    @ElDtoField(logicalName = "매출수정계산서카운트 Vo", physicalName = "billCntVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.tax.vo.FtxBillCntVo billCntVo;

    @ElDtoField(logicalName = "매출계산서 헤더 Vo", physicalName = "billHVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.tax.vo.FtxBillHVo billHVo;

    @ElVoField(physicalName = "billDList")
    public java.util.List<kr.re.kitech.biz.fin.tax.vo.FtxBillDVo> getBillDList(){
        return billDList;
    }

    @ElVoField(physicalName = "billDList")
    public void setBillDList(java.util.List<kr.re.kitech.biz.fin.tax.vo.FtxBillDVo> billDList){
        this.billDList = billDList;
    }

    @ElVoField(physicalName = "billCntVo")
    public kr.re.kitech.biz.fin.tax.vo.FtxBillCntVo getBillCntVo(){
        return billCntVo;
    }

    @ElVoField(physicalName = "billCntVo")
    public void setBillCntVo(kr.re.kitech.biz.fin.tax.vo.FtxBillCntVo billCntVo){
        this.billCntVo = billCntVo;
    }

    @ElVoField(physicalName = "billHVo")
    public kr.re.kitech.biz.fin.tax.vo.FtxBillHVo getBillHVo(){
        return billHVo;
    }

    @ElVoField(physicalName = "billHVo")
    public void setBillHVo(kr.re.kitech.biz.fin.tax.vo.FtxBillHVo billHVo){
        this.billHVo = billHVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FtxBillInfoVo [");
        sb.append("billDList").append("=").append(billDList).append(",");
        sb.append("billCntVo").append("=").append(billCntVo).append(",");
        sb.append("billHVo").append("=").append(billHVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; billDList != null && i < billDList.size() ; i++ ) {
            kr.re.kitech.biz.fin.tax.vo.FtxBillDVo vo = (kr.re.kitech.biz.fin.tax.vo.FtxBillDVo)billDList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.billCntVo != null ) this.billCntVo._xStreamEnc();
        if( this.billHVo != null ) this.billHVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; billDList != null && i < billDList.size() ; i++ ) {
            kr.re.kitech.biz.fin.tax.vo.FtxBillDVo vo = (kr.re.kitech.biz.fin.tax.vo.FtxBillDVo)billDList.get(i);
            vo._xStreamDec();	 
        }
        if( this.billCntVo != null ) this.billCntVo._xStreamDec();
        if( this.billHVo != null ) this.billHVo._xStreamDec();
    }


}
