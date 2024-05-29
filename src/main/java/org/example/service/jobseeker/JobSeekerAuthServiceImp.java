package org.example.service.jobseeker;

import org.example.model.BaseEntity;
import org.example.model.JobSeeker;
import org.example.repository.baseEntity.BaseEntityRepositoryImp;
import org.example.repository.jobseeker.JobSeekerRepository;

import java.util.Optional;

public class JobSeekerAuthServiceImp  implements JobSeekerAuthService {
    private final JobSeekerRepository repository;

    public JobSeekerAuthServiceImp(JobSeekerRepository repository) {
        this.repository = repository;
    }

    @Override
    public void register(JobSeeker jobSeeker) {
        repository.save(jobSeeker);
    }

    @Override
    public String login(String username, String password) {
        var jobSeeker = repository.findByUsernameAndPassword(username, password);
        if (jobSeeker.isPresent()) {
            jobSeeker.get().getToken();
        }
        return "not found";
    }

    @Override
    public void logout(String token) {

    }

    @Override
    public boolean deleteAcc(String username, String password) {

        return repository.removeAccount(username, password);
    }

    public JobSeekerRepository getRepository() {
        return repository;
    }


    @Override
    public boolean deleteById(Long id) {
        return repository.deleteById(id);
    }



    @Override
    public Optional findById(Long id) {
        return repository.findById(id);

    }
}
