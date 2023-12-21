package kr.re.kitech.biz.res.out.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.res.out.vo.ResOutCtrbtEvalListVo;
import kr.re.kitech.biz.res.out.vo.ResOutCtrbtEvalVo;
import kr.re.kitech.biz.res.out.vo.ResOutCtrbtReqListVo;
import kr.re.kitech.biz.res.out.vo.ResOutCtrbtReqVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

  @Repository("resOutCtrbtEvalDAO")
  public class ResOutCtrbtEvalDAO extends BizDefaultAbstractDAO {
  
	// 조직기여도 리스트화면 조회
    @SuppressWarnings("unchecked")
	public List<ResOutCtrbtEvalListVo> selectCtrbtEval01(ResOutCtrbtEvalVo vo) throws ElException {
		// TODO Auto-generated method stub
		return list("kr.re.kitech.biz.res.out.selectResAchindLst", vo);
	}

    // 신청서 기본정보 조회
	public ResOutCtrbtReqVo selectCtrbtEvalReq01(ResOutCtrbtReqVo vo) throws ElException {
		// TODO Auto-generated method stub
		return  (ResOutCtrbtReqVo) selectByPk("kr.re.kitech.biz.res.out.selectCtrbtEvalReq01", vo);
	}

	// 기여자 정보 조회
	@SuppressWarnings("unchecked")
	public List<ResOutCtrbtReqListVo> selectCtrbtEvalReq02(ResOutCtrbtReqVo vo) throws ElException {
		// TODO Auto-generated method stub
		return list("kr.re.kitech.biz.res.out.selectCtrbtEvalReq02", vo);
	}

	// 신청서 기본정보 저장
	public int saveCtrbtEvalReq01(ResOutCtrbtReqVo vo) throws ElException {
		// TODO Auto-generated method stub
		return insert("kr.re.kitech.biz.res.out.saveCtrbtEvalReq01", vo);
	}
	
	// 기여자 정보 저장
	public int saveCtrbtEvalReq02(ResOutCtrbtReqListVo vo) throws ElException {
		// TODO Auto-generated method stub
		return insert("kr.re.kitech.biz.res.out.saveCtrbtEvalReq02", vo);
	}

	//신청서 업데이트
	public int updateCtrbtEvalReq01(ResOutCtrbtReqVo vo) throws ElException {
		// TODO Auto-generated method stub
		return update("kr.re.kitech.biz.res.out.updateCtrbtEvalReq01", vo);
	}
	
	//신청서 기본정보 삭제
	public int deleteCtrbtEvalReq01(ResOutCtrbtReqVo vo) throws ElException {
		// TODO Auto-generated method stub
		return delete("kr.re.kitech.biz.res.out.deleteCtrbtEvalReq01", vo);
	}
	
	//기여자 정보 삭제
	public int deleteCtrbtEvalReq02(ResOutCtrbtReqVo vo) throws ElException {
		// TODO Auto-generated method stub
		return delete("kr.re.kitech.biz.res.out.deleteCtrbtEvalReq02", vo);
	}
	
	//담당자 정보 조회
	public String selectResManager(String sysPayNo) throws KitechException{
		return (String)selectByPk("kr.re.kitech.biz.res.com.selectResManager", sysPayNo);
	}
	
}
