package org.odds.hibernate.entities;
// Generated Apr 24, 2013 3:49:45 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Orphanage generated by hbm2java
 */
public class Orphanage  implements java.io.Serializable {


     private Integer id;
     private String name;
     private Integer administrator;
     private String location;
     private String details;
     private Set records = new HashSet(0);
     private Set orphanageContacts = new HashSet(0);

    public Orphanage() {
    }

    public Orphanage(String name, Integer administrator, String location, String details, Set records, Set orphanageContacts) {
       this.name = name;
       this.administrator = administrator;
       this.location = location;
       this.details = details;
       this.records = records;
       this.orphanageContacts = orphanageContacts;
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
    public Integer getAdministrator() {
        return this.administrator;
    }
    
    public void setAdministrator(Integer administrator) {
        this.administrator = administrator;
    }
    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    public String getDetails() {
        return this.details;
    }
    
    public void setDetails(String details) {
        this.details = details;
    }
    public Set getRecords() {
        return this.records;
    }
    
    public void setRecords(Set records) {
        this.records = records;
    }
    public Set getOrphanageContacts() {
        return this.orphanageContacts;
    }
    
    public void setOrphanageContacts(Set orphanageContacts) {
        this.orphanageContacts = orphanageContacts;
    }




}


