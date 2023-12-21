package kr.re.kitech.biz.pat.ppo.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatPpoMailSaveListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatPpoMailSaveListVo(){
    }

    @ElDtoField(logicalName = "ListVo", physicalName = "patPpoMailSaveVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo> patPpoMailSaveVoList;

    @ElDtoField(logicalName = "Vo", physicalName = "patPpoMailSaveVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo patPpoMailSaveVo;

    @ElDtoField(logicalName = "Vo", physicalName = "mstInfo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo mstInfo;

    @ElDtoField(logicalName = "Vo", physicalName = "mailInfo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo mailInfo;

    @ElDtoField(logicalName = "ListVo", physicalName = "userList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo> userList;

    @ElDtoField(logicalName = "ListVo", physicalName = "receiveList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo> receiveList;

    @ElDtoField(logicalName = "ListVo", physicalName = "referenceList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo> referenceList;

    @ElVoField(physicalName = "patPpoMailSaveVoList")
    public java.util.List<kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo> getPatPpoMailSaveVoList(){
        return patPpoMailSaveVoList;
    }

    @ElVoField(physicalName = "patPpoMailSaveVoList")
    public void setPatPpoMailSaveVoList(java.util.List<kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo> patPpoMailSaveVoList){
        this.patPpoMailSaveVoList = patPpoMailSaveVoList;
    }

    @ElVoField(physicalName = "patPpoMailSaveVo")
    public kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo getPatPpoMailSaveVo(){
        return patPpoMailSaveVo;
    }

    @ElVoField(physicalName = "patPpoMailSaveVo")
    public void setPatPpoMailSaveVo(kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo patPpoMailSaveVo){
        this.patPpoMailSaveVo = patPpoMailSaveVo;
    }

    @ElVoField(physicalName = "mstInfo")
    public kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo getMstInfo(){
        return mstInfo;
    }

    @ElVoField(physicalName = "mstInfo")
    public void setMstInfo(kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo mstInfo){
        this.mstInfo = mstInfo;
    }

    @ElVoField(physicalName = "mailInfo")
    public kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo getMailInfo(){
        return mailInfo;
    }

    @ElVoField(physicalName = "mailInfo")
    public void setMailInfo(kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo mailInfo){
        this.mailInfo = mailInfo;
    }

    @ElVoField(physicalName = "userList")
    public java.util.List<kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo> getUserList(){
        return userList;
    }

    @ElVoField(physicalName = "userList")
    public void setUserList(java.util.List<kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo> userList){
        this.userList = userList;
    }

    @ElVoField(physicalName = "receiveList")
    public java.util.List<kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo> getReceiveList(){
        return receiveList;
    }

    @ElVoField(physicalName = "receiveList")
    public void setReceiveList(java.util.List<kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo> receiveList){
        this.receiveList = receiveList;
    }

    @ElVoField(physicalName = "referenceList")
    public java.util.List<kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo> getReferenceList(){
        return referenceList;
    }

    @ElVoField(physicalName = "referenceList")
    public void setReferenceList(java.util.List<kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo> referenceList){
        this.referenceList = referenceList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatPpoMailSaveListVo [");
        sb.append("patPpoMailSaveVoList").append("=").append(patPpoMailSaveVoList).append(",");
        sb.append("patPpoMailSaveVo").append("=").append(patPpoMailSaveVo).append(",");
        sb.append("mstInfo").append("=").append(mstInfo).append(",");
        sb.append("mailInfo").append("=").append(mailInfo).append(",");
        sb.append("userList").append("=").append(userList).append(",");
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
        for( int i=0 ; patPpoMailSaveVoList != null && i < patPpoMailSaveVoList.size() ; i++ ) {
            kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo vo = (kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo)patPpoMailSaveVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.patPpoMailSaveVo != null ) this.patPpoMailSaveVo._xStreamEnc();
        if( this.mstInfo != null ) this.mstInfo._xStreamEnc();
        if( this.mailInfo != null ) this.mailInfo._xStreamEnc();
        for( int i=0 ; userList != null && i < userList.size() ; i++ ) {
            kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo vo = (kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo)userList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; receiveList != null && i < receiveList.size() ; i++ ) {
            kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo vo = (kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo)receiveList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; referenceList != null && i < referenceList.size() ; i++ ) {
            kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo vo = (kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo)referenceList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; patPpoMailSaveVoList != null && i < patPpoMailSaveVoList.size() ; i++ ) {
            kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo vo = (kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo)patPpoMailSaveVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.patPpoMailSaveVo != null ) this.patPpoMailSaveVo._xStreamDec();
        if( this.mstInfo != null ) this.mstInfo._xStreamDec();
        if( this.mailInfo != null ) this.mailInfo._xStreamDec();
        for( int i=0 ; userList != null && i < userList.size() ; i++ ) {
            kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo vo = (kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo)userList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; receiveList != null && i < receiveList.size() ; i++ ) {
            kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo vo = (kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo)receiveList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; referenceList != null && i < referenceList.size() ; i++ ) {
            kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo vo = (kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo)referenceList.get(i);
            vo._xStreamDec();	 
        }
    }


}
