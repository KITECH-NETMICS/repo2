package kr.re.kitech.biz.xom.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.MymenuDAO;
import kr.re.kitech.biz.xom.core.service.MymenuService;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.vo.MymenuVo;


/**  
 * @ClassSubJect 마이메뉴 관련 처리를 담당하는 MyBatis Impl
 * @Class Name MymenuServiceImpl.java
 * @Description 마이메뉴  처리를 담당하는 구현체 서비스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/03/08   박병목             최초생성
 * 
 * @author 박병목
 * @since 2022/03/08
 * @version 1.0
 * @see
 * 
 */
@Service("mymenuServiceImpl")
public class MymenuServiceImpl  extends EgovAbstractServiceImpl implements MymenuService {

    @Resource(name="mymenuDAO")
    private MymenuDAO mymenuDAO;
	
	@Resource(name = "messageSource")
	private MessageSource messageSource;
	
	@Value("${system.biz.url}")
	private String BIZ_URL;
    
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.xom.core.service.MymenuService#selectListMymenu(kr.re.kitech.biz.xom.core.vo.MymenuVo)
	 */
	public List<MymenuVo> selectListMymenu(MymenuVo mymenuVo) throws Exception {
		List<MymenuVo> list = mymenuDAO.selectListMymenu(mymenuVo);	
	
		return list;
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.xom.core.service.MymenuService#selectListCountMymenu(kr.re.kitech.biz.xom.core.vo.MymenuVo)
	 */
	public long selectListCountMymenu(MymenuVo mymenuVo) throws Exception {
		return mymenuDAO.selectListCountMymenu(mymenuVo);
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.xom.core.service.MymenuService#selectMymenu(kr.re.kitech.biz.xom.core.vo.MymenuVo)
	 */
	public MymenuVo selectMymenu(MymenuVo mymenuVo) throws Exception {
		MymenuVo resultVO = mymenuDAO.selectMymenu(mymenuVo);			
        
        return resultVO;
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.xom.core.service.MymenuService#insertMymenu(kr.re.kitech.biz.xom.core.vo.MymenuVo)
	 */
	public int insertMymenu(MymenuVo mymenuVo) throws Exception {
		return mymenuDAO.insertMymenu(mymenuVo);	
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.xom.core.service.MymenuService#deleteMymenu(kr.re.kitech.biz.xom.core.vo.MymenuVo)
	 */
	public int deleteMymenu(MymenuVo mymenuVo) throws Exception {
		return mymenuDAO.deleteMymenu(mymenuVo);
	}

	public List<MymenuVo> selectListClassMymenu(MymenuVo mymenuVo) throws Exception {
		List<MymenuVo> list = mymenuDAO.selectClassMymenu(mymenuVo);	
		return list;
	}

	public int saveMymenu(MymenuVo mymenuVo) throws Exception {
		int cnt = 0;
		String rowStatus = (String) mymenuVo.getRowStatus();
		
		if (rowStatus.equals("C")) {
			cnt = mymenuDAO.insertMymenu(mymenuVo);
		} else if (rowStatus.equals("U")) {
			cnt = mymenuDAO.updateMymenu(mymenuVo);
		} else if (rowStatus.equals("D")) {
			cnt = mymenuDAO.deleteMymenu(mymenuVo);
		}
		return cnt;
	}

	@Override
	public int saveMymenuList(List<MymenuVo> mymenuList) throws Exception {
		int cnt = 0;
		MymenuVo paramVo = mymenuList.get(0);
		paramVo.setSyspayno(KitechContextUtil.getSyspayno());
		List<String> myMenuSvrIDArr = mymenuDAO.selectClassMymenuChkList(paramVo);
		for (int i = 0; i < mymenuList.size(); i++) {
			MymenuVo row = mymenuList.get(i);
			String serviceId = row.getService_id();

			if (StringUtils.isBlank(serviceId)) {
				throw new KitechException(Exceptions.ALERT, Business.XOM, "message.xom.wq.034");
			}
			
			if (row.getDeleteAt() == 0 ) {
				row.setRowStatus(this.containServiceID(myMenuSvrIDArr, serviceId) ? "U" : "C");
			}
			row.setBkmkMenuUrl(BIZ_URL + "?serviceid=" + serviceId);
			row.setRegisterName(KitechContextUtil.getName());
			cnt += saveMymenu(row);
		}
		return cnt;
	}
	
	@Override
	public int saveMymenuAstar(List<MymenuVo> mymenuList) throws Exception {
		int cnt = 0;
		
		for (int i = 0; i < mymenuList.size(); i++) {
			MymenuVo row = mymenuList.get(i);
			String serviceId = row.getService_id();

			if (StringUtils.isBlank(serviceId)) {
				throw new KitechException(Exceptions.ALERT, Business.XOM, "message.xom.wq.034");
			}
			row.setBkmkMenuUrl(BIZ_URL + "?serviceid=" + serviceId);
			row.setRegisterName(KitechContextUtil.getName());
			cnt += saveMymenu(row);
		}
		return cnt;
	}
	/**
	 * List 안에 일치하는 serviceID가 있는지 확인
	 **/
	private boolean containServiceID(List<String> svrIdList, String serviceID) {
		return svrIdList.stream().anyMatch(svrId -> StringUtils.equals(svrId, serviceID));
	}
}
