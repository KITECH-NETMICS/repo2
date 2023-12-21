package kr.re.kitech.biz.fin.tax.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "매출계산서 리스트 Vo")
public class FtxBillHListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FtxBillHListVo(){
    }

    @ElDtoField(logicalName = "매출계산서 헤더 Vo", physicalName = "billList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.tax.vo.FtxBillHVo> billList;

    @ElVoField(physicalName = "billList")
    public java.util.List<kr.re.kitech.biz.fin.tax.vo.FtxBillHVo> getBillList(){
        return billList;
    }

    @ElVoField(physicalName = "billList")
    public void setBillList(java.util.List<kr.re.kitech.biz.fin.tax.vo.FtxBillHVo> billList){
        this.billList = billList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FtxBillHListVo [");
        sb.append("billList").append("=").append(billList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; billList != null && i < billList.size() ; i++ ) {
            kr.re.kitech.biz.fin.tax.vo.FtxBillHVo vo = (kr.re.kitech.biz.fin.tax.vo.FtxBillHVo)billList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; billList != null && i < billList.size() ; i++ ) {
            kr.re.kitech.biz.fin.tax.vo.FtxBillHVo vo = (kr.re.kitech.biz.fin.tax.vo.FtxBillHVo)billList.get(i);
            vo._xStreamDec();	 
        }
    }


}
