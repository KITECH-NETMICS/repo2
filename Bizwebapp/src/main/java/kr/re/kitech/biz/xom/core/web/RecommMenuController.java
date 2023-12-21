package kr.re.kitech.biz.xom.core.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.kbk.inv.vo.InvJournalVo;
import kr.re.kitech.biz.xom.core.service.RecomMenuService;
import kr.re.kitech.biz.xom.core.vo.ServiceListVo;

@Controller
public class RecommMenuController {

	@Resource(name="recomMenuServiceImpl")
	private RecomMenuService recomMenuServiceImpl;
	
    @ElService(key="SvcRecommMenuList")
    @RequestMapping(value="SvcRecommMenuList")    
    @ElDescription(sub="추천 메뉴 목록 조회", desc="부서 별로 추천 메뉴의 목록을 조회한다.")
    public ServiceListVo selectListRecommendMenu(InvJournalVo vo) throws Exception {  
    	ServiceListVo ret = new ServiceListVo();
    	
    	ret.setServiceVoList(recomMenuServiceImpl.selectRecommendMenuList());
    	
        return ret;
    }
	
}
