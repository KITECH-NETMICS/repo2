package kr.re.kitech.biz.saf.che.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "연구실정보")
public class SafCheSpaceInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SafCheSpaceInfoVo(){
    }

    @ElDtoField(logicalName = "centrCd", physicalName = "centr_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String centr_cd;

    @ElDtoField(logicalName = "deptCd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "labNm", physicalName = "lab_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lab_nm;

    @ElDtoField(logicalName = "mainSecrtRspnsSyspayno", physicalName = "main_secrt_rspns_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_secrt_rspns_syspayno;

    @ElDtoField(logicalName = "labGrd", physicalName = "lab_grd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lab_grd;

    @ElDtoField(logicalName = "labState", physicalName = "lab_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lab_state;

    @ElDtoField(logicalName = "managerYn", physicalName = "manager_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String manager_yn;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "labNo", physicalName = "lab_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lab_no;

    @ElDtoField(logicalName = "spaceCd", physicalName = "space_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String space_cd;

    @ElDtoField(logicalName = "regionCd", physicalName = "region_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String region_cd;

    @ElDtoField(logicalName = "regionNm", physicalName = "region_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String region_nm;

    @ElDtoField(logicalName = "centrNm", physicalName = "centr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String centr_nm;

    @ElDtoField(logicalName = "divsnCd", physicalName = "divsn_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String divsn_cd;

    @ElDtoField(logicalName = "deptNewYmd", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "deptNm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "hsectNm", physicalName = "hsect_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String hsect_nm;

    @ElDtoField(logicalName = "buildNm", physicalName = "build_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String build_nm;

    @ElDtoField(logicalName = "buildSmalClsfNm", physicalName = "build_smal_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String build_smal_clsf_nm;

    @ElDtoField(logicalName = "engLabNm", physicalName = "eng_lab_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eng_lab_nm;

    @ElDtoField(logicalName = "roomno", physicalName = "roomno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String roomno;

    @ElDtoField(logicalName = "area", physicalName = "area", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String area;

    @ElDtoField(logicalName = "mainSecrtRspnsNm", physicalName = "main_secrt_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_secrt_rspns_nm;

    @ElDtoField(logicalName = "mainSecrtRspnsYmd", physicalName = "main_secrt_rspns_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_secrt_rspns_ymd;

    @ElDtoField(logicalName = "subSecrtRspnsSyspayno", physicalName = "sub_secrt_rspns_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sub_secrt_rspns_syspayno;

    @ElDtoField(logicalName = "subSecrtRspnsNm", physicalName = "sub_secrt_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sub_secrt_rspns_nm;

    @ElDtoField(logicalName = "subSecrtRspnsYmd", physicalName = "sub_secrt_rspns_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sub_secrt_rspns_ymd;

    @ElDtoField(logicalName = "spaceUsgClsf", physicalName = "space_usg_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String space_usg_clsf;

    @ElDtoField(logicalName = "spaceUsgClsfNm", physicalName = "space_usg_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String space_usg_clsf_nm;

    @ElDtoField(logicalName = "alocYmd", physicalName = "aloc_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aloc_ymd;

    @ElDtoField(logicalName = "retrnYmd", physicalName = "retrn_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retrn_ymd;

    @ElDtoField(logicalName = "riskEquip", physicalName = "risk_equip", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String risk_equip;

    @ElDtoField(logicalName = "labGrdNm", physicalName = "lab_grd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lab_grd_nm;

    @ElDtoField(logicalName = "pecuMedexmYn", physicalName = "pecu_medexm_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pecu_medexm_yn;

    @ElDtoField(logicalName = "pecuMedexmYnNm", physicalName = "pecu_medexm_yn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pecu_medexm_yn_nm;

    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "regstPsnSyspayno", physicalName = "regst_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_psn_syspayno;

    @ElDtoField(logicalName = "regstDaytm", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "updtPsnSyspayno", physicalName = "updt_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_psn_syspayno;

    @ElDtoField(logicalName = "updtDaytm", physicalName = "updt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_daytm;

    @ElDtoField(logicalName = "userSyspaynoArr", physicalName = "user_syspayno_arr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_syspayno_arr;

    @ElDtoField(logicalName = "userCount", physicalName = "user_count", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_count;

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

    @ElVoField(physicalName = "lab_nm")
    public String getLab_nm(){
        return lab_nm;
    }

    @ElVoField(physicalName = "lab_nm")
    public void setLab_nm(String lab_nm){
        this.lab_nm = lab_nm;
    }

    @ElVoField(physicalName = "main_secrt_rspns_syspayno")
    public String getMain_secrt_rspns_syspayno(){
        return main_secrt_rspns_syspayno;
    }

    @ElVoField(physicalName = "main_secrt_rspns_syspayno")
    public void setMain_secrt_rspns_syspayno(String main_secrt_rspns_syspayno){
        this.main_secrt_rspns_syspayno = main_secrt_rspns_syspayno;
    }

    @ElVoField(physicalName = "lab_grd")
    public String getLab_grd(){
        return lab_grd;
    }

    @ElVoField(physicalName = "lab_grd")
    public void setLab_grd(String lab_grd){
        this.lab_grd = lab_grd;
    }

    @ElVoField(physicalName = "lab_state")
    public String getLab_state(){
        return lab_state;
    }

    @ElVoField(physicalName = "lab_state")
    public void setLab_state(String lab_state){
        this.lab_state = lab_state;
    }

    @ElVoField(physicalName = "manager_yn")
    public String getManager_yn(){
        return manager_yn;
    }

    @ElVoField(physicalName = "manager_yn")
    public void setManager_yn(String manager_yn){
        this.manager_yn = manager_yn;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
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

    @ElVoField(physicalName = "region_cd")
    public String getRegion_cd(){
        return region_cd;
    }

    @ElVoField(physicalName = "region_cd")
    public void setRegion_cd(String region_cd){
        this.region_cd = region_cd;
    }

    @ElVoField(physicalName = "region_nm")
    public String getRegion_nm(){
        return region_nm;
    }

    @ElVoField(physicalName = "region_nm")
    public void setRegion_nm(String region_nm){
        this.region_nm = region_nm;
    }

    @ElVoField(physicalName = "centr_nm")
    public String getCentr_nm(){
        return centr_nm;
    }

    @ElVoField(physicalName = "centr_nm")
    public void setCentr_nm(String centr_nm){
        this.centr_nm = centr_nm;
    }

    @ElVoField(physicalName = "divsn_cd")
    public String getDivsn_cd(){
        return divsn_cd;
    }

    @ElVoField(physicalName = "divsn_cd")
    public void setDivsn_cd(String divsn_cd){
        this.divsn_cd = divsn_cd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public String getDept_new_ymd(){
        return dept_new_ymd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public void setDept_new_ymd(String dept_new_ymd){
        this.dept_new_ymd = dept_new_ymd;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "hsect_nm")
    public String getHsect_nm(){
        return hsect_nm;
    }

    @ElVoField(physicalName = "hsect_nm")
    public void setHsect_nm(String hsect_nm){
        this.hsect_nm = hsect_nm;
    }

    @ElVoField(physicalName = "build_nm")
    public String getBuild_nm(){
        return build_nm;
    }

    @ElVoField(physicalName = "build_nm")
    public void setBuild_nm(String build_nm){
        this.build_nm = build_nm;
    }

    @ElVoField(physicalName = "build_smal_clsf_nm")
    public String getBuild_smal_clsf_nm(){
        return build_smal_clsf_nm;
    }

    @ElVoField(physicalName = "build_smal_clsf_nm")
    public void setBuild_smal_clsf_nm(String build_smal_clsf_nm){
        this.build_smal_clsf_nm = build_smal_clsf_nm;
    }

    @ElVoField(physicalName = "eng_lab_nm")
    public String getEng_lab_nm(){
        return eng_lab_nm;
    }

    @ElVoField(physicalName = "eng_lab_nm")
    public void setEng_lab_nm(String eng_lab_nm){
        this.eng_lab_nm = eng_lab_nm;
    }

    @ElVoField(physicalName = "roomno")
    public String getRoomno(){
        return roomno;
    }

    @ElVoField(physicalName = "roomno")
    public void setRoomno(String roomno){
        this.roomno = roomno;
    }

    @ElVoField(physicalName = "area")
    public String getArea(){
        return area;
    }

    @ElVoField(physicalName = "area")
    public void setArea(String area){
        this.area = area;
    }

    @ElVoField(physicalName = "main_secrt_rspns_nm")
    public String getMain_secrt_rspns_nm(){
        return main_secrt_rspns_nm;
    }

    @ElVoField(physicalName = "main_secrt_rspns_nm")
    public void setMain_secrt_rspns_nm(String main_secrt_rspns_nm){
        this.main_secrt_rspns_nm = main_secrt_rspns_nm;
    }

    @ElVoField(physicalName = "main_secrt_rspns_ymd")
    public String getMain_secrt_rspns_ymd(){
        return main_secrt_rspns_ymd;
    }

    @ElVoField(physicalName = "main_secrt_rspns_ymd")
    public void setMain_secrt_rspns_ymd(String main_secrt_rspns_ymd){
        this.main_secrt_rspns_ymd = main_secrt_rspns_ymd;
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

    @ElVoField(physicalName = "sub_secrt_rspns_ymd")
    public String getSub_secrt_rspns_ymd(){
        return sub_secrt_rspns_ymd;
    }

    @ElVoField(physicalName = "sub_secrt_rspns_ymd")
    public void setSub_secrt_rspns_ymd(String sub_secrt_rspns_ymd){
        this.sub_secrt_rspns_ymd = sub_secrt_rspns_ymd;
    }

    @ElVoField(physicalName = "space_usg_clsf")
    public String getSpace_usg_clsf(){
        return space_usg_clsf;
    }

    @ElVoField(physicalName = "space_usg_clsf")
    public void setSpace_usg_clsf(String space_usg_clsf){
        this.space_usg_clsf = space_usg_clsf;
    }

    @ElVoField(physicalName = "space_usg_clsf_nm")
    public String getSpace_usg_clsf_nm(){
        return space_usg_clsf_nm;
    }

    @ElVoField(physicalName = "space_usg_clsf_nm")
    public void setSpace_usg_clsf_nm(String space_usg_clsf_nm){
        this.space_usg_clsf_nm = space_usg_clsf_nm;
    }

    @ElVoField(physicalName = "aloc_ymd")
    public String getAloc_ymd(){
        return aloc_ymd;
    }

    @ElVoField(physicalName = "aloc_ymd")
    public void setAloc_ymd(String aloc_ymd){
        this.aloc_ymd = aloc_ymd;
    }

    @ElVoField(physicalName = "retrn_ymd")
    public String getRetrn_ymd(){
        return retrn_ymd;
    }

    @ElVoField(physicalName = "retrn_ymd")
    public void setRetrn_ymd(String retrn_ymd){
        this.retrn_ymd = retrn_ymd;
    }

    @ElVoField(physicalName = "risk_equip")
    public String getRisk_equip(){
        return risk_equip;
    }

    @ElVoField(physicalName = "risk_equip")
    public void setRisk_equip(String risk_equip){
        this.risk_equip = risk_equip;
    }

    @ElVoField(physicalName = "lab_grd_nm")
    public String getLab_grd_nm(){
        return lab_grd_nm;
    }

    @ElVoField(physicalName = "lab_grd_nm")
    public void setLab_grd_nm(String lab_grd_nm){
        this.lab_grd_nm = lab_grd_nm;
    }

    @ElVoField(physicalName = "pecu_medexm_yn")
    public String getPecu_medexm_yn(){
        return pecu_medexm_yn;
    }

    @ElVoField(physicalName = "pecu_medexm_yn")
    public void setPecu_medexm_yn(String pecu_medexm_yn){
        this.pecu_medexm_yn = pecu_medexm_yn;
    }

    @ElVoField(physicalName = "pecu_medexm_yn_nm")
    public String getPecu_medexm_yn_nm(){
        return pecu_medexm_yn_nm;
    }

    @ElVoField(physicalName = "pecu_medexm_yn_nm")
    public void setPecu_medexm_yn_nm(String pecu_medexm_yn_nm){
        this.pecu_medexm_yn_nm = pecu_medexm_yn_nm;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public String getRegst_psn_syspayno(){
        return regst_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public void setRegst_psn_syspayno(String regst_psn_syspayno){
        this.regst_psn_syspayno = regst_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        return regst_daytm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public String getUpdt_psn_syspayno(){
        return updt_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public void setUpdt_psn_syspayno(String updt_psn_syspayno){
        this.updt_psn_syspayno = updt_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_daytm")
    public String getUpdt_daytm(){
        return updt_daytm;
    }

    @ElVoField(physicalName = "updt_daytm")
    public void setUpdt_daytm(String updt_daytm){
        this.updt_daytm = updt_daytm;
    }

    @ElVoField(physicalName = "user_syspayno_arr")
    public String getUser_syspayno_arr(){
        return user_syspayno_arr;
    }

    @ElVoField(physicalName = "user_syspayno_arr")
    public void setUser_syspayno_arr(String user_syspayno_arr){
        this.user_syspayno_arr = user_syspayno_arr;
    }

    @ElVoField(physicalName = "user_count")
    public String getUser_count(){
        return user_count;
    }

    @ElVoField(physicalName = "user_count")
    public void setUser_count(String user_count){
        this.user_count = user_count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SafCheSpaceInfoVo [");
        sb.append("centr_cd").append("=").append(centr_cd).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("lab_nm").append("=").append(lab_nm).append(",");
        sb.append("main_secrt_rspns_syspayno").append("=").append(main_secrt_rspns_syspayno).append(",");
        sb.append("lab_grd").append("=").append(lab_grd).append(",");
        sb.append("lab_state").append("=").append(lab_state).append(",");
        sb.append("manager_yn").append("=").append(manager_yn).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("lab_no").append("=").append(lab_no).append(",");
        sb.append("space_cd").append("=").append(space_cd).append(",");
        sb.append("region_cd").append("=").append(region_cd).append(",");
        sb.append("region_nm").append("=").append(region_nm).append(",");
        sb.append("centr_nm").append("=").append(centr_nm).append(",");
        sb.append("divsn_cd").append("=").append(divsn_cd).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("hsect_nm").append("=").append(hsect_nm).append(",");
        sb.append("build_nm").append("=").append(build_nm).append(",");
        sb.append("build_smal_clsf_nm").append("=").append(build_smal_clsf_nm).append(",");
        sb.append("eng_lab_nm").append("=").append(eng_lab_nm).append(",");
        sb.append("roomno").append("=").append(roomno).append(",");
        sb.append("area").append("=").append(area).append(",");
        sb.append("main_secrt_rspns_nm").append("=").append(main_secrt_rspns_nm).append(",");
        sb.append("main_secrt_rspns_ymd").append("=").append(main_secrt_rspns_ymd).append(",");
        sb.append("sub_secrt_rspns_syspayno").append("=").append(sub_secrt_rspns_syspayno).append(",");
        sb.append("sub_secrt_rspns_nm").append("=").append(sub_secrt_rspns_nm).append(",");
        sb.append("sub_secrt_rspns_ymd").append("=").append(sub_secrt_rspns_ymd).append(",");
        sb.append("space_usg_clsf").append("=").append(space_usg_clsf).append(",");
        sb.append("space_usg_clsf_nm").append("=").append(space_usg_clsf_nm).append(",");
        sb.append("aloc_ymd").append("=").append(aloc_ymd).append(",");
        sb.append("retrn_ymd").append("=").append(retrn_ymd).append(",");
        sb.append("risk_equip").append("=").append(risk_equip).append(",");
        sb.append("lab_grd_nm").append("=").append(lab_grd_nm).append(",");
        sb.append("pecu_medexm_yn").append("=").append(pecu_medexm_yn).append(",");
        sb.append("pecu_medexm_yn_nm").append("=").append(pecu_medexm_yn_nm).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("regst_psn_syspayno").append("=").append(regst_psn_syspayno).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("updt_psn_syspayno").append("=").append(updt_psn_syspayno).append(",");
        sb.append("updt_daytm").append("=").append(updt_daytm).append(",");
        sb.append("user_syspayno_arr").append("=").append(user_syspayno_arr).append(",");
        sb.append("user_count").append("=").append(user_count);
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
