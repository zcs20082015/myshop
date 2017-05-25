package com.wubu.myshop.service;

import java.io.Serializable;
/**
 * 
 * @author Hanpb
 * @date 2016-3-14上午11:19:09
 */

public interface ICacheService{
	/**
     * 把数据放入缓存中
     * @param key
     * @param obj
     * @return
     */
    public boolean putToCache(String key, Serializable obj);
    /**
     * 把数据放入缓存中
     * @param key
     * @param obj
     * @return
     */
    public boolean putToCache(String key, Serializable obj,
                              String expireDateMills);
    /**
     * 从缓存中取出数据
     * @param key
     * @return
     */
    public Object getFromCache(String key);
    
    /**
     * 清除缓存中的数据
     * @param key
     * @return
     */
    public boolean deleteCache(String key);
    
   
    
}
