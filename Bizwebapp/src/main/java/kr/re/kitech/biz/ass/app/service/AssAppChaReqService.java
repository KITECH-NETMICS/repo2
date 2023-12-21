package kr.re.kitech.biz.ass.app.service;

import java.util.List;

import kr.re.kitech.biz.ass.app.vo.AssAppChaReqDetailVo;
import kr.re.kitech.biz.ass.app.vo.AssAppChaReqListVo;
import kr.re.kitech.biz.ass.app.vo.AssAppChaReqSrchVo;
import kr.re.kitech.biz.ass.app.vo.AssAppChaReqVo;
import kr.re.kitech.biz.ass.app.vo.AssMastrVo;

public interface AssAppChaReqService {

	public List<AssAppChaReqVo> selectAssAppChaReqList(AssAppChaReqSrchVo vo) throws Exception;

	public List<AssAppChaReqDetailVo> selectAssAppChaReqDetailList(AssAppChaReqSrchVo vo);

	public String saveAssAppChaReq(AssAppChaReqListVo vo);

	public void deleteAssAppChaReq(AssAppChaReqDetailVo vo);

	public AssAppChaReqVo selectDeptManager(AssAppChaReqSrchVo vo) throws Exception;
	
	public void formAccept(AssAppChaReqListVo vo) throws Exception;

	public void formReject(AssAppChaReqDetailVo vo) throws Exception;

	public void saveAssReceiptTransPosi(AssAppChaReqListVo vo) throws Exception;

	public List<AssMastrVo> selectAssetList(AssMastrVo vo) throws Exception;
}
