package kr.re.kitech.biz.api.server.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "포털 대응 요청/응답 객체")
public class ApiEipVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ApiEipVo(){
    }

    @ElDtoField(logicalName = "사번", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String syspayno;

    @ElDtoField(logicalName = "부서코드", physicalName = "deptCd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String deptCd;

    @ElDtoField(logicalName = "문서함", physicalName = "aprWorkVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.apr.vo.AprWorkVo> aprWorkVoList;

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        String ret = this.syspayno;
        return ret;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "deptCd")
    public String getDeptCd(){
        String ret = this.deptCd;
        return ret;
    }

    @ElVoField(physicalName = "deptCd")
    public void setDeptCd(String deptCd){
        this.deptCd = deptCd;
    }

    @ElVoField(physicalName = "aprWorkVoList")
    public java.util.List<kr.re.kitech.biz.apr.vo.AprWorkVo> getAprWorkVoList(){
        return aprWorkVoList;
    }

    @ElVoField(physicalName = "aprWorkVoList")
    public void setAprWorkVoList(java.util.List<kr.re.kitech.biz.apr.vo.AprWorkVo> aprWorkVoList){
        this.aprWorkVoList = aprWorkVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiEipVo [");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("deptCd").append("=").append(deptCd).append(",");
        sb.append("aprWorkVoList").append("=").append(aprWorkVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; aprWorkVoList != null && i < aprWorkVoList.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.AprWorkVo vo = (kr.re.kitech.biz.apr.vo.AprWorkVo)aprWorkVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; aprWorkVoList != null && i < aprWorkVoList.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.AprWorkVo vo = (kr.re.kitech.biz.apr.vo.AprWorkVo)aprWorkVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
