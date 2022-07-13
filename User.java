package com.in28minutes.learning.jpa.jpain10steps.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// Map a User obj to a Table
@Entity
public class User {
    // User ID should be a PK(@Id), and should be randomly generated
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String role;

    protected User(){

    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }


    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }
}
