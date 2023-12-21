package kr.re.kitech.biz.xom.core.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "마이메뉴")
public class MymenuVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public MymenuVo(){
    }

    @ElDtoField(logicalName = "사번", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "서비스ID", physicalName = "service_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String service_id;

    @ElDtoField(logicalName = "마이메뉴ID", physicalName = "menu_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String menu_id;

    @ElDtoField(logicalName = "상위마이메뉴ID", physicalName = "menu_up_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String menu_up_id;

    @ElDtoField(logicalName = "마이메뉴 폴더명", physicalName = "menu_folder_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String menu_folder_nm;

    @ElDtoField(logicalName = "마이메뉴 뎁스", physicalName = "menu_lvl", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String menu_lvl;

    @ElDtoField(logicalName = "마이메뉴 순번", physicalName = "menu_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String menu_seq;

    @ElDtoField(logicalName = "검색_사번", physicalName = "SC_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String SC_syspayno;

    @ElDtoField(logicalName = "검색_서비스ID", physicalName = "SC_service_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String SC_service_id;

    @ElDtoField(logicalName = "검색_메뉴ID", physicalName = "SC_menu_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String SC_menu_id;

    @ElDtoField(logicalName = "컬럼상태", physicalName = "rowStatus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rowStatus;

    @ElDtoField(logicalName = "포탈_메뉴URL", physicalName = "bkmkMenuUrl", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bkmkMenuUrl;

    @ElDtoField(logicalName = "포탈_삭제유무", physicalName = "deleteAt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int deleteAt;

    @ElDtoField(logicalName = "포탈_이름", physicalName = "registerName", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String registerName;

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "service_id")
    public String getService_id(){
        return service_id;
    }

    @ElVoField(physicalName = "service_id")
    public void setService_id(String service_id){
        this.service_id = service_id;
    }

    @ElVoField(physicalName = "menu_id")
    public String getMenu_id(){
        return menu_id;
    }

    @ElVoField(physicalName = "menu_id")
    public void setMenu_id(String menu_id){
        this.menu_id = menu_id;
    }

    @ElVoField(physicalName = "menu_up_id")
    public String getMenu_up_id(){
        return menu_up_id;
    }

    @ElVoField(physicalName = "menu_up_id")
    public void setMenu_up_id(String menu_up_id){
        this.menu_up_id = menu_up_id;
    }

    @ElVoField(physicalName = "menu_folder_nm")
    public String getMenu_folder_nm(){
        return menu_folder_nm;
    }

    @ElVoField(physicalName = "menu_folder_nm")
    public void setMenu_folder_nm(String menu_folder_nm){
        this.menu_folder_nm = menu_folder_nm;
    }

    @ElVoField(physicalName = "menu_lvl")
    public String getMenu_lvl(){
        return menu_lvl;
    }

    @ElVoField(physicalName = "menu_lvl")
    public void setMenu_lvl(String menu_lvl){
        this.menu_lvl = menu_lvl;
    }

    @ElVoField(physicalName = "menu_seq")
    public String getMenu_seq(){
        return menu_seq;
    }

    @ElVoField(physicalName = "menu_seq")
    public void setMenu_seq(String menu_seq){
        this.menu_seq = menu_seq;
    }

    @ElVoField(physicalName = "SC_syspayno")
    public String getSC_syspayno(){
        return SC_syspayno;
    }

    @ElVoField(physicalName = "SC_syspayno")
    public void setSC_syspayno(String SC_syspayno){
        this.SC_syspayno = SC_syspayno;
    }

    @ElVoField(physicalName = "SC_service_id")
    public String getSC_service_id(){
        return SC_service_id;
    }

    @ElVoField(physicalName = "SC_service_id")
    public void setSC_service_id(String SC_service_id){
        this.SC_service_id = SC_service_id;
    }

    @ElVoField(physicalName = "SC_menu_id")
    public String getSC_menu_id(){
        return SC_menu_id;
    }

    @ElVoField(physicalName = "SC_menu_id")
    public void setSC_menu_id(String SC_menu_id){
        this.SC_menu_id = SC_menu_id;
    }

    @ElVoField(physicalName = "rowStatus")
    public String getRowStatus(){
        return rowStatus;
    }

    @ElVoField(physicalName = "rowStatus")
    public void setRowStatus(String rowStatus){
        this.rowStatus = rowStatus;
    }

    @ElVoField(physicalName = "bkmkMenuUrl")
    public String getBkmkMenuUrl(){
        return bkmkMenuUrl;
    }

    @ElVoField(physicalName = "bkmkMenuUrl")
    public void setBkmkMenuUrl(String bkmkMenuUrl){
        this.bkmkMenuUrl = bkmkMenuUrl;
    }

    @ElVoField(physicalName = "deleteAt")
    public int getDeleteAt(){
        return deleteAt;
    }

    @ElVoField(physicalName = "deleteAt")
    public void setDeleteAt(int deleteAt){
        this.deleteAt = deleteAt;
    }

    @ElVoField(physicalName = "registerName")
    public String getRegisterName(){
        return registerName;
    }

    @ElVoField(physicalName = "registerName")
    public void setRegisterName(String registerName){
        this.registerName = registerName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MymenuVo [");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("service_id").append("=").append(service_id).append(",");
        sb.append("menu_id").append("=").append(menu_id).append(",");
        sb.append("menu_up_id").append("=").append(menu_up_id).append(",");
        sb.append("menu_folder_nm").append("=").append(menu_folder_nm).append(",");
        sb.append("menu_lvl").append("=").append(menu_lvl).append(",");
        sb.append("menu_seq").append("=").append(menu_seq).append(",");
        sb.append("SC_syspayno").append("=").append(SC_syspayno).append(",");
        sb.append("SC_service_id").append("=").append(SC_service_id).append(",");
        sb.append("SC_menu_id").append("=").append(SC_menu_id).append(",");
        sb.append("rowStatus").append("=").append(rowStatus).append(",");
        sb.append("bkmkMenuUrl").append("=").append(bkmkMenuUrl).append(",");
        sb.append("deleteAt").append("=").append(deleteAt).append(",");
        sb.append("registerName").append("=").append(registerName);
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
