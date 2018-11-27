package com.lsj.test.securitytest.dao;

import com.lsj.test.securitytest.bean.UserBean;
import com.lsj.test.securitytest.bean.UserBeanExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface UserBeanMapper {
    @Insert({
        "insert into user (id, user_name, ",
        "user_password, sex)",
        "values (#{id,jdbcType=INTEGER}, #{userName,jdbcType=VARCHAR}, ",
        "#{userPassword,jdbcType=VARCHAR}, #{sex,jdbcType=INTEGER})"
    })
    int insert(UserBean record);

    @InsertProvider(type=UserBeanSqlProvider.class, method="insertSelective")
    int insertSelective(UserBean record);

    @SelectProvider(type=UserBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_password", property="userPassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.INTEGER)
    })
    List<UserBean> selectByExample(UserBeanExample example);
}