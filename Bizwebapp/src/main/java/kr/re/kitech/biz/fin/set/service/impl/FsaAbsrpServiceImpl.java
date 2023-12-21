package kr.re.kitech.biz.fin.set.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.re.kitech.biz.fin.set.dao.FsaAbsrpDAO;

/**
 * @ClassSubJect : 연구비집행내역 테이블 관련 작업
 * @Class Name : FsaAbsrpServiceImpl.java
 * @Description : 연구비집행(내부인건비, 간접비, 학생이건비 등) 관련
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.08.29.      이민기    최초생성
 * 
 * @author 작업자
 * @since 2023.08.29.
 * @version 1.0
 * @see
 * 
 */
@Service("fsaAbsrpServiceImpl")
public class FsaAbsrpServiceImpl {
  @Resource(name="fsaAbsrpDAO")
  private FsaAbsrpDAO fsaAbsrpDAO;
  
  

}

