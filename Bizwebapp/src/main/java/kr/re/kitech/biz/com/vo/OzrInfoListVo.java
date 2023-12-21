package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "레포트출력 정보 리스트 Vo")
public class OzrInfoListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public OzrInfoListVo(){
    }

    @ElDtoField(logicalName = "레포트 정보 Vo", physicalName = "ozrInfoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.com.vo.OzrInFoVo> ozrInfoList;

    @ElVoField(physicalName = "ozrInfoList")
    public java.util.List<kr.re.kitech.biz.com.vo.OzrInFoVo> getOzrInfoList(){
        return ozrInfoList;
    }

    @ElVoField(physicalName = "ozrInfoList")
    public void setOzrInfoList(java.util.List<kr.re.kitech.biz.com.vo.OzrInFoVo> ozrInfoList){
        this.ozrInfoList = ozrInfoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OzrInfoListVo [");
        sb.append("ozrInfoList").append("=").append(ozrInfoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; ozrInfoList != null && i < ozrInfoList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.OzrInFoVo vo = (kr.re.kitech.biz.com.vo.OzrInFoVo)ozrInfoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; ozrInfoList != null && i < ozrInfoList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.OzrInFoVo vo = (kr.re.kitech.biz.com.vo.OzrInFoVo)ozrInfoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
