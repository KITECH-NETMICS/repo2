package kr.re.kitech.biz.ccs.cws.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.re.kitech.biz.ccs.cws.dao.CwsCmtAreaDAO;
import kr.re.kitech.biz.ccs.cws.service.CwsCmtAreaService;
import kr.re.kitech.biz.ccs.cws.vo.CwsCmtAreaTagVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 출퇴근인증API 관련 처리를 담당하는 MyBatis Impl
 * @Class Name CwsCmtAreaServiceImpl.java
 * @Description 출퇴근인증API  처리를 담당하는 구현체 서비스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/09/15   김소연                 최초생성
 * 
 * @author 모바일
 * @since 2022/09/15
 * @version 1.0
 * @see
 * 
 */
@Service("cwsCmtAreaServiceImpl")
public class CwsCmtAreaServiceImpl implements CwsCmtAreaService {

	@Resource(name="cwsCmtAreaDAO")
	private CwsCmtAreaDAO cwsCmtAreaDAO;
	
	@Override
	public CwsCmtAreaTagVo selectCwsCmtAreaCheck(CwsCmtAreaTagVo cwsCmtAreaTagVo) throws KitechException {
		
		String gps_clsf = cwsCmtAreaTagVo.getGps_clsf(); 		 									// 통근구분코드	
		cwsCmtAreaTagVo.setIs_valid(false); 
		
		if(gps_clsf.equals("GPS003")) {																// <출장>
			cwsCmtAreaTagVo.setIs_valid(true);														// 유효태그 true
		} else if(gps_clsf.equals("GPS001") || gps_clsf.equals("GPS002")) {							// <출근, 퇴근>
			
			String tag_hor   = cwsCmtAreaTagVo.getTag_hor();										// 내 현재 위도
			String tag_ver   = cwsCmtAreaTagVo.getTag_ver();										// 내 현재 경도
			double d_tag_hor = Double.parseDouble(tag_hor);											// 내 현재 위도 double형 변환
			double d_tag_ver = Double.parseDouble(tag_ver);											// 내 현재 경도 double형 변환
			
			for(Map<String, Object> map : cwsCmtAreaDAO.selectCwsCmtAreaCheck(cwsCmtAreaTagVo)) { 	// mapper에서 뽑은 데이터를 map for each
				
				double left_hor  = Double.parseDouble(map.get("left_hor").toString());				// 좌측위도 double형 변롼
				double left_ver  = Double.parseDouble(map.get("left_ver").toString());				// 좌측경도 double형 변롼
				double right_hor = Double.parseDouble(map.get("right_hor").toString());				// 우측위도 double형 변롼
				double right_ver = Double.parseDouble(map.get("right_ver").toString());				// 우측경도 double형 변롼
 				double offset    = Double.parseDouble(map.get("offset").toString());				// 범위       double형 변롼
 				
				// 최대위도, 최소위도, 최대경도, 최소경도 변수 초기화
 				double maxHor = 0.0;
				double minHor = 0.0;
				double maxVer = 0.0;
				double minVer = 0.0;
				
				// 최대, 최소 위도 계산
				if (left_hor <= right_hor) {
					maxHor = right_hor;
					minHor = left_hor;
				} else{
					maxHor = left_hor;
					minHor = right_hor;
				}
				
				// 최대, 최소 경도 계산
				if (left_ver <= right_ver) {
					maxVer = right_ver;
					minVer = left_ver;
				} else {
					maxVer = left_ver;
					minVer = right_ver;
				}
				
				// 현재위도가 (최소위도-범위) 보다 크고 (최대위도+범위) 보다 작으면서
				// 현재경도가 (최소경도-범위) 보다 크고 (최대경도+범위) 보다 작으면  (= 내 현재경위도가 지정범위안에 포함이 된다면)
				if (((minHor - offset) <= d_tag_hor && d_tag_hor <= (maxHor + offset)) &&
					((minVer - offset) <= d_tag_ver && d_tag_ver <= (maxVer + offset))) {
					
					cwsCmtAreaTagVo.setIs_valid(true); 											// 유효태그 true
					cwsCmtAreaTagVo.setRef_no(map.get("ref_no").toString());					// 해당근무지역 데이터 번호 세팅
					break;
				} else { 																		// 범위안에 포함되지 않는다면
					cwsCmtAreaTagVo.setIs_valid(false); 										// 유효태그 false
				}
			}
		}
		
		//insert
		cwsCmtAreaDAO.insertCwsCmtAreaTag(cwsCmtAreaTagVo);
		return cwsCmtAreaTagVo;
	}

	@Override
	public List<CwsCmtAreaTagVo> selectCwsCmtAreaList(CwsCmtAreaTagVo cwsCmtAreaTagVo) throws KitechException {
		List<CwsCmtAreaTagVo> list = cwsCmtAreaDAO.selectCwsCmtAreaList(cwsCmtAreaTagVo);
		
		String clsfNm  = null;
		String validNm = null;
		
		for(int i = 0; i < list.size(); i++) {
			switch(list.get(i).getGps_clsf()) { 					//통근구분코드
				case "GPS001" : 					
					clsfNm = "출근";
					break;
				case "GPS002" : 
					clsfNm = "퇴근";
					break;
				case "GPS003" : 
					clsfNm = "출장";
					break;
			}
			validNm = list.get(i).isIs_valid() ?  "일치" : "불일치";
			
			list.get(i).setGps_clsf(clsfNm);
			list.get(i).setValid_nm(validNm);
		}
		return list;
	}
}