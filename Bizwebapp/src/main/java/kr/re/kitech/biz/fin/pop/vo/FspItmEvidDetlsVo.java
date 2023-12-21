package kr.re.kitech.biz.fin.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "신연구비증빙내역Vo")
public class FspItmEvidDetlsVo extends kr.re.kitech.biz.fin.com.vo.FspSlipDComVo {
    private static final long serialVersionUID = 1L;

    public FspItmEvidDetlsVo(){
    }

    @ElDtoField(logicalName = "내외구분", physicalName = "inout_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inout_clsf;

    @ElDtoField(logicalName = "순번", physicalName = "odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int odr;

    @ElDtoField(logicalName = "부서명", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "개인번호", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "성명", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "연구자등록번호", physicalName = "res_person_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_person_no;

    @ElDtoField(logicalName = "증빙제목명", physicalName = "title_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String title_nm;

    @ElDtoField(logicalName = "장소명", physicalName = "plc_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String plc_nm;

    @ElDtoField(logicalName = "시작일자", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;

    @ElDtoField(logicalName = "종료일자", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "시작시간", physicalName = "start_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_time;

    @ElDtoField(logicalName = "종료시간", physicalName = "cls_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_time;

    @ElDtoField(logicalName = "적요1", physicalName = "rmk_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk_1;

    @ElDtoField(logicalName = "적요2", physicalName = "rmk_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk_2;

    @ElDtoField(logicalName = "대면구분", physicalName = "meet_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String meet_clsf;

    @ElDtoField(logicalName = "국내/외구분", physicalName = "nation_inout_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nation_inout_cd;

    @ElDtoField(logicalName = "개최국", physicalName = "confnation", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String confnation;

    @ElDtoField(logicalName = "개최지", physicalName = "confarea", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String confarea;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "비용코드명", physicalName = "expns_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "경비결의 결재에서 사용")
    private String expns_cd_nm;

    @ElDtoField(logicalName = "개수", physicalName = "cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int cnt;

    @ElDtoField(logicalName = "서비스아이디", physicalName = "service_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String service_id;

    @ElVoField(physicalName = "inout_clsf")
    public String getInout_clsf(){
        return inout_clsf;
    }

    @ElVoField(physicalName = "inout_clsf")
    public void setInout_clsf(String inout_clsf){
        this.inout_clsf = inout_clsf;
    }

    @ElVoField(physicalName = "odr")
    public int getOdr(){
        return odr;
    }

    @ElVoField(physicalName = "odr")
    public void setOdr(int odr){
        this.odr = odr;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "res_person_no")
    public String getRes_person_no(){
        return res_person_no;
    }

    @ElVoField(physicalName = "res_person_no")
    public void setRes_person_no(String res_person_no){
        this.res_person_no = res_person_no;
    }

    @ElVoField(physicalName = "title_nm")
    public String getTitle_nm(){
        return title_nm;
    }

    @ElVoField(physicalName = "title_nm")
    public void setTitle_nm(String title_nm){
        this.title_nm = title_nm;
    }

    @ElVoField(physicalName = "plc_nm")
    public String getPlc_nm(){
        return plc_nm;
    }

    @ElVoField(physicalName = "plc_nm")
    public void setPlc_nm(String plc_nm){
        this.plc_nm = plc_nm;
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

    @ElVoField(physicalName = "start_time")
    public String getStart_time(){
        return start_time;
    }

    @ElVoField(physicalName = "start_time")
    public void setStart_time(String start_time){
        this.start_time = start_time;
    }

    @ElVoField(physicalName = "cls_time")
    public String getCls_time(){
        return cls_time;
    }

    @ElVoField(physicalName = "cls_time")
    public void setCls_time(String cls_time){
        this.cls_time = cls_time;
    }

    @ElVoField(physicalName = "rmk_1")
    public String getRmk_1(){
        return rmk_1;
    }

    @ElVoField(physicalName = "rmk_1")
    public void setRmk_1(String rmk_1){
        this.rmk_1 = rmk_1;
    }

    @ElVoField(physicalName = "rmk_2")
    public String getRmk_2(){
        return rmk_2;
    }

    @ElVoField(physicalName = "rmk_2")
    public void setRmk_2(String rmk_2){
        this.rmk_2 = rmk_2;
    }

    @ElVoField(physicalName = "meet_clsf")
    public String getMeet_clsf(){
        return meet_clsf;
    }

    @ElVoField(physicalName = "meet_clsf")
    public void setMeet_clsf(String meet_clsf){
        this.meet_clsf = meet_clsf;
    }

    @ElVoField(physicalName = "nation_inout_cd")
    public String getNation_inout_cd(){
        return nation_inout_cd;
    }

    @ElVoField(physicalName = "nation_inout_cd")
    public void setNation_inout_cd(String nation_inout_cd){
        this.nation_inout_cd = nation_inout_cd;
    }

    @ElVoField(physicalName = "confnation")
    public String getConfnation(){
        return confnation;
    }

    @ElVoField(physicalName = "confnation")
    public void setConfnation(String confnation){
        this.confnation = confnation;
    }

    @ElVoField(physicalName = "confarea")
    public String getConfarea(){
        return confarea;
    }

    @ElVoField(physicalName = "confarea")
    public void setConfarea(String confarea){
        this.confarea = confarea;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "expns_cd_nm")
    public String getExpns_cd_nm(){
        return expns_cd_nm;
    }

    @ElVoField(physicalName = "expns_cd_nm")
    public void setExpns_cd_nm(String expns_cd_nm){
        this.expns_cd_nm = expns_cd_nm;
    }

    @ElVoField(physicalName = "cnt")
    public int getCnt(){
        return cnt;
    }

    @ElVoField(physicalName = "cnt")
    public void setCnt(int cnt){
        this.cnt = cnt;
    }

    @ElVoField(physicalName = "service_id")
    public String getService_id(){
        return service_id;
    }

    @ElVoField(physicalName = "service_id")
    public void setService_id(String service_id){
        this.service_id = service_id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspItmEvidDetlsVo [");
        sb.append("inout_clsf").append("=").append(inout_clsf).append(",");
        sb.append("odr").append("=").append(odr).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("res_person_no").append("=").append(res_person_no).append(",");
        sb.append("title_nm").append("=").append(title_nm).append(",");
        sb.append("plc_nm").append("=").append(plc_nm).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("start_time").append("=").append(start_time).append(",");
        sb.append("cls_time").append("=").append(cls_time).append(",");
        sb.append("rmk_1").append("=").append(rmk_1).append(",");
        sb.append("rmk_2").append("=").append(rmk_2).append(",");
        sb.append("meet_clsf").append("=").append(meet_clsf).append(",");
        sb.append("nation_inout_cd").append("=").append(nation_inout_cd).append(",");
        sb.append("confnation").append("=").append(confnation).append(",");
        sb.append("confarea").append("=").append(confarea).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("expns_cd_nm").append("=").append(expns_cd_nm).append(",");
        sb.append("cnt").append("=").append(cnt).append(",");
        sb.append("service_id").append("=").append(service_id);
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
