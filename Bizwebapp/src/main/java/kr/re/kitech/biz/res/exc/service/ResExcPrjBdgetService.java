package kr.re.kitech.biz.res.exc.service;

import java.util.List;

import kr.re.kitech.biz.res.exc.vo.ResExcPrjBdgetInfoVo;
import kr.re.kitech.biz.res.exc.vo.ResExcPrjBdgetVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : ResExcPrjBdgetService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.24.     김상미	    최초생성
 * 
 * @author 김상미
 * @since 2023.10.24.
 * @version 1.0
 * @see
 * 
 */
public interface ResExcPrjBdgetService {
	
	/**
	 * PX프로젝트 계정 실행예산 편성 계정 목록 조회
	 * 
	 * @author 김상미
	 * @param ResExcPrjBdgetInfoVo
	 * @return List<ResExcPrjBudgetVo>
	 * @throws KitechException
	 * @since 2023.10.24.   
	 */
	public List<ResExcPrjBdgetInfoVo> selectResExcPrjBdgetList(ResExcPrjBdgetInfoVo vo) throws KitechException;
	
	/**
	 * 프로젝트예산편성 조회
	 * 
	 * @author 김상미
	 * @param ResExcPrjBdgetInfoVo
	 * @return ResExcPrjBdgetVo
	 * @throws KitechException
	 * @since 2023.10.24.   
	 */
	public ResExcPrjBdgetVo selectPrjAccntBugtDetail(ResExcPrjBdgetInfoVo vo) throws KitechException;

	/**
	 * 신청번호로 계정번호조회
	 * 
	 * @author 김상미
	 * @param ResExcPrjBdgetInfoVo
	 * @return ResExcPrjBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.24.   
	 */ 
	public ResExcPrjBdgetInfoVo selectAccntNoByReqNo(ResExcPrjBdgetInfoVo vo) throws KitechException;
		
	/**
	 * 계정별 대비목/세부비목에 대한 차수별 실행예산 내역 조회
	 * 
	 * @author 김상미
	 * @param ResExcPrjBdgetInfoVo
	 * @return List<ResExcPrjBdgetVo>
	 * @throws KitechException
	 * @since 2023.10.24.   
	 */ 
	public List<ResExcPrjBdgetVo> selectResPrjAccntBugt(ResExcPrjBdgetInfoVo vo) throws KitechException;

	/**
	 * 프로젝트얘산편셩 변경 등록
	 * 
	 * @author 김상미
	 * @param ResExcPrjBdgetInfoVo
	 * @return ResExcPrjBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.24.   
	 */ 
	public ResExcPrjBdgetInfoVo saveResExcPrjBdgetData(ResExcPrjBdgetVo vo) throws KitechException;
	
	/**
	 * 프로젝트얘산편셩 결제 신청
     *
     * @author 김상미
     * @param  ResExcPrjBdgetVo
     * @return ResExcPrjBdgetInfoVo
     * @throws KitechException
	 * @since 2023.10.24. 
	 */
	public ResExcPrjBdgetInfoVo saveResExcPrjBdgetApr(ResExcPrjBdgetVo vo) throws KitechException;
	
	/**
	 * 이월금변경
     *
     * @author 김상미
     * @param  ResExcPrjBdgetInfoVo
     * @throws KitechException
	 * @since 2023.10.24. 
	 */ 
	public void updateCryfwdAmt(ResExcPrjBdgetInfoVo vo) throws KitechException;
	
	/**
	 * 프로젝트얘산편성 결재 정보 삭제
     *
     * @author 김상미
     * @param  ResExcPrjBdgetInfoVo
     * @throws KitechException
	 * @since 2023.10.24. 
	 */
	public void deleteResExcPrjBdgetApr(ResExcPrjBdgetInfoVo vo) throws KitechException;
		

	/**
	 * 프로젝트얘산편성 결재 정보 삭제
     *
     * @author 김상미
     * @param  ResExcPrjBdgetInfoVo
     * @throws KitechException
	 * @since 2023.10.24. 
	 */	
	public void saveBugtAplyPrcs(ResExcPrjBdgetInfoVo vo) throws KitechException;
	
}
  