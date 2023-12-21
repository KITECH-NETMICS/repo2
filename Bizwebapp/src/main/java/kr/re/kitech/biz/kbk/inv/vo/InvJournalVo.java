package kr.re.kitech.biz.kbk.inv.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "저널관리Vo")
public class InvJournalVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public InvJournalVo(){
    }

    @ElDtoField(logicalName = "센터구분", physicalName = "centr_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String centr_cd;

    @ElDtoField(logicalName = "저널번호", physicalName = "jurnl_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String jurnl_no;

    @ElDtoField(logicalName = "등록일자", physicalName = "regst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_ymd;

    @ElDtoField(logicalName = "저널구분", physicalName = "jurnl_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String jurnl_clsf_cd;

    @ElDtoField(logicalName = "저널구분명", physicalName = "jurnl_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String jurnl_clsf_nm;

    @ElDtoField(logicalName = "저널제목", physicalName = "jurnl_subj", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String jurnl_subj;

    @ElDtoField(logicalName = "발행처", physicalName = "publ_vend", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String publ_vend;

    @ElDtoField(logicalName = "간기", physicalName = "imprnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String imprnt;

    @ElDtoField(logicalName = "구독", physicalName = "cont_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cont_yn;

    @ElDtoField(logicalName = "issn", physicalName = "issn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issn;

    @ElDtoField(logicalName = "전자저널홈페이지", physicalName = "electr_jurnl_homepg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String electr_jurnl_homepg;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "recent_wrhsg_schdl_ymd", physicalName = "recent_wrhsg_schdl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String recent_wrhsg_schdl_ymd;

    @ElDtoField(logicalName = "pspnmt_time", physicalName = "pspnmt_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pspnmt_time;

    @ElDtoField(logicalName = "chkContnt", physicalName = "chkContnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chkContnt;

    @ElDtoField(logicalName = "정보", physicalName = "info", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String info;

    @ElDtoField(logicalName = "agent_vend", physicalName = "agent_vend", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agent_vend;

    @ElDtoField(logicalName = "clsf", physicalName = "clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String clsf;

    @ElDtoField(logicalName = "clsf_cd", physicalName = "clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String clsf_cd;

    @ElDtoField(logicalName = "imprnt_nm", physicalName = "imprnt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String imprnt_nm;

    @ElDtoField(logicalName = "homepg", physicalName = "homepg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String homepg;

    @ElDtoField(logicalName = "kitech_owshp_yn", physicalName = "kitech_owshp_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String kitech_owshp_yn;

    @ElDtoField(logicalName = "kitech_owshp_yr", physicalName = "kitech_owshp_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String kitech_owshp_yr;

    @ElDtoField(logicalName = "natn_cd", physicalName = "natn_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String natn_cd;

    @ElDtoField(logicalName = "out_agncy_owshp_item", physicalName = "out_agncy_owshp_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String out_agncy_owshp_item;

    @ElDtoField(logicalName = "pur_clsf", physicalName = "pur_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_clsf;

    @ElDtoField(logicalName = "regst_no", physicalName = "regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_no;

    @ElDtoField(logicalName = "startpubl_ymd", physicalName = "startpubl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String startpubl_ymd;

    @ElDtoField(logicalName = "subj_fild", physicalName = "subj_fild", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String subj_fild;

    @ElDtoField(logicalName = "tong_yn", physicalName = "tong_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tong_yn;

    @ElDtoField(logicalName = "엑셀다운로드 여부", physicalName = "isExcel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String isExcel;

    @ElVoField(physicalName = "centr_cd")
    public String getCentr_cd(){
        return centr_cd;
    }

    @ElVoField(physicalName = "centr_cd")
    public void setCentr_cd(String centr_cd){
        this.centr_cd = centr_cd;
    }

    @ElVoField(physicalName = "jurnl_no")
    public String getJurnl_no(){
        return jurnl_no;
    }

    @ElVoField(physicalName = "jurnl_no")
    public void setJurnl_no(String jurnl_no){
        this.jurnl_no = jurnl_no;
    }

    @ElVoField(physicalName = "regst_ymd")
    public String getRegst_ymd(){
        return regst_ymd;
    }

    @ElVoField(physicalName = "regst_ymd")
    public void setRegst_ymd(String regst_ymd){
        this.regst_ymd = regst_ymd;
    }

    @ElVoField(physicalName = "jurnl_clsf_cd")
    public String getJurnl_clsf_cd(){
        return jurnl_clsf_cd;
    }

    @ElVoField(physicalName = "jurnl_clsf_cd")
    public void setJurnl_clsf_cd(String jurnl_clsf_cd){
        this.jurnl_clsf_cd = jurnl_clsf_cd;
    }

    @ElVoField(physicalName = "jurnl_clsf_nm")
    public String getJurnl_clsf_nm(){
        return jurnl_clsf_nm;
    }

    @ElVoField(physicalName = "jurnl_clsf_nm")
    public void setJurnl_clsf_nm(String jurnl_clsf_nm){
        this.jurnl_clsf_nm = jurnl_clsf_nm;
    }

    @ElVoField(physicalName = "jurnl_subj")
    public String getJurnl_subj(){
        return jurnl_subj;
    }

    @ElVoField(physicalName = "jurnl_subj")
    public void setJurnl_subj(String jurnl_subj){
        this.jurnl_subj = jurnl_subj;
    }

    @ElVoField(physicalName = "publ_vend")
    public String getPubl_vend(){
        return publ_vend;
    }

    @ElVoField(physicalName = "publ_vend")
    public void setPubl_vend(String publ_vend){
        this.publ_vend = publ_vend;
    }

    @ElVoField(physicalName = "imprnt")
    public String getImprnt(){
        return imprnt;
    }

    @ElVoField(physicalName = "imprnt")
    public void setImprnt(String imprnt){
        this.imprnt = imprnt;
    }

    @ElVoField(physicalName = "cont_yn")
    public String getCont_yn(){
        return cont_yn;
    }

    @ElVoField(physicalName = "cont_yn")
    public void setCont_yn(String cont_yn){
        this.cont_yn = cont_yn;
    }

    @ElVoField(physicalName = "issn")
    public String getIssn(){
        return issn;
    }

    @ElVoField(physicalName = "issn")
    public void setIssn(String issn){
        this.issn = issn;
    }

    @ElVoField(physicalName = "electr_jurnl_homepg")
    public String getElectr_jurnl_homepg(){
        return electr_jurnl_homepg;
    }

    @ElVoField(physicalName = "electr_jurnl_homepg")
    public void setElectr_jurnl_homepg(String electr_jurnl_homepg){
        this.electr_jurnl_homepg = electr_jurnl_homepg;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "recent_wrhsg_schdl_ymd")
    public String getRecent_wrhsg_schdl_ymd(){
        return recent_wrhsg_schdl_ymd;
    }

    @ElVoField(physicalName = "recent_wrhsg_schdl_ymd")
    public void setRecent_wrhsg_schdl_ymd(String recent_wrhsg_schdl_ymd){
        this.recent_wrhsg_schdl_ymd = recent_wrhsg_schdl_ymd;
    }

    @ElVoField(physicalName = "pspnmt_time")
    public String getPspnmt_time(){
        return pspnmt_time;
    }

    @ElVoField(physicalName = "pspnmt_time")
    public void setPspnmt_time(String pspnmt_time){
        this.pspnmt_time = pspnmt_time;
    }

    @ElVoField(physicalName = "chkContnt")
    public String getChkContnt(){
        return chkContnt;
    }

    @ElVoField(physicalName = "chkContnt")
    public void setChkContnt(String chkContnt){
        this.chkContnt = chkContnt;
    }

    @ElVoField(physicalName = "info")
    public String getInfo(){
        return info;
    }

    @ElVoField(physicalName = "info")
    public void setInfo(String info){
        this.info = info;
    }

    @ElVoField(physicalName = "agent_vend")
    public String getAgent_vend(){
        return agent_vend;
    }

    @ElVoField(physicalName = "agent_vend")
    public void setAgent_vend(String agent_vend){
        this.agent_vend = agent_vend;
    }

    @ElVoField(physicalName = "clsf")
    public String getClsf(){
        return clsf;
    }

    @ElVoField(physicalName = "clsf")
    public void setClsf(String clsf){
        this.clsf = clsf;
    }

    @ElVoField(physicalName = "clsf_cd")
    public String getClsf_cd(){
        return clsf_cd;
    }

    @ElVoField(physicalName = "clsf_cd")
    public void setClsf_cd(String clsf_cd){
        this.clsf_cd = clsf_cd;
    }

    @ElVoField(physicalName = "imprnt_nm")
    public String getImprnt_nm(){
        return imprnt_nm;
    }

    @ElVoField(physicalName = "imprnt_nm")
    public void setImprnt_nm(String imprnt_nm){
        this.imprnt_nm = imprnt_nm;
    }

    @ElVoField(physicalName = "homepg")
    public String getHomepg(){
        return homepg;
    }

    @ElVoField(physicalName = "homepg")
    public void setHomepg(String homepg){
        this.homepg = homepg;
    }

    @ElVoField(physicalName = "kitech_owshp_yn")
    public String getKitech_owshp_yn(){
        return kitech_owshp_yn;
    }

    @ElVoField(physicalName = "kitech_owshp_yn")
    public void setKitech_owshp_yn(String kitech_owshp_yn){
        this.kitech_owshp_yn = kitech_owshp_yn;
    }

    @ElVoField(physicalName = "kitech_owshp_yr")
    public String getKitech_owshp_yr(){
        return kitech_owshp_yr;
    }

    @ElVoField(physicalName = "kitech_owshp_yr")
    public void setKitech_owshp_yr(String kitech_owshp_yr){
        this.kitech_owshp_yr = kitech_owshp_yr;
    }

    @ElVoField(physicalName = "natn_cd")
    public String getNatn_cd(){
        return natn_cd;
    }

    @ElVoField(physicalName = "natn_cd")
    public void setNatn_cd(String natn_cd){
        this.natn_cd = natn_cd;
    }

    @ElVoField(physicalName = "out_agncy_owshp_item")
    public String getOut_agncy_owshp_item(){
        return out_agncy_owshp_item;
    }

    @ElVoField(physicalName = "out_agncy_owshp_item")
    public void setOut_agncy_owshp_item(String out_agncy_owshp_item){
        this.out_agncy_owshp_item = out_agncy_owshp_item;
    }

    @ElVoField(physicalName = "pur_clsf")
    public String getPur_clsf(){
        return pur_clsf;
    }

    @ElVoField(physicalName = "pur_clsf")
    public void setPur_clsf(String pur_clsf){
        this.pur_clsf = pur_clsf;
    }

    @ElVoField(physicalName = "regst_no")
    public String getRegst_no(){
        return regst_no;
    }

    @ElVoField(physicalName = "regst_no")
    public void setRegst_no(String regst_no){
        this.regst_no = regst_no;
    }

    @ElVoField(physicalName = "startpubl_ymd")
    public String getStartpubl_ymd(){
        return startpubl_ymd;
    }

    @ElVoField(physicalName = "startpubl_ymd")
    public void setStartpubl_ymd(String startpubl_ymd){
        this.startpubl_ymd = startpubl_ymd;
    }

    @ElVoField(physicalName = "subj_fild")
    public String getSubj_fild(){
        return subj_fild;
    }

    @ElVoField(physicalName = "subj_fild")
    public void setSubj_fild(String subj_fild){
        this.subj_fild = subj_fild;
    }

    @ElVoField(physicalName = "tong_yn")
    public String getTong_yn(){
        return tong_yn;
    }

    @ElVoField(physicalName = "tong_yn")
    public void setTong_yn(String tong_yn){
        this.tong_yn = tong_yn;
    }

    @ElVoField(physicalName = "isExcel")
    public String getIsExcel(){
        return isExcel;
    }

    @ElVoField(physicalName = "isExcel")
    public void setIsExcel(String isExcel){
        this.isExcel = isExcel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvJournalVo [");
        sb.append("centr_cd").append("=").append(centr_cd).append(",");
        sb.append("jurnl_no").append("=").append(jurnl_no).append(",");
        sb.append("regst_ymd").append("=").append(regst_ymd).append(",");
        sb.append("jurnl_clsf_cd").append("=").append(jurnl_clsf_cd).append(",");
        sb.append("jurnl_clsf_nm").append("=").append(jurnl_clsf_nm).append(",");
        sb.append("jurnl_subj").append("=").append(jurnl_subj).append(",");
        sb.append("publ_vend").append("=").append(publ_vend).append(",");
        sb.append("imprnt").append("=").append(imprnt).append(",");
        sb.append("cont_yn").append("=").append(cont_yn).append(",");
        sb.append("issn").append("=").append(issn).append(",");
        sb.append("electr_jurnl_homepg").append("=").append(electr_jurnl_homepg).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("recent_wrhsg_schdl_ymd").append("=").append(recent_wrhsg_schdl_ymd).append(",");
        sb.append("pspnmt_time").append("=").append(pspnmt_time).append(",");
        sb.append("chkContnt").append("=").append(chkContnt).append(",");
        sb.append("info").append("=").append(info).append(",");
        sb.append("agent_vend").append("=").append(agent_vend).append(",");
        sb.append("clsf").append("=").append(clsf).append(",");
        sb.append("clsf_cd").append("=").append(clsf_cd).append(",");
        sb.append("imprnt_nm").append("=").append(imprnt_nm).append(",");
        sb.append("homepg").append("=").append(homepg).append(",");
        sb.append("kitech_owshp_yn").append("=").append(kitech_owshp_yn).append(",");
        sb.append("kitech_owshp_yr").append("=").append(kitech_owshp_yr).append(",");
        sb.append("natn_cd").append("=").append(natn_cd).append(",");
        sb.append("out_agncy_owshp_item").append("=").append(out_agncy_owshp_item).append(",");
        sb.append("pur_clsf").append("=").append(pur_clsf).append(",");
        sb.append("regst_no").append("=").append(regst_no).append(",");
        sb.append("startpubl_ymd").append("=").append(startpubl_ymd).append(",");
        sb.append("subj_fild").append("=").append(subj_fild).append(",");
        sb.append("tong_yn").append("=").append(tong_yn).append(",");
        sb.append("isExcel").append("=").append(isExcel);
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
