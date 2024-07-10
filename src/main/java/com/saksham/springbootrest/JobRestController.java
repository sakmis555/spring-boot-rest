package com.saksham.springbootrest;

import com.saksham.springbootrest.model.JobPost;
import com.saksham.springbootrest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobRestController {

    @Autowired
    JobService service;

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();
    };

    @GetMapping("jobPost/{postId}")
    public JobPost getJobById(@PathVariable("postId") int postId) {
        return service.getJobById(postId);
    };

    @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost) {
        service.addJob(jobPost);
        return service.getJobById(jobPost.getPostId());
    };

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost) {
        service.updateJob(jobPost);
        return service.getJobById(jobPost.getPostId());
    };

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable("postId") int postId) {
        service.deleteJob(postId);
        return "Deleted";
    }

    @GetMapping("load")
    public String load() {
        service.load();
        return "Data Loaded successfully!!";
    }
}
