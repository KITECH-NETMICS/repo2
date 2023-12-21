package kr.re.kitech.biz.pat.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "포기신청 Vo")
public class PatGiveUpVo extends kr.re.kitech.biz.pat.app.vo.PatComVo {
    private static final long serialVersionUID = 1L;

    public PatGiveUpVo(){
    }

    @ElDtoField(logicalName = "포기신청번호", physicalName = "giveup_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String giveup_req_no;

    @ElDtoField(logicalName = "일괄포기신청여부", physicalName = "multi_app_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String multi_app_yn;

    @ElDtoField(logicalName = "TODO ID", physicalName = "todo_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String todo_id;

    @ElDtoField(logicalName = "업무번호", physicalName = "work_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_id;

    @ElVoField(physicalName = "giveup_req_no")
    public String getGiveup_req_no(){
        return giveup_req_no;
    }

    @ElVoField(physicalName = "giveup_req_no")
    public void setGiveup_req_no(String giveup_req_no){
        this.giveup_req_no = giveup_req_no;
    }

    @ElVoField(physicalName = "multi_app_yn")
    public String getMulti_app_yn(){
        return multi_app_yn;
    }

    @ElVoField(physicalName = "multi_app_yn")
    public void setMulti_app_yn(String multi_app_yn){
        this.multi_app_yn = multi_app_yn;
    }

    @ElVoField(physicalName = "todo_id")
    public String getTodo_id(){
        return todo_id;
    }

    @ElVoField(physicalName = "todo_id")
    public void setTodo_id(String todo_id){
        this.todo_id = todo_id;
    }

    @ElVoField(physicalName = "work_id")
    public String getWork_id(){
        return work_id;
    }

    @ElVoField(physicalName = "work_id")
    public void setWork_id(String work_id){
        this.work_id = work_id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatGiveUpVo [");
        sb.append("giveup_req_no").append("=").append(giveup_req_no).append(",");
        sb.append("multi_app_yn").append("=").append(multi_app_yn).append(",");
        sb.append("todo_id").append("=").append(todo_id).append(",");
        sb.append("work_id").append("=").append(work_id);
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
