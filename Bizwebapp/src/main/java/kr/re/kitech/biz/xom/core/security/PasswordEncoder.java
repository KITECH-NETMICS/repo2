/**
 * 
 */
package kr.re.kitech.biz.xom.core.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * 
 * @author James
 * @since 2023. 12. 7.
 */
public class PasswordEncoder {

    public static String encode(CharSequence rawPassword) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            byte[] bytes = md.digest(rawPassword.toString().getBytes());
            return Base64.getEncoder().encodeToString(bytes);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Failed to hash password", e);
        }
    }

    public static boolean matches(CharSequence rawPassword, String storedPassword) {
        // LDAP에 저장된 비밀번호에서 {SHA512} 접두사 제거
        String storedHashWithoutPrefix = storedPassword.replace("{SHA512}", "");

        // 사용자가 입력한 비밀번호를 SHA-512로 해시
        String hashedRawPassword = PasswordEncoder.encode(rawPassword);

        // 해시된 비밀번호와 LDAP에 저장된 해시된 비밀번호 비교
        return hashedRawPassword.equals(storedHashWithoutPrefix);
    }
}