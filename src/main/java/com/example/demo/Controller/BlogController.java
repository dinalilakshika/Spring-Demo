package com.example.demo.Controller;

import com.example.demo.entity.Blog;
import com.example.demo.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/blog")
@CrossOrigin
public class BlogController {
    @Autowired
    private BlogRepository blogRepository;
    @GetMapping("/getAllPost")
    public List<Blog> getAllPost(){
        return blogRepository.findAll();
    }

    @PostMapping("/savePost")
    public Blog getAllPost(@RequestBody Blog blog){
        return blogRepository.save(blog);
    }

    @PutMapping("/updatePost/{id}")
    public Blog updatePost(@PathVariable Integer id,@RequestBody Blog blog){
        blog.setId(id);
        return blogRepository.save(blog);
    }


    @DeleteMapping("deletePost/{id}")
    public void deletePost(@PathVariable Integer id){
        blogRepository.deleteById(id);
    }


    @GetMapping("/getOnePost/{id}")
    public String getOnePost(@PathVariable("id")String id){
        return id;
    }
}
