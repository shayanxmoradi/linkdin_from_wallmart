package org.example;

import org.example.model.JobSeeker;
import org.example.model.User;
import org.example.repository.jobseeker.JobSeekerRepositoryImp;
import org.example.service.jobseeker.JobSeekerAuthServiceImp;

public class Main {
    public static void main(String[] args) {
        JobSeekerRepositoryImp jobSeekerRepositoryImp = new JobSeekerRepositoryImp();
        JobSeekerAuthServiceImp jobSeekerAuthServiceImp = new JobSeekerAuthServiceImp(jobSeekerRepositoryImp);
        JobSeeker jobSeeker = new JobSeeker("shayan","moradi","1234","shayan@gmail.com");
        jobSeekerAuthServiceImp.register(jobSeeker);
        JobSeeker jobSeeker1 = jobSeekerRepositoryImp.getJobSeekers().get(0);
        System.out.println(  jobSeekerRepositoryImp.getJobSeekers());
//        System.out.println(jobSeekerRepositoryImp.getJobSeekers().get(0));
        System.out.println(jobSeeker1.getName());
        System.out.println("res"+jobSeekerRepositoryImp.findById(1L));
       // jobSeekerRepositoryImp.getJobSeekers().remove(jobSeeker1);
      //  System.out.println(  jobSeekerRepositoryImp.getJobSeekers());



    }
}