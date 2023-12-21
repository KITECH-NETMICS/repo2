package kr.re.kitech.biz.uss.bas.service;

import kr.re.kitech.biz.uss.bas.vo.ComBasIPReqVo;
import kr.re.kitech.biz.uss.bas.vo.ComBasIpReqFormVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

public interface ComBasIPReqService {
	// 신청서와 신청서에 저장된 자산 정보 조회
	public ComBasIpReqFormVo selectIpReqForm(ComBasIPReqVo vo) throws KitechException;

}
