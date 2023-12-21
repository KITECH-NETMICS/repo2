package kr.re.kitech.biz.xom.core.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "환경설정대결 Vo")
public class AppvDelegatorVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AppvDelegatorVo(){
    }

    @ElDtoField(logicalName = "대결설정순번", physicalName = "dlgt_sn", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private int dlgt_sn;

    @ElDtoField(logicalName = "대결설정자시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String syspayno;

    @ElDtoField(logicalName = "시작일", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String start_ymd;

    @ElDtoField(logicalName = "종료일", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "제한여부", physicalName = "ischkdate", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String ischkdate;

    @ElDtoField(logicalName = "메인처리자 시스템개인번호", physicalName = "main_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String main_syspayno;

    @ElDtoField(logicalName = "메인처리자 개인번호", physicalName = "main_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String main_empno;

    @ElDtoField(logicalName = "메인처리자 성명", physicalName = "main_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String main_nm;

    @ElDtoField(logicalName = "서브처리자 시스템개인번호", physicalName = "sub_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String sub_syspayno;

    @ElDtoField(logicalName = "서브처리자 개인번호", physicalName = "sub_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String sub_empno;

    @ElDtoField(logicalName = "서브처리자 성명", physicalName = "sub_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String sub_nm;

    @ElDtoField(logicalName = "양식명", physicalName = "appnames", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String appnames;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String cud_type;

    @ElDtoField(logicalName = "상태", physicalName = "state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String state;

    @ElDtoField(logicalName = "행위자ID", physicalName = "actorCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String actorCode;

    @ElDtoField(logicalName = "메인처리자ID", physicalName = "delegatorCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String delegatorCode;

    @ElDtoField(logicalName = "결과코드", physicalName = "resultcd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String resultcd;

    @ElDtoField(logicalName = "에러메시지", physicalName = "resultmsg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String resultmsg;

    @ElVoField(physicalName = "dlgt_sn")
    public int getDlgt_sn(){
        return dlgt_sn;
    }

    @ElVoField(physicalName = "dlgt_sn")
    public void setDlgt_sn(int dlgt_sn){
        this.dlgt_sn = dlgt_sn;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        String ret = this.syspayno;
        return ret;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "start_ymd")
    public String getStart_ymd(){
        String ret = this.start_ymd;
        return ret;
    }

    @ElVoField(physicalName = "start_ymd")
    public void setStart_ymd(String start_ymd){
        this.start_ymd = start_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public String getCls_ymd(){
        String ret = this.cls_ymd;
        return ret;
    }

    @ElVoField(physicalName = "cls_ymd")
    public void setCls_ymd(String cls_ymd){
        this.cls_ymd = cls_ymd;
    }

    @ElVoField(physicalName = "ischkdate")
    public String getIschkdate(){
        String ret = this.ischkdate;
        return ret;
    }

    @ElVoField(physicalName = "ischkdate")
    public void setIschkdate(String ischkdate){
        this.ischkdate = ischkdate;
    }

    @ElVoField(physicalName = "main_syspayno")
    public String getMain_syspayno(){
        String ret = this.main_syspayno;
        return ret;
    }

    @ElVoField(physicalName = "main_syspayno")
    public void setMain_syspayno(String main_syspayno){
        this.main_syspayno = main_syspayno;
    }

    @ElVoField(physicalName = "main_empno")
    public String getMain_empno(){
        String ret = this.main_empno;
        return ret;
    }

    @ElVoField(physicalName = "main_empno")
    public void setMain_empno(String main_empno){
        this.main_empno = main_empno;
    }

    @ElVoField(physicalName = "main_nm")
    public String getMain_nm(){
        String ret = this.main_nm;
        return ret;
    }

    @ElVoField(physicalName = "main_nm")
    public void setMain_nm(String main_nm){
        this.main_nm = main_nm;
    }

    @ElVoField(physicalName = "sub_syspayno")
    public String getSub_syspayno(){
        String ret = this.sub_syspayno;
        return ret;
    }

    @ElVoField(physicalName = "sub_syspayno")
    public void setSub_syspayno(String sub_syspayno){
        this.sub_syspayno = sub_syspayno;
    }

    @ElVoField(physicalName = "sub_empno")
    public String getSub_empno(){
        String ret = this.sub_empno;
        return ret;
    }

    @ElVoField(physicalName = "sub_empno")
    public void setSub_empno(String sub_empno){
        this.sub_empno = sub_empno;
    }

    @ElVoField(physicalName = "sub_nm")
    public String getSub_nm(){
        String ret = this.sub_nm;
        return ret;
    }

    @ElVoField(physicalName = "sub_nm")
    public void setSub_nm(String sub_nm){
        this.sub_nm = sub_nm;
    }

    @ElVoField(physicalName = "appnames")
    public String getAppnames(){
        String ret = this.appnames;
        return ret;
    }

    @ElVoField(physicalName = "appnames")
    public void setAppnames(String appnames){
        this.appnames = appnames;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        String ret = this.cud_type;
        return ret;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "state")
    public String getState(){
        String ret = this.state;
        return ret;
    }

    @ElVoField(physicalName = "state")
    public void setState(String state){
        this.state = state;
    }

    @ElVoField(physicalName = "actorCode")
    public String getActorCode(){
        String ret = this.actorCode;
        return ret;
    }

    @ElVoField(physicalName = "actorCode")
    public void setActorCode(String actorCode){
        this.actorCode = actorCode;
    }

    @ElVoField(physicalName = "delegatorCode")
    public String getDelegatorCode(){
        String ret = this.delegatorCode;
        return ret;
    }

    @ElVoField(physicalName = "delegatorCode")
    public void setDelegatorCode(String delegatorCode){
        this.delegatorCode = delegatorCode;
    }

    @ElVoField(physicalName = "resultcd")
    public String getResultcd(){
        String ret = this.resultcd;
        return ret;
    }

    @ElVoField(physicalName = "resultcd")
    public void setResultcd(String resultcd){
        this.resultcd = resultcd;
    }

    @ElVoField(physicalName = "resultmsg")
    public String getResultmsg(){
        String ret = this.resultmsg;
        return ret;
    }

    @ElVoField(physicalName = "resultmsg")
    public void setResultmsg(String resultmsg){
        this.resultmsg = resultmsg;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AppvDelegatorVo [");
        sb.append("dlgt_sn").append("=").append(dlgt_sn).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("ischkdate").append("=").append(ischkdate).append(",");
        sb.append("main_syspayno").append("=").append(main_syspayno).append(",");
        sb.append("main_empno").append("=").append(main_empno).append(",");
        sb.append("main_nm").append("=").append(main_nm).append(",");
        sb.append("sub_syspayno").append("=").append(sub_syspayno).append(",");
        sb.append("sub_empno").append("=").append(sub_empno).append(",");
        sb.append("sub_nm").append("=").append(sub_nm).append(",");
        sb.append("appnames").append("=").append(appnames).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("state").append("=").append(state).append(",");
        sb.append("actorCode").append("=").append(actorCode).append(",");
        sb.append("delegatorCode").append("=").append(delegatorCode).append(",");
        sb.append("resultcd").append("=").append(resultcd).append(",");
        sb.append("resultmsg").append("=").append(resultmsg);
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
