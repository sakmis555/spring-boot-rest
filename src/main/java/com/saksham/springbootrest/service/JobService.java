package com.saksham.springbootrest.service;

import com.saksham.springbootrest.model.JobPost;
import com.saksham.springbootrest.repo.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository repository;
    public void addJob(JobPost jobPost) {
        repository.addJob(jobPost);
    };

    public List<JobPost> getAllJobs() {
        List<JobPost> jobs = repository.getAllJobs();
        return jobs;
//        return null;
    };

    public JobPost getJobById(int postId) {
        return repository.getJobById(postId);
    }

    public void updateJob(JobPost jobPost) {
        repository.updateJob(jobPost);
    }

    public void deleteJob(int postId) {
        repository.deleteJob(postId);
    }
}
