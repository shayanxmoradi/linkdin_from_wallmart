package org.example.service.jobseeker;

import org.example.model.JobSeeker;
import org.example.repository.baseEntity.BaseEntityRepository;
import org.example.repository.user.UserRepository;

public interface JobSeekerAuthService extends UserRepository {
    void logout(String token);
    boolean deleteAcc(String username, String password);

}
