package kr.re.kitech.biz.sup.tec.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "기술지원 계산서발행 공급받는자 Vo")
public class SptTecBillBuyrChrgVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptTecBillBuyrChrgVo(){
    }

    @ElDtoField(logicalName = "담당자성명", physicalName = "buyr_chrg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_nm;

    @ElDtoField(logicalName = "담당자부서", physicalName = "buyr_chrg_post", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_post;

    @ElDtoField(logicalName = "담당자연락처", physicalName = "buyr_chrg_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_tel;

    @ElDtoField(logicalName = "담당자핸드폰", physicalName = "buyr_chrg_mobl", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_mobl;

    @ElDtoField(logicalName = "담당자이메일", physicalName = "buyr_chrg_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_email;

    @ElVoField(physicalName = "buyr_chrg_nm")
    public String getBuyr_chrg_nm(){
        return buyr_chrg_nm;
    }

    @ElVoField(physicalName = "buyr_chrg_nm")
    public void setBuyr_chrg_nm(String buyr_chrg_nm){
        this.buyr_chrg_nm = buyr_chrg_nm;
    }

    @ElVoField(physicalName = "buyr_chrg_post")
    public String getBuyr_chrg_post(){
        return buyr_chrg_post;
    }

    @ElVoField(physicalName = "buyr_chrg_post")
    public void setBuyr_chrg_post(String buyr_chrg_post){
        this.buyr_chrg_post = buyr_chrg_post;
    }

    @ElVoField(physicalName = "buyr_chrg_tel")
    public String getBuyr_chrg_tel(){
        return buyr_chrg_tel;
    }

    @ElVoField(physicalName = "buyr_chrg_tel")
    public void setBuyr_chrg_tel(String buyr_chrg_tel){
        this.buyr_chrg_tel = buyr_chrg_tel;
    }

    @ElVoField(physicalName = "buyr_chrg_mobl")
    public String getBuyr_chrg_mobl(){
        return buyr_chrg_mobl;
    }

    @ElVoField(physicalName = "buyr_chrg_mobl")
    public void setBuyr_chrg_mobl(String buyr_chrg_mobl){
        this.buyr_chrg_mobl = buyr_chrg_mobl;
    }

    @ElVoField(physicalName = "buyr_chrg_email")
    public String getBuyr_chrg_email(){
        return buyr_chrg_email;
    }

    @ElVoField(physicalName = "buyr_chrg_email")
    public void setBuyr_chrg_email(String buyr_chrg_email){
        this.buyr_chrg_email = buyr_chrg_email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptTecBillBuyrChrgVo [");
        sb.append("buyr_chrg_nm").append("=").append(buyr_chrg_nm).append(",");
        sb.append("buyr_chrg_post").append("=").append(buyr_chrg_post).append(",");
        sb.append("buyr_chrg_tel").append("=").append(buyr_chrg_tel).append(",");
        sb.append("buyr_chrg_mobl").append("=").append(buyr_chrg_mobl).append(",");
        sb.append("buyr_chrg_email").append("=").append(buyr_chrg_email);
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
