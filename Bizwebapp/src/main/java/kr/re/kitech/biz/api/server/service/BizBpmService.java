/**
 * 
 */
package kr.re.kitech.biz.api.server.service;

import java.util.List;

import kr.re.kitech.biz.api.server.vo.ApiBpmVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
* BPM 대응 서비스
 * @author James
 * @since 2022. 6. 29.
 */
public interface BizBpmService {

	/**
	 * 타입별 업무 지역 담당자 리스트 조회
	 * @param param
	 * @return
	 * @throws KitechException
	 */
	public List<ApiBpmVo> findLocalAuthors(ApiBpmVo param) throws KitechException;	
	
    /**
	 * 업무/결재 BPM Back to here 대응 처리
     * @param param
     * @return
     * @throws KitechException
     */
    public ApiBpmVo execBackToHere(ApiBpmVo param) throws KitechException;
    
    /**
     * 업무/결재 BPM Task를 위임한다.
     * @param param
     * @return
     * @throws KitechException
     */
    public ApiBpmVo execDelegate(ApiBpmVo param) throws KitechException;
    
    /**
	 * 업무/결재 BPM 대결자 정보를 전달한다.
     * @param param
     * @return
     * @throws KitechException
     */
    public ApiBpmVo getApprByProxy(ApiBpmVo param) throws KitechException;
	    	    
}
