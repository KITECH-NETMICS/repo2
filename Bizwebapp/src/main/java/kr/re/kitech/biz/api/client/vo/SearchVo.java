package kr.re.kitech.biz.api.client.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "통합검색 결과 모델")
public class SearchVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SearchVo(){
    }

    @ElDtoField(logicalName = "성공여부", physicalName = "success", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private boolean success;

    @ElDtoField(logicalName = "메시지", physicalName = "returnMsg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String returnMsg;

    @ElDtoField(logicalName = "전체카운트", physicalName = "totalcount", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private int totalcount;

    @ElDtoField(logicalName = "카운트", physicalName = "count", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private int count;

    @ElDtoField(logicalName = "검색인덱스명", physicalName = "indexViewName", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String indexViewName;

    @ElDtoField(logicalName = "검색인덱스", physicalName = "index", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String index;

    @ElDtoField(logicalName = "검색어", physicalName = "query", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String query;

    @ElDtoField(logicalName = "결과키", physicalName = "ids", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String ids;

    @ElVoField(physicalName = "success")
    public boolean isSuccess(){
        return success;
    }

    @ElVoField(physicalName = "success")
    public void setSuccess(boolean success){
        this.success = success;
    }

    @ElVoField(physicalName = "returnMsg")
    public String getReturnMsg(){
        String ret = this.returnMsg;
        return ret;
    }

    @ElVoField(physicalName = "returnMsg")
    public void setReturnMsg(String returnMsg){
        this.returnMsg = returnMsg;
    }

    @ElVoField(physicalName = "totalcount")
    public int getTotalcount(){
        return totalcount;
    }

    @ElVoField(physicalName = "totalcount")
    public void setTotalcount(int totalcount){
        this.totalcount = totalcount;
    }

    @ElVoField(physicalName = "count")
    public int getCount(){
        return count;
    }

    @ElVoField(physicalName = "count")
    public void setCount(int count){
        this.count = count;
    }

    @ElVoField(physicalName = "indexViewName")
    public String getIndexViewName(){
        String ret = this.indexViewName;
        return ret;
    }

    @ElVoField(physicalName = "indexViewName")
    public void setIndexViewName(String indexViewName){
        this.indexViewName = indexViewName;
    }

    @ElVoField(physicalName = "index")
    public String getIndex(){
        String ret = this.index;
        return ret;
    }

    @ElVoField(physicalName = "index")
    public void setIndex(String index){
        this.index = index;
    }

    @ElVoField(physicalName = "query")
    public String getQuery(){
        String ret = this.query;
        return ret;
    }

    @ElVoField(physicalName = "query")
    public void setQuery(String query){
        this.query = query;
    }

    @ElVoField(physicalName = "ids")
    public String getIds(){
        String ret = this.ids;
        return ret;
    }

    @ElVoField(physicalName = "ids")
    public void setIds(String ids){
        this.ids = ids;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ScResultVo [");
        sb.append("success").append("=").append(success).append(",");
        sb.append("returnMsg").append("=").append(returnMsg).append(",");
        sb.append("totalcount").append("=").append(totalcount).append(",");
        sb.append("count").append("=").append(count).append(",");
        sb.append("indexViewName").append("=").append(indexViewName).append(",");
        sb.append("index").append("=").append(index).append(",");
        sb.append("query").append("=").append(query).append(",");
        sb.append("ids").append("=").append(ids);
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
