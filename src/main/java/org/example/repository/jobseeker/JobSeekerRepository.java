package org.example.repository.jobseeker;

import org.example.model.JobSeeker;
import org.example.model.User;
import org.example.repository.baseEntity.BaseEntityRepository;

import java.util.Optional;

public interface JobSeekerRepository extends BaseEntityRepository {
    void save(JobSeeker jobSeeker);

    Optional<User> findByUserName(String userName);

    Optional<User> findByUsernameAndPassword(String username, String password);

    boolean removeAccount(String userName, String password);

}
