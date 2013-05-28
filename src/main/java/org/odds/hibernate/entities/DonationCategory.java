package org.odds.hibernate.entities;
// Generated May 28, 2013 4:00:36 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * DonationCategory generated by hbm2java
 */
public class DonationCategory  implements java.io.Serializable {


     private Integer id;
     private String name;
     private Set donationItems = new HashSet(0);
     private Set donationMoneies = new HashSet(0);

    public DonationCategory() {
    }

    public DonationCategory(String name, Set donationItems, Set donationMoneies) {
       this.name = name;
       this.donationItems = donationItems;
       this.donationMoneies = donationMoneies;
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
    public Set getDonationItems() {
        return this.donationItems;
    }
    
    public void setDonationItems(Set donationItems) {
        this.donationItems = donationItems;
    }
    public Set getDonationMoneies() {
        return this.donationMoneies;
    }
    
    public void setDonationMoneies(Set donationMoneies) {
        this.donationMoneies = donationMoneies;
    }




}


