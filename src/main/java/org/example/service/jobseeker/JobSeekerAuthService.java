package org.example.service.jobseeker;

import org.example.model.JobSeeker;

public interface JobSeekerAuthService {
    void register(JobSeeker jobSeeker);
    String login(String username, String password);
    void logout(String token);
    boolean deleteAcc(String username, String password);

}
