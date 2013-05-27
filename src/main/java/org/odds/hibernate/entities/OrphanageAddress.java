package org.odds.hibernate.entities;
// Generated May 27, 2013 3:49:37 PM by Hibernate Tools 3.2.1.GA



/**
 * OrphanageAddress generated by hbm2java
 */
public class OrphanageAddress  implements java.io.Serializable {


     private Integer id;
     private Orphanage orphanage;
     private String settlement;
     private String district;
     private String region;

    public OrphanageAddress() {
    }

	
    public OrphanageAddress(Orphanage orphanage) {
        this.orphanage = orphanage;
    }
    public OrphanageAddress(Orphanage orphanage, String settlement, String district, String region) {
       this.orphanage = orphanage;
       this.settlement = settlement;
       this.district = district;
       this.region = region;
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
    public String getSettlement() {
        return this.settlement;
    }
    
    public void setSettlement(String settlement) {
        this.settlement = settlement;
    }
    public String getDistrict() {
        return this.district;
    }
    
    public void setDistrict(String district) {
        this.district = district;
    }
    public String getRegion() {
        return this.region;
    }
    
    public void setRegion(String region) {
        this.region = region;
    }




}

