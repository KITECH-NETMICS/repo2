package kr.re.kitech.biz.uss.bas.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "IP신청 조회 및 저장용 Vo")
public class ComBasIpReqFormVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ComBasIpReqFormVo(){
    }

    @ElDtoField(logicalName = "IP신청 자산Vo", physicalName = "comBasIPReqAssVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.uss.bas.vo.ComBasIPReqAssVo> comBasIPReqAssVoList;

    @ElDtoField(logicalName = "IP신청 Vo", physicalName = "comBasIPReqVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.uss.bas.vo.ComBasIPReqVo comBasIPReqVo;

    @ElVoField(physicalName = "comBasIPReqAssVoList")
    public java.util.List<kr.re.kitech.biz.uss.bas.vo.ComBasIPReqAssVo> getComBasIPReqAssVoList(){
        return comBasIPReqAssVoList;
    }

    @ElVoField(physicalName = "comBasIPReqAssVoList")
    public void setComBasIPReqAssVoList(java.util.List<kr.re.kitech.biz.uss.bas.vo.ComBasIPReqAssVo> comBasIPReqAssVoList){
        this.comBasIPReqAssVoList = comBasIPReqAssVoList;
    }

    @ElVoField(physicalName = "comBasIPReqVo")
    public kr.re.kitech.biz.uss.bas.vo.ComBasIPReqVo getComBasIPReqVo(){
        return comBasIPReqVo;
    }

    @ElVoField(physicalName = "comBasIPReqVo")
    public void setComBasIPReqVo(kr.re.kitech.biz.uss.bas.vo.ComBasIPReqVo comBasIPReqVo){
        this.comBasIPReqVo = comBasIPReqVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ComBasIpReqFormVo [");
        sb.append("comBasIPReqAssVoList").append("=").append(comBasIPReqAssVoList).append(",");
        sb.append("comBasIPReqVo").append("=").append(comBasIPReqVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; comBasIPReqAssVoList != null && i < comBasIPReqAssVoList.size() ; i++ ) {
            kr.re.kitech.biz.uss.bas.vo.ComBasIPReqAssVo vo = (kr.re.kitech.biz.uss.bas.vo.ComBasIPReqAssVo)comBasIPReqAssVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.comBasIPReqVo != null ) this.comBasIPReqVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; comBasIPReqAssVoList != null && i < comBasIPReqAssVoList.size() ; i++ ) {
            kr.re.kitech.biz.uss.bas.vo.ComBasIPReqAssVo vo = (kr.re.kitech.biz.uss.bas.vo.ComBasIPReqAssVo)comBasIPReqAssVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.comBasIPReqVo != null ) this.comBasIPReqVo._xStreamDec();
    }


}
