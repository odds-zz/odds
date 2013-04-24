package org.odds.hibernate.entities;
// Generated Apr 24, 2013 3:49:45 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Feedback generated by hbm2java
 */
public class Feedback  implements java.io.Serializable {


     private Integer id;
     private User user;
     private String details;
     private Date date;

    public Feedback() {
    }

	
    public Feedback(User user) {
        this.user = user;
    }
    public Feedback(User user, String details, Date date) {
       this.user = user;
       this.details = details;
       this.date = date;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public String getDetails() {
        return this.details;
    }
    
    public void setDetails(String details) {
        this.details = details;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }




}


