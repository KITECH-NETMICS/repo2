package kr.re.kitech.biz.hum.apy.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.hum.apy.vo.AssetsVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyBasicVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyCompanVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyDeptChkVo;
import kr.re.kitech.biz.hum.apy.vo.HumApySvrVo;

/**  
 * @ClassSubJect 퇴직신청 관련 처리를 담당하는 DAO
 * @Class Name HumApySvrDAO.java
 * @Description 퇴직신청 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/05/27   박영훈             최초생성
 * 
 * @author 박영훈
 * @since 2022/05/27
 * @version 1.0
 * @see
 * 
 */
@Repository("humApySvrDAO")
public class HumApySvrDAO extends kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO {


    /**
     * 퇴직신청 상세를 조횐한다.
     * @param vo 퇴직신청 HumApySvrVo
     * @return 퇴직신청 HumApySvrVo
     * @throws Exception
     */
    public HumApySvrVo selectHumApySvr(HumApySvrVo vo) throws ElException {
        
       HumApySvrVo result = new HumApySvrVo();
        
        	if(vo.getReq_no().isEmpty()){
        		result = (HumApySvrVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApySvrEmp", vo);
        		result.setEmail("");
        	}else{
        		result = (HumApySvrVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApySvrNemp", vo);
        	}
        
        return result;
    }
    
     /**
     * 담당자조회
     * @param vo 담당자조회 HumApySvrVo
     * @return 담당자조회 HumApySvrVo
     * @throws Exception
     */
    public HumApySvrVo selectManger(HumApySvrVo vo) throws ElException {
        return (HumApySvrVo) selectByPk("kr.re.kitech.biz.hum.apy.selectManger", vo);
    }
    
    /**
     * 중복체크
     * @param vo 중복체크 HumApySvrVo
     * @return 중복체크 HumApySvrVo
     * @throws Exception
     */
    public Map selectDuplCheck(HumApySvrVo vo) throws ElException {
        return (Map) selectByPk("kr.re.kitech.biz.hum.apy.selectDuplCheck", vo);
    }
    
    

    /**
     * 페이징을 처리하여 퇴직신청 목록조회를 한다.
     * @param vo 퇴직신청 HumApySvrVo
     * @return 사원목록  List<HumApySvrVo>
     * @throws Exception
     */
    public List<HumApySvrVo> selectListHumApySvr(HumApySvrVo vo) throws ElException {      	
        return (List<HumApySvrVo>)list("kr.re.kitech.biz.hum.apy.selectListHumApySvr", vo);
    }
    
    /**
     * 퇴직신청 관련부서 주의사항 리스트조회
     * @param vo 퇴직신청 HumApySvrVo
     * @return 사원목록  List<HumApySvrVo>
     * @throws Exception
     */
    public List<HumApyDeptChkVo> selectListDeptChk(HumApyDeptChkVo vo) throws ElException {      	
        return (List<HumApyDeptChkVo>)list("kr.re.kitech.biz.hum.apy.selectListDeptChk", vo);
    }
    
    /**
     * 반려자 리스트
     * @param vo 반려자 HumApyCompanVo
     * @return 사원목록  List<HumApyCompanVo>
     * @throws Exception
     */
    public List<HumApyCompanVo> selectCompanionList(HumApyCompanVo vo) throws ElException {      	
        return (List<HumApyCompanVo>)list("kr.re.kitech.biz.hum.apy.selectCompanionList", vo);
    }
     
 
    /**
     * 퇴직신청 목록 조회의 전체 카운트를 조회한다.
     * @param vo 퇴직신청 HumApySvrVo
     * @return 사원목록 조회의 전체 카운트
     * @throws Exception
     */
    public long selectListCountHumApySvr(HumApySvrVo vo)  throws ElException{               
        return (Long)selectByPk("kr.re.kitech.biz.hum.apy.selectListCountHumApySvr", vo);
    }
        
    /**
     * 퇴직신청를 저징한다.
     * @param vo 퇴직신청 HumApySvrVo
     * @return 사번
     * @throws Exception
     */
    public int insertHumApySvr(HumApySvrVo vo) throws ElException {    	
        return insert("kr.re.kitech.biz.hum.apy.insertHumApySvr", vo);
    }

   /**
     * 퇴직신청를 저징한다.
     * @param vo 퇴직신청 HumApySvrVo
     * @return 사번
     * @throws Exception
     */
    public int updateHumApySvr(HumApySvrVo vo) throws ElException {    	
        return update("kr.re.kitech.biz.hum.apy.updateHumApySvr", vo);
    }
    
        /**
     * 퇴직신청를 저징한다.
     * @param vo 퇴직신청 HumApySvrVo
     * @return 사번
     * @throws Exception
     */
    public int insertDeptCheck(HumApyDeptChkVo humApyDeptChkVo) throws ElException {    	
        return insert("kr.re.kitech.biz.hum.apy.insertDeptCheck", humApyDeptChkVo);
    }

   /**
     * 퇴직신청를 저징한다.
     * @param vo 퇴직신청 HumApySvrVo
     * @return 사번
     * @throws Exception
     */
    public int updateDeptCheck(HumApyDeptChkVo humApyDeptChkVo) throws ElException {    	
        return update("kr.re.kitech.biz.hum.apy.updateDeptCheck", humApyDeptChkVo);
    }


    /**
     * 퇴직신청를 삭제한다.
     * @param vo 퇴직신청 HumApySvrVo
     * @throws Exception
     */
    public int deleteHumApySvr(HumApySvrVo vo) throws ElException {
    
    	delete("kr.re.kitech.biz.hum.apy.deleteHumApySvrCfm", vo);
    
        return delete("kr.re.kitech.biz.hum.apy.deleteHumApySvr", vo);
    }
    
    /**
     * 페이징을 처리하여 퇴직신청 목록조회를 한다.
     * @param vo 퇴직신청 HumApySvrVo
     * @return 사원목록  List<HumApySvrVo>
     * @throws Exception
     */
    public List<HumApySvrVo> selectListPcs(HumApySvrVo vo) throws ElException {      	
        return (List<HumApySvrVo>)list("kr.re.kitech.biz.hum.apy.selectListPcs", vo);
    }
    
     /**
     * 퇴직자조회
     * @param vo 퇴직자조회 HumApySvrVo
     * @return 퇴직자조회 HumApySvrVo
     * @throws Exception
     */
    public HumApyBasicVo selectHumInfo(HumApySvrVo vo) throws ElException {
        return (HumApyBasicVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumInfo", vo);
    }
    
    /**
     * 퇴직신청를 저징한다.
     * @param vo 퇴직신청 HumApySvrVo
     * @return 사번
     * @throws Exception
     */
    public int insertHumThst(HumApySvrVo humApySvrVo) throws ElException {    	
        return insert("kr.re.kitech.biz.hum.apy.insertHumThst", humApySvrVo);
    }
    
    
    public int MailSendUpdate(String vo) throws ElException {    	
        return update("kr.re.kitech.biz.hum.apy.MailSendUpdate", vo);
    }
    
     /**
     * 보유자산 리스트
     * @param vo 퇴직신청 AssetsVo
     * @return 사원목록  List<AssetsVo>
     * @throws Exception
     */
    public List<AssetsVo> selectAssetsList(AssetsVo vo) throws ElException {      	
        return (List<AssetsVo>)list("kr.re.kitech.biz.hum.apy.selectAssetsList", vo);
    }

     /**
     * 업무인수자 퇴직자 부서 겸직여부 조회
     * @param Vo 겸직여부 조회 HumApySvrVo
     * @return 겸직여부 조회 HumApySvrVo
     * @throws Exception
     */
    public HumApySvrVo selectAdJobChk(HumApySvrVo vo) throws ElException {
        return (HumApySvrVo) selectByPk("kr.re.kitech.biz.hum.apy.selectAdJobChk", vo);
    }

}
