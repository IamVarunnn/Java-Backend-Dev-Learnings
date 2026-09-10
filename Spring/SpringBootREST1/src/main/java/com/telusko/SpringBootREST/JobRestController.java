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

    @GetMapping(path = "jobPosts", produces = {"application/json"})
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

//    @PostMapping("jobPost")
//    public void addJob(@RequestBody JobPost jobPost){
//        jobService.addJob(jobPost);
//    }

//    @PostMapping("jobPost")
//    public JobPost addJob(@RequestBody JobPost jobPost){
//        jobService.addJob(jobPost);
//        return jobPost;
//    }

    @PostMapping(path = "jobPost", consumes = "application/xml")
    public JobPost addJob(@RequestBody JobPost jobPost){
        jobService.addJob(jobPost);
        return jobService.getJob(jobPost.getPostId());
    }


    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost){
        jobService.updateJob(jobPost);
        return jobService.getJob(jobPost.getPostId());
    }


    @DeleteMapping("jobPost/{postId}")
    public String deleteJobPost(@PathVariable int postId){
        jobService.deleteJob(postId);
        return "Deleted";
    }
}
