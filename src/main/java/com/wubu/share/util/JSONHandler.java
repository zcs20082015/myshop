package com.wubu.share.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
/**
 * Json辅助类
 * @author shmily
 * @date 2012-2-2 上午10:38:12
 */
public class JSONHandler {
	
	public static String regex = "\"(\\w+)\":";
	/**
	 * 处理Json串,将键转化为小写
	 * @param jsonInput
	 * @return
	 */
	public static String dealJSONKey2Lower(String jsonInput) {
		if (StringUtils.isEmpty(jsonInput))
			return "";
		String originalInput = jsonInput;
		StringBuilder inputStr = new StringBuilder(jsonInput);
		String regex = "\"(\\w+)\":";
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(inputStr);
		List<String> result = new ArrayList<String>();
		while (m.find()) {
			String valueName = m.group(1);
			String newValueName = null;
			newValueName = StringUtils.lowerCase(valueName);
			String regx1 = "\"" + valueName + "\":";
			String replace = "\"" + newValueName + "\":";
			originalInput = originalInput.replaceAll(regx1, replace);
			result.add(valueName);
			inputStr.delete(0, m.end(0));
			m = p.matcher(inputStr);
		}
		return originalInput;
	}
	/**
	 * 处理Json串,将键的首字母小写转化为大写
	 * @param jsonInput
	 * @return
	 */
	public static String dealWithFirstChar2Upper(String jsonInput) {
		if (StringUtils.isEmpty(jsonInput))
			return StringUtils.EMPTY;
		String originalInput = jsonInput;
		StringBuilder inputStr = new StringBuilder(jsonInput);
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(inputStr);
		List<String> result = new ArrayList<String>();
		while (m.find()) {
			String valueName = m.group(1);
			String newValueName = null;
			char[] words = valueName.toCharArray();
			if (Character.isLowerCase((words[0]))) { // 首字母小写
				words[0] = Character.toUpperCase(words[0]);
				newValueName = new String(words);
				String regx1 = "\"" + valueName + "\":";
				String replace = "\"" + newValueName + "\":";
				originalInput = originalInput.replaceAll(regx1, replace);
			}
			result.add(valueName);
			inputStr.delete(0, m.end(0));
			m = p.matcher(inputStr);
		}
		return originalInput;
	}

	/**
	 * 将对象转换为JSON字符串
	 * @param obj
	 * @return
	 */
	public static String toJSONString(Object obj) {
		return JSON.toJSONString(obj,SerializerFeature.DisableCircularReferenceDetect);
	}
	/**
	 * 根据Key获取Value,可以同时提供多个key
	 * @param json
	 * @param keys
	 * @return
	 * @throws Exception
	 */
	public static String getJSONValueBYKeys(String json,String ...keys)throws Exception{
		if(StringUtils.isEmpty(json) || ArrayUtils.isEmpty(keys))
			return StringUtils.EMPTY;
		JSONObject jsonObj = JSON.parseObject(json);
		String keyValue = StringUtils.EMPTY;
		for(String key : keys){
			keyValue = jsonObj.getString(key);
			if(!FuncUtils.isNull(keyValue))
				return keyValue;
		}
		return keyValue;
	}
	/**
	 * 从一个JSON 对象字符格式中得到一个java对象
	 * @param jsonString
	 * @param beanClass
	 * @return
	 */
	public static <T> T jsonToBean(String jsonString,Class<T> beanClass){
		 JSONObject jsonObject = JSONObject.parseObject(jsonString);
	        T bean = (T) JSONObject.toJavaObject(jsonObject, beanClass);
	         
	        return bean;
	}
}