package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "참여연구원 Vo")
public class ResInpPareVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResInpPareVo(){
    }

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "과제번호", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no;

    @ElDtoField(logicalName = "과세비과세명", physicalName = "tax_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_nm;

    @ElDtoField(logicalName = "인건비구분", physicalName = "psnexpns_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psnexpns_clsf;

    @ElDtoField(logicalName = "연구원구분", physicalName = "reschr_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reschr_clsf;

    @ElDtoField(logicalName = "참여연구원이름", physicalName = "inppareNm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inppareNm;

    @ElDtoField(logicalName = "cd_nm", physicalName = "cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_nm;

    @ElDtoField(logicalName = "이름", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "사원번호", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "주민번호", physicalName = "resid_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resid_regst_no;

    @ElDtoField(logicalName = "부서명", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "지급명", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "현금참여율", physicalName = "cash_attnce_rt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cash_attnce_rt;

    @ElDtoField(logicalName = "현물참여율", physicalName = "goods_attnce_rt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String goods_attnce_rt;

    @ElDtoField(logicalName = "총금액", physicalName = "tot_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_amt;

    @ElDtoField(logicalName = "중간첨부파일", physicalName = "middle_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String middle_attach_file;

    @ElDtoField(logicalName = "최종첨부파일", physicalName = "final_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String final_attach_file;

    @ElDtoField(logicalName = "참여시작일", physicalName = "attnce_prd_orign_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attnce_prd_orign_ymd;

    @ElDtoField(logicalName = "참여종료일", physicalName = "attnce_prd_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attnce_prd_cls_ymd;

    @ElDtoField(logicalName = "사번", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "prj_no")
    public String getPrj_no(){
        return prj_no;
    }

    @ElVoField(physicalName = "prj_no")
    public void setPrj_no(String prj_no){
        this.prj_no = prj_no;
    }

    @ElVoField(physicalName = "tax_nm")
    public String getTax_nm(){
        return tax_nm;
    }

    @ElVoField(physicalName = "tax_nm")
    public void setTax_nm(String tax_nm){
        this.tax_nm = tax_nm;
    }

    @ElVoField(physicalName = "psnexpns_clsf")
    public String getPsnexpns_clsf(){
        return psnexpns_clsf;
    }

    @ElVoField(physicalName = "psnexpns_clsf")
    public void setPsnexpns_clsf(String psnexpns_clsf){
        this.psnexpns_clsf = psnexpns_clsf;
    }

    @ElVoField(physicalName = "reschr_clsf")
    public String getReschr_clsf(){
        return reschr_clsf;
    }

    @ElVoField(physicalName = "reschr_clsf")
    public void setReschr_clsf(String reschr_clsf){
        this.reschr_clsf = reschr_clsf;
    }

    @ElVoField(physicalName = "inppareNm")
    public String getInppareNm(){
        return inppareNm;
    }

    @ElVoField(physicalName = "inppareNm")
    public void setInppareNm(String inppareNm){
        this.inppareNm = inppareNm;
    }

    @ElVoField(physicalName = "cd_nm")
    public String getCd_nm(){
        return cd_nm;
    }

    @ElVoField(physicalName = "cd_nm")
    public void setCd_nm(String cd_nm){
        this.cd_nm = cd_nm;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "resid_regst_no")
    public String getResid_regst_no(){
        return resid_regst_no;
    }

    @ElVoField(physicalName = "resid_regst_no")
    public void setResid_regst_no(String resid_regst_no){
        this.resid_regst_no = resid_regst_no;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "cash_attnce_rt")
    public String getCash_attnce_rt(){
        return cash_attnce_rt;
    }

    @ElVoField(physicalName = "cash_attnce_rt")
    public void setCash_attnce_rt(String cash_attnce_rt){
        this.cash_attnce_rt = cash_attnce_rt;
    }

    @ElVoField(physicalName = "goods_attnce_rt")
    public String getGoods_attnce_rt(){
        return goods_attnce_rt;
    }

    @ElVoField(physicalName = "goods_attnce_rt")
    public void setGoods_attnce_rt(String goods_attnce_rt){
        this.goods_attnce_rt = goods_attnce_rt;
    }

    @ElVoField(physicalName = "tot_amt")
    public String getTot_amt(){
        return tot_amt;
    }

    @ElVoField(physicalName = "tot_amt")
    public void setTot_amt(String tot_amt){
        this.tot_amt = tot_amt;
    }

    @ElVoField(physicalName = "middle_attach_file")
    public String getMiddle_attach_file(){
        return middle_attach_file;
    }

    @ElVoField(physicalName = "middle_attach_file")
    public void setMiddle_attach_file(String middle_attach_file){
        this.middle_attach_file = middle_attach_file;
    }

    @ElVoField(physicalName = "final_attach_file")
    public String getFinal_attach_file(){
        return final_attach_file;
    }

    @ElVoField(physicalName = "final_attach_file")
    public void setFinal_attach_file(String final_attach_file){
        this.final_attach_file = final_attach_file;
    }

    @ElVoField(physicalName = "attnce_prd_orign_ymd")
    public String getAttnce_prd_orign_ymd(){
        return attnce_prd_orign_ymd;
    }

    @ElVoField(physicalName = "attnce_prd_orign_ymd")
    public void setAttnce_prd_orign_ymd(String attnce_prd_orign_ymd){
        this.attnce_prd_orign_ymd = attnce_prd_orign_ymd;
    }

    @ElVoField(physicalName = "attnce_prd_cls_ymd")
    public String getAttnce_prd_cls_ymd(){
        return attnce_prd_cls_ymd;
    }

    @ElVoField(physicalName = "attnce_prd_cls_ymd")
    public void setAttnce_prd_cls_ymd(String attnce_prd_cls_ymd){
        this.attnce_prd_cls_ymd = attnce_prd_cls_ymd;
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
        sb.append("ResInpPareVo [");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("prj_no").append("=").append(prj_no).append(",");
        sb.append("tax_nm").append("=").append(tax_nm).append(",");
        sb.append("psnexpns_clsf").append("=").append(psnexpns_clsf).append(",");
        sb.append("reschr_clsf").append("=").append(reschr_clsf).append(",");
        sb.append("inppareNm").append("=").append(inppareNm).append(",");
        sb.append("cd_nm").append("=").append(cd_nm).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("resid_regst_no").append("=").append(resid_regst_no).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("cash_attnce_rt").append("=").append(cash_attnce_rt).append(",");
        sb.append("goods_attnce_rt").append("=").append(goods_attnce_rt).append(",");
        sb.append("tot_amt").append("=").append(tot_amt).append(",");
        sb.append("middle_attach_file").append("=").append(middle_attach_file).append(",");
        sb.append("final_attach_file").append("=").append(final_attach_file).append(",");
        sb.append("attnce_prd_orign_ymd").append("=").append(attnce_prd_orign_ymd).append(",");
        sb.append("attnce_prd_cls_ymd").append("=").append(attnce_prd_cls_ymd).append(",");
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
