package org.odds.hibernate.entities;
// Generated Apr 19, 2013 6:28:17 PM by Hibernate Tools 3.2.1.GA



/**
 * Location generated by hbm2java
 */
public class Location  implements java.io.Serializable {


     private Integer id;
     private String region;
     private String district;
     private String city;

    public Location() {
    }

    public Location(String region, String district, String city) {
       this.region = region;
       this.district = district;
       this.city = city;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getRegion() {
        return this.region;
    }
    
    public void setRegion(String region) {
        this.region = region;
    }
    public String getDistrict() {
        return this.district;
    }
    
    public void setDistrict(String district) {
        this.district = district;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }




}

