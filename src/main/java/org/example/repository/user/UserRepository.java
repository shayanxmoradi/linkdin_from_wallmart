package org.example.repository.user;

import org.example.model.JobSeeker;
import org.example.repository.baseEntity.BaseEntityRepository;

public interface UserRepository extends BaseEntityRepository {
    void register(JobSeeker jobSeeker);
    String login(String username, String password);


}
