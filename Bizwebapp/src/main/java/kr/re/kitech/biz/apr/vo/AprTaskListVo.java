package kr.re.kitech.biz.apr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "전달 프로세스 리스트")
public class AprTaskListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AprTaskListVo(){
    }

    @ElDtoField(logicalName = "아이디", physicalName = "empcode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String empcode;

    @ElDtoField(logicalName = "성명", physicalName = "empname", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String empname;

    @ElDtoField(logicalName = "테스크리스트", physicalName = "aprTaskVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.apr.vo.AprTaskVo> aprTaskVoList;

    @ElVoField(physicalName = "empcode")
    public String getEmpcode(){
        String ret = this.empcode;
        return ret;
    }

    @ElVoField(physicalName = "empcode")
    public void setEmpcode(String empcode){
        this.empcode = empcode;
    }

    @ElVoField(physicalName = "empname")
    public String getEmpname(){
        String ret = this.empname;
        return ret;
    }

    @ElVoField(physicalName = "empname")
    public void setEmpname(String empname){
        this.empname = empname;
    }

    @ElVoField(physicalName = "aprTaskVoList")
    public java.util.List<kr.re.kitech.biz.apr.vo.AprTaskVo> getAprTaskVoList(){
        return aprTaskVoList;
    }

    @ElVoField(physicalName = "aprTaskVoList")
    public void setAprTaskVoList(java.util.List<kr.re.kitech.biz.apr.vo.AprTaskVo> aprTaskVoList){
        this.aprTaskVoList = aprTaskVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AprTaskListVo [");
        sb.append("empcode").append("=").append(empcode).append(",");
        sb.append("empname").append("=").append(empname).append(",");
        sb.append("aprTaskVoList").append("=").append(aprTaskVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; aprTaskVoList != null && i < aprTaskVoList.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.AprTaskVo vo = (kr.re.kitech.biz.apr.vo.AprTaskVo)aprTaskVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; aprTaskVoList != null && i < aprTaskVoList.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.AprTaskVo vo = (kr.re.kitech.biz.apr.vo.AprTaskVo)aprTaskVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
