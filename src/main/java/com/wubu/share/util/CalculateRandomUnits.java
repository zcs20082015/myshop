package com.wubu.share.util;

import java.math.BigDecimal;

/**
 * 

 * @ClassName: CalculateRandomUnits

 * @Description:根据一个总数 随机产生一个随机数平均整数数

 * @author: yuanqf

 * @date: 2016-9-22 下午12:36:07
 */
public class CalculateRandomUnits {
    private static int scale = 0;

  /**
   * 随机生成一个数
   * @param numerator
   * @param denominator
   * @return
   */
    public static BigDecimal[] generalRandomNum(final BigDecimal numerator,
            int denominator) {
    	 if (numerator.compareTo(new BigDecimal("1").multiply(new BigDecimal(
    			 denominator))) <= 0) {
             throw new RuntimeException("小于最小值");
         }
        BigDecimal divisor = new BigDecimal(100);
        int n = numerator.multiply(divisor).intValue();
        // 从1--n之间随机抽出denominator个数。
        BigDecimal[] result = new BigDecimal[denominator];
        int m = denominator;
        int index = 0;
        for (int i = 0; i < n; i++) {
            long bigrand = bigRand();
            if (bigrand % (n - i) < m) {
                result[index++] = new BigDecimal(i + 1).divide(divisor, scale,
                        BigDecimal.ROUND_HALF_UP);
                m--;
            }
        }
        // 分区间处理
        for (int i = denominator - 1; i > 0; i--) {
            if (i == (denominator - 1)) {
                // 最后一个就取剩余的
                result[i] = numerator.subtract(result[i - 1]);
            } else {
                result[i] = result[i].subtract(result[i - 1]);
            }
        }
        return result;
    }

    /**
     * 产生一个很大的随机整数
     * 
     * @return
     */
    private static long bigRand() {
        long bigrand = (long) (Math.random() * Integer.MAX_VALUE)
                + Integer.MAX_VALUE;

        return bigrand;
    }

 
    public static void main(String[] args) {
    	BigDecimal[] b=CalculateRandomUnits.generalRandomNum(new BigDecimal(20), 6);
    	for(int i=0;i<b.length;i++){
    		System.out.println("+++++++++"+b[i]);
    	}
    	
    }
}




