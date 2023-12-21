package kr.re.kitech.biz.epu.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "구매요구 공고상태리스트 Vo")
public class PurReqNotiStatusVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PurReqNotiStatusVo(){
    }

    @ElDtoField(logicalName = "구매요구번호", physicalName = "pur_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_req_no;

    @ElDtoField(logicalName = "공고번호", physicalName = "bid_noti_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_noti_no;

    @ElDtoField(logicalName = "공고차수", physicalName = "chg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chg_no;

    @ElDtoField(logicalName = "진행상태", physicalName = "progress_status", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String progress_status;

    @ElDtoField(logicalName = "품명", physicalName = "item_gdnm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_gdnm;

    @ElVoField(physicalName = "pur_req_no")
    public String getPur_req_no(){
        return pur_req_no;
    }

    @ElVoField(physicalName = "pur_req_no")
    public void setPur_req_no(String pur_req_no){
        this.pur_req_no = pur_req_no;
    }

    @ElVoField(physicalName = "bid_noti_no")
    public String getBid_noti_no(){
        return bid_noti_no;
    }

    @ElVoField(physicalName = "bid_noti_no")
    public void setBid_noti_no(String bid_noti_no){
        this.bid_noti_no = bid_noti_no;
    }

    @ElVoField(physicalName = "chg_no")
    public String getChg_no(){
        return chg_no;
    }

    @ElVoField(physicalName = "chg_no")
    public void setChg_no(String chg_no){
        this.chg_no = chg_no;
    }

    @ElVoField(physicalName = "progress_status")
    public String getProgress_status(){
        return progress_status;
    }

    @ElVoField(physicalName = "progress_status")
    public void setProgress_status(String progress_status){
        this.progress_status = progress_status;
    }

    @ElVoField(physicalName = "item_gdnm")
    public String getItem_gdnm(){
        return item_gdnm;
    }

    @ElVoField(physicalName = "item_gdnm")
    public void setItem_gdnm(String item_gdnm){
        this.item_gdnm = item_gdnm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurReqNotiStatusVo [");
        sb.append("pur_req_no").append("=").append(pur_req_no).append(",");
        sb.append("bid_noti_no").append("=").append(bid_noti_no).append(",");
        sb.append("chg_no").append("=").append(chg_no).append(",");
        sb.append("progress_status").append("=").append(progress_status).append(",");
        sb.append("item_gdnm").append("=").append(item_gdnm);
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
