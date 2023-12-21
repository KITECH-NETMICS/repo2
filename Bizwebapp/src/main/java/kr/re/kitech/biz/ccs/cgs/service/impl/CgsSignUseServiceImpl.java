package kr.re.kitech.biz.ccs.cgs.service.impl;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.ccs.cgs.dao.CgsSignUseDAO;
import kr.re.kitech.biz.ccs.cgs.service.CgsSignUseService;
import kr.re.kitech.biz.ccs.cgs.vo.CgsSignUseVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.xom.core.util.MailSender;

/**
 * @ClassSubJect : 인장사용관리 serviceImpl 
 * @Class Name : cgsSignUseServiceImpl.java
 * @Description : 직인/인감 날인 신청 서비스
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.08.30.      lsh    최초생성
 * 
 * @author lsh
 * @since 2023.08.30.
 * @version 1.0
 * @see
 * 
 */
@Service("cgsSignUseServiceImpl")
public class CgsSignUseServiceImpl  extends EgovAbstractServiceImpl implements CgsSignUseService {
  @Resource(name="cgsSignUseDAO")
  private CgsSignUseDAO cgsDAO;
    
  @Resource(name="mailSender")
  private MailSender mailSender;
	
  @Resource(name="generationServiceImpl")
  private GenerationService generationService;


  /**
   * 날인신청 목록 조회
	 * 
	 * @author lsh
   * @param CgsSignUseVo
   * @return List<CgsSignUseVo>
   * @throws ElException
   * @since 2023.08.30.   
   */
  @Override
  public List<CgsSignUseVo> selectList(CgsSignUseVo vo) throws ElException {
    List<CgsSignUseVo> list = cgsDAO.selectList(vo);	
    return list;
  }


  /**
   * 날인신청 상세 조회
	 * 
	 * @author lsh
   * @param CgsSignUseVo
   * @return CgsSignUseVo
   * @throws ElException
   * @since 2023.08.30.   
   */
  @Override
  public CgsSignUseVo selectSingle(CgsSignUseVo vo) throws ElException {
    CgsSignUseVo resultVO = cgsDAO.selectSingle(vo);			
      return resultVO;
  }

  /**
   * 날인신청 등록
	 * 
	 * @author lsh
   * @param CgsSignUseVo
   * @return CgsSignUseVo
   * @throws ElException
   * @since 2023.08.30.   
   */
  @Override
  public CgsSignUseVo insertItem(CgsSignUseVo vo) throws ElException, IOException {
	CgsSignUseVo resultVo = new CgsSignUseVo();
	vo.setReq_no(generationService.getGenNumber(Numberings.DOCUMENT.getName(), "C42"));
	int result = cgsDAO.insertItem(vo);
	
	resultVo.setReq_no(vo.getReq_no());
	return resultVo;
  }

  /**
   * 날인신청 수정
	 * 
	 * @author lsh
   * @param CgsSignUseVo
   * @return int
   * @throws Exception
   * @since 2023.08.30.   
   */
  @Override
  public int updateItem(CgsSignUseVo vo) throws Exception {
  int result = cgsDAO.updateItem(vo);
	return result;
  }

  /**
   * 날인신청 삭제
	 * 
	 * @author lsh
   * @param CgsSignUseVo
   * @return int
   * @throws Exception
   * @since 2023.08.30.   
   */
  @Override
  public int deleteItem(CgsSignUseVo vo) throws Exception {
	return cgsDAO.deleteItem(vo);
  }

  /**
   * 날인신청 주소 목록 조회
	 * 
	 * @author lsh
   * @param CgsSignUseVo
   * @return CgsSignUseVo
   * @throws ElException
   * @since 2023.08.30.   
   */
  @Override
  public CgsSignUseVo selectAddr(CgsSignUseVo vo) throws ElException {
    CgsSignUseVo resultVO = cgsDAO.selectListAddr(vo);			
      return resultVO;
  }

  /**
   * 날인신청관리 목록 조회
	 * 
	 * @author lsh
   * @param CgsSignUseVo
   * @return List<CgsSignUseVo>
   * @throws ElException
   * @since 2023.08.30.   
   */
  @Override
  public List<CgsSignUseVo> selectListMnt(CgsSignUseVo vo) throws ElException {
	  List<CgsSignUseVo> list = cgsDAO.selectListMnt(vo);	
	  return list;
  }
  
  /**
   * 날인신청관리 수정
	 * 
	 * @author lsh
   * @param CgsSignUseVo
   * @return int
   * @throws Exception
   * @since 2023.08.30.   
   */
  @Override
  public int updateItemMnt(List<CgsSignUseVo> listVo) throws Exception {
	  int result = 0;
	  
	  for(CgsSignUseVo vo : listVo){
		  result += cgsDAO.updateItemMnt(vo);
	  }
	  
	  return result;
  }
}
