package com.example.demo.entity;

import javax.persistence.*;


/*
 * UserGroup to get the permission of a group.
 */
@Entity
@Table(name="userGroup")
public class UserGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "userId")
    private String userId;

    @Column(name = "groupId")
    private String groupId;

    /**
     * @param id
     * @param userId
     * @param groupId
     */
    public UserGroup(String id, String userId, String groupId) {
        this.id = id;
        this.userId = userId;
        this.groupId = groupId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

}
