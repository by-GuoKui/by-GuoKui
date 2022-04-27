package com.guokui.community.dao;

import com.guokui.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DiscussPostMapper {

    /**
     * 分页查询
     * @param userId ： 用户的 Id
     * @param offset ： 起始数据编号
     * @param limit  ： 每页显示多少条数据
     * @return
     */
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    /**
     * 查询数据的总数量
     * @param userId ： 用户的 Id
     * @return
     */
    int selectDiscussPostRows(@Param("userId") int userId);

}
