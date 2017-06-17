/**
 * 
 */
package com.wubu.myshop.domain;

import com.wubu.myshop.dao.domain.GoodsInfoBean;

/** <p>Title: GoodsInfo </p>
 * <p>Description: </p>
 * <p>Company: http://www.uubee.com/ </p>
 * @author zhengcs@uubee.com
 * @date 2017年6月14日 下午3:04:34
 */
public class GoodsInfo extends GoodsInfoBean{

	private String correlationID;

	public String getCorrelationID() {
		return correlationID;
	}

	public void setCorrelationID(String correlationID) {
		this.correlationID = correlationID;
	}
	
}
