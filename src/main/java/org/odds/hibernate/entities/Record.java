package org.odds.hibernate.entities;
// Generated May 27, 2013 3:49:37 PM by Hibernate Tools 3.2.1.GA



/**
 * Record generated by hbm2java
 */
public class Record  implements java.io.Serializable {


     private Integer id;
     private Orphanage orphanage;
     private Boolean status;
     private String details;

    public Record() {
    }

	
    public Record(Orphanage orphanage) {
        this.orphanage = orphanage;
    }
    public Record(Orphanage orphanage, Boolean status, String details) {
       this.orphanage = orphanage;
       this.status = status;
       this.details = details;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Orphanage getOrphanage() {
        return this.orphanage;
    }
    
    public void setOrphanage(Orphanage orphanage) {
        this.orphanage = orphanage;
    }
    public Boolean getStatus() {
        return this.status;
    }
    
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public String getDetails() {
        return this.details;
    }
    
    public void setDetails(String details) {
        this.details = details;
    }




}


