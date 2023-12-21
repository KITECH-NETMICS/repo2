package kr.re.kitech.biz.xom.core.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;

public class ObjectUtils {
	
	private static KitechException raiseException(String errMsg) {
		return new KitechException(Exceptions.ERROR, Business.XOM, errMsg);
	}
	
	private static KitechException raiseException(String errMsg, Exception e) {
		return new KitechException(Exceptions.ERROR, Business.XOM, errMsg, e);
	}
	
	private static Method getMethod(Class<?> cls, String methodStr, Class<?>... paramCls) throws Exception {
		return cls.getMethod(methodStr, paramCls);
	}
	
	public static Object castParentToChild(Object obj1, Object obj2) {
		Object retObj = new Object();
		
		try {
			
		} catch (NullPointerException e) {
			throw raiseException("캐스팅 해야할 파라미터가 부족합니다.", e);
		}
		
		return retObj;
	}
	
	/**
	 * Vo를 Map으로 변환한다.
     * @param vo
     * @return Map<String, Object>
     * @throws KitechException
     */
	public static Map<String, Object> valueObjectToMap(Object vo) {
		Map<String, Object> retMap = new HashMap<>();
		

		for (Field field : vo.getClass().getDeclaredFields()) {
			try {
				Method getterMethod = getMethod(vo.getClass(), "get" + StringUtils.capitalize(field.getName()));
				retMap.put(field.getName(), getterMethod.invoke(vo));
			} catch (NoSuchMethodException e) {
				// Ignore
			} catch (NullPointerException e) {
				throw raiseException("Map으로 변환할 VO가 누락되었습니다.", e);
			} catch (Exception e) {
				throw raiseException("Map 변환 중 에러가 발생했습니다.", e);
			}
		}
		
		return retMap;
	}
	
	/**
	 * Vo간 중복된 속성을 덮어쓴다. 
	 * 단, 값이 있으면 덮어쓰지 않는다.
     * @param to	Vo
     * @param from	Vo
     * @return Object 값이 변경된 Vo
     * @throws KitechException
     */
	public static void valueObjectToValueObjectNoOver(Object to, Object from) {
		
		for (Field field : to.getClass().getDeclaredFields()) {
			try {
				Method getterMethod = getMethod(from.getClass(), "get" + StringUtils.capitalize(field.getName()));
				Method getTmp = getMethod(to.getClass(), "get" + StringUtils.capitalize(field.getName()));
				
				if (getTmp.invoke(to) == null) {
					Method setterMethod = getMethod(to.getClass(), "set" + StringUtils.capitalize(field.getName()), field.getType());
					setterMethod.invoke(to, getterMethod.invoke(from));
				}
			} catch (NoSuchMethodException e) {
				// Ignore
			} catch (NullPointerException e) {
				throw raiseException("VO가 누락되었습니다.", e);
			} catch (Exception e) {
				throw raiseException("변환 중 에러가 발생했습니다.", e);
			}
		}
		
	}
	
	/**
	 * Vo간 중복된 속성을 덮어쓴다. 
     * @param to	Vo
     * @param from	Vo
     * @return Object 값이 변경된 Vo
     * @throws KitechException
     */
	public static void valueObjectToValueObjectOver(Object to, Object from) {
		
		for (Field field : to.getClass().getDeclaredFields()) {
			try {
				Method getterMethod = getMethod(from.getClass(), "get" + StringUtils.capitalize(field.getName()));
				Method setterMethod = getMethod(to.getClass(), "set" + StringUtils.capitalize(field.getName()), field.getType());
				setterMethod.invoke(to, getterMethod.invoke(from));
			} catch (NoSuchMethodException e) {
				// Ignore
			} catch (NullPointerException e) {
				throw raiseException("VO가 누락되었습니다.", e);
			} catch (Exception e) {
				throw raiseException("변환 중 에러가 발생했습니다.", e);
			}
		}
		
	}
	
	/**
	 * Vo간 중복된 속성을 추가하며 새로 생성한다. 
     * @param cls	return 받을 Vo Class
     * @param from	복사 할 속성이 담긴 Vo
     * @return Object 값이 변경된 Vo
     * @throws KitechException
     */
	public static Object valueObjectcopy(Class<?> cls, Object from) {
		if (cls == null) {
			throw raiseException("변환 할 Class가 누락되었습니다.");
		}
		
		try {
			Object ret = cls.newInstance();
		
			for (Field field : from.getClass().getDeclaredFields()) {
				try {
					Method getterMethod = getMethod(from.getClass(), "get" + StringUtils.capitalize(field.getName()));
					Method setterMethod = getMethod(cls, "set" + StringUtils.capitalize(field.getName()), field.getType());
					setterMethod.invoke(ret, getterMethod.invoke(from));
				} catch (NoSuchMethodException e) {
					// Ignore
				} catch (NumberFormatException e) {
					// Ignore
				} catch (NullPointerException e) {
					throw raiseException("VO가 누락되었습니다.", e);
				}
			}
			
			return ret;
		} catch (Exception e) {
			throw raiseException("변환 중 에러가 발생했습니다.", e);
		}
	}
}
