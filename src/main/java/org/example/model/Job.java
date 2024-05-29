package org.example.model;

public class Job extends BaseEntity {

    private String name;
    private String description;
    private String location;
    private String type;
    private String status;
    private Employer publisherEmployer;
    private double proposedSalary;

    public Job( String name, String description, String location, String type, String status, Employer publisherEmployer, double proposedSalary) {

        this.name = name;
        this.description = description;
        this.location = location;
        this.type = type;
        this.status = status;
        this.publisherEmployer = publisherEmployer;
        this.proposedSalary = proposedSalary;
    }
}
