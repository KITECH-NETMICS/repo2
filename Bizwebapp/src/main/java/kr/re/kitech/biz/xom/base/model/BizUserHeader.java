package kr.re.kitech.biz.xom.base.model;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.log.AppLog;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "Y", delimeterYn = "", logicalName = "공통 헤더 VO")
public class BizUserHeader extends com.inswave.elfw.core.UserHeader {
    private static final long serialVersionUID = 1L;

    private int _offset;

    public BizUserHeader(){
        this._offset = 0;
    }

    public BizUserHeader(int iOffset){
        this._offset = iOffset;
    }

    @ElDtoField(logicalName = "전문길이", physicalName = "fldLen", type = "int", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 10, dotLen = 0, baseValue = "", desc = "", attr = "")
    private int fldLen;

    @ElDtoField(logicalName = "서비스ID", physicalName = "svcId", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 20, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String svcId;

    @ElDtoField(logicalName = "전문입력ID", physicalName = "inInfId", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 30, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String inInfId;

    @ElDtoField(logicalName = "전문출력ID", physicalName = "outInfId", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 30, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String outInfId;

    @ElDtoField(logicalName = "성공실패여부", physicalName = "sucYn", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 1, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String sucYn;

    @ElDtoField(logicalName = "에러구분", physicalName = "errType", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String errType;

    @ElDtoField(logicalName = "에러종류", physicalName = "errKind", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String errKind;

    @ElDtoField(logicalName = "에러코드", physicalName = "errCode", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 30, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String errCode;

    @ElDtoField(logicalName = "에러메시지", physicalName = "errMag", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 100, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String errMag;

    @ElDtoField(logicalName = "에러업무", physicalName = "errBusiness", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String errBusiness;

    @ElDtoField(logicalName = "로케일", physicalName = "locale", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 10, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String locale;

    @ElDtoField(logicalName = "화면서비스ID(LDAP)", physicalName = "serviceId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String serviceId;

    @ElDtoField(logicalName = "엑셀서비스여부", physicalName = "excel", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private boolean excel;

    @ElDtoField(logicalName = "엑셀구현여부", physicalName = "implExcel", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "false", desc = "", attr = "")
    private boolean implExcel = false;

    @ElDtoField(logicalName = "모바일호출여부", physicalName = "mbiSvc", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "false", desc = "", attr = "")
    private boolean mbiSvc = false;

    @ElDtoField(logicalName = "BPM캔슬키", physicalName = "bpmCancelKey", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String bpmCancelKey;

    @ElDtoField(logicalName = "Session 유저 헤더", physicalName = "session", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private kr.re.kitech.biz.xom.base.model.SessionUserHeader session;

    @ElVoField(physicalName = "fldLen")
    public int getFldLen(){
        return fldLen;
    }

    @ElVoField(physicalName = "fldLen")
    public void setFldLen(int fldLen){
        this.fldLen = fldLen;
    }

    @ElVoField(physicalName = "svcId")
    public String getSvcId(){
        String ret = this.svcId;
        return ret;
    }

    @ElVoField(physicalName = "svcId")
    public void setSvcId(String svcId){
        this.svcId = svcId;
    }

    @ElVoField(physicalName = "inInfId")
    public String getInInfId(){
        String ret = this.inInfId;
        return ret;
    }

    @ElVoField(physicalName = "inInfId")
    public void setInInfId(String inInfId){
        this.inInfId = inInfId;
    }

    @ElVoField(physicalName = "outInfId")
    public String getOutInfId(){
        String ret = this.outInfId;
        return ret;
    }

    @ElVoField(physicalName = "outInfId")
    public void setOutInfId(String outInfId){
        this.outInfId = outInfId;
    }

    @ElVoField(physicalName = "sucYn")
    public String getSucYn(){
        String ret = this.sucYn;
        return ret;
    }

    @ElVoField(physicalName = "sucYn")
    public void setSucYn(String sucYn){
        this.sucYn = sucYn;
    }

    @ElVoField(physicalName = "errType")
    public String getErrType(){
        String ret = this.errType;
        return ret;
    }

    @ElVoField(physicalName = "errType")
    public void setErrType(String errType){
        this.errType = errType;
    }

    @ElVoField(physicalName = "errKind")
    public String getErrKind(){
        String ret = this.errKind;
        return ret;
    }

    @ElVoField(physicalName = "errKind")
    public void setErrKind(String errKind){
        this.errKind = errKind;
    }

    @ElVoField(physicalName = "errCode")
    public String getErrCode(){
        String ret = this.errCode;
        return ret;
    }

    @ElVoField(physicalName = "errCode")
    public void setErrCode(String errCode){
        this.errCode = errCode;
    }

    @ElVoField(physicalName = "errMag")
    public String getErrMag(){
        String ret = this.errMag;
        return ret;
    }

    @ElVoField(physicalName = "errMag")
    public void setErrMag(String errMag){
        this.errMag = errMag;
    }

    @ElVoField(physicalName = "errBusiness")
    public String getErrBusiness(){
        String ret = this.errBusiness;
        return ret;
    }

    @ElVoField(physicalName = "errBusiness")
    public void setErrBusiness(String errBusiness){
        this.errBusiness = errBusiness;
    }

    @ElVoField(physicalName = "locale")
    public String getLocale(){
        String ret = this.locale;
        return ret;
    }

    @ElVoField(physicalName = "locale")
    public void setLocale(String locale){
        this.locale = locale;
    }

    @ElVoField(physicalName = "serviceId")
    public String getServiceId(){
        String ret = this.serviceId;
        return ret;
    }

    @ElVoField(physicalName = "serviceId")
    public void setServiceId(String serviceId){
        this.serviceId = serviceId;
    }

    @ElVoField(physicalName = "excel")
    public boolean isExcel(){
        return excel;
    }

    @ElVoField(physicalName = "excel")
    public void setExcel(boolean excel){
        this.excel = excel;
    }

    @ElVoField(physicalName = "implExcel")
    public boolean isImplExcel(){
        return implExcel;
    }

    @ElVoField(physicalName = "implExcel")
    public void setImplExcel(boolean implExcel){
        this.implExcel = implExcel;
    }

    @ElVoField(physicalName = "mbiSvc")
    public boolean isMbiSvc(){
        return mbiSvc;
    }

    @ElVoField(physicalName = "mbiSvc")
    public void setMbiSvc(boolean mbiSvc){
        this.mbiSvc = mbiSvc;
    }

    @ElVoField(physicalName = "bpmCancelKey")
    public String getBpmCancelKey(){
        String ret = this.bpmCancelKey;
        return ret;
    }

    @ElVoField(physicalName = "bpmCancelKey")
    public void setBpmCancelKey(String bpmCancelKey){
        this.bpmCancelKey = bpmCancelKey;
    }

    @ElVoField(physicalName = "session")
    public kr.re.kitech.biz.xom.base.model.SessionUserHeader getSession(){
        return session;
    }

    @ElVoField(physicalName = "session")
    public void setSession(kr.re.kitech.biz.xom.base.model.SessionUserHeader session){
        this.session = session;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BizUserHeader [");
        sb.append("fldLen").append("=").append(fldLen).append(",");
        sb.append("svcId").append("=").append(svcId).append(",");
        sb.append("inInfId").append("=").append(inInfId).append(",");
        sb.append("outInfId").append("=").append(outInfId).append(",");
        sb.append("sucYn").append("=").append(sucYn).append(",");
        sb.append("errType").append("=").append(errType).append(",");
        sb.append("errKind").append("=").append(errKind).append(",");
        sb.append("errCode").append("=").append(errCode).append(",");
        sb.append("errMag").append("=").append(errMag).append(",");
        sb.append("errBusiness").append("=").append(errBusiness).append(",");
        sb.append("locale").append("=").append(locale).append(",");
        sb.append("serviceId").append("=").append(serviceId).append(",");
        sb.append("excel").append("=").append(excel).append(",");
        sb.append("implExcel").append("=").append(implExcel).append(",");
        sb.append("mbiSvc").append("=").append(mbiSvc).append(",");
        sb.append("bpmCancelKey").append("=").append(bpmCancelKey).append(",");
        sb.append("session").append("=").append(session);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return true;
    }

    public byte[] marshalFld() throws IOException{
        return marshalFld( com.inswave.elfw.ElConfig.getFldEncode() ); 
    }

	public byte[] marshalFld(String encode) throws IOException{
    	ByteArrayOutputStream bout = new ByteArrayOutputStream();
        DataOutputStream out = null;
        try {
            out = new DataOutputStream(bout);
            out.write( com.inswave.elfw.util.TypeConversionUtil.intToBytes(this.fldLen , 10) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.strToSpBytes(this.svcId , 20, encode ) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.strToSpBytes(this.inInfId , 30, encode ) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.strToSpBytes(this.outInfId , 30, encode ) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.strToSpBytes(this.sucYn , 1, encode ) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.strToSpBytes(this.errCode , 30, encode ) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.strToSpBytes(this.errMag , 100, encode ) );
            out.write( com.inswave.elfw.util.TypeConversionUtil.strToSpBytes(this.locale , 10, encode ) );
        } catch (IOException e) {
                AppLog.error("marshalFld Error:["+ toString()+"]", e);
                throw e;
        } finally {
            try	{
                if (out != null) out.close();
           } catch (IOException ie) {
                AppLog.error("marshalFld out close Error", ie);
           }
            try	{
                if (bout != null) bout.close();
           } catch (IOException ie) {
                AppLog.error("marshalFld bout close Error", ie);
           }
        }
        return bout.toByteArray();
    }

    public void unMarshalFld( byte[] bytes ) throws ElException{
        unMarshalFld( bytes, com.inswave.elfw.ElConfig.getFldEncode() ); 
    }

    public void unMarshalFld( byte[] bytes , String encode) throws ElException{
        try{ 
             this.fldLen = com.inswave.elfw.util.TypeConversionUtil.bytesToInt( bytes, _offset, 10, encode );
             _offset += 10;
            this.svcId = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, _offset, 20, encode );
             _offset += 20;
            this.inInfId = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, _offset, 30, encode );
             _offset += 30;
            this.outInfId = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, _offset, 30, encode );
             _offset += 30;
            this.sucYn = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, _offset, 1, encode );
             _offset += 1;
            this.errCode = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, _offset, 30, encode );
             _offset += 30;
            this.errMag = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, _offset, 100, encode );
             _offset += 100;
            this.locale = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, _offset, 10, encode );
             _offset += 10;
        }catch(ElException e) { 
            String errorLine = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, 0, bytes.length, encode );
            AppLog.error("unMarshalFld Error:["+ errorLine+"]", e);
            throw e;
        } 
    }

    public int getOffset(){
        return _offset;
    }

    public int getFixedTotalLength(){
        return 231;
    }

    @Override
    public void _xStreamEnc() {
        if( this.session != null ) this.session._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        if( this.session != null ) this.session._xStreamDec();
    }


}
