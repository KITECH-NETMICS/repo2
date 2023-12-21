package kr.re.kitech.biz.xom.base.enums;


/**
 * 첨부파일 상수 구분
 * @author James
 * @since 2022. 3. 11.
 */
public enum Attaches implements EnumMapperType {
	IMG_STORAGE_ROOT("/web_folder", "이미지 첨부파일 경로"),
	OLD_STORAGE_ROOT("/was/IMIS_FILES", "첨부파일 경로(예전)"),
	BIZ_STORAGE_ROOT("/was/IMIS_FILES", "첨부파일 경로(현재)"),
	PAT_STORAGE_ROOT("/was/IPMS_FILES", "지재권 첨부파일 경로"),
	EPU_STORAGE_ROOT("", "구매조달의 경우 NAS 경로가 DB에 저장"),
	DEV_STORAGE_ROOT("/test/IMIS_FILES", "스로리지 물리 경로(개발)"),	
	TMP_STORAGE_ROOT("/was/IMIS_FILES/DocuJson", "임시저장 파일 경로"),
	
	BIZ_STORAGE_ROOT_01("/IMIS_FILES01", "첨부파일 경로 01"),
	BIZ_STORAGE_ROOT_02("/IMIS_FILES02", "첨부파일 경로 02"),
	BIZ_STORAGE_ROOT_03("/IMIS_FILES03", "첨부파일 경로 03"),
	BIZ_STORAGE_ROOT_04("/IMIS_FILES04", "첨부파일 경로 04"),
	BIZ_STORAGE_ROOT_05("/IMIS_FILES05", "첨부파일 경로 05"),
	
	BIZ_STORAGE_ROOT_PDF_01("/PDF01", "PDF 경로 01"),
	BIZ_STORAGE_ROOT_PDF_02("/PDF02", "PDF 경로 02"),
	BIZ_STORAGE_ROOT_PDF_03("/PDF03", "PDF 경로 03"),
	BIZ_STORAGE_ROOT_PDF_04("/PDF04", "PDF 경로 04"),
	BIZ_STORAGE_ROOT_PDF_05("/PDF05", "PDF 경로 05"),
	
	WHICH_IMIS("IMIS", "경영정보 시스템"),
	WHICH_IPMS("IPMS", "지식재산권 포털시스템");

	private final String code;
	private final String title;
		
	private Attaches(String code, String title) {
		this.code = code;
		this.title = title;
	}
	
	@Override
	public String getCode() {
		return this.code;
	}

	@Override
	public String getName() {
		return this.name();
	}

	@Override
	public String getTitle() {
		return this.title;
	}
}
