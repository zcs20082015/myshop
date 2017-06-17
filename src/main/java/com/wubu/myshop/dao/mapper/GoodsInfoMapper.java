package com.wubu.myshop.dao.mapper;

import com.wubu.myshop.dao.domain.GoodsInfoBean;
import com.wubu.myshop.dao.domain.GoodsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsInfoMapper {
    long countByExample(GoodsInfoExample example);

    int deleteByExample(GoodsInfoExample example);

    int deleteByPrimaryKey(String oidGoods);

    int insert(GoodsInfoBean record);

    int insertSelective(GoodsInfoBean record);

    List<GoodsInfoBean> selectByExample(GoodsInfoExample example);

    GoodsInfoBean selectByPrimaryKey(String oidGoods);

    int updateByExampleSelective(@Param("record") GoodsInfoBean record, @Param("example") GoodsInfoExample example);

    int updateByExample(@Param("record") GoodsInfoBean record, @Param("example") GoodsInfoExample example);

    int updateByPrimaryKeySelective(GoodsInfoBean record);

    int updateByPrimaryKey(GoodsInfoBean record);
}