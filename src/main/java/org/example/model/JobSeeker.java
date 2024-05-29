package org.example.model;

public class JobSeeker extends User {


    public JobSeeker( String name, String userName, String password, String email) {
        super( name, userName, password, email);
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
