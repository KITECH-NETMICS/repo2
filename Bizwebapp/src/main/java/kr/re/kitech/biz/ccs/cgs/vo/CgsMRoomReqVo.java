package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "회의실신청")
public class CgsMRoomReqVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CgsMRoomReqVo(){
    }

    @ElDtoField(logicalName = "회의실신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_no;

    @ElDtoField(logicalName = "장비명", physicalName = "equip_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String equip_nm;

    @ElDtoField(logicalName = "회의일자", physicalName = "meet_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String meet_ymd;

    @ElDtoField(logicalName = "사용시작시간", physicalName = "use_orign_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String use_orign_time;

    @ElDtoField(logicalName = "사용종료시간", physicalName = "use_cls_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String use_cls_time;

    @ElDtoField(logicalName = "회의실코드", physicalName = "mroom_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String mroom_cd;

    @ElDtoField(logicalName = "참석인원수", physicalName = "attnce_hedcnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String attnce_hedcnt_no;

    @ElDtoField(logicalName = "참석자", physicalName = "attnce_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String attnce_psn;

    @ElDtoField(logicalName = "회의제목", physicalName = "meet_subj", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String meet_subj;

    @ElDtoField(logicalName = "신청자시스템개인번호", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "신청자이메일", physicalName = "req_psn_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_psn_email;

    @ElDtoField(logicalName = "신청자전화번호", physicalName = "req_psn_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_psn_tel;

    @ElDtoField(logicalName = "담당자시스템개인번호", physicalName = "charg_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String charg_syspayno;

    @ElDtoField(logicalName = "신청상태", physicalName = "req_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_state;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String rmk;

    @ElDtoField(logicalName = "장비1사용여부", physicalName = "equip_1_use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String equip_1_use_yn;

    @ElDtoField(logicalName = "장비2사용여부", physicalName = "equip_2_use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String equip_2_use_yn;

    @ElDtoField(logicalName = "장비3사용여부", physicalName = "equip_3_use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String equip_3_use_yn;

    @ElDtoField(logicalName = "장비4사용여부", physicalName = "equip_4_use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String equip_4_use_yn;

    @ElDtoField(logicalName = "장비5사용여부", physicalName = "equip_5_use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String equip_5_use_yn;

    @ElDtoField(logicalName = "장비6사용여부", physicalName = "equip_6_use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String equip_6_use_yn;

    @ElDtoField(logicalName = "장비7사용여부", physicalName = "equip_7_use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String equip_7_use_yn;

    @ElDtoField(logicalName = "장비8사용여부", physicalName = "equip_8_use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String equip_8_use_yn;

    @ElDtoField(logicalName = "장비9사용여부", physicalName = "equip_9_use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String equip_9_use_yn;

    @ElDtoField(logicalName = "장비10사용여부", physicalName = "equip_10_use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String equip_10_use_yn;

    @ElDtoField(logicalName = "등록자시스템개인번호", physicalName = "regst_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String regst_psn_syspayno;

    @ElDtoField(logicalName = "등록일시", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "수정자시스템개인번호", physicalName = "updt_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String updt_psn_syspayno;

    @ElDtoField(logicalName = "수정일시", physicalName = "updt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String updt_daytm;

    @ElDtoField(logicalName = "파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "지역명", physicalName = "region_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String region_nm;

    @ElDtoField(logicalName = "요일", physicalName = "meet_ymd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String meet_ymd_nm;

    @ElDtoField(logicalName = "사용시간", physicalName = "use_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String use_time;

    @ElDtoField(logicalName = "회의실명", physicalName = "meet_ofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String meet_ofic_nm;

    @ElDtoField(logicalName = "신청자명", physicalName = "req_psn_empno_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_psn_empno_nm;

    @ElDtoField(logicalName = "신청자부서명", physicalName = "req_psn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_psn_dept_nm;

    @ElDtoField(logicalName = "담당자명", physicalName = "charg_syspayno_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String charg_syspayno_nm;

    @ElDtoField(logicalName = "등록상태명", physicalName = "req_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_state_nm;

    @ElDtoField(logicalName = "상태코드", physicalName = "apr_state_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String apr_state_code;

    @ElDtoField(logicalName = "상태코드", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String apr_state;

    @ElDtoField(logicalName = "지역코드", physicalName = "region_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String region_cd;

    @ElDtoField(logicalName = "사용여부", physicalName = "use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String use_yn;

    @ElDtoField(logicalName = "신청자", physicalName = "req_psn_syspayno_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_psn_syspayno_nm;

    @ElDtoField(logicalName = "지역명", physicalName = "region_name", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String region_name;

    @ElDtoField(logicalName = "방번호", physicalName = "roomno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String roomno;

    @ElDtoField(logicalName = "회의실인원", physicalName = "seat_no", type = "BigInteger", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.math.BigInteger seat_no;

    @ElDtoField(logicalName = "회의실비고", physicalName = "seat_no_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String seat_no_rmk;

    @ElDtoField(logicalName = "장비1사용여부", physicalName = "equip_1_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String equip_1_yn;

    @ElDtoField(logicalName = "장비2사용여부", physicalName = "equip_2_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String equip_2_yn;

    @ElDtoField(logicalName = "장비3사용여부", physicalName = "equip_3_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String equip_3_yn;

    @ElDtoField(logicalName = "장비4사용여부", physicalName = "equip_4_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String equip_4_yn;

    @ElDtoField(logicalName = "장비5사용여부", physicalName = "equip_5_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String equip_5_yn;

    @ElDtoField(logicalName = "메인참석자사번", physicalName = "main_respn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String main_respn_empno;

    @ElDtoField(logicalName = "메인참석자시스템번호", physicalName = "main_respn_syspayno", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private double main_respn_syspayno;

    @ElDtoField(logicalName = "메인참석자이름", physicalName = "main_respn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String main_respn_nm;

    @ElDtoField(logicalName = "서브참석자사번", physicalName = "sub_respn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String sub_respn_empno;

    @ElDtoField(logicalName = "서브참석자시스템번호", physicalName = "sub_respn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String sub_respn_syspayno;

    @ElDtoField(logicalName = "서브참석자이름", physicalName = "sub_respn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String sub_respn_nm;

    @ElDtoField(logicalName = "사진경로1", physicalName = "photo_path_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String photo_path_1;

    @ElDtoField(logicalName = "사진경로2", physicalName = "photo_path_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String photo_path_2;

    @ElDtoField(logicalName = "제목", physicalName = "title", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String title;

    @ElDtoField(logicalName = "전자결제제목", physicalName = "info_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String info_cd;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "attachVo1", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> attachVo1;

    @ElDtoField(logicalName = "결재의견", physicalName = "comments", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String comments;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        String ret = this.req_no;
        return ret;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "equip_nm")
    public String getEquip_nm(){
        String ret = this.equip_nm;
        return ret;
    }

    @ElVoField(physicalName = "equip_nm")
    public void setEquip_nm(String equip_nm){
        this.equip_nm = equip_nm;
    }

    @ElVoField(physicalName = "meet_ymd")
    public String getMeet_ymd(){
        String ret = this.meet_ymd;
        return ret;
    }

    @ElVoField(physicalName = "meet_ymd")
    public void setMeet_ymd(String meet_ymd){
        this.meet_ymd = meet_ymd;
    }

    @ElVoField(physicalName = "use_orign_time")
    public String getUse_orign_time(){
        String ret = this.use_orign_time;
        return ret;
    }

    @ElVoField(physicalName = "use_orign_time")
    public void setUse_orign_time(String use_orign_time){
        this.use_orign_time = use_orign_time;
    }

    @ElVoField(physicalName = "use_cls_time")
    public String getUse_cls_time(){
        String ret = this.use_cls_time;
        return ret;
    }

    @ElVoField(physicalName = "use_cls_time")
    public void setUse_cls_time(String use_cls_time){
        this.use_cls_time = use_cls_time;
    }

    @ElVoField(physicalName = "mroom_cd")
    public String getMroom_cd(){
        String ret = this.mroom_cd;
        return ret;
    }

    @ElVoField(physicalName = "mroom_cd")
    public void setMroom_cd(String mroom_cd){
        this.mroom_cd = mroom_cd;
    }

    @ElVoField(physicalName = "attnce_hedcnt_no")
    public String getAttnce_hedcnt_no(){
        String ret = this.attnce_hedcnt_no;
        return ret;
    }

    @ElVoField(physicalName = "attnce_hedcnt_no")
    public void setAttnce_hedcnt_no(String attnce_hedcnt_no){
        this.attnce_hedcnt_no = attnce_hedcnt_no;
    }

    @ElVoField(physicalName = "attnce_psn")
    public String getAttnce_psn(){
        String ret = this.attnce_psn;
        return ret;
    }

    @ElVoField(physicalName = "attnce_psn")
    public void setAttnce_psn(String attnce_psn){
        this.attnce_psn = attnce_psn;
    }

    @ElVoField(physicalName = "meet_subj")
    public String getMeet_subj(){
        String ret = this.meet_subj;
        return ret;
    }

    @ElVoField(physicalName = "meet_subj")
    public void setMeet_subj(String meet_subj){
        this.meet_subj = meet_subj;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public String getReq_psn_syspayno(){
        String ret = this.req_psn_syspayno;
        return ret;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public void setReq_psn_syspayno(String req_psn_syspayno){
        this.req_psn_syspayno = req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_email")
    public String getReq_psn_email(){
        String ret = this.req_psn_email;
        return ret;
    }

    @ElVoField(physicalName = "req_psn_email")
    public void setReq_psn_email(String req_psn_email){
        this.req_psn_email = req_psn_email;
    }

    @ElVoField(physicalName = "req_psn_tel")
    public String getReq_psn_tel(){
        String ret = this.req_psn_tel;
        return ret;
    }

    @ElVoField(physicalName = "req_psn_tel")
    public void setReq_psn_tel(String req_psn_tel){
        this.req_psn_tel = req_psn_tel;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public String getCharg_syspayno(){
        String ret = this.charg_syspayno;
        return ret;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public void setCharg_syspayno(String charg_syspayno){
        this.charg_syspayno = charg_syspayno;
    }

    @ElVoField(physicalName = "req_state")
    public String getReq_state(){
        String ret = this.req_state;
        return ret;
    }

    @ElVoField(physicalName = "req_state")
    public void setReq_state(String req_state){
        this.req_state = req_state;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        String ret = this.rmk;
        return ret;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "equip_1_use_yn")
    public String getEquip_1_use_yn(){
        String ret = this.equip_1_use_yn;
        return ret;
    }

    @ElVoField(physicalName = "equip_1_use_yn")
    public void setEquip_1_use_yn(String equip_1_use_yn){
        this.equip_1_use_yn = equip_1_use_yn;
    }

    @ElVoField(physicalName = "equip_2_use_yn")
    public String getEquip_2_use_yn(){
        String ret = this.equip_2_use_yn;
        return ret;
    }

    @ElVoField(physicalName = "equip_2_use_yn")
    public void setEquip_2_use_yn(String equip_2_use_yn){
        this.equip_2_use_yn = equip_2_use_yn;
    }

    @ElVoField(physicalName = "equip_3_use_yn")
    public String getEquip_3_use_yn(){
        String ret = this.equip_3_use_yn;
        return ret;
    }

    @ElVoField(physicalName = "equip_3_use_yn")
    public void setEquip_3_use_yn(String equip_3_use_yn){
        this.equip_3_use_yn = equip_3_use_yn;
    }

    @ElVoField(physicalName = "equip_4_use_yn")
    public String getEquip_4_use_yn(){
        String ret = this.equip_4_use_yn;
        return ret;
    }

    @ElVoField(physicalName = "equip_4_use_yn")
    public void setEquip_4_use_yn(String equip_4_use_yn){
        this.equip_4_use_yn = equip_4_use_yn;
    }

    @ElVoField(physicalName = "equip_5_use_yn")
    public String getEquip_5_use_yn(){
        String ret = this.equip_5_use_yn;
        return ret;
    }

    @ElVoField(physicalName = "equip_5_use_yn")
    public void setEquip_5_use_yn(String equip_5_use_yn){
        this.equip_5_use_yn = equip_5_use_yn;
    }

    @ElVoField(physicalName = "equip_6_use_yn")
    public String getEquip_6_use_yn(){
        String ret = this.equip_6_use_yn;
        return ret;
    }

    @ElVoField(physicalName = "equip_6_use_yn")
    public void setEquip_6_use_yn(String equip_6_use_yn){
        this.equip_6_use_yn = equip_6_use_yn;
    }

    @ElVoField(physicalName = "equip_7_use_yn")
    public String getEquip_7_use_yn(){
        String ret = this.equip_7_use_yn;
        return ret;
    }

    @ElVoField(physicalName = "equip_7_use_yn")
    public void setEquip_7_use_yn(String equip_7_use_yn){
        this.equip_7_use_yn = equip_7_use_yn;
    }

    @ElVoField(physicalName = "equip_8_use_yn")
    public String getEquip_8_use_yn(){
        String ret = this.equip_8_use_yn;
        return ret;
    }

    @ElVoField(physicalName = "equip_8_use_yn")
    public void setEquip_8_use_yn(String equip_8_use_yn){
        this.equip_8_use_yn = equip_8_use_yn;
    }

    @ElVoField(physicalName = "equip_9_use_yn")
    public String getEquip_9_use_yn(){
        String ret = this.equip_9_use_yn;
        return ret;
    }

    @ElVoField(physicalName = "equip_9_use_yn")
    public void setEquip_9_use_yn(String equip_9_use_yn){
        this.equip_9_use_yn = equip_9_use_yn;
    }

    @ElVoField(physicalName = "equip_10_use_yn")
    public String getEquip_10_use_yn(){
        String ret = this.equip_10_use_yn;
        return ret;
    }

    @ElVoField(physicalName = "equip_10_use_yn")
    public void setEquip_10_use_yn(String equip_10_use_yn){
        this.equip_10_use_yn = equip_10_use_yn;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public String getRegst_psn_syspayno(){
        String ret = this.regst_psn_syspayno;
        return ret;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public void setRegst_psn_syspayno(String regst_psn_syspayno){
        this.regst_psn_syspayno = regst_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        String ret = this.regst_daytm;
        return ret;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public String getUpdt_psn_syspayno(){
        String ret = this.updt_psn_syspayno;
        return ret;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public void setUpdt_psn_syspayno(String updt_psn_syspayno){
        this.updt_psn_syspayno = updt_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_daytm")
    public String getUpdt_daytm(){
        String ret = this.updt_daytm;
        return ret;
    }

    @ElVoField(physicalName = "updt_daytm")
    public void setUpdt_daytm(String updt_daytm){
        this.updt_daytm = updt_daytm;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        String ret = this.attach_file_no;
        return ret;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "region_nm")
    public String getRegion_nm(){
        String ret = this.region_nm;
        return ret;
    }

    @ElVoField(physicalName = "region_nm")
    public void setRegion_nm(String region_nm){
        this.region_nm = region_nm;
    }

    @ElVoField(physicalName = "meet_ymd_nm")
    public String getMeet_ymd_nm(){
        String ret = this.meet_ymd_nm;
        return ret;
    }

    @ElVoField(physicalName = "meet_ymd_nm")
    public void setMeet_ymd_nm(String meet_ymd_nm){
        this.meet_ymd_nm = meet_ymd_nm;
    }

    @ElVoField(physicalName = "use_time")
    public String getUse_time(){
        String ret = this.use_time;
        return ret;
    }

    @ElVoField(physicalName = "use_time")
    public void setUse_time(String use_time){
        this.use_time = use_time;
    }

    @ElVoField(physicalName = "meet_ofic_nm")
    public String getMeet_ofic_nm(){
        String ret = this.meet_ofic_nm;
        return ret;
    }

    @ElVoField(physicalName = "meet_ofic_nm")
    public void setMeet_ofic_nm(String meet_ofic_nm){
        this.meet_ofic_nm = meet_ofic_nm;
    }

    @ElVoField(physicalName = "req_psn_empno_nm")
    public String getReq_psn_empno_nm(){
        String ret = this.req_psn_empno_nm;
        return ret;
    }

    @ElVoField(physicalName = "req_psn_empno_nm")
    public void setReq_psn_empno_nm(String req_psn_empno_nm){
        this.req_psn_empno_nm = req_psn_empno_nm;
    }

    @ElVoField(physicalName = "req_psn_dept_nm")
    public String getReq_psn_dept_nm(){
        String ret = this.req_psn_dept_nm;
        return ret;
    }

    @ElVoField(physicalName = "req_psn_dept_nm")
    public void setReq_psn_dept_nm(String req_psn_dept_nm){
        this.req_psn_dept_nm = req_psn_dept_nm;
    }

    @ElVoField(physicalName = "charg_syspayno_nm")
    public String getCharg_syspayno_nm(){
        String ret = this.charg_syspayno_nm;
        return ret;
    }

    @ElVoField(physicalName = "charg_syspayno_nm")
    public void setCharg_syspayno_nm(String charg_syspayno_nm){
        this.charg_syspayno_nm = charg_syspayno_nm;
    }

    @ElVoField(physicalName = "req_state_nm")
    public String getReq_state_nm(){
        String ret = this.req_state_nm;
        return ret;
    }

    @ElVoField(physicalName = "req_state_nm")
    public void setReq_state_nm(String req_state_nm){
        this.req_state_nm = req_state_nm;
    }

    @ElVoField(physicalName = "apr_state_code")
    public String getApr_state_code(){
        String ret = this.apr_state_code;
        return ret;
    }

    @ElVoField(physicalName = "apr_state_code")
    public void setApr_state_code(String apr_state_code){
        this.apr_state_code = apr_state_code;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        String ret = this.apr_state;
        return ret;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "region_cd")
    public String getRegion_cd(){
        String ret = this.region_cd;
        return ret;
    }

    @ElVoField(physicalName = "region_cd")
    public void setRegion_cd(String region_cd){
        this.region_cd = region_cd;
    }

    @ElVoField(physicalName = "use_yn")
    public String getUse_yn(){
        String ret = this.use_yn;
        return ret;
    }

    @ElVoField(physicalName = "use_yn")
    public void setUse_yn(String use_yn){
        this.use_yn = use_yn;
    }

    @ElVoField(physicalName = "req_psn_syspayno_nm")
    public String getReq_psn_syspayno_nm(){
        String ret = this.req_psn_syspayno_nm;
        return ret;
    }

    @ElVoField(physicalName = "req_psn_syspayno_nm")
    public void setReq_psn_syspayno_nm(String req_psn_syspayno_nm){
        this.req_psn_syspayno_nm = req_psn_syspayno_nm;
    }

    @ElVoField(physicalName = "region_name")
    public String getRegion_name(){
        String ret = this.region_name;
        return ret;
    }

    @ElVoField(physicalName = "region_name")
    public void setRegion_name(String region_name){
        this.region_name = region_name;
    }

    @ElVoField(physicalName = "roomno")
    public String getRoomno(){
        String ret = this.roomno;
        return ret;
    }

    @ElVoField(physicalName = "roomno")
    public void setRoomno(String roomno){
        this.roomno = roomno;
    }

    @ElVoField(physicalName = "seat_no")
    public java.math.BigInteger getSeat_no(){
        return seat_no;
    }

    @ElVoField(physicalName = "seat_no")
    public void setSeat_no(java.math.BigInteger seat_no){
        this.seat_no = seat_no;
    }

    @ElVoField(physicalName = "seat_no_rmk")
    public String getSeat_no_rmk(){
        String ret = this.seat_no_rmk;
        return ret;
    }

    @ElVoField(physicalName = "seat_no_rmk")
    public void setSeat_no_rmk(String seat_no_rmk){
        this.seat_no_rmk = seat_no_rmk;
    }

    @ElVoField(physicalName = "equip_1_yn")
    public String getEquip_1_yn(){
        String ret = this.equip_1_yn;
        return ret;
    }

    @ElVoField(physicalName = "equip_1_yn")
    public void setEquip_1_yn(String equip_1_yn){
        this.equip_1_yn = equip_1_yn;
    }

    @ElVoField(physicalName = "equip_2_yn")
    public String getEquip_2_yn(){
        String ret = this.equip_2_yn;
        return ret;
    }

    @ElVoField(physicalName = "equip_2_yn")
    public void setEquip_2_yn(String equip_2_yn){
        this.equip_2_yn = equip_2_yn;
    }

    @ElVoField(physicalName = "equip_3_yn")
    public String getEquip_3_yn(){
        String ret = this.equip_3_yn;
        return ret;
    }

    @ElVoField(physicalName = "equip_3_yn")
    public void setEquip_3_yn(String equip_3_yn){
        this.equip_3_yn = equip_3_yn;
    }

    @ElVoField(physicalName = "equip_4_yn")
    public String getEquip_4_yn(){
        String ret = this.equip_4_yn;
        return ret;
    }

    @ElVoField(physicalName = "equip_4_yn")
    public void setEquip_4_yn(String equip_4_yn){
        this.equip_4_yn = equip_4_yn;
    }

    @ElVoField(physicalName = "equip_5_yn")
    public String getEquip_5_yn(){
        String ret = this.equip_5_yn;
        return ret;
    }

    @ElVoField(physicalName = "equip_5_yn")
    public void setEquip_5_yn(String equip_5_yn){
        this.equip_5_yn = equip_5_yn;
    }

    @ElVoField(physicalName = "main_respn_empno")
    public String getMain_respn_empno(){
        String ret = this.main_respn_empno;
        return ret;
    }

    @ElVoField(physicalName = "main_respn_empno")
    public void setMain_respn_empno(String main_respn_empno){
        this.main_respn_empno = main_respn_empno;
    }

    @ElVoField(physicalName = "main_respn_syspayno")
    public double getMain_respn_syspayno(){
        return main_respn_syspayno;
    }

    @ElVoField(physicalName = "main_respn_syspayno")
    public void setMain_respn_syspayno(double main_respn_syspayno){
        this.main_respn_syspayno = main_respn_syspayno;
    }

    @ElVoField(physicalName = "main_respn_nm")
    public String getMain_respn_nm(){
        String ret = this.main_respn_nm;
        return ret;
    }

    @ElVoField(physicalName = "main_respn_nm")
    public void setMain_respn_nm(String main_respn_nm){
        this.main_respn_nm = main_respn_nm;
    }

    @ElVoField(physicalName = "sub_respn_empno")
    public String getSub_respn_empno(){
        String ret = this.sub_respn_empno;
        return ret;
    }

    @ElVoField(physicalName = "sub_respn_empno")
    public void setSub_respn_empno(String sub_respn_empno){
        this.sub_respn_empno = sub_respn_empno;
    }

    @ElVoField(physicalName = "sub_respn_syspayno")
    public String getSub_respn_syspayno(){
        String ret = this.sub_respn_syspayno;
        return ret;
    }

    @ElVoField(physicalName = "sub_respn_syspayno")
    public void setSub_respn_syspayno(String sub_respn_syspayno){
        this.sub_respn_syspayno = sub_respn_syspayno;
    }

    @ElVoField(physicalName = "sub_respn_nm")
    public String getSub_respn_nm(){
        String ret = this.sub_respn_nm;
        return ret;
    }

    @ElVoField(physicalName = "sub_respn_nm")
    public void setSub_respn_nm(String sub_respn_nm){
        this.sub_respn_nm = sub_respn_nm;
    }

    @ElVoField(physicalName = "photo_path_1")
    public String getPhoto_path_1(){
        String ret = this.photo_path_1;
        return ret;
    }

    @ElVoField(physicalName = "photo_path_1")
    public void setPhoto_path_1(String photo_path_1){
        this.photo_path_1 = photo_path_1;
    }

    @ElVoField(physicalName = "photo_path_2")
    public String getPhoto_path_2(){
        String ret = this.photo_path_2;
        return ret;
    }

    @ElVoField(physicalName = "photo_path_2")
    public void setPhoto_path_2(String photo_path_2){
        this.photo_path_2 = photo_path_2;
    }

    @ElVoField(physicalName = "title")
    public String getTitle(){
        String ret = this.title;
        return ret;
    }

    @ElVoField(physicalName = "title")
    public void setTitle(String title){
        this.title = title;
    }

    @ElVoField(physicalName = "info_cd")
    public String getInfo_cd(){
        String ret = this.info_cd;
        return ret;
    }

    @ElVoField(physicalName = "info_cd")
    public void setInfo_cd(String info_cd){
        this.info_cd = info_cd;
    }

    @ElVoField(physicalName = "attachVo1")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getAttachVo1(){
        return attachVo1;
    }

    @ElVoField(physicalName = "attachVo1")
    public void setAttachVo1(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> attachVo1){
        this.attachVo1 = attachVo1;
    }

    @ElVoField(physicalName = "comments")
    public String getComments(){
        String ret = this.comments;
        return ret;
    }

    @ElVoField(physicalName = "comments")
    public void setComments(String comments){
        this.comments = comments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CgsMRoomReqVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("equip_nm").append("=").append(equip_nm).append(",");
        sb.append("meet_ymd").append("=").append(meet_ymd).append(",");
        sb.append("use_orign_time").append("=").append(use_orign_time).append(",");
        sb.append("use_cls_time").append("=").append(use_cls_time).append(",");
        sb.append("mroom_cd").append("=").append(mroom_cd).append(",");
        sb.append("attnce_hedcnt_no").append("=").append(attnce_hedcnt_no).append(",");
        sb.append("attnce_psn").append("=").append(attnce_psn).append(",");
        sb.append("meet_subj").append("=").append(meet_subj).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("req_psn_email").append("=").append(req_psn_email).append(",");
        sb.append("req_psn_tel").append("=").append(req_psn_tel).append(",");
        sb.append("charg_syspayno").append("=").append(charg_syspayno).append(",");
        sb.append("req_state").append("=").append(req_state).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("equip_1_use_yn").append("=").append(equip_1_use_yn).append(",");
        sb.append("equip_2_use_yn").append("=").append(equip_2_use_yn).append(",");
        sb.append("equip_3_use_yn").append("=").append(equip_3_use_yn).append(",");
        sb.append("equip_4_use_yn").append("=").append(equip_4_use_yn).append(",");
        sb.append("equip_5_use_yn").append("=").append(equip_5_use_yn).append(",");
        sb.append("equip_6_use_yn").append("=").append(equip_6_use_yn).append(",");
        sb.append("equip_7_use_yn").append("=").append(equip_7_use_yn).append(",");
        sb.append("equip_8_use_yn").append("=").append(equip_8_use_yn).append(",");
        sb.append("equip_9_use_yn").append("=").append(equip_9_use_yn).append(",");
        sb.append("equip_10_use_yn").append("=").append(equip_10_use_yn).append(",");
        sb.append("regst_psn_syspayno").append("=").append(regst_psn_syspayno).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("updt_psn_syspayno").append("=").append(updt_psn_syspayno).append(",");
        sb.append("updt_daytm").append("=").append(updt_daytm).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("region_nm").append("=").append(region_nm).append(",");
        sb.append("meet_ymd_nm").append("=").append(meet_ymd_nm).append(",");
        sb.append("use_time").append("=").append(use_time).append(",");
        sb.append("meet_ofic_nm").append("=").append(meet_ofic_nm).append(",");
        sb.append("req_psn_empno_nm").append("=").append(req_psn_empno_nm).append(",");
        sb.append("req_psn_dept_nm").append("=").append(req_psn_dept_nm).append(",");
        sb.append("charg_syspayno_nm").append("=").append(charg_syspayno_nm).append(",");
        sb.append("req_state_nm").append("=").append(req_state_nm).append(",");
        sb.append("apr_state_code").append("=").append(apr_state_code).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("region_cd").append("=").append(region_cd).append(",");
        sb.append("use_yn").append("=").append(use_yn).append(",");
        sb.append("req_psn_syspayno_nm").append("=").append(req_psn_syspayno_nm).append(",");
        sb.append("region_name").append("=").append(region_name).append(",");
        sb.append("roomno").append("=").append(roomno).append(",");
        sb.append("seat_no").append("=").append(seat_no).append(",");
        sb.append("seat_no_rmk").append("=").append(seat_no_rmk).append(",");
        sb.append("equip_1_yn").append("=").append(equip_1_yn).append(",");
        sb.append("equip_2_yn").append("=").append(equip_2_yn).append(",");
        sb.append("equip_3_yn").append("=").append(equip_3_yn).append(",");
        sb.append("equip_4_yn").append("=").append(equip_4_yn).append(",");
        sb.append("equip_5_yn").append("=").append(equip_5_yn).append(",");
        sb.append("main_respn_empno").append("=").append(main_respn_empno).append(",");
        sb.append("main_respn_syspayno").append("=").append(main_respn_syspayno).append(",");
        sb.append("main_respn_nm").append("=").append(main_respn_nm).append(",");
        sb.append("sub_respn_empno").append("=").append(sub_respn_empno).append(",");
        sb.append("sub_respn_syspayno").append("=").append(sub_respn_syspayno).append(",");
        sb.append("sub_respn_nm").append("=").append(sub_respn_nm).append(",");
        sb.append("photo_path_1").append("=").append(photo_path_1).append(",");
        sb.append("photo_path_2").append("=").append(photo_path_2).append(",");
        sb.append("title").append("=").append(title).append(",");
        sb.append("info_cd").append("=").append(info_cd).append(",");
        sb.append("attachVo1").append("=").append(attachVo1).append(",");
        sb.append("comments").append("=").append(comments);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; attachVo1 != null && i < attachVo1.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)attachVo1.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; attachVo1 != null && i < attachVo1.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)attachVo1.get(i);
            vo._xStreamDec();	 
        }
    }


}
