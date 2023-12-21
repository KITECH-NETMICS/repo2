package kr.re.kitech.biz.sup.tec.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.api.client.vo.EasyPaySMSVo;
import kr.re.kitech.biz.ass.pop.vo.AssMastrHPopVo;
import kr.re.kitech.biz.sup.tec.vo.SptApplTableVo;
import kr.re.kitech.biz.sup.tec.vo.SptCardHisVo;
import kr.re.kitech.biz.sup.tec.vo.SptEquipUseRsltVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecActRsltVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecChkVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecEquipRsltVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRcptBillVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRcptDetlVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRcptInfoVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRcptListVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSrcVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 기술지원내역등록 DAO
 * @Class Name SptTecMntDAO.java
 * @Description 기술지원내역등록 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/06/07   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/06/07
 * @version 1
 * @see
 * 
 */
@Repository("sptTecMntDAO")
public class SptTecMntDAO extends BizDefaultAbstractDAO {
	/**
     * 실험실 담당자 확인
     * @param String sysPayNo
     * @return SptTecSrcVo
     * @throws Exception
     */
	public SptTecChkVo selectSptLabHedcnt(String sysPayNo) throws KitechException{
		return (SptTecChkVo)selectByPk("kr.re.kitech.biz.sup.tec.selectSptLabHedcnt", sysPayNo);
	}
	
	/**
     * 외부기술지원(유상) 목록조회
     * @param String sysPayNo
     * @return int
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<SptTecRcptInfoVo> selectSptTecRcptInfoList(SptTecSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.sup.tec.selectSptTecRcptInfoList", vo);
	}
	
	/**
     * 외부기술지원(유상) 내역등록 상세조회
     * @param SptTecSrcVo
     * @return SptTecRcptDetlVo
     * @throws Exception
     */
	public SptTecRcptDetlVo selectSptTecRcptInfo(SptTecSrcVo vo) throws KitechException{
		return (SptTecRcptDetlVo)selectByPk("kr.re.kitech.biz.sup.tec.selectSptTecRcptInfo", vo);
	}
	
	/**
     * 기술지원 접수(시험) 실적조회
     * @param String techSuptReqNo
     * @return List<SptTecActRsltVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<SptTecActRsltVo> selectSptTecActRslt(String techSuptReqNo) throws KitechException{
		return list("kr.re.kitech.biz.sup.tec.selectSptTecActRslt", techSuptReqNo);
	}
	
	/**
     * 기술지원 접수(교정) 실적조회
     * @param String techSuptReqNo
     * @return List<SptTecActRsltVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<SptTecActRsltVo> selectSptTecRevsnRslt(String techSuptReqNo) throws KitechException{
		return list("kr.re.kitech.biz.sup.tec.selectSptTecRevsnRslt", techSuptReqNo);
	}
	
	/**
     * 기술지원 접수 장비실적정보 조회
     * @param String techSuptReqNo
     * @return List<SptTecEquipRsltVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<SptTecEquipRsltVo> selectSptTecSupEquipRslt(String techSuptReqNo) throws KitechException{
		return list("kr.re.kitech.biz.sup.tec.selectSptTecSupEquipRslt", techSuptReqNo);
	}
	
	/**
     * 제우스 예약현황 상세정보 조회
     * @param String resvNo
     * @return SptTecRcptDetlVo
     * @throws Exception
     */
	public SptTecRcptDetlVo selectSptZeusResvMst(String resvNo) throws KitechException{
		return (SptTecRcptDetlVo)selectByPk("kr.re.kitech.biz.sup.tec.selectSptZeusResvMst", resvNo);
	}
	
	/**
     * 청구세금계산서 발행내역
     * @param String custNo
     * @return List<SptTecRcptBillVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<SptTecRcptBillVo> selectSptTecChrgBillInfo(String custNo) throws KitechException{
		return list("kr.re.kitech.biz.sup.tec.selectSptTecChrgBillInfo", custNo);
	}
	
	/**
     * 기술지원내역등록-장비검색팝업 조회
     * @param AssMastrHPopVo
     * @return List<AssMastrHPopVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<AssMastrHPopVo> selectSptLabEquipInfoAsetPop(AssMastrHPopVo vo) throws KitechException{
		return list("kr.re.kitech.biz.sup.tec.selectSptLabEquipInfoAsetPop", vo);
	}
	
	/**
     * 상담노트저장
     * @param SptTecRcptDetlVo
     * @return int
     * @throws Exception
     */
	public int insertSptCtiCunslContnt(SptTecRcptDetlVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.sup.tec.insertSptCtiCunslContnt", vo);
	}
	
