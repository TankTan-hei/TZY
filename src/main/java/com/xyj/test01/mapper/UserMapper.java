package com.xyj.test01.mapper;

import com.xyj.test01.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getAll();
}
