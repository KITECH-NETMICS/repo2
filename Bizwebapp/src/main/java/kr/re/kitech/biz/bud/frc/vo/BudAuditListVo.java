package kr.re.kitech.biz.bud.frc.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "budAuditList Vo")
public class BudAuditListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public BudAuditListVo(){
    }

    @ElDtoField(logicalName = "BudAuditVo List", physicalName = "budAuditVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.bud.frc.vo.BudAuditVo> budAuditVoList;

    @ElVoField(physicalName = "budAuditVoList")
    public java.util.List<kr.re.kitech.biz.bud.frc.vo.BudAuditVo> getBudAuditVoList(){
        return budAuditVoList;
    }

    @ElVoField(physicalName = "budAuditVoList")
    public void setBudAuditVoList(java.util.List<kr.re.kitech.biz.bud.frc.vo.BudAuditVo> budAuditVoList){
        this.budAuditVoList = budAuditVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BudAuditListVo [");
        sb.append("budAuditVoList").append("=").append(budAuditVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; budAuditVoList != null && i < budAuditVoList.size() ; i++ ) {
            kr.re.kitech.biz.bud.frc.vo.BudAuditVo vo = (kr.re.kitech.biz.bud.frc.vo.BudAuditVo)budAuditVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; budAuditVoList != null && i < budAuditVoList.size() ; i++ ) {
            kr.re.kitech.biz.bud.frc.vo.BudAuditVo vo = (kr.re.kitech.biz.bud.frc.vo.BudAuditVo)budAuditVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
