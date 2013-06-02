package org.odds.hibernate.entities;
// Generated Jun 2, 2013 2:12:54 PM by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Record generated by hbm2java
 */
@Entity
@Table(name="record"
    ,catalog="odds_db"
)
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
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="orphanage_id", nullable=false)
    public Orphanage getOrphanage() {
        return this.orphanage;
    }
    
    public void setOrphanage(Orphanage orphanage) {
        this.orphanage = orphanage;
    }
    
    @Column(name="status")
    public Boolean getStatus() {
        return this.status;
    }
    
    public void setStatus(Boolean status) {
        this.status = status;
    }
    
    @Column(name="details", length=45)
    public String getDetails() {
        return this.details;
    }
    
    public void setDetails(String details) {
        this.details = details;
    }




}


