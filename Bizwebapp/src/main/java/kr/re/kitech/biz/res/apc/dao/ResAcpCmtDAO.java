package kr.re.kitech.biz.res.apc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.res.apc.vo.ResApcCmtVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

@Repository("resAcpCmtDAO")
public class ResAcpCmtDAO extends BizDefaultAbstractDAO {
	/**
     * 선정평가위원회 팝업 선정위원회조회
     * @param ResApcCmtVo
     * @return List<ResApcCmtVo>
     * @throws KitechException
     */
	@SuppressWarnings("unchecked")
	public List<ResApcCmtVo> selectApcCmtList(ResApcCmtVo vo) throws KitechException {
		return list("kr.re.kitech.biz.res.apc.selectApcCmtList",vo);
	}
	
	/**
     * 선정평가위원회 팝업 선정위원조회
     * @param String
     * @return List<ResApcCmtVo>
     * @throws KitechException
     */
	@SuppressWarnings("unchecked")
	public List<ResApcCmtVo> selectApcCmtDetailList(String bsnsReqNo) throws KitechException {
		return list("kr.re.kitech.biz.res.apc.selectApcCmtDetailList",bsnsReqNo);
	}
	
	/**
     * 선정평가위원회 팝업 사업신청 선정건수 조회
     * @param ResApcCmtVo
     * @return int
     * @throws KitechException
     */
	public int selectApcCmtCnt(String bsnsReqNo) throws KitechException {
		return (int)selectByPk("kr.re.kitech.biz.res.apc.selectApcCmtCnt", bsnsReqNo);
	}
	
	/**
     * 선정평가위원 삭제
     * @param String
     * @return int
     * @throws KitechException
     */
	public int deleteApcCmt(String bsnsReqNo) throws KitechException {
		return delete("kr.re.kitech.biz.res.apc.deleteApcCmt", bsnsReqNo);
	}
	
	/**
     * 선정평가위원 저장
     * @param ResApcCmtVo
     * @return int
     * @throws KitechException
     */
	public int insertApcCmt(ResApcCmtVo vo) throws KitechException {
		return insert("kr.re.kitech.biz.res.apc.insertApcCmt", vo);
	}

	/**
     * 위원회 참여인원조회
     * @param String
     * @return List<ResApcCmtVo>
     * @throws KitechException
     */
	@SuppressWarnings("unchecked")
	public List<ResApcCmtVo> selectResApExtmmDtlList(String cmittNo) throws KitechException {
		return list("kr.re.kitech.biz.res.apc.selectResApExtmmDtlList",cmittNo);
	}
}
