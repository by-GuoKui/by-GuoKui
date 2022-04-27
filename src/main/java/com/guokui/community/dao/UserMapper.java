package com.guokui.community.dao;

import com.guokui.community.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User selectUserById(@Param("userId") int id);

}
