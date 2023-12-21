package kr.re.kitech.biz.xom.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.api.client.CooconClient;
import kr.re.kitech.biz.xom.core.dao.AccountVerfDAO;
import kr.re.kitech.biz.xom.core.service.AccountVerfService;
import kr.re.kitech.biz.xom.core.vo.AccountVerfListVo;
import kr.re.kitech.biz.xom.core.vo.AccountVerfVo;

/**  
 * @ClassSubJect 계좌검증
 * @Class Name : AccountVerfServiceImpl.java
 * @Description : 환경설정 으 처리하는 ServiceImpl
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/08/18   이영희          최초생성
 * 
 * @author 이영희
 * @since 2022/08/18
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved.
 */
@Service("accountVerfService")
public class AccountVerfServiceImpl extends EgovAbstractServiceImpl implements AccountVerfService {
	@Resource(name="cooconClient")
	private CooconClient clientService;
	
	@Resource(name="accountVerfDAO")
	private AccountVerfDAO dao;
	
	@Value("${mail.isExecute}")
    private Boolean exceute;
    
    public Boolean isExecute() {
		return this.exceute;
	}

	/**
     * 계좌검증
     * @param AccountVerfVo 
     * @return int
     * @throws Exception
     * @author LeeYH
     * @since 2022.08.18.
     */
	@Override
	public AccountVerfVo proccessAccountVerf(AccountVerfVo vo) {
		// 거래일련번호 조회
		vo.setTrsc_seq_no(dao.selectTrscSeqNo(vo));
		
		if(!this.isExecute()){
			String trsc_seq_no = vo.getTrsc_seq_no();
			if (trsc_seq_no != null && !trsc_seq_no.isEmpty()) {
				trsc_seq_no = "9" + trsc_seq_no.substring(1);
		    }
		    vo.setTrsc_seq_no(trsc_seq_no);
		    AppLog.debug("개발계 계좌검증 거래번호 : " + trsc_seq_no);
		}
		
		
		// 계좌검증 클라이언트 호출
		vo = clientService.getAccountInfo(vo);
		System.out.println("------------- vo : " + vo);
		
		// 검증결과 로그 저장
		dao.insertCooconCallLog(vo);
		
		if("완료".equals(vo.getSuccess())){
			String match = "[^\uAC00-\uD7A30-9a-zA-Z|(주)|(유)|(사)|(재)]";
			
			String depstrNm = vo.getDepstr_nm().replaceAll(match, ""); // 화면에서 넘어온 예금주
			String resData = vo.getRes_data().replaceAll(match, ""); // 검증 후 리턴 값
			
			AppLog.debug("\n ############## proccessAccountVerf depstrNm :" + depstrNm + ", resData : " + resData );
			if(resData.indexOf(depstrNm) >= 0){
				vo.setIs_account("1"); // 검증
			}else{
				vo.setIs_account("2"); // 검증오류
			}	
		}else{
			vo.setIs_account("2"); // 검증오류
		}
		return vo;
	}
	
	/**
     * 계좌검증
     * @param AccountVerfVo 
     * @return int
     * @throws Exception
     * @author LeeYH
     * @since 2022.08.18.
     */
	public List<AccountVerfVo> proccessAccountVerfList(AccountVerfListVo listVo) {
		List<AccountVerfVo> voList = listVo.getAccList();
		
		for(AccountVerfVo vo : voList){
			vo = this.proccessAccountVerf(vo);
		}
		
		return voList;
	}

}
