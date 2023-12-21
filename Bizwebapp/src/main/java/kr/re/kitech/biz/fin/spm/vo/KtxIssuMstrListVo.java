package kr.re.kitech.biz.fin.spm.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "계산서내역 조회 Vo")
public class KtxIssuMstrListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public KtxIssuMstrListVo(){
    }

    @ElDtoField(logicalName = "매입계산서 Vo", physicalName = "billList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrVo> billList;

    @ElVoField(physicalName = "billList")
    public java.util.List<kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrVo> getBillList(){
        return billList;
    }

    @ElVoField(physicalName = "billList")
    public void setBillList(java.util.List<kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrVo> billList){
        this.billList = billList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KtxIssuMstrListVo [");
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
            kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrVo vo = (kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrVo)billList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; billList != null && i < billList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrVo vo = (kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrVo)billList.get(i);
            vo._xStreamDec();	 
        }
    }


}
