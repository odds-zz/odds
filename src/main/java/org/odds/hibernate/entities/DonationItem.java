package org.odds.hibernate.entities;
// Generated May 29, 2013 6:20:03 PM by Hibernate Tools 3.2.1.GA


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
 * DonationItem generated by hbm2java
 */
@Entity
@Table(name="donation_item"
    ,catalog="odds_db"
)
public class DonationItem  implements java.io.Serializable {


     private Integer id;
     private User user;
     private DonationCategory donationCategory;
     private String name;
     private String details;
     private String status;
     private String donor;

    public DonationItem() {
    }

    public DonationItem(User user, DonationCategory donationCategory, String name, String details, String status, String donor) {
       this.user = user;
       this.donationCategory = donationCategory;
       this.name = name;
       this.details = details;
       this.status = status;
       this.donor = donor;
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
    
    @Column(name="name", length=45)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
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




}


