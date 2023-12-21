package kr.re.kitech.biz.pat.psr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatPsrInquiryManageListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatPsrInquiryManageListVo(){
    }

    @ElDtoField(logicalName = "ListVo", physicalName = "patPsrInquiryManageVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> patPsrInquiryManageVoList;

    @ElDtoField(logicalName = "Vo", physicalName = "patPsrInquiryManageVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo patPsrInquiryManageVo;

    @ElDtoField(logicalName = "Vo", physicalName = "patBasicInfo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo patBasicInfo;

    @ElDtoField(logicalName = "Vo", physicalName = "patManagerInfo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo patManagerInfo;

    @ElDtoField(logicalName = "ListVo", physicalName = "patInventInfo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> patInventInfo;

    @ElDtoField(logicalName = "ListVo", physicalName = "patCoVendInfo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> patCoVendInfo;

    @ElDtoField(logicalName = "ListVo", physicalName = "patInventorInfo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> patInventorInfo;

    @ElDtoField(logicalName = "ListVo", physicalName = "patPrjInfo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> patPrjInfo;

    @ElDtoField(logicalName = "ListVo", physicalName = "patPriorInfo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> patPriorInfo;

    @ElDtoField(logicalName = "ListVo", physicalName = "patDivdeInfo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> patDivdeInfo;

    @ElDtoField(logicalName = "Vo", physicalName = "patAppInfo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo patAppInfo;

    @ElDtoField(logicalName = "ListVo", physicalName = "patAppHistory", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> patAppHistory;

    @ElDtoField(logicalName = "Vo", physicalName = "patRegInfo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo patRegInfo;

    @ElDtoField(logicalName = "ListVo", physicalName = "patDemndLst", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> patDemndLst;

    @ElDtoField(logicalName = "ListVo", physicalName = "patOaLst", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> patOaLst;

    @ElDtoField(logicalName = "ListVo", physicalName = "grid01", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> grid01;

    @ElDtoField(logicalName = "ListVo", physicalName = "grid02", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> grid02;

    @ElDtoField(logicalName = "ListVo", physicalName = "grid03", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> grid03;

    @ElDtoField(logicalName = "ListVo", physicalName = "grid04", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> grid04;

    @ElDtoField(logicalName = "ListVo", physicalName = "grid05", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> grid05;

    @ElVoField(physicalName = "patPsrInquiryManageVoList")
    public java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> getPatPsrInquiryManageVoList(){
        return patPsrInquiryManageVoList;
    }

    @ElVoField(physicalName = "patPsrInquiryManageVoList")
    public void setPatPsrInquiryManageVoList(java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> patPsrInquiryManageVoList){
        this.patPsrInquiryManageVoList = patPsrInquiryManageVoList;
    }

    @ElVoField(physicalName = "patPsrInquiryManageVo")
    public kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo getPatPsrInquiryManageVo(){
        return patPsrInquiryManageVo;
    }

    @ElVoField(physicalName = "patPsrInquiryManageVo")
    public void setPatPsrInquiryManageVo(kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo patPsrInquiryManageVo){
        this.patPsrInquiryManageVo = patPsrInquiryManageVo;
    }

    @ElVoField(physicalName = "patBasicInfo")
    public kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo getPatBasicInfo(){
        return patBasicInfo;
    }

    @ElVoField(physicalName = "patBasicInfo")
    public void setPatBasicInfo(kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo patBasicInfo){
        this.patBasicInfo = patBasicInfo;
    }

    @ElVoField(physicalName = "patManagerInfo")
    public kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo getPatManagerInfo(){
        return patManagerInfo;
    }

    @ElVoField(physicalName = "patManagerInfo")
    public void setPatManagerInfo(kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo patManagerInfo){
        this.patManagerInfo = patManagerInfo;
    }

    @ElVoField(physicalName = "patInventInfo")
    public java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> getPatInventInfo(){
        return patInventInfo;
    }

    @ElVoField(physicalName = "patInventInfo")
    public void setPatInventInfo(java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> patInventInfo){
        this.patInventInfo = patInventInfo;
    }

    @ElVoField(physicalName = "patCoVendInfo")
    public java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> getPatCoVendInfo(){
        return patCoVendInfo;
    }

    @ElVoField(physicalName = "patCoVendInfo")
    public void setPatCoVendInfo(java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> patCoVendInfo){
        this.patCoVendInfo = patCoVendInfo;
    }

    @ElVoField(physicalName = "patInventorInfo")
    public java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> getPatInventorInfo(){
        return patInventorInfo;
    }

    @ElVoField(physicalName = "patInventorInfo")
    public void setPatInventorInfo(java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> patInventorInfo){
        this.patInventorInfo = patInventorInfo;
    }

    @ElVoField(physicalName = "patPrjInfo")
    public java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> getPatPrjInfo(){
        return patPrjInfo;
    }

    @ElVoField(physicalName = "patPrjInfo")
    public void setPatPrjInfo(java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> patPrjInfo){
        this.patPrjInfo = patPrjInfo;
    }

    @ElVoField(physicalName = "patPriorInfo")
    public java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> getPatPriorInfo(){
        return patPriorInfo;
    }

    @ElVoField(physicalName = "patPriorInfo")
    public void setPatPriorInfo(java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> patPriorInfo){
        this.patPriorInfo = patPriorInfo;
    }

    @ElVoField(physicalName = "patDivdeInfo")
    public java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> getPatDivdeInfo(){
        return patDivdeInfo;
    }

    @ElVoField(physicalName = "patDivdeInfo")
    public void setPatDivdeInfo(java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> patDivdeInfo){
        this.patDivdeInfo = patDivdeInfo;
    }

    @ElVoField(physicalName = "patAppInfo")
    public kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo getPatAppInfo(){
        return patAppInfo;
    }

    @ElVoField(physicalName = "patAppInfo")
    public void setPatAppInfo(kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo patAppInfo){
        this.patAppInfo = patAppInfo;
    }

    @ElVoField(physicalName = "patAppHistory")
    public java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> getPatAppHistory(){
        return patAppHistory;
    }

    @ElVoField(physicalName = "patAppHistory")
    public void setPatAppHistory(java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> patAppHistory){
        this.patAppHistory = patAppHistory;
    }

    @ElVoField(physicalName = "patRegInfo")
    public kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo getPatRegInfo(){
        return patRegInfo;
    }

    @ElVoField(physicalName = "patRegInfo")
    public void setPatRegInfo(kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo patRegInfo){
        this.patRegInfo = patRegInfo;
    }

    @ElVoField(physicalName = "patDemndLst")
    public java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> getPatDemndLst(){
        return patDemndLst;
    }

    @ElVoField(physicalName = "patDemndLst")
    public void setPatDemndLst(java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> patDemndLst){
        this.patDemndLst = patDemndLst;
    }

    @ElVoField(physicalName = "patOaLst")
    public java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> getPatOaLst(){
        return patOaLst;
    }

    @ElVoField(physicalName = "patOaLst")
    public void setPatOaLst(java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> patOaLst){
        this.patOaLst = patOaLst;
    }

    @ElVoField(physicalName = "grid01")
    public java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> getGrid01(){
        return grid01;
    }

    @ElVoField(physicalName = "grid01")
    public void setGrid01(java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> grid01){
        this.grid01 = grid01;
    }

    @ElVoField(physicalName = "grid02")
    public java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> getGrid02(){
        return grid02;
    }

    @ElVoField(physicalName = "grid02")
    public void setGrid02(java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> grid02){
        this.grid02 = grid02;
    }

    @ElVoField(physicalName = "grid03")
    public java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> getGrid03(){
        return grid03;
    }

    @ElVoField(physicalName = "grid03")
    public void setGrid03(java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> grid03){
        this.grid03 = grid03;
    }

    @ElVoField(physicalName = "grid04")
    public java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> getGrid04(){
        return grid04;
    }

    @ElVoField(physicalName = "grid04")
    public void setGrid04(java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> grid04){
        this.grid04 = grid04;
    }

    @ElVoField(physicalName = "grid05")
    public java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> getGrid05(){
        return grid05;
    }

    @ElVoField(physicalName = "grid05")
    public void setGrid05(java.util.List<kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo> grid05){
        this.grid05 = grid05;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatPsrInquiryManageListVo [");
        sb.append("patPsrInquiryManageVoList").append("=").append(patPsrInquiryManageVoList).append(",");
        sb.append("patPsrInquiryManageVo").append("=").append(patPsrInquiryManageVo).append(",");
        sb.append("patBasicInfo").append("=").append(patBasicInfo).append(",");
        sb.append("patManagerInfo").append("=").append(patManagerInfo).append(",");
        sb.append("patInventInfo").append("=").append(patInventInfo).append(",");
        sb.append("patCoVendInfo").append("=").append(patCoVendInfo).append(",");
        sb.append("patInventorInfo").append("=").append(patInventorInfo).append(",");
        sb.append("patPrjInfo").append("=").append(patPrjInfo).append(",");
        sb.append("patPriorInfo").append("=").append(patPriorInfo).append(",");
        sb.append("patDivdeInfo").append("=").append(patDivdeInfo).append(",");
        sb.append("patAppInfo").append("=").append(patAppInfo).append(",");
        sb.append("patAppHistory").append("=").append(patAppHistory).append(",");
        sb.append("patRegInfo").append("=").append(patRegInfo).append(",");
        sb.append("patDemndLst").append("=").append(patDemndLst).append(",");
        sb.append("patOaLst").append("=").append(patOaLst).append(",");
        sb.append("grid01").append("=").append(grid01).append(",");
        sb.append("grid02").append("=").append(grid02).append(",");
        sb.append("grid03").append("=").append(grid03).append(",");
        sb.append("grid04").append("=").append(grid04).append(",");
        sb.append("grid05").append("=").append(grid05);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; patPsrInquiryManageVoList != null && i < patPsrInquiryManageVoList.size() ; i++ ) {
            kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo)patPsrInquiryManageVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.patPsrInquiryManageVo != null ) this.patPsrInquiryManageVo._xStreamEnc();
        if( this.patBasicInfo != null ) this.patBasicInfo._xStreamEnc();
        if( this.patManagerInfo != null ) this.patManagerInfo._xStreamEnc();
        for( int i=0 ; patInventInfo != null && i < patInventInfo.size() ; i++ ) {
            kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo)patInventInfo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; patCoVendInfo != null && i < patCoVendInfo.size() ; i++ ) {
            kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo)patCoVendInfo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; patInventorInfo != null && i < patInventorInfo.size() ; i++ ) {
            kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo)patInventorInfo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; patPrjInfo != null && i < patPrjInfo.size() ; i++ ) {
            kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo)patPrjInfo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; patPriorInfo != null && i < patPriorInfo.size() ; i++ ) {
            kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo)patPriorInfo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; patDivdeInfo != null && i < patDivdeInfo.size() ; i++ ) {
            kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo)patDivdeInfo.get(i);
            vo._xStreamEnc();	 
        }
        if( this.patAppInfo != null ) this.patAppInfo._xStreamEnc();
        for( int i=0 ; patAppHistory != null && i < patAppHistory.size() ; i++ ) {
            kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo)patAppHistory.get(i);
            vo._xStreamEnc();	 
        }
        if( this.patRegInfo != null ) this.patRegInfo._xStreamEnc();
        for( int i=0 ; patDemndLst != null && i < patDemndLst.size() ; i++ ) {
            kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo)patDemndLst.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; patOaLst != null && i < patOaLst.size() ; i++ ) {
            kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo)patOaLst.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; grid01 != null && i < grid01.size() ; i++ ) {
            kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo)grid01.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; grid02 != null && i < grid02.size() ; i++ ) {
            kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo)grid02.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; grid03 != null && i < grid03.size() ; i++ ) {
            kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo)grid03.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; grid04 != null && i < grid04.size() ; i++ ) {
            kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo)grid04.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; grid05 != null && i < grid05.size() ; i++ ) {
            kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo)grid05.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; patPsrInquiryManageVoList != null && i < patPsrInquiryManageVoList.size() ; i++ ) {
            kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo)patPsrInquiryManageVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.patPsrInquiryManageVo != null ) this.patPsrInquiryManageVo._xStreamDec();
        if( this.patBasicInfo != null ) this.patBasicInfo._xStreamDec();
        if( this.patManagerInfo != null ) this.patManagerInfo._xStreamDec();
        for( int i=0 ; patInventInfo != null && i < patInventInfo.size() ; i++ ) {
            kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo)patInventInfo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; patCoVendInfo != null && i < patCoVendInfo.size() ; i++ ) {
            kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo)patCoVendInfo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; patInventorInfo != null && i < patInventorInfo.size() ; i++ ) {
            kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo)patInventorInfo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; patPrjInfo != null && i < patPrjInfo.size() ; i++ ) {
            kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo)patPrjInfo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; patPriorInfo != null && i < patPriorInfo.size() ; i++ ) {
            kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo)patPriorInfo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; patDivdeInfo != null && i < patDivdeInfo.size() ; i++ ) {
            kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo)patDivdeInfo.get(i);
            vo._xStreamDec();	 
        }
        if( this.patAppInfo != null ) this.patAppInfo._xStreamDec();
        for( int i=0 ; patAppHistory != null && i < patAppHistory.size() ; i++ ) {
            kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo)patAppHistory.get(i);
            vo._xStreamDec();	 
        }
        if( this.patRegInfo != null ) this.patRegInfo._xStreamDec();
        for( int i=0 ; patDemndLst != null && i < patDemndLst.size() ; i++ ) {
            kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo)patDemndLst.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; patOaLst != null && i < patOaLst.size() ; i++ ) {
            kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo)patOaLst.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; grid01 != null && i < grid01.size() ; i++ ) {
            kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo)grid01.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; grid02 != null && i < grid02.size() ; i++ ) {
            kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo)grid02.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; grid03 != null && i < grid03.size() ; i++ ) {
            kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo)grid03.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; grid04 != null && i < grid04.size() ; i++ ) {
            kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo)grid04.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; grid05 != null && i < grid05.size() ; i++ ) {
            kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo vo = (kr.re.kitech.biz.pat.psr.vo.PatPsrInquiryManageVo)grid05.get(i);
            vo._xStreamDec();	 
        }
    }


}
