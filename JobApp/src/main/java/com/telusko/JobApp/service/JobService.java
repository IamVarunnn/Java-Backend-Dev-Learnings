package com.telusko.JobApp.service;

import com.telusko.JobApp.Repo.JobRepo;
import com.telusko.JobApp.model.JobPost;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {


    private JobRepo jobRepo;

    public void addJob(){

    }

    public List<JobPost> getAllJobs(){
        return new ArrayList<>();
    }
}
