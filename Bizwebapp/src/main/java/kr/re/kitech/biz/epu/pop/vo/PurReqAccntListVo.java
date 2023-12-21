package kr.re.kitech.biz.epu.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "구매계정내역 리스트 Vo")
public class PurReqAccntListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PurReqAccntListVo(){
    }

    @ElDtoField(logicalName = "구매요구 계정내역 Vo", physicalName = "accntList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.epu.req.vo.PurReqAccntVo> accntList;

    @ElVoField(physicalName = "accntList")
    public java.util.List<kr.re.kitech.biz.epu.req.vo.PurReqAccntVo> getAccntList(){
        return accntList;
    }

    @ElVoField(physicalName = "accntList")
    public void setAccntList(java.util.List<kr.re.kitech.biz.epu.req.vo.PurReqAccntVo> accntList){
        this.accntList = accntList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurReqAccntListVo [");
        sb.append("accntList").append("=").append(accntList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; accntList != null && i < accntList.size() ; i++ ) {
            kr.re.kitech.biz.epu.req.vo.PurReqAccntVo vo = (kr.re.kitech.biz.epu.req.vo.PurReqAccntVo)accntList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; accntList != null && i < accntList.size() ; i++ ) {
            kr.re.kitech.biz.epu.req.vo.PurReqAccntVo vo = (kr.re.kitech.biz.epu.req.vo.PurReqAccntVo)accntList.get(i);
            vo._xStreamDec();	 
        }
    }


}
