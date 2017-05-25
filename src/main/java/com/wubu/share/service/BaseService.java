/**
 * 
 */
package com.wubu.share.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/** <p>Title: BaseService </p>
 * <p>Description: </p>
 * <p>Company: http://www.uubee.com/ </p>
 * @author zhengcs@uubee.com
 * @date 2017年5月10日 下午9:13:59
 */
@Service
public class BaseService {

	protected Logger log=LoggerFactory.getLogger(BaseService.class);
	
	protected String tag="Service[{}],Method[{}],correlationID[{}]--";
	
}
