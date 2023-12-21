package kr.re.kitech.biz.fin.spm.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "On-Line 가수반제 회계코드 조회 Vo")
public class FspRamtCreatListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspRamtCreatListVo(){
    }

    @ElDtoField(logicalName = "잔액생성Vo", physicalName = "ramtList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.spm.vo.FspRamtCreatVo> ramtList;

    @ElVoField(physicalName = "ramtList")
    public java.util.List<kr.re.kitech.biz.fin.spm.vo.FspRamtCreatVo> getRamtList(){
        return ramtList;
    }

    @ElVoField(physicalName = "ramtList")
    public void setRamtList(java.util.List<kr.re.kitech.biz.fin.spm.vo.FspRamtCreatVo> ramtList){
        this.ramtList = ramtList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspRamtCreatListVo [");
        sb.append("ramtList").append("=").append(ramtList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; ramtList != null && i < ramtList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spm.vo.FspRamtCreatVo vo = (kr.re.kitech.biz.fin.spm.vo.FspRamtCreatVo)ramtList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; ramtList != null && i < ramtList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spm.vo.FspRamtCreatVo vo = (kr.re.kitech.biz.fin.spm.vo.FspRamtCreatVo)ramtList.get(i);
            vo._xStreamDec();	 
        }
    }


}
