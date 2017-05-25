package com.wubu.share.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;

public class MD5Utils {
	private static char[] hexDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

	public static final String MD5Encrpytion(String source) {

		try {
			byte[] strTemp = source.getBytes("UTF-8");

			MessageDigest mdTemp = MessageDigest.getInstance("MD5");
			mdTemp.update(strTemp);
			byte[] md = mdTemp.digest();
			int j = md.length;
			char[] str = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; ++i) {
				byte byte0 = md[i];
				str[(k++)] = hexDigits[(byte0 >>> 4 & 0xF)];
				str[(k++)] = hexDigits[(byte0 & 0xF)];
			}
			for (int m = 0; m < str.length; ++m) {
				if ((str[m] >= 'a') && (str[m] <= 'z')) {
					str[m] = (char) (str[m] - ' ');
				}
			}
			//System.out.println("[MD5Utils] [source String]" + source);
			//System.out.println("[MD5Utils] [MD5    String]" + new String(str));
			return new String(str);
		} catch (Exception e) {
		}
		return null;
	}

	public static final String MD5Encrpytion(byte[] source) {

		try {
			MessageDigest mdTemp = MessageDigest.getInstance("MD5");
			mdTemp.update(source);
			byte[] md = mdTemp.digest();
			int j = md.length;
			char[] str = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; ++i) {
				byte byte0 = md[i];
				str[(k++)] = hexDigits[(byte0 >>> 4 & 0xF)];
				str[(k++)] = hexDigits[(byte0 & 0xF)];
			}
			for (int m = 0; m < str.length; ++m) {
				if ((str[m] >= 'a') && (str[m] <= 'z')) {
					str[m] = (char) (str[m] - ' ');
				}
			}
			//System.out.println("[MD5Utils] [source String]" + source);
			//System.out.println("[MD5Utils] [MD5    String]" + new String(str));
			return new String(str);
		} catch (Exception e) {
		}
		return null;
	}
	
	public static void main(String args[]) throws UnsupportedEncodingException{
		String sign_field2="oid_partner=201510110000014002|user_id=2016110100426566|type_order=1012|id_no=411321198904040913|id_name=郑春生|url_notify=http://192.168.1.203:8084/consumer/faceapi/async.htm|url_return=http://192.168.1.203:8084/consumer/faceapi/sync.htm|info_order=201601080000016002,credit,h5,nulluubee1234567890";
		//System.out.println(URLEncoder.encode(sign_field2,"utf-8"));
		System.out.println(MD5Encrpytion(sign_field2));
	}
}