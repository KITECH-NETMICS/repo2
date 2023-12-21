package kr.re.kitech.biz.xom.core.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "공통 코드 모델")
public class CodeVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CodeVo(){
    }

    @ElDtoField(logicalName = "그룹코드", physicalName = "grpCd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String grpCd;

    @ElDtoField(logicalName = "그룹코드명", physicalName = "grpNm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String grpNm;

    @ElDtoField(logicalName = "코드", physicalName = "comCd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String comCd;

    @ElDtoField(logicalName = "코드명", physicalName = "comNm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String comNm;

    @ElDtoField(logicalName = "코드설명", physicalName = "cdDesc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cdDesc;

    @ElDtoField(logicalName = "코드구분", physicalName = "cdClsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cdClsf;

    @ElDtoField(logicalName = "시스템구분", physicalName = "sysClsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sysClsf;

    @ElDtoField(logicalName = "순번", physicalName = "seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seq;

    @ElDtoField(logicalName = "사용여부", physicalName = "useEx", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String useEx;

    @ElDtoField(logicalName = "관리문자열1", physicalName = "mngmtItem1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmtItem1;

    @ElDtoField(logicalName = "관리문자열2", physicalName = "mngmtItem2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmtItem2;

    @ElDtoField(logicalName = "관리문자열3", physicalName = "mngmtItem3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmtItem3;

    @ElDtoField(logicalName = "관리문자열4", physicalName = "mngmtItem4", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmtItem4;

    @ElDtoField(logicalName = "관리문자열5", physicalName = "mngmtItem5", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmtItem5;

    @ElDtoField(logicalName = "관리문자열6", physicalName = "mngmtItem6", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmtItem6;

    @ElDtoField(logicalName = "관리문자열7", physicalName = "mngmtItem7", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmtItem7;

    @ElDtoField(logicalName = "관리문자열8", physicalName = "mngmtItem8", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmtItem8;

    @ElDtoField(logicalName = "관리번호1", physicalName = "mngmtNo1", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int mngmtNo1;

    @ElDtoField(logicalName = "관리번호2", physicalName = "mngmtNo2", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int mngmtNo2;

    @ElDtoField(logicalName = "관리번호3", physicalName = "mngmtNo3", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int mngmtNo3;

    @ElDtoField(logicalName = "관리번호4", physicalName = "mngmtNo4", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int mngmtNo4;

    @ElDtoField(logicalName = "관리번호5", physicalName = "mngmtNo5", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int mngmtNo5;

    @ElDtoField(logicalName = "관리번호6", physicalName = "mngmtNo6", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int mngmtNo6;

    @ElDtoField(logicalName = "관리번호7", physicalName = "mngmtNo7", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int mngmtNo7;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElVoField(physicalName = "grpCd")
    public String getGrpCd(){
        return grpCd;
    }

    @ElVoField(physicalName = "grpCd")
    public void setGrpCd(String grpCd){
        this.grpCd = grpCd;
    }

    @ElVoField(physicalName = "grpNm")
    public String getGrpNm(){
        return grpNm;
    }

    @ElVoField(physicalName = "grpNm")
    public void setGrpNm(String grpNm){
        this.grpNm = grpNm;
    }

    @ElVoField(physicalName = "comCd")
    public String getComCd(){
        return comCd;
    }

    @ElVoField(physicalName = "comCd")
    public void setComCd(String comCd){
        this.comCd = comCd;
    }

    @ElVoField(physicalName = "comNm")
    public String getComNm(){
        return comNm;
    }

    @ElVoField(physicalName = "comNm")
    public void setComNm(String comNm){
        this.comNm = comNm;
    }

    @ElVoField(physicalName = "cdDesc")
    public String getCdDesc(){
        return cdDesc;
    }

    @ElVoField(physicalName = "cdDesc")
    public void setCdDesc(String cdDesc){
        this.cdDesc = cdDesc;
    }

    @ElVoField(physicalName = "cdClsf")
    public String getCdClsf(){
        return cdClsf;
    }

    @ElVoField(physicalName = "cdClsf")
    public void setCdClsf(String cdClsf){
        this.cdClsf = cdClsf;
    }

    @ElVoField(physicalName = "sysClsf")
    public String getSysClsf(){
        return sysClsf;
    }

    @ElVoField(physicalName = "sysClsf")
    public void setSysClsf(String sysClsf){
        this.sysClsf = sysClsf;
    }

    @ElVoField(physicalName = "seq")
    public String getSeq(){
        return seq;
    }

    @ElVoField(physicalName = "seq")
    public void setSeq(String seq){
        this.seq = seq;
    }

    @ElVoField(physicalName = "useEx")
    public String getUseEx(){
        return useEx;
    }

    @ElVoField(physicalName = "useEx")
    public void setUseEx(String useEx){
        this.useEx = useEx;
    }

    @ElVoField(physicalName = "mngmtItem1")
    public String getMngmtItem1(){
        return mngmtItem1;
    }

    @ElVoField(physicalName = "mngmtItem1")
    public void setMngmtItem1(String mngmtItem1){
        this.mngmtItem1 = mngmtItem1;
    }

    @ElVoField(physicalName = "mngmtItem2")
    public String getMngmtItem2(){
        return mngmtItem2;
    }

    @ElVoField(physicalName = "mngmtItem2")
    public void setMngmtItem2(String mngmtItem2){
        this.mngmtItem2 = mngmtItem2;
    }

    @ElVoField(physicalName = "mngmtItem3")
    public String getMngmtItem3(){
        return mngmtItem3;
    }

    @ElVoField(physicalName = "mngmtItem3")
    public void setMngmtItem3(String mngmtItem3){
        this.mngmtItem3 = mngmtItem3;
    }

    @ElVoField(physicalName = "mngmtItem4")
    public String getMngmtItem4(){
        return mngmtItem4;
    }

    @ElVoField(physicalName = "mngmtItem4")
    public void setMngmtItem4(String mngmtItem4){
        this.mngmtItem4 = mngmtItem4;
    }

    @ElVoField(physicalName = "mngmtItem5")
    public String getMngmtItem5(){
        return mngmtItem5;
    }

    @ElVoField(physicalName = "mngmtItem5")
    public void setMngmtItem5(String mngmtItem5){
        this.mngmtItem5 = mngmtItem5;
    }

    @ElVoField(physicalName = "mngmtItem6")
    public String getMngmtItem6(){
        return mngmtItem6;
    }

    @ElVoField(physicalName = "mngmtItem6")
    public void setMngmtItem6(String mngmtItem6){
        this.mngmtItem6 = mngmtItem6;
    }

    @ElVoField(physicalName = "mngmtItem7")
    public String getMngmtItem7(){
        return mngmtItem7;
    }

    @ElVoField(physicalName = "mngmtItem7")
    public void setMngmtItem7(String mngmtItem7){
        this.mngmtItem7 = mngmtItem7;
    }

    @ElVoField(physicalName = "mngmtItem8")
    public String getMngmtItem8(){
        return mngmtItem8;
    }

    @ElVoField(physicalName = "mngmtItem8")
    public void setMngmtItem8(String mngmtItem8){
        this.mngmtItem8 = mngmtItem8;
    }

    @ElVoField(physicalName = "mngmtNo1")
    public int getMngmtNo1(){
        return mngmtNo1;
    }

    @ElVoField(physicalName = "mngmtNo1")
    public void setMngmtNo1(int mngmtNo1){
        this.mngmtNo1 = mngmtNo1;
    }

    @ElVoField(physicalName = "mngmtNo2")
    public int getMngmtNo2(){
        return mngmtNo2;
    }

    @ElVoField(physicalName = "mngmtNo2")
    public void setMngmtNo2(int mngmtNo2){
        this.mngmtNo2 = mngmtNo2;
    }

    @ElVoField(physicalName = "mngmtNo3")
    public int getMngmtNo3(){
        return mngmtNo3;
    }

    @ElVoField(physicalName = "mngmtNo3")
    public void setMngmtNo3(int mngmtNo3){
        this.mngmtNo3 = mngmtNo3;
    }

    @ElVoField(physicalName = "mngmtNo4")
    public int getMngmtNo4(){
        return mngmtNo4;
    }

    @ElVoField(physicalName = "mngmtNo4")
    public void setMngmtNo4(int mngmtNo4){
        this.mngmtNo4 = mngmtNo4;
    }

    @ElVoField(physicalName = "mngmtNo5")
    public int getMngmtNo5(){
        return mngmtNo5;
    }

    @ElVoField(physicalName = "mngmtNo5")
    public void setMngmtNo5(int mngmtNo5){
        this.mngmtNo5 = mngmtNo5;
    }

    @ElVoField(physicalName = "mngmtNo6")
    public int getMngmtNo6(){
        return mngmtNo6;
    }

    @ElVoField(physicalName = "mngmtNo6")
    public void setMngmtNo6(int mngmtNo6){
        this.mngmtNo6 = mngmtNo6;
    }

    @ElVoField(physicalName = "mngmtNo7")
    public int getMngmtNo7(){
        return mngmtNo7;
    }

    @ElVoField(physicalName = "mngmtNo7")
    public void setMngmtNo7(int mngmtNo7){
        this.mngmtNo7 = mngmtNo7;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CodeVo [");
        sb.append("grpCd").append("=").append(grpCd).append(",");
        sb.append("grpNm").append("=").append(grpNm).append(",");
        sb.append("comCd").append("=").append(comCd).append(",");
        sb.append("comNm").append("=").append(comNm).append(",");
        sb.append("cdDesc").append("=").append(cdDesc).append(",");
        sb.append("cdClsf").append("=").append(cdClsf).append(",");
        sb.append("sysClsf").append("=").append(sysClsf).append(",");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("useEx").append("=").append(useEx).append(",");
        sb.append("mngmtItem1").append("=").append(mngmtItem1).append(",");
        sb.append("mngmtItem2").append("=").append(mngmtItem2).append(",");
        sb.append("mngmtItem3").append("=").append(mngmtItem3).append(",");
        sb.append("mngmtItem4").append("=").append(mngmtItem4).append(",");
        sb.append("mngmtItem5").append("=").append(mngmtItem5).append(",");
        sb.append("mngmtItem6").append("=").append(mngmtItem6).append(",");
        sb.append("mngmtItem7").append("=").append(mngmtItem7).append(",");
        sb.append("mngmtItem8").append("=").append(mngmtItem8).append(",");
        sb.append("mngmtNo1").append("=").append(mngmtNo1).append(",");
        sb.append("mngmtNo2").append("=").append(mngmtNo2).append(",");
        sb.append("mngmtNo3").append("=").append(mngmtNo3).append(",");
        sb.append("mngmtNo4").append("=").append(mngmtNo4).append(",");
        sb.append("mngmtNo5").append("=").append(mngmtNo5).append(",");
        sb.append("mngmtNo6").append("=").append(mngmtNo6).append(",");
        sb.append("mngmtNo7").append("=").append(mngmtNo7).append(",");
        sb.append("rmk").append("=").append(rmk);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
    }


    @Override
    public void _xStreamDec() {
    }


}
