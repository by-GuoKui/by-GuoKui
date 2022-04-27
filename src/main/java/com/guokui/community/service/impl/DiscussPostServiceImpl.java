package com.guokui.community.service.impl;

import com.guokui.community.dao.DiscussPostMapper;
import com.guokui.community.entity.DiscussPost;
import com.guokui.community.service.DiscussPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DiscussPostServiceImpl implements DiscussPostService {

    @Resource
    private DiscussPostMapper discussPostMapper;

    @Override
    public List<DiscussPost> queryDiscussPosts(int userId, int offset, int limit) {
        return discussPostMapper.selectDiscussPosts(userId, offset, limit);
    }

    @Override
    public int queryDiscussPostRows(int userId) {
        return discussPostMapper.selectDiscussPostRows(userId);
    }
}
