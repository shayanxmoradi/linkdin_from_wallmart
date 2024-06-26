package org.example.model;

public class Job {
    private int id;
    private String name;
    private String description;
    private String location;
    private String type;
    private String status;
    private Employer publisherEmployer;
    private double proposedSalary;

    public Job(int id, String name, String description, String location, String type, String status, Employer publisherEmployer, double proposedSalary) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.location = location;
        this.type = type;
        this.status = status;
        this.publisherEmployer = publisherEmployer;
        this.proposedSalary = proposedSalary;
    }
}
