package kr.re.kitech.biz.res.out.service;

import java.util.List;

import kr.re.kitech.biz.res.out.vo.ResOutCtrbtEvalListVo;
import kr.re.kitech.biz.res.out.vo.ResOutCtrbtEvalVo;
import kr.re.kitech.biz.res.out.vo.ResOutCtrbtReqIntegVo;
import kr.re.kitech.biz.res.out.vo.ResOutCtrbtReqVo;

public interface ResOutCtrbtEvalService {
  
	//조직기여도 정보 조회
	public List<ResOutCtrbtEvalListVo> selectCtrbtEval01(ResOutCtrbtEvalVo vo);
	
	//조직기여도 신청서 조회
	public ResOutCtrbtReqIntegVo selectCtrbtEvalReq01(ResOutCtrbtReqVo vo);

	//조직기여도 신청서 저장
	public ResOutCtrbtReqVo saveCtrbtEvalReq01(ResOutCtrbtReqIntegVo vo) throws Exception;

	//조직기여도 신청서 삭제
	public void deleteCtrbtEvalReq01(ResOutCtrbtReqVo vo);

	//조직기여도 신청서 담당자 승인
	public void cofirmCtrbtEvalReq01(ResOutCtrbtReqVo vo);

	//조직기여도 신청서 담당자 반려
	public void rejectCtrbtEvalReq01(ResOutCtrbtReqVo vo);

/*		
	//조직기여도 신청서 결재 후 담당자 저장
	public void updateCtrbtEvalReq01(ResOutCtrbtEvalVo vo);
*/
}
  