package kr.re.kitech.biz.sup.par.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "변경전 파트너기업 멘토정보")
public class SupParPreCustMentoInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
	private static final long serialVersionUID = 1L;
	
	public SupParPreCustMentoInfoVo(){
    }
	
	 @ElDtoField(logicalName = "custNo", physicalName = "cust_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
	    private String cust_no;
	  
	    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
	    private String syspayno;
	  
	    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
	    private String empno;
	  
	    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
	    private String nm;
	  
	    @ElDtoField(logicalName = "deptCd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
	    private String dept_cd;
	  
	    @ElDtoField(logicalName = "deptNm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
	    private String dept_nm;
	  
	    @ElDtoField(logicalName = "posiCd", physicalName = "posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
	    private String posi_cd;
	  
	    @ElDtoField(logicalName = "posiNm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
	    private String posi_nm;
	  
	    @ElDtoField(logicalName = "regionCentr", physicalName = "region_centr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
	    private String region_centr;
	  
	    @ElDtoField(logicalName = "mngmtRegion", physicalName = "mngmt_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
	    private String mngmt_region;
	  
	    @ElDtoField(logicalName = "mngmtRegionm", physicalName = "mngmt_regionm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
	    private String mngmt_regionm;
	  
	    @ElDtoField(logicalName = "retireYmd", physicalName = "retire_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
	    private String retire_ymd;
	  
	    @ElVoField(physicalName = "cust_no")
	    public String getCust_no(){
	        return cust_no;
	    }
	  
	    @ElVoField(physicalName = "cust_no")
	    public void setCust_no(String cust_no){
	        this.cust_no = cust_no;
	    }
	  
	    @ElVoField(physicalName = "syspayno")
	    public String getSyspayno(){
	        return syspayno;
	    }
	  
	    @ElVoField(physicalName = "syspayno")
	    public void setSyspayno(String syspayno){
	        this.syspayno = syspayno;
	    }
	  
	    @ElVoField(physicalName = "empno")
	    public String getEmpno(){
	        return empno;
	    }
	  
	    @ElVoField(physicalName = "empno")
	    public void setEmpno(String empno){
	        this.empno = empno;
	    }
	  
	    @ElVoField(physicalName = "nm")
	    public String getNm(){
	        return nm;
	    }
	  
	    @ElVoField(physicalName = "nm")
	    public void setNm(String nm){
	        this.nm = nm;
	    }
	  
	    @ElVoField(physicalName = "dept_cd")
	    public String getDept_cd(){
	        return dept_cd;
	    }
	  
	    @ElVoField(physicalName = "dept_cd")
	    public void setDept_cd(String dept_cd){
	        this.dept_cd = dept_cd;
	    }
	  
	    @ElVoField(physicalName = "dept_nm")
	    public String getDept_nm(){
	        return dept_nm;
	    }
	  
	    @ElVoField(physicalName = "dept_nm")
	    public void setDept_nm(String dept_nm){
	        this.dept_nm = dept_nm;
	    }
	  
	    @ElVoField(physicalName = "posi_cd")
	    public String getPosi_cd(){
	        return posi_cd;
	    }
	  
	    @ElVoField(physicalName = "posi_cd")
	    public void setPosi_cd(String posi_cd){
	        this.posi_cd = posi_cd;
	    }
	  
	    @ElVoField(physicalName = "posi_nm")
	    public String getPosi_nm(){
	        return posi_nm;
	    }
	  
	    @ElVoField(physicalName = "posi_nm")
	    public void setPosi_nm(String posi_nm){
	        this.posi_nm = posi_nm;
	    }
	  
	    @ElVoField(physicalName = "region_centr")
	    public String getRegion_centr(){
	        return region_centr;
	    }
	  
	    @ElVoField(physicalName = "region_centr")
	    public void setRegion_centr(String region_centr){
	        this.region_centr = region_centr;
	    }
	  
	    @ElVoField(physicalName = "mngmt_region")
	    public String getMngmt_region(){
	        return mngmt_region;
	    }
	  
	    @ElVoField(physicalName = "mngmt_region")
	    public void setMngmt_region(String mngmt_region){
	        this.mngmt_region = mngmt_region;
	    }
	  
	    @ElVoField(physicalName = "mngmt_regionm")
	    public String getMngmt_regionm(){
	        return mngmt_regionm;
	    }
	  
	    @ElVoField(physicalName = "mngmt_regionm")
	    public void setMngmt_regionm(String mngmt_regionm){
	        this.mngmt_regionm = mngmt_regionm;
	    }
	  
	    @ElVoField(physicalName = "retire_ymd")
	    public String getRetire_ymd(){
	        return retire_ymd;
	    }
	  
	    @ElVoField(physicalName = "retire_ymd")
	    public void setRetire_ymd(String retire_ymd){
	        this.retire_ymd = retire_ymd;
	    }
	  
	  @Override
	  public String toString() {
	      StringBuilder sb = new StringBuilder();
	      sb.append("SupParPreCustMentoInfoVo [");
	      sb.append("cust_no").append("=").append(cust_no).append(",");
	      sb.append("syspayno").append("=").append(syspayno).append(",");
	      sb.append("empno").append("=").append(empno).append(",");
	      sb.append("nm").append("=").append(nm).append(",");
	      sb.append("dept_cd").append("=").append(dept_cd).append(",");
	      sb.append("dept_nm").append("=").append(dept_nm).append(",");
	      sb.append("posi_cd").append("=").append(posi_cd).append(",");
	      sb.append("posi_nm").append("=").append(posi_nm).append(",");
	      sb.append("region_centr").append("=").append(region_centr).append(",");
	      sb.append("mngmt_region").append("=").append(mngmt_region).append(",");
	      sb.append("mngmt_regionm").append("=").append(mngmt_regionm).append(",");
	      sb.append("retire_ymd").append("=").append(retire_ymd);
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
