package kr.re.kitech.biz.xom.core;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.re.kitech.biz.api.client.ZeusClient;
import kr.re.kitech.biz.res.exc.dao.ResDepstMntDAO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		  "file:src/main/resources/inswave/spring/context-common.xml"
		, "file:src/main/resources/inswave/spring/context-properties.xml"
		, "file:src/main/resources/inswave/spring/context-sqlMap.xml"
		, "file:src/main/resources/inswave/spring/context-transaction.xml"
		, "file:src/main/resources/inswave/spring/context-validator.xml"
		, "file:src/main/resources/inswave/spring/mybatis-config.xml"
		, "file:src/test/resources/inswave/spring/context-datasource.xml"
		, "file:src/test/resources/inswave/spring/context-inswave.xml"
		, "file:src/main/webapp/WEB-INF/config/**/*.xml"
		
})
public class FinTest {
	@Resource(name="zeusFindClient")
	private ZeusClient zeusClient;
	
	@Resource(name="resDepstMntDAO")
	private ResDepstMntDAO dao;
	
	@Test
	public void test(){
//		
//		int cnt = DateUtil.getDaysBetween("20220506", "20220510");
//		System.out.println("==================== cnt : " + cnt);
//		CgsAnnlHoliVo vo = new CgsAnnlHoliVo();
//		vo.setAnal_yr("2022");
//		vo.setCur_ymd("20220811");
//		//vo.setSyspayno("19916124");
//		vo.setRegst_syspayno("20130576");
		
		//System.out.println("-------------- List : " + dao.selectTest(vo));
		
//		AccountVerfVo vo = new AccountVerfVo();
//		vo.setSyspayno("20130576");
//		vo.setBank_cd("004");
//		vo.setBankaccnt_no("331210137728");
//		
//		vo = accVerfService.proccessAccountVerf(vo);

//		Document doc = ctrlService.getSnapShotDoc("C86202206AEA");
		
//		List<String> grpCodes = new ArrayList<String>();
//		grpCodes.add("FAA");
//		CodeCacheManager.getInstance().load();
//		CodeVo vo = CodeCacheManager.getInstance().getCode("FAA", "FAA020");		
//		System.out.println("------------------ mngmt_item_1 : " + vo.getMngmtItem1());
		
//		CtrCvnTripSrcVo vo = new CtrCvnTripSrcVo();
//		vo.setReq_no("C68202201214");
//		String StDaytm = "202209021000";		
//		vo.setSt_daytm(StDaytm.substring(0,4) +"-" + StDaytm.substring(4,6) +"-" + StDaytm.substring(6,8) + " " + StDaytm.substring(8,10) + ":" + StDaytm.substring(10,12));
		
		//String aa = DateUtil.parseDate("20220902100000", "yyyy-MM-dd HH:mm:ss").toString();
		//dao.updateCtrcvntest(vo);
		//System.out.println("-------------- aa : " + DateUtil.parseDate("20220902100000", "yyyy-MM-dd HH:mm:ss"));
		
//		try {
//			boolean chkRoleYn = accntService.checkRole("F203", "1001001#1003002#1010102#1001113#1006113#1015117#1001215#1001221#1019101#1019102#1019201#1014212#1004107#");
//			System.out.println("--------------- chkRoleYn : " + chkRoleYn);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		String roleCodes = "#1000001#1001001#1003002#";
//		String[] arryRoleCode = roleCodes.split("[#]");
//		List<String> roleCodeList = Arrays.asList(arryRoleCode);
//		HashSet<String> roleSet = new HashSet<>();
//		for(int i=0; i<arryRoleCode.length; i++){
//			if(!"".equals(arryRoleCode[i].trim()) && !"1000001".equals(arryRoleCode[i].trim())){
//				roleSet.add(arryRoleCode[i]);
//			}
//		}

//		for(int j=0; j<roleCodeList.size(); j++){
//			if("".equals(roleCodeList.get(j).trim()) || "1000001".equals(roleCodeList.get(j).trim())){
//				roleCodeList.remove(j);
//			}
//		}		
		
//		System.out.println("--------------- roleSet : " + roleSet.toString());
//		
//		arryRoleCode = roleSet.toArray(new String[0]);
//		for(String roleCode : arryRoleCode){
//			System.out.println("--------------- roleCode : " + roleCode);
//		}

//		String date = DateUtil.formatDate("20221116", "-");
//		System.out.println("--------------- date : " + date);

//		CtrTripSrcVo vo = new CtrTripSrcVo();
//		vo.setPosi_clsf("FBG020");
//		vo.setStart_region("FAU015");
//		vo.setArriv_region("FAU059");
//		
//		CtrDomPathVo pathVo = tripDao.selectCtrDomPathTripFee(vo);
//		System.out.println("--------------- biztrip_fee : " + pathVo.getBiztrip_fee());
//		System.out.println("--------------- rmk : " + pathVo.getRmk());

//		KtxIssuMstrComVo comVo = new KtxIssuMstrComVo();
//		comVo.setIssu_seqno("F24202250010");
//		finPopService.deleteKtxIssuMstr(comVo);

//		Map<String,String> map = new HashMap<>();
//		map.put("prj_nm", "제조산업의 디지털전환 활성화를 위한 지속가능한 실행전략 수립");
//		map.put("resch_rspns_main_nm", "김종현");
//		map.put("tot_resch_prd_orign_ymd", "20230101");
//		map.put("tot_resch_prd_cls_ymd", "20231231");
//		//map.put("resch_rspns_main_mail", vo.getResch_rspns_main_mail());
//		map.put("resch_rspns_main_mail", "eipleeyh@kitech.re.kr");
//		
//		mailService.sendBsnsSeltRst(map);

		//String reqNo = null;
		//System.out.println("--------------- reqNo length : " + reqNo.length());
		
//		String vendNm ="주)가나다상사";
//		vendNm = vendNm.replaceAll("㈜|\\(주\\)|주식회사|주\\)", "");
//		
//		System.out.println("--------------- vendNm : " + vendNm.trim());

//		Map<String,String> params = new HashMap<>();
//		params.put("id", "123");
//		params.put("name", "홍길동");
//		JSONObject jsonParams = new JSONObject(params);
//			
//		System.out.println("--------------- jsonParams : " + jsonParams.toString());	
//		System.out.println("--------------- id : " + jsonParams.getString("id"));	

//		try {
//			String ret = zeusClient.sendRequestMnt("NFEC-2023-06-288266");
//			System.out.println("--------------- ret : " + ret);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		ResBgRecveVo vo = new ResBgRecveVo();
//		vo.setAccnt_no("PCL23010");
//		vo.setDepst_odr(2);
//		vo.setUnusual_item("테스트입니당11111");
//		vo.setDepst_schdl_amt(2000000);
//
//		dao.updateResBgRecveTest(vo);
		
//		int amt1 = NumberUtils.toInt("", 0);
//		int amt2 = NumberUtils.toInt("123456", -1);
//		
//		System.out.println("--------------- amt1 : " + amt1);
//		
//		System.out.println("--------------- amt2 : " + amt2);

		Set<String> set = new HashSet<>();
		set.add("pur01");
		set.add("pur02");
		set.add("pur03");
		set.add("pur01");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
