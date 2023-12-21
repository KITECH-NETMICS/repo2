package kr.re.kitech.biz.saf.che.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "화학제품폐기신청조회조건")
public class SafCheSearchInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SafCheSearchInfoVo(){
    }

    @ElDtoField(logicalName = "dsuseReqNo", physicalName = "dsuse_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dsuse_req_no;

    @ElDtoField(logicalName = "labNo", physicalName = "lab_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lab_no;

    @ElDtoField(logicalName = "spaceCd", physicalName = "space_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String space_cd;

    @ElDtoField(logicalName = "odr", physicalName = "odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int odr;

    @ElDtoField(logicalName = "deuseGubun", physicalName = "deuse_gubun", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String deuse_gubun;

    @ElDtoField(logicalName = "centrCd", physicalName = "centr_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String centr_cd;

    @ElDtoField(logicalName = "deptCd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "wsteClsf", physicalName = "wste_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wste_clsf;

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "aprState", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "useReqNo", physicalName = "use_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_req_no;

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

    @ElDtoField(logicalName = "prductCd", physicalName = "prduct_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prduct_cd;

    @ElDtoField(logicalName = "casNo", physicalName = "cas_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cas_no;

    @ElDtoField(logicalName = "mngmtItem1", physicalName = "mngmt_item_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_1;

    @ElDtoField(logicalName = "reqNoChk", physicalName = "req_no_chk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no_chk;

    @ElDtoField(logicalName = "reqstYmd", physicalName = "reqst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reqst_ymd;

    @ElDtoField(logicalName = "wsteExhstYmd", physicalName = "wste_exhst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wste_exhst_ymd;

    @ElDtoField(logicalName = "req_ymd", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "aprChk", physicalName = "aprChk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aprChk;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "startYmd", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;

    @ElDtoField(logicalName = "endYmd", physicalName = "end_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String end_ymd;

    @ElDtoField(logicalName = "searchDate", physicalName = "search_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String search_date;

    @ElDtoField(logicalName = "labGrd", physicalName = "lab_grd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lab_grd;

    @ElDtoField(logicalName = "roleType", physicalName = "role_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String role_type;

    @ElDtoField(logicalName = "labState", physicalName = "lab_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lab_state;

    @ElDtoField(logicalName = "deptTyp", physicalName = "dept_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_typ;

    @ElDtoField(logicalName = "loginUserId", physicalName = "login_user_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String login_user_id;

    @ElDtoField(logicalName = "prductNm", physicalName = "prduct_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prduct_nm;

    @ElDtoField(logicalName = "labNm", physicalName = "lab_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lab_nm;

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

    @ElDtoField(logicalName = "exhstYmd", physicalName = "exhst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exhst_ymd;

    @ElDtoField(logicalName = "main_secrt_rspns_syspayno", physicalName = "main_secrt_rspns_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_secrt_rspns_syspayno;

    @ElDtoField(logicalName = "synonm", physicalName = "synonm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String synonm;

    @ElDtoField(logicalName = "chmclsNm", physicalName = "chmcls_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chmcls_nm;

    @ElVoField(physicalName = "dsuse_req_no")
    public String getDsuse_req_no(){
        return dsuse_req_no;
    }

    @ElVoField(physicalName = "dsuse_req_no")
    public void setDsuse_req_no(String dsuse_req_no){
        this.dsuse_req_no = dsuse_req_no;
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

    @ElVoField(physicalName = "odr")
    public int getOdr(){
        return odr;
    }

    @ElVoField(physicalName = "odr")
    public void setOdr(int odr){
        this.odr = odr;
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

    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }

    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
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

    @ElVoField(physicalName = "use_req_no")
    public String getUse_req_no(){
        return use_req_no;
    }

    @ElVoField(physicalName = "use_req_no")
    public void setUse_req_no(String use_req_no){
        this.use_req_no = use_req_no;
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

    @ElVoField(physicalName = "prduct_cd")
    public String getPrduct_cd(){
        return prduct_cd;
    }

    @ElVoField(physicalName = "prduct_cd")
    public void setPrduct_cd(String prduct_cd){
        this.prduct_cd = prduct_cd;
    }

    @ElVoField(physicalName = "cas_no")
    public String getCas_no(){
        return cas_no;
    }

    @ElVoField(physicalName = "cas_no")
    public void setCas_no(String cas_no){
        this.cas_no = cas_no;
    }

    @ElVoField(physicalName = "mngmt_item_1")
    public String getMngmt_item_1(){
        return mngmt_item_1;
    }

    @ElVoField(physicalName = "mngmt_item_1")
    public void setMngmt_item_1(String mngmt_item_1){
        this.mngmt_item_1 = mngmt_item_1;
    }

    @ElVoField(physicalName = "req_no_chk")
    public String getReq_no_chk(){
        return req_no_chk;
    }

    @ElVoField(physicalName = "req_no_chk")
    public void setReq_no_chk(String req_no_chk){
        this.req_no_chk = req_no_chk;
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

    @ElVoField(physicalName = "login_user_id")
    public String getLogin_user_id(){
        return login_user_id;
    }

    @ElVoField(physicalName = "login_user_id")
    public void setLogin_user_id(String login_user_id){
        this.login_user_id = login_user_id;
    }

    @ElVoField(physicalName = "prduct_nm")
    public String getPrduct_nm(){
        return prduct_nm;
    }

    @ElVoField(physicalName = "prduct_nm")
    public void setPrduct_nm(String prduct_nm){
        this.prduct_nm = prduct_nm;
    }

    @ElVoField(physicalName = "lab_nm")
    public String getLab_nm(){
        return lab_nm;
    }

    @ElVoField(physicalName = "lab_nm")
    public void setLab_nm(String lab_nm){
        this.lab_nm = lab_nm;
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

    @ElVoField(physicalName = "exhst_ymd")
    public String getExhst_ymd(){
        return exhst_ymd;
    }

    @ElVoField(physicalName = "exhst_ymd")
    public void setExhst_ymd(String exhst_ymd){
        this.exhst_ymd = exhst_ymd;
    }

    @ElVoField(physicalName = "main_secrt_rspns_syspayno")
    public String getMain_secrt_rspns_syspayno(){
        return main_secrt_rspns_syspayno;
    }

    @ElVoField(physicalName = "main_secrt_rspns_syspayno")
    public void setMain_secrt_rspns_syspayno(String main_secrt_rspns_syspayno){
        this.main_secrt_rspns_syspayno = main_secrt_rspns_syspayno;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SafCheSearchInfoVo [");
        sb.append("dsuse_req_no").append("=").append(dsuse_req_no).append(",");
        sb.append("lab_no").append("=").append(lab_no).append(",");
        sb.append("space_cd").append("=").append(space_cd).append(",");
        sb.append("odr").append("=").append(odr).append(",");
        sb.append("deuse_gubun").append("=").append(deuse_gubun).append(",");
        sb.append("centr_cd").append("=").append(centr_cd).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("wste_clsf").append("=").append(wste_clsf).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("use_req_no").append("=").append(use_req_no).append(",");
        sb.append("service_id").append("=").append(service_id).append(",");
        sb.append("doc_id").append("=").append(doc_id).append(",");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("id").append("=").append(id).append(",");
        sb.append("prduct_knd").append("=").append(prduct_knd).append(",");
        sb.append("prduct_cd").append("=").append(prduct_cd).append(",");
        sb.append("cas_no").append("=").append(cas_no).append(",");
        sb.append("mngmt_item_1").append("=").append(mngmt_item_1).append(",");
        sb.append("req_no_chk").append("=").append(req_no_chk).append(",");
        sb.append("reqst_ymd").append("=").append(reqst_ymd).append(",");
        sb.append("wste_exhst_ymd").append("=").append(wste_exhst_ymd).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("aprChk").append("=").append(aprChk).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("end_ymd").append("=").append(end_ymd).append(",");
        sb.append("search_date").append("=").append(search_date).append(",");
        sb.append("lab_grd").append("=").append(lab_grd).append(",");
        sb.append("role_type").append("=").append(role_type).append(",");
        sb.append("lab_state").append("=").append(lab_state).append(",");
        sb.append("dept_typ").append("=").append(dept_typ).append(",");
        sb.append("login_user_id").append("=").append(login_user_id).append(",");
        sb.append("prduct_nm").append("=").append(prduct_nm).append(",");
        sb.append("lab_nm").append("=").append(lab_nm).append(",");
        sb.append("req_syspayno").append("=").append(req_syspayno).append(",");
        sb.append("main_syspayno").append("=").append(main_syspayno).append(",");
        sb.append("makr_cmpny").append("=").append(makr_cmpny).append(",");
        sb.append("manager_yn").append("=").append(manager_yn).append(",");
        sb.append("disposal_state").append("=").append(disposal_state).append(",");
        sb.append("exhst_ymd").append("=").append(exhst_ymd).append(",");
        sb.append("main_secrt_rspns_syspayno").append("=").append(main_secrt_rspns_syspayno).append(",");
        sb.append("synonm").append("=").append(synonm).append(",");
        sb.append("chmcls_nm").append("=").append(chmcls_nm);
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
