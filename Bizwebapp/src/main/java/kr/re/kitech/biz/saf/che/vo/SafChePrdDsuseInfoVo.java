package kr.re.kitech.biz.saf.che.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "화학제품폐기신청정보")
public class SafChePrdDsuseInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SafChePrdDsuseInfoVo(){
    }

    @ElDtoField(logicalName = "dsuseReqNo", physicalName = "dsuse_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dsuse_req_no;

    @ElDtoField(logicalName = "req_ymd", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "aprChk", physicalName = "aprChk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aprChk;

    @ElDtoField(logicalName = "labNo", physicalName = "lab_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lab_no;

    @ElDtoField(logicalName = "spaceCd", physicalName = "space_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String space_cd;

    @ElDtoField(logicalName = "labNm", physicalName = "lab_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lab_nm;

    @ElDtoField(logicalName = "reqstSyspayno", physicalName = "reqst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reqst_syspayno;

    @ElDtoField(logicalName = "reqstNm", physicalName = "reqst_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reqst_nm;

    @ElDtoField(logicalName = "reqstMobile", physicalName = "reqst_mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reqst_mobile;

    @ElDtoField(logicalName = "reqstEmpno", physicalName = "reqst_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reqst_empno;

    @ElDtoField(logicalName = "reqstDeptNm", physicalName = "reqst_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reqst_dept_nm;

    @ElDtoField(logicalName = "reqstDeptCd", physicalName = "reqst_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reqst_dept_cd;

    @ElDtoField(logicalName = "reqstDeptNewYmd", physicalName = "reqst_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reqst_dept_new_ymd;

    @ElDtoField(logicalName = "reqstYmd", physicalName = "reqst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reqst_ymd;

    @ElDtoField(logicalName = "wsteExhstYmd", physicalName = "wste_exhst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wste_exhst_ymd;

    @ElDtoField(logicalName = "odr", physicalName = "odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int odr;

    @ElDtoField(logicalName = "mainSecrtRspnsSyspayno", physicalName = "main_secrt_rspns_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_secrt_rspns_syspayno;

    @ElDtoField(logicalName = "mainSecrtRspnsNm", physicalName = "main_secrt_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_secrt_rspns_nm;

    @ElDtoField(logicalName = "mainMobile", physicalName = "main_mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_mobile;

    @ElDtoField(logicalName = "mainEmpno", physicalName = "main_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_empno;

    @ElDtoField(logicalName = "subSecrtRspnsSyspayno", physicalName = "sub_secrt_rspns_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sub_secrt_rspns_syspayno;

    @ElDtoField(logicalName = "subSecrtRspnsNm", physicalName = "sub_secrt_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sub_secrt_rspns_nm;

    @ElDtoField(logicalName = "subMobile", physicalName = "sub_mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sub_mobile;

    @ElDtoField(logicalName = "subEmpno", physicalName = "sub_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sub_empno;

    @ElDtoField(logicalName = "address", physicalName = "address", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String address;

    @ElDtoField(logicalName = "deuseGubun", physicalName = "deuse_gubun", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String deuse_gubun;

    @ElDtoField(logicalName = "centrCd", physicalName = "centr_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String centr_cd;

    @ElDtoField(logicalName = "centrNm", physicalName = "centr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String centr_nm;

    @ElDtoField(logicalName = "deptNm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "deptCd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "deptNewYmd", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "wsteClsf", physicalName = "wste_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wste_clsf;

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "aprState", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "신청자시스템개인번호", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "신청자이메일", physicalName = "req_psn_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_email;

    @ElDtoField(logicalName = "신청자전화번호", physicalName = "req_psn_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_tel;

    @ElDtoField(logicalName = "담당자시스템개인번호", physicalName = "charg_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_syspayno;

    @ElDtoField(logicalName = "신청상태", physicalName = "req_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_state;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "companionRs", physicalName = "companion_rs", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String companion_rs;

    @ElDtoField(logicalName = "cn", physicalName = "cn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cn;

    @ElDtoField(logicalName = "신청자명", physicalName = "req_psn_syspayno_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno_nm;

    @ElDtoField(logicalName = "prductNm", physicalName = "prduct_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prduct_nm;

    @ElDtoField(logicalName = "useReqNo", physicalName = "use_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_req_no;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "startYmd", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;

    @ElDtoField(logicalName = "endYmd", physicalName = "end_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String end_ymd;

    @ElDtoField(logicalName = "searchDate", physicalName = "search_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String search_date;

    @ElDtoField(logicalName = "reqSyspayno", physicalName = "req_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_syspayno;

    @ElDtoField(logicalName = "mainSyspayno", physicalName = "main_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_syspayno;

    @ElDtoField(logicalName = "makrCmpny", physicalName = "makr_cmpny", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String makr_cmpny;

    @ElDtoField(logicalName = "managerYn", physicalName = "manager_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String manager_yn;

    @ElDtoField(logicalName = "disposalState", physicalName = "disposal_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String disposal_state;

    @ElDtoField(logicalName = "prduStateNew", physicalName = "prdu_state_new", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prdu_state_new;

    @ElDtoField(logicalName = "prduStateOld", physicalName = "prdu_state_old", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prdu_state_old;

    @ElDtoField(logicalName = "disposalStateNm", physicalName = "disposal_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String disposal_state_nm;

    @ElDtoField(logicalName = "email", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

    @ElDtoField(logicalName = "serviceId", physicalName = "service_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String service_id;

    @ElDtoField(logicalName = "docId", physicalName = "doc_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String doc_id;

    @ElDtoField(logicalName = "seq", physicalName = "seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seq;

    @ElDtoField(logicalName = "id", physicalName = "id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String id;

    @ElDtoField(logicalName = "prductKnd", physicalName = "prduct_knd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prduct_knd;

    @ElDtoField(logicalName = "prductKndNm", physicalName = "prduct_knd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prduct_knd_nm;

    @ElDtoField(logicalName = "prductCd", physicalName = "prduct_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prduct_cd;

    @ElDtoField(logicalName = "itemUnitNm", physicalName = "item_unit_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_unit_nm;

    @ElDtoField(logicalName = "dsuseAttachFileNo", physicalName = "dsuse_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dsuse_attach_file_no;

    @ElDtoField(logicalName = "dsuseQy", physicalName = "dsuse_qy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dsuse_qy;

    @ElDtoField(logicalName = "cpctyQty", physicalName = "cpcty_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cpcty_qty;

    @ElDtoField(logicalName = "itemQty", physicalName = "item_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_qty;

    @ElDtoField(logicalName = "itemUnit", physicalName = "item_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_unit;

    @ElDtoField(logicalName = "msdsAttachFileNo", physicalName = "msds_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String msds_attach_file_no;

    @ElDtoField(logicalName = "msdsUrl", physicalName = "msds_url", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String msds_url;

    @ElDtoField(logicalName = "prduState", physicalName = "prdu_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prdu_state;

    @ElDtoField(logicalName = "prductCdArr", physicalName = "prduct_cd_arr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prduct_cd_arr;

    @ElDtoField(logicalName = "casNo", physicalName = "cas_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cas_no;

    @ElDtoField(logicalName = "synonm", physicalName = "synonm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String synonm;

    @ElDtoField(logicalName = "chmclsNm", physicalName = "chmcls_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chmcls_nm;

    @ElDtoField(logicalName = "mixtrMttrCd", physicalName = "mixtr_mttr_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mixtr_mttr_cd;

    @ElDtoField(logicalName = "unitQty", physicalName = "unit_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unit_qty;

    @ElDtoField(logicalName = "purchsDate", physicalName = "purchs_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String purchs_date;

    @ElDtoField(logicalName = "registSyspayno", physicalName = "regist_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regist_syspayno;

    @ElDtoField(logicalName = "registNm", physicalName = "regist_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regist_nm;

    @ElDtoField(logicalName = "registEmpno", physicalName = "regist_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regist_empno;

    @ElDtoField(logicalName = "regstPsnSyspayno", physicalName = "regst_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_psn_syspayno;

    @ElDtoField(logicalName = "updtPsnSyspayno", physicalName = "updt_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_psn_syspayno;

    @ElDtoField(logicalName = "loginUserId", physicalName = "login_user_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String login_user_id;

    @ElDtoField(logicalName = "labGrd", physicalName = "lab_grd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lab_grd;

    @ElDtoField(logicalName = "roleType", physicalName = "role_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String role_type;

    @ElDtoField(logicalName = "labState", physicalName = "lab_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lab_state;

    @ElDtoField(logicalName = "deptTyp", physicalName = "dept_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_typ;

    @ElDtoField(logicalName = "reqStartYmd", physicalName = "req_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_start_ymd;

    @ElDtoField(logicalName = "reqClsYmd", physicalName = "req_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_cls_ymd;

    @ElDtoField(logicalName = "exhstYmd", physicalName = "exhst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exhst_ymd;

    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "guidanceMatter", physicalName = "guidance_matter", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String guidance_matter;

    @ElDtoField(logicalName = "speclManageMttr", physicalName = "specl_manage_mttr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String specl_manage_mttr;

    @ElDtoField(logicalName = "wsteClsfArrNm", physicalName = "wste_clsf_arr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wste_clsf_arr_nm;

    @ElDtoField(logicalName = "wsteClsf1", physicalName = "wste_clsf_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wste_clsf_1;

    @ElDtoField(logicalName = "wsteClsf2", physicalName = "wste_clsf_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wste_clsf_2;

    @ElDtoField(logicalName = "managerId", physicalName = "manager_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String manager_id;

    @ElDtoField(logicalName = "researchChargerId", physicalName = "research_charger_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String research_charger_id;

    @ElDtoField(logicalName = "infoCd", physicalName = "info_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String info_cd;

    @ElDtoField(logicalName = "deuseAprState", physicalName = "deuse_apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String deuse_apr_state;

    @ElDtoField(logicalName = "deuseAprStateNm", physicalName = "deuse_apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String deuse_apr_state_nm;

    @ElDtoField(logicalName = "count", physicalName = "count", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int count;

    @ElDtoField(logicalName = "eesearchCharger", physicalName = "research_charger", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String research_charger;

    @ElDtoField(logicalName = "manager", physicalName = "manager", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String manager;

    @ElDtoField(logicalName = "dcsn_daytm", physicalName = "dcsn_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dcsn_daytm;

    @ElDtoField(logicalName = "wste_clsf_nm", physicalName = "wste_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wste_clsf_nm;

    @ElVoField(physicalName = "dsuse_req_no")
    public String getDsuse_req_no(){
        return dsuse_req_no;
    }

    @ElVoField(physicalName = "dsuse_req_no")
    public void setDsuse_req_no(String dsuse_req_no){
        this.dsuse_req_no = dsuse_req_no;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "aprChk")
    public String getAprChk(){
        return aprChk;
    }

    @ElVoField(physicalName = "aprChk")
    public void setAprChk(String aprChk){
        this.aprChk = aprChk;
    }

    @ElVoField(physicalName = "lab_no")
    public String getLab_no(){
        return lab_no;
    }

    @ElVoField(physicalName = "lab_no")
    public void setLab_no(String lab_no){
        this.lab_no = lab_no;
    }

    @ElVoField(physicalName = "space_cd")
    public String getSpace_cd(){
        return space_cd;
    }

    @ElVoField(physicalName = "space_cd")
    public void setSpace_cd(String space_cd){
        this.space_cd = space_cd;
    }

    @ElVoField(physicalName = "lab_nm")
    public String getLab_nm(){
        return lab_nm;
    }

    @ElVoField(physicalName = "lab_nm")
    public void setLab_nm(String lab_nm){
        this.lab_nm = lab_nm;
    }

    @ElVoField(physicalName = "reqst_syspayno")
    public String getReqst_syspayno(){
        return reqst_syspayno;
    }

    @ElVoField(physicalName = "reqst_syspayno")
    public void setReqst_syspayno(String reqst_syspayno){
        this.reqst_syspayno = reqst_syspayno;
    }

    @ElVoField(physicalName = "reqst_nm")
    public String getReqst_nm(){
        return reqst_nm;
    }

    @ElVoField(physicalName = "reqst_nm")
    public void setReqst_nm(String reqst_nm){
        this.reqst_nm = reqst_nm;
    }

    @ElVoField(physicalName = "reqst_mobile")
    public String getReqst_mobile(){
        return reqst_mobile;
    }

    @ElVoField(physicalName = "reqst_mobile")
    public void setReqst_mobile(String reqst_mobile){
        this.reqst_mobile = reqst_mobile;
    }

    @ElVoField(physicalName = "reqst_empno")
    public String getReqst_empno(){
        return reqst_empno;
    }

    @ElVoField(physicalName = "reqst_empno")
    public void setReqst_empno(String reqst_empno){
        this.reqst_empno = reqst_empno;
    }

    @ElVoField(physicalName = "reqst_dept_nm")
    public String getReqst_dept_nm(){
        return reqst_dept_nm;
    }

    @ElVoField(physicalName = "reqst_dept_nm")
    public void setReqst_dept_nm(String reqst_dept_nm){
        this.reqst_dept_nm = reqst_dept_nm;
    }

    @ElVoField(physicalName = "reqst_dept_cd")
    public String getReqst_dept_cd(){
        return reqst_dept_cd;
    }

    @ElVoField(physicalName = "reqst_dept_cd")
    public void setReqst_dept_cd(String reqst_dept_cd){
        this.reqst_dept_cd = reqst_dept_cd;
    }

    @ElVoField(physicalName = "reqst_dept_new_ymd")
    public String getReqst_dept_new_ymd(){
        return reqst_dept_new_ymd;
    }

    @ElVoField(physicalName = "reqst_dept_new_ymd")
    public void setReqst_dept_new_ymd(String reqst_dept_new_ymd){
        this.reqst_dept_new_ymd = reqst_dept_new_ymd;
    }

    @ElVoField(physicalName = "reqst_ymd")
    public String getReqst_ymd(){
        return reqst_ymd;
    }

    @ElVoField(physicalName = "reqst_ymd")
    public void setReqst_ymd(String reqst_ymd){
        this.reqst_ymd = reqst_ymd;
    }

    @ElVoField(physicalName = "wste_exhst_ymd")
    public String getWste_exhst_ymd(){
        return wste_exhst_ymd;
    }

    @ElVoField(physicalName = "wste_exhst_ymd")
    public void setWste_exhst_ymd(String wste_exhst_ymd){
        this.wste_exhst_ymd = wste_exhst_ymd;
    }

    @ElVoField(physicalName = "odr")
    public int getOdr(){
        return odr;
    }

    @ElVoField(physicalName = "odr")
    public void setOdr(int odr){
        this.odr = odr;
    }

    @ElVoField(physicalName = "main_secrt_rspns_syspayno")
    public String getMain_secrt_rspns_syspayno(){
        return main_secrt_rspns_syspayno;
    }

    @ElVoField(physicalName = "main_secrt_rspns_syspayno")
    public void setMain_secrt_rspns_syspayno(String main_secrt_rspns_syspayno){
        this.main_secrt_rspns_syspayno = main_secrt_rspns_syspayno;
    }

    @ElVoField(physicalName = "main_secrt_rspns_nm")
    public String getMain_secrt_rspns_nm(){
        return main_secrt_rspns_nm;
    }

    @ElVoField(physicalName = "main_secrt_rspns_nm")
    public void setMain_secrt_rspns_nm(String main_secrt_rspns_nm){
        this.main_secrt_rspns_nm = main_secrt_rspns_nm;
    }

    @ElVoField(physicalName = "main_mobile")
    public String getMain_mobile(){
        return main_mobile;
    }

    @ElVoField(physicalName = "main_mobile")
    public void setMain_mobile(String main_mobile){
        this.main_mobile = main_mobile;
    }

    @ElVoField(physicalName = "main_empno")
    public String getMain_empno(){
        return main_empno;
    }

    @ElVoField(physicalName = "main_empno")
    public void setMain_empno(String main_empno){
        this.main_empno = main_empno;
    }

    @ElVoField(physicalName = "sub_secrt_rspns_syspayno")
    public String getSub_secrt_rspns_syspayno(){
        return sub_secrt_rspns_syspayno;
    }

    @ElVoField(physicalName = "sub_secrt_rspns_syspayno")
    public void setSub_secrt_rspns_syspayno(String sub_secrt_rspns_syspayno){
        this.sub_secrt_rspns_syspayno = sub_secrt_rspns_syspayno;
    }

    @ElVoField(physicalName = "sub_secrt_rspns_nm")
    public String getSub_secrt_rspns_nm(){
        return sub_secrt_rspns_nm;
    }

    @ElVoField(physicalName = "sub_secrt_rspns_nm")
    public void setSub_secrt_rspns_nm(String sub_secrt_rspns_nm){
        this.sub_secrt_rspns_nm = sub_secrt_rspns_nm;
    }

    @ElVoField(physicalName = "sub_mobile")
    public String getSub_mobile(){
        return sub_mobile;
    }

    @ElVoField(physicalName = "sub_mobile")
    public void setSub_mobile(String sub_mobile){
        this.sub_mobile = sub_mobile;
    }

    @ElVoField(physicalName = "sub_empno")
    public String getSub_empno(){
        return sub_empno;
    }

    @ElVoField(physicalName = "sub_empno")
    public void setSub_empno(String sub_empno){
        this.sub_empno = sub_empno;
    }

    @ElVoField(physicalName = "address")
    public String getAddress(){
        return address;
    }

    @ElVoField(physicalName = "address")
    public void setAddress(String address){
        this.address = address;
    }

    @ElVoField(physicalName = "deuse_gubun")
    public String getDeuse_gubun(){
        return deuse_gubun;
    }

    @ElVoField(physicalName = "deuse_gubun")
    public void setDeuse_gubun(String deuse_gubun){
        this.deuse_gubun = deuse_gubun;
    }

    @ElVoField(physicalName = "centr_cd")
    public String getCentr_cd(){
        return centr_cd;
    }

    @ElVoField(physicalName = "centr_cd")
    public void setCentr_cd(String centr_cd){
        this.centr_cd = centr_cd;
    }

    @ElVoField(physicalName = "centr_nm")
    public String getCentr_nm(){
        return centr_nm;
    }

    @ElVoField(physicalName = "centr_nm")
    public void setCentr_nm(String centr_nm){
        this.centr_nm = centr_nm;
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

    @ElVoField(physicalName = "dept_new_ymd")
    public String getDept_new_ymd(){
        return dept_new_ymd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public void setDept_new_ymd(String dept_new_ymd){
        this.dept_new_ymd = dept_new_ymd;
    }

    @ElVoField(physicalName = "wste_clsf")
    public String getWste_clsf(){
        return wste_clsf;
    }

    @ElVoField(physicalName = "wste_clsf")
    public void setWste_clsf(String wste_clsf){
        this.wste_clsf = wste_clsf;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public String getReq_psn_syspayno(){
        return req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public void setReq_psn_syspayno(String req_psn_syspayno){
        this.req_psn_syspayno = req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_email")
    public String getReq_psn_email(){
        return req_psn_email;
    }

    @ElVoField(physicalName = "req_psn_email")
    public void setReq_psn_email(String req_psn_email){
        this.req_psn_email = req_psn_email;
    }

    @ElVoField(physicalName = "req_psn_tel")
    public String getReq_psn_tel(){
        return req_psn_tel;
    }

    @ElVoField(physicalName = "req_psn_tel")
    public void setReq_psn_tel(String req_psn_tel){
        this.req_psn_tel = req_psn_tel;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public String getCharg_syspayno(){
        return charg_syspayno;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public void setCharg_syspayno(String charg_syspayno){
        this.charg_syspayno = charg_syspayno;
    }

    @ElVoField(physicalName = "req_state")
    public String getReq_state(){
        return req_state;
    }

    @ElVoField(physicalName = "req_state")
    public void setReq_state(String req_state){
        this.req_state = req_state;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "companion_rs")
    public String getCompanion_rs(){
        return companion_rs;
    }

    @ElVoField(physicalName = "companion_rs")
    public void setCompanion_rs(String companion_rs){
        this.companion_rs = companion_rs;
    }

    @ElVoField(physicalName = "cn")
    public String getCn(){
        return cn;
    }

    @ElVoField(physicalName = "cn")
    public void setCn(String cn){
        this.cn = cn;
    }

    @ElVoField(physicalName = "req_psn_syspayno_nm")
    public String getReq_psn_syspayno_nm(){
        return req_psn_syspayno_nm;
    }

    @ElVoField(physicalName = "req_psn_syspayno_nm")
    public void setReq_psn_syspayno_nm(String req_psn_syspayno_nm){
        this.req_psn_syspayno_nm = req_psn_syspayno_nm;
    }

    @ElVoField(physicalName = "prduct_nm")
    public String getPrduct_nm(){
        return prduct_nm;
    }

    @ElVoField(physicalName = "prduct_nm")
    public void setPrduct_nm(String prduct_nm){
        this.prduct_nm = prduct_nm;
    }

    @ElVoField(physicalName = "use_req_no")
    public String getUse_req_no(){
        return use_req_no;
    }

    @ElVoField(physicalName = "use_req_no")
    public void setUse_req_no(String use_req_no){
        this.use_req_no = use_req_no;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "start_ymd")
    public String getStart_ymd(){
        return start_ymd;
    }

    @ElVoField(physicalName = "start_ymd")
    public void setStart_ymd(String start_ymd){
        this.start_ymd = start_ymd;
    }

    @ElVoField(physicalName = "end_ymd")
    public String getEnd_ymd(){
        return end_ymd;
    }

    @ElVoField(physicalName = "end_ymd")
    public void setEnd_ymd(String end_ymd){
        this.end_ymd = end_ymd;
    }

    @ElVoField(physicalName = "search_date")
    public String getSearch_date(){
        return search_date;
    }

    @ElVoField(physicalName = "search_date")
    public void setSearch_date(String search_date){
        this.search_date = search_date;
    }

    @ElVoField(physicalName = "req_syspayno")
    public String getReq_syspayno(){
        return req_syspayno;
    }

    @ElVoField(physicalName = "req_syspayno")
    public void setReq_syspayno(String req_syspayno){
        this.req_syspayno = req_syspayno;
    }

    @ElVoField(physicalName = "main_syspayno")
    public String getMain_syspayno(){
        return main_syspayno;
    }

    @ElVoField(physicalName = "main_syspayno")
    public void setMain_syspayno(String main_syspayno){
        this.main_syspayno = main_syspayno;
    }

    @ElVoField(physicalName = "makr_cmpny")
    public String getMakr_cmpny(){
        return makr_cmpny;
    }

    @ElVoField(physicalName = "makr_cmpny")
    public void setMakr_cmpny(String makr_cmpny){
        this.makr_cmpny = makr_cmpny;
    }

    @ElVoField(physicalName = "manager_yn")
    public String getManager_yn(){
        return manager_yn;
    }

    @ElVoField(physicalName = "manager_yn")
    public void setManager_yn(String manager_yn){
        this.manager_yn = manager_yn;
    }

    @ElVoField(physicalName = "disposal_state")
    public String getDisposal_state(){
        return disposal_state;
    }

    @ElVoField(physicalName = "disposal_state")
    public void setDisposal_state(String disposal_state){
        this.disposal_state = disposal_state;
    }

    @ElVoField(physicalName = "prdu_state_new")
    public String getPrdu_state_new(){
        return prdu_state_new;
    }

    @ElVoField(physicalName = "prdu_state_new")
    public void setPrdu_state_new(String prdu_state_new){
        this.prdu_state_new = prdu_state_new;
    }

    @ElVoField(physicalName = "prdu_state_old")
    public String getPrdu_state_old(){
        return prdu_state_old;
    }

    @ElVoField(physicalName = "prdu_state_old")
    public void setPrdu_state_old(String prdu_state_old){
        this.prdu_state_old = prdu_state_old;
    }

    @ElVoField(physicalName = "disposal_state_nm")
    public String getDisposal_state_nm(){
        return disposal_state_nm;
    }

    @ElVoField(physicalName = "disposal_state_nm")
    public void setDisposal_state_nm(String disposal_state_nm){
        this.disposal_state_nm = disposal_state_nm;
    }

    @ElVoField(physicalName = "email")
    public String getEmail(){
        return email;
    }

    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }

    @ElVoField(physicalName = "service_id")
    public String getService_id(){
        return service_id;
    }

    @ElVoField(physicalName = "service_id")
    public void setService_id(String service_id){
        this.service_id = service_id;
    }

    @ElVoField(physicalName = "doc_id")
    public String getDoc_id(){
        return doc_id;
    }

    @ElVoField(physicalName = "doc_id")
    public void setDoc_id(String doc_id){
        this.doc_id = doc_id;
    }

    @ElVoField(physicalName = "seq")
    public String getSeq(){
        return seq;
    }

    @ElVoField(physicalName = "seq")
    public void setSeq(String seq){
        this.seq = seq;
    }

    @ElVoField(physicalName = "id")
    public String getId(){
        return id;
    }

    @ElVoField(physicalName = "id")
    public void setId(String id){
        this.id = id;
    }

    @ElVoField(physicalName = "prduct_knd")
    public String getPrduct_knd(){
        return prduct_knd;
    }

    @ElVoField(physicalName = "prduct_knd")
    public void setPrduct_knd(String prduct_knd){
        this.prduct_knd = prduct_knd;
    }

    @ElVoField(physicalName = "prduct_knd_nm")
    public String getPrduct_knd_nm(){
        return prduct_knd_nm;
    }

    @ElVoField(physicalName = "prduct_knd_nm")
    public void setPrduct_knd_nm(String prduct_knd_nm){
        this.prduct_knd_nm = prduct_knd_nm;
    }

    @ElVoField(physicalName = "prduct_cd")
    public String getPrduct_cd(){
        return prduct_cd;
    }

    @ElVoField(physicalName = "prduct_cd")
    public void setPrduct_cd(String prduct_cd){
        this.prduct_cd = prduct_cd;
    }

    @ElVoField(physicalName = "item_unit_nm")
    public String getItem_unit_nm(){
        return item_unit_nm;
    }

    @ElVoField(physicalName = "item_unit_nm")
    public void setItem_unit_nm(String item_unit_nm){
        this.item_unit_nm = item_unit_nm;
    }

    @ElVoField(physicalName = "dsuse_attach_file_no")
    public String getDsuse_attach_file_no(){
        return dsuse_attach_file_no;
    }

    @ElVoField(physicalName = "dsuse_attach_file_no")
    public void setDsuse_attach_file_no(String dsuse_attach_file_no){
        this.dsuse_attach_file_no = dsuse_attach_file_no;
    }

    @ElVoField(physicalName = "dsuse_qy")
    public String getDsuse_qy(){
        return dsuse_qy;
    }

    @ElVoField(physicalName = "dsuse_qy")
    public void setDsuse_qy(String dsuse_qy){
        this.dsuse_qy = dsuse_qy;
    }

    @ElVoField(physicalName = "cpcty_qty")
    public String getCpcty_qty(){
        return cpcty_qty;
    }

    @ElVoField(physicalName = "cpcty_qty")
    public void setCpcty_qty(String cpcty_qty){
        this.cpcty_qty = cpcty_qty;
    }

    @ElVoField(physicalName = "item_qty")
    public String getItem_qty(){
        return item_qty;
    }

    @ElVoField(physicalName = "item_qty")
    public void setItem_qty(String item_qty){
        this.item_qty = item_qty;
    }

    @ElVoField(physicalName = "item_unit")
    public String getItem_unit(){
        return item_unit;
    }

    @ElVoField(physicalName = "item_unit")
    public void setItem_unit(String item_unit){
        this.item_unit = item_unit;
    }

    @ElVoField(physicalName = "msds_attach_file_no")
    public String getMsds_attach_file_no(){
        return msds_attach_file_no;
    }

    @ElVoField(physicalName = "msds_attach_file_no")
    public void setMsds_attach_file_no(String msds_attach_file_no){
        this.msds_attach_file_no = msds_attach_file_no;
    }

    @ElVoField(physicalName = "msds_url")
    public String getMsds_url(){
        return msds_url;
    }

    @ElVoField(physicalName = "msds_url")
    public void setMsds_url(String msds_url){
        this.msds_url = msds_url;
    }

    @ElVoField(physicalName = "prdu_state")
    public String getPrdu_state(){
        return prdu_state;
    }

    @ElVoField(physicalName = "prdu_state")
    public void setPrdu_state(String prdu_state){
        this.prdu_state = prdu_state;
    }

    @ElVoField(physicalName = "prduct_cd_arr")
    public String getPrduct_cd_arr(){
        return prduct_cd_arr;
    }

    @ElVoField(physicalName = "prduct_cd_arr")
    public void setPrduct_cd_arr(String prduct_cd_arr){
        this.prduct_cd_arr = prduct_cd_arr;
    }

    @ElVoField(physicalName = "cas_no")
    public String getCas_no(){
        return cas_no;
    }

    @ElVoField(physicalName = "cas_no")
    public void setCas_no(String cas_no){
        this.cas_no = cas_no;
    }

    @ElVoField(physicalName = "synonm")
    public String getSynonm(){
        return synonm;
    }

    @ElVoField(physicalName = "synonm")
    public void setSynonm(String synonm){
        this.synonm = synonm;
    }

    @ElVoField(physicalName = "chmcls_nm")
    public String getChmcls_nm(){
        return chmcls_nm;
    }

    @ElVoField(physicalName = "chmcls_nm")
    public void setChmcls_nm(String chmcls_nm){
        this.chmcls_nm = chmcls_nm;
    }

    @ElVoField(physicalName = "mixtr_mttr_cd")
    public String getMixtr_mttr_cd(){
        return mixtr_mttr_cd;
    }

    @ElVoField(physicalName = "mixtr_mttr_cd")
    public void setMixtr_mttr_cd(String mixtr_mttr_cd){
        this.mixtr_mttr_cd = mixtr_mttr_cd;
    }

    @ElVoField(physicalName = "unit_qty")
    public String getUnit_qty(){
        return unit_qty;
    }

    @ElVoField(physicalName = "unit_qty")
    public void setUnit_qty(String unit_qty){
        this.unit_qty = unit_qty;
    }

    @ElVoField(physicalName = "purchs_date")
    public String getPurchs_date(){
        return purchs_date;
    }

    @ElVoField(physicalName = "purchs_date")
    public void setPurchs_date(String purchs_date){
        this.purchs_date = purchs_date;
    }

    @ElVoField(physicalName = "regist_syspayno")
    public String getRegist_syspayno(){
        return regist_syspayno;
    }

    @ElVoField(physicalName = "regist_syspayno")
    public void setRegist_syspayno(String regist_syspayno){
        this.regist_syspayno = regist_syspayno;
    }

    @ElVoField(physicalName = "regist_nm")
    public String getRegist_nm(){
        return regist_nm;
    }

    @ElVoField(physicalName = "regist_nm")
    public void setRegist_nm(String regist_nm){
        this.regist_nm = regist_nm;
    }

    @ElVoField(physicalName = "regist_empno")
    public String getRegist_empno(){
        return regist_empno;
    }

    @ElVoField(physicalName = "regist_empno")
    public void setRegist_empno(String regist_empno){
        this.regist_empno = regist_empno;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public String getRegst_psn_syspayno(){
        return regst_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public void setRegst_psn_syspayno(String regst_psn_syspayno){
        this.regst_psn_syspayno = regst_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public String getUpdt_psn_syspayno(){
        return updt_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public void setUpdt_psn_syspayno(String updt_psn_syspayno){
        this.updt_psn_syspayno = updt_psn_syspayno;
    }

    @ElVoField(physicalName = "login_user_id")
    public String getLogin_user_id(){
        return login_user_id;
    }

    @ElVoField(physicalName = "login_user_id")
    public void setLogin_user_id(String login_user_id){
        this.login_user_id = login_user_id;
    }

    @ElVoField(physicalName = "lab_grd")
    public String getLab_grd(){
        return lab_grd;
    }

    @ElVoField(physicalName = "lab_grd")
    public void setLab_grd(String lab_grd){
        this.lab_grd = lab_grd;
    }

    @ElVoField(physicalName = "role_type")
    public String getRole_type(){
        return role_type;
    }

    @ElVoField(physicalName = "role_type")
    public void setRole_type(String role_type){
        this.role_type = role_type;
    }

    @ElVoField(physicalName = "lab_state")
    public String getLab_state(){
        return lab_state;
    }

    @ElVoField(physicalName = "lab_state")
    public void setLab_state(String lab_state){
        this.lab_state = lab_state;
    }

    @ElVoField(physicalName = "dept_typ")
    public String getDept_typ(){
        return dept_typ;
    }

    @ElVoField(physicalName = "dept_typ")
    public void setDept_typ(String dept_typ){
        this.dept_typ = dept_typ;
    }

    @ElVoField(physicalName = "req_start_ymd")
    public String getReq_start_ymd(){
        return req_start_ymd;
    }

    @ElVoField(physicalName = "req_start_ymd")
    public void setReq_start_ymd(String req_start_ymd){
        this.req_start_ymd = req_start_ymd;
    }

    @ElVoField(physicalName = "req_cls_ymd")
    public String getReq_cls_ymd(){
        return req_cls_ymd;
    }

    @ElVoField(physicalName = "req_cls_ymd")
    public void setReq_cls_ymd(String req_cls_ymd){
        this.req_cls_ymd = req_cls_ymd;
    }

    @ElVoField(physicalName = "exhst_ymd")
    public String getExhst_ymd(){
        return exhst_ymd;
    }

    @ElVoField(physicalName = "exhst_ymd")
    public void setExhst_ymd(String exhst_ymd){
        this.exhst_ymd = exhst_ymd;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "guidance_matter")
    public String getGuidance_matter(){
        return guidance_matter;
    }

    @ElVoField(physicalName = "guidance_matter")
    public void setGuidance_matter(String guidance_matter){
        this.guidance_matter = guidance_matter;
    }

    @ElVoField(physicalName = "specl_manage_mttr")
    public String getSpecl_manage_mttr(){
        return specl_manage_mttr;
    }

    @ElVoField(physicalName = "specl_manage_mttr")
    public void setSpecl_manage_mttr(String specl_manage_mttr){
        this.specl_manage_mttr = specl_manage_mttr;
    }

    @ElVoField(physicalName = "wste_clsf_arr_nm")
    public String getWste_clsf_arr_nm(){
        return wste_clsf_arr_nm;
    }

    @ElVoField(physicalName = "wste_clsf_arr_nm")
    public void setWste_clsf_arr_nm(String wste_clsf_arr_nm){
        this.wste_clsf_arr_nm = wste_clsf_arr_nm;
    }

    @ElVoField(physicalName = "wste_clsf_1")
    public String getWste_clsf_1(){
        return wste_clsf_1;
    }

    @ElVoField(physicalName = "wste_clsf_1")
    public void setWste_clsf_1(String wste_clsf_1){
        this.wste_clsf_1 = wste_clsf_1;
    }

    @ElVoField(physicalName = "wste_clsf_2")
    public String getWste_clsf_2(){
        return wste_clsf_2;
    }

    @ElVoField(physicalName = "wste_clsf_2")
    public void setWste_clsf_2(String wste_clsf_2){
        this.wste_clsf_2 = wste_clsf_2;
    }

    @ElVoField(physicalName = "manager_id")
    public String getManager_id(){
        return manager_id;
    }

    @ElVoField(physicalName = "manager_id")
    public void setManager_id(String manager_id){
        this.manager_id = manager_id;
    }

    @ElVoField(physicalName = "research_charger_id")
    public String getResearch_charger_id(){
        return research_charger_id;
    }

    @ElVoField(physicalName = "research_charger_id")
    public void setResearch_charger_id(String research_charger_id){
        this.research_charger_id = research_charger_id;
    }

    @ElVoField(physicalName = "info_cd")
    public String getInfo_cd(){
        return info_cd;
    }

    @ElVoField(physicalName = "info_cd")
    public void setInfo_cd(String info_cd){
        this.info_cd = info_cd;
    }

    @ElVoField(physicalName = "deuse_apr_state")
    public String getDeuse_apr_state(){
        return deuse_apr_state;
    }

    @ElVoField(physicalName = "deuse_apr_state")
    public void setDeuse_apr_state(String deuse_apr_state){
        this.deuse_apr_state = deuse_apr_state;
    }

    @ElVoField(physicalName = "deuse_apr_state_nm")
    public String getDeuse_apr_state_nm(){
        return deuse_apr_state_nm;
    }

    @ElVoField(physicalName = "deuse_apr_state_nm")
    public void setDeuse_apr_state_nm(String deuse_apr_state_nm){
        this.deuse_apr_state_nm = deuse_apr_state_nm;
    }

    @ElVoField(physicalName = "count")
    public int getCount(){
        return count;
    }

    @ElVoField(physicalName = "count")
    public void setCount(int count){
        this.count = count;
    }

    @ElVoField(physicalName = "research_charger")
    public String getResearch_charger(){
        return research_charger;
    }

    @ElVoField(physicalName = "research_charger")
    public void setResearch_charger(String research_charger){
        this.research_charger = research_charger;
    }

    @ElVoField(physicalName = "manager")
    public String getManager(){
        return manager;
    }

    @ElVoField(physicalName = "manager")
    public void setManager(String manager){
        this.manager = manager;
    }

    @ElVoField(physicalName = "dcsn_daytm")
    public String getDcsn_daytm(){
        return dcsn_daytm;
    }

    @ElVoField(physicalName = "dcsn_daytm")
    public void setDcsn_daytm(String dcsn_daytm){
        this.dcsn_daytm = dcsn_daytm;
    }

    @ElVoField(physicalName = "wste_clsf_nm")
    public String getWste_clsf_nm(){
        return wste_clsf_nm;
    }

    @ElVoField(physicalName = "wste_clsf_nm")
    public void setWste_clsf_nm(String wste_clsf_nm){
        this.wste_clsf_nm = wste_clsf_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SafChePrdDsuseInfoVo [");
        sb.append("dsuse_req_no").append("=").append(dsuse_req_no).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("aprChk").append("=").append(aprChk).append(",");
        sb.append("lab_no").append("=").append(lab_no).append(",");
        sb.append("space_cd").append("=").append(space_cd).append(",");
        sb.append("lab_nm").append("=").append(lab_nm).append(",");
        sb.append("reqst_syspayno").append("=").append(reqst_syspayno).append(",");
        sb.append("reqst_nm").append("=").append(reqst_nm).append(",");
        sb.append("reqst_mobile").append("=").append(reqst_mobile).append(",");
        sb.append("reqst_empno").append("=").append(reqst_empno).append(",");
        sb.append("reqst_dept_nm").append("=").append(reqst_dept_nm).append(",");
        sb.append("reqst_dept_cd").append("=").append(reqst_dept_cd).append(",");
        sb.append("reqst_dept_new_ymd").append("=").append(reqst_dept_new_ymd).append(",");
        sb.append("reqst_ymd").append("=").append(reqst_ymd).append(",");
        sb.append("wste_exhst_ymd").append("=").append(wste_exhst_ymd).append(",");
        sb.append("odr").append("=").append(odr).append(",");
        sb.append("main_secrt_rspns_syspayno").append("=").append(main_secrt_rspns_syspayno).append(",");
        sb.append("main_secrt_rspns_nm").append("=").append(main_secrt_rspns_nm).append(",");
        sb.append("main_mobile").append("=").append(main_mobile).append(",");
        sb.append("main_empno").append("=").append(main_empno).append(",");
        sb.append("sub_secrt_rspns_syspayno").append("=").append(sub_secrt_rspns_syspayno).append(",");
        sb.append("sub_secrt_rspns_nm").append("=").append(sub_secrt_rspns_nm).append(",");
        sb.append("sub_mobile").append("=").append(sub_mobile).append(",");
        sb.append("sub_empno").append("=").append(sub_empno).append(",");
        sb.append("address").append("=").append(address).append(",");
        sb.append("deuse_gubun").append("=").append(deuse_gubun).append(",");
        sb.append("centr_cd").append("=").append(centr_cd).append(",");
        sb.append("centr_nm").append("=").append(centr_nm).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("wste_clsf").append("=").append(wste_clsf).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("req_psn_email").append("=").append(req_psn_email).append(",");
        sb.append("req_psn_tel").append("=").append(req_psn_tel).append(",");
        sb.append("charg_syspayno").append("=").append(charg_syspayno).append(",");
        sb.append("req_state").append("=").append(req_state).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("companion_rs").append("=").append(companion_rs).append(",");
        sb.append("cn").append("=").append(cn).append(",");
        sb.append("req_psn_syspayno_nm").append("=").append(req_psn_syspayno_nm).append(",");
        sb.append("prduct_nm").append("=").append(prduct_nm).append(",");
        sb.append("use_req_no").append("=").append(use_req_no).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("end_ymd").append("=").append(end_ymd).append(",");
        sb.append("search_date").append("=").append(search_date).append(",");
        sb.append("req_syspayno").append("=").append(req_syspayno).append(",");
        sb.append("main_syspayno").append("=").append(main_syspayno).append(",");
        sb.append("makr_cmpny").append("=").append(makr_cmpny).append(",");
        sb.append("manager_yn").append("=").append(manager_yn).append(",");
        sb.append("disposal_state").append("=").append(disposal_state).append(",");
        sb.append("prdu_state_new").append("=").append(prdu_state_new).append(",");
        sb.append("prdu_state_old").append("=").append(prdu_state_old).append(",");
        sb.append("disposal_state_nm").append("=").append(disposal_state_nm).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("service_id").append("=").append(service_id).append(",");
        sb.append("doc_id").append("=").append(doc_id).append(",");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("id").append("=").append(id).append(",");
        sb.append("prduct_knd").append("=").append(prduct_knd).append(",");
        sb.append("prduct_knd_nm").append("=").append(prduct_knd_nm).append(",");
        sb.append("prduct_cd").append("=").append(prduct_cd).append(",");
        sb.append("item_unit_nm").append("=").append(item_unit_nm).append(",");
        sb.append("dsuse_attach_file_no").append("=").append(dsuse_attach_file_no).append(",");
        sb.append("dsuse_qy").append("=").append(dsuse_qy).append(",");
        sb.append("cpcty_qty").append("=").append(cpcty_qty).append(",");
        sb.append("item_qty").append("=").append(item_qty).append(",");
        sb.append("item_unit").append("=").append(item_unit).append(",");
        sb.append("msds_attach_file_no").append("=").append(msds_attach_file_no).append(",");
        sb.append("msds_url").append("=").append(msds_url).append(",");
        sb.append("prdu_state").append("=").append(prdu_state).append(",");
        sb.append("prduct_cd_arr").append("=").append(prduct_cd_arr).append(",");
        sb.append("cas_no").append("=").append(cas_no).append(",");
        sb.append("synonm").append("=").append(synonm).append(",");
        sb.append("chmcls_nm").append("=").append(chmcls_nm).append(",");
        sb.append("mixtr_mttr_cd").append("=").append(mixtr_mttr_cd).append(",");
        sb.append("unit_qty").append("=").append(unit_qty).append(",");
        sb.append("purchs_date").append("=").append(purchs_date).append(",");
        sb.append("regist_syspayno").append("=").append(regist_syspayno).append(",");
        sb.append("regist_nm").append("=").append(regist_nm).append(",");
        sb.append("regist_empno").append("=").append(regist_empno).append(",");
        sb.append("regst_psn_syspayno").append("=").append(regst_psn_syspayno).append(",");
        sb.append("updt_psn_syspayno").append("=").append(updt_psn_syspayno).append(",");
        sb.append("login_user_id").append("=").append(login_user_id).append(",");
        sb.append("lab_grd").append("=").append(lab_grd).append(",");
        sb.append("role_type").append("=").append(role_type).append(",");
        sb.append("lab_state").append("=").append(lab_state).append(",");
        sb.append("dept_typ").append("=").append(dept_typ).append(",");
        sb.append("req_start_ymd").append("=").append(req_start_ymd).append(",");
        sb.append("req_cls_ymd").append("=").append(req_cls_ymd).append(",");
        sb.append("exhst_ymd").append("=").append(exhst_ymd).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("guidance_matter").append("=").append(guidance_matter).append(",");
        sb.append("specl_manage_mttr").append("=").append(specl_manage_mttr).append(",");
        sb.append("wste_clsf_arr_nm").append("=").append(wste_clsf_arr_nm).append(",");
        sb.append("wste_clsf_1").append("=").append(wste_clsf_1).append(",");
        sb.append("wste_clsf_2").append("=").append(wste_clsf_2).append(",");
        sb.append("manager_id").append("=").append(manager_id).append(",");
        sb.append("research_charger_id").append("=").append(research_charger_id).append(",");
        sb.append("info_cd").append("=").append(info_cd).append(",");
        sb.append("deuse_apr_state").append("=").append(deuse_apr_state).append(",");
        sb.append("deuse_apr_state_nm").append("=").append(deuse_apr_state_nm).append(",");
        sb.append("count").append("=").append(count).append(",");
        sb.append("research_charger").append("=").append(research_charger).append(",");
        sb.append("manager").append("=").append(manager).append(",");
        sb.append("dcsn_daytm").append("=").append(dcsn_daytm).append(",");
        sb.append("wste_clsf_nm").append("=").append(wste_clsf_nm);
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
