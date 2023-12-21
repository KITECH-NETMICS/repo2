package kr.re.kitech.biz.ass.eqip.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "연구장비집행신청Vo")
public class ResEquipFeeReqVo extends kr.re.kitech.biz.fin.com.vo.ComReqVo {
    private static final long serialVersionUID = 1L;

    public ResEquipFeeReqVo(){
    }

    @ElDtoField(logicalName = "신청자", physicalName = "req_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn;

    @ElDtoField(logicalName = "신청일자", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "통합관리단위", physicalName = "intgr_mngmt_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intgr_mngmt_unit;

    @ElDtoField(logicalName = "통합관리단위명", physicalName = "intgr_mngmt_unit_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intgr_mngmt_unit_nm;

    @ElDtoField(logicalName = "계정책임자", physicalName = "accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns;

    @ElDtoField(logicalName = "비용코드", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd;

    @ElDtoField(logicalName = "사용용도", physicalName = "expns_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd_nm;

    @ElDtoField(logicalName = "자산번호", physicalName = "aset_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_no;

    @ElDtoField(logicalName = "신청자정보", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm;

    @ElDtoField(logicalName = "신청지역", physicalName = "req_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_region;

    @ElDtoField(logicalName = "신청지역명", physicalName = "req_region_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_region_nm;

    @ElDtoField(logicalName = "심의명", physicalName = "rvew_sbj", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rvew_sbj;

    @ElDtoField(logicalName = "심의결과", physicalName = "rvew_rst_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rvew_rst_cd;

    @ElDtoField(logicalName = "집행확인1", physicalName = "enfrc_chk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String enfrc_chk;

    @ElDtoField(logicalName = "집행확인2", physicalName = "enfrc_chk2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String enfrc_chk2;

    @ElDtoField(logicalName = "연구시설장비비 집행의 필요성", physicalName = "enfrc_ncsst", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String enfrc_ncsst;

    @ElDtoField(logicalName = "해당 연구시설장비의 활용성", physicalName = "enfrc_use", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String enfrc_use;

    @ElDtoField(logicalName = "첨부파일", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "승인금액", physicalName = "appr_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long appr_amt;

    @ElDtoField(logicalName = "심의일자", physicalName = "rvew_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rvew_ymd;

    @ElDtoField(logicalName = "자산명", physicalName = "aset_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_nm;

    @ElDtoField(logicalName = "제우스장비번호", physicalName = "ntis_reg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ntis_reg_no;

    @ElDtoField(logicalName = "적요", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "신청년도", physicalName = "req_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_yr;

    @ElDtoField(logicalName = "재원", physicalName = "finnc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String finnc;

    @ElDtoField(logicalName = "성명", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "개인번호", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "통합계정 개인번호", physicalName = "relat_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat_no;

    @ElDtoField(logicalName = "추가승인한도", physicalName = "add_lmt_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long add_lmt_amt;

    @ElDtoField(logicalName = "추가금액", physicalName = "impt_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long impt_amt;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "계정책임자명", physicalName = "accnt_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_nm;

    @ElDtoField(logicalName = "계정책임자개인번호", physicalName = "accnt_rspns_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_empno;

    @ElDtoField(logicalName = "과학기술인번호", physicalName = "sci_tech_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sci_tech_regst_no;

    @ElDtoField(logicalName = "계정명", physicalName = "accnt_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_nm;

    @ElDtoField(logicalName = "신청금액", physicalName = "req_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long req_amt;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "담당자", physicalName = "user_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_nm;

    @ElDtoField(logicalName = "책임자", physicalName = "depthed_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depthed_nm;

    @ElDtoField(logicalName = "도입일자", physicalName = "intro_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intro_ymd;

    @ElDtoField(logicalName = "도입금액", physicalName = "intro_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long intro_amt;

    @ElDtoField(logicalName = "자산국문명", physicalName = "aset_kor_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_kor_nm;

    @ElDtoField(logicalName = "자산영문명", physicalName = "aset_eng_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_eng_nm;

    @ElDtoField(logicalName = "자산설치장소", physicalName = "posi_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_addr;

    @ElDtoField(logicalName = "심의비고", physicalName = "rmk_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk_2;

    @ElDtoField(logicalName = "심의첨부파일", physicalName = "rst_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rst_attach_file_no;

    @ElDtoField(logicalName = "입력저장구분", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "에산연도", physicalName = "bugt_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_yr;

    @ElVoField(physicalName = "req_psn")
    public String getReq_psn(){
        return req_psn;
    }

    @ElVoField(physicalName = "req_psn")
    public void setReq_psn(String req_psn){
        this.req_psn = req_psn;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "intgr_mngmt_unit")
    public String getIntgr_mngmt_unit(){
        return intgr_mngmt_unit;
    }

    @ElVoField(physicalName = "intgr_mngmt_unit")
    public void setIntgr_mngmt_unit(String intgr_mngmt_unit){
        this.intgr_mngmt_unit = intgr_mngmt_unit;
    }

    @ElVoField(physicalName = "intgr_mngmt_unit_nm")
    public String getIntgr_mngmt_unit_nm(){
        return intgr_mngmt_unit_nm;
    }

    @ElVoField(physicalName = "intgr_mngmt_unit_nm")
    public void setIntgr_mngmt_unit_nm(String intgr_mngmt_unit_nm){
        this.intgr_mngmt_unit_nm = intgr_mngmt_unit_nm;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public String getAccnt_rspns(){
        return accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public void setAccnt_rspns(String accnt_rspns){
        this.accnt_rspns = accnt_rspns;
    }

    @ElVoField(physicalName = "expns_cd")
    public String getExpns_cd(){
        return expns_cd;
    }

    @ElVoField(physicalName = "expns_cd")
    public void setExpns_cd(String expns_cd){
        this.expns_cd = expns_cd;
    }

    @ElVoField(physicalName = "expns_cd_nm")
    public String getExpns_cd_nm(){
        return expns_cd_nm;
    }

    @ElVoField(physicalName = "expns_cd_nm")
    public void setExpns_cd_nm(String expns_cd_nm){
        this.expns_cd_nm = expns_cd_nm;
    }

    @ElVoField(physicalName = "aset_no")
    public String getAset_no(){
        return aset_no;
    }

    @ElVoField(physicalName = "aset_no")
    public void setAset_no(String aset_no){
        this.aset_no = aset_no;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public String getReq_psn_nm(){
        return req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public void setReq_psn_nm(String req_psn_nm){
        this.req_psn_nm = req_psn_nm;
    }

    @ElVoField(physicalName = "req_region")
    public String getReq_region(){
        return req_region;
    }

    @ElVoField(physicalName = "req_region")
    public void setReq_region(String req_region){
        this.req_region = req_region;
    }

    @ElVoField(physicalName = "req_region_nm")
    public String getReq_region_nm(){
        return req_region_nm;
    }

    @ElVoField(physicalName = "req_region_nm")
    public void setReq_region_nm(String req_region_nm){
        this.req_region_nm = req_region_nm;
    }

    @ElVoField(physicalName = "rvew_sbj")
    public String getRvew_sbj(){
        return rvew_sbj;
    }

    @ElVoField(physicalName = "rvew_sbj")
    public void setRvew_sbj(String rvew_sbj){
        this.rvew_sbj = rvew_sbj;
    }

    @ElVoField(physicalName = "rvew_rst_cd")
    public String getRvew_rst_cd(){
        return rvew_rst_cd;
    }

    @ElVoField(physicalName = "rvew_rst_cd")
    public void setRvew_rst_cd(String rvew_rst_cd){
        this.rvew_rst_cd = rvew_rst_cd;
    }

    @ElVoField(physicalName = "enfrc_chk")
    public String getEnfrc_chk(){
        return enfrc_chk;
    }

    @ElVoField(physicalName = "enfrc_chk")
    public void setEnfrc_chk(String enfrc_chk){
        this.enfrc_chk = enfrc_chk;
    }

    @ElVoField(physicalName = "enfrc_chk2")
    public String getEnfrc_chk2(){
        return enfrc_chk2;
    }

    @ElVoField(physicalName = "enfrc_chk2")
    public void setEnfrc_chk2(String enfrc_chk2){
        this.enfrc_chk2 = enfrc_chk2;
    }

    @ElVoField(physicalName = "enfrc_ncsst")
    public String getEnfrc_ncsst(){
        return enfrc_ncsst;
    }

    @ElVoField(physicalName = "enfrc_ncsst")
    public void setEnfrc_ncsst(String enfrc_ncsst){
        this.enfrc_ncsst = enfrc_ncsst;
    }

    @ElVoField(physicalName = "enfrc_use")
    public String getEnfrc_use(){
        return enfrc_use;
    }

    @ElVoField(physicalName = "enfrc_use")
    public void setEnfrc_use(String enfrc_use){
        this.enfrc_use = enfrc_use;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "appr_amt")
    public long getAppr_amt(){
        return appr_amt;
    }

    @ElVoField(physicalName = "appr_amt")
    public void setAppr_amt(long appr_amt){
        this.appr_amt = appr_amt;
    }

    @ElVoField(physicalName = "rvew_ymd")
    public String getRvew_ymd(){
        return rvew_ymd;
    }

    @ElVoField(physicalName = "rvew_ymd")
    public void setRvew_ymd(String rvew_ymd){
        this.rvew_ymd = rvew_ymd;
    }

    @ElVoField(physicalName = "aset_nm")
    public String getAset_nm(){
        return aset_nm;
    }

    @ElVoField(physicalName = "aset_nm")
    public void setAset_nm(String aset_nm){
        this.aset_nm = aset_nm;
    }

    @ElVoField(physicalName = "ntis_reg_no")
    public String getNtis_reg_no(){
        return ntis_reg_no;
    }

    @ElVoField(physicalName = "ntis_reg_no")
    public void setNtis_reg_no(String ntis_reg_no){
        this.ntis_reg_no = ntis_reg_no;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "req_yr")
    public String getReq_yr(){
        return req_yr;
    }

    @ElVoField(physicalName = "req_yr")
    public void setReq_yr(String req_yr){
        this.req_yr = req_yr;
    }

    @ElVoField(physicalName = "finnc")
    public String getFinnc(){
        return finnc;
    }

    @ElVoField(physicalName = "finnc")
    public void setFinnc(String finnc){
        this.finnc = finnc;
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

    @ElVoField(physicalName = "relat_no")
    public String getRelat_no(){
        return relat_no;
    }

    @ElVoField(physicalName = "relat_no")
    public void setRelat_no(String relat_no){
        this.relat_no = relat_no;
    }

    @ElVoField(physicalName = "add_lmt_amt")
    public long getAdd_lmt_amt(){
        return add_lmt_amt;
    }

    @ElVoField(physicalName = "add_lmt_amt")
    public void setAdd_lmt_amt(long add_lmt_amt){
        this.add_lmt_amt = add_lmt_amt;
    }

    @ElVoField(physicalName = "impt_amt")
    public long getImpt_amt(){
        return impt_amt;
    }

    @ElVoField(physicalName = "impt_amt")
    public void setImpt_amt(long impt_amt){
        this.impt_amt = impt_amt;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public String getAccnt_rspns_nm(){
        return accnt_rspns_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public void setAccnt_rspns_nm(String accnt_rspns_nm){
        this.accnt_rspns_nm = accnt_rspns_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_empno")
    public String getAccnt_rspns_empno(){
        return accnt_rspns_empno;
    }

    @ElVoField(physicalName = "accnt_rspns_empno")
    public void setAccnt_rspns_empno(String accnt_rspns_empno){
        this.accnt_rspns_empno = accnt_rspns_empno;
    }

    @ElVoField(physicalName = "sci_tech_regst_no")
    public String getSci_tech_regst_no(){
        return sci_tech_regst_no;
    }

    @ElVoField(physicalName = "sci_tech_regst_no")
    public void setSci_tech_regst_no(String sci_tech_regst_no){
        this.sci_tech_regst_no = sci_tech_regst_no;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public String getAccnt_no_nm(){
        return accnt_no_nm;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public void setAccnt_no_nm(String accnt_no_nm){
        this.accnt_no_nm = accnt_no_nm;
    }

    @ElVoField(physicalName = "req_amt")
    public long getReq_amt(){
        return req_amt;
    }

    @ElVoField(physicalName = "req_amt")
    public void setReq_amt(long req_amt){
        this.req_amt = req_amt;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "user_nm")
    public String getUser_nm(){
        return user_nm;
    }

    @ElVoField(physicalName = "user_nm")
    public void setUser_nm(String user_nm){
        this.user_nm = user_nm;
    }

    @ElVoField(physicalName = "depthed_nm")
    public String getDepthed_nm(){
        return depthed_nm;
    }

    @ElVoField(physicalName = "depthed_nm")
    public void setDepthed_nm(String depthed_nm){
        this.depthed_nm = depthed_nm;
    }

    @ElVoField(physicalName = "intro_ymd")
    public String getIntro_ymd(){
        return intro_ymd;
    }

    @ElVoField(physicalName = "intro_ymd")
    public void setIntro_ymd(String intro_ymd){
        this.intro_ymd = intro_ymd;
    }

    @ElVoField(physicalName = "intro_amt")
    public long getIntro_amt(){
        return intro_amt;
    }

    @ElVoField(physicalName = "intro_amt")
    public void setIntro_amt(long intro_amt){
        this.intro_amt = intro_amt;
    }

    @ElVoField(physicalName = "aset_kor_nm")
    public String getAset_kor_nm(){
        return aset_kor_nm;
    }

    @ElVoField(physicalName = "aset_kor_nm")
    public void setAset_kor_nm(String aset_kor_nm){
        this.aset_kor_nm = aset_kor_nm;
    }

    @ElVoField(physicalName = "aset_eng_nm")
    public String getAset_eng_nm(){
        return aset_eng_nm;
    }

    @ElVoField(physicalName = "aset_eng_nm")
    public void setAset_eng_nm(String aset_eng_nm){
        this.aset_eng_nm = aset_eng_nm;
    }

    @ElVoField(physicalName = "posi_addr")
    public String getPosi_addr(){
        return posi_addr;
    }

    @ElVoField(physicalName = "posi_addr")
    public void setPosi_addr(String posi_addr){
        this.posi_addr = posi_addr;
    }

    @ElVoField(physicalName = "rmk_2")
    public String getRmk_2(){
        return rmk_2;
    }

    @ElVoField(physicalName = "rmk_2")
    public void setRmk_2(String rmk_2){
        this.rmk_2 = rmk_2;
    }

    @ElVoField(physicalName = "rst_attach_file_no")
    public String getRst_attach_file_no(){
        return rst_attach_file_no;
    }

    @ElVoField(physicalName = "rst_attach_file_no")
    public void setRst_attach_file_no(String rst_attach_file_no){
        this.rst_attach_file_no = rst_attach_file_no;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "fileList")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList(){
        return fileList;
    }

    @ElVoField(physicalName = "fileList")
    public void setFileList(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList){
        this.fileList = fileList;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "bugt_yr")
    public String getBugt_yr(){
        return bugt_yr;
    }

    @ElVoField(physicalName = "bugt_yr")
    public void setBugt_yr(String bugt_yr){
        this.bugt_yr = bugt_yr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResEquipFeeReqVo [");
        sb.append("req_psn").append("=").append(req_psn).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("intgr_mngmt_unit").append("=").append(intgr_mngmt_unit).append(",");
        sb.append("intgr_mngmt_unit_nm").append("=").append(intgr_mngmt_unit_nm).append(",");
        sb.append("accnt_rspns").append("=").append(accnt_rspns).append(",");
        sb.append("expns_cd").append("=").append(expns_cd).append(",");
        sb.append("expns_cd_nm").append("=").append(expns_cd_nm).append(",");
        sb.append("aset_no").append("=").append(aset_no).append(",");
        sb.append("req_psn_nm").append("=").append(req_psn_nm).append(",");
        sb.append("req_region").append("=").append(req_region).append(",");
        sb.append("req_region_nm").append("=").append(req_region_nm).append(",");
        sb.append("rvew_sbj").append("=").append(rvew_sbj).append(",");
        sb.append("rvew_rst_cd").append("=").append(rvew_rst_cd).append(",");
        sb.append("enfrc_chk").append("=").append(enfrc_chk).append(",");
        sb.append("enfrc_chk2").append("=").append(enfrc_chk2).append(",");
        sb.append("enfrc_ncsst").append("=").append(enfrc_ncsst).append(",");
        sb.append("enfrc_use").append("=").append(enfrc_use).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("appr_amt").append("=").append(appr_amt).append(",");
        sb.append("rvew_ymd").append("=").append(rvew_ymd).append(",");
        sb.append("aset_nm").append("=").append(aset_nm).append(",");
        sb.append("ntis_reg_no").append("=").append(ntis_reg_no).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("req_yr").append("=").append(req_yr).append(",");
        sb.append("finnc").append("=").append(finnc).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("relat_no").append("=").append(relat_no).append(",");
        sb.append("add_lmt_amt").append("=").append(add_lmt_amt).append(",");
        sb.append("impt_amt").append("=").append(impt_amt).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("accnt_rspns_nm").append("=").append(accnt_rspns_nm).append(",");
        sb.append("accnt_rspns_empno").append("=").append(accnt_rspns_empno).append(",");
        sb.append("sci_tech_regst_no").append("=").append(sci_tech_regst_no).append(",");
        sb.append("accnt_no_nm").append("=").append(accnt_no_nm).append(",");
        sb.append("req_amt").append("=").append(req_amt).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("user_nm").append("=").append(user_nm).append(",");
        sb.append("depthed_nm").append("=").append(depthed_nm).append(",");
        sb.append("intro_ymd").append("=").append(intro_ymd).append(",");
        sb.append("intro_amt").append("=").append(intro_amt).append(",");
        sb.append("aset_kor_nm").append("=").append(aset_kor_nm).append(",");
        sb.append("aset_eng_nm").append("=").append(aset_eng_nm).append(",");
        sb.append("posi_addr").append("=").append(posi_addr).append(",");
        sb.append("rmk_2").append("=").append(rmk_2).append(",");
        sb.append("rst_attach_file_no").append("=").append(rst_attach_file_no).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("fileList").append("=").append(fileList).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("bugt_yr").append("=").append(bugt_yr);
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
