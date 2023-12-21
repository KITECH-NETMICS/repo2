package kr.re.kitech.biz.pat.chr.service;

import java.util.List;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.pat.chr.vo.PatRightmntVo;

public interface PatRightmntService {
  
  /**
    * 권리유지내역 다건 조회
    * @author 
    * @since 2023.08.02.
    */
  public List<PatRightmntVo> selectList(PatRightmntVo vo) throws ElException;

}
