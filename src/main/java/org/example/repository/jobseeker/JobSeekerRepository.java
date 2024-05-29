package org.example.repository.jobseeker;

import org.example.model.JobSeeker;
import org.example.model.User;

import java.util.Optional;

public interface JobSeekerRepository {
    void save(JobSeeker jobSeeker);

    Optional<User> findByUserName(String userName);

    Optional<User> findByUsernameAndPassword(String username, String password);

    boolean removeAccount(String userName, String password);

}
