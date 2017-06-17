package com.wubu.share.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
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
	 * <p>Function: 是否金钱</P>
	 * 包含0
	 * @author zhengcs@uubee.com
	 * @date 2017年6月15日 上午10:54:40
	 */
	public static boolean isMoney(String money) {
		if (isNull(money)) {
			return false;
		}
		Pattern pattern = Pattern.compile("^[0-9]{0,}[.]{0,1}[0-9]{0,2}$");
		if (!pattern.matcher(money).matches()) {
			return false;
		}
		
		if (Double.parseDouble(money) < 0.01 && Double.parseDouble(money)!=0) {
			return false;
		}
		return true;
	}
	
	/**
	 * <p>Function: 厘转为元</P>
	 * @author zhengcs@uubee.com
	 * @date 2017年6月15日 上午10:58:19
	 */
	public static String li2yuan(String money) {
		if (money == null) {
			return "";
		}
		try {
			double dmoney = Double.parseDouble(money);
			dmoney /= 1000;
			DecimalFormat format = new DecimalFormat("#0.00#");
			return format.format(dmoney);
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

	/**
	 * <p>Function: 元转为厘</P>
	 * @author zhengcs@uubee.com
	 * @date 2017年6月15日 上午10:58:53
	 */
	public static String yuan2li(String amtStr) {
		Long d = new BigDecimal(amtStr).multiply(new BigDecimal(1000))
				.longValue();
		return d.toString();
	}
	/**
	 * <p>Function: 生成用户号</P>
	 * @author zhengcs@uubee.com
	 * @date 2017年5月10日 下午9:46:31
	 */
	public static String genOidUserno(){
		return "U"+DateUtil.getCurrentDateTimeMs()+RandomStringUtils.random(3, 0, 1000, false, true);
	}
	/**
	 * <p>Function: 生成产品编号</P>
	 * @author zhengcs@uubee.com
	 * @date 2017年6月15日 下午3:49:23
	 */
	public static String genOidGoods(){
		return "G"+DateUtil.getCurrentDateTimeMs()+RandomStringUtils.random(3, 0, 1000, false, true);
	}
	public static void main(String[] args) {
		System.out.println(genOidUserno());

	}

}
