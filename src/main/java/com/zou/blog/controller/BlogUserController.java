package com.zou.blog.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  用户
 * </p>
 *
 * @author ZouJunJie
 * @since 2020-07-01
 */
@RestController
@RequestMapping("/blog-user")
public class BlogUserController {

    @GetMapping("login")
    public String login(){
        return "hello";
    }

}

