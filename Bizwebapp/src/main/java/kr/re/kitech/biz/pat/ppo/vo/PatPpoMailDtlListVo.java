package kr.re.kitech.biz.pat.ppo.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatPpoMailDtlListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatPpoMailDtlListVo(){
    }

    @ElDtoField(logicalName = "ListVo", physicalName = "patPpoMailDtlVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlVo> patPpoMailDtlVoList;

    @ElDtoField(logicalName = "Vo", physicalName = "patPpoMailDtlVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlVo patPpoMailDtlVo;

    @ElDtoField(logicalName = "Vo", physicalName = "mailInfo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlVo mailInfo;

    @ElDtoField(logicalName = "ListVo", physicalName = "receiveList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlVo> receiveList;

    @ElDtoField(logicalName = "ListVo", physicalName = "referenceList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlVo> referenceList;

    @ElVoField(physicalName = "patPpoMailDtlVoList")
    public java.util.List<kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlVo> getPatPpoMailDtlVoList(){
        return patPpoMailDtlVoList;
    }

    @ElVoField(physicalName = "patPpoMailDtlVoList")
    public void setPatPpoMailDtlVoList(java.util.List<kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlVo> patPpoMailDtlVoList){
        this.patPpoMailDtlVoList = patPpoMailDtlVoList;
    }

    @ElVoField(physicalName = "patPpoMailDtlVo")
    public kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlVo getPatPpoMailDtlVo(){
        return patPpoMailDtlVo;
    }

    @ElVoField(physicalName = "patPpoMailDtlVo")
    public void setPatPpoMailDtlVo(kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlVo patPpoMailDtlVo){
        this.patPpoMailDtlVo = patPpoMailDtlVo;
    }

    @ElVoField(physicalName = "mailInfo")
    public kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlVo getMailInfo(){
        return mailInfo;
    }

    @ElVoField(physicalName = "mailInfo")
    public void setMailInfo(kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlVo mailInfo){
        this.mailInfo = mailInfo;
    }

    @ElVoField(physicalName = "receiveList")
    public java.util.List<kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlVo> getReceiveList(){
        return receiveList;
    }

    @ElVoField(physicalName = "receiveList")
    public void setReceiveList(java.util.List<kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlVo> receiveList){
        this.receiveList = receiveList;
    }

    @ElVoField(physicalName = "referenceList")
    public java.util.List<kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlVo> getReferenceList(){
        return referenceList;
    }

    @ElVoField(physicalName = "referenceList")
    public void setReferenceList(java.util.List<kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlVo> referenceList){
        this.referenceList = referenceList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatPpoMailDtlListVo [");
        sb.append("patPpoMailDtlVoList").append("=").append(patPpoMailDtlVoList).append(",");
        sb.append("patPpoMailDtlVo").append("=").append(patPpoMailDtlVo).append(",");
        sb.append("mailInfo").append("=").append(mailInfo).append(",");
        sb.append("receiveList").append("=").append(receiveList).append(",");
        sb.append("referenceList").append("=").append(referenceList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; patPpoMailDtlVoList != null && i < patPpoMailDtlVoList.size() ; i++ ) {
            kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlVo vo = (kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlVo)patPpoMailDtlVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.patPpoMailDtlVo != null ) this.patPpoMailDtlVo._xStreamEnc();
        if( this.mailInfo != null ) this.mailInfo._xStreamEnc();
        for( int i=0 ; receiveList != null && i < receiveList.size() ; i++ ) {
            kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlVo vo = (kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlVo)receiveList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; referenceList != null && i < referenceList.size() ; i++ ) {
            kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlVo vo = (kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlVo)referenceList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; patPpoMailDtlVoList != null && i < patPpoMailDtlVoList.size() ; i++ ) {
            kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlVo vo = (kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlVo)patPpoMailDtlVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.patPpoMailDtlVo != null ) this.patPpoMailDtlVo._xStreamDec();
        if( this.mailInfo != null ) this.mailInfo._xStreamDec();
        for( int i=0 ; receiveList != null && i < receiveList.size() ; i++ ) {
            kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlVo vo = (kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlVo)receiveList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; referenceList != null && i < referenceList.size() ; i++ ) {
            kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlVo vo = (kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlVo)referenceList.get(i);
            vo._xStreamDec();	 
        }
    }


}
