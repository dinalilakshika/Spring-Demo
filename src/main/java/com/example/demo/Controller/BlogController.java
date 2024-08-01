package com.example.demo.Controller;

import com.example.demo.entity.Blog;
import com.example.demo.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private BlogRepository blogRepository;
    @GetMapping("/getAllPost")
    public List<Blog> getAllPost(){
        return blogRepository.findAll();
    }

    @GetMapping("/savePost")
    public Blog getAllPost(@RequestBody Blog blog){
        return blogRepository.save(blog);
    }

    @GetMapping("/getOnePost/{id}")
    public String getOnePost(@PathVariable("id")String id){
        return id;
    }
}
