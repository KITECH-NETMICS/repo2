package kr.re.kitech.biz.api.server.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "과제정보VO")
public class ApiEipPrjInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ApiEipPrjInfoVo(){
    }

    @ElDtoField(logicalName = "참여구분", physicalName = "reschr_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String reschr_clsf;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String syspayno;

    @ElDtoField(logicalName = "개인번호", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String empno;

    @ElDtoField(logicalName = "성명", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String nm;

    @ElDtoField(logicalName = "ID", physicalName = "ID", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String ID;

    @ElDtoField(logicalName = "과제상태", physicalName = "prj_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String prj_state;

    @ElDtoField(logicalName = "과제번호", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String prj_no;

    @ElDtoField(logicalName = "과제명", physicalName = "prj_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String prj_nm;

    @ElDtoField(logicalName = "과제책임자개인번호", physicalName = "prj_charge_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String prj_charge_empno;

    @ElDtoField(logicalName = "과제책임자성명", physicalName = "prj_charge_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String prj_charge_nm;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String accnt_no;

    @ElDtoField(logicalName = "계정책임자개인번호", physicalName = "accnt_charge_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String accnt_charge_empno;

    @ElDtoField(logicalName = "계정책임자성명", physicalName = "accnt_charge_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String accnt_charge_nm;

    @ElDtoField(logicalName = "과제구분", physicalName = "prj_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String prj_clsf;

    @ElDtoField(logicalName = "cd_nm", physicalName = "cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String cd_nm;

    @ElDtoField(logicalName = "과제기간", physicalName = "prj_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String prj_ymd;

    @ElDtoField(logicalName = "총연구기간", physicalName = "tot_prj_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String tot_prj_ymd;

    @ElDtoField(logicalName = "과제연구비", physicalName = "prj_cash", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String prj_cash;

    @ElDtoField(logicalName = "과제상세정보이동", physicalName = "prj_detail_move", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String prj_detail_move;

    @ElDtoField(logicalName = "계정수", physicalName = "count", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String count;

    @ElDtoField(logicalName = "예실팝업", physicalName = "ysPopup", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String ysPopup;

    @ElDtoField(logicalName = "과제정보", physicalName = "prjInfo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String prjInfo;

    @ElVoField(physicalName = "reschr_clsf")
    public String getReschr_clsf(){
        String ret = this.reschr_clsf;
        return ret;
    }

    @ElVoField(physicalName = "reschr_clsf")
    public void setReschr_clsf(String reschr_clsf){
        this.reschr_clsf = reschr_clsf;
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

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        String ret = this.empno;
        return ret;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        String ret = this.nm;
        return ret;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "ID")
    public String getID(){
        String ret = this.ID;
        return ret;
    }

    @ElVoField(physicalName = "ID")
    public void setID(String ID){
        this.ID = ID;
    }

    @ElVoField(physicalName = "prj_state")
    public String getPrj_state(){
        String ret = this.prj_state;
        return ret;
    }

    @ElVoField(physicalName = "prj_state")
    public void setPrj_state(String prj_state){
        this.prj_state = prj_state;
    }

    @ElVoField(physicalName = "prj_no")
    public String getPrj_no(){
        String ret = this.prj_no;
        return ret;
    }

    @ElVoField(physicalName = "prj_no")
    public void setPrj_no(String prj_no){
        this.prj_no = prj_no;
    }

    @ElVoField(physicalName = "prj_nm")
    public String getPrj_nm(){
        String ret = this.prj_nm;
        return ret;
    }

    @ElVoField(physicalName = "prj_nm")
    public void setPrj_nm(String prj_nm){
        this.prj_nm = prj_nm;
    }

    @ElVoField(physicalName = "prj_charge_empno")
    public String getPrj_charge_empno(){
        String ret = this.prj_charge_empno;
        return ret;
    }

    @ElVoField(physicalName = "prj_charge_empno")
    public void setPrj_charge_empno(String prj_charge_empno){
        this.prj_charge_empno = prj_charge_empno;
    }

    @ElVoField(physicalName = "prj_charge_nm")
    public String getPrj_charge_nm(){
        String ret = this.prj_charge_nm;
        return ret;
    }

    @ElVoField(physicalName = "prj_charge_nm")
    public void setPrj_charge_nm(String prj_charge_nm){
        this.prj_charge_nm = prj_charge_nm;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        String ret = this.accnt_no;
        return ret;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "accnt_charge_empno")
    public String getAccnt_charge_empno(){
        String ret = this.accnt_charge_empno;
        return ret;
    }

    @ElVoField(physicalName = "accnt_charge_empno")
    public void setAccnt_charge_empno(String accnt_charge_empno){
        this.accnt_charge_empno = accnt_charge_empno;
    }

    @ElVoField(physicalName = "accnt_charge_nm")
    public String getAccnt_charge_nm(){
        String ret = this.accnt_charge_nm;
        return ret;
    }

    @ElVoField(physicalName = "accnt_charge_nm")
    public void setAccnt_charge_nm(String accnt_charge_nm){
        this.accnt_charge_nm = accnt_charge_nm;
    }

    @ElVoField(physicalName = "prj_clsf")
    public String getPrj_clsf(){
        String ret = this.prj_clsf;
        return ret;
    }

    @ElVoField(physicalName = "prj_clsf")
    public void setPrj_clsf(String prj_clsf){
        this.prj_clsf = prj_clsf;
    }

    @ElVoField(physicalName = "cd_nm")
    public String getCd_nm(){
        String ret = this.cd_nm;
        return ret;
    }

    @ElVoField(physicalName = "cd_nm")
    public void setCd_nm(String cd_nm){
        this.cd_nm = cd_nm;
    }

    @ElVoField(physicalName = "prj_ymd")
    public String getPrj_ymd(){
        String ret = this.prj_ymd;
        return ret;
    }

    @ElVoField(physicalName = "prj_ymd")
    public void setPrj_ymd(String prj_ymd){
        this.prj_ymd = prj_ymd;
    }

    @ElVoField(physicalName = "tot_prj_ymd")
    public String getTot_prj_ymd(){
        String ret = this.tot_prj_ymd;
        return ret;
    }

    @ElVoField(physicalName = "tot_prj_ymd")
    public void setTot_prj_ymd(String tot_prj_ymd){
        this.tot_prj_ymd = tot_prj_ymd;
    }

    @ElVoField(physicalName = "prj_cash")
    public String getPrj_cash(){
        String ret = this.prj_cash;
        return ret;
    }

    @ElVoField(physicalName = "prj_cash")
    public void setPrj_cash(String prj_cash){
        this.prj_cash = prj_cash;
    }

    @ElVoField(physicalName = "prj_detail_move")
    public String getPrj_detail_move(){
        String ret = this.prj_detail_move;
        return ret;
    }

    @ElVoField(physicalName = "prj_detail_move")
    public void setPrj_detail_move(String prj_detail_move){
        this.prj_detail_move = prj_detail_move;
    }

    @ElVoField(physicalName = "count")
    public String getCount(){
        String ret = this.count;
        return ret;
    }

    @ElVoField(physicalName = "count")
    public void setCount(String count){
        this.count = count;
    }

    @ElVoField(physicalName = "ysPopup")
    public String getYsPopup(){
        String ret = this.ysPopup;
        return ret;
    }

    @ElVoField(physicalName = "ysPopup")
    public void setYsPopup(String ysPopup){
        this.ysPopup = ysPopup;
    }

    @ElVoField(physicalName = "prjInfo")
    public String getPrjInfo(){
        String ret = this.prjInfo;
        return ret;
    }

    @ElVoField(physicalName = "prjInfo")
    public void setPrjInfo(String prjInfo){
        this.prjInfo = prjInfo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiEipPrjInfoVo [");
        sb.append("reschr_clsf").append("=").append(reschr_clsf).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("ID").append("=").append(ID).append(",");
        sb.append("prj_state").append("=").append(prj_state).append(",");
        sb.append("prj_no").append("=").append(prj_no).append(",");
        sb.append("prj_nm").append("=").append(prj_nm).append(",");
        sb.append("prj_charge_empno").append("=").append(prj_charge_empno).append(",");
        sb.append("prj_charge_nm").append("=").append(prj_charge_nm).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_charge_empno").append("=").append(accnt_charge_empno).append(",");
        sb.append("accnt_charge_nm").append("=").append(accnt_charge_nm).append(",");
        sb.append("prj_clsf").append("=").append(prj_clsf).append(",");
        sb.append("cd_nm").append("=").append(cd_nm).append(",");
        sb.append("prj_ymd").append("=").append(prj_ymd).append(",");
        sb.append("tot_prj_ymd").append("=").append(tot_prj_ymd).append(",");
        sb.append("prj_cash").append("=").append(prj_cash).append(",");
        sb.append("prj_detail_move").append("=").append(prj_detail_move).append(",");
        sb.append("count").append("=").append(count).append(",");
        sb.append("ysPopup").append("=").append(ysPopup).append(",");
        sb.append("prjInfo").append("=").append(prjInfo);
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
