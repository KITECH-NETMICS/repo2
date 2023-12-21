package kr.re.kitech.biz.sup.cus.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.fin.std.service.FinStdVendMntService;
import kr.re.kitech.biz.fin.std.vo.XodfVendSaveVo;
import kr.re.kitech.biz.fin.std.vo.XodfVendVo;
import kr.re.kitech.biz.sup.cus.dao.SptCusInfoDAO;
import kr.re.kitech.biz.sup.cus.service.SptCustInfoRegService;
import kr.re.kitech.biz.sup.cus.vo.SptCustBaseInfoMntVo;
import kr.re.kitech.biz.sup.cus.vo.SptCustBaseInfoVo;
import kr.re.kitech.biz.sup.cus.vo.SptCustSrcVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 기술지원 고객정보 등록
 * @Class Name SptCustInfoRegServiceImpl.java
 * @Description 기술지원 고객정보 관련 처리를 담당하는 ServiceImpl
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/06/16   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/06/16
 * @version 1
 * @see
 * 
 */
@Service("sptCustInfoRegService")
public class SptCustInfoRegServiceImpl extends EgovAbstractServiceImpl implements SptCustInfoRegService {
	@Resource(name="generationServiceImpl")
	private GenerationService genService;
	
	@Resource(name="finStdVendMntService")
	private FinStdVendMntService vendService;
	
	@Resource(name="sptCusInfoDAO")
	private SptCusInfoDAO dao;
	
	/**
     * 고객정보 저장
     * @param SptCustBaseInfoVo
     * @return String
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.06.19.
     */
	public String saveSptCustBaseInfo(SptCustBaseInfoVo vo) throws KitechException{
		String custNo = vo.getCust_no();
		String vendNm = vo.getCmpy_nm_krchar();
		if(vendNm.length() > 0){
			vo.setCmpy_nm_krchar_odr(vendNm.replaceAll("㈜|\\(주\\)|주식회사|주\\)", "").trim());
		}
		
		if(custNo == null || "".equals(custNo.trim())){
			custNo = genService.getVendCode();
			vo.setCust_no(custNo);
			vo.setNatn_cd("FDA001");
			vo.setNatn_nm("대한민국");
			vo.setDom_excpt_clsf("RFK001");
			vo.setUse_yn("Y");
			vo.setCud_type("C");
			
			dao.insertSptCustBaseInfo(vo);
			
			if(!"RZB006".equals(vo.getCmpy_typ())){
				// 재무 거래처정보 등록
				XodfVendSaveVo vendSaveVo = new XodfVendSaveVo();
				vendSaveVo.setVendVo(this.getXodVend(vo));
				vendService.saveXodfVend(vendSaveVo);
			}
		}
		
		// 기업지원 고객정보에 있는지 체크
		//if(dao.selectSptCustBaseInfoCnt(custNo) == 0){
		dao.updateSptCustBaseInfoByVend(vo);
		//}
		
		return custNo;
	}
	
	/**
     * 재무 거래처정보 Vo 변환
     * @param SptCustBaseInfoVo
     * @return XodfVendVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.06.19.
     */
	private XodfVendVo getXodVend(SptCustBaseInfoVo vo) throws KitechException{
		XodfVendVo vendVo = new XodfVendVo();
		vendVo.setVend_cd(vo.getCust_no());
		vendVo.setSys_clsf("XAA005");
		vendVo.setBsns_psn_regst_no(vo.getBsns_psn_regst_no());
		if("RZB006".equals(vo.getCmpy_typ())){
			vendVo.setVend_clsf("FBA004");
			vendVo.setCorp_resid_no(vo.getBsns_psn_regst_no());
		}else{
			vendVo.setVend_clsf("FBA001");
			vendVo.setBsns_psn_regst_no(vo.getBsns_psn_regst_no());
		}
		vendVo.setVend_abbr(vo.getCmpy_nm_krchar());
		vendVo.setVend_fulnm(vo.getCmpy_nm_krchar());
		vendVo.setReprs_psn_nm(vo.getReprs_psn());
		vendVo.setZero_taxrts_yn("Y");
		vendVo.setPostmt_no(vo.getCmpy_post_no());
		vendVo.setAddr(vo.getCmpy_addr());
		vendVo.setDetls_addr(vo.getCmpy_addr_detls());
		vendVo.setBizcatg(vo.getBizcatg());
		vendVo.setBiztyp(vo.getItem());
		vendVo.setTel_no(vo.getCmpy_reprs_tel());
		vendVo.setFax(vo.getCmpy_fax_no());
		vendVo.setNatn_cd(vo.getNatn_cd());
		vendVo.setDom_excpt_clsf(vo.getDom_excpt_clsf());
		vendVo.setPur_use_yn("N");
		vendVo.setResch_use_yn("N");
		vendVo.setTechsup_use_yn("Y");
		vendVo.setCmpy_typ(vo.getCmpy_typ());
		vendVo.setUse_yn(vo.getUse_yn());
		
		return vendVo;
	}
	
	/**
     * 기술지원내역등록 고객정보조회
     * @param String custNo
     * @return SptCustBaseInfoVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.06.20.
     */
	public SptCustBaseInfoVo selectSptCustBaseInfo(SptCustSrcVo vo) throws KitechException{
		return dao.selectSptCustBaseInfo(vo);
	}
	
	/**
     * 기업정보관리 조회
     * @param SptCustSrcVo
     * @return List<SptCustBaseInfoMntVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.08.04.
     */
	public List<SptCustBaseInfoMntVo> selectSptCustBaseInfoList(SptCustSrcVo vo) throws KitechException{
		return dao.selectSptCustBaseInfoList(vo);
	}
}
