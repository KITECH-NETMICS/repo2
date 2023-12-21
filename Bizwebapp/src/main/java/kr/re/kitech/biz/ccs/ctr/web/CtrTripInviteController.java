package kr.re.kitech.biz.ccs.ctr.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.ccs.ctr.service.CtrTripInviteService;
import kr.re.kitech.biz.ccs.ctr.vo.CtrCvnTripSrcVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrTripInviteVo;
import kr.re.kitech.biz.ccs.ctr.vo.CvnTripAprVo;
import kr.re.kitech.biz.ccs.ctr.vo.CvnTripReqMonthVo;


/**  
 * @ClassSubJect 외부강의신고 관련 처리른 하는 컨트롤러
 * @Class Name CtrTripInviteController.java
 * @Description 외부강의신고 관련 처리른 하는 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/05/04     박영훈             최초생성
 * 
 * @author 박영훈
 * @since 2022/05/04
 * @version 1.0
 * @see
 * 
 */

@Controller
public class CtrTripInviteController {
	
    /** CtrTripInviteService */
    @Resource(name = "ctrTripInviteServiceImpl")
    private CtrTripInviteService ctrTripInviteService;
    
    /**
     * 외부강의신고 목록을 조회합니다.
     * @param ctrTripInviteVo 외부강의신고 CtrTripInviteVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key="SvcCCSCTRCTPR01")
    @RequestMapping(value="SvcCCSCTRCTPR01")    
    @ElDescription(sub="외부강의신고 목록조회",desc="페이징을 처리하여 외부강의신고 목록 조회를 한다.")               
    public List<CtrTripInviteVo> selectCtrCvnTripReqList(CtrCvnTripSrcVo vo) throws Exception {  
        return ctrTripInviteService.selectCtrCvnTripReqList(vo);            
    }  
    
    /**
     * 외부강의신고 수정 목록을 조회합니다.
     * @param ctrTripInviteVo 외부강의신고 CtrTripInviteVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key="SvcCCSCTRCTPR03")
    @RequestMapping(value="SvcCCSCTRCTPR03")    
    @ElDescription(sub="외부강의신고 목록수정조회",desc="외부강의신고 수정 항목을 조회한다")               
    public List<CtrTripInviteVo> selectCtrUpdateList(CtrCvnTripSrcVo vo) throws Exception {  
        return ctrTripInviteService.selectCtrUpdateList(vo);            
    }  
 
    @ElService(key = "SvcCCSCTRCTPR02")    
    @RequestMapping(value = "SvcCCSCTRCTPR02") 
    @ElDescription(sub = "대외활동신고 상세 조회", desc = "")
	@ElValidator(errUrl = "")    
    public CvnTripAprVo selectCtrTripInvite(CtrCvnTripSrcVo vo) throws Exception {
        return ctrTripInviteService.selectCtrTripInvite(vo);
    } 
    
    @ElService(key = "SvcCCSCTRCTPM01")    
    @RequestMapping(value = "SvcCCSCTRCTPM01")
    @ElDescription(sub = "외부강의신고 저장", desc = "외부강의신고를 저장한다.")
	@ElValidator(errUrl = "")
    public CtrCvnTripSrcVo saveCvnTripReq(CtrTripInviteVo vo) throws Exception {
    	return ctrTripInviteService.saveCvnTripReq(vo);   
    }
       
    /**
     * 외부강의신고를 삭제 처리한다.
     * @param ctrTripInviteVo 외부강의신고 CtrTripInviteVo     
     * @throws Exception
     */
    @ElService(key = "SvcCCSCTRCTPD01")    
    @RequestMapping(value="SvcCCSCTRCTPD01")
    @ElDescription(sub = "외부강의신고 삭제처리", desc = "외부강의신고를 삭제 처리한다.")    
    public void deleteCtrTripInvite(CtrCvnTripSrcVo vo) throws Exception {
        ctrTripInviteService.deleteCtrTripInvite(vo);
    }
   
   
     /**
     * 사용자의 누적데이터 조회
     * @param ctrTripInviteVo 외부강의신고 CtrTripInviteVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key="SvcCCSCTRCTPR04")
    @RequestMapping(value="SvcCCSCTRCTPR04")    
    @ElDescription(sub="사용자의 누적데이터 조회",desc="사용자의 누적데이터 조회")               
    public CtrTripInviteVo selectInviteYearMonth(CtrCvnTripSrcVo vo) throws Exception {  
        return ctrTripInviteService.selectInviteYearMonth(vo);
    } 
    
      /**
     * 사용자의 월간 누적 조회
     * @param ctrTripInviteVo 외부강의신고 CtrTripInviteVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key="SvcCCSCTRCTPR05")
    @RequestMapping(value="SvcCCSCTRCTPR05")    
    @ElDescription(sub="월간 데이터 리스트",desc="월간 데이터 리스트 조회")               
    public List<CvnTripReqMonthVo> selectCtrMonthList(CtrCvnTripSrcVo vo) throws Exception {  
        return ctrTripInviteService.selectCtrMonthList(vo);            
    }  
     
}
