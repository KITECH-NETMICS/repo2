package kr.re.kitech.biz.fin.std.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "거래처코드채번 Vo")
public class FbaGenNoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FbaGenNoVo(){
    }

    @ElDtoField(logicalName = "생성번호", physicalName = "creat_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String creat_no;

    @ElDtoField(logicalName = "이전생성번호", physicalName = "old_creat_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String old_creat_no;

    @ElVoField(physicalName = "creat_no")
    public String getCreat_no(){
        return creat_no;
    }

    @ElVoField(physicalName = "creat_no")
    public void setCreat_no(String creat_no){
        this.creat_no = creat_no;
    }

    @ElVoField(physicalName = "old_creat_no")
    public String getOld_creat_no(){
        return old_creat_no;
    }

    @ElVoField(physicalName = "old_creat_no")
    public void setOld_creat_no(String old_creat_no){
        this.old_creat_no = old_creat_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FbaGenNoVo [");
        sb.append("creat_no").append("=").append(creat_no).append(",");
        sb.append("old_creat_no").append("=").append(old_creat_no);
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
