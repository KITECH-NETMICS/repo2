package kr.re.kitech.biz.xom.core.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.api.client.SearchClient;
import kr.re.kitech.biz.api.client.enums.SearchIndex;
import kr.re.kitech.biz.api.client.vo.ScRequest;
import kr.re.kitech.biz.api.client.vo.SearchVo;

/**
 * 통합검색 연계 컨트롤러
 *
 * @author James
 * @since 2023. 3. 29.
 */
@Controller
public class SearchController {

	@Resource(name="searchGetTask")
	private SearchClient searchGetTask;
	
    @ElService(key="SvcSearchProten")
    @RequestMapping(value="SvcSearchProten")    
    @ElDescription(sub="통합검색", desc="프로텐 검색 API로 통합검색을 질의한다.")
    public SearchVo callSearch(SearchVo vo) throws Exception {  
		AppLog.debug("=========================================================");
		AppLog.debug("업무 검색 (재무,구매,출장 등)");

        return this.searchGetTask.execute(
			new ScRequest.Builder(SearchIndex.valueOf(vo.getIndex()))
				.query(vo.getQuery())
				.build());
    }	
}
