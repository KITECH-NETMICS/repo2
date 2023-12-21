package kr.re.kitech.biz.res.exc.service;

import java.util.List;

import kr.re.kitech.biz.res.exc.vo.ResExcExeBdgetInfoVo;
import kr.re.kitech.biz.res.exc.vo.ResExcExeBdgetVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : ResExcExeBdgetService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.16.     김상미           최초생성
 * 
 * @author 김상미
 * @since 2023.10.16.
 * @version 1.0
 * @see
 * 
 */
public interface ResExcExeBdgetService {
	
	/**
	 * 실행예산편성관리 목록 조회
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return List<ResExcExeBdgetInfoVo>
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public List<ResExcExeBdgetInfoVo> selectResExcExeBdgetList(ResExcExeBdgetInfoVo vo) throws KitechException;
	
	/**
	 * 실행예산(계정) 내역 조회 
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public ResExcExeBdgetInfoVo selectResExcBdgetAcctm(ResExcExeBdgetInfoVo vo) throws KitechException;

	/**
	 * 실행예산신청번호를 가지고 과제번호,계정번호 조회 
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public ResExcExeBdgetInfoVo selectResExcBdgetPrjAccntNoByReqNo(ResExcExeBdgetInfoVo vo) throws KitechException;
	
	/**
	 * 계정별 실행예산상태, 실행예산차수 MAX, 계정상태 조회
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public ResExcExeBdgetVo selectResExcBdgetState(ResExcExeBdgetInfoVo vo) throws KitechException;

	/**
	 * 계정별 대비목/세부비목에 대한 차수별 실행예산 내역 조회
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return List<ResExcExeBdgetInfoVo>
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public List<ResExcExeBdgetVo> selectResExcBdgetExect(ResExcExeBdgetInfoVo vo) throws KitechException;

	/**
	 * 사용자용 실행예산편성 조회
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return List<ResExcExeBdgetInfoVo>
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public List<ResExcExeBdgetInfoVo> selectResExcExeBdgetForUserList(ResExcExeBdgetInfoVo vo) throws KitechException;

	/**
	 * 실행예산 변경사유 조회 
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return List<ResExcExeBdgetInfoVo>
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public List<ResExcExeBdgetInfoVo> selectResExcBdgetExereList(ResExcExeBdgetInfoVo vo) throws KitechException;

	/**
	 * 실행예산 변경사유 수정
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public int saveResExcBdgetExere(ResExcExeBdgetVo vo) throws KitechException;	

	/**
	 * 실행예산신청번호를 가지고 과제번호,계정번호 조회 
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public ResExcExeBdgetInfoVo selectCheckResBgExectAmt(ResExcExeBdgetInfoVo vo) throws KitechException;
		
	/**
	 * 실행예산신청번호를 가지고 과제번호,계정번호 조회 
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public ResExcExeBdgetInfoVo selectMainAccntChk(ResExcExeBdgetInfoVo vo) throws KitechException;
		
	/**
	 * 실행예산신청번호를 가지고 과제번호,계정번호 조회 
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public ResExcExeBdgetInfoVo selectResExcRstAmtChk(ResExcExeBdgetInfoVo vo) throws KitechException;
	
	/**
	 * 실행예산신청번호를 가지고 과제번호,계정번호 조회 
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public ResExcExeBdgetInfoVo selectResExcDrctAmtChk(ResExcExeBdgetInfoVo vo) throws KitechException;
				
	/**
	 * 실행예산 변경 등록
     *
     * @author 김상미
     * @param  ResExcExeBdgetVo
	 * @return ResExcExeBdgetInfoVo
     * @throws KitechException
	 * @since 2023.10.16. 
	 */
	public ResExcExeBdgetInfoVo saveResExcBdgetData(ResExcExeBdgetVo vo) throws KitechException;

	/**
	 * 실행예산 결제 신청 
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public ResExcExeBdgetInfoVo saveResExcBdgetApr(ResExcExeBdgetVo vo) throws KitechException;

	/**
	 * 실행예산 결재 정보 삭제 
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	public void deleteResExcBdgetApr(ResExcExeBdgetInfoVo vo) throws KitechException;


}
  