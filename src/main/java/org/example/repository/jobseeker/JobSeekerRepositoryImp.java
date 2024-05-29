package org.example.repository.jobseeker;

import org.example.model.JobSeeker;
import org.example.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JobSeekerRepositoryImp implements JobSeekerRepository {
    List<JobSeeker> jobSeekers = new ArrayList<>();

    @Override
    public void save(JobSeeker jobSeeker) {
        jobSeekers.add(jobSeeker);

    }

    @Override
    public Optional<User> findByUserName(String userName) {
        for (JobSeeker jobSeeker : jobSeekers) {
            if (jobSeeker.getUserName().equals(userName)) {
                return Optional.of(jobSeeker);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<User> findByUsernameAndPassword(String username, String password) {
        for (JobSeeker jobSeeker : jobSeekers) {
            if (jobSeeker.getUserName().equals(username) && jobSeeker.getPassword().equals(password)) {
                return Optional.of(jobSeeker);
            }
        }
        return Optional.empty();
    }

    @Override
    public boolean removeAccount(String userName, String password) {
        for (JobSeeker jobSeeker : jobSeekers) {
            if (jobSeeker.getUserName().equals(userName) && jobSeeker.getPassword().equals(password)) {
                jobSeekers.remove(jobSeeker);
                return true;
            }
        }
        return false;
    }

    public List<JobSeeker> getJobSeekers() {
        return jobSeekers;
    }
}
