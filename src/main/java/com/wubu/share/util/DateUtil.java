package com.wubu.share.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateUtil {

	/**
	 * <p>Function: 8位时间串大小比较</P>
	 * @param dt1:yyyyMMdd dt2:yyyyMMdd
	 * @return -1:dt1<dt2；0：dt1=dt2；1:dt1>dt2；-2错误或异常
	 * @author zhengcs@uubee.com
	 * @throws Exception 
	 * @date 2016年8月23日 上午10:30:45
	 */
	public static int compareDate8(String dt1,String dt2) throws Exception{
        /*if(!RegExpValidateUtil.isDigitStr(dt1)||!RegExpValidateUtil.isDigitStr(dt2)||dt1.length()!=8||dt2.length()!=8){
			System.out.println("参数错误");
			return -2;
		}*/		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
        sdf.setLenient(false);
		Date date1=sdf.parse(dt1);
		Date date2=sdf.parse(dt2);
		return date1.compareTo(date2);
	} 
	/**
	 * <p>Function: 10位时间串大小比较</P>
	 * @param dt1:yyyy-MM-dd dt2:yyyy-MM-dd 
	 * @return -1:dt1<dt2；0：dt1=dt2；1:dt1>dt2
	 * @author zhengcs@uubee.com
	 * @throws Exception 
	 * @date 2016年8月23日 上午10:30:45
	 */
	public static int compareDate10(String dt1,String dt2) throws Exception{
		/*if(!RegExpValidateUtil.isYearMonthDay(dt1,'-')||!RegExpValidateUtil.isYearMonthDay(dt2, '-')){
			System.out.println("参数错误");
			return -2;
		}*/
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		sdf.setLenient(false);
		Date date1=sdf.parse(dt1);
		Date date2=sdf.parse(dt2);
		return date1.compareTo(date2);
	} 
	/**
	 * <p>Function: 14位时间串大小比较</P>
	 * @param dt1:yyyyMMddHHmmss  dt2:yyyyMMddHHmmss 
	 * @return -1:dt1<dt2；0：dt1=dt2；1:dt1>dt2；-2错误或异常
	 * @author zhengcs@uubee.com
	 * @throws Exception 
	 * @date 2016年8月23日 上午10:30:45
	 */
	public static int compareDateTime14(String dt1,String dt2) throws Exception{
		/*if(!RegExpValidateUtil.isDigitStr(dt1)||!RegExpValidateUtil.isDigitStr(dt2)||dt1.length()!=14||dt2.length()!=14){
			System.out.println("参数错误");
			return -2;
		}*/
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
		sdf.setLenient(false);
		Date date1=sdf.parse(dt1);
		Date date2=sdf.parse(dt2);
		return date1.compareTo(date2);
	}
	/**
	 * <p>Function: 19位时间串大小比较</P>
	 * @param dt1:yyyy-MM-dd HH:mm:ss  dt2:yyyy-MM-dd HH:mm:ss 
	 * @return -1:dt1<dt2；0：dt1=dt2；1:dt1>dt2；-2错误或异常
	 * @author zhengcs@uubee.com
	 * @throws Exception 
	 * @date 2016年8月23日 上午10:30:45
	 */
	public static int compareDateTime19(String dt1,String dt2) throws Exception{
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		sdf.setLenient(false);
		Date date1=sdf.parse(dt1);
		Date date2=sdf.parse(dt2);
		return date1.compareTo(date2);
	}
	/**
	 * <p>Function: 8位时间串转为10位时间串</P>
	 * @param dt：yyyyMMdd
	 * @return yyyy-MM-dd
	 * @author zhengcs@uubee.com
	 * @date 2016年8月23日 上午10:59:59
	 */
	public static String date8To10(String dt) throws Exception{
		return dt.substring(0,4)+"-"+dt.substring(4,6)+"-"+dt.substring(6,8);
	}
	/**
	 * <p>Function: 10位时间串转为8位时间串</P>
	 * @param dt：yyyy-MM-dd
	 * @return yyyyMMdd
	 * @author zhengcs@uubee.com
	 * @date 2016年8月23日 上午10:59:59
	 */
	public static String date10To8(String dt) throws Exception{
		return dt.replace("-", "");
	}
	/**
	 * <p>Function: 8位时间串转时间</P>
	 * @author zhengcs@uubee.com
	 * @date 2016年8月23日 下午2:13:21
	 */
	public static Date str8ToDate(String dt) throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
		sdf.setLenient(false);
		return sdf.parse(dt);
	}
	/**
	 * <p>Function: 时间转8位时间串</P>
	 * @author zhengcs@uubee.com
	 * @date 2016年8月23日 下午2:18:47
	 */
	public static String dateToStr8(Date dt) throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
		sdf.setLenient(false);
		return sdf.format(dt);
	}
	/**
	 * <p>Function: 10位时间串转时间</P>
	 * @author zhengcs@uubee.com
	 * @date 2016年8月23日 下午2:13:21
	 */
	public static Date str10ToDate(String dt) throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		sdf.setLenient(false);
		return sdf.parse(dt);
	}
	/**
	 * <p>Function: 时间转10位时间串</P>
	 * @author zhengcs@uubee.com
	 * @date 2016年8月23日 下午2:18:47
	 */
	public static String dateToStr10(Date dt) throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		sdf.setLenient(false);
		return sdf.format(dt);
	}
	/**
	 * <p>Function: 14位时间串转时间</P>
	 * @author zhengcs@uubee.com
	 * @date 2016年8月23日 下午2:13:21
	 */
	public static Date str14ToDate(String dt) throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
		sdf.setLenient(false);
		return sdf.parse(dt);
	}
	/**
	 * <p>Function: 时间转14位时间串</P>
	 * @author zhengcs@uubee.com
	 * @date 2016年8月23日 下午2:18:47
	 */
	public static String dateToStr14(Date dt) throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
		sdf.setLenient(false);
		return sdf.format(dt);
	}
	/**
	 * <p>Function: 19位时间串转时间</P>
	 * @author zhengcs@uubee.com
	 * @date 2016年8月23日 下午2:13:21
	 */
	public static Date str19ToDate(String dt) throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		sdf.setLenient(false);
		return sdf.parse(dt);
	}
	/**
	 * <p>Function: 时间转19位时间串</P>
	 * @author zhengcs@uubee.com
	 * @date 2016年8月23日 下午2:18:47
	 */
	public static String dateToStr19(Date dt) throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		sdf.setLenient(false);
		return sdf.format(dt);
	}
	/**
	 * <p>Function: 19位时间串转为14位时间串</P>
	 * @param dt：yyyy-MM-dd HH:mm:ss
	 * @return yyyyMMddHHmmss
	 * @author zhengcs@uubee.com
	 * @date 2016年8月23日 上午10:59:59
	 */
	public static String date19To14(String dt) throws Exception{
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyyMMddHHmmss");
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		sdf1.setLenient(false);
		sdf2.setLenient(false);
		return sdf1.format(sdf2.parse(dt));
	}
	/**
	 * <p>Function: 14位时间串转为19位时间串</P>
	 * @param dt：yyyyMMddHHmmss
	 * @return yyyy-MM-dd HH:mm:ss
	 * @author zhengcs@uubee.com
	 * @date 2016年8月23日 上午10:59:59
	 */
	public static String date14To19(String dt) throws Exception{
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyyMMddHHmmss");
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		sdf1.setLenient(false);
		sdf2.setLenient(false);
		return sdf2.format(sdf1.parse(dt));
	}
	/**
	 * <p>Function: 增加天数</P>
	 * @param 
	 * @return 
	 * @author zhengcs@uubee.com
	 * @date 2016年8月23日 上午11:44:28
	 */
	public static Date addDays(Date dt,int days){
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(dt);
		calendar.add(Calendar.DATE, days);
		return calendar.getTime();
	}
	/**
	 * 
	 * <p>Function: 增加分钟数</P>
	 * @author zhengcs@uubee.com
	 * @date 2016年8月24日 下午1:47:20
	 */
	public static Date addMinutes(Date dt,int mins){
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(dt);
		calendar.add(Calendar.MINUTE, mins);
		return calendar.getTime();
	}
	/**
	 * <p>Function: 计算时间dt1和dt2之间的天数间隔</P>
	 * @author zhengcs@uubee.com
	 * @date 2016年8月24日 下午1:50:28
	 */
	public static int compareDays(Date dt1,Date dt2){
		return (int) ((dt1.getTime()-dt2.getTime())/(1000*60*60*24));
	}
	/**
	 * <p>Function: 计算时间dt1和dt2之间的小时间隔</P>
	 * @author zhengcs@uubee.com
	 * @date 2016年8月24日 下午1:50:28
	 */
	public static long compareHours(Date dt1,Date dt2){
		return (long) ((dt1.getTime()-dt2.getTime())/(1000*60*60));
	}
	/**
	 * <p>Function: 计算时间dt1和dt2之间的分钟间隔</P>
	 * @author zhengcs@uubee.com
	 * @date 2016年8月24日 下午1:50:28
	 */
	public static long compareMinutes(Date dt1,Date dt2){
		return (long) ((dt1.getTime()-dt2.getTime())/(1000*60));
	}
	/**
	 * <p>Function: 获取当前14位时间串</P>
	 * @author zhengcs@uubee.com
	 * @date 2017年5月10日 下午9:35:35
	 */
	public static String getCurrentDateTime14() {
		SimpleDateFormat dataFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		String timeString = dataFormat.format(date);
		return timeString;
	}
	/**
	 * <p>Function: 获取当前14位时间串</P>
	 * @author zhengcs@uubee.com
	 * @date 2017年5月10日 下午9:35:35
	 */
	public static String getCurrentDateTime19() {
		SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String timeString = dataFormat.format(date);
		return timeString;
	}
	/**
	 * <p>Function: 获取当前时间串，到ms</P>
	 * @author zhengcs@uubee.com
	 * @date 2017年5月10日 下午9:35:35
	 */
	public static String getCurrentDateTimeMs() {
		SimpleDateFormat dataFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		Date date = new Date();
		String timeString = dataFormat.format(date);
		return timeString;
	}
	public static void main(String[] args) throws Exception {
		String dt="2016-03-12";
		String dt2="20160312112211";
		//System.out.println(date14To19(dt));
		//System.out.println(dateToStr14(addMinutes(str10ToDate(dt), 12)));
		
		//System.out.println(compareHours(str10ToDate(dt), str14ToDate(dt2)));
		
		long dt1=new Date().getTime();
		
		Date date=new Date(dt1);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));
	}
	
	

}
