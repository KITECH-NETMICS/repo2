package kr.re.kitech.biz.ccs.cws.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "출퇴근마스터VO")
public class CwsCmtAreaMstVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CwsCmtAreaMstVo(){
    }

    @ElDtoField(logicalName = "근무지역번호", physicalName = "area_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String area_no;

    @ElDtoField(logicalName = "부서코드", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "부서신설일자", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "사용여부", physicalName = "is_use", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String is_use;

    @ElDtoField(logicalName = "좌측위도", physicalName = "left_hor", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String left_hor;

    @ElDtoField(logicalName = "좌측경도", physicalName = "left_ver", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String left_ver;

    @ElDtoField(logicalName = "우측위도", physicalName = "right_hor", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String right_hor;

    @ElDtoField(logicalName = "우측경도", physicalName = "right_ver", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String right_ver;

    @ElDtoField(logicalName = "지정범위", physicalName = "upset", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String upset;

    @ElDtoField(logicalName = "주소", physicalName = "addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "작성자", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "작성일자", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "수정자", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;

    @ElDtoField(logicalName = "수정일자", physicalName = "updt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_daytm;

    @ElVoField(physicalName = "area_no")
    public String getArea_no(){
        return area_no;
    }

    @ElVoField(physicalName = "area_no")
    public void setArea_no(String area_no){
        this.area_no = area_no;
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

    @ElVoField(physicalName = "is_use")
    public String getIs_use(){
        return is_use;
    }

    @ElVoField(physicalName = "is_use")
    public void setIs_use(String is_use){
        this.is_use = is_use;
    }

    @ElVoField(physicalName = "left_hor")
    public String getLeft_hor(){
        return left_hor;
    }

    @ElVoField(physicalName = "left_hor")
    public void setLeft_hor(String left_hor){
        this.left_hor = left_hor;
    }

    @ElVoField(physicalName = "left_ver")
    public String getLeft_ver(){
        return left_ver;
    }

    @ElVoField(physicalName = "left_ver")
    public void setLeft_ver(String left_ver){
        this.left_ver = left_ver;
    }

    @ElVoField(physicalName = "right_hor")
    public String getRight_hor(){
        return right_hor;
    }

    @ElVoField(physicalName = "right_hor")
    public void setRight_hor(String right_hor){
        this.right_hor = right_hor;
    }

    @ElVoField(physicalName = "right_ver")
    public String getRight_ver(){
        return right_ver;
    }

    @ElVoField(physicalName = "right_ver")
    public void setRight_ver(String right_ver){
        this.right_ver = right_ver;
    }

    @ElVoField(physicalName = "upset")
    public String getUpset(){
        return upset;
    }

    @ElVoField(physicalName = "upset")
    public void setUpset(String upset){
        this.upset = upset;
    }

    @ElVoField(physicalName = "addr")
    public String getAddr(){
        return addr;
    }

    @ElVoField(physicalName = "addr")
    public void setAddr(String addr){
        this.addr = addr;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        return regst_daytm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public String getUpdt_syspayno(){
        return updt_syspayno;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public void setUpdt_syspayno(String updt_syspayno){
        this.updt_syspayno = updt_syspayno;
    }

    @ElVoField(physicalName = "updt_daytm")
    public String getUpdt_daytm(){
        return updt_daytm;
    }

    @ElVoField(physicalName = "updt_daytm")
    public void setUpdt_daytm(String updt_daytm){
        this.updt_daytm = updt_daytm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CwsCmtAreaMstVo [");
        sb.append("area_no").append("=").append(area_no).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("is_use").append("=").append(is_use).append(",");
        sb.append("left_hor").append("=").append(left_hor).append(",");
        sb.append("left_ver").append("=").append(left_ver).append(",");
        sb.append("right_hor").append("=").append(right_hor).append(",");
        sb.append("right_ver").append("=").append(right_ver).append(",");
        sb.append("upset").append("=").append(upset).append(",");
        sb.append("addr").append("=").append(addr).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
        sb.append("updt_daytm").append("=").append(updt_daytm);
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
