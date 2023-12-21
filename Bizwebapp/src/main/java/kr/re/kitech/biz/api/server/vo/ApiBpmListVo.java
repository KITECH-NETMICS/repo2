package kr.re.kitech.biz.api.server.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "BPM 대응 요청/응답 리스트 객체")
public class ApiBpmListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ApiBpmListVo(){
    }

    @ElDtoField(logicalName = "BPM 대응 요청/응답 객체", physicalName = "apiBpmVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.api.server.vo.ApiBpmVo> apiBpmVo;

    @ElVoField(physicalName = "apiBpmVo")
    public java.util.List<kr.re.kitech.biz.api.server.vo.ApiBpmVo> getApiBpmVo(){
        return apiBpmVo;
    }

    @ElVoField(physicalName = "apiBpmVo")
    public void setApiBpmVo(java.util.List<kr.re.kitech.biz.api.server.vo.ApiBpmVo> apiBpmVo){
        this.apiBpmVo = apiBpmVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiBpmListVo [");
        sb.append("apiBpmVo").append("=").append(apiBpmVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; apiBpmVo != null && i < apiBpmVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiBpmVo vo = (kr.re.kitech.biz.api.server.vo.ApiBpmVo)apiBpmVo.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; apiBpmVo != null && i < apiBpmVo.size() ; i++ ) {
            kr.re.kitech.biz.api.server.vo.ApiBpmVo vo = (kr.re.kitech.biz.api.server.vo.ApiBpmVo)apiBpmVo.get(i);
            vo._xStreamDec();	 
        }
    }


}
