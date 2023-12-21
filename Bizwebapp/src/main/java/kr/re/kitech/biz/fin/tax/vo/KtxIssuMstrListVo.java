package kr.re.kitech.biz.fin.tax.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "매입계산서 리스트 Vo")
public class KtxIssuMstrListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public KtxIssuMstrListVo(){
    }

    @ElDtoField(logicalName = "계산서 공통 Vo", physicalName = "ktxIssuList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrComVo> ktxIssuList;

    @ElVoField(physicalName = "ktxIssuList")
    public java.util.List<kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrComVo> getKtxIssuList(){
        return ktxIssuList;
    }

    @ElVoField(physicalName = "ktxIssuList")
    public void setKtxIssuList(java.util.List<kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrComVo> ktxIssuList){
        this.ktxIssuList = ktxIssuList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KtxIssuMstrListVo [");
        sb.append("ktxIssuList").append("=").append(ktxIssuList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; ktxIssuList != null && i < ktxIssuList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrComVo vo = (kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrComVo)ktxIssuList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; ktxIssuList != null && i < ktxIssuList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrComVo vo = (kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrComVo)ktxIssuList.get(i);
            vo._xStreamDec();	 
        }
    }


}
