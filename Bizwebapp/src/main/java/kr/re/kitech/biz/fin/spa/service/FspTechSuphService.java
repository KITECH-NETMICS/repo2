package kr.re.kitech.biz.fin.spa.service;

import java.util.List;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.fin.spa.vo.FspTechSupMVo;
import kr.re.kitech.biz.fin.spa.vo.FspTechSuphExcelVo;
import kr.re.kitech.biz.fin.spa.vo.FspTechSuphVo;

public interface FspTechSuphService {
  

  /**
    * 내부장비활용 목록 조회
    * @author 
    * @since 2023.10.25.
    */
  public List<FspTechSuphVo> selectList(FspTechSuphVo vo) throws ElException;
  
  /**
    * 내부장비활용 액셀 상세 조회
    * @author 
    * @since 2023.10.25.
    */
  public List<FspTechSuphExcelVo> selectList2(FspTechSuphExcelVo vo) throws ElException;  

  /**
    * 내부장비활용 상세 조회
    * @author 
    * @since 2023.10.26.
    */
  public FspTechSupMVo selectSingle(FspTechSuphVo vo) throws ElException;

  /**
    * 내부장비활용(유상) 신청 등록
    * @author 
    * @since 2023.10.27.
    */
  public FspTechSuphVo insertItem(FspTechSupMVo vo) throws Exception;
  
  /**
    * 관리자 저장
    * @author 
    * @since 2023.10.30.
    */
  public FspTechSuphVo adminSave(FspTechSupMVo vo) throws Exception;
  
  /**
    * 내부장비활용(유상) 삭제
    * @author 
    * @since 2023.10.30.
    */
  public void deleteItem(FspTechSupMVo vo) throws Exception;     

}
