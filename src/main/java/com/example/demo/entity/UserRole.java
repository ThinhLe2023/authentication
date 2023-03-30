package com.example.demo.entity;

import javax.persistence.*;

public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "role")
    private String role;

    public UserRole(String id, String name, String role){
        this.id = id;
        this.name = name;
        this.role = role;
    }

    /**
     * @param nameString
     * @return true/false if it user has admin role.
     */
    public boolean isAdminUser(String nameString){
        if (nameString != null && nameString.equalsIgnoreCase(name)) {
            return true;
        }
        return false;
    }
}