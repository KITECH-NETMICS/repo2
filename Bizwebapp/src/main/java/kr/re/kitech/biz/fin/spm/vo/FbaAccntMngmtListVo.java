package kr.re.kitech.biz.fin.spm.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "결의생성 회계코드별 관리항목 리스트 조회")
public class FbaAccntMngmtListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FbaAccntMngmtListVo(){
    }

    @ElDtoField(logicalName = "회계코드별관리항목Vo ", physicalName = "mngmtVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.std.vo.FbaAccntMngmtVo> mngmtVo;

    @ElVoField(physicalName = "mngmtVo")
    public java.util.List<kr.re.kitech.biz.fin.std.vo.FbaAccntMngmtVo> getMngmtVo(){
        return mngmtVo;
    }

    @ElVoField(physicalName = "mngmtVo")
    public void setMngmtVo(java.util.List<kr.re.kitech.biz.fin.std.vo.FbaAccntMngmtVo> mngmtVo){
        this.mngmtVo = mngmtVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FbaAccntMngmtListVo [");
        sb.append("mngmtVo").append("=").append(mngmtVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; mngmtVo != null && i < mngmtVo.size() ; i++ ) {
            kr.re.kitech.biz.fin.std.vo.FbaAccntMngmtVo vo = (kr.re.kitech.biz.fin.std.vo.FbaAccntMngmtVo)mngmtVo.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; mngmtVo != null && i < mngmtVo.size() ; i++ ) {
            kr.re.kitech.biz.fin.std.vo.FbaAccntMngmtVo vo = (kr.re.kitech.biz.fin.std.vo.FbaAccntMngmtVo)mngmtVo.get(i);
            vo._xStreamDec();	 
        }
    }


}
