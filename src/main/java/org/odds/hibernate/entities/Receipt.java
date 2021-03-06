package org.odds.hibernate.entities;
// Generated Jun 2, 2013 2:12:54 PM by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Receipt generated by hbm2java
 */
@Entity
@Table(name="receipt"
    ,catalog="odds_db"
)
public class Receipt  implements java.io.Serializable {


     private int id;
     private String donor;
     private Integer time;
     private String transcationId;
     private String donationType;

    public Receipt() {
    }

	
    public Receipt(int id) {
        this.id = id;
    }
    public Receipt(int id, String donor, Integer time, String transcationId, String donationType) {
       this.id = id;
       this.donor = donor;
       this.time = time;
       this.transcationId = transcationId;
       this.donationType = donationType;
    }
   
     @Id 
    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    @Column(name="donor", length=128)
    public String getDonor() {
        return this.donor;
    }
    
    public void setDonor(String donor) {
        this.donor = donor;
    }
    
    @Column(name="time")
    public Integer getTime() {
        return this.time;
    }
    
    public void setTime(Integer time) {
        this.time = time;
    }
    
    @Column(name="transcation_id", length=45)
    public String getTranscationId() {
        return this.transcationId;
    }
    
    public void setTranscationId(String transcationId) {
        this.transcationId = transcationId;
    }
    
    @Column(name="donation_type", length=45)
    public String getDonationType() {
        return this.donationType;
    }
    
    public void setDonationType(String donationType) {
        this.donationType = donationType;
    }




}


