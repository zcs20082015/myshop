package com.wubu.myshop.dao.mapper;

import com.wubu.myshop.dao.domain.UserInfoBean;
import com.wubu.myshop.dao.domain.UserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper {
    long countByExample(UserInfoExample example);

    int deleteByExample(UserInfoExample example);

    int deleteByPrimaryKey(String oidUserno);

    int insert(UserInfoBean record);

    int insertSelective(UserInfoBean record);

    List<UserInfoBean> selectByExample(UserInfoExample example);

    UserInfoBean selectByPrimaryKey(String oidUserno);

    int updateByExampleSelective(@Param("record") UserInfoBean record, @Param("example") UserInfoExample example);

    int updateByExample(@Param("record") UserInfoBean record, @Param("example") UserInfoExample example);

    int updateByPrimaryKeySelective(UserInfoBean record);

    int updateByPrimaryKey(UserInfoBean record);
}