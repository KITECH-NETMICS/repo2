package kr.re.kitech.biz.res.apc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.re.kitech.biz.res.apc.dao.ResAcpCmtDAO;
import kr.re.kitech.biz.res.apc.service.ResAcpCmtService;
import kr.re.kitech.biz.res.apc.vo.ResApcCmtListVo;
import kr.re.kitech.biz.res.apc.vo.ResApcCmtVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

@Service("resAcpCmtServiceImpl")
public class ResAcpCmtServiceImpl implements ResAcpCmtService {

	@Resource(name="resAcpCmtDAO")
	ResAcpCmtDAO resAcpCmtDAO;
	
	/**
     * 선정평가위원회 팝업 조회
     * @param ResApcCmtVo
     * @return List<ResApcCmtVo>
     * @throws KitechException
     */
	@Override
	public List<ResApcCmtVo> selectApcCmtList(ResApcCmtVo vo) throws KitechException {		
		int cnt = resAcpCmtDAO.selectApcCmtCnt(vo.getBsns_req_no());		
		if (cnt > 0) {
			return resAcpCmtDAO.selectApcCmtDetailList(vo.getBsns_req_no());
		} else {			
			return resAcpCmtDAO.selectApcCmtList(vo);
		} 
	}
	
	/**
     * 위원회 참여인원조회
     * @param ResApcCmtVo
     * @return List<ResApcCmtVo>
     * @throws KitechException
     */
	@Override
	public List<ResApcCmtVo> selectResApExtmmDtlList(ResApcCmtVo vo) throws KitechException {
		return resAcpCmtDAO.selectResApExtmmDtlList(vo.getCmitt_no());
	}
	
	/**
     * 선정평가위원회 저장
     * @param ResApcCmtListVo
     * @throws KitechException
     */
	@Override
	public void registApcCmtDetail(ResApcCmtListVo vo) throws KitechException {
		List<ResApcCmtVo> cmittList = vo.getCmittList();
		
		if (cmittList != null) {		
			if("U".equals(cmittList.get(0).getCud_type())){
				resAcpCmtDAO.deleteApcCmt(cmittList.get(0).getBsns_req_no());
			}
			
			int odr = 1;
			for (ResApcCmtVo cmittVo : cmittList ) {				
				cmittVo.setOdr(odr);
				resAcpCmtDAO.insertApcCmt(cmittVo);
				odr++;
			}
		} 
	}

}