	/**
     * 상담노트 수정
     * @param SptTecRcptDetlVo
     * @return int
     * @throws Exception
     */
	public int updateSptCtiCunslContnt(SptTecRcptDetlVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tec.updateSptCtiCunslContnt", vo);
	}	
	
	/**
     * 기술지원접수 저장
     * @param SptTecRcptInfoVo
     * @return int
     * @throws Exception
     */
	public int insertSptTecRcptInfo(SptTecRcptInfoVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.sup.tec.insertSptTecRcptInfo", vo);
	}
	
	/**
     * 기술지원접수 수정
     * @param SptTecRcptInfoVo
     * @return int
     * @throws Exception
     */
	public int updateSptTecRcptInfo(SptTecRcptInfoVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tec.updateSptTecRcptInfo", vo);
	}
	
	/**
     * 기술지원 결재신청금액 체크
     * @param SptTecRcptInfoVo
     * @return int
     * @throws Exception
     */
	public int selectSptTecRcptInfoAmtChk(SptTecRcptInfoVo vo) throws KitechException{
		return (int)selectByPk("kr.re.kitech.biz.sup.tec.selectSptTecRcptInfoAmtChk", vo);
	}
	
	/**
     * 기술지원 실적 저장
     * @param SptTecActRsltVo
     * @return int
     * @throws Exception
     */
	public int insertSptTecActRslt(SptTecActRsltVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.sup.tec.insertSptTecActRslt", vo);
	}
	
	/**
     * 기술지원 실적 삭제
     * @param String techSuptReqNo
     * @return int
     * @throws Exception
     */
	public int deleteSptTecActRslt(String techSuptReqNo) throws KitechException{
		return delete("kr.re.kitech.biz.sup.tec.deleteSptTecActRslt", techSuptReqNo);
	}
	
	/**
     * 기술지원 실적(교정) 저장
     * @param SptTecActRsltVo
     * @return int
     * @throws Exception
     */
	public int insertSptTecRevsnRslt(SptTecActRsltVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.sup.tec.insertSptTecRevsnRslt", vo);
	}
	
	/**
     * 장비실적내역 및 장비일지 삭제
     * @param SptTecEquipRsltVo
     * @return int
     * @throws Exception
     */
	public int deleteSptTecSupEquipRslt(SptTecEquipRsltVo vo) throws KitechException{
		return delete("kr.re.kitech.biz.sup.tec.deleteSptTecSupEquipRslt", vo);
	}
	
	/**
     * 기술지원 장비실적 저장
     * @param SptTecEquipRsltVo
     * @return int
     * @throws Exception
     */
	public int insertSptTecSupEquipRslt(SptTecEquipRsltVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.sup.tec.insertSptTecSupEquipRslt", vo);
	}
	
	/**
     * 기술지원 장비실적 수정
     * @param SptTecEquipRsltVo
     * @return int
     * @throws Exception
     */
	public int updateSptTecSupEquipRslt(SptTecEquipRsltVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tec.updateSptTecSupEquipRslt", vo);
	}
	
	/**
     * 장비/유지보수일지 등록
     * @param SptEquipUseRsltVo
     * @return int
     * @throws Exception
     */
	public int mergeSptEquipUseRslt(SptEquipUseRsltVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.sup.tec.mergeSptEquipUseRslt", vo);
	}
	
	/**
     * 제우스 장비 예약 기술지원의뢰번호 업데이트
     * @param SptTecRcptDetlVo
     * @return int
     * @throws Exception
     */
	public int updateSptZeusResvDtlSuptNo(SptTecRcptDetlVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tec.updateSptZeusResvDtlSuptNo", vo);
	}
	
