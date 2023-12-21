package kr.re.kitech.biz.pat.pbd.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.pat.pbd.service.PatBoardService;
import kr.re.kitech.biz.pat.pbd.vo.PatFaqListVo;
import kr.re.kitech.biz.pat.pbd.vo.PatFaqVo;
import kr.re.kitech.biz.pat.pbd.vo.PatFrmListVo;
import kr.re.kitech.biz.pat.pbd.vo.PatFrmVo;
import kr.re.kitech.biz.pat.pbd.vo.PatNoticeListVo;
import kr.re.kitech.biz.pat.pbd.vo.PatNoticeVo;
import kr.re.kitech.biz.pat.pbd.vo.PatQnaListVo;
import kr.re.kitech.biz.pat.pbd.vo.PatQnaVo;

@Controller
public class PatBoardMainController {

	@Resource(name = "PatBoardServiceImpl")
	private PatBoardService patBoardService;
	
	@ElService(key="SvcPATPBDNOTI01")
	@RequestMapping(value="SvcPATPBDNOTI01")
	@ElDescription(sub="selectList",desc="공지사항 리스트를 조회 한다.")
	public PatNoticeListVo selectList(PatNoticeVo fndVo) throws Exception {
	    PatNoticeListVo retVo = new PatNoticeListVo();
	    retVo.setPatNoticeVoList(patBoardService.selectNoticeList(fndVo));
	    return retVo;
	}
	
	@ElService(key="SvcPATPBDNOTI02")
	@RequestMapping(value="SvcPATPBDNOTI02")
	@ElDescription(sub="selectList",desc="공지사항 단건 리스트를 조회 한다.")
	public PatNoticeVo selectDetail(PatNoticeVo vo) throws Exception {
	    return patBoardService.selectNoticeSingleItem(vo);
	}
	
	@ElService(key="SvcPATPBDFAQL01")
	@RequestMapping(value="SvcPATPBDFAQL01")
	@ElDescription(sub="selectList",desc="자주하는질문 리스트를 조회 한다.")
	public PatFaqListVo selectList(PatFaqVo fndVo) throws Exception {
	    PatFaqListVo retVo = new PatFaqListVo();
	    retVo.setPatFaqVoList(patBoardService.selectFaqList(fndVo));
	    return retVo;
	}
	
	@ElService(key="SvcPATPBDFAQL02")
	@RequestMapping(value="SvcPATPBDFAQL02")
	@ElDescription(sub="selectList",desc="자주하는질문 단건 리스트를 조회 한다.")
	public PatFaqVo selectDetail(PatFaqVo vo) throws Exception {
	    return patBoardService.selectFaqSingleItem(vo);
	}
	
	@ElService(key="SvcPATPBDFRML01")
	@RequestMapping(value="SvcPATPBDFRML01")
	@ElDescription(sub="selectList",desc="양식함 리스트를 조회 한다.")
	public PatFrmListVo selectList(PatFrmVo fndVo) throws Exception {
	    PatFrmListVo retVo = new PatFrmListVo();
	    retVo.setPatFrmVoList(patBoardService.selectFrmList(fndVo));
	    return retVo;
	}
	
	@ElService(key="SvcPATPBDFRML02")
	@RequestMapping(value="SvcPATPBDFRML02")
	@ElDescription(sub="selectList",desc="양식함 단건 리스트를 조회 한다.")
	public PatFrmVo selectDetail(PatFrmVo vo) throws Exception {
	    return patBoardService.selectFrmSingleItem(vo);
	}
	
	@ElService(key="SvcPATPBDQNAL01")
	@RequestMapping(value="SvcPATPBDQNAL01")
	@ElDescription(sub="selectList",desc="묻고답하기 리스트를 조회 한다.")
	public PatQnaListVo selectList(PatQnaVo fndVo) throws Exception {
	    PatQnaListVo retVo = new PatQnaListVo();
	    retVo.setPatQnaVoList(patBoardService.selectQnaList(fndVo));
	    return retVo;
	}
	
