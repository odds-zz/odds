package org.odds.hibernate.entities;
// Generated Apr 24, 2013 2:19:10 PM by Hibernate Tools 3.2.1.GA



/**
 * OrphanageContact generated by hbm2java
 */
public class OrphanageContact  implements java.io.Serializable {


     private Integer id;
     private Orphanage orphanage;
     private String phone;
     private String altPhone;
     private String email;
     private String altEmail;
     private String fax;

    public OrphanageContact() {
    }

	
    public OrphanageContact(Orphanage orphanage) {
        this.orphanage = orphanage;
    }
    public OrphanageContact(Orphanage orphanage, String phone, String altPhone, String email, String altEmail, String fax) {
       this.orphanage = orphanage;
       this.phone = phone;
       this.altPhone = altPhone;
       this.email = email;
       this.altEmail = altEmail;
       this.fax = fax;
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
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAltPhone() {
        return this.altPhone;
    }
    
    public void setAltPhone(String altPhone) {
        this.altPhone = altPhone;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAltEmail() {
        return this.altEmail;
    }
    
    public void setAltEmail(String altEmail) {
        this.altEmail = altEmail;
    }
    public String getFax() {
        return this.fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }




}


