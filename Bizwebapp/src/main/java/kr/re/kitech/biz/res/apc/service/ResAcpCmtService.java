package kr.re.kitech.biz.res.apc.service;

import java.util.List;

import kr.re.kitech.biz.res.apc.vo.ResApcCmtListVo;
import kr.re.kitech.biz.res.apc.vo.ResApcCmtVo;

public interface ResAcpCmtService {
	public List<ResApcCmtVo> selectApcCmtList(ResApcCmtVo vo);
	public List<ResApcCmtVo> selectResApExtmmDtlList(ResApcCmtVo vo);
	public void registApcCmtDetail(ResApcCmtListVo vo);
}
