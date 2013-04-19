package org.odds.hibernate.entities;
// Generated Apr 19, 2013 6:28:17 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Feedback generated by hbm2java
 */
public class Feedback  implements java.io.Serializable {


     private Integer id;
     private String userId;
     private String details;
     private Date date;

    public Feedback() {
    }

    public Feedback(String userId, String details, Date date) {
       this.userId = userId;
       this.details = details;
       this.date = date;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
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

