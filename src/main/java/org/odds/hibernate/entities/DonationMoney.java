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
 * DonationMoney generated by hbm2java
 */
@Entity
@Table(name="donation_money"
    ,catalog="odds_db"
)
public class DonationMoney  implements java.io.Serializable {


     private Integer id;
     private User user;
     private DonationCategory donationCategory;
     private String amount;
     private String status;
     private String donor;
     private String donorEmail;
     private String message;
     private Date time;
     private Integer orphanageId;

    public DonationMoney() {
    }

    public DonationMoney(User user, DonationCategory donationCategory, String amount, String status, String donor, String donorEmail, String message, Date time, Integer orphanageId) {
       this.user = user;
       this.donationCategory = donationCategory;
       this.amount = amount;
       this.status = status;
       this.donor = donor;
       this.donorEmail = donorEmail;
       this.message = message;
       this.time = time;
       this.orphanageId = orphanageId;
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
    @JoinColumn(name="category_id")
    public DonationCategory getDonationCategory() {
        return this.donationCategory;
    }
    
    public void setDonationCategory(DonationCategory donationCategory) {
        this.donationCategory = donationCategory;
    }
    
    @Column(name="amount", length=128)
    public String getAmount() {
        return this.amount;
    }
    
    public void setAmount(String amount) {
        this.amount = amount;
    }
    
    @Column(name="status", length=128)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    @Column(name="donor", length=128)
    public String getDonor() {
        return this.donor;
    }
    
    public void setDonor(String donor) {
        this.donor = donor;
    }
    
    @Column(name="donor_email", length=45)
    public String getDonorEmail() {
        return this.donorEmail;
    }
    
    public void setDonorEmail(String donorEmail) {
        this.donorEmail = donorEmail;
    }
    
    @Column(name="message", length=65535)
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="time", length=19)
    public Date getTime() {
        return this.time;
    }
    
    public void setTime(Date time) {
        this.time = time;
    }
    
    @Column(name="orphanage_id")
    public Integer getOrphanageId() {
        return this.orphanageId;
    }
    
    public void setOrphanageId(Integer orphanageId) {
        this.orphanageId = orphanageId;
    }




}


