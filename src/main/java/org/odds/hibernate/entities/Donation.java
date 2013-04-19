package org.odds.hibernate.entities;
// Generated Apr 19, 2013 6:28:17 PM by Hibernate Tools 3.2.1.GA



/**
 * Donation generated by hbm2java
 */
public class Donation  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String details;
     private String status;
     private String donor;

    public Donation() {
    }

    public Donation(String name, String details, String status, String donor) {
       this.name = name;
       this.details = details;
       this.status = status;
       this.donor = donor;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDetails() {
        return this.details;
    }
    
    public void setDetails(String details) {
        this.details = details;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public String getDonor() {
        return this.donor;
    }
    
    public void setDonor(String donor) {
        this.donor = donor;
    }




}

