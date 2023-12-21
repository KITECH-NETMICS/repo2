package kr.re.kitech.biz.xom.base.util.wq;


import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import websquare.upload.handl.AbstractUploaDecrypter;

public class FileUpDecrypter extends AbstractUploaDecrypter {
	protected Logger log = LoggerFactory.getLogger(this.getClass());

	/**
	 * @param <File:Y> file : 클라이언트에서 업로드한 파일 객체
	 * @desc WebSquare multiUpload를 통한 파일 첨부시 복호화 연계
	 */
	public File decrypt(File file) throws Exception {
		log.debug(">>>>>>>>> [파일 첨부 - 복호화] filePath: {}", file.getAbsolutePath());
		// 파일첨부시에는 복호화 하지 않는다. 
		// 엑셀 업로드의 복호화 기능 구현시 파입첨부시에도 적용되는 현상을 회피하기 위해 bypass하도록 함.
		return file;
	}
}