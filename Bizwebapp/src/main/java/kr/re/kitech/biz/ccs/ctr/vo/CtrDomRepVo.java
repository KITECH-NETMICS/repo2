package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "국내출장복명서 Vo")
public class CtrDomRepVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CtrDomRepVo(){
    }

    @ElDtoField(logicalName = "출장신청번호", physicalName = "biztrip_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_req_no;

    @ElDtoField(logicalName = "복명서일자", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "작성자", physicalName = "wrte_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_psn_syspayno;

    @ElDtoField(logicalName = "출장목적", physicalName = "orign_biztrip_goal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String orign_biztrip_goal;

    @ElDtoField(logicalName = "신청 출장기간", physicalName = "biztrip_prd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_prd;

    @ElDtoField(logicalName = "차량사용 ", physicalName = "car_use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String car_use_yn;

    @ElDtoField(logicalName = "실제시작일자", physicalName = "truth_orign_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String truth_orign_ymd;

    @ElDtoField(logicalName = "실제종료일자", physicalName = "truth_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String truth_cls_ymd;

    @ElDtoField(logicalName = "출장밤", physicalName = "biztrip_nght", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int biztrip_nght;

    @ElDtoField(logicalName = "출장낮", physicalName = "biztrip_day", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int biztrip_day;

    @ElDtoField(logicalName = "변경사유", physicalName = "chng_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chng_resn;

    @ElDtoField(logicalName = "변경내용", physicalName = "chng_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chng_contnt;

    @ElDtoField(logicalName = "경로 출발지", physicalName = "biztrip_start_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_start_region;

    @ElDtoField(logicalName = "경로 도착지", physicalName = "truth_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String truth_region;

    @ElDtoField(logicalName = "신청출장지", physicalName = "truth_biztrip_form", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String truth_biztrip_form;

    @ElDtoField(logicalName = "실제출장목적구분", physicalName = "truth_biztrip_goal_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String truth_biztrip_goal_cd;

    @ElDtoField(logicalName = "실제출장목적", physicalName = "truth_biztrip_goal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String truth_biztrip_goal;

    @ElDtoField(logicalName = "노트북반입여부", physicalName = "notebook_in", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String notebook_in;

    @ElDtoField(logicalName = "USB반입여부", physicalName = "usb_in", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String usb_in;

    @ElDtoField(logicalName = "첨부화일(복명증빙)", physicalName = "evid_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evid_attach_file_no;

    @ElDtoField(logicalName = "운임구분", physicalName = "biztrip_way", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_way;

    @ElDtoField(logicalName = "업무수행내용", physicalName = "bizwrk_atdnc_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bizwrk_atdnc_contnt;

    @ElDtoField(logicalName = "주요성과(정책건의사항)", physicalName = "polcy_suggst_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String polcy_suggst_item;

    @ElVoField(physicalName = "biztrip_req_no")
    public String getBiztrip_req_no(){
        return biztrip_req_no;
    }

    @ElVoField(physicalName = "biztrip_req_no")
    public void setBiztrip_req_no(String biztrip_req_no){
        this.biztrip_req_no = biztrip_req_no;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "wrte_psn_syspayno")
    public String getWrte_psn_syspayno(){
        return wrte_psn_syspayno;
    }

    @ElVoField(physicalName = "wrte_psn_syspayno")
    public void setWrte_psn_syspayno(String wrte_psn_syspayno){
        this.wrte_psn_syspayno = wrte_psn_syspayno;
    }

    @ElVoField(physicalName = "orign_biztrip_goal")
    public String getOrign_biztrip_goal(){
        return orign_biztrip_goal;
    }

    @ElVoField(physicalName = "orign_biztrip_goal")
    public void setOrign_biztrip_goal(String orign_biztrip_goal){
        this.orign_biztrip_goal = orign_biztrip_goal;
    }

    @ElVoField(physicalName = "biztrip_prd")
    public String getBiztrip_prd(){
        return biztrip_prd;
    }

    @ElVoField(physicalName = "biztrip_prd")
    public void setBiztrip_prd(String biztrip_prd){
        this.biztrip_prd = biztrip_prd;
    }

    @ElVoField(physicalName = "car_use_yn")
    public String getCar_use_yn(){
        return car_use_yn;
    }

    @ElVoField(physicalName = "car_use_yn")
    public void setCar_use_yn(String car_use_yn){
        this.car_use_yn = car_use_yn;
    }

    @ElVoField(physicalName = "truth_orign_ymd")
    public String getTruth_orign_ymd(){
        return truth_orign_ymd;
    }

    @ElVoField(physicalName = "truth_orign_ymd")
    public void setTruth_orign_ymd(String truth_orign_ymd){
        this.truth_orign_ymd = truth_orign_ymd;
    }

    @ElVoField(physicalName = "truth_cls_ymd")
    public String getTruth_cls_ymd(){
        return truth_cls_ymd;
    }

    @ElVoField(physicalName = "truth_cls_ymd")
    public void setTruth_cls_ymd(String truth_cls_ymd){
        this.truth_cls_ymd = truth_cls_ymd;
    }

    @ElVoField(physicalName = "biztrip_nght")
    public int getBiztrip_nght(){
        return biztrip_nght;
    }

    @ElVoField(physicalName = "biztrip_nght")
    public void setBiztrip_nght(int biztrip_nght){
        this.biztrip_nght = biztrip_nght;
    }

    @ElVoField(physicalName = "biztrip_day")
    public int getBiztrip_day(){
        return biztrip_day;
    }

    @ElVoField(physicalName = "biztrip_day")
    public void setBiztrip_day(int biztrip_day){
        this.biztrip_day = biztrip_day;
    }

    @ElVoField(physicalName = "chng_resn")
    public String getChng_resn(){
        return chng_resn;
    }

    @ElVoField(physicalName = "chng_resn")
    public void setChng_resn(String chng_resn){
        this.chng_resn = chng_resn;
    }

    @ElVoField(physicalName = "chng_contnt")
    public String getChng_contnt(){
        return chng_contnt;
    }

    @ElVoField(physicalName = "chng_contnt")
    public void setChng_contnt(String chng_contnt){
        this.chng_contnt = chng_contnt;
    }

    @ElVoField(physicalName = "biztrip_start_region")
    public String getBiztrip_start_region(){
        return biztrip_start_region;
    }

    @ElVoField(physicalName = "biztrip_start_region")
    public void setBiztrip_start_region(String biztrip_start_region){
        this.biztrip_start_region = biztrip_start_region;
    }

    @ElVoField(physicalName = "truth_region")
    public String getTruth_region(){
        return truth_region;
    }

    @ElVoField(physicalName = "truth_region")
    public void setTruth_region(String truth_region){
        this.truth_region = truth_region;
    }

    @ElVoField(physicalName = "truth_biztrip_form")
    public String getTruth_biztrip_form(){
        return truth_biztrip_form;
    }

    @ElVoField(physicalName = "truth_biztrip_form")
    public void setTruth_biztrip_form(String truth_biztrip_form){
        this.truth_biztrip_form = truth_biztrip_form;
    }

    @ElVoField(physicalName = "truth_biztrip_goal_cd")
    public String getTruth_biztrip_goal_cd(){
        return truth_biztrip_goal_cd;
    }

    @ElVoField(physicalName = "truth_biztrip_goal_cd")
    public void setTruth_biztrip_goal_cd(String truth_biztrip_goal_cd){
        this.truth_biztrip_goal_cd = truth_biztrip_goal_cd;
    }

    @ElVoField(physicalName = "truth_biztrip_goal")
    public String getTruth_biztrip_goal(){
        return truth_biztrip_goal;
    }

    @ElVoField(physicalName = "truth_biztrip_goal")
    public void setTruth_biztrip_goal(String truth_biztrip_goal){
        this.truth_biztrip_goal = truth_biztrip_goal;
    }

    @ElVoField(physicalName = "notebook_in")
    public String getNotebook_in(){
        return notebook_in;
    }

    @ElVoField(physicalName = "notebook_in")
    public void setNotebook_in(String notebook_in){
        this.notebook_in = notebook_in;
    }

    @ElVoField(physicalName = "usb_in")
    public String getUsb_in(){
        return usb_in;
    }

    @ElVoField(physicalName = "usb_in")
    public void setUsb_in(String usb_in){
        this.usb_in = usb_in;
    }

    @ElVoField(physicalName = "evid_attach_file_no")
    public String getEvid_attach_file_no(){
        return evid_attach_file_no;
    }

    @ElVoField(physicalName = "evid_attach_file_no")
    public void setEvid_attach_file_no(String evid_attach_file_no){
        this.evid_attach_file_no = evid_attach_file_no;
    }

    @ElVoField(physicalName = "biztrip_way")
    public String getBiztrip_way(){
        return biztrip_way;
    }

    @ElVoField(physicalName = "biztrip_way")
    public void setBiztrip_way(String biztrip_way){
        this.biztrip_way = biztrip_way;
    }

    @ElVoField(physicalName = "bizwrk_atdnc_contnt")
    public String getBizwrk_atdnc_contnt(){
        return bizwrk_atdnc_contnt;
    }

    @ElVoField(physicalName = "bizwrk_atdnc_contnt")
    public void setBizwrk_atdnc_contnt(String bizwrk_atdnc_contnt){
        this.bizwrk_atdnc_contnt = bizwrk_atdnc_contnt;
    }

    @ElVoField(physicalName = "polcy_suggst_item")
    public String getPolcy_suggst_item(){
        return polcy_suggst_item;
    }

    @ElVoField(physicalName = "polcy_suggst_item")
    public void setPolcy_suggst_item(String polcy_suggst_item){
        this.polcy_suggst_item = polcy_suggst_item;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrDomRepVo [");
        sb.append("biztrip_req_no").append("=").append(biztrip_req_no).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("wrte_psn_syspayno").append("=").append(wrte_psn_syspayno).append(",");
        sb.append("orign_biztrip_goal").append("=").append(orign_biztrip_goal).append(",");
        sb.append("biztrip_prd").append("=").append(biztrip_prd).append(",");
        sb.append("car_use_yn").append("=").append(car_use_yn).append(",");
        sb.append("truth_orign_ymd").append("=").append(truth_orign_ymd).append(",");
        sb.append("truth_cls_ymd").append("=").append(truth_cls_ymd).append(",");
        sb.append("biztrip_nght").append("=").append(biztrip_nght).append(",");
        sb.append("biztrip_day").append("=").append(biztrip_day).append(",");
        sb.append("chng_resn").append("=").append(chng_resn).append(",");
        sb.append("chng_contnt").append("=").append(chng_contnt).append(",");
        sb.append("biztrip_start_region").append("=").append(biztrip_start_region).append(",");
        sb.append("truth_region").append("=").append(truth_region).append(",");
        sb.append("truth_biztrip_form").append("=").append(truth_biztrip_form).append(",");
        sb.append("truth_biztrip_goal_cd").append("=").append(truth_biztrip_goal_cd).append(",");
        sb.append("truth_biztrip_goal").append("=").append(truth_biztrip_goal).append(",");
        sb.append("notebook_in").append("=").append(notebook_in).append(",");
        sb.append("usb_in").append("=").append(usb_in).append(",");
        sb.append("evid_attach_file_no").append("=").append(evid_attach_file_no).append(",");
        sb.append("biztrip_way").append("=").append(biztrip_way).append(",");
        sb.append("bizwrk_atdnc_contnt").append("=").append(bizwrk_atdnc_contnt).append(",");
        sb.append("polcy_suggst_item").append("=").append(polcy_suggst_item);
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
