package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "학술대회 Pool 이력 리스트 Vo")
public class ResConfPoolReqListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResConfPoolReqListVo(){
    }

    @ElDtoField(logicalName = "학술대회참가신청Vo", physicalName = "poolList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.res.std.vo.ResConfPoolReqVo> poolList;

    @ElVoField(physicalName = "poolList")
    public java.util.List<kr.re.kitech.biz.res.std.vo.ResConfPoolReqVo> getPoolList(){
        return poolList;
    }

    @ElVoField(physicalName = "poolList")
    public void setPoolList(java.util.List<kr.re.kitech.biz.res.std.vo.ResConfPoolReqVo> poolList){
        this.poolList = poolList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResConfPoolReqListVo [");
        sb.append("poolList").append("=").append(poolList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; poolList != null && i < poolList.size() ; i++ ) {
            kr.re.kitech.biz.res.std.vo.ResConfPoolReqVo vo = (kr.re.kitech.biz.res.std.vo.ResConfPoolReqVo)poolList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; poolList != null && i < poolList.size() ; i++ ) {
            kr.re.kitech.biz.res.std.vo.ResConfPoolReqVo vo = (kr.re.kitech.biz.res.std.vo.ResConfPoolReqVo)poolList.get(i);
            vo._xStreamDec();	 
        }
    }


}
