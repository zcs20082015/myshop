package com.wubu.share.util;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


@SuppressWarnings("all")
public class Reflect {
    /**
     * @param obj  操作的对象
     * @param att  操作的属性
     * */
    public static Object getter(Object obj, String att) {
        try {
            Method method = obj.getClass().getMethod("get" + att.substring(0,1).toUpperCase()+att.substring(1));
            return method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    /**
     * 获取obj对象 att 属性的get方法上的Anno
     * @param obj  操作的对象
     * @param att  操作的属性
     * @param c  Anno的类
     * */
    public static Object getGetterAnno(Object obj, String att,Class c) {
        try {
        	if(null != att){
        		if (obj instanceof Class) {
					Class cl = (Class) obj;
					Method method = cl.getMethod("get" + att.substring(0,1).toUpperCase()+att.substring(1));
	                return method.getAnnotation(c);
				}else{
					Method method = obj.getClass().getMethod("get" + att.substring(0,1).toUpperCase()+att.substring(1));
	                return method.getAnnotation(c);
				}
        		
        	}else{
        		if (obj instanceof Class) {
        			return((Class) obj).getAnnotation(c);
				}else{
					return obj.getClass().getAnnotation(c);
				}
        	}
            
        } catch (NoSuchMethodException e) {
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    /**
     * 查看是否有当前的anno
     * @param obj  操作的对象
     * @param att  操作的属性
     * @param c  Anno的类
     * */
    public static Boolean containAnno(Object obj, String att,Class c) {
        try {
            Method method = obj.getClass().getMethod("get" + att.substring(0,1).toUpperCase()+att.substring(1));
            
            return method.isAnnotationPresent(c);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
    
    
    /**
     * 获得obj简单名称
     * @param obj
     * @return
     */
    public static String getClassName(Object obj){
    	
    	if (null != obj) {
    		String name = obj.getClass().getName();
    		name = name.substring(name.lastIndexOf(".")+1);
    		return name;
		} else {
			return null;
		}
    }
    
    
    public static Map getMethod(Object obj,String method,Class[] paramTypes,Object[] os) throws NoSuchMethodException, SecurityException {
    	
    	Map rs = new HashMap();
    	rs.put("p", os);
    	Class staticcl;
    	if (obj instanceof Class) {
    		staticcl = (Class)obj;
    	} else {
    		staticcl = obj.getClass();
    	}
    	Method m;
    	try {
    		rs.put("m",staticcl.getMethod(method, paramTypes));
			return rs;
		} catch (NoSuchMethodException e) {
			System.err.println("第一次获取方法"+method+"失败！尝试获取父类方法！");
		} 
    	
    	try {
    		rs.put("m",staticcl.getDeclaredMethod(method,paramTypes));
			return rs;
		} catch (NoSuchMethodException e) {
			System.err.println("父类中获取方法"+method+"失败！尝试获取可变参数方法！");
		} 
    	
    	Class c = null;
    	int count = 0;
    	for (int i = paramTypes.length-1; i > -1; i--) {
			if (null != c ) {
				if (!paramTypes[i].equals(c)) {
					break;
				}
				
			} else {
				c = paramTypes[i];
			}
			count++;
		}
    	count--;
    	Class[] cs = new Class[paramTypes.length-count];
    	//获取对象
    	Object[] ostemp = new Object[paramTypes.length - count];
    	
    	for (int i = 0;i < cs.length;i++) {
    		cs[i] = paramTypes[i];
    		ostemp[i] = os[i];
    	}
    	cs[cs.length - 1] = Array.newInstance(c, 10).getClass();
    	ostemp[ostemp.length - 1] = Array.newInstance(c, count+1);
    	for (int i=cs.length-1;i < os.length;i++) {
    		Array.set(ostemp[ostemp.length - 1], i-cs.length+1, os[i]);
    	}
    	os = ostemp;
    	rs.put("m",staticcl.getMethod(method,cs));
    	rs.put("p", os);
    	return rs;
    	
    }
}
