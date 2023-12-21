package kr.re.kitech.biz.xom.core.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "공통첨부파일테이블")
public class AttachVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AttachVo(){
    }

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "순번", physicalName = "seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seq;

    @ElDtoField(logicalName = "파일명", physicalName = "file_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String file_nm;

    @ElDtoField(logicalName = "확장자", physicalName = "extens_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String extens_nm;

    @ElDtoField(logicalName = "사이즈", physicalName = "file_size", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String file_size;

    @ElDtoField(logicalName = "경로", physicalName = "path", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String path;

    @ElDtoField(logicalName = "활성여부", physicalName = "comm_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String comm_yn;

    @ElDtoField(logicalName = "etc", physicalName = "etc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String etc;

    @ElDtoField(logicalName = "파일명+확장자", physicalName = "orgFile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String orgFile;

    @ElDtoField(logicalName = "파일 풀경로", physicalName = "attachFullPath", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attachFullPath;

    @ElDtoField(logicalName = "파일키", physicalName = "fileKey", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fileKey;

    @ElDtoField(logicalName = "삭제위치", physicalName = "which", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "IMIS / IPMS")
    private String which;

    @ElDtoField(logicalName = "biz_tname", physicalName = "biz_tname", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biz_tname;

    @ElDtoField(logicalName = "biz_cname", physicalName = "biz_cname", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biz_cname;

    @ElDtoField(logicalName = "biz_knames", physicalName = "biz_knames", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biz_knames;

    @ElDtoField(logicalName = "biz_kvalues", physicalName = "biz_kvalues", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biz_kvalues;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "일반결의 결재시 필요")
    private String unslip_no;

    @ElDtoField(logicalName = "결의순번", physicalName = "unslip_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "일반결의 결재시 필요")
    private int unslip_odr;

    @ElDtoField(logicalName = "파일 Url(모바일)", physicalName = "fileUrl", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fileUrl;

    @ElDtoField(logicalName = "파일명", physicalName = "fileName", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fileName;

    @ElDtoField(logicalName = "서비스Id", physicalName = "serviceId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String serviceId;

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "seq")
    public String getSeq(){
        return seq;
    }

    @ElVoField(physicalName = "seq")
    public void setSeq(String seq){
        this.seq = seq;
    }

    @ElVoField(physicalName = "file_nm")
    public String getFile_nm(){
        return file_nm;
    }

    @ElVoField(physicalName = "file_nm")
    public void setFile_nm(String file_nm){
        this.file_nm = file_nm;
    }

    @ElVoField(physicalName = "extens_nm")
    public String getExtens_nm(){
        return extens_nm;
    }

    @ElVoField(physicalName = "extens_nm")
    public void setExtens_nm(String extens_nm){
        this.extens_nm = extens_nm;
    }

    @ElVoField(physicalName = "file_size")
    public String getFile_size(){
        return file_size;
    }

    @ElVoField(physicalName = "file_size")
    public void setFile_size(String file_size){
        this.file_size = file_size;
    }

    @ElVoField(physicalName = "path")
    public String getPath(){
        return path;
    }

    @ElVoField(physicalName = "path")
    public void setPath(String path){
        this.path = path;
    }

    @ElVoField(physicalName = "comm_yn")
    public String getComm_yn(){
        return comm_yn;
    }

    @ElVoField(physicalName = "comm_yn")
    public void setComm_yn(String comm_yn){
        this.comm_yn = comm_yn;
    }

    @ElVoField(physicalName = "etc")
    public String getEtc(){
        return etc;
    }

    @ElVoField(physicalName = "etc")
    public void setEtc(String etc){
        this.etc = etc;
    }

    @ElVoField(physicalName = "orgFile")
    public String getOrgFile(){
        return orgFile;
    }

    @ElVoField(physicalName = "orgFile")
    public void setOrgFile(String orgFile){
        this.orgFile = orgFile;
    }

    @ElVoField(physicalName = "attachFullPath")
    public String getAttachFullPath(){
        return attachFullPath;
    }

    @ElVoField(physicalName = "attachFullPath")
    public void setAttachFullPath(String attachFullPath){
        this.attachFullPath = attachFullPath;
    }

    @ElVoField(physicalName = "fileKey")
    public String getFileKey(){
        return fileKey;
    }

    @ElVoField(physicalName = "fileKey")
    public void setFileKey(String fileKey){
        this.fileKey = fileKey;
    }

    @ElVoField(physicalName = "which")
    public String getWhich(){
        return which;
    }

    @ElVoField(physicalName = "which")
    public void setWhich(String which){
        this.which = which;
    }

    @ElVoField(physicalName = "biz_tname")
    public String getBiz_tname(){
        return biz_tname;
    }

    @ElVoField(physicalName = "biz_tname")
    public void setBiz_tname(String biz_tname){
        this.biz_tname = biz_tname;
    }

    @ElVoField(physicalName = "biz_cname")
    public String getBiz_cname(){
        return biz_cname;
    }

    @ElVoField(physicalName = "biz_cname")
    public void setBiz_cname(String biz_cname){
        this.biz_cname = biz_cname;
    }

    @ElVoField(physicalName = "biz_knames")
    public String getBiz_knames(){
        return biz_knames;
    }

    @ElVoField(physicalName = "biz_knames")
    public void setBiz_knames(String biz_knames){
        this.biz_knames = biz_knames;
    }

    @ElVoField(physicalName = "biz_kvalues")
    public String getBiz_kvalues(){
        return biz_kvalues;
    }

    @ElVoField(physicalName = "biz_kvalues")
    public void setBiz_kvalues(String biz_kvalues){
        this.biz_kvalues = biz_kvalues;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "unslip_odr")
    public int getUnslip_odr(){
        return unslip_odr;
    }

    @ElVoField(physicalName = "unslip_odr")
    public void setUnslip_odr(int unslip_odr){
        this.unslip_odr = unslip_odr;
    }

    @ElVoField(physicalName = "fileUrl")
    public String getFileUrl(){
        return fileUrl;
    }

    @ElVoField(physicalName = "fileUrl")
    public void setFileUrl(String fileUrl){
        this.fileUrl = fileUrl;
    }

    @ElVoField(physicalName = "fileName")
    public String getFileName(){
        return fileName;
    }

    @ElVoField(physicalName = "fileName")
    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    @ElVoField(physicalName = "serviceId")
    public String getServiceId(){
        return serviceId;
    }

    @ElVoField(physicalName = "serviceId")
    public void setServiceId(String serviceId){
        this.serviceId = serviceId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AttachVo [");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("file_nm").append("=").append(file_nm).append(",");
        sb.append("extens_nm").append("=").append(extens_nm).append(",");
        sb.append("file_size").append("=").append(file_size).append(",");
        sb.append("path").append("=").append(path).append(",");
        sb.append("comm_yn").append("=").append(comm_yn).append(",");
        sb.append("etc").append("=").append(etc).append(",");
        sb.append("orgFile").append("=").append(orgFile).append(",");
        sb.append("attachFullPath").append("=").append(attachFullPath).append(",");
        sb.append("fileKey").append("=").append(fileKey).append(",");
        sb.append("which").append("=").append(which).append(",");
        sb.append("biz_tname").append("=").append(biz_tname).append(",");
        sb.append("biz_cname").append("=").append(biz_cname).append(",");
        sb.append("biz_knames").append("=").append(biz_knames).append(",");
        sb.append("biz_kvalues").append("=").append(biz_kvalues).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("unslip_odr").append("=").append(unslip_odr).append(",");
        sb.append("fileUrl").append("=").append(fileUrl).append(",");
        sb.append("fileName").append("=").append(fileName).append(",");
        sb.append("serviceId").append("=").append(serviceId);
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
