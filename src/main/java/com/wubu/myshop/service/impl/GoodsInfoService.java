/**
 * 
 */
package com.wubu.myshop.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.sun.el.lang.FunctionMapperImpl.Function;
import com.wubu.myshop.dao.domain.GoodsInfoBean;
import com.wubu.myshop.dao.domain.GoodsInfoExample;
import com.wubu.myshop.dao.mapper.GoodsInfoMapper;
import com.wubu.myshop.dao.mapper.UserInfoMapper;
import com.wubu.myshop.domain.GoodsInfo;
import com.wubu.myshop.domain.UserInfo;
import com.wubu.myshop.service.IGoodsService;
import com.wubu.share.enums.ErrorCode;
import com.wubu.share.exception.BusiException;
import com.wubu.share.exception.ParamException;
import com.wubu.share.service.BaseService;
import com.wubu.share.util.DateUtil;
import com.wubu.share.util.FuncUtils;
import com.wubu.share.wrapper.ModelListResult;

/** <p>Title: GoodsInfoService </p>
 * <p>Description: </p>
 * <p>Company: http://www.uubee.com/ </p>
 * @author zhengcs@uubee.com
 * @date 2017年6月14日 下午3:32:53
 */
@Service
public class GoodsInfoService extends BaseService implements IGoodsService{

	@Resource
	private GoodsInfoMapper goodsInfoMapper;
	
	@Override
	public GoodsInfo addGoodsInfo(GoodsInfo goods) {
		log.info(tag+"进入货物新增方法，请求参数:{}","addGoodsInfo",goods.getCorrelationID(),JSON.toJSONString(goods));
		
		//参数校验
		if(FuncUtils.isNull(goods.getNameGoods())){
			throw new ParamException();
		}
		if(null==goods.getCountGoods()){
			goods.setCountGoods(1);
		}
		if(FuncUtils.isNull(goods.getStatusGoods())){
			goods.setStatusGoods("1");//仓储
		}
		if(FuncUtils.isNull(goods.getPriceGoods())){
			goods.setPriceGoods("0");
		}else{
			goods.setPriceGoods(FuncUtils.yuan2li(goods.getPriceGoods()));
		}
		
		
		goods.setOidGoods(FuncUtils.genOidGoods());
		
		goods.setDtCreate(DateUtil.getCurrentDateTime14());
		
		try {
			goodsInfoMapper.insertSelective(goods);
		} catch (Exception e) {
			log.error(tag+"产品新增异常","addGoodsInfo",goods.getCorrelationID(),e);
			throw new BusiException(ErrorCode.SYS_FAIL);
		}
		log.info(tag+"货物新增成功，编号：{}","addGoodsInfo",goods.getCorrelationID(),goods.getOidGoods());
		return JSON.parseObject(JSON.toJSONString(goods),GoodsInfo.class);
	}

	@Override
	public void updateGoodsInfo(GoodsInfo goods) {
        log.info(tag+"进入货物信息更新方法，请求参数:{}","updateGoodsInfo",goods.getCorrelationID(),JSON.toJSONString(goods));
		
		//参数校验
		if(FuncUtils.isNull(goods.getOidGoods())){
			throw new ParamException();
		}
		if(!FuncUtils.isNull(goods.getPriceGoods())){
			goods.setPriceGoods(FuncUtils.yuan2li(goods.getPriceGoods()));
		}
		
		//禁止更新产品数量
		goods.setCountGoods(null);
		goods.setDtUpdate(DateUtil.getCurrentDateTime14());
		
		try {
			goodsInfoMapper.updateByPrimaryKeySelective(goods);
		} catch (Exception e) {
			log.error(tag+"产品更新异常","addGoodsInfo",goods.getCorrelationID(),e);
			throw new BusiException(ErrorCode.SYS_FAIL);
		}
		log.info(tag+"产品更新成功","addGoodsInfo",goods.getCorrelationID());
		return;
	}

