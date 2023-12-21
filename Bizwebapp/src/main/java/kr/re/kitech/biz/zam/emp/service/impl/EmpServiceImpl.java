package kr.re.kitech.biz.zam.emp.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.xom.base.model.BizCommVO;
import kr.re.kitech.biz.zam.emp.dao.EmpDAO;
import kr.re.kitech.biz.zam.emp.service.EmpFileService;
import kr.re.kitech.biz.zam.emp.service.EmpService;
import kr.re.kitech.biz.zam.emp.vo.DeptVo;
import kr.re.kitech.biz.zam.emp.vo.EmpVo;


/**
 * @ClassSubJect  데모용 사원정보 처리를 담당하는 구현체 서비스
 * @Class Name : EmpServiceImpl.java
 * @Description : 데모용 사원정보 처리를 담당하는 구현체 서비스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/01/06   개발팀             최초생성
 * 
 * @author 개발팀
 * @since 2022/01/06
 * @version 1.0
 * @see
 * 
 *  Copyright (C) by BSJ All right reserved. 
 */
@Service("empServiceImpl")
public class EmpServiceImpl  extends EgovAbstractServiceImpl implements EmpService {
	
    @Resource(name="empDAO")
    private EmpDAO empDAO;
        
    @Resource(name = "empFileServiceImpl")
    private EmpFileService empFileService;

    
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.service.emp.EmpService#selectListEmp(kr.re.kitech.biz.vo.emp.EmpVo)
	 */
	public List<EmpVo> selectListEmp(EmpVo empVo) throws ElException {
		List<EmpVo> list = empDAO.selectListEmp(empVo);	
	
		return list;
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.service.emp.EmpService#selectListCountEmp(kr.re.kitech.biz.vo.emp.EmpVo)
	 */
	public long selectListCountEmp(EmpVo empVo) throws ElException {
		return empDAO.selectListCountEmp(empVo);
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.service.emp.EmpService#selectEmp(kr.re.kitech.biz.vo.emp.EmpVo)
	 */
	public EmpVo selectEmp(EmpVo empVo) throws ElException {
		BizCommVO commVo = (BizCommVO)empVo;
		AppLog.debug("=============================] commVo [=============================");
		AppLog.debug("regst_syspayno: "+ commVo.getRegst_syspayno());
		AppLog.debug("regst_daytm	: "+ commVo.getRegst_daytm());
		AppLog.debug("updt_syspayno: "+ commVo.getUpdt_syspayno());
		AppLog.debug("updt_daytm: "+ commVo.getUpdt_daytm());	
		EmpVo resultVO = empDAO.selectEmp(empVo);			
//        if (resultVO == null)
//        	throw new UserException( "EL.ERROR.COMM.001"  ); //별도의 예외 메시지가 필요한 경우 처리 예시       
        
        return resultVO;
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.service.emp.EmpService#insertEmp(kr.re.kitech.biz.vo.emp.EmpVo)
	 */
	public int insertEmp(EmpVo empVo) throws ElException, IOException {
        int iRet = empDAO.insertEmp(empVo);

        if( empVo.getInputFileData() != null  && empVo.getInputFileData().getSize() > 0 ) {
            EmpVo retEmpVo = (EmpVo)empVo.clone();
            retEmpVo = getEmpVo(empVo);       
            empFileService.insertEmpFile(retEmpVo);
        }
        return iRet;
	}
	
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.service.emp.EmpService#updateEmp(kr.re.kitech.biz.vo.emp.EmpVo)
	 */
	public int updateEmp(EmpVo empVo) throws ElException, IOException {				
        int updRet = empDAO.updateEmp(empVo);
        
        if( empVo.getInputFileData() != null && empVo.getInputFileData().getSize() > 0 ) {
            EmpVo retEmpVo = (EmpVo)empVo.clone();
            retEmpVo = getEmpVo(empVo);
            empFileService.deleteEmpFile(retEmpVo);
            empFileService.insertEmpFile(retEmpVo);
        } else {
        	if( empVo.getFileName() == null || "".equals(empVo.getFileName())) { // 첨부파일 삭제
        		empFileService.deleteEmpFile(empVo);
        	}
        }
        return updRet;   		
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.service.emp.EmpService#deleteEmp(kr.re.kitech.biz.vo.emp.EmpVo)
	 */
	public int deleteEmp(EmpVo empVo) throws ElException {
		int del = empDAO.deleteEmp(empVo);
		empFileService.deleteEmpFile(empVo);
		return del;
	}	
		
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.service.emp.EmpService#selectListDept(java.util.HashMap)
	 */
	public ArrayList<DeptVo> selectListDept(HashMap searchKeyHm) throws ElException{
		return empDAO.selectListDept(searchKeyHm);
	}
	
	/**
	 * EmpVo 의 MultipartFile 의 Stream 을 VO 에 Byte array 데이터 형태로 담는다.
	 * @param empVo
	 * @return 파일데이터를 담은 EmpVo
	 * @throws Exception
	 */
	private EmpVo getEmpVo( EmpVo empVo ) throws ElException, IOException{ 
		if( empVo.getInputFileData() == null )  return null;
    	
		long iFileSize = empVo.getInputFileData().getSize();
		if( iFileSize > 0 ) {
			InputStream is = empVo.getInputFileData().getInputStream();  
			byte[] fileData = new byte[(int)iFileSize];  
			is.read(fileData);
			is.close();
			empVo.setFileName(empVo.getInputFileData().getOriginalFilename());
			empVo.setFileData(fileData);	
		}  
		
		return empVo;
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.service.emp.EmpService#saveEmp(kr.re.kitech.biz.vo.emp.EmpVo)
	 */
	public int saveEmp(EmpVo empVo) throws Exception {
		int cnt = 0;
		String rowStatus = (String) empVo.getRowStatus();
		if (rowStatus.equals("C")) {
			cnt = empDAO.insertEmp(empVo);
		} else if (rowStatus.equals("U")) {
			cnt = empDAO.updateEmp(empVo);
		} else if (rowStatus.equals("D")) {
			cnt = empDAO.deleteEmp(empVo);
		}
		return cnt;
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.service.emp.EmpService#saveEmpList(kr.re.kitech.biz.vo.emp.EmpListVo)
	 */
	public int saveEmpList(List<EmpVo> empList) throws Exception {
		int cnt = 0;
		for (int i = 0; i < empList.size(); i++) {
			EmpVo row = empList.get(i);
			cnt += saveEmp(row);
		}
		return cnt;
	}

}
