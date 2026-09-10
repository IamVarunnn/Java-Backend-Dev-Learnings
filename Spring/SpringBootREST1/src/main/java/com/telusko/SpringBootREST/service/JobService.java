package com.telusko.SpringBootREST.service;

import com.telusko.SpringBootREST.model.JobPost;
import com.telusko.SpringBootREST.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobService {

    @Autowired
    private JobRepo jobRepo;

    public void addJob(JobPost jobPost){
        jobRepo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return jobRepo.findAll();
    }

    public JobPost getJob(int postId){
        return jobRepo.getJob(postId);
    }

    public void updateJob(JobPost jobPost) {

        jobRepo.updateJob(jobPost);
    }

    public void deleteJob(int postId) {
        jobRepo.deleteJob(postId);
    }
}