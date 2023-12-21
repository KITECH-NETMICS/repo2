/**
 * 
 */
package kr.re.kitech.biz.xom.core.security;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.inswave.elfw.log.AppLog;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.security.SignatureException;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * API 인증을 위한 토큰 관리 객체
 *
 * @author James
 * @since 2022. 7. 25.
 */
@Component
public class JwtProvider {

	// 30분
	private long ACCESS_TOKEN_VALIDATiON_SECOND = 60 * 30;

	// 1개월
	private long REFRESH_TOKEN_VALIDATiON_SECOND = 60 * 60 * 24 * 30;

	@Value("${api.server.jwt.key}")
	private String secretKey;
	
	public JwtProvider() {
	}

	public JwtProvider(String secretKey, Long accessTokenValidationSecond, Long refreshTokenValidationSecond) {
		this.secretKey = secretKey;
		this.ACCESS_TOKEN_VALIDATiON_SECOND = accessTokenValidationSecond;
		this.REFRESH_TOKEN_VALIDATiON_SECOND = refreshTokenValidationSecond;
	}

	private Key getSigninKey(String secretKey) {
		byte[] keyBytes = secretKey.getBytes(StandardCharsets.UTF_8);
		return Keys.hmacShaKeyFor(keyBytes);
	}

	// 토큰 해석
	public Claims validTokenAndReturnBody(String token) {
		try {
			return Jwts.parserBuilder().setSigningKey(getSigninKey(secretKey)).build().parseClaimsJws(token).getBody();
		} catch (SignatureException ex) {
			AppLog.error("SignatureException - 서명이 일치하지 않습니다.", ex);
			throw new KitechException(Exceptions.ERROR, Business.XOM, "message.xom.co.auth.jwt.0001", ex);
		} catch (ExpiredJwtException | UnsupportedJwtException | MalformedJwtException | IllegalArgumentException ex) {
			AppLog.error("InvalidParameterException - 유효하지 않은 토큰 정보입니다.", ex);
			throw new KitechException(Exceptions.ERROR, Business.XOM, "message.xom.co.auth.jwt.0002", ex);
		}
	}

	// 유저id 조회
	public String getName(String token) {
		return validTokenAndReturnBody(token).get("username", String.class);
	}

	// 토큰 만료
	private Boolean isTokenExpired(String token) {
		Date expiration = validTokenAndReturnBody(token).getExpiration();
		return expiration.before(new Date());
	}

	// access token 생성
	public String generateAccessToken(String username) {
		return doGenerateToken(username, ACCESS_TOKEN_VALIDATiON_SECOND * 1000l);
	}

	// refresh token 생성
	public String generateRefreshToken(String username) {
		return doGenerateToken(username, REFRESH_TOKEN_VALIDATiON_SECOND * 1000l);
	}

	// accessToken 유효시간 알림(second)
	public Long getValidationAccessTokenTime() {
		return ACCESS_TOKEN_VALIDATiON_SECOND;
	}

	private String doGenerateToken(String username, Long expireTime) {
		Map<String,Object> header = new HashMap<>();
		header.put("typ", "JWT");
		header.put("alg", "HS256");
	
		Claims claims = Jwts.claims();
		claims.put("username", username);

		return Jwts.builder()
				.setHeader(header)
				.setClaims(claims)
				.setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis() + expireTime))
				.signWith(this.getSigninKey(secretKey), SignatureAlgorithm.HS256)
				.compact();
	}
}
