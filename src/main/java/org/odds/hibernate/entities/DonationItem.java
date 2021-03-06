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
 * DonationItem generated by hbm2java
 */
@Entity
@Table(name="donation_item"
    ,catalog="odds_db"
)
public class DonationItem  implements java.io.Serializable {


     private Integer id;
     private User user;
     private Orphanage orphanage;
     private DonationCategory donationCategory;
     private String name;
     private Integer quantity;
     private Long size;
     private String metric;
     private String details;
     private String status;
     private String donor;
     private Date time;

    public DonationItem() {
    }

    public DonationItem(User user, Orphanage orphanage, DonationCategory donationCategory, String name, Integer quantity, Long size, String metric, String details, String status, String donor, Date time) {
       this.user = user;
       this.orphanage = orphanage;
       this.donationCategory = donationCategory;
       this.name = name;
       this.quantity = quantity;
       this.size = size;
       this.metric = metric;
       this.details = details;
       this.status = status;
       this.donor = donor;
       this.time = time;
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
    @JoinColumn(name="user_id")
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="orphanage_id")
    public Orphanage getOrphanage() {
        return this.orphanage;
    }
    
    public void setOrphanage(Orphanage orphanage) {
        this.orphanage = orphanage;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="category_id")
    public DonationCategory getDonationCategory() {
        return this.donationCategory;
    }
    
    public void setDonationCategory(DonationCategory donationCategory) {
        this.donationCategory = donationCategory;
    }
    
    @Column(name="name", length=45)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="quantity")
    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    @Column(name="size", precision=10, scale=0)
    public Long getSize() {
        return this.size;
    }
    
    public void setSize(Long size) {
        this.size = size;
    }
    
    @Column(name="metric", length=45)
    public String getMetric() {
        return this.metric;
    }
    
    public void setMetric(String metric) {
        this.metric = metric;
    }
    
    @Column(name="details", length=45)
    public String getDetails() {
        return this.details;
    }
    
    public void setDetails(String details) {
        this.details = details;
    }
    
    @Column(name="status", length=45)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    @Column(name="donor", length=45)
    public String getDonor() {
        return this.donor;
    }
    
    public void setDonor(String donor) {
        this.donor = donor;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="time", length=19)
    public Date getTime() {
        return this.time;
    }
    
    public void setTime(Date time) {
        this.time = time;
    }




}


