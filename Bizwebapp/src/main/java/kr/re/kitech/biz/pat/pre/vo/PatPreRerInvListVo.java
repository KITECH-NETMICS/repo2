package kr.re.kitech.biz.pat.pre.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatPreRerInvListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatPreRerInvListVo(){
    }

    @ElDtoField(logicalName = "ListVo", physicalName = "patPreRerInvVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.pre.vo.PatPreRerInvVo> patPreRerInvVoList;

    @ElDtoField(logicalName = "Vo", physicalName = "patPreRerInvVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.pre.vo.PatPreRerInvVo patPreRerInvVo;

    @ElDtoField(logicalName = "Vo", physicalName = "patPreRecInvVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.pre.vo.PatPreRecInvVo patPreRecInvVo;

    @ElDtoField(logicalName = "Vo", physicalName = "patMastrVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.com.vo.PatMastrVo patMastrVo;

    @ElDtoField(logicalName = "Vo", physicalName = "patPreReqInvVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.pre.vo.PatPreReqInvVo patPreReqInvVo;

    @ElVoField(physicalName = "patPreRerInvVoList")
    public java.util.List<kr.re.kitech.biz.pat.pre.vo.PatPreRerInvVo> getPatPreRerInvVoList(){
        return patPreRerInvVoList;
    }

    @ElVoField(physicalName = "patPreRerInvVoList")
    public void setPatPreRerInvVoList(java.util.List<kr.re.kitech.biz.pat.pre.vo.PatPreRerInvVo> patPreRerInvVoList){
        this.patPreRerInvVoList = patPreRerInvVoList;
    }

    @ElVoField(physicalName = "patPreRerInvVo")
    public kr.re.kitech.biz.pat.pre.vo.PatPreRerInvVo getPatPreRerInvVo(){
        return patPreRerInvVo;
    }

    @ElVoField(physicalName = "patPreRerInvVo")
    public void setPatPreRerInvVo(kr.re.kitech.biz.pat.pre.vo.PatPreRerInvVo patPreRerInvVo){
        this.patPreRerInvVo = patPreRerInvVo;
    }

    @ElVoField(physicalName = "patPreRecInvVo")
    public kr.re.kitech.biz.pat.pre.vo.PatPreRecInvVo getPatPreRecInvVo(){
        return patPreRecInvVo;
    }

    @ElVoField(physicalName = "patPreRecInvVo")
    public void setPatPreRecInvVo(kr.re.kitech.biz.pat.pre.vo.PatPreRecInvVo patPreRecInvVo){
        this.patPreRecInvVo = patPreRecInvVo;
    }

    @ElVoField(physicalName = "patMastrVo")
    public kr.re.kitech.biz.pat.com.vo.PatMastrVo getPatMastrVo(){
        return patMastrVo;
    }

    @ElVoField(physicalName = "patMastrVo")
    public void setPatMastrVo(kr.re.kitech.biz.pat.com.vo.PatMastrVo patMastrVo){
        this.patMastrVo = patMastrVo;
    }

    @ElVoField(physicalName = "patPreReqInvVo")
    public kr.re.kitech.biz.pat.pre.vo.PatPreReqInvVo getPatPreReqInvVo(){
        return patPreReqInvVo;
    }

    @ElVoField(physicalName = "patPreReqInvVo")
    public void setPatPreReqInvVo(kr.re.kitech.biz.pat.pre.vo.PatPreReqInvVo patPreReqInvVo){
        this.patPreReqInvVo = patPreReqInvVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatPreRerInvListVo [");
        sb.append("patPreRerInvVoList").append("=").append(patPreRerInvVoList).append(",");
        sb.append("patPreRerInvVo").append("=").append(patPreRerInvVo).append(",");
        sb.append("patPreRecInvVo").append("=").append(patPreRecInvVo).append(",");
        sb.append("patMastrVo").append("=").append(patMastrVo).append(",");
        sb.append("patPreReqInvVo").append("=").append(patPreReqInvVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; patPreRerInvVoList != null && i < patPreRerInvVoList.size() ; i++ ) {
            kr.re.kitech.biz.pat.pre.vo.PatPreRerInvVo vo = (kr.re.kitech.biz.pat.pre.vo.PatPreRerInvVo)patPreRerInvVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.patPreRerInvVo != null ) this.patPreRerInvVo._xStreamEnc();
        if( this.patPreRecInvVo != null ) this.patPreRecInvVo._xStreamEnc();
        if( this.patMastrVo != null ) this.patMastrVo._xStreamEnc();
        if( this.patPreReqInvVo != null ) this.patPreReqInvVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; patPreRerInvVoList != null && i < patPreRerInvVoList.size() ; i++ ) {
            kr.re.kitech.biz.pat.pre.vo.PatPreRerInvVo vo = (kr.re.kitech.biz.pat.pre.vo.PatPreRerInvVo)patPreRerInvVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.patPreRerInvVo != null ) this.patPreRerInvVo._xStreamDec();
        if( this.patPreRecInvVo != null ) this.patPreRecInvVo._xStreamDec();
        if( this.patMastrVo != null ) this.patMastrVo._xStreamDec();
        if( this.patPreReqInvVo != null ) this.patPreReqInvVo._xStreamDec();
    }


}
