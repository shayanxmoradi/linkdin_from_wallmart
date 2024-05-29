package org.example.service.jobseeker;

import org.example.model.JobSeeker;
import org.example.repository.baseEntity.BaseEntityRepository;

public interface JobSeekerAuthService extends BaseEntityRepository {
    void register(JobSeeker jobSeeker);
    String login(String username, String password);
    void logout(String token);
    boolean deleteAcc(String username, String password);

}
