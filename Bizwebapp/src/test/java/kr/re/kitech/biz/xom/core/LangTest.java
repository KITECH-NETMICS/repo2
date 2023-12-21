package kr.re.kitech.biz.xom.core;

import java.io.File;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import javax.swing.text.MaskFormatter;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.inswave.elfw.util.DateUtil;

import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.xom.core.vo.CodeVo;

public class LangTest {



	public static void main(String[] args) throws Exception{
	
	    String input1 = "/ui/apr/example/path.xml"; // 여기에 검사할 문자열을 지정하십시오.
	    String input2 = "/ui/xom/example/path.xml";
	    String input3 = "/ui/zam/example/path.xml";
	    String input4 = "/ui/fin/example/path.xml";

        Pattern pattern = Pattern.compile("^\\/ui\\/(?!apr\\/|xom\\/|zam\\/).*");
        Matcher matcher1 = pattern.matcher(input1);
        Matcher matcher2 = pattern.matcher(input2);
        Matcher matcher3 = pattern.matcher(input3);
        Matcher matcher4 = pattern.matcher(input4);

        System.out.println(matcher1.matches() ? "input1 true : 권한 체크 필요" : "input1 false : 권한 체크 제외");
        System.out.println(matcher2.matches() ? "input2 true : 권한 체크 필요" : "input2 false : 권한 체크 제외");
        System.out.println(matcher3.matches() ? "input3 true : 권한 체크 필요" : "input3 false : 권한 체크 제외");
        System.out.println(matcher4.matches() ? "input4 true : 권한 체크 필요" : "input4 false : 권한 체크 제외");
	
		// new LangTest().testString();
		
		// new LangTest().testProgress();
		
		// new LangTest().testGroupBy();
//		StringUtils.getCommonPrefix(strs)
//		String str = StringUtil.convertToDBColumnString("dfsafasfdsa");
//		System.out.println(str);
//		
//		ServiceVo service = null;
//		ServiceVo service2 = (ServiceVo)service;
//		
//		System.out.println(service2);
		
		
		String str = "{\"SUCCESS_YN\":\"Y\",\"INST_ID\":305}";
		
		Map<String,String> map = new ObjectMapper().readValue(str, Map.class);
		System.out.println(map);
		
		String reqNo = "C55202200123";
		String saveXmlUrl = String.format("%s_%s.snap", DateUtil.getNow("yyyy/M/"), reqNo);
		System.out.println(saveXmlUrl);
		
		String str11 = "1006060100#1006060200#1006060300#1006060400#1006060500#1006060600#1006060800#1006060700#1006061100#1006061200#1006061300#1006061400#1017051600#1017051700#1006061900#1015040200#1015040500#1015050200#1006062000#1014030100#1014030300#1014030500#1014030600#1014030700#1014050200#1014050400#1014050600#1014050700#1014050800#1014050900#1014051000#1014051100#1014051300#1014051400#1014020100#1014020200#1014020300#1014020400#1014020500#1014020600#1014020700#1014020800#1014020900#1014021100#1014021200#1014040300#1014040400#1014041200#1014041300#1014041600#1014041800#1014042000#1014042100#1006050100#1006050200#1006050300#1006050400#1006050500#1006050600#1006050800#1006050900#1006051100#1006051400#1006051700#1006052000#1006052100#1006052500#1006052600#1006040700#1006040800#1006041100#1006041200#1006041300#1006041500#1006041600#1006041700#1006041800#1006041900#1006042000#1006042100#1006042200#1006042600#1006042700#1006043300#1006043400#1006043500#1006043600#1006044000#1013010000#1013020000#1013030000#1013020100#1013020200#1013020300#1013020400#1013030100#1013030200#1013030300#1013030400#1013030500#1013030600#1013020500#1013020600#1013020700#1013020800#1013020900#1002010300#1002011000#1002020100#1002020200#1002020300#1002020400#1002020500#1002021500#1002021700#1002030900#1002031000#1002031300#1002032500#1002032600#1002032700#1002032800#1002032900#1002033000#1002040400#1002040500#1002040600#1002040800#1002041000#1002041200#1002041300#1002041500#1002041600#1002070200#1002070300#1002070400#1002070600#1002070900#1002071300#1002080200#1002080400#1002061000#1002061100#1001011300#1001011400#1001020400#1001020500#1001020600#1001020700#1001020800#1001020900#1001030300#1001030400#1001030600#1001030700#1001030800#1001031000#1001040600#1001040800#1004020100#1001041100#1004020200#1004020300#1001050400#1001050500#1001060500#1004021100#1004021300#1004021500#1001080900#1001081000#1001081100#1001081200#1001081300#1001081400#1001081500#1001120300#1001021000#1001100500#1006062100#1001050600#1004020400#1004020500#1004020600#1004020700#1004020800#1004020900#1006010100#1006010200#1006010300#1006010400#1006010600#1006010700#1015010200#1015010400#1015010900#1018010200#1018050000#1018020100#1018020200#1018020300#1018020400#1018020600#1018020800#1018030100#1018030200#1018030300#1018030400#1018030800#1006062200#1018031000#1006062300#1010110000#1002022600#1002022700#1009010000#1010090101#1010090102#1010090104#1002080600#1015020100#1015020300#1015020400#1015020600#1015020700#1015020800#1015021000#1015021100#1015021200#1015021300#1015021400#1015021500#1015021600#1015021700#1015021800#1004021200#1004021400#1004021000#1002090100#1002090200#1002090800#1002090900#1002091100#1002091200#1002091300#1002091400#1002041900#1018010500#1018010600#1018031100#1018010700#1018010800#1018040300#1018040400#1018040500#1018040600#1018040700#1018021200#1002011900#1002012000#1015080600#1015080200#1015080700#1003020100#1003060300#1003060700#1003060800#1003060900#1003061000#1003061100#1003061200#1003061300#1003061500#1003061600#1003061700#1003061800#1003061900#1003062000#1003062100#1003062200#1003062300#1003062500#1003062600#1003062700#1003062800#1003062900#1003120100#1003120200#1003120300#1003120400#1003120500#1003120600#1003120700#1003120800#1003120900#1003121000#1003121100#1003121200#1003121300#1003121400#1003121500#1003070100#1003130500#1003100300#1003100400#1002022800#1002022900#1015021900#1018021300#1018021400#1002072600#1001031400#1001031500#1017053300#1017053400#1002072500#1001031700#1002080100#1002080300#1001041400#1002042000#1002033200#1002091800#1002073100#1002042200#1003060100#1002023100#1002023200#1006044300#1015080300#1015090000#1015090100#1015090300#1015090400#1015090600#1015090700#1015090900#1015091000#1015091100#1015091200#1018022100#1018022200#1001170500#1003021900#1002051400#1002073500#1003090500#1002023300#1002023400#1001101700#1001101800#1002023700#1018070000#1018070100#1018070200#1018070300#1001101900#1002033300#1002073700#1005060100#1005060300#1005060600#1005060700#1005040100#1005040200#1005040400#1005040500#1005040800#1005040900#1005041400#1005100804#1005100803#1005100810#1005100809#1005100807#1005100808#1005100802#1005100400#1005100501#1005100502#1005011100#1005011200#1005011300#1005011400#1005012100#1005012000#1005011900#1005011500#1005011600#1005011700#1005011800#1005010500#1005010600#1005010700#1005010800#1005010900#1005011000#1005100801#1005100903#1002073800#1005101400#1003022100#1005012500#1005041600#1005100904#1014030800#1005060800#1005100905#1005010100#1005010400#1005120400#1005120500#1005130400#1005101500#1005101600#1005101700#1003022200#1005100907#1005130100#1005120100#1005100100#1005052600#1005052300#1005050200#1005050500#1005050100#1005050400#1005050700#1005050900#1005052500#1005051300#1005051500#1005051700#1005052000#1005110100#1005110500#1005140200#1005140300#1005140400#1005030800#1005030900#1005031000#1005031100#1005031200#1005031300#1005030600#1005030100#1005031400#1005031700#1005031900#1005032900#1005033100#1005060900#1005061000#1001021200#1003121600#1003121700#1005091300#1005090900#1005090400#1005090300#1005090500#1005090100#1005090200#1001042800#1005033600#1005033700#1005033601#1005033602#1005033603#1005033604#1005033605#1005033607#1005033609#1005033501#1005033503#1005033509#1005033506#1005033502#1005033511#1005033800#1002022400#1002022500#1002023800#1002023900#1002024000#1002024100#1002024200#1002024300#1001102200#1001102300#1001102400#1001102500#1001091000#1005150100#1005150200#1001102600#1001102700#1005150600#1005150900#1001102800#1001102900#1001103000#1001103100#1001103200#1001103300#1050040400#1014021300#1018031200#1005100811#1005051800#1005051900#1005052100#1005150700#1005150800#1005151000#1006053200#1002034100#1003131500#1002024400#1002024500#1002012300#1001103500#1005102000#1002012400#1003110000#1003110700#1003110200#1003110500#1003110800#1005100812#1005100813#1005160100#1005160200#1005160500#1005160600#1006062400#1001103600#1005170000#1003121800#1005170400#1005100901#1001050700#1003010700#1005033513#1001043700#1003022300#1001103700#1001103800#1001103900#1003132000#1003132100#1003131900#1001071600#1001071700#1018010900#1018031300#1001051000#1001032000#1001011700#1001104200#1001081600#1018031400#1018031500#1015080800#1018022400#1002024600#1018022500#1002024700#1002042300#1003022400#1001072700#1005012800#1001104300#1003030400#1001081700#1003022600#1015100000#1015100200#1015100300#1015100400#1015100500#1015100600#1015100700#1003132200#1002023500#1002074400#1002074500#1010090107#1016320100#1016330200#1016330400#1016330500#1016330900#1016331000#1016331700#1016331800#1016332100#1016332200#1016332300#1016332400#1016332500#1016332600#1016332800#1016332900#1004021800#1001104400#1005080100#1005080200#1005080400#1005080500#1005080600#1005080700#1005080800#1005080900#1016320500#1021090200#1021090300#1021090400#1021090500#1001071400#1021090600#1021090700#1018100000#1002082100#1006053300#1006053400#1006053500#1001072800#1005033510#1005033515#1003090200#1003091200#1016320700#1016320900#1018031800#1018031900#1018032000#1018032100#1005060400#1005061100#1018040800#1003090400#1018011100#1018011200#1060050700#1060050800#1010220000#1003022800#1003144200#1020040000#1020050000#1018011300#1002022801#1018022800#1018022900#1003144001#1018011400#1018011500#1003062901#1020070000#1010250000#1060251900#1003110900#1060252400#1060252200#1060252300#1017041600#1021090800#1060150500#1003022900#1016333000#1018022901#1002024900#1002025000#1002025100#1060180100#1006044500#1016333100#1016333200#1016333300#1016333400#1018022902#1060151100#1004080500#1060280200#1060280300#1060280400#1060280500#1060280600#1060290300#1060052000#1004080700#1060280700#1060280800#1060280900#1004080800#1004080900#1004081000#1004081100#1004081200#1005180000#1005180200#1005180400#1005180500#1005180300#1004081300#1006044700#1004081400#1004081500#1004081600#1004081700#1002025200#1016320400#1005180600#1006044800#1004080300#1004080100#1004080200#1004080400#1060250800#1005041900#1003023000#1003023100#1003023200#1003023300#1003023400#1003023500#1003023600#1003023700#1003023800#1003023900#1003024000#1003024100#1003024200#1003024300#1003024400#1003024500#1005042000#1070024200#1004021900#1004022000#1018023100#1016333800#1016333600#1005033512#1005033508#1005033507#1016333900#1016334000#1016334100#1016334200#1016334300#1016334400#1016334500#1016334600#1016334700#1016334800#1016334900#1016335000#1016335100#1016335200#1016335300#1016335400#1016335500#1016335600#1016335700#1016335800#1016335900#1016336000#1016336100#1016336200#1016336300#1016336400#1016336500#1016336800#1070024800#1070062800#1016336900#1016337000#1016337100#1016337400#1016337500#1018011600#1018011700#1016337600#1016337700#1016337800#1016337900#1016338000#1016338100#1016338200#1016338300#1016338400#1016338500#1016338600#1016338700#1016338900#1016339000#1070010100#1016332000#1016334400#1016350000#1016350100#1060252100#1016350200#1016339300#1016350500#1016350600#1016350800#1016350900#1016351000#1016351100#1016339400#1002025300#1016351300#1016351200#1016351400#1016351500#1070043800#1016321400#1015100100#1016339500#1070044100#1070044200#1004022100#1004022200#1016321700#1004022300#1015040900#1002025400#1002025500#1006062800#1006062900#1060151300#1018023300#1015100900#1002024800#1010160000#1010140300#1010140900#1010210000#1018023400#1006090800#1006100400#1002012500#1002012600#1002023600#1001032100#1014030900#1018120300#1018120400#1018120100#1018120600#1014031000#1018040900#1006063600#1006063000#1005033517#1005033518#1005033516#1001170600#1006053600#1006053700#1005033520#1005033519#1018023500#1018023600#1006091000#1006091100#1016339600#1003063600#1003063700#1001032700#1005033606#1005033608#1018110100#1018110300#1005033610#1018120700#1001041000#1018041000#1005070100#1005070200#1005070300#1005070400#1005070600#1005070700#1005070800#1005070900#1005071000#1005071200#1005070500#1005071100#1001021500#1002140500#1006110000#1006110200#1006110100#1006110300#1006110400#1006110500#1006110700#1006110800#1018010300#1018021500#1018021600#1018023200#1001051500#1006045200#1001191400#1001191500#1006044100#1018130100#1018130500#1018130600#1001044100#1004022400#1002140700#1003132700#1003132800#1006120000#1006120100#1006120200#1006120300#1005033521#1005033522#1004022500#1005021500#1005021600#1005020100#1005020300#1005020500#1005020600#1005020700#1005020800#1005020900#1005021100#1005020400#1003060400#1003060200#1003060500#1003063000#1005042100#1018030900#1006091400#1003121900#1003122000#1003170200#1003170300#1016339800#1003170500#1006110900#1005033900#1005034000#1005034100#1005034200#1010310000#1005012900#1018140000#1018140200#1018140100#1005042200#1005033523#1003111000#1018140500#1003110100#1018140600#1018140700#1018140300#1018140400#1005160900#1005021700#1002130500#1002130100#1002131000#1002131300#1002131100#1010141250#1006091500#1018024000#1018024100#1070025000#1003025100#1001012500#1006091600#1006091700#1015061200#1016322000#1018024200#1018032300#1018032400#1001012600#1018032500#1018032600#1006091900#1006092000#1018024300#1002074700#1018140800#1018140900#1018024400#1002012900#1018021000#1018010400#1019030100#1019030200#1019030400#1003063300#1003063200#1003061400#1003062400#1003063400#1003150300#1003150500#1019030600#1019030300#1018023700#1018011800#1010330000#1005102200#1019030900#1006092200#1006120400#1010340000#1006092400#1002140800#1015110600#1006100500#1015110700#1016331200#1016338800#1016333700#1016339200#1016339700#1070025300#1016360000#1016360100#1016360200#1016360300#1001012700#1001060600#1019010100#1006063700#1018041100#1015022100#1003180600#1010350000#1014060100#1014060200#1015091300#1005033524#1014060500#1015111000#1018020500#1001045000#1018023800#1018023900#1018032200#1006045500#1018130200#1018130300#1001210700";
		
		System.out.println(str11.split("[#]").length);
		
		String syspayno = "kitech_20170701_eipparkji";
		System.out.println(syspayno.substring(2));
		String token = "20170701#eipparkji";
		
		
		String encoded = "a2l0ZWNoIzIwMTYwMzQ4Iw=="; // encoding(token);
		
		String decoded = decoding(encoded);
		
		System.out.println("최종 결과값 : "+ decoded.substring(9));
		
//		
//		String now = String.format("%s_%s.snap", DateUtil.getNow("yyyy/M/"), "C55202200001");
//		
//		System.out.println(now);
//		String str111 = "<approv action=\"approvOutWork\" task=\"kitech.ccs.cws.service.WorkSystemService\">"
//				    + "<req_no value=\"C98202201D5D\"/>"
//				    + "<start_ymd value=\"20220510\"/> </approv>";
//
//		System.out.println(str111.replaceAll("<(\\w*)\\s*(value=\"(.*)\")/>", "<$1>$3</$1>"));
//		
//		
//		String xmlUrl = "/was/IMIS_FILES/uengine/snapshot/temp/2022/7/_C202200001.snap";
//		String savePath = xmlUrl.substring(0, xmlUrl.lastIndexOf('_'));
//		
//		System.out.println("savePath: " + savePath);

//		UUID uuid = UUID.randomUUID();
//		System.out.println(uuid.toString());
//		
//		String secretKey = "Secret-Authorization-Kitech-Eip3-James-Walker";
//		String temp = new String(Base64.getEncoder().encode(secretKey.getBytes(StandardCharsets.UTF_8)));
//		System.out.println(temp);


		
//		OkHttpClient client = new OkHttpClient().newBuilder().build();
//		RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
//		  .addFormDataPart("user","flowctrl")
//		  .addFormDataPart("password","flowctrl")
//		  .build();
//		Request request = new Request.Builder()
//		  .url("http://bpmdev.kitech.re.kr/flowcontrol/authenticate")
//		  .method("POST", body)
//		  .build();
//		Response response = client.newCall(request).execute();
//		String result = response.peekBody(Long.MAX_VALUE).string();
//		if (0 == result.indexOf("Bearer")) {
//			System.out.println("인증 성공");
//		}
//		
//		System.out.println(response.peekBody(Long.MAX_VALUE).string());
		
		UUID uuid = UUID.randomUUID();
		System.out.println(uuid.toString());
		
		AprVo aprVo = new AprVo();
		aprVo.setReqNo("C55202100001");
		Field[] declaredFields = aprVo.getClass().getDeclaredFields();
		for (Field field : declaredFields) {
			//System.out.println(field.getName());
			if ("ReqNo".equals(field.getName())) {
				field.setAccessible(true);
				System.out.println(field.getName() + " : " + field.get(aprVo));
			}
		}
		String logDir = "accessLogs";
		String elServerId = "nbiz";
		
		
		
		String yyyymmdd = new SimpleDateFormat("yyyy-MM-dd").format(new Date()).replace("-", File.separator);
		System.out.println("==========> : " + yyyymmdd);
		String logDirectory = logDir + "/" + (0 < elServerId.length() ? elServerId + "/" : "") + yyyymmdd + "/";		
		System.out.println(logDirectory);
		
		
		String contentType = "application/json;charset=utf-8";
		int position = contentType.lastIndexOf("utf-8");
		if (-1 < position) {
			String temp = contentType.substring(0, position);
			contentType = temp + contentType.substring(position).toUpperCase();
		}
		System.out.println(contentType);
		
		String param = "idx=1112&delegatorcode=mklee&startdate=20221114&enddate=20221114&ischkdate=1&isactivated=1&worktype=I";
		String encodedString = Base64.getEncoder().encodeToString(param.getBytes());
		
		System.out.println(encodedString);
		// aWR4PTExMTImZGVsZWdhdG9yY29kZT10ZXN0MDEmc3RhcnRkYXRlPTIwMjAxMjMwJmVuZGRhdGU9MjAyMDEyMzEmaXNjaGtkYXRlPTEmaXNhY3RpdmF0ZWQ9MSZ3b3JrdHlwZT1J
		
		
		String temp = null;
		
		System.out.println(String.valueOf(temp));


		String str2 = "";
		String str3 = null;
		String str4 = " ";
		
		System.out.println(StringUtils.isEmpty(str2));
		System.out.println(StringUtils.isEmpty(str3));
		System.out.println(StringUtils.isEmpty(str4));

		String[] serviceCodes = {"A001","A002","A003"};
		String filter = "(|(serviceCode=" + StringUtils.join(serviceCodes, ")(serviceCode=") + "))";
		System.out.println(filter);
		
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime : " + localDateTime);
		// localDateTime : 2022-01-07T23:37:29.536
		
		String convertedDate1 = localDateTime.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm:ss"));
		System.out.println("convertedDate1 : " + convertedDate1);
		// convertedDate1 : 2022년 01월 07일 23:37:29
		
		String convertedDate2 = localDateTime.format(DateTimeFormatter.ofPattern("MM월 dd일 E요일"));
		System.out.println("convertedDate2 : " + convertedDate2);
		// convertedDate2 : 01월 07일 금요일
		
		String convertedDate3 = localDateTime.format(DateTimeFormatter.ofPattern("a KK:mm:ss"));
		System.out.println("convertedDate3 : " + convertedDate3);
		// convertedDate3 : 오후 11:37:29
		

		
		long daysBetween = ChronoUnit.MONTHS.between(
				LocalDate.parse("20160831", DateTimeFormatter.ofPattern("yyyyMMdd")), 
				LocalDate.parse("20161130",DateTimeFormatter.ofPattern("yyyyMMdd")));
				
		 System.out.println(daysBetween);
		 
		 
		 String str1 = "C7620201111";
		 System.out.println(str1.substring(0, 3));

	}
	
