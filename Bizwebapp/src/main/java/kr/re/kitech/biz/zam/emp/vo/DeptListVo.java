package kr.re.kitech.biz.zam.emp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "부서List 정보")
public class DeptListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public DeptListVo(){
    }

    @ElDtoField(logicalName = "부서List", physicalName = "deptVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.zam.emp.vo.DeptVo> deptVoList;

    @ElVoField(physicalName = "deptVoList")
    public java.util.List<kr.re.kitech.biz.zam.emp.vo.DeptVo> getDeptVoList(){
        return deptVoList;
    }

    @ElVoField(physicalName = "deptVoList")
    public void setDeptVoList(java.util.List<kr.re.kitech.biz.zam.emp.vo.DeptVo> deptVoList){
        this.deptVoList = deptVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeptListVo [");
        sb.append("deptVoList").append("=").append(deptVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; deptVoList != null && i < deptVoList.size() ; i++ ) {
            kr.re.kitech.biz.zam.emp.vo.DeptVo vo = (kr.re.kitech.biz.zam.emp.vo.DeptVo)deptVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; deptVoList != null && i < deptVoList.size() ; i++ ) {
            kr.re.kitech.biz.zam.emp.vo.DeptVo vo = (kr.re.kitech.biz.zam.emp.vo.DeptVo)deptVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
