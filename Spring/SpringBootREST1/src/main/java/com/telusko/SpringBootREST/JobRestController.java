package com.telusko.SpringBootREST;

import com.telusko.SpringBootREST.model.JobPost;
import com.telusko.SpringBootREST.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//@Controller
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

//    @GetMapping("jobPost/3")
//    public JobPost getJob(){
//        return jobService.getJob(3);
//    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId){
        return jobService.getJob(postId);
    }

    @PostMapping("jobPost")
    public void addJob(@RequestBody JobPost jobPost){
        jobService.addJob(jobPost);
    }
}
