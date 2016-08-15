/**
 * 
 */
package com.chrhc.xjs.util;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.UUID;

/**
 * @author 605162215@qq.com
 *
 * 2016年8月15日 上午10:11:00
 */
public class RandomUtil {
	
	private static SecureRandom random = new SecureRandom();
	
	public static String randomUUID(){
        return UUID.randomUUID().toString().replace("-", "");
    }
	
	public static int randomInt(int min, int max){
        return (int) (min + Math.random() * (max - min));
    }
	
	public static String randomString(int length) {
		BigInteger bi = new BigInteger(130, random);
		String str = bi.toString(32);
		return str.substring(0, length);
	}
	
	public static String randomNumberString(int length) {
		BigInteger bi = new BigInteger(130, random);
		String str = bi.toString(10);
		return str.substring(0, length);
	}
	
	public static void main(String[] args) {
		System.out.println(randomNumberString(10));
	}
	
}