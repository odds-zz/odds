package org.odds.hibernate.entities;
// Generated Jun 2, 2013 2:12:54 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Feedback generated by hbm2java
 */
@Entity
@Table(name="feedback"
    ,catalog="odds_db"
)
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
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id", nullable=false)
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    
    @Column(name="details")
    public String getDetails() {
        return this.details;
    }
    
    public void setDetails(String details) {
        this.details = details;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date", length=19)
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }




}


