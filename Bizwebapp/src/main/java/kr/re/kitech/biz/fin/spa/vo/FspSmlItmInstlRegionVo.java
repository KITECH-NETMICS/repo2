package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "소액물품 최근설치지역 Vo")
public class FspSmlItmInstlRegionVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspSmlItmInstlRegionVo(){
    }

    @ElDtoField(logicalName = "검수번호", physicalName = "check_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String check_no;

    @ElDtoField(logicalName = "설치위치(건물)", physicalName = "instl_posi_region_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String instl_posi_region_cd;

    @ElDtoField(logicalName = "설치위치(건물명)", physicalName = "instl_posi_region_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String instl_posi_region_nm;

    @ElDtoField(logicalName = "설치위치(건물)", physicalName = "instl_posi_build_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String instl_posi_build_cd;

    @ElDtoField(logicalName = "설치위치(건물명)", physicalName = "instl_posi_build_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String instl_posi_build_nm;

    @ElDtoField(logicalName = "설치위치(층)", physicalName = "instl_posi_floor_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String instl_posi_floor_cd;

    @ElDtoField(logicalName = "설치위치(호수)", physicalName = "instl_posi_editno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String instl_posi_editno;

    @ElDtoField(logicalName = "검사자성명", physicalName = "check_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String check_psn_nm;

    @ElVoField(physicalName = "check_no")
    public String getCheck_no(){
        return check_no;
    }

    @ElVoField(physicalName = "check_no")
    public void setCheck_no(String check_no){
        this.check_no = check_no;
    }

    @ElVoField(physicalName = "instl_posi_region_cd")
    public String getInstl_posi_region_cd(){
        return instl_posi_region_cd;
    }

    @ElVoField(physicalName = "instl_posi_region_cd")
    public void setInstl_posi_region_cd(String instl_posi_region_cd){
        this.instl_posi_region_cd = instl_posi_region_cd;
    }

    @ElVoField(physicalName = "instl_posi_region_nm")
    public String getInstl_posi_region_nm(){
        return instl_posi_region_nm;
    }

    @ElVoField(physicalName = "instl_posi_region_nm")
    public void setInstl_posi_region_nm(String instl_posi_region_nm){
        this.instl_posi_region_nm = instl_posi_region_nm;
    }

    @ElVoField(physicalName = "instl_posi_build_cd")
    public String getInstl_posi_build_cd(){
        return instl_posi_build_cd;
    }

    @ElVoField(physicalName = "instl_posi_build_cd")
    public void setInstl_posi_build_cd(String instl_posi_build_cd){
        this.instl_posi_build_cd = instl_posi_build_cd;
    }

    @ElVoField(physicalName = "instl_posi_build_nm")
    public String getInstl_posi_build_nm(){
        return instl_posi_build_nm;
    }

    @ElVoField(physicalName = "instl_posi_build_nm")
    public void setInstl_posi_build_nm(String instl_posi_build_nm){
        this.instl_posi_build_nm = instl_posi_build_nm;
    }

    @ElVoField(physicalName = "instl_posi_floor_cd")
    public String getInstl_posi_floor_cd(){
        return instl_posi_floor_cd;
    }

    @ElVoField(physicalName = "instl_posi_floor_cd")
    public void setInstl_posi_floor_cd(String instl_posi_floor_cd){
        this.instl_posi_floor_cd = instl_posi_floor_cd;
    }

    @ElVoField(physicalName = "instl_posi_editno")
    public String getInstl_posi_editno(){
        return instl_posi_editno;
    }

    @ElVoField(physicalName = "instl_posi_editno")
    public void setInstl_posi_editno(String instl_posi_editno){
        this.instl_posi_editno = instl_posi_editno;
    }

    @ElVoField(physicalName = "check_psn_nm")
    public String getCheck_psn_nm(){
        return check_psn_nm;
    }

    @ElVoField(physicalName = "check_psn_nm")
    public void setCheck_psn_nm(String check_psn_nm){
        this.check_psn_nm = check_psn_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspSmlItmInstlRegionVo [");
        sb.append("check_no").append("=").append(check_no).append(",");
        sb.append("instl_posi_region_cd").append("=").append(instl_posi_region_cd).append(",");
        sb.append("instl_posi_region_nm").append("=").append(instl_posi_region_nm).append(",");
        sb.append("instl_posi_build_cd").append("=").append(instl_posi_build_cd).append(",");
        sb.append("instl_posi_build_nm").append("=").append(instl_posi_build_nm).append(",");
        sb.append("instl_posi_floor_cd").append("=").append(instl_posi_floor_cd).append(",");
        sb.append("instl_posi_editno").append("=").append(instl_posi_editno).append(",");
        sb.append("check_psn_nm").append("=").append(check_psn_nm);
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
