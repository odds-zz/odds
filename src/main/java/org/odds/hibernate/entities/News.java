package org.odds.hibernate.entities;
// Generated Apr 24, 2013 2:19:10 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * News generated by hbm2java
 */
public class News  implements java.io.Serializable {


     private Integer id;
     private String title;
     private String body;
     private Date time;

    public News() {
    }

    public News(String title, String body, Date time) {
       this.title = title;
       this.body = body;
       this.time = time;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getBody() {
        return this.body;
    }
    
    public void setBody(String body) {
        this.body = body;
    }
    public Date getTime() {
        return this.time;
    }
    
    public void setTime(Date time) {
        this.time = time;
    }




}

