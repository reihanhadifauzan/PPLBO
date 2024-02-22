package com.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.vo.Post;
@RestController
public class PostController {

    @GetMapping("/post")
    public Post getPost() {
        Post post = new Post(1L, "Mike", "Mike's Post", "Welcome to My Blog");
        return post;
    }
    
}
