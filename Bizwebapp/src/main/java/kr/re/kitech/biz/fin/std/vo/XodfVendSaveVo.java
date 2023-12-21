package kr.re.kitech.biz.fin.std.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "거래처정보 저장 Vo")
public class XodfVendSaveVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public XodfVendSaveVo(){
    }

    @ElDtoField(logicalName = "거래처정보 Vo", physicalName = "vendVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.std.vo.XodfVendVo vendVo;

    @ElDtoField(logicalName = "거래처담당자 Vo", physicalName = "jobList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.std.vo.XodfVendJobVo> jobList;

    @ElDtoField(logicalName = "거래처계좌 Vo", physicalName = "accntList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.std.vo.XodfVendAccntVo> accntList;

    @ElVoField(physicalName = "vendVo")
    public kr.re.kitech.biz.fin.std.vo.XodfVendVo getVendVo(){
        return vendVo;
    }

    @ElVoField(physicalName = "vendVo")
    public void setVendVo(kr.re.kitech.biz.fin.std.vo.XodfVendVo vendVo){
        this.vendVo = vendVo;
    }

    @ElVoField(physicalName = "jobList")
    public java.util.List<kr.re.kitech.biz.fin.std.vo.XodfVendJobVo> getJobList(){
        return jobList;
    }

    @ElVoField(physicalName = "jobList")
    public void setJobList(java.util.List<kr.re.kitech.biz.fin.std.vo.XodfVendJobVo> jobList){
        this.jobList = jobList;
    }

    @ElVoField(physicalName = "accntList")
    public java.util.List<kr.re.kitech.biz.fin.std.vo.XodfVendAccntVo> getAccntList(){
        return accntList;
    }

    @ElVoField(physicalName = "accntList")
    public void setAccntList(java.util.List<kr.re.kitech.biz.fin.std.vo.XodfVendAccntVo> accntList){
        this.accntList = accntList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("XodfVendSaveVo [");
        sb.append("vendVo").append("=").append(vendVo).append(",");
        sb.append("jobList").append("=").append(jobList).append(",");
        sb.append("accntList").append("=").append(accntList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.vendVo != null ) this.vendVo._xStreamEnc();
        for( int i=0 ; jobList != null && i < jobList.size() ; i++ ) {
            kr.re.kitech.biz.fin.std.vo.XodfVendJobVo vo = (kr.re.kitech.biz.fin.std.vo.XodfVendJobVo)jobList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; accntList != null && i < accntList.size() ; i++ ) {
            kr.re.kitech.biz.fin.std.vo.XodfVendAccntVo vo = (kr.re.kitech.biz.fin.std.vo.XodfVendAccntVo)accntList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.vendVo != null ) this.vendVo._xStreamDec();
        for( int i=0 ; jobList != null && i < jobList.size() ; i++ ) {
            kr.re.kitech.biz.fin.std.vo.XodfVendJobVo vo = (kr.re.kitech.biz.fin.std.vo.XodfVendJobVo)jobList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; accntList != null && i < accntList.size() ; i++ ) {
            kr.re.kitech.biz.fin.std.vo.XodfVendAccntVo vo = (kr.re.kitech.biz.fin.std.vo.XodfVendAccntVo)accntList.get(i);
            vo._xStreamDec();	 
        }
    }


}
