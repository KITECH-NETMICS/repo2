package kr.re.kitech.biz.res.twe.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.res.twe.service.ResMarketService;
import kr.re.kitech.biz.res.twe.vo.ResDownHistListVo;
import kr.re.kitech.biz.res.twe.vo.ResDownHistVo;
import kr.re.kitech.biz.res.twe.vo.ResMarketListVo;
import kr.re.kitech.biz.res.twe.vo.ResMarketVo;

@Controller
public class ResMarketController {

	@Resource(name = "ResMarketServiceImpl")
	private ResMarketService resMarketService;
	
	@ElService(key="SvcRESTWEMARL01")
	@RequestMapping(value="SvcRESTWEMARL01")
	@ElDescription(sub="selectList",desc="시장정보 리스트를 조회 한다.")
	public ResMarketListVo selectList(ResMarketVo fndVo) throws Exception {
	    ResMarketListVo retVo = new ResMarketListVo();
	    retVo.setResMarketVoList(resMarketService.selectMarketList(fndVo));
	    return retVo;
	}
	
	@ElService(key="SvcRESTWEMARL02")
	@RequestMapping(value="SvcRESTWEMARL02")
	@ElDescription(sub="selectList",desc="시장정보 단건 리스트를 조회 한다.")
	public ResMarketVo selectDetail(ResMarketVo vo) throws Exception {
	    return resMarketService.selectMarketSingleItem(vo);
	}
	
	@ElService(key="SvcRESTWEMARL03")
	@RequestMapping(value="SvcRESTWEMARL03")
	@ElDescription(sub="selectList",desc="시장정보 열람이력 리스트를 조회 한다.")
	public ResDownHistListVo selectList(ResDownHistVo fndVo) throws Exception {
	    ResDownHistListVo retVo = new ResDownHistListVo();
	    retVo.setResDownHistVoList(resMarketService.selectDownHistList(fndVo));
	    return retVo;
	}
	
	@ElService(key="SvcRESTWECADM01")
	@RequestMapping(value="SvcRESTWECADM01")
	@ElDescription(sub="saveItem",desc="시장정보 아이템을 저장한다.")
	public ResMarketVo saveItem(ResMarketVo vo) throws Exception {
      String reg_no = resMarketService.saveMarketItem(vo);
      vo.setReg_no(reg_no);
	  return vo;
    }
    
    @ElService(key="SvcRESTWECADM02")
	@RequestMapping(value="SvcRESTWECADM02")
	@ElDescription(sub="saveItem",desc="시장정보 열람이력을 저장한다.")
	public ResDownHistVo saveItem(ResDownHistVo vo) throws Exception {
      String mng_no = resMarketService.saveDownHistItem(vo);
      vo.setMng_no(mng_no);
	  return vo;
    }
	
	@ElService(key="SvcRESTWECADD01")
	@RequestMapping(value="SvcRESTWECADD01")
	@ElDescription(sub="deleteItem",desc="시장정보 아이템을 삭제한다.")
	public void deleteItem(ResMarketVo vo) throws Exception {
      resMarketService.deleteMarketItem(vo);
    }
}