	/**
     * 케이-바우처일 경우 확정 저장
     * @param SptTecRcptInfoVo
     * @return int
     * @throws Exception
     */
	public int updateSptTecRcptInfoDecideYn(SptTecRcptInfoVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tec.updateSptTecRcptInfoDecideYn", vo);
	}
	
	/**
     * 바우처가입여부 조회
     * @param String custNo
     * @return String
     * @throws Exception
     */
	public SptTecChkVo selectSptParBaseInfoVoucher(String custNo) throws KitechException{
		return (SptTecChkVo)selectByPk("kr.re.kitech.biz.sup.tec.selectSptParBaseInfoVoucher", custNo);
	}
	
	/**
     * 외부기술지원 내역등록 삭제
     * @param SptTecRcptInfoVo
     * @return int
     * @throws Exception
     */
	public int deleteSptTecRcptInfo(SptTecRcptInfoVo vo) throws KitechException{
		return delete("kr.re.kitech.biz.sup.tec.deleteSptTecRcptInfo", vo);
	}
	
	/**
     * 기술지원 진행상태 업데이트
     * @param SptTecSrcVo
     * @return int
     * @throws Exception
     */
	public int updateSptTecRcptInfoPrcsState(SptTecSrcVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tec.updateSptTecRcptInfoPrcsState", vo);
	}
	
	/**
     * 카드 결재내역 확인
     * @param String kolasNo
     * @return SptApplTableVo
     * @throws Exception
     */
	public SptApplTableVo selectSptApplTable(String kolasNo) throws KitechException{
		return (SptApplTableVo)selectByPk("kr.re.kitech.biz.sup.tec.selectSptApplTable", kolasNo);
	}
	
	/**
     * 카드결제 응답 저장
     * @param SptCardHisVo
     * @return int
     * @throws Exception
     */
	public int insertSptCardHis(SptCardHisVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.sup.tec.insertSptCardHis", vo);
	}
	
	/**
     * 카드결제 승인 후 기술지원접수 카드승인번호 업데이트
     * @param SptTecRcptInfoVo
     * @return int
     * @throws Exception
     */
	public int updateSptTecRcptInfoCard(SptTecRcptInfoVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tec.updateSptTecRcptInfoCard", vo);
	}
	
	/**
     * 카드결제취소 업데이트
     * @param SptApplTableVo
     * @return int
     * @throws Exception
     */
	public int updateSptApplTable(SptApplTableVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tec.updateSptApplTable", vo);
	}
	
	/**
     * 카드결제 내역 등록
     * @param SptApplTableVo
     * @return int
     * @throws Exception
     */
	public int insertSptApplTable(SptApplTableVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.sup.tec.insertSptApplTable", vo);
	}
	
	/**
     * 외부기술지원(유상) 기술내역저장 버튼 클릭시
     * @param SptTecRcptInfoVo
     * @return int
     * @throws Exception
     */
	public int updateSptTecRcptInfoPost(SptTecRcptInfoVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tec.updateSptTecRcptInfoPost", vo);
	}
	
	/**
     * 이지페이 SMS전송 응답결과 저장
     * @param EasyPaySMSVo
     * @return int
     * @throws Exception
     */
	public int insertEasypayRequestInfo(EasyPaySMSVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.sup.tec.insertEasypayRequestInfo", vo);
	}
	
	/**
     * 이지페이 SMS전송 실패결과 저장
     * @param EasyPaySMSVo
     * @return int
     * @throws Exception
     */
	public int insertXomxPgFailure(EasyPaySMSVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.sup.tec.insertXomxPgFailure", vo);
	}
	
	/**
     * 외부기술지원(유상) 엑셀내리기(장비)
     * @param SptTecSrcVo
     * @return List<SptTecRcptListVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<SptTecRcptListVo> selectSptTecRcptExcelDown(SptTecSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.sup.tec.selectSptTecRcptExcelDown", vo);
	}
	/**
     * 외부기술지원(유상) RPA 버튼 클릭시
     * @param SptTecRcptInfoVo
     * @return int
     * @throws Exception
     */
	public int updateRpaYn(SptTecRcptInfoVo vo) throws KitechException{
		return update("kr.re.kitech.biz.sup.tec.updateRpaYn", vo);
	}
}
