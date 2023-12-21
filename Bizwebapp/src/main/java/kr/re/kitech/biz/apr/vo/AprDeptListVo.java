package kr.re.kitech.biz.apr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "개인 결재선 리스트")
public class AprDeptListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AprDeptListVo(){
    }

    @ElDtoField(logicalName = "결재 부서 검색", physicalName = "aprDeptListVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.apr.vo.AprDeptVo> aprDeptListVo;

    @ElVoField(physicalName = "aprDeptListVo")
    public java.util.List<kr.re.kitech.biz.apr.vo.AprDeptVo> getAprDeptListVo(){
        return aprDeptListVo;
    }

    @ElVoField(physicalName = "aprDeptListVo")
    public void setAprDeptListVo(java.util.List<kr.re.kitech.biz.apr.vo.AprDeptVo> aprDeptListVo){
        this.aprDeptListVo = aprDeptListVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AprDeptListVo [");
        sb.append("aprDeptListVo").append("=").append(aprDeptListVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; aprDeptListVo != null && i < aprDeptListVo.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.AprDeptVo vo = (kr.re.kitech.biz.apr.vo.AprDeptVo)aprDeptListVo.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; aprDeptListVo != null && i < aprDeptListVo.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.AprDeptVo vo = (kr.re.kitech.biz.apr.vo.AprDeptVo)aprDeptListVo.get(i);
            vo._xStreamDec();	 
        }
    }


}
