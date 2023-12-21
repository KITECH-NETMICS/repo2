package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "회의실신청")
public class CgsMRoomReqListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CgsMRoomReqListVo(){
    }

    @ElDtoField(logicalName = "회의실신청리스트", physicalName = "cgsMRoomReqVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgsMRoomReqVo> cgsMRoomReqVoList;

    @ElDtoField(logicalName = "회의실신청건수", physicalName = "totalCount", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private long totalCount;

    @ElDtoField(logicalName = "회의실신청상세", physicalName = "cgsMRoomReqVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private kr.re.kitech.biz.ccs.cgs.vo.CgsMRoomReqVo cgsMRoomReqVo;

    @ElDtoField(logicalName = "재택근무신청", physicalName = "cgsCommVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private kr.re.kitech.biz.ccs.cgs.vo.CgsCommVo cgsCommVo;

    @ElVoField(physicalName = "cgsMRoomReqVoList")
    public java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgsMRoomReqVo> getCgsMRoomReqVoList(){
        return cgsMRoomReqVoList;
    }

    @ElVoField(physicalName = "cgsMRoomReqVoList")
    public void setCgsMRoomReqVoList(java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgsMRoomReqVo> cgsMRoomReqVoList){
        this.cgsMRoomReqVoList = cgsMRoomReqVoList;
    }

    @ElVoField(physicalName = "totalCount")
    public long getTotalCount(){
        return totalCount;
    }

    @ElVoField(physicalName = "totalCount")
    public void setTotalCount(long totalCount){
        this.totalCount = totalCount;
    }

    @ElVoField(physicalName = "cgsMRoomReqVo")
    public kr.re.kitech.biz.ccs.cgs.vo.CgsMRoomReqVo getCgsMRoomReqVo(){
        return cgsMRoomReqVo;
    }

    @ElVoField(physicalName = "cgsMRoomReqVo")
    public void setCgsMRoomReqVo(kr.re.kitech.biz.ccs.cgs.vo.CgsMRoomReqVo cgsMRoomReqVo){
        this.cgsMRoomReqVo = cgsMRoomReqVo;
    }

    @ElVoField(physicalName = "cgsCommVo")
    public kr.re.kitech.biz.ccs.cgs.vo.CgsCommVo getCgsCommVo(){
        return cgsCommVo;
    }

    @ElVoField(physicalName = "cgsCommVo")
    public void setCgsCommVo(kr.re.kitech.biz.ccs.cgs.vo.CgsCommVo cgsCommVo){
        this.cgsCommVo = cgsCommVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CgsMRoomReqListVo [");
        sb.append("cgsMRoomReqVoList").append("=").append(cgsMRoomReqVoList).append(",");
        sb.append("totalCount").append("=").append(totalCount).append(",");
        sb.append("cgsMRoomReqVo").append("=").append(cgsMRoomReqVo).append(",");
        sb.append("cgsCommVo").append("=").append(cgsCommVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; cgsMRoomReqVoList != null && i < cgsMRoomReqVoList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cgs.vo.CgsMRoomReqVo vo = (kr.re.kitech.biz.ccs.cgs.vo.CgsMRoomReqVo)cgsMRoomReqVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.cgsMRoomReqVo != null ) this.cgsMRoomReqVo._xStreamEnc();
        if( this.cgsCommVo != null ) this.cgsCommVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; cgsMRoomReqVoList != null && i < cgsMRoomReqVoList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cgs.vo.CgsMRoomReqVo vo = (kr.re.kitech.biz.ccs.cgs.vo.CgsMRoomReqVo)cgsMRoomReqVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.cgsMRoomReqVo != null ) this.cgsMRoomReqVo._xStreamDec();
        if( this.cgsCommVo != null ) this.cgsCommVo._xStreamDec();
    }


}
