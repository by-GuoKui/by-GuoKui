package com.guokui.community.service;

import com.guokui.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DiscussPostService {

    List<DiscussPost> queryDiscussPosts(int userId, int offset, int limit);

    int queryDiscussPostRows(@Param("userId") int userId);

}
