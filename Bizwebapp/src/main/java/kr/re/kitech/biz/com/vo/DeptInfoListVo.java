package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "부서검색")
public class DeptInfoListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public DeptInfoListVo(){
    }

    @ElDtoField(logicalName = "부서검색List", physicalName = "deptInfoVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.com.vo.DeptInfoVo> deptInfoVoList;

    @ElVoField(physicalName = "deptInfoVoList")
    public java.util.List<kr.re.kitech.biz.com.vo.DeptInfoVo> getDeptInfoVoList(){
        return deptInfoVoList;
    }

    @ElVoField(physicalName = "deptInfoVoList")
    public void setDeptInfoVoList(java.util.List<kr.re.kitech.biz.com.vo.DeptInfoVo> deptInfoVoList){
        this.deptInfoVoList = deptInfoVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeptInfoListVo [");
        sb.append("deptInfoVoList").append("=").append(deptInfoVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; deptInfoVoList != null && i < deptInfoVoList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.DeptInfoVo vo = (kr.re.kitech.biz.com.vo.DeptInfoVo)deptInfoVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; deptInfoVoList != null && i < deptInfoVoList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.DeptInfoVo vo = (kr.re.kitech.biz.com.vo.DeptInfoVo)deptInfoVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
