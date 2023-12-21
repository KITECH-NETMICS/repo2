package kr.re.kitech.biz.ass.eqip.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "연구장비통합관리조회 Vo")
public class AssEquipSrcVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AssEquipSrcVo(){
    }

    @ElDtoField(logicalName = "시작일자", physicalName = "from_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String from_ymd;

    @ElDtoField(logicalName = "종료일자", physicalName = "to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String to_ymd;

    @ElDtoField(logicalName = "통합관리단위", physicalName = "intgr_mngmt_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intgr_mngmt_unit;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "최종차수여부", physicalName = "max_seq_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String max_seq_yn;

    @ElVoField(physicalName = "from_ymd")
    public String getFrom_ymd(){
        return from_ymd;
    }

    @ElVoField(physicalName = "from_ymd")
    public void setFrom_ymd(String from_ymd){
        this.from_ymd = from_ymd;
    }

    @ElVoField(physicalName = "to_ymd")
    public String getTo_ymd(){
        return to_ymd;
    }

    @ElVoField(physicalName = "to_ymd")
    public void setTo_ymd(String to_ymd){
        this.to_ymd = to_ymd;
    }

    @ElVoField(physicalName = "intgr_mngmt_unit")
    public String getIntgr_mngmt_unit(){
        return intgr_mngmt_unit;
    }

    @ElVoField(physicalName = "intgr_mngmt_unit")
    public void setIntgr_mngmt_unit(String intgr_mngmt_unit){
        this.intgr_mngmt_unit = intgr_mngmt_unit;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "max_seq_yn")
    public String getMax_seq_yn(){
        return max_seq_yn;
    }

    @ElVoField(physicalName = "max_seq_yn")
    public void setMax_seq_yn(String max_seq_yn){
        this.max_seq_yn = max_seq_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AssEquipSrcVo [");
        sb.append("from_ymd").append("=").append(from_ymd).append(",");
        sb.append("to_ymd").append("=").append(to_ymd).append(",");
        sb.append("intgr_mngmt_unit").append("=").append(intgr_mngmt_unit).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("max_seq_yn").append("=").append(max_seq_yn);
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
