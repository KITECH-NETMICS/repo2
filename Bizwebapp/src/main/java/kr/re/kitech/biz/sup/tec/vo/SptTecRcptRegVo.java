package kr.re.kitech.biz.sup.tec.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "외부기술지원(유상)등록내역 Vo")
public class SptTecRcptRegVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptTecRcptRegVo(){
    }

    @ElDtoField(logicalName = "기술지원접수정보 Vo", physicalName = "detlVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.sup.tec.vo.SptTecRcptDetlVo detlVo;

    @ElDtoField(logicalName = "기술지원실적정보 Vo", physicalName = "rsltList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.sup.tec.vo.SptTecActRsltVo> rsltList;

    @ElDtoField(logicalName = "기술지원장비사용실적정보 Vo", physicalName = "equipList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.sup.tec.vo.SptTecEquipRsltVo> equipList;

    @ElDtoField(logicalName = "기업지원고객정보 Vo", physicalName = "custVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.sup.cus.vo.SptCustBaseInfoVo custVo;

    @ElDtoField(logicalName = "기업지원 카드결재내역 Vo", physicalName = "applVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.sup.tec.vo.SptApplTableVo applVo;

    @ElVoField(physicalName = "detlVo")
    public kr.re.kitech.biz.sup.tec.vo.SptTecRcptDetlVo getDetlVo(){
        return detlVo;
    }

    @ElVoField(physicalName = "detlVo")
    public void setDetlVo(kr.re.kitech.biz.sup.tec.vo.SptTecRcptDetlVo detlVo){
        this.detlVo = detlVo;
    }

    @ElVoField(physicalName = "rsltList")
    public java.util.List<kr.re.kitech.biz.sup.tec.vo.SptTecActRsltVo> getRsltList(){
        return rsltList;
    }

    @ElVoField(physicalName = "rsltList")
    public void setRsltList(java.util.List<kr.re.kitech.biz.sup.tec.vo.SptTecActRsltVo> rsltList){
        this.rsltList = rsltList;
    }

    @ElVoField(physicalName = "equipList")
    public java.util.List<kr.re.kitech.biz.sup.tec.vo.SptTecEquipRsltVo> getEquipList(){
        return equipList;
    }

    @ElVoField(physicalName = "equipList")
    public void setEquipList(java.util.List<kr.re.kitech.biz.sup.tec.vo.SptTecEquipRsltVo> equipList){
        this.equipList = equipList;
    }

    @ElVoField(physicalName = "custVo")
    public kr.re.kitech.biz.sup.cus.vo.SptCustBaseInfoVo getCustVo(){
        return custVo;
    }

    @ElVoField(physicalName = "custVo")
    public void setCustVo(kr.re.kitech.biz.sup.cus.vo.SptCustBaseInfoVo custVo){
        this.custVo = custVo;
    }

    @ElVoField(physicalName = "applVo")
    public kr.re.kitech.biz.sup.tec.vo.SptApplTableVo getApplVo(){
        return applVo;
    }

    @ElVoField(physicalName = "applVo")
    public void setApplVo(kr.re.kitech.biz.sup.tec.vo.SptApplTableVo applVo){
        this.applVo = applVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptTecRcptRegVo [");
        sb.append("detlVo").append("=").append(detlVo).append(",");
        sb.append("rsltList").append("=").append(rsltList).append(",");
        sb.append("equipList").append("=").append(equipList).append(",");
        sb.append("custVo").append("=").append(custVo).append(",");
        sb.append("applVo").append("=").append(applVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.detlVo != null ) this.detlVo._xStreamEnc();
        for( int i=0 ; rsltList != null && i < rsltList.size() ; i++ ) {
            kr.re.kitech.biz.sup.tec.vo.SptTecActRsltVo vo = (kr.re.kitech.biz.sup.tec.vo.SptTecActRsltVo)rsltList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; equipList != null && i < equipList.size() ; i++ ) {
            kr.re.kitech.biz.sup.tec.vo.SptTecEquipRsltVo vo = (kr.re.kitech.biz.sup.tec.vo.SptTecEquipRsltVo)equipList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.custVo != null ) this.custVo._xStreamEnc();
        if( this.applVo != null ) this.applVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        if( this.detlVo != null ) this.detlVo._xStreamDec();
        for( int i=0 ; rsltList != null && i < rsltList.size() ; i++ ) {
            kr.re.kitech.biz.sup.tec.vo.SptTecActRsltVo vo = (kr.re.kitech.biz.sup.tec.vo.SptTecActRsltVo)rsltList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; equipList != null && i < equipList.size() ; i++ ) {
            kr.re.kitech.biz.sup.tec.vo.SptTecEquipRsltVo vo = (kr.re.kitech.biz.sup.tec.vo.SptTecEquipRsltVo)equipList.get(i);
            vo._xStreamDec();	 
        }
        if( this.custVo != null ) this.custVo._xStreamDec();
        if( this.applVo != null ) this.applVo._xStreamDec();
    }


}
