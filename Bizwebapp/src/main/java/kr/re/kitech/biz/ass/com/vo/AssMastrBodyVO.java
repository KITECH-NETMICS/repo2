package kr.re.kitech.biz.ass.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "자산마스터 바디 Vo")
public class AssMastrBodyVO extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AssMastrBodyVO(){
    }

    @ElDtoField(logicalName = "자산번호", physicalName = "aset_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_no;

    @ElDtoField(logicalName = "자산명", physicalName = "aset_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_nm;

    @ElDtoField(logicalName = "공용구분", physicalName = "couse_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String couse_clsf;

    @ElDtoField(logicalName = "장비코드", physicalName = "equip_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_cd;

    @ElDtoField(logicalName = "장비사용자개인번호", physicalName = "user_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_syspayno;

    @ElDtoField(logicalName = "모델명", physicalName = "model_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String model_nm;

    @ElDtoField(logicalName = "기술장비명", physicalName = "tech_equip_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_equip_nm;

    @ElDtoField(logicalName = "장비상태", physicalName = "equip_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_state;

    @ElDtoField(logicalName = "제조국가", physicalName = "mfg_natn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mfg_natn;

    @ElDtoField(logicalName = "계약업체", physicalName = "contrct_vend", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_vend;

    @ElDtoField(logicalName = "공급업체", physicalName = "suply_vend", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String suply_vend;

    @ElDtoField(logicalName = "제조업체", physicalName = "mfg_vend", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mfg_vend;

    @ElDtoField(logicalName = "재원", physicalName = "finnc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String finnc;

    @ElDtoField(logicalName = "통화단위", physicalName = "curncy_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curncy_unit;

    @ElDtoField(logicalName = "단위", physicalName = "unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unit;

    @ElDtoField(logicalName = "수량", physicalName = "qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String qty;

    @ElDtoField(logicalName = "이동구분", physicalName = "move_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String move_clsf;

    @ElDtoField(logicalName = "장비지역", physicalName = "equip_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_region;

    @ElDtoField(logicalName = "도입방법", physicalName = "intro_way", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intro_way;

    @ElDtoField(logicalName = "관리시작일자", physicalName = "mngmt_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_start_ymd;

    @ElDtoField(logicalName = "관리종료일자", physicalName = "mngmt_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_cls_ymd;

    @ElDtoField(logicalName = "취득년도", physicalName = "acq_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String acq_yr;

    @ElDtoField(logicalName = "내용년수", physicalName = "contnt_yrs", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contnt_yrs;

    @ElDtoField(logicalName = "장비사용료", physicalName = "equip_use_fee", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_use_fee;

    @ElDtoField(logicalName = "사용추정시간", physicalName = "use_esti_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_esti_time;

    @ElDtoField(logicalName = "미보유자산구분", physicalName = "keep_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String keep_clsf;

    @ElDtoField(logicalName = "결의번호", physicalName = "slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_no;

    @ElDtoField(logicalName = "결의순번", physicalName = "slip_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_odr;

    @ElDtoField(logicalName = "기술지원구분", physicalName = "techsup_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String techsup_clsf;

    @ElDtoField(logicalName = "용도설명", physicalName = "usg_desc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String usg_desc;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "홈페이지연계구분", physicalName = "homepg_link_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String homepg_link_clsf;

    @ElDtoField(logicalName = "자금구분", physicalName = "cptl_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cptl_clsf;

    @ElDtoField(logicalName = "위치지역", physicalName = "posi_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_region;

    @ElDtoField(logicalName = "위치건물", physicalName = "posi_build", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_build;

    @ElDtoField(logicalName = "위치층", physicalName = "posi_floor", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_floor;

    @ElDtoField(logicalName = "위치상세", physicalName = "posi_detls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_detls;

    @ElDtoField(logicalName = "메인부속구분", physicalName = "main_sub_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_sub_clsf;

    @ElDtoField(logicalName = "관련자산번호", physicalName = "relat_aset_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat_aset_no;

    @ElDtoField(logicalName = "부자산도입일자", physicalName = "sub_aset_intro_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sub_aset_intro_ymd;

    @ElDtoField(logicalName = "구자산번호", physicalName = "old_aset_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String old_aset_no;

    @ElDtoField(logicalName = "업그레이드구분", physicalName = "upgrade_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String upgrade_clsf;

    @ElDtoField(logicalName = "태그발행유무", physicalName = "tag_issu_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tag_issu_ex;

    @ElDtoField(logicalName = "관리주체", physicalName = "mngmt_mbody", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_mbody;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "PDA전송여부", physicalName = "pda_send_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pda_send_yn;

    @ElDtoField(logicalName = "모델명유무", physicalName = "model_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String model_yn;

    @ElDtoField(logicalName = "전산장비해당여부", physicalName = "compu_equip_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String compu_equip_yn;

    @ElDtoField(logicalName = "전산장비세부구분", physicalName = "compu_equip_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String compu_equip_cd;

    @ElDtoField(logicalName = "인수자시스템번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElVoField(physicalName = "aset_no")
    public String getAset_no(){
        return aset_no;
    }

    @ElVoField(physicalName = "aset_no")
    public void setAset_no(String aset_no){
        this.aset_no = aset_no;
    }

    @ElVoField(physicalName = "aset_nm")
    public String getAset_nm(){
        return aset_nm;
    }

    @ElVoField(physicalName = "aset_nm")
    public void setAset_nm(String aset_nm){
        this.aset_nm = aset_nm;
    }

    @ElVoField(physicalName = "couse_clsf")
    public String getCouse_clsf(){
        return couse_clsf;
    }

    @ElVoField(physicalName = "couse_clsf")
    public void setCouse_clsf(String couse_clsf){
        this.couse_clsf = couse_clsf;
    }

    @ElVoField(physicalName = "equip_cd")
    public String getEquip_cd(){
        return equip_cd;
    }

    @ElVoField(physicalName = "equip_cd")
    public void setEquip_cd(String equip_cd){
        this.equip_cd = equip_cd;
    }

    @ElVoField(physicalName = "user_syspayno")
    public String getUser_syspayno(){
        return user_syspayno;
    }

    @ElVoField(physicalName = "user_syspayno")
    public void setUser_syspayno(String user_syspayno){
        this.user_syspayno = user_syspayno;
    }

    @ElVoField(physicalName = "model_nm")
    public String getModel_nm(){
        return model_nm;
    }

    @ElVoField(physicalName = "model_nm")
    public void setModel_nm(String model_nm){
        this.model_nm = model_nm;
    }

    @ElVoField(physicalName = "tech_equip_nm")
    public String getTech_equip_nm(){
        return tech_equip_nm;
    }

    @ElVoField(physicalName = "tech_equip_nm")
    public void setTech_equip_nm(String tech_equip_nm){
        this.tech_equip_nm = tech_equip_nm;
    }

    @ElVoField(physicalName = "equip_state")
    public String getEquip_state(){
        return equip_state;
    }

    @ElVoField(physicalName = "equip_state")
    public void setEquip_state(String equip_state){
        this.equip_state = equip_state;
    }

    @ElVoField(physicalName = "mfg_natn")
    public String getMfg_natn(){
        return mfg_natn;
    }

    @ElVoField(physicalName = "mfg_natn")
    public void setMfg_natn(String mfg_natn){
        this.mfg_natn = mfg_natn;
    }

    @ElVoField(physicalName = "contrct_vend")
    public String getContrct_vend(){
        return contrct_vend;
    }

    @ElVoField(physicalName = "contrct_vend")
    public void setContrct_vend(String contrct_vend){
        this.contrct_vend = contrct_vend;
    }

    @ElVoField(physicalName = "suply_vend")
    public String getSuply_vend(){
        return suply_vend;
    }

    @ElVoField(physicalName = "suply_vend")
    public void setSuply_vend(String suply_vend){
        this.suply_vend = suply_vend;
    }

    @ElVoField(physicalName = "mfg_vend")
    public String getMfg_vend(){
        return mfg_vend;
    }

    @ElVoField(physicalName = "mfg_vend")
    public void setMfg_vend(String mfg_vend){
        this.mfg_vend = mfg_vend;
    }

    @ElVoField(physicalName = "finnc")
    public String getFinnc(){
        return finnc;
    }

    @ElVoField(physicalName = "finnc")
    public void setFinnc(String finnc){
        this.finnc = finnc;
    }

    @ElVoField(physicalName = "curncy_unit")
    public String getCurncy_unit(){
        return curncy_unit;
    }

    @ElVoField(physicalName = "curncy_unit")
    public void setCurncy_unit(String curncy_unit){
        this.curncy_unit = curncy_unit;
    }

    @ElVoField(physicalName = "unit")
    public String getUnit(){
        return unit;
    }

    @ElVoField(physicalName = "unit")
    public void setUnit(String unit){
        this.unit = unit;
    }

    @ElVoField(physicalName = "qty")
    public String getQty(){
        return qty;
    }

    @ElVoField(physicalName = "qty")
    public void setQty(String qty){
        this.qty = qty;
    }

    @ElVoField(physicalName = "move_clsf")
    public String getMove_clsf(){
        return move_clsf;
    }

    @ElVoField(physicalName = "move_clsf")
    public void setMove_clsf(String move_clsf){
        this.move_clsf = move_clsf;
    }

    @ElVoField(physicalName = "equip_region")
    public String getEquip_region(){
        return equip_region;
    }

    @ElVoField(physicalName = "equip_region")
    public void setEquip_region(String equip_region){
        this.equip_region = equip_region;
    }

    @ElVoField(physicalName = "intro_way")
    public String getIntro_way(){
        return intro_way;
    }

    @ElVoField(physicalName = "intro_way")
    public void setIntro_way(String intro_way){
        this.intro_way = intro_way;
    }

    @ElVoField(physicalName = "mngmt_start_ymd")
    public String getMngmt_start_ymd(){
        return mngmt_start_ymd;
    }

    @ElVoField(physicalName = "mngmt_start_ymd")
    public void setMngmt_start_ymd(String mngmt_start_ymd){
        this.mngmt_start_ymd = mngmt_start_ymd;
    }

    @ElVoField(physicalName = "mngmt_cls_ymd")
    public String getMngmt_cls_ymd(){
        return mngmt_cls_ymd;
    }

    @ElVoField(physicalName = "mngmt_cls_ymd")
    public void setMngmt_cls_ymd(String mngmt_cls_ymd){
        this.mngmt_cls_ymd = mngmt_cls_ymd;
    }

    @ElVoField(physicalName = "acq_yr")
    public String getAcq_yr(){
        return acq_yr;
    }

    @ElVoField(physicalName = "acq_yr")
    public void setAcq_yr(String acq_yr){
        this.acq_yr = acq_yr;
    }

    @ElVoField(physicalName = "contnt_yrs")
    public String getContnt_yrs(){
        return contnt_yrs;
    }

    @ElVoField(physicalName = "contnt_yrs")
    public void setContnt_yrs(String contnt_yrs){
        this.contnt_yrs = contnt_yrs;
    }

    @ElVoField(physicalName = "equip_use_fee")
    public String getEquip_use_fee(){
        return equip_use_fee;
    }

    @ElVoField(physicalName = "equip_use_fee")
    public void setEquip_use_fee(String equip_use_fee){
        this.equip_use_fee = equip_use_fee;
    }

    @ElVoField(physicalName = "use_esti_time")
    public String getUse_esti_time(){
        return use_esti_time;
    }

    @ElVoField(physicalName = "use_esti_time")
    public void setUse_esti_time(String use_esti_time){
        this.use_esti_time = use_esti_time;
    }

    @ElVoField(physicalName = "keep_clsf")
    public String getKeep_clsf(){
        return keep_clsf;
    }

    @ElVoField(physicalName = "keep_clsf")
    public void setKeep_clsf(String keep_clsf){
        this.keep_clsf = keep_clsf;
    }

    @ElVoField(physicalName = "slip_no")
    public String getSlip_no(){
        return slip_no;
    }

    @ElVoField(physicalName = "slip_no")
    public void setSlip_no(String slip_no){
        this.slip_no = slip_no;
    }

    @ElVoField(physicalName = "slip_odr")
    public String getSlip_odr(){
        return slip_odr;
    }

    @ElVoField(physicalName = "slip_odr")
    public void setSlip_odr(String slip_odr){
        this.slip_odr = slip_odr;
    }

    @ElVoField(physicalName = "techsup_clsf")
    public String getTechsup_clsf(){
        return techsup_clsf;
    }

    @ElVoField(physicalName = "techsup_clsf")
    public void setTechsup_clsf(String techsup_clsf){
        this.techsup_clsf = techsup_clsf;
    }

    @ElVoField(physicalName = "usg_desc")
    public String getUsg_desc(){
        return usg_desc;
    }

    @ElVoField(physicalName = "usg_desc")
    public void setUsg_desc(String usg_desc){
        this.usg_desc = usg_desc;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "homepg_link_clsf")
    public String getHomepg_link_clsf(){
        return homepg_link_clsf;
    }

    @ElVoField(physicalName = "homepg_link_clsf")
    public void setHomepg_link_clsf(String homepg_link_clsf){
        this.homepg_link_clsf = homepg_link_clsf;
    }

    @ElVoField(physicalName = "cptl_clsf")
    public String getCptl_clsf(){
        return cptl_clsf;
    }

    @ElVoField(physicalName = "cptl_clsf")
    public void setCptl_clsf(String cptl_clsf){
        this.cptl_clsf = cptl_clsf;
    }

    @ElVoField(physicalName = "posi_region")
    public String getPosi_region(){
        return posi_region;
    }

    @ElVoField(physicalName = "posi_region")
    public void setPosi_region(String posi_region){
        this.posi_region = posi_region;
    }

    @ElVoField(physicalName = "posi_build")
    public String getPosi_build(){
        return posi_build;
    }

    @ElVoField(physicalName = "posi_build")
    public void setPosi_build(String posi_build){
        this.posi_build = posi_build;
    }

    @ElVoField(physicalName = "posi_floor")
    public String getPosi_floor(){
        return posi_floor;
    }

    @ElVoField(physicalName = "posi_floor")
    public void setPosi_floor(String posi_floor){
        this.posi_floor = posi_floor;
    }

    @ElVoField(physicalName = "posi_detls")
    public String getPosi_detls(){
        return posi_detls;
    }

    @ElVoField(physicalName = "posi_detls")
    public void setPosi_detls(String posi_detls){
        this.posi_detls = posi_detls;
    }

    @ElVoField(physicalName = "main_sub_clsf")
    public String getMain_sub_clsf(){
        return main_sub_clsf;
    }

    @ElVoField(physicalName = "main_sub_clsf")
    public void setMain_sub_clsf(String main_sub_clsf){
        this.main_sub_clsf = main_sub_clsf;
    }

    @ElVoField(physicalName = "relat_aset_no")
    public String getRelat_aset_no(){
        return relat_aset_no;
    }

    @ElVoField(physicalName = "relat_aset_no")
    public void setRelat_aset_no(String relat_aset_no){
        this.relat_aset_no = relat_aset_no;
    }

    @ElVoField(physicalName = "sub_aset_intro_ymd")
    public String getSub_aset_intro_ymd(){
        return sub_aset_intro_ymd;
    }

    @ElVoField(physicalName = "sub_aset_intro_ymd")
    public void setSub_aset_intro_ymd(String sub_aset_intro_ymd){
        this.sub_aset_intro_ymd = sub_aset_intro_ymd;
    }

    @ElVoField(physicalName = "old_aset_no")
    public String getOld_aset_no(){
        return old_aset_no;
    }

    @ElVoField(physicalName = "old_aset_no")
    public void setOld_aset_no(String old_aset_no){
        this.old_aset_no = old_aset_no;
    }

    @ElVoField(physicalName = "upgrade_clsf")
    public String getUpgrade_clsf(){
        return upgrade_clsf;
    }

    @ElVoField(physicalName = "upgrade_clsf")
    public void setUpgrade_clsf(String upgrade_clsf){
        this.upgrade_clsf = upgrade_clsf;
    }

    @ElVoField(physicalName = "tag_issu_ex")
    public String getTag_issu_ex(){
        return tag_issu_ex;
    }

    @ElVoField(physicalName = "tag_issu_ex")
    public void setTag_issu_ex(String tag_issu_ex){
        this.tag_issu_ex = tag_issu_ex;
    }

    @ElVoField(physicalName = "mngmt_mbody")
    public String getMngmt_mbody(){
        return mngmt_mbody;
    }

    @ElVoField(physicalName = "mngmt_mbody")
    public void setMngmt_mbody(String mngmt_mbody){
        this.mngmt_mbody = mngmt_mbody;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "pda_send_yn")
    public String getPda_send_yn(){
        return pda_send_yn;
    }

    @ElVoField(physicalName = "pda_send_yn")
    public void setPda_send_yn(String pda_send_yn){
        this.pda_send_yn = pda_send_yn;
    }

    @ElVoField(physicalName = "model_yn")
    public String getModel_yn(){
        return model_yn;
    }

    @ElVoField(physicalName = "model_yn")
    public void setModel_yn(String model_yn){
        this.model_yn = model_yn;
    }

    @ElVoField(physicalName = "compu_equip_yn")
    public String getCompu_equip_yn(){
        return compu_equip_yn;
    }

    @ElVoField(physicalName = "compu_equip_yn")
    public void setCompu_equip_yn(String compu_equip_yn){
        this.compu_equip_yn = compu_equip_yn;
    }

    @ElVoField(physicalName = "compu_equip_cd")
    public String getCompu_equip_cd(){
        return compu_equip_cd;
    }

    @ElVoField(physicalName = "compu_equip_cd")
    public void setCompu_equip_cd(String compu_equip_cd){
        this.compu_equip_cd = compu_equip_cd;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AssMastrBodyVO [");
        sb.append("aset_no").append("=").append(aset_no).append(",");
        sb.append("aset_nm").append("=").append(aset_nm).append(",");
        sb.append("couse_clsf").append("=").append(couse_clsf).append(",");
        sb.append("equip_cd").append("=").append(equip_cd).append(",");
        sb.append("user_syspayno").append("=").append(user_syspayno).append(",");
        sb.append("model_nm").append("=").append(model_nm).append(",");
        sb.append("tech_equip_nm").append("=").append(tech_equip_nm).append(",");
        sb.append("equip_state").append("=").append(equip_state).append(",");
        sb.append("mfg_natn").append("=").append(mfg_natn).append(",");
        sb.append("contrct_vend").append("=").append(contrct_vend).append(",");
        sb.append("suply_vend").append("=").append(suply_vend).append(",");
        sb.append("mfg_vend").append("=").append(mfg_vend).append(",");
        sb.append("finnc").append("=").append(finnc).append(",");
        sb.append("curncy_unit").append("=").append(curncy_unit).append(",");
        sb.append("unit").append("=").append(unit).append(",");
        sb.append("qty").append("=").append(qty).append(",");
        sb.append("move_clsf").append("=").append(move_clsf).append(",");
        sb.append("equip_region").append("=").append(equip_region).append(",");
        sb.append("intro_way").append("=").append(intro_way).append(",");
        sb.append("mngmt_start_ymd").append("=").append(mngmt_start_ymd).append(",");
        sb.append("mngmt_cls_ymd").append("=").append(mngmt_cls_ymd).append(",");
        sb.append("acq_yr").append("=").append(acq_yr).append(",");
        sb.append("contnt_yrs").append("=").append(contnt_yrs).append(",");
        sb.append("equip_use_fee").append("=").append(equip_use_fee).append(",");
        sb.append("use_esti_time").append("=").append(use_esti_time).append(",");
        sb.append("keep_clsf").append("=").append(keep_clsf).append(",");
        sb.append("slip_no").append("=").append(slip_no).append(",");
        sb.append("slip_odr").append("=").append(slip_odr).append(",");
        sb.append("techsup_clsf").append("=").append(techsup_clsf).append(",");
        sb.append("usg_desc").append("=").append(usg_desc).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("homepg_link_clsf").append("=").append(homepg_link_clsf).append(",");
        sb.append("cptl_clsf").append("=").append(cptl_clsf).append(",");
        sb.append("posi_region").append("=").append(posi_region).append(",");
        sb.append("posi_build").append("=").append(posi_build).append(",");
        sb.append("posi_floor").append("=").append(posi_floor).append(",");
        sb.append("posi_detls").append("=").append(posi_detls).append(",");
        sb.append("main_sub_clsf").append("=").append(main_sub_clsf).append(",");
        sb.append("relat_aset_no").append("=").append(relat_aset_no).append(",");
        sb.append("sub_aset_intro_ymd").append("=").append(sub_aset_intro_ymd).append(",");
        sb.append("old_aset_no").append("=").append(old_aset_no).append(",");
        sb.append("upgrade_clsf").append("=").append(upgrade_clsf).append(",");
        sb.append("tag_issu_ex").append("=").append(tag_issu_ex).append(",");
        sb.append("mngmt_mbody").append("=").append(mngmt_mbody).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("pda_send_yn").append("=").append(pda_send_yn).append(",");
        sb.append("model_yn").append("=").append(model_yn).append(",");
        sb.append("compu_equip_yn").append("=").append(compu_equip_yn).append(",");
        sb.append("compu_equip_cd").append("=").append(compu_equip_cd).append(",");
        sb.append("syspayno").append("=").append(syspayno);
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
