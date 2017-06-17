package com.wubu.myshop.service;

import java.util.List;

import com.wubu.myshop.dao.domain.GoodsInfoExample;
import com.wubu.myshop.domain.GoodsInfo;
import com.wubu.myshop.domain.UserInfo;
import com.wubu.share.wrapper.ModelListResult;

/**
 * <p>Title: IGoodsService </p>
 * <p>Description: 货物信息服务</p>
 * <p>Company: http://www.uubee.com/ </p>
 * @author zhengcs@uubee.com
 * @date 2017年6月14日 下午3:06:16
 */
	public interface IGoodsService{
	
		/**
		 * <p>Function: 货物信息新增</P>
		 * @author zhengcs@uubee.com
		 * @date 2017年6月14日 下午3:08:13
		 */
		public GoodsInfo addGoodsInfo(GoodsInfo goods);
	
		/**
		 * <p>Function: 货物信息更新</P>
		 * @author zhengcs@uubee.com
		 * @date 2017年6月14日 下午3:09:00
		 */
		public void updateGoodsInfo(GoodsInfo goods);
		
		/**
		 * <p>Function: 主键查询货物信息</P>
		 * @author zhengcs@uubee.com
		 * @date 2017年6月14日 下午3:23:10
		 */
		public GoodsInfo singleQuery(String oid_goods,String correlationID);
		
		/**
		 * <p>Function: 条件查询</P>
		 * @author zhengcs@uubee.com
		 * @date 2017年6月14日 下午3:26:21
		 */
		public ModelListResult<GoodsInfo> queryGoods(GoodsInfoExample example,String correlationID);
		
		/**
		 * <p>Function: 增加库存</P>
		 * @author zhengcs@uubee.com
		 * @date 2017年6月15日 下午5:25:08
		 */
		public int increateCountOfGoods(String oid_goods,int num,String correlationID); 
		
		/**
		 * <p>Function: 消费库存</P>
		 * @author zhengcs@uubee.com
		 * @date 2017年6月15日 下午5:28:47
		 */
		public int consumerGoods(String oid_goods,int num,String correlationID);
}

