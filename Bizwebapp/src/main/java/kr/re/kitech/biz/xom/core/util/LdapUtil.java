/**
 * 
 */
package kr.re.kitech.biz.xom.core.util;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;

/**
 * ContextLoadListener 를 위한 LDAP 유티리티 클래스
 *
 * @author James
 * @since 2023. 10. 24.
 */
public class LdapUtil {

    private static String LDAP_URL;
    private static String LDAP_BASE;
    private static String LDAP_USER_DN;
    private static String LDAP_PASSWORD;
    private static int LDAP_TIMEOUT;

    static {
        // Properties 로드
        Properties props = new Properties();
        try {
            props.load(LdapUtil.class.getClassLoader().getResourceAsStream("inswave/properties/common.properties"));
            LDAP_URL = props.getProperty("ldap.url");
            LDAP_BASE = props.getProperty("ldap.base");
            LDAP_USER_DN = props.getProperty("ldap.userDn");
            LDAP_PASSWORD = props.getProperty("ldap.password");
            LDAP_TIMEOUT = Integer.parseInt(props.getProperty("ldap.timeout"));
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
    
    private LdapUtil() {
    	// 객체로 인스턴스화 금지
    	throw new AssertionError();
    }

    public static DirContext getConnection() throws NamingException {
        Properties env = new Properties();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        env.put(Context.PROVIDER_URL, LDAP_URL);
        env.put(Context.SECURITY_AUTHENTICATION, "simple");
        env.put(Context.SECURITY_PRINCIPAL, LDAP_USER_DN);
        env.put(Context.SECURITY_CREDENTIALS, LDAP_PASSWORD);
        env.put("com.sun.jndi.ldap.connect.timeout", String.valueOf(LDAP_TIMEOUT));
        return new InitialDirContext(env);
    }

    public static String sampleSearch(String searchFilter) throws NamingException {
        DirContext ctx = null;
        try {
            ctx = getConnection();
            SearchControls sc = new SearchControls();
            sc.setSearchScope(SearchControls.SUBTREE_SCOPE);
            NamingEnumeration<?> results = ctx.search("cn=services," + LDAP_BASE, searchFilter, sc);
            if (results.hasMore()) {
                SearchResult sr = (SearchResult) results.next();
                Attributes attrs = sr.getAttributes();
                return attrs.get("cn").get().toString();
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            if (ctx != null) ctx.close();
        }
        return null;
    }
}