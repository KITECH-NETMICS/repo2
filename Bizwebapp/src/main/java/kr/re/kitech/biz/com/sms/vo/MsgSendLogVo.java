package kr.re.kitech.biz.com.sms.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "MsgSendLogExp")
public class MsgSendLogVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public MsgSendLogVo(){
  }

  @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String syspayno;

  @ElDtoField(logicalName = "msgType", physicalName = "msg_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String msg_type;

  @ElDtoField(logicalName = "subject", physicalName = "subject", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String subject;

  @ElDtoField(logicalName = "msgBody", physicalName = "msg_body", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String msg_body;

  @ElDtoField(logicalName = "time", physicalName = "time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String time;

  @ElDtoField(logicalName = "startYmd", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String start_ymd;

  @ElDtoField(logicalName = "closeYmd", physicalName = "close_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String close_ymd;

  @ElDtoField(logicalName = "sys", physicalName = "sys", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String sys;

  @ElDtoField(logicalName = "seqNo", physicalName = "seq_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String seq_no;

  @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String nm;

  @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String empno;

  @ElDtoField(logicalName = "isSuccess", physicalName = "is_success", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String is_success;

  @ElDtoField(logicalName = "cmid", physicalName = "cmid", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String cmid;

  @ElDtoField(logicalName = "destPhone", physicalName = "dest_phone", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String dest_phone;

  @ElDtoField(logicalName = "destName", physicalName = "dest_name", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String dest_name;

  @ElDtoField(logicalName = "destSyspayno", physicalName = "dest_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String dest_syspayno;

  @ElDtoField(logicalName = "sendTime", physicalName = "send_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String send_time;

  @ElDtoField(logicalName = "sendPhone", physicalName = "send_phone", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String send_phone;

  @ElDtoField(logicalName = "sendName", physicalName = "send_name", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String send_name;

  @ElDtoField(logicalName = "sendSyspayno", physicalName = "send_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String send_syspayno;

  @ElDtoField(logicalName = "businessYn", physicalName = "business_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String business_yn;

  @ElDtoField(logicalName = "templateCode", physicalName = "template_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String template_code;

  @ElDtoField(logicalName = "reType", physicalName = "re_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String re_type;

  @ElVoField(physicalName = "syspayno")
  public String getSyspayno(){
      return syspayno;
  }

  @ElVoField(physicalName = "syspayno")
  public void setSyspayno(String syspayno){
      this.syspayno = syspayno;
  }

  @ElVoField(physicalName = "msg_type")
  public String getMsg_type(){
      return msg_type;
  }

  @ElVoField(physicalName = "msg_type")
  public void setMsg_type(String msg_type){
      this.msg_type = msg_type;
  }

  @ElVoField(physicalName = "subject")
  public String getSubject(){
      return subject;
  }

  @ElVoField(physicalName = "subject")
  public void setSubject(String subject){
      this.subject = subject;
  }

  @ElVoField(physicalName = "msg_body")
  public String getMsg_body(){
      return msg_body;
  }

  @ElVoField(physicalName = "msg_body")
  public void setMsg_body(String msg_body){
      this.msg_body = msg_body;
  }

  @ElVoField(physicalName = "time")
  public String getTime(){
      return time;
  }

  @ElVoField(physicalName = "time")
  public void setTime(String time){
      this.time = time;
  }

  @ElVoField(physicalName = "start_ymd")
  public String getStart_ymd(){
      return start_ymd;
  }

  @ElVoField(physicalName = "start_ymd")
  public void setStart_ymd(String start_ymd){
      this.start_ymd = start_ymd;
  }

  @ElVoField(physicalName = "close_ymd")
  public String getClose_ymd(){
      return close_ymd;
  }

  @ElVoField(physicalName = "close_ymd")
  public void setClose_ymd(String close_ymd){
      this.close_ymd = close_ymd;
  }

  @ElVoField(physicalName = "sys")
  public String getSys(){
      return sys;
  }

  @ElVoField(physicalName = "sys")
  public void setSys(String sys){
      this.sys = sys;
  }

  @ElVoField(physicalName = "seq_no")
  public String getSeq_no(){
      return seq_no;
  }

  @ElVoField(physicalName = "seq_no")
  public void setSeq_no(String seq_no){
      this.seq_no = seq_no;
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

  @ElVoField(physicalName = "is_success")
  public String getIs_success(){
      return is_success;
  }

  @ElVoField(physicalName = "is_success")
  public void setIs_success(String is_success){
      this.is_success = is_success;
  }

  @ElVoField(physicalName = "cmid")
  public String getCmid(){
      return cmid;
  }

  @ElVoField(physicalName = "cmid")
  public void setCmid(String cmid){
      this.cmid = cmid;
  }

  @ElVoField(physicalName = "dest_phone")
  public String getDest_phone(){
      return dest_phone;
  }

  @ElVoField(physicalName = "dest_phone")
  public void setDest_phone(String dest_phone){
      this.dest_phone = dest_phone;
  }

  @ElVoField(physicalName = "dest_name")
  public String getDest_name(){
      return dest_name;
  }

  @ElVoField(physicalName = "dest_name")
  public void setDest_name(String dest_name){
      this.dest_name = dest_name;
  }

  @ElVoField(physicalName = "dest_syspayno")
  public String getDest_syspayno(){
      return dest_syspayno;
  }

  @ElVoField(physicalName = "dest_syspayno")
  public void setDest_syspayno(String dest_syspayno){
      this.dest_syspayno = dest_syspayno;
  }

  @ElVoField(physicalName = "send_time")
  public String getSend_time(){
      return send_time;
  }

  @ElVoField(physicalName = "send_time")
  public void setSend_time(String send_time){
      this.send_time = send_time;
  }

  @ElVoField(physicalName = "send_phone")
  public String getSend_phone(){
      return send_phone;
  }

  @ElVoField(physicalName = "send_phone")
  public void setSend_phone(String send_phone){
      this.send_phone = send_phone;
  }

  @ElVoField(physicalName = "send_name")
  public String getSend_name(){
      return send_name;
  }

  @ElVoField(physicalName = "send_name")
  public void setSend_name(String send_name){
      this.send_name = send_name;
  }

  @ElVoField(physicalName = "send_syspayno")
  public String getSend_syspayno(){
      return send_syspayno;
  }

  @ElVoField(physicalName = "send_syspayno")
  public void setSend_syspayno(String send_syspayno){
      this.send_syspayno = send_syspayno;
  }

  @ElVoField(physicalName = "business_yn")
  public String getBusiness_yn(){
      return business_yn;
  }

  @ElVoField(physicalName = "business_yn")
  public void setBusiness_yn(String business_yn){
      this.business_yn = business_yn;
  }

  @ElVoField(physicalName = "template_code")
  public String getTemplate_code(){
      return template_code;
  }

  @ElVoField(physicalName = "template_code")
  public void setTemplate_code(String template_code){
      this.template_code = template_code;
  }

  @ElVoField(physicalName = "re_type")
  public String getRe_type(){
      return re_type;
  }

  @ElVoField(physicalName = "re_type")
  public void setRe_type(String re_type){
      this.re_type = re_type;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("MsgSendLogVo [");
      sb.append("syspayno").append("=").append(syspayno).append(",");
      sb.append("msg_type").append("=").append(msg_type).append(",");
      sb.append("subject").append("=").append(subject).append(",");
      sb.append("msg_body").append("=").append(msg_body).append(",");
      sb.append("time").append("=").append(time).append(",");
      sb.append("start_ymd").append("=").append(start_ymd).append(",");
      sb.append("close_ymd").append("=").append(close_ymd).append(",");
      sb.append("sys").append("=").append(sys).append(",");
      sb.append("seq_no").append("=").append(seq_no).append(",");
      sb.append("nm").append("=").append(nm).append(",");
      sb.append("empno").append("=").append(empno).append(",");
      sb.append("is_success").append("=").append(is_success).append(",");
      sb.append("cmid").append("=").append(cmid).append(",");
      sb.append("dest_phone").append("=").append(dest_phone).append(",");
      sb.append("dest_name").append("=").append(dest_name).append(",");
      sb.append("dest_syspayno").append("=").append(dest_syspayno).append(",");
      sb.append("send_time").append("=").append(send_time).append(",");
      sb.append("send_phone").append("=").append(send_phone).append(",");
      sb.append("send_name").append("=").append(send_name).append(",");
      sb.append("send_syspayno").append("=").append(send_syspayno).append(",");
      sb.append("business_yn").append("=").append(business_yn).append(",");
      sb.append("template_code").append("=").append(template_code).append(",");
      sb.append("re_type").append("=").append(re_type);
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