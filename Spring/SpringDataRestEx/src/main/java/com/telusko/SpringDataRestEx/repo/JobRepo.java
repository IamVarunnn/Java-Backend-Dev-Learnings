package com.telusko.SpringDataRestEx.repo;

import com.telusko.SpringDataRestEx.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepo extends JpaRepository<JobPost, Integer> {

}
