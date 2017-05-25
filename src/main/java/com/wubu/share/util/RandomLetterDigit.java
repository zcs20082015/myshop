package com.wubu.share.util;

import java.util.Random;

/**
 * <p>Title: RandomLetterDigit </p>
 * <p>Description: 获取随机值</p>
 * <p>Company: http://www.uubee.com/ </p>
 * @author liuzhy@uubee.com
 * @date 2015-9-23 下午3:58:31
 */
public class RandomLetterDigit{

    /**取得数字与字母组成的随机值
     * @param null
     * @return String strNumRandom
     */
    public static String genLetterDigitRandom(int size){
        StringBuffer allLetterDigit = new StringBuffer(
                "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        Random random = new Random();

        StringBuffer randomStrBuf = new StringBuffer("");
        for (int i = 0; i < size; i++){
            randomStrBuf.append(allLetterDigit.charAt(random
                    .nextInt(allLetterDigit.length())));
        }
        return randomStrBuf.toString();
    }

    /**取得数字组成的随机值
     * @param null
     * @return String strNumRandom
     */
    public static String genDigitRandom(int size){
        StringBuffer allLetterDigit = new StringBuffer("0123456789");
        Random random = new Random();

        StringBuffer randomStrBuf = new StringBuffer("");
        for (int i = 0; i < size; i++){
            randomStrBuf.append(allLetterDigit.charAt(random
                    .nextInt(allLetterDigit.length())));
        }
        return randomStrBuf.toString();
    }

    /**取得数字组成的随机值
     * @param null
    */
    public static int DigitRandom(int size){
        int create_id = 123456789;
        try{
            int numDigit = size;
            double d = Math.random();
            int n = 1;
            for (int i = 0; i < numDigit; i++)
                n = n * 10;
            create_id = (int) (d * n) + 1;
            if (create_id == Integer.MAX_VALUE){
                create_id = DigitRandom(9);
            }
        } catch (Exception e){
        	
        }
        return create_id;
    }

    public static String realAuthAmount(){
        Random random = new Random();
        int num = random.nextInt(20);
        if (num == 0)
            num = 1;
        return String.valueOf(num * 10);
    }

    public static String genUrlRandom(String urllink){
        try{
            String temp;
            if (urllink.indexOf('?') != -1){
                temp = urllink + "?rand=" + genLetterDigitRandom(16);
            } else{
                temp = urllink + "&rand=" + genLetterDigitRandom(16);
            }
            return temp;
        } catch (Exception e){
            return urllink;
        }
    }
}