	@Override
	public GoodsInfo singleQuery(String oid_goods, String correlationID) {
		log.info(tag+"进入货物信息单条查询方法，请求参数:{}","singleQuery",correlationID,oid_goods);
		
		//参数校验
		if(FuncUtils.isNull(oid_goods)){
			throw new ParamException();
		}
		GoodsInfoBean bean=null;
		try {
			bean=goodsInfoMapper.selectByPrimaryKey(oid_goods);
		} catch (Exception e) {
			log.error(tag+"产品查询异常","singleQuery",correlationID,e);
			throw new BusiException(ErrorCode.SYS_FAIL);
		}
		log.info(tag+"产品单条查询成功,{}","singleQuery",correlationID,JSON.toJSONString(bean));
		return JSON.parseObject(JSON.toJSONString(bean),GoodsInfo.class);
	}

	@Override
	public ModelListResult<GoodsInfo> queryGoods(GoodsInfoExample example,String correlationID) {
		log.info(tag+"进入货物信息条件查询方法，请求参数:{}","queryGoods",correlationID,JSON.toJSONString(example)); 
		
		try {
			long count=goodsInfoMapper.countByExample(example);
			List<GoodsInfoBean> list=goodsInfoMapper.selectByExample(example);
			
			ModelListResult<GoodsInfo> model=new ModelListResult<>();
			List<GoodsInfo> list2=new ArrayList<>();
			model.setCount((int)count);
			if(count>0){
				for(GoodsInfoBean bean:list){
					GoodsInfo goods=JSON.parseObject(JSON.toJSONString(bean), GoodsInfo.class);
					list2.add(goods);
				}
			}
			model.setModel(list2);
			
			return model;
		} catch (Exception e) {
			log.error(tag+"产品查询异常","queryGoods",correlationID,e);
			throw new BusiException(ErrorCode.SYS_FAIL);
		}
		
	}

	/**
	 * 增加库存
	 */
	@Override
	public int increateCountOfGoods(String oid_goods, int num,
			String correlationID) {
		log.info(tag+"进入货物{}库存增加{}处理方法","increateCountOfGoods",correlationID,oid_goods,num);
		
		if(FuncUtils.isNull(oid_goods)||num<=0){
			throw new ParamException();
		}
		
		int count = updateCountGoods(oid_goods,num,correlationID);
		
		log.info(tag+"货物{}库存增加{}处理成功，更新后库存为{}","increateCountOfGoods",correlationID,oid_goods,num,count);
		
		return count;
	}

	@Override
	public int consumerGoods(String oid_goods, int num, String correlationID) {
        log.info(tag+"进入货物{}库存减少{}处理方法","consumerGoods",correlationID,oid_goods,num);
		
		if(FuncUtils.isNull(oid_goods)||num<=0){
			throw new ParamException();
		}
		
		int count = updateCountGoods(oid_goods,0-num,correlationID);
		
		log.info(tag+"货物{}库存减少{}处理成功，更新后库存为{}","increateCountOfGoods",correlationID,oid_goods,num,count);
		
		return count;
	}
	
	/**
	 * <p>Function: 安全更新</P>
	 * @author zhengcs@uubee.com
	 * @date 2017年6月16日 下午1:48:01
	 */
	private int updateCountGoods(String oid_goods,int num,String correlationID){
		synchronized (oid_goods.intern()) {
			//查询
			GoodsInfo goods=singleQuery(oid_goods, correlationID);
			
			int count=goods.getCountGoods()+num;
			if(count<0){
				log.info(tag+"更新失败，库存不足","updateCountGoods",correlationID);
				throw new BusiException(ErrorCode.GOODS_STOCK_NOT_ENOUGH);
			}
			
			GoodsInfo temp=new GoodsInfo();
			temp.setCorrelationID(correlationID);
			temp.setCountGoods(count);
			try {
				goodsInfoMapper.updateByPrimaryKeySelective(temp);
			} catch (Exception e) {
				log.error(tag+"产品更新异常","updateCountGoods",correlationID,e);
				throw new BusiException(ErrorCode.SYS_FAIL);
			}
			
			return count;
		}
	}

}
