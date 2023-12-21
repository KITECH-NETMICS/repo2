package kr.re.kitech.biz.xom.base.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.log.AppLog;
import com.inswave.elfw.meta.ElAbstractCacheManager;

import kr.re.kitech.biz.xom.core.dao.CodeRepository;
import kr.re.kitech.biz.xom.core.vo.CodeMapVo;
import kr.re.kitech.biz.xom.core.vo.CodeVo;

/**
 * 공통 코드를 정적 메모리 공간에 적재하여 캐시용도로 사용한다.
 *
 * @author James
 * @since 2022. 4. 28.
 */
public class CodeCacheManager extends ElAbstractCacheManager{

	private static CodeCacheManager instance;	
	private List<CodeVo> codes = null;
	 

	public CodeCacheManager() {
		this.codes = new ArrayList<>();
	}
	
	public synchronized static CodeCacheManager getInstance() {
		if (null == instance) instance = new CodeCacheManager();
		return instance;
	}
	
	/** 
     * 코드 그룹 리스트를 조회한다.
	 */
	public CodeMapVo getGrpCodes(List<String> grpCodes, String dataPrefix) {
		AppLog.debug("grpCodes :" + grpCodes);
		synchronized (this.codes) {
			if (null == this.codes){
				// 현재 WAS 기동시 공통 코드를 로드하는데 첫 거래시 로딩이 필요하다면 이 지점에서 load() 메소드를 호출한다.
				return null;
			}

			// 반환 자료 구조형으로 래핑하여 반환 
			CodeMapVo grpCodeMap = new CodeMapVo();	
			grpCodeMap.setCodeMap(
				null == grpCodes || 1 > grpCodes.size() 
				// 필터 조건이 없다면 전체 코드를 그룹핑하여 반환
				? this.codes.stream().collect(Collectors.groupingBy(code -> dataPrefix + code.getGrpCd()))
				// 필터 조건이 있다면 그룹 코드에 해당하는 코드만  그룹핑하여 반환 
				: this.codes.stream().filter(code -> grpCodes.contains( code.getGrpCd())).collect(Collectors.groupingBy(code -> dataPrefix + code.getGrpCd()))
			);
			return grpCodeMap;
		}
	}
	
	/** 
     * 매핑하는 코드 Vo 조회
     * @param String grpCd, String cd(ex. grpCd=FAA, cd=FAA020)
     * @return CodeVo
     * @author LeeYH
     * @since 2022.08.19.
	 */
	public CodeVo getCode(String grpCd, String cd){
		synchronized (this.codes) {
			for(CodeVo vo : codes){
				if(grpCd.equals(vo.getGrpCd()) && cd.equals(vo.getComCd())){
					return vo;
				}
			}
		}
		return null;
	}
	
	/** 
     * 매핑하는 코드 Vo 조회
     * @param String grpCd, String cd(ex. grpCd=FAA)
     * @return CodeVo
     * @author James
     * @since 2023.11.22.
	 */
	public List<CodeVo> getCode(String grpCd){
		List<CodeVo> codeList = new ArrayList<>();
		synchronized (this.codes) {
			for(CodeVo vo : this.codes){
				if(grpCd.equals(vo.getGrpCd())){
					codeList.add(vo);
				}
			}
			return codeList;
		}		
	}
	

	@Override
	public void load() throws ElException {
		try {
			List<CodeVo> codeList = new CodeRepository().findCodesByUse();
			synchronized (this.codes) {
				this.codes.clear();
				this.codes.addAll(codeList);
			}
			AppLog.info("CodeCacheManager.loading......");
		} catch (Exception ex) {
			AppLog.error("CodeCacheManager.loading error", ex);
			throw new ElException("ERROR.SYS.003", ex);
		}
		
	}
}
