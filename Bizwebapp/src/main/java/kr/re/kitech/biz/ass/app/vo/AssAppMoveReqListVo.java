package kr.re.kitech.biz.ass.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "자산 이동신청 리스트 VO")
public class AssAppMoveReqListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AssAppMoveReqListVo(){
    }

    @ElDtoField(logicalName = "자산 이동신청 VO", physicalName = "assAppMoveReqVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ass.app.vo.AssAppMoveReqVo assAppMoveReqVo;

    @ElDtoField(logicalName = "자산 이동신청 상세 VO", physicalName = "assAppMoveReqDetailVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ass.app.vo.AssAppMoveReqDetailVo> assAppMoveReqDetailVoList;

    @ElVoField(physicalName = "assAppMoveReqVo")
    public kr.re.kitech.biz.ass.app.vo.AssAppMoveReqVo getAssAppMoveReqVo(){
        return assAppMoveReqVo;
    }

    @ElVoField(physicalName = "assAppMoveReqVo")
    public void setAssAppMoveReqVo(kr.re.kitech.biz.ass.app.vo.AssAppMoveReqVo assAppMoveReqVo){
        this.assAppMoveReqVo = assAppMoveReqVo;
    }

    @ElVoField(physicalName = "assAppMoveReqDetailVoList")
    public java.util.List<kr.re.kitech.biz.ass.app.vo.AssAppMoveReqDetailVo> getAssAppMoveReqDetailVoList(){
        return assAppMoveReqDetailVoList;
    }

    @ElVoField(physicalName = "assAppMoveReqDetailVoList")
    public void setAssAppMoveReqDetailVoList(java.util.List<kr.re.kitech.biz.ass.app.vo.AssAppMoveReqDetailVo> assAppMoveReqDetailVoList){
        this.assAppMoveReqDetailVoList = assAppMoveReqDetailVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AssAppMoveReqListVo [");
        sb.append("assAppMoveReqVo").append("=").append(assAppMoveReqVo).append(",");
        sb.append("assAppMoveReqDetailVoList").append("=").append(assAppMoveReqDetailVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.assAppMoveReqVo != null ) this.assAppMoveReqVo._xStreamEnc();
        for( int i=0 ; assAppMoveReqDetailVoList != null && i < assAppMoveReqDetailVoList.size() ; i++ ) {
            kr.re.kitech.biz.ass.app.vo.AssAppMoveReqDetailVo vo = (kr.re.kitech.biz.ass.app.vo.AssAppMoveReqDetailVo)assAppMoveReqDetailVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.assAppMoveReqVo != null ) this.assAppMoveReqVo._xStreamDec();
        for( int i=0 ; assAppMoveReqDetailVoList != null && i < assAppMoveReqDetailVoList.size() ; i++ ) {
            kr.re.kitech.biz.ass.app.vo.AssAppMoveReqDetailVo vo = (kr.re.kitech.biz.ass.app.vo.AssAppMoveReqDetailVo)assAppMoveReqDetailVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
