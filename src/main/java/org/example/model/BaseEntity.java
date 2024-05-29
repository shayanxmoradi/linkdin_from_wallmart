package org.example.model;

public class BaseEntity {
    Long id;

    public BaseEntity(Long id) {
        this.id = id;
    }
    public BaseEntity() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
