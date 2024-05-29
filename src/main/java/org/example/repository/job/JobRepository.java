package org.example.repository.job;

import org.example.model.Job;

import java.util.List;
import java.util.Optional;

public interface JobRepository {

    void addJob(Job job);
    void updateJob(Job job);
    void deleteJob(Job job);
    List<Job> findAllJob();
    Job findJobById(Long id);

}
