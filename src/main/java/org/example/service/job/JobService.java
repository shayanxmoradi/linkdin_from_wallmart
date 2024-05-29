package org.example.service.job;

import org.example.model.Job;

import java.util.List;

public interface JobService {
    void addJob(Job job);
    void updateJob(Job job);
    void deleteJob(Job job);
    List<Job> findAllJob();
    Job findJobById(Long id);

}
