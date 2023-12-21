package kr.re.kitech.biz.epu.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "계속연차 과제정보 Vo")
public class PurContAnnlPrjVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PurContAnnlPrjVo(){
    }

    @ElDtoField(logicalName = "과제명", physicalName = "accnt_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_nm;

    @ElDtoField(logicalName = "과제차수", physicalName = "prj_yrs", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_yrs;

    @ElDtoField(logicalName = "총과제기간", physicalName = "tot_resch_prd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_resch_prd;

    @ElDtoField(logicalName = "당해년도 과제기간", physicalName = "current_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String current_ymd;

    @ElDtoField(logicalName = "구매요구번호", physicalName = "pur_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_req_no;

    @ElDtoField(logicalName = "계정순번", physicalName = "accnt_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_odr;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElVoField(physicalName = "accnt_no_nm")
    public String getAccnt_no_nm(){
        return accnt_no_nm;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public void setAccnt_no_nm(String accnt_no_nm){
        this.accnt_no_nm = accnt_no_nm;
    }

    @ElVoField(physicalName = "prj_yrs")
    public String getPrj_yrs(){
        return prj_yrs;
    }

    @ElVoField(physicalName = "prj_yrs")
    public void setPrj_yrs(String prj_yrs){
        this.prj_yrs = prj_yrs;
    }

    @ElVoField(physicalName = "tot_resch_prd")
    public String getTot_resch_prd(){
        return tot_resch_prd;
    }

    @ElVoField(physicalName = "tot_resch_prd")
    public void setTot_resch_prd(String tot_resch_prd){
        this.tot_resch_prd = tot_resch_prd;
    }

    @ElVoField(physicalName = "current_ymd")
    public String getCurrent_ymd(){
        return current_ymd;
    }

    @ElVoField(physicalName = "current_ymd")
    public void setCurrent_ymd(String current_ymd){
        this.current_ymd = current_ymd;
    }

    @ElVoField(physicalName = "pur_req_no")
    public String getPur_req_no(){
        return pur_req_no;
    }

    @ElVoField(physicalName = "pur_req_no")
    public void setPur_req_no(String pur_req_no){
        this.pur_req_no = pur_req_no;
    }

    @ElVoField(physicalName = "accnt_odr")
    public String getAccnt_odr(){
        return accnt_odr;
    }

    @ElVoField(physicalName = "accnt_odr")
    public void setAccnt_odr(String accnt_odr){
        this.accnt_odr = accnt_odr;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurContAnnlPrjVo [");
        sb.append("accnt_no_nm").append("=").append(accnt_no_nm).append(",");
        sb.append("prj_yrs").append("=").append(prj_yrs).append(",");
        sb.append("tot_resch_prd").append("=").append(tot_resch_prd).append(",");
        sb.append("current_ymd").append("=").append(current_ymd).append(",");
        sb.append("pur_req_no").append("=").append(pur_req_no).append(",");
        sb.append("accnt_odr").append("=").append(accnt_odr).append(",");
        sb.append("accnt_no").append("=").append(accnt_no);
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
