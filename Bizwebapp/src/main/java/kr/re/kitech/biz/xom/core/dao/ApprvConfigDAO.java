package kr.re.kitech.biz.xom.core.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.vo.ApprMapVo;
import kr.re.kitech.biz.xom.core.vo.ApprvConfigVo;
import kr.re.kitech.biz.xom.core.vo.AppvDelegatorDetailVo;
import kr.re.kitech.biz.xom.core.vo.AppvDelegatorVo;

/**  
 * @ClassSubJect 환경설정 
 * @Class Name : ApprvConfigDAO.java
 * @Description : 환경설정 으 처리하는 DAO
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/08/16   이영희          최초생성
 * 
 * @author 이영희
 * @since 2022/08/16
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved.
 */
@Repository("apprvConfigDAO")
public class ApprvConfigDAO extends BizDefaultAbstractDAO {
	/**
     * 유저 환경설정 메인 조회
     * @param ApprvConfigVo
     * @return ApprvConfigVo
     * @throws Exception
     */
     public ApprvConfigVo selectApprvConfig(ApprvConfigVo vo) throws KitechException{
    	 return (ApprvConfigVo)selectByPk("kr.re.kitech.biz.xom.core.selectApprvConfig", vo);
     }
    
    /**
     * 유저 환경설정 상세 조회
     * @param ApprvConfigVo
     * @return List<AppvDelegatorVo>
     * @throws Exception
     */ 
     @SuppressWarnings("unchecked")
	 public List<AppvDelegatorVo> selectApprvDelegatorList(ApprvConfigVo vo) throws KitechException{
    	 return list("kr.re.kitech.biz.xom.core.selectApprvDelegatorList", vo);
     }
     
     /**
     *  환경설정 등록
     * @param ApprvConfigVo
     * @return int
     * @throws Exception
     */ 
     public int insertApprvConfig(ApprvConfigVo vo) throws KitechException{
    	 return insert("kr.re.kitech.biz.xom.core.insertApprvConfig", vo);
     }
     
     /**
     *  환경설정 수정
     * @param ApprvConfigVo
     * @return int
     * @throws Exception
     */ 
     public int updateApprvConfig(ApprvConfigVo vo) throws KitechException{
    	 return update("kr.re.kitech.biz.xom.core.updateApprvConfig", vo);
     }
     
     /**
     *  양식함 Tree 조회
     * @param ApprvConfigVo
     * @return List<ApprMapVo>
     * @throws Exception
     */ 
     @SuppressWarnings("unchecked")
	 public List<ApprMapVo> selectAppvMapList(ApprvConfigVo vo) throws KitechException{
    	 return list("kr.re.kitech.biz.xom.core.selectAppvMapList", vo);
     }
     
     /**
     * 대결설정 단건 조회
     * @param ApprvConfigVo
     * @return AppvDelegatorVo
     * @throws Exception
     */
     public AppvDelegatorVo getAppvDelegator(AppvDelegatorVo vo) throws KitechException{
    	 return (AppvDelegatorVo)selectByPk("kr.re.kitech.biz.xom.core.getAppvDelegator", vo);
     }

     
     /**
     * 대결설정 조회
     * @param ApprvConfigVo
     * @return AppvDelegatorVo
     * @throws Exception
     */
     @SuppressWarnings("unchecked")
	public List<AppvDelegatorVo> selectAppvDelegator(String syspayno) throws KitechException{
    	 return list("kr.re.kitech.biz.xom.core.selectAppvDelegator", syspayno);
     }
          
     /**
     *  대결설정 상세 조회
     * @param ApprvConfigVo
     * @return List<AppvDelegatorDetailVo>
     * @throws Exception
     */ 
     @SuppressWarnings("unchecked")
	 public List<AppvDelegatorDetailVo> selectAppvDelegatorDetailList(AppvDelegatorVo vo) throws KitechException{
    	 return list("kr.re.kitech.biz.xom.core.selectAppvDelegatorDetailList", vo);
     }
     
     /**
     *  대결설정 등록
     * @param AppvDelegatorVo
     * @return int
     * @throws Exception
     */ 
     public int insertAppvDelegator(AppvDelegatorVo vo) throws KitechException{
    	 return insert("kr.re.kitech.biz.xom.core.insertAppvDelegator", vo);
     }
     
     /**
     *  대결설정 수정
     * @param AppvDelegatorVo
     * @return int
     * @throws Exception
     */ 
     public int updateAppvDelegator(AppvDelegatorVo vo) throws KitechException{
    	 return update("kr.re.kitech.biz.xom.core.updateAppvDelegator", vo);
     }
     
     /**
     * 신규저장시 이전 대결설정 유효개수 조회
     * @param String sysPayNo
     * @return int
     * @throws Exception
     */ 
     public int selectAppvDelegatorCnt(String sysPayNo) throws KitechException{
    	 return (int)selectByPk("kr.re.kitech.biz.xom.core.selectAppvDelegatorCnt", sysPayNo);
     }
     
     /**
     *  대결설정 상세 삭제
     * @param int dlgtSn
     * @return int
     * @throws Exception
     */ 
     public int deleteAppvDelegatorDetail(int dlgtSn) throws KitechException{
    	 return delete("kr.re.kitech.biz.xom.core.deleteAppvDelegatorDetail", dlgtSn);
     }
     
      /**
     *  대결설정 상세 등록
     * @param AppvDelegatorDetailVo
     * @return int
     * @throws Exception
     */ 
     public int insertAppvDelegatorDetail(AppvDelegatorDetailVo vo) throws KitechException{
    	 return insert("kr.re.kitech.biz.xom.core.insertAppvDelegatorDetail", vo);
     }
     
     /**
     *  대결설정 삭제
     * @param int dlgtSn
     * @return int
     * @throws Exception
     */ 
     public int deleteAppvDelegator(int dlgtSn) throws KitechException{
    	 return delete("kr.re.kitech.biz.xom.core.deleteAppvDelegator", dlgtSn);
     }
     
	/**
	 * 특정 사용자의 대결설정 전체 삭제
	 * @param syspayno
	 * @return
	 * @throws KitechException
	 */
    public int deleteAppvDelegatorAll(String syspayno) throws KitechException{
    	if (0 < delete("kr.re.kitech.biz.xom.core.deleteAppvDelegatorAll", syspayno)) {
    		return delete("kr.re.kitech.biz.xom.core.deleteAppvDelegatorDetailAll", syspayno);
    	}
    	return 0;
    }
     
    /**
     * 현재시각 기준 특정인의 특정양식에 해당하는 대결자를 조회한다. 
	 *  - 양식이 설정된 경우 해당 서브 대결자 그렇지 않은 경우 메인대결자를 반환한다. 
     * @param vo
     * @return
     * @throws KitechException
     */
    public String getAuthorApprByProxy(AppvDelegatorDetailVo vo) throws KitechException{
    	 return (String)selectByPk("kr.re.kitech.biz.xom.core.getAuthorApprByProxy", vo);
     }
     

     
}
