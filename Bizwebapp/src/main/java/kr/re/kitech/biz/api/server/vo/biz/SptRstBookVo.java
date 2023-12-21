package kr.re.kitech.biz.api.server.vo.biz;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "시험성적서 Vo")
public class SptRstBookVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptRstBookVo(){
    }

    @ElDtoField(logicalName = "신청서번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "갑지생성여부", physicalName = "blackacre_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String blackacre_clsf;

    @ElDtoField(logicalName = "전체페이지수", physicalName = "file_tot_page_num", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int file_tot_page_num;

    @ElDtoField(logicalName = "기술지원접수번호", physicalName = "tech_supt_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_supt_req_no;

    @ElDtoField(logicalName = "기술지원순번", physicalName = "seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int seq;

    @ElDtoField(logicalName = "성적서 발행구분", physicalName = "rst_book_issu_fg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rst_book_issu_fg;

    @ElDtoField(logicalName = "mis_pk", physicalName = "mis_pk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mis_pk;

    @ElDtoField(logicalName = "전체페이지수", physicalName = "tot_page", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_page;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "blackacre_clsf")
    public String getBlackacre_clsf(){
        return blackacre_clsf;
    }

    @ElVoField(physicalName = "blackacre_clsf")
    public void setBlackacre_clsf(String blackacre_clsf){
        this.blackacre_clsf = blackacre_clsf;
    }

    @ElVoField(physicalName = "file_tot_page_num")
    public int getFile_tot_page_num(){
        return file_tot_page_num;
    }

    @ElVoField(physicalName = "file_tot_page_num")
    public void setFile_tot_page_num(int file_tot_page_num){
        this.file_tot_page_num = file_tot_page_num;
    }

    @ElVoField(physicalName = "tech_supt_req_no")
    public String getTech_supt_req_no(){
        return tech_supt_req_no;
    }

    @ElVoField(physicalName = "tech_supt_req_no")
    public void setTech_supt_req_no(String tech_supt_req_no){
        this.tech_supt_req_no = tech_supt_req_no;
    }

    @ElVoField(physicalName = "seq")
    public int getSeq(){
        return seq;
    }

    @ElVoField(physicalName = "seq")
    public void setSeq(int seq){
        this.seq = seq;
    }

    @ElVoField(physicalName = "rst_book_issu_fg")
    public String getRst_book_issu_fg(){
        return rst_book_issu_fg;
    }

    @ElVoField(physicalName = "rst_book_issu_fg")
    public void setRst_book_issu_fg(String rst_book_issu_fg){
        this.rst_book_issu_fg = rst_book_issu_fg;
    }

    @ElVoField(physicalName = "mis_pk")
    public String getMis_pk(){
        return mis_pk;
    }

    @ElVoField(physicalName = "mis_pk")
    public void setMis_pk(String mis_pk){
        this.mis_pk = mis_pk;
    }

    @ElVoField(physicalName = "tot_page")
    public String getTot_page(){
        return tot_page;
    }

    @ElVoField(physicalName = "tot_page")
    public void setTot_page(String tot_page){
        this.tot_page = tot_page;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptRstBookVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("blackacre_clsf").append("=").append(blackacre_clsf).append(",");
        sb.append("file_tot_page_num").append("=").append(file_tot_page_num).append(",");
        sb.append("tech_supt_req_no").append("=").append(tech_supt_req_no).append(",");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("rst_book_issu_fg").append("=").append(rst_book_issu_fg).append(",");
        sb.append("mis_pk").append("=").append(mis_pk).append(",");
        sb.append("tot_page").append("=").append(tot_page);
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
