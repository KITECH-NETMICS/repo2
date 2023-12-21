package kr.re.kitech.biz.xom.base.util.pks;

/**
 * <ul>
 * <li>설 명 : StringUtilConstant</li>
 * </ul>
 * 
 * StringParser에서 사용하는 상수들의 모음
 */
public class StringParserConstant {

    /** KeyStr 형식 문자열에서 Key 시작 구분자 */
    public final static String KEY_STR_BEGIN = "|_";

    /** KeyStr 형식 문자열에서 value 시작 구분자 */
    public final static String KEY_STR_EQUAL = "=";

    /** KeyStr 형식 문자열에서 value 간의 구분자 */
    public final static String KEY_STR_VALUE_END = "._";

    /** SLASH 문자 (여러 개의 데이터를 연결하여 사용하는 경우의 데이터 구분자) */
    public final static String SLASH = "/";

    /** TAB 문자 */
    public final static String TAB = "\t";

    /** new line 문자 */
    public final static String NEW_LINE = "\n";

    /** carrige return 문자 */
    public static final String CARRIAGE_RETURN = "\r";
}
