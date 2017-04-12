package com.hanzo.mybatis.starter.mapper;

import com.hanzo.mybatis.starter.model.UserEntity;
import org.apache.ibatis.annotations.Param;

/**
 * 用户 Dao 接口
 * Created by P10103052 on 2017/4/12.
 */
public interface UserDao {
    /**
     * 根据年龄，查询用户信息
     *
     * @param age 年龄
     */

    UserEntity getUserByAge(@Param("age") int age);
}
