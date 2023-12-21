package kr.re.kitech.biz.pat.ppo.service.impl;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.pat.ppo.dao.PatPpoMailDtlDAO;
import kr.re.kitech.biz.pat.ppo.service.PatPpoMailDtlService;
import kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlListVo;
import kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlVo;
import kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveListVo;
import kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo;
import kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstListVo;
import kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : PatPpoMailDtlServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.25.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.10.25.
 * @version 1.0
 * @see
 * 
 */
@Service("patPpoMailDtlServiceImpl")
public class PatPpoMailDtlServiceImpl  extends EgovAbstractServiceImpl implements PatPpoMailDtlService {
  @Resource(name="patPpoMailDtlDAO")
  private PatPpoMailDtlDAO ppoDAO;
    
  /**
   * 지식재산권 메일 상세 조회
   * 
   * @author Chris
   * @param PatPpoMailDtlVo
   * @return PatPpoMailDtlListVo
   * @throws KitechException
   * @since 2023.10.25.   
   */
  @Override
  public PatPpoMailDtlListVo retrieve(PatPpoMailDtlVo vo) throws KitechException {
    PatPpoMailDtlListVo retVo = new PatPpoMailDtlListVo();

    PatPpoMailDtlVo mailInfo = ppoDAO.selectItem01(vo);
    retVo.setMailInfo(mailInfo);

    List<PatPpoMailDtlVo> receiveList = ppoDAO.selectList01(vo);
    retVo.setReceiveList(receiveList);

    List<PatPpoMailDtlVo> referenceList = ppoDAO.selectList02(vo);
    retVo.setReferenceList(referenceList);

    return retVo;
  }

  /**
   * 지식재산권 관련첨부파일 조회
   * 
   * @author Chris
   * @param PatPpoMailDtlVo
   * @return PatPpoMailDtlListVo
   * @throws KitechException
   * @since 2023.10.25.   
   */
  @Override
  public PatPpoRefFileLstListVo retrieveFileLst(PatPpoRefFileLstVo vo) throws KitechException {
    PatPpoRefFileLstListVo retVo = new PatPpoRefFileLstListVo();

	PatPpoRefFileLstVo bibliography = Optional.ofNullable(ppoDAO.selectItem02(vo)).orElse(new PatPpoRefFileLstVo());
	retVo.setBibliography(bibliography);

    List<PatPpoRefFileLstVo> refList = ppoDAO.selectList03(vo);
    retVo.setRefList(refList);

    List<PatPpoRefFileLstVo> krRefList = ppoDAO.selectList04(vo);
    retVo.setKrRefList(krRefList);

    return retVo;
  }

  /**
   * 지식재산권 메일 발송대상 조회
   * 
   * @author Chris
   * @param PatPpoMailSaveVo
   * @return PatPpoMailSaveListVo
   * @throws KitechException
   * @since 2023.10.26.   
   */
  @Override
  public PatPpoMailSaveListVo retrieveMailTargetUserLst(PatPpoMailSaveVo vo) throws KitechException {
    PatPpoMailSaveListVo retVo = new PatPpoMailSaveListVo();

    List<PatPpoMailSaveVo> userList = ppoDAO.selectList05(vo);
    retVo.setUserList(userList);

    PatPpoMailSaveVo mstInfo = ppoDAO.selectItem03(vo);
    retVo.setMstInfo(mstInfo);

    return retVo;
  }

  /**
   * 지식재산권 메일 발송대상 조회
   * 
   * @author Chris
   * @param PatPpoMailSaveVo
   * @return PatPpoMailSaveListVo
   * @throws KitechException
   * @since 2023.10.26.   
   */
  @Override
  public PatPpoMailSaveVo mailSave(PatPpoMailSaveListVo vo) throws KitechException {
    PatPpoMailSaveVo retVo = new PatPpoMailSaveVo();

    String mailId = "";

    PatPpoMailSaveVo mailInfo = vo.getMailInfo();
    List<PatPpoMailSaveVo> receiveList = vo.getReceiveList();
    List<PatPpoMailSaveVo> referenceList = vo.getReferenceList();

    PatPpoMailSaveVo selectId01 = ppoDAO.selectItem04(mailInfo);
    if(selectId01 != null){
      mailId = selectId01.getMail_id();

      mailInfo.setMail_id(selectId01.getMail_id());
      mailInfo.setNm(selectId01.getNm());
      mailInfo.setEmail(selectId01.getEmail());

      ppoDAO.insertItem01(mailInfo); // 메일 메인 저장
    }else{
    	throw new KitechException(Exceptions.ERROR, Business.RSP, "message.xom.co.com.0007", new String[]{"데이터"});
    }

    // 수신자 저장
    if (receiveList != null && !receiveList.isEmpty()) {
      saveMailList(receiveList, "0", mailId, mailInfo.getRegst_syspayno());
    }

    // 참조자 저장
    if (referenceList != null && !referenceList.isEmpty()) {
      saveMailList(referenceList, "1", mailId, mailInfo.getRegst_syspayno());
    }

    return retVo;
  }

  private void saveMailList(List < PatPpoMailSaveVo > mailList, String recvType, String mailId, String regstSyspayno) {
    for (PatPpoMailSaveVo list: mailList) {
        list.setMail_id(mailId);
        list.setRecv_type(recvType);
        list.setRegst_syspayno(regstSyspayno);
        if (list.getEmail().trim().isEmpty()) continue;

        ppoDAO.insertItem02(list);
    }
  }

}
