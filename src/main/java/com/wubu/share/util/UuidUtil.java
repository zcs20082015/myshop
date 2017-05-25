package com.wubu.share.util;

import java.util.UUID;

/**
 * 获取序列号
 * @author shmily
 * @date 2011-8-16 下午02:02:36
 */
public class UuidUtil {

	public static String getUuid() {
        return UUID.randomUUID().toString();
    }
}
