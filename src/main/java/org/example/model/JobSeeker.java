package org.example.model;

public class JobSeeker extends User {


    public JobSeeker(Long id, String name, String userName, String password, String email) {
        super(id, name, userName, password, email);
    }

    @Override
    public String toString() {
        return "JobSeeker{" +
                "name='" + name + '\'' +
                ", UserName='" + UserName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
