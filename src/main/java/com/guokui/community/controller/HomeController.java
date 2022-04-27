package com.guokui.community.controller;

import com.guokui.community.entity.DiscussPost;
import com.guokui.community.entity.Page;
import com.guokui.community.entity.User;
import com.guokui.community.service.DiscussPostService;

import com.guokui.community.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    @Resource
    private DiscussPostService discussPostService;
    @Resource
    private UserService userService;

    /**
     * 分页功能
     * @param model
     * @param page
     * @return
     */
    @GetMapping ("/index")
    public String getIndexPage(Model model, Page page){
        page.setRows(discussPostService.queryDiscussPostRows(0));
        page.setPath("/index");
        List<DiscussPost> list = discussPostService.queryDiscussPosts(0, page.getOffset(), page.getLimit());
        List<Map<String, Object>> discussPosts = new ArrayList<>();
        if (list != null) {
            for (DiscussPost post : list) {
                Map<String, Object> map = new HashMap<>();
                map.put("post", post);
                User user = userService.queryUserById(post.getUserId());
                map.put("user", user);
                discussPosts.add(map);
            }
        }
        model.addAttribute("discussPosts", discussPosts);
        return "/index";
    }
}
