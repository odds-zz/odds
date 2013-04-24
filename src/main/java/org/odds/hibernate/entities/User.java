package org.odds.hibernate.entities;
// Generated Apr 24, 2013 3:49:45 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private Integer id;
     private String firstname;
     private String lastname;
     private String username;
     private String password;
     private Integer enabled;
     private Set feedbacks = new HashSet(0);
     private Set userContacts = new HashSet(0);
     private Set userRoles = new HashSet(0);
     private Set donations = new HashSet(0);

    public User() {
    }

    public User(String firstname, String lastname, String username, String password, Integer enabled, Set feedbacks, Set userContacts, Set userRoles, Set donations) {
       this.firstname = firstname;
       this.lastname = lastname;
       this.username = username;
       this.password = password;
       this.enabled = enabled;
       this.feedbacks = feedbacks;
       this.userContacts = userContacts;
       this.userRoles = userRoles;
       this.donations = donations;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Integer getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }
    public Set getFeedbacks() {
        return this.feedbacks;
    }
    
    public void setFeedbacks(Set feedbacks) {
        this.feedbacks = feedbacks;
    }
    public Set getUserContacts() {
        return this.userContacts;
    }
    
    public void setUserContacts(Set userContacts) {
        this.userContacts = userContacts;
    }
    public Set getUserRoles() {
        return this.userRoles;
    }
    
    public void setUserRoles(Set userRoles) {
        this.userRoles = userRoles;
    }
    public Set getDonations() {
        return this.donations;
    }
    
    public void setDonations(Set donations) {
        this.donations = donations;
    }




}


