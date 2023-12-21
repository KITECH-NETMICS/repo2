package kr.re.kitech.biz.sup.par.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "변경전 파트너기업 담당자정보")
public class SupParPreCustChngInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
	private static final long serialVersionUID = 1L;
	
	public SupParPreCustChngInfoVo(){
    }

	  @ElDtoField(logicalName = "custNo", physicalName = "cust_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
	    private String cust_no;
	  
	    @ElDtoField(logicalName = "appontNo", physicalName = "appont_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
	    private String appont_no;
	  
	    @ElDtoField(logicalName = "seq", physicalName = "seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
	    private String seq;
	  
	    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
	    private String nm;
	  
	    @ElDtoField(logicalName = "posiNm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
	    private String posi_nm;
	  
	    @ElDtoField(logicalName = "mobileNo", physicalName = "mobile_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
	    private String mobile_no;
	  
	    @ElDtoField(logicalName = "email", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
	    private String email;
	  
	    @ElDtoField(logicalName = "telNo", physicalName = "tel_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
	    private String tel_no;
	  
	    @ElVoField(physicalName = "cust_no")
	    public String getCust_no(){
	        return cust_no;
	    }
	  
	    @ElVoField(physicalName = "cust_no")
	    public void setCust_no(String cust_no){
	        this.cust_no = cust_no;
	    }
	  
	    @ElVoField(physicalName = "appont_no")
	    public String getAppont_no(){
	        return appont_no;
	    }
	  
	    @ElVoField(physicalName = "appont_no")
	    public void setAppont_no(String appont_no){
	        this.appont_no = appont_no;
	    }
	  
	    @ElVoField(physicalName = "seq")
	    public String getSeq(){
	        return seq;
	    }
	  
	    @ElVoField(physicalName = "seq")
	    public void setSeq(String seq){
	        this.seq = seq;
	    }
	  
	    @ElVoField(physicalName = "nm")
	    public String getNm(){
	        return nm;
	    }
	  
	    @ElVoField(physicalName = "nm")
	    public void setNm(String nm){
	        this.nm = nm;
	    }
	  
	    @ElVoField(physicalName = "posi_nm")
	    public String getPosi_nm(){
	        return posi_nm;
	    }
	  
	    @ElVoField(physicalName = "posi_nm")
	    public void setPosi_nm(String posi_nm){
	        this.posi_nm = posi_nm;
	    }
	  
	    @ElVoField(physicalName = "mobile_no")
	    public String getMobile_no(){
	        return mobile_no;
	    }
	  
	    @ElVoField(physicalName = "mobile_no")
	    public void setMobile_no(String mobile_no){
	        this.mobile_no = mobile_no;
	    }
	  
	    @ElVoField(physicalName = "email")
	    public String getEmail(){
	        return email;
	    }
	  
	    @ElVoField(physicalName = "email")
	    public void setEmail(String email){
	        this.email = email;
	    }
	  
	    @ElVoField(physicalName = "tel_no")
	    public String getTel_no(){
	        return tel_no;
	    }
	  
	    @ElVoField(physicalName = "tel_no")
	    public void setTel_no(String tel_no){
	        this.tel_no = tel_no;
	    }
	  
	  @Override
	  public String toString() {
	      StringBuilder sb = new StringBuilder();
	      sb.append("supParPreCustChngInfoVo [");
	      sb.append("cust_no").append("=").append(cust_no).append(",");
	      sb.append("appont_no").append("=").append(appont_no).append(",");
	      sb.append("seq").append("=").append(seq).append(",");
	      sb.append("nm").append("=").append(nm).append(",");
	      sb.append("posi_nm").append("=").append(posi_nm).append(",");
	      sb.append("mobile_no").append("=").append(mobile_no).append(",");
	      sb.append("email").append("=").append(email).append(",");
	      sb.append("tel_no").append("=").append(tel_no);
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
