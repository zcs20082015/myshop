package com.wubu.share.util;

import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * <p>Title: Property </p>
 * <p>Description: 读取uubee.properties资源文件信息类</p>
 * <p>Company: http://www.uubee.com/ </p>
 * @author liuzhy@uubee.com
 * @date 2015-9-16 下午3:30:54
 */
public class Property{
    private static String CONFIG_FILENAME = "/wubu.properties";
    private static Properties properties      = null;
    
    private static Logger log = Logger.getLogger(Property.class);

    public synchronized static void init(){
        if (isInit())
            return;
        loadProperties();
    }

    public static String getProperty(String key){
        init();
        return properties.getProperty(key);
    }

    public static synchronized void setProperty(String key, String value){
        init();
        properties.setProperty(key, value);
    }

    public static boolean isInit(){
        return properties != null;
    }

    /**
     * <p>Function: 加载配置文件</P>
     * @author liuzhy@uubee.com
     * @date 2015-9-16 下午3:32:15
     */
    private static void loadProperties(){
        try{
            Properties cfgProp = new Properties();
            cfgProp.load(Property.class.getResourceAsStream(CONFIG_FILENAME));
            properties = cfgProp;
            log.info("load success");
        } catch (Exception e){
            log.error("load failed: " + e.toString());
        }
    }
}