	/**
     * 인코딩
     */
	public static String encoding(String token){
		System.out.println("인코딩 원본 : " + token);
		token = "kitech#" + String.join("", token);
		System.out.println("1차 인코딩 : " + token);
		List<String> arrays = Arrays.asList(token.split(""));
		Collections.reverse(arrays);
		System.out.println("2차 인코딩 : " + arrays);

		return Base64.getEncoder().encodeToString(String.join("", token).getBytes());
	}
	
	/**
     * 디코딩
     */
	public static String decoding(String token){
		System.out.println("디코딩 원본 : " + token);
		token = new String(Base64.getDecoder().decode(token));
		List<String> arrays = Arrays.asList(token.split(""));
		Collections.reverse(arrays);
		System.out.println("1차 디코딩 : " + String.join("", arrays));
		
		token = token.replaceAll("kitech#","");
		System.out.println("2차 디코딩 : " + token);
		

		return token;
	}
	
		
	public void testGroupBy(){
		CodeVo code1 = new CodeVo(); code1.setGrpCd("HWT"); code1.setGrpNm("근무제코드"); code1.setComCd("HWT001"); code1.setComNm("유연근무제");
		CodeVo code2 = new CodeVo(); code2.setGrpCd("HWT"); code2.setGrpNm("근무제코드"); code2.setComCd("HWT002"); code2.setComNm("표준근무제");
		CodeVo code3 = new CodeVo(); code3.setGrpCd("HAG"); code3.setGrpNm("예외코드"); code3.setComCd("HAG001"); code3.setComNm("예외1");
		CodeVo code4 = new CodeVo(); code4.setGrpCd("HAG"); code4.setGrpNm("예외코드"); code4.setComCd("HAG002"); code4.setComNm("예외2");
		CodeVo code5 = new CodeVo(); code5.setGrpCd("HAG"); code5.setGrpNm("예외코드"); code5.setComCd("HAG003"); code5.setComNm("예외3");
		CodeVo code6 = new CodeVo(); code6.setGrpCd("XAD"); code6.setGrpNm("결재상태"); code6.setComCd("XAD010"); code6.setComNm("작성중");
		CodeVo code7 = new CodeVo(); code7.setGrpCd("XAD"); code7.setGrpNm("결재상태"); code7.setComCd("XAD020"); code7.setComNm("결재중");
		CodeVo code8 = new CodeVo(); code8.setGrpCd("XAD"); code8.setGrpNm("결재상태"); code8.setComCd("XAD100"); code8.setComNm("결재완료");
	
		List<CodeVo> codes = Arrays.asList( code1, code2, code3, code4, code5, code6, code7, code8);
		
		
		
		Map<String, List<CodeVo>> alls =  codes.stream().collect(Collectors.groupingBy( code -> "CommonCode_" + code.getGrpCd()));
		System.out.println("=======================] 전체 공통 코드 [ ==========================");
		alls.forEach( (key, value) -> {
			System.out.println(key +" : "+ value);
		});		
		
		List<String> grpCodes = Arrays.asList( "HWT", "HAG");
		Map<String, List<CodeVo>> partials =  codes.stream().filter( code -> grpCodes.contains( code.getGrpCd())).collect(Collectors.groupingBy( code -> "CommonCode_" + code.getGrpCd()));
		
		System.out.println("=======================] 목표 공통 코드 [ ==========================");		
		partials.forEach( (key, value) -> {
			System.out.println(key +" : "+ value);
		});			
		
		
        // Map<String, List<CodeVo>> results = codes.stream().collect(groupingBy( code -> ));
        		
        		
//                .collect(groupingBy(dnc -> dnc.grpCd, TreeMap::new, summingLong(dnc -> dnc.count)))
//                .entrySet().stream()
//                .map(entry -> new DateAndCount(entry.getKey(), entry.getValue()))
//                .collect(Collectors.toList());
		
		
	}
		
	
	public void testProgress(){
        char[] animationChars = new char[] { '|', '/', '-', '\\' };

        for (int i = 0; i <= 100; i++) {
            System.out.print("Processing: " + i + "% " + animationChars[i % 4] + "\r");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Processing: Done!          ");
	}
	
	
	public void testString(){

	
		LangTest test = new LangTest();
	
        String pattern = "(00)*00$"; //숫자만
        String value = "12345670000"; //대상문자열
    
        boolean regex = Pattern.matches(pattern, value);
        // System.out.println(regex);
        
        
        SortedSet<String> rets = new TreeSet<>();
        List<String> serviceCodes = new ArrayList<>();
        serviceCodes.add("1022020000");	// 10 00 00 00 00 , 10 22 00 00 00 
        serviceCodes.add("1001090200");	// 10 00 00 00 00 , 10 01 00 00 00 , 10 01 09 00 00
        serviceCodes.add("1005033501");
        serviceCodes.add("1005033509");
        serviceCodes.add("1005033502");
        
        
        // System.out.println( Arrays.toString(value.split(".*{2}")));


        final int DIGITS = 2;        
        final int MAX = 5;
        serviceCodes.forEach( serviceCode -> {

        	// 배열로 생성
	        assert serviceCode.length() % DIGITS == 0;
	        List<String> codeList = new ArrayList<>();
	        for (int index = 0; index < serviceCode.length() / DIGITS; index++){
	            codeList.add( serviceCode.substring(index * DIGITS, index * DIGITS + DIGITS));
	        }

	        System.out.print( codeList + " >>> ");

	        int level = (-1 != codeList.indexOf("00")) ? codeList.indexOf("00") : MAX;
	        SortedSet<String> parents = test.getParentServiceCode( new TreeSet<>(), codeList, level);
	        
	        rets.addAll(parents);
	        
	        System.out.println(rets.contains("1001090200"));
	        
	        
        	// rets.add( serviceCode.replaceAll( "(00)*00$", ".*"));
        	
        	System.out.println( rets);
        });
        
        
        
         
/*
        rets.forEach( element -> {
        	System.out.println("============================================");
        	serviceCodes.forEach(value -> {
        		// String compareValue = 0 < element.indexOf('*') ? element.substring(0, element.indexOf('*')) : element; 
        		System.out.print(element+ "==" + value + ": "+ Pattern.matches(element, value));
        		
        	});
        });
*/
        
        System.out.println("\n============================================");
        //System.out.println( Pattern.matches("100509.*", "1005090000"));

	
	}
	
	
	public String masking(String data) throws ParseException{
        // 마스크 예제
        String mask = "##########";
        MaskFormatter mf = new MaskFormatter(mask);
        mf.setPlaceholderCharacter('0');
        mf.setValueContainsLiteralCharacters(false);
        return mf.valueToString(data);	
	}
	
	public SortedSet<String> getParentServiceCode( SortedSet<String> parents, List<String> codeList, int level){
        String serviceCode = "";
        for (int index = 0; index < codeList.size(); index++){
        	serviceCode += (level > index) ? codeList.get(index) : "00";
        }
        parents.add(serviceCode);
        // 재귀 호출
        if (1 < level){
        	this.getParentServiceCode( parents, codeList, --level);
        }
        return parents;
	}


	/**
     * 서비스코드 10자리를 2글짜 단위로 파싱하여 String[5] 배열의 요소로 삽입 후 반환
     */
	public String[] serviceCodeToFiveLevelArray(String tmp) {
		String[] levels = new String[5];
		levels[0] = tmp.substring(0, 2);	// level 0
		levels[1] = tmp.substring(2, 4);	// level 1
		levels[2] = tmp.substring(4, 6);	// level 2
		levels[3] = tmp.substring(6, 8);	// level 3
		levels[4] = tmp.substring(8, 10);	// level 4
		return levels;
	}
	
	/**
     * 2자리 5개의 배열 요소중 '00' 이 존재하는 요소의 첫번째 인덱스 반환 
     */
	public int getlevelIndexInServiceCode(String[] levels) {
		int find = -1;
		for (int i = 0; i < 5; i++) {
			if ("00".equals(levels[i])) {
				find = i;
				break;
			}
		}
		return find;
	}	
	
	/** 
     * LDAP 서비스 코드 검색 핕터를 생성하여 반환한다.
	 * 
     * levels 2 digit 요소로 구성된 serviceCode
     * level 00 이 들어있는 index 1~4까지 없다면 6
     */
	public SortedSet<String> getSearchFilterLoop(String[] levels, int level) {
		SortedSet<String> ss = new TreeSet<>();
		//  4 -> 
		for (int i = 1; i < level; i++) {
			ss.addAll(getSearchFilterLoopLevel(levels, i));
		}
		return ss;
	}

	public SortedSet<String> getSearchFilterLoopLevel(String[] levels, int level) {
		// 1, 2, 3
		SortedSet<String> ss = new TreeSet<>();
		String result = "";
		for (int i = 0; i < 5; i++) {
			if (i < level) {
				result += levels[i];
			} else {
				result += "00";
			}
		}
		ss.add(result);
		return ss;
	}


	/** 
     * LDAP 서비스 코드 검색 핕터를 생성하여 반환한다.
	 * 
     * levels 2 digit 요소로 구성된 serviceCode
     * level 00 이 들어있는 index 1~4까지 없다면 6
     */	
	public SortedSet<String> getSearchFilterLoopLevelAstar(String[] levels, int level) {
		SortedSet<String> ss = new TreeSet<String>();
		String result = "";
		for (int i = 0; i < 5; i++) {
			if (i < level) {
				result += levels[i];
			} else {
				result += "*";
				break;
			}
		}
		ss.add(result);
		return ss;
	}
		
}
