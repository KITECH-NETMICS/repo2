
package kr.re.kitech.biz.api.client.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import kr.re.kitech.biz.api.client.vo.ApiResult;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apprvlClsf",
    "rollNm",
    "empName",
    "regstSyspayno",
    "signInfo",
    "compltDaytm",
    "odr"
})
@Generated("jsonschema2pojo")
public class ApiGetLineResult implements Serializable , ApiResult {
    @JsonProperty("apprvlClsf")
    private String apprvlClsf;
    @JsonProperty("rollNm")
    private String rollNm;
    @JsonProperty("empName")
    private String empName;
    @JsonProperty("regstSyspayno")
    private String regstSyspayno;
    @JsonProperty("signInfo")
    private String signInfo;
    @JsonProperty("compltDaytm")
    private String compltDaytm;
    @JsonProperty("odr")
    private String odr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1640283951358288060L;

    @JsonProperty("apprvlClsf")
    public String getApprvlClsf() {
        return apprvlClsf;
    }

    @JsonProperty("apprvlClsf")
    public void setApprvlClsf(String apprvlClsf) {
        this.apprvlClsf = apprvlClsf;
    }

    public ApiGetLineResult withApprvlClsf(String apprvlClsf) {
        this.apprvlClsf = apprvlClsf;
        return this;
    }
    
    @JsonProperty("rollNm")
    public String getRollNm() {
        return rollNm;
    }

    @JsonProperty("rollNm")
    public void setRollNm(String rollNm) {
        this.rollNm = rollNm;
    }

    public ApiGetLineResult withRollNm(String rollNm) {
        this.rollNm = rollNm;
        return this;
    }
    
    @JsonProperty("empName")
    public String getEmpName() {
        return empName;
    }

    @JsonProperty("empName")
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public ApiGetLineResult withEmpName(String empName) {
        this.empName = empName;
        return this;
    }
    
    @JsonProperty("regstSyspayno")
    public String getRegstSyspayno() {
        return regstSyspayno;
    }

    @JsonProperty("regstSyspayno")
    public void setRegstSyspayno(String regstSyspayno) {
        this.regstSyspayno = regstSyspayno;
    }

    public ApiGetLineResult withRegstSyspayno(String regstSyspayno) {
        this.regstSyspayno = regstSyspayno;
        return this;
    }
    
    @JsonProperty("signInfo")
    public String getSignInfo() {
        return signInfo;
    }

    @JsonProperty("signInfo")
    public void setSignInfo(String signInfo) {
        this.signInfo = signInfo;
    }

    public ApiGetLineResult withSignInfo(String signInfo) {
        this.signInfo = signInfo;
        return this;
    }
   
    @JsonProperty("compltDaytm")
    public String getCompltDaytm() {
        return compltDaytm;
    }

    @JsonProperty("compltDaytm")
    public void setCompltDaytm(String compltDaytm) {
        this.compltDaytm = compltDaytm;
    }

    public ApiGetLineResult withCompltDaytm(String compltDaytm) {
        this.compltDaytm = compltDaytm;
        return this;
    }
    
    @JsonProperty("odr")
    public String getOdr() {
        return odr;
    }

    @JsonProperty("odr")
    public void setOdr(String odr) {
        this.odr = odr;
    }

    public ApiGetLineResult withOdr(String odr) {
        this.odr = odr;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public ApiGetLineResult withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApiGetResult.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("apprvlClsf");
        sb.append('=');
        sb.append(((this.apprvlClsf == null)?"<null>":this.apprvlClsf));
        sb.append(',');
        sb.append("rollNm");
        sb.append('=');
        sb.append(((this.rollNm == null)?"<null>":this.rollNm));
        sb.append(',');
        sb.append("empName");
        sb.append('=');
        sb.append(((this.empName == null)?"<null>":this.empName));
        sb.append(',');
        sb.append("regstSyspayno");
        sb.append('=');
        sb.append(((this.regstSyspayno == null)?"<null>":this.regstSyspayno));
        sb.append(',');
        sb.append("signInfo");
        sb.append('=');
        sb.append(((this.signInfo == null)?"<null>":this.signInfo));
        sb.append(',');
        sb.append("compltDaytm");
        sb.append('=');
        sb.append(((this.compltDaytm == null)?"<null>":this.compltDaytm));
        sb.append(',');
        sb.append("odr");
        sb.append('=');
        sb.append(((this.odr == null)?"<null>":this.odr));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
