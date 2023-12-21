package kr.re.kitech.biz.res.apc.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "사업신청 선정평가 위원회 List Vo")
public class ResApcCmtListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResApcCmtListVo(){
    }

    @ElDtoField(logicalName = "사업신청 선정평가 위원회 Vo List", physicalName = "cmittList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.res.apc.vo.ResApcCmtVo> cmittList;

    @ElVoField(physicalName = "cmittList")
    public java.util.List<kr.re.kitech.biz.res.apc.vo.ResApcCmtVo> getCmittList(){
        return cmittList;
    }

    @ElVoField(physicalName = "cmittList")
    public void setCmittList(java.util.List<kr.re.kitech.biz.res.apc.vo.ResApcCmtVo> cmittList){
        this.cmittList = cmittList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResApcCmtListVo [");
        sb.append("cmittList").append("=").append(cmittList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; cmittList != null && i < cmittList.size() ; i++ ) {
            kr.re.kitech.biz.res.apc.vo.ResApcCmtVo vo = (kr.re.kitech.biz.res.apc.vo.ResApcCmtVo)cmittList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; cmittList != null && i < cmittList.size() ; i++ ) {
            kr.re.kitech.biz.res.apc.vo.ResApcCmtVo vo = (kr.re.kitech.biz.res.apc.vo.ResApcCmtVo)cmittList.get(i);
            vo._xStreamDec();	 
        }
    }


}