	@ElService(key="SvcPATPBDQNAL02")
	@RequestMapping(value="SvcPATPBDQNAL02")
	@ElDescription(sub="selectList",desc="묻고답하기 단건 리스트를 조회 한다.")
	public PatQnaVo selectDetail(PatQnaVo vo) throws Exception {
	    return patBoardService.selectQnaSingleItem(vo);
	}
	
	@ElService(key="SvcPATPBDQNAL03")
	@RequestMapping(value="SvcPATPBDQNAL03")
	@ElDescription(sub="selectList",desc="시스템자동문의 신청자 정보 조회 한다")
	public PatQnaVo selectreqUserInfo(PatQnaVo vo) throws Exception {
	    return patBoardService.selectreqUserInfo(vo);
	}	
	
	
	@ElService(key="SvcPATPBDCADM01")
	@RequestMapping(value="SvcPATPBDCADM01")
	@ElDescription(sub="saveItem",desc="공지사항 아이템을 저장한다.")
	public PatNoticeVo saveItem(PatNoticeVo vo) throws Exception {
      String notice_id = patBoardService.saveNoticeItem(vo);
      vo.setNotice_id(notice_id);
	  return vo;
    }
	
	@ElService(key="SvcPATPBDCADD01")
	@RequestMapping(value="SvcPATPBDCADD01")
	@ElDescription(sub="deleteItem",desc="공지사항 아이템을 삭제한다.")
	public void deleteItem(PatNoticeVo vo) throws Exception {
      patBoardService.deleteNoticeItem(vo);
    }
  
    @ElService(key="SvcPATPBDCADM02")
	@RequestMapping(value="SvcPATPBDCADM02")
	@ElDescription(sub="saveItem",desc="자주하는질문 아이템을 저장한다.")
	public PatFaqVo saveItem(PatFaqVo vo) throws Exception {
      String faq_id = patBoardService.saveFaqItem(vo);
      vo.setFaq_id(faq_id);
	  return vo;
    }
	
	@ElService(key="SvcPATPBDCADD02")
	@RequestMapping(value="SvcPATPBDCADD02")
	@ElDescription(sub="deleteItem",desc="자주하는질문 아이템을 삭제한다.")
	public void deleteItem(PatFaqVo vo) throws Exception {
      patBoardService.deleteFaqItem(vo);
    }
	
	@ElService(key="SvcPATPBDCADM03")
	@RequestMapping(value="SvcPATPBDCADM03")
	@ElDescription(sub="saveItem",desc="양식함 아이템을 저장한다.")
	public PatFrmVo saveItem(PatFrmVo vo) throws Exception {
      String faq_id = patBoardService.saveFrmItem(vo);
      vo.setFaq_id(faq_id);
	  return vo;
    }
	
	@ElService(key="SvcPATPBDCADD03")
	@RequestMapping(value="SvcPATPBDCADD03")
	@ElDescription(sub="deleteItem",desc="양식함 아이템을 삭제한다.")
	public void deleteItem(PatFrmVo vo) throws Exception {
      patBoardService.deleteFrmItem(vo);
    }
	
	@ElService(key="SvcPATPBDCADM04")
	@RequestMapping(value="SvcPATPBDCADM04")
	@ElDescription(sub="saveItem",desc="묻고답하기 아이템을 저장한다.")
	public PatQnaVo saveItem(PatQnaVo vo) throws Exception {
      String qna_id = patBoardService.saveQnaItem(vo);
      vo.setQna_id(qna_id);
	  return vo;
    }

	@ElService(key="SvcPATPBDCADM05")
	@RequestMapping(value="SvcPATPBDCADM05")
	@ElDescription(sub="saveItem",desc="요구사항 저장한다.")
	public PatQnaVo saveSystemReq(PatQnaVo vo) throws Exception {
      String qna_id = patBoardService.saveSystemReq(vo);
      vo.setQna_id(qna_id);
	  return vo;
    }	
	
	@ElService(key="SvcPATPBDCADD04")
	@RequestMapping(value="SvcPATPBDCADD04")
	@ElDescription(sub="deleteItem",desc="묻고답하기 아이템을 삭제한다.")
	public void deleteItem(PatQnaVo vo) throws Exception {
      patBoardService.deleteQnaItem(vo);
    }
}
