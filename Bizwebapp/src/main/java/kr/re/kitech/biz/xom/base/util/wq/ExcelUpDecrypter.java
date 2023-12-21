package kr.re.kitech.biz.xom.base.util.wq;


import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import websquare.upload.handl.AbstractUploaDecrypter;

public class ExcelUpDecrypter extends AbstractUploaDecrypter {
	protected Logger log = LoggerFactory.getLogger(this.getClass());

	/**
	 * @param <File:Y> file : 클라이언트에서 업로드한 파일 객체
	 * @desc WebSquare GridView 엑셀 업로드시 복호화 연계
	 */
	public File decrypt(File file) throws Exception {
		log.debug(">>>>>>>>> [엑셀 업로드 - 복호화] filePath: {}", file.getAbsolutePath());
		// WebSquare GridView 엑셀 업로드시 업로드한 file 객체를 DRM 해제하여 리턴한다.
		return file;
	}
}