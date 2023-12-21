package kr.re.kitech.biz.hum.apy.service;

import java.util.List;
import java.util.Map;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.hum.apy.vo.AssetsVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyCompanVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyDeptChkVo;
import kr.re.kitech.biz.hum.apy.vo.HumApySvrSaveVo;
import kr.re.kitech.biz.hum.apy.vo.HumApySvrVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 퇴직신청 관련 처리를 담당하는 인터페이스
 * @Class Name : HumApySvrService.java
 * @Description : 퇴직신청 관련 처리를 담당하는 인터페이스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/05/27   박영훈             최초생성
 * 
 * @author 박영훈
 * @since 2022/05/27
 * @version 1.0
 * @see
 * 
 */
public interface HumApySvrService {
	
	/**
	 * 퇴직신청 페이징 처리하여 목록을 조회한다.
	 * @param humApySvrVo 퇴직신청 HumApySvrVo
	 * @return  퇴직신청 목록 List<HumApySvrVo>
	 * @throws Exception
	 */
	public List<HumApySvrVo> selectListHumApySvr(HumApySvrVo humApySvrVo) throws Exception;
	
	/**
	 * 퇴직신청시 관현부서 확인사항
	 * @param humApyDeptChkVo 퇴직신청 HumApySvrVo
	 * @return  관현부서 확인사항 목록 List<HumApySvrVo>
	 * @throws Exception
	 */
	public List<HumApyDeptChkVo> selectListDeptChk(HumApyDeptChkVo humApyDeptChkVo) throws Exception;
	
	/**
	 * 반려자리스트
	 * @param humApySvrVo 퇴직신청 HumApySvrVo
	 * @return  반려자 List<HumApySvrVo>
	 * @throws Exception
	 */
	public List<HumApyCompanVo> selectCompanionList(HumApyCompanVo humApyCompanVo) throws Exception;
	

	
	/**
	 * @param humApySvrVo 퇴직신청 HumApySvrVo
	 * @return 조회한 퇴직신청 전체 카운트
	 * @throws Exception
	 */
	public long selectListCountHumApySvr(HumApySvrVo humApySvrVo) throws Exception;
	
	/**
	 * 퇴직신청 상세조회를 한다.
	 * @param humApySvrVo 퇴직신청 HumApySvrVo
	 * @return 사원상세정보 HumApySvrVo
	 * @throws Exception
	 */
	public HumApySvrVo selectHumApySvr(HumApySvrVo humApySvrVo) throws Exception;
	
	/**
	 * 담당자 조회
	 * @param humApySvrVo 퇴직신청 HumApySvrVo
	 * @return 사원상세정보 HumApySvrVo
	 * @throws Exception
	 */
	public HumApySvrVo selectManger(HumApySvrVo humApySvrVo) throws Exception;
	
	/**
	 * 중복체크
	 * @param humApySvrVo 퇴직신청 HumApySvrVo
	 * @return 중복체크 HumApySvrVo
	 * @throws Exception
	 */
	public Map selectDuplCheck(HumApySvrVo humApySvrVo) throws Exception;
		
	/**
	 * 퇴직신청를 등록한다.
	 * @param humApySvrVo 퇴직신청 HumApySvrVo
	 * @return 사번
	 * @throws Exception
	 */
	public HumApySvrVo saveHumApySvr(HumApySvrSaveVo humApySvrVo) throws Exception;
	
	
	/**
	 * 퇴직신청를 삭제한다.
	 * @param humApySvrVo 퇴직신청 HumApySvrVo
	 * @throws Exception
	 */
	public int deleteHumApySvr(HumApySvrVo humApySvrVo) throws Exception;
	
		/**
	 * 퇴직신청 페이징 처리하여 목록을 조회한다.
	 * @param humApySvrVo 퇴직신청 HumApySvrVo
	 * @return  퇴직신청 목록 List<HumApySvrVo>
	 * @throws Exception
	 */
	public List<HumApySvrVo> selectListPcs(HumApySvrVo humApySvrVo) throws Exception;
	
	/**
	*	증명서발급신청를 전자결제 승인(화면)
	*	@param humApyOutVo
	*	@throws KitechException
	**/
	public void formAccept(HumApySvrSaveVo vo) throws Exception;
	
	/**
	*	증명서발급신청를 전자결제 반려(화면)
	*	@param humApyOutVo
	*	@throws KitechException
	**/
	public void formReject(HumApySvrSaveVo vo) throws Exception;
	
	/**
	*	증명서발급신청를 전자결제 승인(화면)
	*	@param humApyOutVo
	*	@throws KitechException
	**/
	public void formComAccept(HumApySvrSaveVo vo) throws Exception;
	
	/**
	 * 퇴직신청를 등록한다.
	 * @param humApySvrVo 퇴직신청 HumApySvrVo
	 * @return 사번
	 * @throws Exception
	 */
	public void insertHumThst(HumApySvrSaveVo HumApySvrSaveVo) throws Exception;
	
	
	public void humMailSend(HumApySvrVo humApySvrVo) throws ElException;
	
     /**
     * 보유자산 리스트
     * @param vo 퇴직신청 AssetsVo
     * @return 사원목록  List<AssetsVo>
     * @throws Exception
     */
	public List<AssetsVo> selectAssetsList(AssetsVo assetsVo) throws Exception;
	
	/**
	 * 담당자 조회
	 * @param humApySvrVo 퇴직신청 HumApySvrVo
	 * @return 사원상세정보 HumApySvrVo
	 * @throws Exception
	 */
	public HumApySvrVo selectAdJobChk(HumApySvrVo humApySvrVo) throws Exception;
	
}
