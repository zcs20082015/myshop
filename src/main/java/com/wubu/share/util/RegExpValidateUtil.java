package com.wubu.share.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.hamcrest.core.IsNull;

public class RegExpValidateUtil {

	/**
	 * <p>Function: 判断一个字符串是否是纯数字</P>
	 * @author zhengcs@uubee.com
	 * @date 2016年8月11日 下午3:21:48
	 */
	public static boolean isDigitStr(String intStr){
		Pattern pattern=Pattern.compile("^[0-9]+$");
		Matcher matcher=pattern.matcher(intStr);
		return matcher.matches();
	}
	/**
	 * <p>Function: 是否是字母</P>
	 * @author zhengcs@uubee.com
	 * @date 2016年8月11日 下午5:06:26
	 */
	public static boolean isLetterStr(String letterStr){
		Pattern pattern=Pattern.compile("^[A-Za-z]+$");
		Matcher matcher=pattern.matcher(letterStr);
		return matcher.matches();
	}
	/**
	 * <p>Function: 是否是字母和数字</P>
	 * @author zhengcs@uubee.com
	 * @date 2016年8月11日 下午5:06:38
	 */
	public static boolean isDigitAndLetterStr(String Str){
		Pattern pattern=Pattern.compile("^[A-Za-z09]+$");
		Matcher matcher=pattern.matcher(Str);
		return matcher.matches();
	}
	/**
	 * <p>Function: 两位小数点的浮点数</P>
	 * @author zhengcs@uubee.com
	 * @date 2016年8月11日 下午3:29:00
	 */
	public static boolean isFloatNumOf2dec(String floatStr){
		Pattern pattern=Pattern.compile("^(-)?(0|[1-9][0-9]*)(.[0-9]{1,2})?$");
		Matcher matcher=pattern.matcher(floatStr);
		return matcher.matches();
	}
	/**
	 * <p>Function: 判断是否是汉字</P>
	 * @author zhengcs@uubee.com
	 * @date 2016年8月11日 下午3:59:10
	 */
	public static boolean isChineseStr(String chineseStr){
		Pattern pattern=Pattern.compile("^[\\u4e00-\\u9fa5]+$");
		Matcher matcher=pattern.matcher(chineseStr);
		return matcher.matches();
	}
	/**
	 * <p>Function: 是否是中文名称</P>
	 * @author zhengcs@uubee.com
	 * @date 2016年8月11日 下午5:04:15
	 */
	public static boolean isChineseName(String chineseStr){
		Pattern pattern=Pattern.compile("^[\\u4e00-\\u9fa5]{1,15}([·.．•]?[\\u4e00-\\u9fa5]){1,15}$");
		Matcher matcher=pattern.matcher(chineseStr);
		return matcher.matches();
	}
	/**
	 * <p>Function: 是否是Email</P>
	 * @author zhengcs@uubee.com
	 * @date 2016年8月12日 上午9:47:33
	 */
	public static boolean isEmail(String emailStr){
		Pattern pattern=Pattern.compile("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.(com|cn|com.cn|net|org|gov|gov.cn|edu|edu.cn)$");
		Matcher matcher=pattern.matcher(emailStr);
		return matcher.matches();
	}
	/**
	 * <p>Function: 是否是URL</P>
	 * @author zhengcs@uubee.com
	 * @date 2016年8月12日 上午9:47:58
	 */
	public static boolean isURL(String urlStr){
		Pattern pattern=Pattern.compile("^(http|https)://([\\w-]+\\.)+\\w+(:\\d{0,65535})?(/[\\w-./?%&=]*)?$");
		Matcher matcher=pattern.matcher(urlStr);
		return matcher.matches();
	}
	/**
	 * <p>Function: 手机号校验</P>
	 * @author zhengcs@uubee.com
	 * @date 2016年8月12日 下午4:59:20
	 */
	public static boolean isMobile(String Str){
		Pattern pattern=Pattern.compile("^1[34578][0-9]{9}$");
		Matcher matcher=pattern.matcher(Str);
		return matcher.matches();
	}
	/**
	 * <p>Function: 年月日合法性校验</P>
	 * type:-,/,.等。表示年月日之间的链接形式
	 * @author zhengcs@uubee.com
	 * @date 2016年8月12日 下午5:11:27
	 */
	public static boolean isYearMonthDay(String Str,char type){
		Pattern pattern=Pattern.compile("^((((19|20)\\d{2})\\"+type+"(0[13-9]|1[012])\\"+type+"(0[1-9]|[12]\\d|30))|(((19|20)\\d{2})\\"+type+"(0[13578]|1[02])\\"+type+"31)|(((19|20)\\d{2})\\"+type+"02\\"+type+"(0[1-9]|1\\d|2[0-8]))|((((19|20)([13579][26]|[2468][048]|0[48]))|(2000))\\"+type+"02\\"+type+"29))$");
		Matcher matcher=pattern.matcher(Str);
		return matcher.matches();
	}
	/**
	 * 检查字符串是否连续
	 * @param str
	 * @return
	 */
	public static boolean isSeriesChar(String str){
		if(FuncUtils.isNull(str)){
			return false;
		}
		char[]chars=new char[str.length()];
		str.getChars(0, str.length(), chars, 0);
		char temp=chars[0];
		for(int i=0;i<chars.length;i++){
			if (Math.abs(temp - chars[i]) != 1){
				return false;
			}
			temp=chars[i];
		}
		return true;
	}
	/**
	 * 检查字符串是否完全一致，一致则返回true
	 * 空返回false ，只有一个字符返回true
	 * @param password
	 */
	public static boolean isOnechar(String password){
		if (FuncUtils.isNull(password))
        {
            return false;
        }
		 char[] chars = new char[password.length()];
		 char temp=chars[0];
		 for(char c:chars){
			 if(temp!=c){
				 return false;
			 }
			
		 }
		 return true;
	}
	  /**
     * 检查密码有效性
     * 密码规则：6-20位数字、字母、或字符组合
     * 不能完全连续或完全一致的字符
     * @param password
     * @return
     */
	public static boolean isPassword(String passWord){
		if(FuncUtils.isNull(passWord)){
			return false;
		}
		if(isOnechar(passWord)){
			return false;
		}
		if(isSeriesChar(passWord)){
			return false;
		}
		return Pattern.matches("^[0-9a-zA-Z~!@#$%^&*()_+|\\[\\]\\{\\}\\s]{6,20}$", passWord);
	}
	/**
     * 4-15字母和数字
     * 不分区大小写,不能以数字开头
     * @param str
     */
    public static boolean isNr(String str)
    {
        if (FuncUtils.isNull(str))
            return false;
        return Pattern.matches("^[a-zA-Z][0-9a-zA-Z]{3,14}$", str.trim());
    }
    /**
     * 
     * 功能描述：金额校验，必须大于0.01
     * @param str
     * @return
     */
    public static boolean isMoney(String money)
    {
        if (FuncUtils.isNull(money))
        {
            return false;
        }
        if (!isFloatNumOf2dec(money))
        {
            return false;
        }
        if (Double.parseDouble(money) >= 0.01)
        {
            return true;
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*boolean b=isYearMonthDay("19211221",' ');*/
		Pattern pattern=Pattern.compile("^A*PA+TA*$");
		Matcher matcher=pattern.matcher("QAAPATAAAAAA");
		System.out.println(matcher.matches());
	}

}
