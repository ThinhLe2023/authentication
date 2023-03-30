package com.example.demo.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

/**
 * Group role to set permission for a group.
 */
@Entity
@Table(name = "grouprole")
public class GroupRole {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "groupName")
    private String grpName;
    /**
     * @param id
     * @param grpName
     */
    public GroupRole(long id, String grpName) {
        this.id = id;
        this.grpName = grpName;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getGrpName() {
        return grpName;
    }
    public void setGrpName(String grpName) {
        this.grpName = grpName;
    }
}
