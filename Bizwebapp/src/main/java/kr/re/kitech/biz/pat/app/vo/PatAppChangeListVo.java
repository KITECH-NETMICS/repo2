package kr.re.kitech.biz.pat.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatAppChangeListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatAppChangeListVo(){
    }

    @ElDtoField(logicalName = "ListVo", physicalName = "patAppChangeVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.app.vo.PatAppChangeVo> patAppChangeVoList;

    @ElDtoField(logicalName = "Vo", physicalName = "patAppChangeVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.app.vo.PatAppChangeVo patAppChangeVo;

    @ElDtoField(logicalName = "Vo", physicalName = "hisdata", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.app.vo.PatAppChangeVo hisdata;

    @ElDtoField(logicalName = "Vo", physicalName = "save", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.app.vo.PatAppChangeVo save;

    @ElDtoField(logicalName = "Vo", physicalName = "core", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.app.vo.PatAppChangeVo core;

    @ElDtoField(logicalName = "ListVo", physicalName = "after", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.app.vo.PatAppChangeVo> after;

    @ElDtoField(logicalName = "ListVo", physicalName = "before", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.app.vo.PatAppChangeVo> before;

    @ElDtoField(logicalName = "ListVo", physicalName = "saveList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.app.vo.PatAppChangeVo> saveList;

    @ElDtoField(logicalName = "ListVo", physicalName = "bfSaveList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.app.vo.PatAppChangeVo> bfSaveList;

    @ElDtoField(logicalName = "ListVo", physicalName = "deleteList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.app.vo.PatAppChangeVo> deleteList;

    @ElVoField(physicalName = "patAppChangeVoList")
    public java.util.List<kr.re.kitech.biz.pat.app.vo.PatAppChangeVo> getPatAppChangeVoList(){
        return patAppChangeVoList;
    }

    @ElVoField(physicalName = "patAppChangeVoList")
    public void setPatAppChangeVoList(java.util.List<kr.re.kitech.biz.pat.app.vo.PatAppChangeVo> patAppChangeVoList){
        this.patAppChangeVoList = patAppChangeVoList;
    }

    @ElVoField(physicalName = "patAppChangeVo")
    public kr.re.kitech.biz.pat.app.vo.PatAppChangeVo getPatAppChangeVo(){
        return patAppChangeVo;
    }

    @ElVoField(physicalName = "patAppChangeVo")
    public void setPatAppChangeVo(kr.re.kitech.biz.pat.app.vo.PatAppChangeVo patAppChangeVo){
        this.patAppChangeVo = patAppChangeVo;
    }

    @ElVoField(physicalName = "hisdata")
    public kr.re.kitech.biz.pat.app.vo.PatAppChangeVo getHisdata(){
        return hisdata;
    }

    @ElVoField(physicalName = "hisdata")
    public void setHisdata(kr.re.kitech.biz.pat.app.vo.PatAppChangeVo hisdata){
        this.hisdata = hisdata;
    }

    @ElVoField(physicalName = "save")
    public kr.re.kitech.biz.pat.app.vo.PatAppChangeVo getSave(){
        return save;
    }

    @ElVoField(physicalName = "save")
    public void setSave(kr.re.kitech.biz.pat.app.vo.PatAppChangeVo save){
        this.save = save;
    }

    @ElVoField(physicalName = "core")
    public kr.re.kitech.biz.pat.app.vo.PatAppChangeVo getCore(){
        return core;
    }

    @ElVoField(physicalName = "core")
    public void setCore(kr.re.kitech.biz.pat.app.vo.PatAppChangeVo core){
        this.core = core;
    }

    @ElVoField(physicalName = "after")
    public java.util.List<kr.re.kitech.biz.pat.app.vo.PatAppChangeVo> getAfter(){
        return after;
    }

    @ElVoField(physicalName = "after")
    public void setAfter(java.util.List<kr.re.kitech.biz.pat.app.vo.PatAppChangeVo> after){
        this.after = after;
    }

    @ElVoField(physicalName = "before")
    public java.util.List<kr.re.kitech.biz.pat.app.vo.PatAppChangeVo> getBefore(){
        return before;
    }

    @ElVoField(physicalName = "before")
    public void setBefore(java.util.List<kr.re.kitech.biz.pat.app.vo.PatAppChangeVo> before){
        this.before = before;
    }

    @ElVoField(physicalName = "saveList")
    public java.util.List<kr.re.kitech.biz.pat.app.vo.PatAppChangeVo> getSaveList(){
        return saveList;
    }

    @ElVoField(physicalName = "saveList")
    public void setSaveList(java.util.List<kr.re.kitech.biz.pat.app.vo.PatAppChangeVo> saveList){
        this.saveList = saveList;
    }

    @ElVoField(physicalName = "bfSaveList")
    public java.util.List<kr.re.kitech.biz.pat.app.vo.PatAppChangeVo> getBfSaveList(){
        return bfSaveList;
    }

    @ElVoField(physicalName = "bfSaveList")
    public void setBfSaveList(java.util.List<kr.re.kitech.biz.pat.app.vo.PatAppChangeVo> bfSaveList){
        this.bfSaveList = bfSaveList;
    }

    @ElVoField(physicalName = "deleteList")
    public java.util.List<kr.re.kitech.biz.pat.app.vo.PatAppChangeVo> getDeleteList(){
        return deleteList;
    }

    @ElVoField(physicalName = "deleteList")
    public void setDeleteList(java.util.List<kr.re.kitech.biz.pat.app.vo.PatAppChangeVo> deleteList){
        this.deleteList = deleteList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatAppChangeListVo [");
        sb.append("patAppChangeVoList").append("=").append(patAppChangeVoList).append(",");
        sb.append("patAppChangeVo").append("=").append(patAppChangeVo).append(",");
        sb.append("hisdata").append("=").append(hisdata).append(",");
        sb.append("save").append("=").append(save).append(",");
        sb.append("core").append("=").append(core).append(",");
        sb.append("after").append("=").append(after).append(",");
        sb.append("before").append("=").append(before).append(",");
        sb.append("saveList").append("=").append(saveList).append(",");
        sb.append("bfSaveList").append("=").append(bfSaveList).append(",");
        sb.append("deleteList").append("=").append(deleteList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; patAppChangeVoList != null && i < patAppChangeVoList.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatAppChangeVo vo = (kr.re.kitech.biz.pat.app.vo.PatAppChangeVo)patAppChangeVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.patAppChangeVo != null ) this.patAppChangeVo._xStreamEnc();
        if( this.hisdata != null ) this.hisdata._xStreamEnc();
        if( this.save != null ) this.save._xStreamEnc();
        if( this.core != null ) this.core._xStreamEnc();
        for( int i=0 ; after != null && i < after.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatAppChangeVo vo = (kr.re.kitech.biz.pat.app.vo.PatAppChangeVo)after.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; before != null && i < before.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatAppChangeVo vo = (kr.re.kitech.biz.pat.app.vo.PatAppChangeVo)before.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; saveList != null && i < saveList.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatAppChangeVo vo = (kr.re.kitech.biz.pat.app.vo.PatAppChangeVo)saveList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; bfSaveList != null && i < bfSaveList.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatAppChangeVo vo = (kr.re.kitech.biz.pat.app.vo.PatAppChangeVo)bfSaveList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; deleteList != null && i < deleteList.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatAppChangeVo vo = (kr.re.kitech.biz.pat.app.vo.PatAppChangeVo)deleteList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; patAppChangeVoList != null && i < patAppChangeVoList.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatAppChangeVo vo = (kr.re.kitech.biz.pat.app.vo.PatAppChangeVo)patAppChangeVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.patAppChangeVo != null ) this.patAppChangeVo._xStreamDec();
        if( this.hisdata != null ) this.hisdata._xStreamDec();
        if( this.save != null ) this.save._xStreamDec();
        if( this.core != null ) this.core._xStreamDec();
        for( int i=0 ; after != null && i < after.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatAppChangeVo vo = (kr.re.kitech.biz.pat.app.vo.PatAppChangeVo)after.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; before != null && i < before.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatAppChangeVo vo = (kr.re.kitech.biz.pat.app.vo.PatAppChangeVo)before.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; saveList != null && i < saveList.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatAppChangeVo vo = (kr.re.kitech.biz.pat.app.vo.PatAppChangeVo)saveList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; bfSaveList != null && i < bfSaveList.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatAppChangeVo vo = (kr.re.kitech.biz.pat.app.vo.PatAppChangeVo)bfSaveList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; deleteList != null && i < deleteList.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatAppChangeVo vo = (kr.re.kitech.biz.pat.app.vo.PatAppChangeVo)deleteList.get(i);
            vo._xStreamDec();	 
        }
    }


}
