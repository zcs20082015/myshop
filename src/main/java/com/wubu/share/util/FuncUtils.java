package com.wubu.share.util;

import java.util.Random;
import java.util.regex.Pattern;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;

public class FuncUtils {
	
	/**
	 * <p>Function: 判断字符串是否为空</P>
	 * @author zhengcs@uubee.com
	 * @date 2016年8月23日 上午10:38:02
	 */
	public static boolean isNull(String str){
		if(str==""||str==null||str=="NULL"||str=="null"){
			return true;
		}
		return false;
	}

	/**
	 * <p>Function: 信息加*</P>
	 * @author zhengcs@uubee.com
	 * @date 2016年11月3日 下午5:13:41
	 */
	public static String secretInfo(String info){
		if(info==null||info.length()<2){
			return info;
		}
		return info.substring(0,info.length()-1).replaceAll("\\S", "*")+info.substring(info.length()-1);
	}
	/**
	 * <p>Function: 判断是否中文名字</P>
	 * @author zhengcs@uubee.com
	 * @date 2016年12月13日 下午7:43:25
	 */
	public static boolean isChinaName(String name)
    {
        if (FuncUtils.isNull(name))
        {
            return false;
        }
        if(name.length()<2||name.length()>32){
        	return false;
        }
        return Pattern.matches("[\u4E00-\u9FA5]{1,15}?(?:[·.．•][\u4E00-\u9FA5]{1,15})*", name);
    }
	/**
	 * <p>Function: 生成用户号</P>
	 * @author zhengcs@uubee.com
	 * @date 2017年5月10日 下午9:46:31
	 */
	public static String genOidUserno(){
		return DateUtil.getCurrentDateTimeMs()+RandomStringUtils.random(3, 0, 1000, false, true);
	}
	public static void main(String[] args) {
		System.out.println(genOidUserno());

	}

}
