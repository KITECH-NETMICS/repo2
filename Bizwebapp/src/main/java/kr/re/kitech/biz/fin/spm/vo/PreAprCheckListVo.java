package kr.re.kitech.biz.fin.spm.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "결의서 결재신청전 체크 사항 리스트 Vo")
public class PreAprCheckListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PreAprCheckListVo(){
    }

    @ElDtoField(logicalName = "결재신청시 체크 Vo", physicalName = "checkList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.spm.vo.PreAprCheckVo> checkList;

    @ElVoField(physicalName = "checkList")
    public java.util.List<kr.re.kitech.biz.fin.spm.vo.PreAprCheckVo> getCheckList(){
        return checkList;
    }

    @ElVoField(physicalName = "checkList")
    public void setCheckList(java.util.List<kr.re.kitech.biz.fin.spm.vo.PreAprCheckVo> checkList){
        this.checkList = checkList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PreAprCheckListVo [");
        sb.append("checkList").append("=").append(checkList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; checkList != null && i < checkList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spm.vo.PreAprCheckVo vo = (kr.re.kitech.biz.fin.spm.vo.PreAprCheckVo)checkList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; checkList != null && i < checkList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spm.vo.PreAprCheckVo vo = (kr.re.kitech.biz.fin.spm.vo.PreAprCheckVo)checkList.get(i);
            vo._xStreamDec();	 
        }
    }


}
