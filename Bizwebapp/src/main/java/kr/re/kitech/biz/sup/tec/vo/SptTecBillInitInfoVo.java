package kr.re.kitech.biz.sup.tec.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "외부기술지원 계산서 최초정보 Vo")
public class SptTecBillInitInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptTecBillInitInfoVo(){
    }

    @ElDtoField(logicalName = "기술지원 계산서발행 공급받는자 Vo", physicalName = "chrgList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.sup.tec.vo.SptTecBillBuyrChrgVo> chrgList;

    @ElDtoField(logicalName = "매출계산서 세부내역 Vo", physicalName = "billDList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.tax.vo.FtxBillDVo> billDList;

    @ElVoField(physicalName = "chrgList")
    public java.util.List<kr.re.kitech.biz.sup.tec.vo.SptTecBillBuyrChrgVo> getChrgList(){
        return chrgList;
    }

    @ElVoField(physicalName = "chrgList")
    public void setChrgList(java.util.List<kr.re.kitech.biz.sup.tec.vo.SptTecBillBuyrChrgVo> chrgList){
        this.chrgList = chrgList;
    }

    @ElVoField(physicalName = "billDList")
    public java.util.List<kr.re.kitech.biz.fin.tax.vo.FtxBillDVo> getBillDList(){
        return billDList;
    }

    @ElVoField(physicalName = "billDList")
    public void setBillDList(java.util.List<kr.re.kitech.biz.fin.tax.vo.FtxBillDVo> billDList){
        this.billDList = billDList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptTecBillInitInfoVo [");
        sb.append("chrgList").append("=").append(chrgList).append(",");
        sb.append("billDList").append("=").append(billDList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; chrgList != null && i < chrgList.size() ; i++ ) {
            kr.re.kitech.biz.sup.tec.vo.SptTecBillBuyrChrgVo vo = (kr.re.kitech.biz.sup.tec.vo.SptTecBillBuyrChrgVo)chrgList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; billDList != null && i < billDList.size() ; i++ ) {
            kr.re.kitech.biz.fin.tax.vo.FtxBillDVo vo = (kr.re.kitech.biz.fin.tax.vo.FtxBillDVo)billDList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; chrgList != null && i < chrgList.size() ; i++ ) {
            kr.re.kitech.biz.sup.tec.vo.SptTecBillBuyrChrgVo vo = (kr.re.kitech.biz.sup.tec.vo.SptTecBillBuyrChrgVo)chrgList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; billDList != null && i < billDList.size() ; i++ ) {
            kr.re.kitech.biz.fin.tax.vo.FtxBillDVo vo = (kr.re.kitech.biz.fin.tax.vo.FtxBillDVo)billDList.get(i);
            vo._xStreamDec();	 
        }
    }


}
