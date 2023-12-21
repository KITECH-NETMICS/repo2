package kr.re.kitech.biz.sup.tlt.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "SptTltActivRptDetailExp")
public class SptTltActivRptDetailVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public SptTltActivRptDetailVo(){
  }
  
  	@ElDtoField(logicalName = "활동보고서 Vo", physicalName = "SptTltActivRptVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  	private kr.re.kitech.biz.sup.tlt.vo.SptTltActivRptVo SptTltActivRptVo;
  
  	@ElDtoField(logicalName = "당월실적 목록 Vo", physicalName = "SptTltActivMonthRptVoList", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  	private java.util.List<kr.re.kitech.biz.sup.tlt.vo.SptTltActivMonthRptVo> SptTltActivMonthRptVoList;
  
  	@ElDtoField(logicalName = "익월목표 목록 Vo", physicalName = "SptTltActivMonthPlnVoList", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  	private java.util.List<kr.re.kitech.biz.sup.tlt.vo.SptTltActivMonthPlnVo> SptTltActivMonthPlnVoList;
  
  	@ElDtoField(logicalName = "기업 목록 Vo", physicalName = "SptDisPatchPrcondVoList", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  	private java.util.List<kr.re.kitech.biz.sup.tlt.vo.SptDisPatchPrcondVo> SptDisPatchPrcondVoList;
  	
  	@ElDtoField(logicalName = "부서 목록 Vo", physicalName = "SptTltXodhDeptInfoVoList", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  	private java.util.List<kr.re.kitech.biz.sup.tlt.vo.SptTltXodhDeptInfoVo> SptTltXodhDeptInfoVoList;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "fileList_A", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_A;
  
	@ElVoField(physicalName = "SptTltActivRptVo")
	public kr.re.kitech.biz.sup.tlt.vo.SptTltActivRptVo getSptTltActivRptVo(){
	    return SptTltActivRptVo;
	}
	
	@ElVoField(physicalName = "SptTltActivRptVo")
	public void setSptTltActivRptVo(kr.re.kitech.biz.sup.tlt.vo.SptTltActivRptVo SptTltActivRptVo){
	    this.SptTltActivRptVo = SptTltActivRptVo;
	}
	
	@ElVoField(physicalName = "SptTltActivMonthRptVoList")
	public java.util.List<kr.re.kitech.biz.sup.tlt.vo.SptTltActivMonthRptVo> getSptTltActivMonthRptVoList(){
		return SptTltActivMonthRptVoList;
	}
	
	@ElVoField(physicalName = "SptTltActivMonthRptVoList")
	public void setSptTltActivMonthRptVoList(java.util.List<kr.re.kitech.biz.sup.tlt.vo.SptTltActivMonthRptVo> SptTltActivMonthRptVoList){
		this.SptTltActivMonthRptVoList = SptTltActivMonthRptVoList;
	}
	
	@ElVoField(physicalName = "SptTltActivMonthPlnVoList")
	public java.util.List<kr.re.kitech.biz.sup.tlt.vo.SptTltActivMonthPlnVo> getSptTltActivMonthPlnVoList(){
		return SptTltActivMonthPlnVoList;
	}
	
	@ElVoField(physicalName = "SptTltActivMonthPlnVoList")
	public void setSptTltActivMonthPlnVoList(java.util.List<kr.re.kitech.biz.sup.tlt.vo.SptTltActivMonthPlnVo> SptTltActivMonthPlnVoList){
		this.SptTltActivMonthPlnVoList = SptTltActivMonthPlnVoList;
	}
	
	@ElVoField(physicalName = "SptDisPatchPrcondVoList")
	public java.util.List<kr.re.kitech.biz.sup.tlt.vo.SptDisPatchPrcondVo> getSptDisPatchPrcondVoList(){
		return SptDisPatchPrcondVoList;
	}
	
	@ElVoField(physicalName = "SptDisPatchPrcondVoList")
	public void setSptDisPatchPrcondVoList(java.util.List<kr.re.kitech.biz.sup.tlt.vo.SptDisPatchPrcondVo> SptDisPatchPrcondVoList){
		this.SptDisPatchPrcondVoList = SptDisPatchPrcondVoList;
	}
	
	@ElVoField(physicalName = "SptTltXodhDeptInfoVoList")
	public java.util.List<kr.re.kitech.biz.sup.tlt.vo.SptTltXodhDeptInfoVo> getSptTltXodhDeptInfoVoList(){
		return SptTltXodhDeptInfoVoList;
	}
	
	@ElVoField(physicalName = "SptTltXodhDeptInfoVoList")
	public void setSptTltXodhDeptInfoVoList(java.util.List<kr.re.kitech.biz.sup.tlt.vo.SptTltXodhDeptInfoVo> SptTltXodhDeptInfoVoList){
		this.SptTltXodhDeptInfoVoList = SptTltXodhDeptInfoVoList;
	}

    @ElVoField(physicalName = "fileList_A")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList_A(){
        return fileList_A;
    }

    @ElVoField(physicalName = "fileList_A")
    public void setFileList_A(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_A){
        this.fileList_A = fileList_A;
    }
    
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("SptTltActivRptDetailVo [");
      sb.append("fileList_A").append("=").append(fileList_A).append(",");
      sb.append("SptTltXodhDeptInfoVoList").append("=").append(SptTltXodhDeptInfoVoList).append(",");
      sb.append("SptDisPatchPrcondVoList").append("=").append(SptDisPatchPrcondVoList).append(",");
      sb.append("SptTltActivMonthPlnVoList").append("=").append(SptTltActivMonthPlnVoList).append(",");
      sb.append("SptTltActivMonthRptVoList").append("=").append(SptTltActivMonthRptVoList).append(",");
      sb.append("SptTltActivRptVo").append("=").append(SptTltActivRptVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }

  @Override
  public void _xStreamEnc() {
        for( int i=0 ; fileList_A != null && i < fileList_A.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_A.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; SptTltXodhDeptInfoVoList != null && i < SptTltXodhDeptInfoVoList.size() ; i++ ) {
        	kr.re.kitech.biz.sup.tlt.vo.SptTltXodhDeptInfoVo vo = (kr.re.kitech.biz.sup.tlt.vo.SptTltXodhDeptInfoVo)SptTltXodhDeptInfoVoList.get(i);
        	vo._xStreamEnc();	 
        }
        for( int i=0 ; SptDisPatchPrcondVoList != null && i < SptDisPatchPrcondVoList.size() ; i++ ) {
        	kr.re.kitech.biz.sup.tlt.vo.SptDisPatchPrcondVo vo = (kr.re.kitech.biz.sup.tlt.vo.SptDisPatchPrcondVo)SptDisPatchPrcondVoList.get(i);
        	vo._xStreamEnc();	 
        }
        for( int i=0 ; SptTltActivMonthPlnVoList != null && i < SptTltActivMonthPlnVoList.size() ; i++ ) {
            kr.re.kitech.biz.sup.tlt.vo.SptTltActivMonthPlnVo vo = (kr.re.kitech.biz.sup.tlt.vo.SptTltActivMonthPlnVo)SptTltActivMonthPlnVoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; SptTltActivMonthRptVoList != null && i < SptTltActivMonthRptVoList.size() ; i++ ) {
        	kr.re.kitech.biz.sup.tlt.vo.SptTltActivMonthRptVo vo = (kr.re.kitech.biz.sup.tlt.vo.SptTltActivMonthRptVo)SptTltActivMonthRptVoList.get(i);
        	vo._xStreamEnc();	 
        }
        if( this.SptTltActivRptVo != null ) this.SptTltActivRptVo._xStreamEnc();
  }

  @Override
  public void _xStreamDec() {
        for( int i=0 ; fileList_A != null && i < fileList_A.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_A.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; SptTltXodhDeptInfoVoList != null && i < SptTltXodhDeptInfoVoList.size() ; i++ ) {
        	kr.re.kitech.biz.sup.tlt.vo.SptTltXodhDeptInfoVo vo = (kr.re.kitech.biz.sup.tlt.vo.SptTltXodhDeptInfoVo)SptTltXodhDeptInfoVoList.get(i);
        	vo._xStreamDec();	 
        }
        for( int i=0 ; SptDisPatchPrcondVoList != null && i < SptDisPatchPrcondVoList.size() ; i++ ) {
        	kr.re.kitech.biz.sup.tlt.vo.SptDisPatchPrcondVo vo = (kr.re.kitech.biz.sup.tlt.vo.SptDisPatchPrcondVo)SptDisPatchPrcondVoList.get(i);
        	vo._xStreamDec();	 
        }
        for( int i=0 ; SptTltActivMonthRptVoList != null && i < SptTltActivMonthRptVoList.size() ; i++ ) {
            kr.re.kitech.biz.sup.tlt.vo.SptTltActivMonthRptVo vo = (kr.re.kitech.biz.sup.tlt.vo.SptTltActivMonthRptVo)SptTltActivMonthRptVoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; SptTltActivMonthPlnVoList != null && i < SptTltActivMonthPlnVoList.size() ; i++ ) {
        	kr.re.kitech.biz.sup.tlt.vo.SptTltActivMonthPlnVo vo = (kr.re.kitech.biz.sup.tlt.vo.SptTltActivMonthPlnVo)SptTltActivMonthPlnVoList.get(i);
        	vo._xStreamDec();	 
        }
        if( this.SptTltActivRptVo != null ) this.SptTltActivRptVo._xStreamDec();
  }
}