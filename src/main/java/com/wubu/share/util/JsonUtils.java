package com.wubu.share.util;


public class JsonUtils {

	
	
	/**
	 * 合并两个JSON数组串
	 * @param str1 [{"name1":"name1","value1":"value1"},{"name2":"	name2","value2":"value2"}]
	 * @param str2 [{"name1":"name1","value1":"value1"},{"name2":"	name2","value2":"value2"}]
	 * @return
	 */
	public static String mergeJSONString(String str1, String str2){
		if(str1 != null && str2 != null){
			return str1.substring(0, str1.length()-1) + "," + str2.substring(1, str2.length());
		}
		if(str1 !=null && str2 ==null){
			return str1;
		}
		if(str1 ==null && str2 != null){
			return str2;
		}
		return null;
	}
	
}
