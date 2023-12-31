package kr.re.kitech.biz.emp.service.impl;

import java.io.IOException;
import java.io.InputStream;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.emp.dao.EmpFileDAO;
import kr.re.kitech.biz.emp.service.EmpFileService;
import kr.re.kitech.biz.emp.vo.EmpVo;


/**  
 * @ClassSubJect 데모용 사원정보의 파일 관련 처리를 담당하는 구현체 서비스
 * @Class Name : EmpFileServiceImpl.java
 * @Description : 데모용 사원정보의 파일 관련 처리를 담당하는 구현체 서비스
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
 *  Copyright inswave (C) by Dev All right reserved. 
 */
@Service("empFileServiceImpl")
public class EmpFileServiceImpl  extends EgovAbstractServiceImpl implements EmpFileService {

    @Resource(name="empFileDAO")
    private EmpFileDAO empFileDAO;


	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.service.emp.EmpFileService#selectEmpFile(kr.re.kitech.biz.vo.emp.EmpVo)
	 */
	public EmpVo selectEmpFile(EmpVo vo) throws ElException {		
        EmpVo retVo = (EmpVo)vo.clone();
        retVo = empFileDAO.selectEmpFile(retVo);
        return retVo;
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.service.emp.EmpFileService#insertEmpFile(kr.re.kitech.biz.vo.emp.EmpVo)
	 */
	public int insertEmpFile(EmpVo vo) throws ElException {
		return empFileDAO.insertEmpFile(vo);
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.service.emp.EmpFileService#updateEmpFile(kr.re.kitech.biz.vo.emp.EmpVo)
	 */
	public int updateEmpFile(EmpVo vo) throws ElException {				
		return empFileDAO.updateEmpFile(vo);				
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.service.emp.EmpFileService#deleteEmpFile(kr.re.kitech.biz.vo.emp.EmpVo)
	 */
	public int deleteEmpFile(EmpVo vo) throws ElException {
		return empFileDAO.deleteEmpFile(vo);
	}

	public void uploadEmpFile(EmpVo vo) throws Exception {
		if( vo.getInputFileData() != null && vo.getInputFileData().getSize() > 0 ) {
            EmpVo retEmpVo = (EmpVo)vo.clone();
            retEmpVo = getEmpVo(vo);
            empFileDAO.deleteEmpFile(retEmpVo);
            empFileDAO.insertEmpFile(retEmpVo);
        }
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
}
