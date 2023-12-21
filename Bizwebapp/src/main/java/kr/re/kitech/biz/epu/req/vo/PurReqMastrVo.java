package kr.re.kitech.biz.epu.req.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "구매요구마스터 Vo")
public class PurReqMastrVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PurReqMastrVo(){
    }

    @ElDtoField(logicalName = "구매요구번호", physicalName = "pur_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_req_no;

    @ElDtoField(logicalName = "내외자구분", physicalName = "inout_psn_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inout_psn_clsf_cd;

    @ElDtoField(logicalName = "구매구분1", physicalName = "pur_grp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_grp_cd;

    @ElDtoField(logicalName = "구매구분2", physicalName = "pur_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_clsf_cd;

    @ElDtoField(logicalName = "신청일자", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "요청용도", physicalName = "req_usg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_usg;

    @ElDtoField(logicalName = "요청용도코드", physicalName = "req_usg_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_usg_cd;

    @ElDtoField(logicalName = "접수일자", physicalName = "rcpt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_ymd;

    @ElDtoField(logicalName = "요청자시스템개인번호", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "요청자성명", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm;

    @ElDtoField(logicalName = "담당자시스템개인번호", physicalName = "charg_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_syspayno;

    @ElDtoField(logicalName = "담당자개인번호", physicalName = "charg_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_empno;

    @ElDtoField(logicalName = "담당자성명", physicalName = "charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_nm;

    @ElDtoField(logicalName = "사용자정시스템개인번호", physicalName = "user_main_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_main_syspayno;

    @ElDtoField(logicalName = "사용자정개인번호", physicalName = "user_main_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_main_empno;

    @ElDtoField(logicalName = "사용자정성명", physicalName = "user_main_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_main_nm;

    @ElDtoField(logicalName = "사용자부시스템개인번호", physicalName = "user_sub_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_sub_syspayno;

    @ElDtoField(logicalName = "사용자부개인번호", physicalName = "user_sub_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_sub_empno;

    @ElDtoField(logicalName = "사용자부성명", physicalName = "user_sub_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_sub_nm;

    @ElDtoField(logicalName = "요청부서", physicalName = "req_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_cd;

    @ElDtoField(logicalName = "요청부서신설일자", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "MSDS 사용여부", physicalName = "msds_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String msds_yn;

    @ElDtoField(logicalName = "방사선여부", physicalName = "rad_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rad_yn;

    @ElDtoField(logicalName = "방사선장비종류", physicalName = "rad_knd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rad_knd;

    @ElDtoField(logicalName = "납품요구일수", physicalName = "delvr_demnd_daycnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String delvr_demnd_daycnt;

    @ElDtoField(logicalName = "납품장소구분코드", physicalName = "delvr_plc_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String delvr_plc_clsf_cd;

    @ElDtoField(logicalName = "납품장소구분명", physicalName = "delvr_plc_clsf_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String delvr_plc_clsf_cd_nm;

    @ElDtoField(logicalName = "납품장소부서업체코드", physicalName = "delvr_plc_dept_vend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String delvr_plc_dept_vend_cd;

    @ElDtoField(logicalName = "납품부서신설일", physicalName = "delvr_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String delvr_dept_new_ymd;

    @ElDtoField(logicalName = "납품장소명", physicalName = "delvr_plc_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String delvr_plc_nm;

    @ElDtoField(logicalName = "설치위치지역코드", physicalName = "instl_posi_region_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String instl_posi_region_cd;

    @ElDtoField(logicalName = "설치위치건물코드", physicalName = "instl_posi_build_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String instl_posi_build_cd;

    @ElDtoField(logicalName = "설치위치층구분", physicalName = "instl_posi_floor_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String instl_posi_floor_clsf;

    @ElDtoField(logicalName = "설치위치층코드", physicalName = "instl_posi_floor_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String instl_posi_floor_cd;

    @ElDtoField(logicalName = "설치위치호수", physicalName = "instl_posi_editno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String instl_posi_editno;

    @ElDtoField(logicalName = "설치운영번호", physicalName = "instl_posi_opr_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String instl_posi_opr_no;

    @ElDtoField(logicalName = "설치위치운영담당", physicalName = "instl_posi_opr_charg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String instl_posi_opr_charg;

    @ElDtoField(logicalName = "설치위치전화", physicalName = "instl_posi_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String instl_posi_tel;

    @ElDtoField(logicalName = "설치운영시기일수", physicalName = "instl_opr_time_daycnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String instl_opr_time_daycnt;

    @ElDtoField(logicalName = "설치위치우편번호", physicalName = "instl_posi_postmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String instl_posi_postmt_no;

    @ElDtoField(logicalName = "설치위치주소", physicalName = "instl_posi_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String instl_posi_addr;

    @ElDtoField(logicalName = "부가세산출비율", physicalName = "addtax_calc_rts", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addtax_calc_rts;

    @ElDtoField(logicalName = "부가세금액", physicalName = "addtax_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long addtax_amt;

    @ElDtoField(logicalName = "요청금액합계", physicalName = "req_amt_sum", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long req_amt_sum;

    @ElDtoField(logicalName = "공급가액 합계", physicalName = "req_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long req_amt;

    @ElDtoField(logicalName = "부속구매여부", physicalName = "sub_pur_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sub_pur_yn;

    @ElDtoField(logicalName = "부속구매요구번호", physicalName = "inhr_pur_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inhr_pur_req_no;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "편성단위", physicalName = "fomat_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fomat_unit;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "계약번호", physicalName = "contrct_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_no;

    @ElDtoField(logicalName = "계약변경순번", physicalName = "chng_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chng_seq;

    @ElDtoField(logicalName = "안전장비포함구매여부", physicalName = "safety_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String safety_yn;

    @ElDtoField(logicalName = "사전안전성검토신청번호", physicalName = "safe_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String safe_req_no;

    @ElDtoField(logicalName = "사전안정선검토자", physicalName = "safe_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String safe_syspayno;

    @ElDtoField(logicalName = "연구장비이름", physicalName = "equip_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_nm;

    @ElDtoField(logicalName = "연구장비여부", physicalName = "equip_info", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_info;

    @ElDtoField(logicalName = "이나라도움및중앙조달등", physicalName = "card_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_clsf_nm;

    @ElDtoField(logicalName = "특정구매 첨부건수", physicalName = "spcfic_cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int spcfic_cnt;

    @ElDtoField(logicalName = "품목내역부대비용 합", physicalName = "incidntl_expns_sum", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long incidntl_expns_sum;

    @ElDtoField(logicalName = "장애인생산품구매가능여부", physicalName = "disabld_pur_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String disabld_pur_yn;

    @ElDtoField(logicalName = "연구기간외물품도입여부", physicalName = "itm_intro_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String itm_intro_yn;

    @ElDtoField(logicalName = "부대비", physicalName = "addtax_calc_base_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addtax_calc_base_cd;

    @ElDtoField(logicalName = "부대비명", physicalName = "addtax_calc_base_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addtax_calc_base_cd_nm;

    @ElVoField(physicalName = "pur_req_no")
    public String getPur_req_no(){
        return pur_req_no;
    }

    @ElVoField(physicalName = "pur_req_no")
    public void setPur_req_no(String pur_req_no){
        this.pur_req_no = pur_req_no;
    }

    @ElVoField(physicalName = "inout_psn_clsf_cd")
    public String getInout_psn_clsf_cd(){
        return inout_psn_clsf_cd;
    }

    @ElVoField(physicalName = "inout_psn_clsf_cd")
    public void setInout_psn_clsf_cd(String inout_psn_clsf_cd){
        this.inout_psn_clsf_cd = inout_psn_clsf_cd;
    }

    @ElVoField(physicalName = "pur_grp_cd")
    public String getPur_grp_cd(){
        return pur_grp_cd;
    }

    @ElVoField(physicalName = "pur_grp_cd")
    public void setPur_grp_cd(String pur_grp_cd){
        this.pur_grp_cd = pur_grp_cd;
    }

    @ElVoField(physicalName = "pur_clsf_cd")
    public String getPur_clsf_cd(){
        return pur_clsf_cd;
    }

    @ElVoField(physicalName = "pur_clsf_cd")
    public void setPur_clsf_cd(String pur_clsf_cd){
        this.pur_clsf_cd = pur_clsf_cd;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "req_usg")
    public String getReq_usg(){
        return req_usg;
    }

    @ElVoField(physicalName = "req_usg")
    public void setReq_usg(String req_usg){
        this.req_usg = req_usg;
    }

    @ElVoField(physicalName = "req_usg_cd")
    public String getReq_usg_cd(){
        return req_usg_cd;
    }

    @ElVoField(physicalName = "req_usg_cd")
    public void setReq_usg_cd(String req_usg_cd){
        this.req_usg_cd = req_usg_cd;
    }

    @ElVoField(physicalName = "rcpt_ymd")
    public String getRcpt_ymd(){
        return rcpt_ymd;
    }

    @ElVoField(physicalName = "rcpt_ymd")
    public void setRcpt_ymd(String rcpt_ymd){
        this.rcpt_ymd = rcpt_ymd;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public String getReq_psn_syspayno(){
        return req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public void setReq_psn_syspayno(String req_psn_syspayno){
        this.req_psn_syspayno = req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public String getReq_psn_nm(){
        return req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public void setReq_psn_nm(String req_psn_nm){
        this.req_psn_nm = req_psn_nm;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public String getCharg_syspayno(){
        return charg_syspayno;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public void setCharg_syspayno(String charg_syspayno){
        this.charg_syspayno = charg_syspayno;
    }

    @ElVoField(physicalName = "charg_empno")
    public String getCharg_empno(){
        return charg_empno;
    }

    @ElVoField(physicalName = "charg_empno")
    public void setCharg_empno(String charg_empno){
        this.charg_empno = charg_empno;
    }

    @ElVoField(physicalName = "charg_nm")
    public String getCharg_nm(){
        return charg_nm;
    }

    @ElVoField(physicalName = "charg_nm")
    public void setCharg_nm(String charg_nm){
        this.charg_nm = charg_nm;
    }

    @ElVoField(physicalName = "user_main_syspayno")
    public String getUser_main_syspayno(){
        return user_main_syspayno;
    }

    @ElVoField(physicalName = "user_main_syspayno")
    public void setUser_main_syspayno(String user_main_syspayno){
        this.user_main_syspayno = user_main_syspayno;
    }

    @ElVoField(physicalName = "user_main_empno")
    public String getUser_main_empno(){
        return user_main_empno;
    }

    @ElVoField(physicalName = "user_main_empno")
    public void setUser_main_empno(String user_main_empno){
        this.user_main_empno = user_main_empno;
    }

    @ElVoField(physicalName = "user_main_nm")
    public String getUser_main_nm(){
        return user_main_nm;
    }

    @ElVoField(physicalName = "user_main_nm")
    public void setUser_main_nm(String user_main_nm){
        this.user_main_nm = user_main_nm;
    }

    @ElVoField(physicalName = "user_sub_syspayno")
    public String getUser_sub_syspayno(){
        return user_sub_syspayno;
    }

    @ElVoField(physicalName = "user_sub_syspayno")
    public void setUser_sub_syspayno(String user_sub_syspayno){
        this.user_sub_syspayno = user_sub_syspayno;
    }

    @ElVoField(physicalName = "user_sub_empno")
    public String getUser_sub_empno(){
        return user_sub_empno;
    }

    @ElVoField(physicalName = "user_sub_empno")
    public void setUser_sub_empno(String user_sub_empno){
        this.user_sub_empno = user_sub_empno;
    }

    @ElVoField(physicalName = "user_sub_nm")
    public String getUser_sub_nm(){
        return user_sub_nm;
    }

    @ElVoField(physicalName = "user_sub_nm")
    public void setUser_sub_nm(String user_sub_nm){
        this.user_sub_nm = user_sub_nm;
    }

    @ElVoField(physicalName = "req_dept_cd")
    public String getReq_dept_cd(){
        return req_dept_cd;
    }

    @ElVoField(physicalName = "req_dept_cd")
    public void setReq_dept_cd(String req_dept_cd){
        this.req_dept_cd = req_dept_cd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public String getDept_new_ymd(){
        return dept_new_ymd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public void setDept_new_ymd(String dept_new_ymd){
        this.dept_new_ymd = dept_new_ymd;
    }

    @ElVoField(physicalName = "msds_yn")
    public String getMsds_yn(){
        return msds_yn;
    }

    @ElVoField(physicalName = "msds_yn")
    public void setMsds_yn(String msds_yn){
        this.msds_yn = msds_yn;
    }

    @ElVoField(physicalName = "rad_yn")
    public String getRad_yn(){
        return rad_yn;
    }

    @ElVoField(physicalName = "rad_yn")
    public void setRad_yn(String rad_yn){
        this.rad_yn = rad_yn;
    }

    @ElVoField(physicalName = "rad_knd")
    public String getRad_knd(){
        return rad_knd;
    }

    @ElVoField(physicalName = "rad_knd")
    public void setRad_knd(String rad_knd){
        this.rad_knd = rad_knd;
    }

    @ElVoField(physicalName = "delvr_demnd_daycnt")
    public String getDelvr_demnd_daycnt(){
        return delvr_demnd_daycnt;
    }

    @ElVoField(physicalName = "delvr_demnd_daycnt")
    public void setDelvr_demnd_daycnt(String delvr_demnd_daycnt){
        this.delvr_demnd_daycnt = delvr_demnd_daycnt;
    }

    @ElVoField(physicalName = "delvr_plc_clsf_cd")
    public String getDelvr_plc_clsf_cd(){
        return delvr_plc_clsf_cd;
    }

    @ElVoField(physicalName = "delvr_plc_clsf_cd")
    public void setDelvr_plc_clsf_cd(String delvr_plc_clsf_cd){
        this.delvr_plc_clsf_cd = delvr_plc_clsf_cd;
    }

    @ElVoField(physicalName = "delvr_plc_clsf_cd_nm")
    public String getDelvr_plc_clsf_cd_nm(){
        return delvr_plc_clsf_cd_nm;
    }

    @ElVoField(physicalName = "delvr_plc_clsf_cd_nm")
    public void setDelvr_plc_clsf_cd_nm(String delvr_plc_clsf_cd_nm){
        this.delvr_plc_clsf_cd_nm = delvr_plc_clsf_cd_nm;
    }

    @ElVoField(physicalName = "delvr_plc_dept_vend_cd")
    public String getDelvr_plc_dept_vend_cd(){
        return delvr_plc_dept_vend_cd;
    }

    @ElVoField(physicalName = "delvr_plc_dept_vend_cd")
    public void setDelvr_plc_dept_vend_cd(String delvr_plc_dept_vend_cd){
        this.delvr_plc_dept_vend_cd = delvr_plc_dept_vend_cd;
    }

    @ElVoField(physicalName = "delvr_dept_new_ymd")
    public String getDelvr_dept_new_ymd(){
        return delvr_dept_new_ymd;
    }

    @ElVoField(physicalName = "delvr_dept_new_ymd")
    public void setDelvr_dept_new_ymd(String delvr_dept_new_ymd){
        this.delvr_dept_new_ymd = delvr_dept_new_ymd;
    }

    @ElVoField(physicalName = "delvr_plc_nm")
    public String getDelvr_plc_nm(){
        return delvr_plc_nm;
    }

    @ElVoField(physicalName = "delvr_plc_nm")
    public void setDelvr_plc_nm(String delvr_plc_nm){
        this.delvr_plc_nm = delvr_plc_nm;
    }

    @ElVoField(physicalName = "instl_posi_region_cd")
    public String getInstl_posi_region_cd(){
        return instl_posi_region_cd;
    }

    @ElVoField(physicalName = "instl_posi_region_cd")
    public void setInstl_posi_region_cd(String instl_posi_region_cd){
        this.instl_posi_region_cd = instl_posi_region_cd;
    }

    @ElVoField(physicalName = "instl_posi_build_cd")
    public String getInstl_posi_build_cd(){
        return instl_posi_build_cd;
    }

    @ElVoField(physicalName = "instl_posi_build_cd")
    public void setInstl_posi_build_cd(String instl_posi_build_cd){
        this.instl_posi_build_cd = instl_posi_build_cd;
    }

    @ElVoField(physicalName = "instl_posi_floor_clsf")
    public String getInstl_posi_floor_clsf(){
        return instl_posi_floor_clsf;
    }

    @ElVoField(physicalName = "instl_posi_floor_clsf")
    public void setInstl_posi_floor_clsf(String instl_posi_floor_clsf){
        this.instl_posi_floor_clsf = instl_posi_floor_clsf;
    }

    @ElVoField(physicalName = "instl_posi_floor_cd")
    public String getInstl_posi_floor_cd(){
        return instl_posi_floor_cd;
    }

    @ElVoField(physicalName = "instl_posi_floor_cd")
    public void setInstl_posi_floor_cd(String instl_posi_floor_cd){
        this.instl_posi_floor_cd = instl_posi_floor_cd;
    }

    @ElVoField(physicalName = "instl_posi_editno")
    public String getInstl_posi_editno(){
        return instl_posi_editno;
    }

    @ElVoField(physicalName = "instl_posi_editno")
    public void setInstl_posi_editno(String instl_posi_editno){
        this.instl_posi_editno = instl_posi_editno;
    }

    @ElVoField(physicalName = "instl_posi_opr_no")
    public String getInstl_posi_opr_no(){
        return instl_posi_opr_no;
    }

    @ElVoField(physicalName = "instl_posi_opr_no")
    public void setInstl_posi_opr_no(String instl_posi_opr_no){
        this.instl_posi_opr_no = instl_posi_opr_no;
    }

    @ElVoField(physicalName = "instl_posi_opr_charg")
    public String getInstl_posi_opr_charg(){
        return instl_posi_opr_charg;
    }

    @ElVoField(physicalName = "instl_posi_opr_charg")
    public void setInstl_posi_opr_charg(String instl_posi_opr_charg){
        this.instl_posi_opr_charg = instl_posi_opr_charg;
    }

    @ElVoField(physicalName = "instl_posi_tel")
    public String getInstl_posi_tel(){
        return instl_posi_tel;
    }

    @ElVoField(physicalName = "instl_posi_tel")
    public void setInstl_posi_tel(String instl_posi_tel){
        this.instl_posi_tel = instl_posi_tel;
    }

    @ElVoField(physicalName = "instl_opr_time_daycnt")
    public String getInstl_opr_time_daycnt(){
        return instl_opr_time_daycnt;
    }

    @ElVoField(physicalName = "instl_opr_time_daycnt")
    public void setInstl_opr_time_daycnt(String instl_opr_time_daycnt){
        this.instl_opr_time_daycnt = instl_opr_time_daycnt;
    }

    @ElVoField(physicalName = "instl_posi_postmt_no")
    public String getInstl_posi_postmt_no(){
        return instl_posi_postmt_no;
    }

    @ElVoField(physicalName = "instl_posi_postmt_no")
    public void setInstl_posi_postmt_no(String instl_posi_postmt_no){
        this.instl_posi_postmt_no = instl_posi_postmt_no;
    }

    @ElVoField(physicalName = "instl_posi_addr")
    public String getInstl_posi_addr(){
        return instl_posi_addr;
    }

    @ElVoField(physicalName = "instl_posi_addr")
    public void setInstl_posi_addr(String instl_posi_addr){
        this.instl_posi_addr = instl_posi_addr;
    }

    @ElVoField(physicalName = "addtax_calc_rts")
    public String getAddtax_calc_rts(){
        return addtax_calc_rts;
    }

    @ElVoField(physicalName = "addtax_calc_rts")
    public void setAddtax_calc_rts(String addtax_calc_rts){
        this.addtax_calc_rts = addtax_calc_rts;
    }

    @ElVoField(physicalName = "addtax_amt")
    public long getAddtax_amt(){
        return addtax_amt;
    }

    @ElVoField(physicalName = "addtax_amt")
    public void setAddtax_amt(long addtax_amt){
        this.addtax_amt = addtax_amt;
    }

    @ElVoField(physicalName = "req_amt_sum")
    public long getReq_amt_sum(){
        return req_amt_sum;
    }

    @ElVoField(physicalName = "req_amt_sum")
    public void setReq_amt_sum(long req_amt_sum){
        this.req_amt_sum = req_amt_sum;
    }

    @ElVoField(physicalName = "req_amt")
    public long getReq_amt(){
        return req_amt;
    }

    @ElVoField(physicalName = "req_amt")
    public void setReq_amt(long req_amt){
        this.req_amt = req_amt;
    }

    @ElVoField(physicalName = "sub_pur_yn")
    public String getSub_pur_yn(){
        return sub_pur_yn;
    }

    @ElVoField(physicalName = "sub_pur_yn")
    public void setSub_pur_yn(String sub_pur_yn){
        this.sub_pur_yn = sub_pur_yn;
    }

    @ElVoField(physicalName = "inhr_pur_req_no")
    public String getInhr_pur_req_no(){
        return inhr_pur_req_no;
    }

    @ElVoField(physicalName = "inhr_pur_req_no")
    public void setInhr_pur_req_no(String inhr_pur_req_no){
        this.inhr_pur_req_no = inhr_pur_req_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "fomat_unit")
    public String getFomat_unit(){
        return fomat_unit;
    }

    @ElVoField(physicalName = "fomat_unit")
    public void setFomat_unit(String fomat_unit){
        this.fomat_unit = fomat_unit;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "contrct_no")
    public String getContrct_no(){
        return contrct_no;
    }

    @ElVoField(physicalName = "contrct_no")
    public void setContrct_no(String contrct_no){
        this.contrct_no = contrct_no;
    }

    @ElVoField(physicalName = "chng_seq")
    public String getChng_seq(){
        return chng_seq;
    }

    @ElVoField(physicalName = "chng_seq")
    public void setChng_seq(String chng_seq){
        this.chng_seq = chng_seq;
    }

    @ElVoField(physicalName = "safety_yn")
    public String getSafety_yn(){
        return safety_yn;
    }

    @ElVoField(physicalName = "safety_yn")
    public void setSafety_yn(String safety_yn){
        this.safety_yn = safety_yn;
    }

    @ElVoField(physicalName = "safe_req_no")
    public String getSafe_req_no(){
        return safe_req_no;
    }

    @ElVoField(physicalName = "safe_req_no")
    public void setSafe_req_no(String safe_req_no){
        this.safe_req_no = safe_req_no;
    }

    @ElVoField(physicalName = "safe_syspayno")
    public String getSafe_syspayno(){
        return safe_syspayno;
    }

    @ElVoField(physicalName = "safe_syspayno")
    public void setSafe_syspayno(String safe_syspayno){
        this.safe_syspayno = safe_syspayno;
    }

    @ElVoField(physicalName = "equip_nm")
    public String getEquip_nm(){
        return equip_nm;
    }

    @ElVoField(physicalName = "equip_nm")
    public void setEquip_nm(String equip_nm){
        this.equip_nm = equip_nm;
    }

    @ElVoField(physicalName = "equip_info")
    public String getEquip_info(){
        return equip_info;
    }

    @ElVoField(physicalName = "equip_info")
    public void setEquip_info(String equip_info){
        this.equip_info = equip_info;
    }

    @ElVoField(physicalName = "card_clsf_nm")
    public String getCard_clsf_nm(){
        return card_clsf_nm;
    }

    @ElVoField(physicalName = "card_clsf_nm")
    public void setCard_clsf_nm(String card_clsf_nm){
        this.card_clsf_nm = card_clsf_nm;
    }

    @ElVoField(physicalName = "spcfic_cnt")
    public int getSpcfic_cnt(){
        return spcfic_cnt;
    }

    @ElVoField(physicalName = "spcfic_cnt")
    public void setSpcfic_cnt(int spcfic_cnt){
        this.spcfic_cnt = spcfic_cnt;
    }

    @ElVoField(physicalName = "incidntl_expns_sum")
    public long getIncidntl_expns_sum(){
        return incidntl_expns_sum;
    }

    @ElVoField(physicalName = "incidntl_expns_sum")
    public void setIncidntl_expns_sum(long incidntl_expns_sum){
        this.incidntl_expns_sum = incidntl_expns_sum;
    }

    @ElVoField(physicalName = "disabld_pur_yn")
    public String getDisabld_pur_yn(){
        return disabld_pur_yn;
    }

    @ElVoField(physicalName = "disabld_pur_yn")
    public void setDisabld_pur_yn(String disabld_pur_yn){
        this.disabld_pur_yn = disabld_pur_yn;
    }

    @ElVoField(physicalName = "itm_intro_yn")
    public String getItm_intro_yn(){
        return itm_intro_yn;
    }

    @ElVoField(physicalName = "itm_intro_yn")
    public void setItm_intro_yn(String itm_intro_yn){
        this.itm_intro_yn = itm_intro_yn;
    }

    @ElVoField(physicalName = "addtax_calc_base_cd")
    public String getAddtax_calc_base_cd(){
        return addtax_calc_base_cd;
    }

    @ElVoField(physicalName = "addtax_calc_base_cd")
    public void setAddtax_calc_base_cd(String addtax_calc_base_cd){
        this.addtax_calc_base_cd = addtax_calc_base_cd;
    }

    @ElVoField(physicalName = "addtax_calc_base_cd_nm")
    public String getAddtax_calc_base_cd_nm(){
        return addtax_calc_base_cd_nm;
    }

    @ElVoField(physicalName = "addtax_calc_base_cd_nm")
    public void setAddtax_calc_base_cd_nm(String addtax_calc_base_cd_nm){
        this.addtax_calc_base_cd_nm = addtax_calc_base_cd_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurReqMastrVo [");
        sb.append("pur_req_no").append("=").append(pur_req_no).append(",");
        sb.append("inout_psn_clsf_cd").append("=").append(inout_psn_clsf_cd).append(",");
        sb.append("pur_grp_cd").append("=").append(pur_grp_cd).append(",");
        sb.append("pur_clsf_cd").append("=").append(pur_clsf_cd).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("req_usg").append("=").append(req_usg).append(",");
        sb.append("req_usg_cd").append("=").append(req_usg_cd).append(",");
        sb.append("rcpt_ymd").append("=").append(rcpt_ymd).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("req_psn_nm").append("=").append(req_psn_nm).append(",");
        sb.append("charg_syspayno").append("=").append(charg_syspayno).append(",");
        sb.append("charg_empno").append("=").append(charg_empno).append(",");
        sb.append("charg_nm").append("=").append(charg_nm).append(",");
        sb.append("user_main_syspayno").append("=").append(user_main_syspayno).append(",");
        sb.append("user_main_empno").append("=").append(user_main_empno).append(",");
        sb.append("user_main_nm").append("=").append(user_main_nm).append(",");
        sb.append("user_sub_syspayno").append("=").append(user_sub_syspayno).append(",");
        sb.append("user_sub_empno").append("=").append(user_sub_empno).append(",");
        sb.append("user_sub_nm").append("=").append(user_sub_nm).append(",");
        sb.append("req_dept_cd").append("=").append(req_dept_cd).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("msds_yn").append("=").append(msds_yn).append(",");
        sb.append("rad_yn").append("=").append(rad_yn).append(",");
        sb.append("rad_knd").append("=").append(rad_knd).append(",");
        sb.append("delvr_demnd_daycnt").append("=").append(delvr_demnd_daycnt).append(",");
        sb.append("delvr_plc_clsf_cd").append("=").append(delvr_plc_clsf_cd).append(",");
        sb.append("delvr_plc_clsf_cd_nm").append("=").append(delvr_plc_clsf_cd_nm).append(",");
        sb.append("delvr_plc_dept_vend_cd").append("=").append(delvr_plc_dept_vend_cd).append(",");
        sb.append("delvr_dept_new_ymd").append("=").append(delvr_dept_new_ymd).append(",");
        sb.append("delvr_plc_nm").append("=").append(delvr_plc_nm).append(",");
        sb.append("instl_posi_region_cd").append("=").append(instl_posi_region_cd).append(",");
        sb.append("instl_posi_build_cd").append("=").append(instl_posi_build_cd).append(",");
        sb.append("instl_posi_floor_clsf").append("=").append(instl_posi_floor_clsf).append(",");
        sb.append("instl_posi_floor_cd").append("=").append(instl_posi_floor_cd).append(",");
        sb.append("instl_posi_editno").append("=").append(instl_posi_editno).append(",");
        sb.append("instl_posi_opr_no").append("=").append(instl_posi_opr_no).append(",");
        sb.append("instl_posi_opr_charg").append("=").append(instl_posi_opr_charg).append(",");
        sb.append("instl_posi_tel").append("=").append(instl_posi_tel).append(",");
        sb.append("instl_opr_time_daycnt").append("=").append(instl_opr_time_daycnt).append(",");
        sb.append("instl_posi_postmt_no").append("=").append(instl_posi_postmt_no).append(",");
        sb.append("instl_posi_addr").append("=").append(instl_posi_addr).append(",");
        sb.append("addtax_calc_rts").append("=").append(addtax_calc_rts).append(",");
        sb.append("addtax_amt").append("=").append(addtax_amt).append(",");
        sb.append("req_amt_sum").append("=").append(req_amt_sum).append(",");
        sb.append("req_amt").append("=").append(req_amt).append(",");
        sb.append("sub_pur_yn").append("=").append(sub_pur_yn).append(",");
        sb.append("inhr_pur_req_no").append("=").append(inhr_pur_req_no).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("fomat_unit").append("=").append(fomat_unit).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("contrct_no").append("=").append(contrct_no).append(",");
        sb.append("chng_seq").append("=").append(chng_seq).append(",");
        sb.append("safety_yn").append("=").append(safety_yn).append(",");
        sb.append("safe_req_no").append("=").append(safe_req_no).append(",");
        sb.append("safe_syspayno").append("=").append(safe_syspayno).append(",");
        sb.append("equip_nm").append("=").append(equip_nm).append(",");
        sb.append("equip_info").append("=").append(equip_info).append(",");
        sb.append("card_clsf_nm").append("=").append(card_clsf_nm).append(",");
        sb.append("spcfic_cnt").append("=").append(spcfic_cnt).append(",");
        sb.append("incidntl_expns_sum").append("=").append(incidntl_expns_sum).append(",");
        sb.append("disabld_pur_yn").append("=").append(disabld_pur_yn).append(",");
        sb.append("itm_intro_yn").append("=").append(itm_intro_yn).append(",");
        sb.append("addtax_calc_base_cd").append("=").append(addtax_calc_base_cd).append(",");
        sb.append("addtax_calc_base_cd_nm").append("=").append(addtax_calc_base_cd_nm);
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
