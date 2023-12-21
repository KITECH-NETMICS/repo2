package kr.re.kitech.biz.apr.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.dao.FormBasicDAO;
import kr.re.kitech.biz.apr.service.FormBasicService;
import kr.re.kitech.biz.apr.vo.AppFormVo;


/**  
 * @ClassSubJect 신청서양식함 처리를 담당하는 MyBatis Impl
 * @Class Name AppFormServiceImpl.java
 * @Description 신청서양식함  처리를 담당하는 구현체 서비스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/06/09   박병목             최초생성
 * 
 * @author 박병목
 * @since 2022/06/09
 * @version 1.0
 * @see
 * 
 */
@Service("formBasicServiceImpl")
public class FormBasicServiceImpl  extends EgovAbstractServiceImpl implements FormBasicService {

    @Resource(name="formBasicDAO")
    private FormBasicDAO formBasicDAO;
        
   /**
    * 신청서양식함 목록을 조회
    * @param AppFormVo
    * @return List<AppFormVo>
    * @author 박병목
    * @since 2022.06.09.
    */
	public List<AppFormVo> selectAppForm(AppFormVo vo) throws ElException {
		List<AppFormVo> ret = formBasicDAO.selectAppForm(vo);
		return ret;
	}

	/**
    * 신청서양식명 단건 조회
    */
	public AppFormVo getAppForm(AppFormVo vo) throws ElException {
		return formBasicDAO.getAppForm(vo);
	}
}