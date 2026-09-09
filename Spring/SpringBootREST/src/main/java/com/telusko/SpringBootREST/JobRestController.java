package com.telusko.SpringBootREST;

import com.telusko.SpringBootREST.model.JobPost;
import com.telusko.SpringBootREST.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobRestController {
    @Autowired
    private JobService jobService;
//    @GetMapping("jobPosts")
//    @ResponseBody
//    public List<JobPost> getAllJobs(){
//        return jobService.getAllJobs();
//    }



    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs(){
        return jobService.getAllJobs();
    }
}
