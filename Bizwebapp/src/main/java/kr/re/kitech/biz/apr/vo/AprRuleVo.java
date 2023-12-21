package kr.re.kitech.biz.apr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "전결규정 Vo")
public class AprRuleVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AprRuleVo(){
    }

    @ElDtoField(logicalName = "전결규정코드", physicalName = "rule_jikcd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rule_jikcd;

    @ElDtoField(logicalName = "전결규정라인", physicalName = "ruleHabCds", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ruleHabCds;

    @ElVoField(physicalName = "rule_jikcd")
    public String getRule_jikcd(){
        return rule_jikcd;
    }

    @ElVoField(physicalName = "rule_jikcd")
    public void setRule_jikcd(String rule_jikcd){
        this.rule_jikcd = rule_jikcd;
    }

    @ElVoField(physicalName = "ruleHabCds")
    public String getRuleHabCds(){
        return ruleHabCds;
    }

    @ElVoField(physicalName = "ruleHabCds")
    public void setRuleHabCds(String ruleHabCds){
        this.ruleHabCds = ruleHabCds;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AprRuleVo [");
        sb.append("rule_jikcd").append("=").append(rule_jikcd).append(",");
        sb.append("ruleHabCds").append("=").append(ruleHabCds);
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
