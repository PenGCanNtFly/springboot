package com.hanzo.springboot.adminlte.velocity.mapper;

import com.hanzo.springboot.adminlte.velocity.model.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by P10103052 on 2017/4/13.
 */
@Mapper
public interface UserMapper {

    UserEntity getUserByAge(int age);
}
