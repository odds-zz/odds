package org.odds.hibernate.entities;
// Generated May 28, 2013 4:00:36 PM by Hibernate Tools 3.2.1.GA



/**
 * DonationItem generated by hbm2java
 */
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

	
    public DonationItem(User user, DonationCategory donationCategory) {
        this.user = user;
        this.donationCategory = donationCategory;
    }
    public DonationItem(User user, DonationCategory donationCategory, String name, String details, String status, String donor) {
       this.user = user;
       this.donationCategory = donationCategory;
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
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public DonationCategory getDonationCategory() {
        return this.donationCategory;
    }
    
    public void setDonationCategory(DonationCategory donationCategory) {
        this.donationCategory = donationCategory;
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

