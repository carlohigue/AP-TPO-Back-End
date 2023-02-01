/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CrudCode.Model;

import javax.persistence.*;


@Entity
@Table(name="users")
public class User {
    
    @Id
    @Column(name="UserId", unique = true, nullable = false, length = 20)
    private String UserId;
    
    @Column(name="Password", nullable = false, length = 20)
    private String Password;
    
    @Column(name="userRole", nullable = false, length = 10)
    private String userRole;

    
    public String getUserId() {
        return UserId;
    }
    public void setUserId(String Id) {
        this.UserId = Id;
    }
    
    public String getPassword() {
        return Password;
    }
    public void setPassword(String pass) {
        this.Password = pass;
    }
    
    public String getRole() {
        return userRole;
    }
    public void setRole(String uRole) {
        this.userRole = uRole;
    }
}