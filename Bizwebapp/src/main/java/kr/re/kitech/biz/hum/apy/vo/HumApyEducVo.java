package kr.re.kitech.biz.hum.apy.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "HumApyEducVo")
public class HumApyEducVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public HumApyEducVo(){
  }

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;
  
    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;
    
    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;
  
    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;
  
    @ElDtoField(logicalName = "deptNm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;
  
    @ElDtoField(logicalName = "deptCd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;
  
    @ElDtoField(logicalName = "posiCd", physicalName = "posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_cd;
  
    @ElDtoField(logicalName = "jobCd", physicalName = "job_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_cd;
  
    @ElDtoField(logicalName = "posiNm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;
  
    @ElDtoField(logicalName = "reqYmd", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;
  
    @ElDtoField(logicalName = "cdNm", physicalName = "cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_nm;
  
    @ElDtoField(logicalName = "aprState", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;
  
    @ElDtoField(logicalName = "educCd", physicalName = "educ_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_cd;
  
    @ElDtoField(logicalName = "dutyEducComplt", physicalName = "duty_educ_complt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String duty_educ_complt;
  
    @ElDtoField(logicalName = "dutyEducCompltNm", physicalName = "duty_educ_complt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String duty_educ_complt_nm;
  
    @ElDtoField(logicalName = "overseaOpenYn", physicalName = "oversea_open_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String oversea_open_yn;
  
    @ElDtoField(logicalName = "educNm", physicalName = "educ_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_nm;
  
    @ElDtoField(logicalName = "mngmtItem2", physicalName = "mngmt_item_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_2;
  
    @ElDtoField(logicalName = "mngmtItem1", physicalName = "mngmt_item_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_1;
  
    @ElDtoField(logicalName = "educTyp", physicalName = "educ_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_typ;
  
    @ElDtoField(logicalName = "educTypNm", physicalName = "educ_typ_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_typ_nm;
  
    @ElDtoField(logicalName = "educCdNm", physicalName = "educ_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_cd_nm;
  
    @ElDtoField(logicalName = "educAgncy", physicalName = "educ_agncy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_agncy;
  
    @ElDtoField(logicalName = "educAmt", physicalName = "educ_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_amt;
  
    @ElDtoField(logicalName = "accntNo", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;
  
    @ElDtoField(logicalName = "accntCd", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;
  
    @ElDtoField(logicalName = "expnsCd", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd;
  
    @ElDtoField(logicalName = "startYmd", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;
  
    @ElDtoField(logicalName = "clsYmd", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;
  
    @ElDtoField(logicalName = "educTime", physicalName = "educ_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_time;
  
    @ElDtoField(logicalName = "educContnt", physicalName = "educ_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_contnt;
  
    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;
  
    @ElDtoField(logicalName = "rptReqNo", physicalName = "rpt_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_req_no;
  
    @ElDtoField(logicalName = "rptEducAmt", physicalName = "rpt_educ_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_educ_amt;
  
    @ElDtoField(logicalName = "rptReqYmd", physicalName = "rpt_req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_req_ymd;
  
    @ElDtoField(logicalName = "custSatisChart", physicalName = "cust_satis_chart", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cust_satis_chart;
  
    @ElDtoField(logicalName = "othrEmpRcmd", physicalName = "othr_emp_rcmd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String othr_emp_rcmd;
  
    @ElDtoField(logicalName = "addEducNeed", physicalName = "add_educ_need", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String add_educ_need;
  
    @ElDtoField(logicalName = "rptEducContnt", physicalName = "rpt_educ_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_educ_contnt;
  
    @ElDtoField(logicalName = "rptAttachFileNo", physicalName = "rpt_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_attach_file_no;
  
    @ElDtoField(logicalName = "accntNoNm", physicalName = "accnt_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_nm;
  
    @ElDtoField(logicalName = "expnsCdNm", physicalName = "expns_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd_nm;
  
    @ElDtoField(logicalName = "ctrlNo", physicalName = "ctrl_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctrl_no;
  
    @ElDtoField(logicalName = "rptAprState", physicalName = "rpt_apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_apr_state;
  
    @ElDtoField(logicalName = "rptAprStateNm", physicalName = "rpt_apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_apr_state_nm;
  
    @ElDtoField(logicalName = "accntRspns", physicalName = "accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns;
  
    @ElDtoField(logicalName = "bugtCtrlPsn", physicalName = "bugt_ctrl_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_psn;
  
    @ElDtoField(logicalName = "bugtCtrlPsnNm", physicalName = "bugt_ctrl_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_psn_nm;
  
    @ElDtoField(logicalName = "biztripReqNo", physicalName = "biztrip_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_req_no;
  
    @ElDtoField(logicalName = "isOnline", physicalName = "is_online", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String is_online;
    
    @ElDtoField(logicalName = "syspaynos", physicalName = "syspaynos", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspaynos;
  
    @ElDtoField(logicalName = "sumamt", physicalName = "sumamt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sumamt;
    
    @ElDtoField(logicalName = "amt_year", physicalName = "amt_year", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String amt_year;
    
    @ElDtoField(logicalName = "add_flg", physicalName = "add_flg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String add_flg;
    
    @ElDtoField(logicalName = "add_syspayno", physicalName = "add_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String add_syspayno;
    
    @ElDtoField(logicalName = "add_dept_cd", physicalName = "add_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String add_dept_cd;
    
    @ElDtoField(logicalName = "add_dept_new_ymd", physicalName = "add_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String add_dept_new_ymd;
    
    @ElDtoField(logicalName = "add_posi_cd", physicalName = "add_posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String add_posi_cd;
    
    @ElDtoField(logicalName = "add_duty_cd", physicalName = "add_duty_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String add_duty_cd;
    
    @ElDtoField(logicalName = "add_job_cd", physicalName = "add_job_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String add_job_cd;
    
    @ElDtoField(logicalName = "add_educ_amt", physicalName = "add_educ_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String add_educ_amt;
    
    @ElDtoField(logicalName = "add_start_ymd", physicalName = "add_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String add_start_ymd;
    
    @ElDtoField(logicalName = "add_cls_ymd", physicalName = "add_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String add_cls_ymd;
    
    @ElDtoField(logicalName = "add_educ_time", physicalName = "add_educ_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String add_educ_time;
    
    @ElDtoField(logicalName = "add_educ_contnt", physicalName = "add_educ_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String add_educ_contnt;
    
    @ElDtoField(logicalName = "service_id", physicalName = "service_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String service_id;
    
    @ElDtoField(logicalName = "attend_yn", physicalName = "attend_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attend_yn;
    
    @ElDtoField(logicalName = "dept_new_ymd", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;
    
    @ElDtoField(logicalName = "duty_cd", physicalName = "duty_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String duty_cd;
    
    @ElDtoField(logicalName = "add_rpt_educ_amt", physicalName = "add_rpt_educ_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String add_rpt_educ_amt;
    
    @ElDtoField(logicalName = "save_typ", physicalName = "save_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String save_typ;
    
    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;
    
    @ElDtoField(logicalName = "comments", physicalName = "comments", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String comments;
  
    @ElDtoField(logicalName = "edu_member", physicalName = "edu_member", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String edu_member;
    
    @ElDtoField(logicalName = "del_typ", physicalName = "del_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String del_typ;
    
    @ElDtoField(logicalName = "row_syspayno", physicalName = "row_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String row_syspayno;
    
    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }
  
    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }
  
    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }
  
    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }
    
    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }
  
    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }
  
    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }
  
    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }
  
    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }
  
    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }
  
    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }
  
    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }
  
    @ElVoField(physicalName = "posi_cd")
    public String getPosi_cd(){
        return posi_cd;
    }
  
    @ElVoField(physicalName = "posi_cd")
    public void setPosi_cd(String posi_cd){
        this.posi_cd = posi_cd;
    }
  
    @ElVoField(physicalName = "job_cd")
    public String getJob_cd(){
        return job_cd;
    }
  
    @ElVoField(physicalName = "job_cd")
    public void setJob_cd(String job_cd){
        this.job_cd = job_cd;
    }
  
    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }
  
    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }
  
    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }
  
    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }
  
    @ElVoField(physicalName = "cd_nm")
    public String getCd_nm(){
        return cd_nm;
    }
  
    @ElVoField(physicalName = "cd_nm")
    public void setCd_nm(String cd_nm){
        this.cd_nm = cd_nm;
    }
  
    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }
  
    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }
  
    @ElVoField(physicalName = "educ_cd")
    public String getEduc_cd(){
        return educ_cd;
    }
  
    @ElVoField(physicalName = "educ_cd")
    public void setEduc_cd(String educ_cd){
        this.educ_cd = educ_cd;
    }
  
    @ElVoField(physicalName = "duty_educ_complt")
    public String getDuty_educ_complt(){
        return duty_educ_complt;
    }
  
    @ElVoField(physicalName = "duty_educ_complt")
    public void setDuty_educ_complt(String duty_educ_complt){
        this.duty_educ_complt = duty_educ_complt;
    }
  
    @ElVoField(physicalName = "duty_educ_complt_nm")
    public String getDuty_educ_complt_nm(){
        return duty_educ_complt_nm;
    }
  
    @ElVoField(physicalName = "duty_educ_complt_nm")
    public void setDuty_educ_complt_nm(String duty_educ_complt_nm){
        this.duty_educ_complt_nm = duty_educ_complt_nm;
    }
  
    @ElVoField(physicalName = "oversea_open_yn")
    public String getOversea_open_yn(){
        return oversea_open_yn;
    }
  
    @ElVoField(physicalName = "oversea_open_yn")
    public void setOversea_open_yn(String oversea_open_yn){
        this.oversea_open_yn = oversea_open_yn;
    }
  
    @ElVoField(physicalName = "educ_nm")
    public String getEduc_nm(){
        return educ_nm;
    }
  
    @ElVoField(physicalName = "educ_nm")
    public void setEduc_nm(String educ_nm){
        this.educ_nm = educ_nm;
    }
  
    @ElVoField(physicalName = "mngmt_item_2")
    public String getMngmt_item_2(){
        return mngmt_item_2;
    }
  
    @ElVoField(physicalName = "mngmt_item_2")
    public void setMngmt_item_2(String mngmt_item_2){
        this.mngmt_item_2 = mngmt_item_2;
    }
  
    @ElVoField(physicalName = "mngmt_item_1")
    public String getMngmt_item_1(){
        return mngmt_item_1;
    }
  
    @ElVoField(physicalName = "mngmt_item_1")
    public void setMngmt_item_1(String mngmt_item_1){
        this.mngmt_item_1 = mngmt_item_1;
    }
  
    @ElVoField(physicalName = "educ_typ")
    public String getEduc_typ(){
        return educ_typ;
    }
  
    @ElVoField(physicalName = "educ_typ")
    public void setEduc_typ(String educ_typ){
        this.educ_typ = educ_typ;
    }
  
    @ElVoField(physicalName = "educ_typ_nm")
    public String getEduc_typ_nm(){
        return educ_typ_nm;
    }
  
    @ElVoField(physicalName = "educ_typ_nm")
    public void setEduc_typ_nm(String educ_typ_nm){
        this.educ_typ_nm = educ_typ_nm;
    }
  
    @ElVoField(physicalName = "educ_cd_nm")
    public String getEduc_cd_nm(){
        return educ_cd_nm;
    }
  
    @ElVoField(physicalName = "educ_cd_nm")
    public void setEduc_cd_nm(String educ_cd_nm){
        this.educ_cd_nm = educ_cd_nm;
    }
  
    @ElVoField(physicalName = "educ_agncy")
    public String getEduc_agncy(){
        return educ_agncy;
    }
  
    @ElVoField(physicalName = "educ_agncy")
    public void setEduc_agncy(String educ_agncy){
        this.educ_agncy = educ_agncy;
    }
  
    @ElVoField(physicalName = "educ_amt")
    public String getEduc_amt(){
        return educ_amt;
    }
  
    @ElVoField(physicalName = "educ_amt")
    public void setEduc_amt(String educ_amt){
        this.educ_amt = educ_amt;
    }
  
    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }
  
    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }
  
    @ElVoField(physicalName = "accnt_cd")
    public String getAccnt_cd(){
        return accnt_cd;
    }
  
    @ElVoField(physicalName = "accnt_cd")
    public void setAccnt_cd(String accnt_cd){
        this.accnt_cd = accnt_cd;
    }
  
    @ElVoField(physicalName = "expns_cd")
    public String getExpns_cd(){
        return expns_cd;
    }
  
    @ElVoField(physicalName = "expns_cd")
    public void setExpns_cd(String expns_cd){
        this.expns_cd = expns_cd;
    }
  
    @ElVoField(physicalName = "start_ymd")
    public String getStart_ymd(){
        return start_ymd;
    }
  
    @ElVoField(physicalName = "start_ymd")
    public void setStart_ymd(String start_ymd){
        this.start_ymd = start_ymd;
    }
  
    @ElVoField(physicalName = "cls_ymd")
    public String getCls_ymd(){
        return cls_ymd;
    }
  
    @ElVoField(physicalName = "cls_ymd")
    public void setCls_ymd(String cls_ymd){
        this.cls_ymd = cls_ymd;
    }
  
    @ElVoField(physicalName = "educ_time")
    public String getEduc_time(){
        return educ_time;
    }
  
    @ElVoField(physicalName = "educ_time")
    public void setEduc_time(String educ_time){
        this.educ_time = educ_time;
    }
  
    @ElVoField(physicalName = "educ_contnt")
    public String getEduc_contnt(){
        return educ_contnt;
    }
  
    @ElVoField(physicalName = "educ_contnt")
    public void setEduc_contnt(String educ_contnt){
        this.educ_contnt = educ_contnt;
    }
  
    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }
  
    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }
  
    @ElVoField(physicalName = "rpt_req_no")
    public String getRpt_req_no(){
        return rpt_req_no;
    }
  
    @ElVoField(physicalName = "rpt_req_no")
    public void setRpt_req_no(String rpt_req_no){
        this.rpt_req_no = rpt_req_no;
    }
  
    @ElVoField(physicalName = "rpt_educ_amt")
    public String getRpt_educ_amt(){
        return rpt_educ_amt;
    }
  
    @ElVoField(physicalName = "rpt_educ_amt")
    public void setRpt_educ_amt(String rpt_educ_amt){
        this.rpt_educ_amt = rpt_educ_amt;
    }
  
    @ElVoField(physicalName = "rpt_req_ymd")
    public String getRpt_req_ymd(){
        return rpt_req_ymd;
    }
  
    @ElVoField(physicalName = "rpt_req_ymd")
    public void setRpt_req_ymd(String rpt_req_ymd){
        this.rpt_req_ymd = rpt_req_ymd;
    }
  
    @ElVoField(physicalName = "cust_satis_chart")
    public String getCust_satis_chart(){
        return cust_satis_chart;
    }
  
    @ElVoField(physicalName = "cust_satis_chart")
    public void setCust_satis_chart(String cust_satis_chart){
        this.cust_satis_chart = cust_satis_chart;
    }
  
    @ElVoField(physicalName = "othr_emp_rcmd")
    public String getOthr_emp_rcmd(){
        return othr_emp_rcmd;
    }
  
    @ElVoField(physicalName = "othr_emp_rcmd")
    public void setOthr_emp_rcmd(String othr_emp_rcmd){
        this.othr_emp_rcmd = othr_emp_rcmd;
    }
  
    @ElVoField(physicalName = "add_educ_need")
    public String getAdd_educ_need(){
        return add_educ_need;
    }
  
    @ElVoField(physicalName = "add_educ_need")
    public void setAdd_educ_need(String add_educ_need){
        this.add_educ_need = add_educ_need;
    }
  
    @ElVoField(physicalName = "rpt_educ_contnt")
    public String getRpt_educ_contnt(){
        return rpt_educ_contnt;
    }
  
    @ElVoField(physicalName = "rpt_educ_contnt")
    public void setRpt_educ_contnt(String rpt_educ_contnt){
        this.rpt_educ_contnt = rpt_educ_contnt;
    }
  
    @ElVoField(physicalName = "rpt_attach_file_no")
    public String getRpt_attach_file_no(){
        return rpt_attach_file_no;
    }
  
    @ElVoField(physicalName = "rpt_attach_file_no")
    public void setRpt_attach_file_no(String rpt_attach_file_no){
        this.rpt_attach_file_no = rpt_attach_file_no;
    }
  
    @ElVoField(physicalName = "accnt_no_nm")
    public String getAccnt_no_nm(){
        return accnt_no_nm;
    }
  
    @ElVoField(physicalName = "accnt_no_nm")
    public void setAccnt_no_nm(String accnt_no_nm){
        this.accnt_no_nm = accnt_no_nm;
    }
  
    @ElVoField(physicalName = "expns_cd_nm")
    public String getExpns_cd_nm(){
        return expns_cd_nm;
    }
  
    @ElVoField(physicalName = "expns_cd_nm")
    public void setExpns_cd_nm(String expns_cd_nm){
        this.expns_cd_nm = expns_cd_nm;
    }
  
    @ElVoField(physicalName = "ctrl_no")
    public String getCtrl_no(){
        return ctrl_no;
    }
  
    @ElVoField(physicalName = "ctrl_no")
    public void setCtrl_no(String ctrl_no){
        this.ctrl_no = ctrl_no;
    }
  
    @ElVoField(physicalName = "rpt_apr_state")
    public String getRpt_apr_state(){
        return rpt_apr_state;
    }
  
    @ElVoField(physicalName = "rpt_apr_state")
    public void setRpt_apr_state(String rpt_apr_state){
        this.rpt_apr_state = rpt_apr_state;
    }
  
    @ElVoField(physicalName = "rpt_apr_state_nm")
    public String getRpt_apr_state_nm(){
        return rpt_apr_state_nm;
    }
  
    @ElVoField(physicalName = "rpt_apr_state_nm")
    public void setRpt_apr_state_nm(String rpt_apr_state_nm){
        this.rpt_apr_state_nm = rpt_apr_state_nm;
    }
  
    @ElVoField(physicalName = "accnt_rspns")
    public String getAccnt_rspns(){
        return accnt_rspns;
    }
  
    @ElVoField(physicalName = "accnt_rspns")
    public void setAccnt_rspns(String accnt_rspns){
        this.accnt_rspns = accnt_rspns;
    }
  
    @ElVoField(physicalName = "bugt_ctrl_psn")
    public String getBugt_ctrl_psn(){
        return bugt_ctrl_psn;
    }
  
    @ElVoField(physicalName = "bugt_ctrl_psn")
    public void setBugt_ctrl_psn(String bugt_ctrl_psn){
        this.bugt_ctrl_psn = bugt_ctrl_psn;
    }
  
    @ElVoField(physicalName = "bugt_ctrl_psn_nm")
    public String getBugt_ctrl_psn_nm(){
        return bugt_ctrl_psn_nm;
    }
  
    @ElVoField(physicalName = "bugt_ctrl_psn_nm")
    public void setBugt_ctrl_psn_nm(String bugt_ctrl_psn_nm){
        this.bugt_ctrl_psn_nm = bugt_ctrl_psn_nm;
    }
  
    @ElVoField(physicalName = "biztrip_req_no")
    public String getBiztrip_req_no(){
        return biztrip_req_no;
    }
  
    @ElVoField(physicalName = "biztrip_req_no")
    public void setBiztrip_req_no(String biztrip_req_no){
        this.biztrip_req_no = biztrip_req_no;
    }
  
    @ElVoField(physicalName = "is_online")
    public String getIs_online(){
        return is_online;
    }
  
    @ElVoField(physicalName = "is_online")
    public void setIs_online(String is_online){
        this.is_online = is_online;
    }
    
    @ElVoField(physicalName = "syspaynos")
    public String getSyspaynos(){
        return syspaynos;
    }
  
    @ElVoField(physicalName = "syspaynos")
    public void setSyspaynos(String syspaynos){
        this.syspaynos = syspaynos;
    }
    
    @ElVoField(physicalName = "sumamt")
    public String getSumamt(){
        return sumamt;
    }
  
    @ElVoField(physicalName = "sumamt")
    public void setSumamt(String sumamt){
        this.sumamt = sumamt;
    }
  
    @ElVoField(physicalName = "amt_year")
    public String getAmt_year(){
        return amt_year;
    }
  
    @ElVoField(physicalName = "amt_year")
    public void setAmt_year(String amt_year){
        this.amt_year = amt_year;
    }
    
    @ElVoField(physicalName = "add_flg")
    public String getAdd_flg(){
        return add_flg;
    }
  
    @ElVoField(physicalName = "add_flg")
    public void setAdd_flg(String add_flg){
        this.add_flg = add_flg;
    }
    
    @ElVoField(physicalName = "add_syspayno")
    public String getAdd_syspayno(){
        return add_syspayno;
    }
  
    @ElVoField(physicalName = "add_syspayno")
    public void setAdd_syspayno(String add_syspayno){
        this.add_syspayno = add_syspayno;
    }
    
    @ElVoField(physicalName = "add_dept_cd")
    public String getAdd_dept_cd(){
        return add_dept_cd;
    }
  
    @ElVoField(physicalName = "add_dept_cd")
    public void setadd_dept_cd(String add_dept_cd){
        this.add_dept_cd = add_dept_cd;
    }
    
    @ElVoField(physicalName = "add_dept_new_ymd")
    public String getAdd_dept_new_ymd(){
        return add_dept_new_ymd;
    }
  
    @ElVoField(physicalName = "add_dept_new_ymd")
    public void setAdd_dept_new_ymd(String add_dept_new_ymd){
        this.add_dept_new_ymd = add_dept_new_ymd;
    }
    
    @ElVoField(physicalName = "add_posi_cd")
    public String getAdd_posi_cd(){
        return add_posi_cd;
    }
  
    @ElVoField(physicalName = "add_posi_cd")
    public void setAdd_posi_cd(String add_posi_cd){
        this.add_posi_cd = add_posi_cd;
    }
    
    @ElVoField(physicalName = "add_duty_cd")
    public String getAdd_duty_cd(){
        return add_duty_cd;
    }
  
    @ElVoField(physicalName = "add_duty_cd")
    public void setAdd_duty_cd(String add_duty_cd){
        this.add_duty_cd = add_duty_cd;
    }
    
    @ElVoField(physicalName = "add_job_cd")
    public String getAdd_job_cd(){
        return add_job_cd;
    }
  
    @ElVoField(physicalName = "add_job_cd")
    public void setAdd_job_cd(String add_job_cd){
        this.add_job_cd = add_job_cd;
    }
    
    @ElVoField(physicalName = "add_educ_amt")
    public String getAdd_educ_amt(){
        return add_educ_amt;
    }
  
    @ElVoField(physicalName = "add_educ_amt")
    public void setAdd_educ_amt(String add_educ_amt){
        this.add_educ_amt = add_educ_amt;
    }
    
    @ElVoField(physicalName = "add_start_ymd")
    public String getAdd_start_ymd(){
        return add_start_ymd;
    }
  
    @ElVoField(physicalName = "add_start_ymd")
    public void setAdd_start_ymd(String add_start_ymd){
        this.add_start_ymd = add_start_ymd;
    }
    
    @ElVoField(physicalName = "add_cls_ymd")
    public String getAdd_cls_ymd(){
        return add_cls_ymd;
    }
  
    @ElVoField(physicalName = "add_cls_ymd")
    public void setAdd_cls_ymd(String add_cls_ymd){
        this.add_cls_ymd = add_cls_ymd;
    }
    
    @ElVoField(physicalName = "add_educ_time")
    public String getAdd_educ_time(){
        return add_educ_time;
    }
  
    @ElVoField(physicalName = "add_educ_time")
    public void setAdd_educ_time(String add_educ_time){
        this.add_educ_time = add_educ_time;
    }
    
    @ElVoField(physicalName = "add_educ_contnt")
    public String getAdd_educ_contnt(){
        return add_educ_contnt;
    }
  
    @ElVoField(physicalName = "add_educ_contnt")
    public void setAdd_educ_contnt(String add_educ_contnt){
        this.add_educ_contnt = add_educ_contnt;
    }

    @ElVoField(physicalName = "service_id")
    public String getServiceId(){
        return service_id;
    }
  
    @ElVoField(physicalName = "service_id")
    public void setServiceId(String service_id){
        this.service_id = service_id;
    }
    
    @ElVoField(physicalName = "attend_yn")
    public String getAttend_yn(){
        return attend_yn;
    }
  
    @ElVoField(physicalName = "attend_yn")
    public void setAttend_yn(String attend_yn){
        this.attend_yn = attend_yn;
    }
    
    @ElVoField(physicalName = "dept_new_ymd")
    public String getDept_new_ymd(){
        return dept_new_ymd;
    }
  
    @ElVoField(physicalName = "dept_new_ymd")
    public void setDept_new_ymd(String dept_new_ymd){
        this.dept_new_ymd = dept_new_ymd;
    }
    
    @ElVoField(physicalName = "duty_cd")
    public String getDuty_cd(){
        return duty_cd;
    }
  
    @ElVoField(physicalName = "duty_cd")
    public void setDuty_cd(String duty_cd){
        this.duty_cd = duty_cd;
    }
    
    @ElVoField(physicalName = "add_rpt_educ_amt")
    public String getAdd_rpt_educ_amt(){
        return add_rpt_educ_amt;
    }
  
    @ElVoField(physicalName = "add_rpt_educ_amt")
    public void setAdd_rpt_educ_amt(String add_rpt_educ_amt){
        this.add_rpt_educ_amt = add_rpt_educ_amt;
    }
    
    @ElVoField(physicalName = "save_typ")
    public String getSave_typ(){
        return save_typ;
    }
  
    @ElVoField(physicalName = "save_typ")
    public void setSave_typ(String save_typ){
        this.save_typ = save_typ;
    }
    
    @ElVoField(physicalName = "fileList")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList(){
        return fileList;
    }

    @ElVoField(physicalName = "fileList")
    public void setFileList(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList){
        this.fileList = fileList;
    }
    
    @ElVoField(physicalName = "comments")
    public String getComments(){
        return comments;
    }

    @ElVoField(physicalName = "comments")
    public void setComments(String comments){
        this.comments = comments;
    }
    
    @ElVoField(physicalName = "edu_member")
    public String getEdu_member(){
        return edu_member;
    }

    @ElVoField(physicalName = "edu_member")
    public void setEdu_member(String edu_member){
        this.edu_member = edu_member;
    }
    
    @ElVoField(physicalName = "del_typ")
    public String getDel_typ(){
        return del_typ;
    }

    @ElVoField(physicalName = "del_typ")
    public void setDel_typ(String del_typ){
        this.del_typ = del_typ;
    }
    
    @ElVoField(physicalName = "row_syspayno")
    public String getRow_syspayno(){
        return row_syspayno;
    }

    @ElVoField(physicalName = "row_syspayno")
    public void setRow_syspayno(String row_syspayno){
        this.row_syspayno = row_syspayno;
    }
    
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("HumApyEducVo [");
      sb.append("req_no").append("=").append(req_no).append(",");
      sb.append("nm").append("=").append(nm).append(",");
      sb.append("empno").append("=").append(empno).append(",");
      sb.append("dept_nm").append("=").append(dept_nm).append(",");
      sb.append("dept_cd").append("=").append(dept_cd).append(",");
      sb.append("posi_cd").append("=").append(posi_cd).append(",");
      sb.append("job_cd").append("=").append(job_cd).append(",");
      sb.append("posi_nm").append("=").append(posi_nm).append(",");
      sb.append("syspayno").append("=").append(syspayno).append(",");
      sb.append("req_ymd").append("=").append(req_ymd).append(",");
      sb.append("cd_nm").append("=").append(cd_nm).append(",");
      sb.append("apr_state").append("=").append(apr_state).append(",");
      sb.append("educ_cd").append("=").append(educ_cd).append(",");
      sb.append("duty_educ_complt").append("=").append(duty_educ_complt).append(",");
      sb.append("duty_educ_complt_nm").append("=").append(duty_educ_complt_nm).append(",");
      sb.append("oversea_open_yn").append("=").append(oversea_open_yn).append(",");
      sb.append("educ_nm").append("=").append(educ_nm).append(",");
      sb.append("mngmt_item_2").append("=").append(mngmt_item_2).append(",");
      sb.append("mngmt_item_1").append("=").append(mngmt_item_1).append(",");
      sb.append("educ_typ").append("=").append(educ_typ).append(",");
      sb.append("educ_typ_nm").append("=").append(educ_typ_nm).append(",");
      sb.append("educ_cd_nm").append("=").append(educ_cd_nm).append(",");
      sb.append("educ_agncy").append("=").append(educ_agncy).append(",");
      sb.append("educ_amt").append("=").append(educ_amt).append(",");
      sb.append("accnt_no").append("=").append(accnt_no).append(",");
      sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
      sb.append("expns_cd").append("=").append(expns_cd).append(",");
      sb.append("start_ymd").append("=").append(start_ymd).append(",");
      sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
      sb.append("educ_time").append("=").append(educ_time).append(",");
      sb.append("educ_contnt").append("=").append(educ_contnt).append(",");
      sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
      sb.append("rpt_req_no").append("=").append(rpt_req_no).append(",");
      sb.append("rpt_educ_amt").append("=").append(rpt_educ_amt).append(",");
      sb.append("rpt_req_ymd").append("=").append(rpt_req_ymd).append(",");
      sb.append("cust_satis_chart").append("=").append(cust_satis_chart).append(",");
      sb.append("othr_emp_rcmd").append("=").append(othr_emp_rcmd).append(",");
      sb.append("add_educ_need").append("=").append(add_educ_need).append(",");
      sb.append("rpt_educ_contnt").append("=").append(rpt_educ_contnt).append(",");
      sb.append("rpt_attach_file_no").append("=").append(rpt_attach_file_no).append(",");
      sb.append("accnt_no_nm").append("=").append(accnt_no_nm).append(",");
      sb.append("expns_cd_nm").append("=").append(expns_cd_nm).append(",");
      sb.append("ctrl_no").append("=").append(ctrl_no).append(",");
      sb.append("rpt_apr_state").append("=").append(rpt_apr_state).append(",");
      sb.append("rpt_apr_state_nm").append("=").append(rpt_apr_state_nm).append(",");
      sb.append("accnt_rspns").append("=").append(accnt_rspns).append(",");
      sb.append("bugt_ctrl_psn").append("=").append(bugt_ctrl_psn).append(",");
      sb.append("bugt_ctrl_psn_nm").append("=").append(bugt_ctrl_psn_nm).append(",");
      sb.append("biztrip_req_no").append("=").append(biztrip_req_no).append(",");
      sb.append("is_online").append("=").append(is_online).append(",");
      sb.append("syspaynos").append("=").append(syspaynos).append(",");
      sb.append("sumamt").append("=").append(sumamt).append(",");
      sb.append("amt_year").append("=").append(amt_year);
      sb.append("add_flg").append("=").append(add_flg).append(",");
      sb.append("add_syspayno").append("=").append(add_syspayno).append(",");
      sb.append("add_dept_cd").append("=").append(add_dept_cd).append(",");
      sb.append("add_dept_new_ymd").append("=").append(add_dept_new_ymd).append(",");
      sb.append("add_posi_cd").append("=").append(add_posi_cd).append(",");
      sb.append("add_duty_cd").append("=").append(add_duty_cd).append(",");
      sb.append("add_job_cd").append("=").append(add_job_cd).append(",");
      sb.append("add_educ_amt").append("=").append(add_educ_amt).append(",");
      sb.append("add_start_ymd").append("=").append(add_start_ymd).append(",");
      sb.append("add_cls_ymd").append("=").append(add_cls_ymd).append(",");
      sb.append("add_educ_time").append("=").append(add_educ_time).append(",");      
      sb.append("add_educ_contnt").append("=").append(add_educ_contnt).append(",");      
      sb.append("service_id").append("=").append(service_id).append(",");      
      sb.append("attend_yn").append("=").append(attend_yn).append(",");   
      sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");   
      sb.append("duty_cd").append("=").append(duty_cd).append(",");
      sb.append("add_rpt_educ_amt").append("=").append(add_rpt_educ_amt).append(",");
      sb.append("save_typ").append("=").append(save_typ).append(",");
      sb.append("fileList").append("=").append(fileList).append(",");
      sb.append("comments").append("=").append(comments).append(",");
      sb.append("edu_member").append("=").append(edu_member).append(",");
      sb.append("del_typ").append("=").append(del_typ).append(",");
      sb.append("row_syspayno").append("=").append(row_syspayno);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }

  @Override
  public void _xStreamEnc() {
	  for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
          kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
          vo._xStreamEnc();	 
      }
  }

  @Override
  public void _xStreamDec() {
	  for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
          kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
          vo._xStreamDec();	 
      }
  }





}