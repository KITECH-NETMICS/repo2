package kr.re.kitech.biz.fin.spm.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "일반결의 조회 Vo")
public class GenrlSlipVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public GenrlSlipVo(){
    }

    @ElDtoField(logicalName = "결의서헤더VO", physicalName = "hVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.com.vo.FspSlipHVo hVo;

    @ElDtoField(logicalName = "결의서디테일VO", physicalName = "drList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.com.vo.FspSlipDVo> drList;

    @ElDtoField(logicalName = "결의서디테일VO", physicalName = "crList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.com.vo.FspSlipDVo> crList;

    @ElVoField(physicalName = "hVo")
    public kr.re.kitech.biz.fin.com.vo.FspSlipHVo getHVo(){
        return hVo;
    }

    @ElVoField(physicalName = "hVo")
    public void setHVo(kr.re.kitech.biz.fin.com.vo.FspSlipHVo hVo){
        this.hVo = hVo;
    }

    @ElVoField(physicalName = "drList")
    public java.util.List<kr.re.kitech.biz.fin.com.vo.FspSlipDVo> getDrList(){
        return drList;
    }

    @ElVoField(physicalName = "drList")
    public void setDrList(java.util.List<kr.re.kitech.biz.fin.com.vo.FspSlipDVo> drList){
        this.drList = drList;
    }

    @ElVoField(physicalName = "crList")
    public java.util.List<kr.re.kitech.biz.fin.com.vo.FspSlipDVo> getCrList(){
        return crList;
    }

    @ElVoField(physicalName = "crList")
    public void setCrList(java.util.List<kr.re.kitech.biz.fin.com.vo.FspSlipDVo> crList){
        this.crList = crList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GenrlSlipVo [");
        sb.append("hVo").append("=").append(hVo).append(",");
        sb.append("drList").append("=").append(drList).append(",");
        sb.append("crList").append("=").append(crList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.hVo != null ) this.hVo._xStreamEnc();
        for( int i=0 ; drList != null && i < drList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FspSlipDVo vo = (kr.re.kitech.biz.fin.com.vo.FspSlipDVo)drList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; crList != null && i < crList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FspSlipDVo vo = (kr.re.kitech.biz.fin.com.vo.FspSlipDVo)crList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.hVo != null ) this.hVo._xStreamDec();
        for( int i=0 ; drList != null && i < drList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FspSlipDVo vo = (kr.re.kitech.biz.fin.com.vo.FspSlipDVo)drList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; crList != null && i < crList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FspSlipDVo vo = (kr.re.kitech.biz.fin.com.vo.FspSlipDVo)crList.get(i);
            vo._xStreamDec();	 
        }
    }


}
