package kr.re.kitech.biz.com.mlr.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Resource;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.api.client.IDoorayApiClient;
import kr.re.kitech.biz.com.mlr.dao.MailRetrieveApiLogDAO;
import kr.re.kitech.biz.com.mlr.service.MailRetrieveApiLogService;
import kr.re.kitech.biz.com.mlr.vo.MailRetrieveApiLogVo;
import okhttp3.Response;

  @Service("MailRetrieveApiLogServiceImpl")
  public class MailRetrieveApiLogServiceImpl extends EgovAbstractServiceImpl implements MailRetrieveApiLogService {
  Logger log = LoggerFactory.getLogger(MailRetrieveApiLogServiceImpl.class);
  
  @Resource(name = "MailRetrieveApiLogDAO")
  private MailRetrieveApiLogDAO mailDAO;

  @Autowired
  private IDoorayApiClient doorayApiClient;

  @Override
  public List < MailRetrieveApiLogVo > selectListItem(MailRetrieveApiLogVo vo) throws ElException {
    List < MailRetrieveApiLogVo > list = mailDAO.selectListItem(vo);
    return list;
  }

  @Override
  public int insertItem(MailRetrieveApiLogVo vo) throws ElException, IOException {
    int result = mailDAO.insertItem(vo);
    return result;
  }

  @Override
  public Boolean retrieveMail(MailRetrieveApiLogVo vo) throws ElException {

    List < String > toAddresses = new ArrayList < > ();
    List < String > ccAddresses = new ArrayList < > ();
    List < String > bccAddresses = new ArrayList < > ();

    if (vo.getTo_address() != null && !vo.getTo_address().isEmpty()) toAddresses.addAll(Arrays.asList(vo.getTo_address().split(",")));
    if (vo.getCc_address() != null && !vo.getCc_address().isEmpty()) ccAddresses.addAll(Arrays.asList(vo.getCc_address().split(",")));
    if (vo.getBcc_address() != null && !vo.getBcc_address().isEmpty()) bccAddresses.addAll(Arrays.asList(vo.getBcc_address().split(",")));

    // Remove duplicate email addresses
    Set < String > uniqueEmails = new HashSet < > ();
    uniqueEmails.addAll(toAddresses);
    uniqueEmails.addAll(ccAddresses);
    uniqueEmails.addAll(bccAddresses);

    Boolean success = Boolean.TRUE;
    for (String email: uniqueEmails) {
      String toEmail = getMemberId(email);
      if (toEmail != null) {
        success = success && retrieveMail(vo.getMimemessageid(), vo.getFrom_address(), vo.getSubject(), toEmail);
        log.debug("↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓");
		log.debug("메일회수 여부 : [{}]", success);

        if (success) {
          vo.setIs_success("t");
          vo.setRegst_syspayno(vo.getRegst_syspayno());
          try {
			insertItem(vo);
		} catch (IOException e) {
			e.printStackTrace();
			return Boolean.FALSE;
		}
        }

      }else{
    	  return Boolean.FALSE;
      }
    }
    return success;
  }

  private Boolean retrieveMail(String mimeMessageId, String from, String subject, String toEmail) {
    // Prepare the request data
    Map < String, Object > requestData = new HashMap < > ();
    requestData.put("mimeMessageId", mimeMessageId);
    requestData.put("headerFrom", extractEmail(from));
    requestData.put("subject", subject);

    try {
      // Send the request and process the response
      Response response = doorayApiClient.retrieveMail(toEmail, requestData);
      return processResponse(response);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return Boolean.FALSE;
  }

  private String getMemberId(String email) {
	  // Extract the username from the email
	  String username = email.substring(0, email.indexOf("@"));
	
	  try {
	    // Send the request and process the response
	    Response response = doorayApiClient.searchMember(username, Collections.emptyMap());
	    if (response.isSuccessful()) {
	      String responseBody = response.body().string();
	      JSONObject jsonObject = new JSONObject(responseBody);
	      JSONArray resultArray = jsonObject.getJSONArray("result");
	      if (resultArray.length() > 0) {
	        JSONObject resultObject = resultArray.getJSONObject(0);
	        return resultObject.getString("id");
	      }
	    }
	  } catch (IOException e) {
	    e.printStackTrace();
	  } catch (JSONException e) {
	    e.printStackTrace();
	  }
	  return null;
	}


 private String extractEmail(String headerFrom) {
   Pattern pattern = Pattern.compile("<(.*)>");
   Matcher matcher = pattern.matcher(headerFrom);
   if (matcher.find()) {
     return matcher.group(1);
   }
   return headerFrom;
 }
 
  private Boolean processResponse(Response response) {
	  if (response == null || !response.isSuccessful()) {
	    return Boolean.FALSE;
	  }
	  try {
	    // Parse the JSON response
	    String content = response.body().string();
	    JSONObject mainObj = new JSONObject(content);
	    JSONObject header = mainObj.getJSONObject("header");
	
	    // Check if the mail retrieval was successful
	    if (header != null && header.has("isSuccessful")) {
	      return header.getBoolean("isSuccessful");
	    }
	    return Boolean.FALSE;
	  } catch (IOException | JSONException e) {
	    e.printStackTrace();
	    return Boolean.FALSE;
	  }
	}

}