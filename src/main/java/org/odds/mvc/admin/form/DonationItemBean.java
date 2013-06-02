package org.odds.mvc.admin.form;

/**
 *
 * @author kenkataiwa
 */
public class DonationItemBean {

    private Integer id;
    private String name;
    private Integer quantity;
    private Long size;
    private String metric;
    private String details;
    private String status;
    private String donor;
    private Integer orphanage;

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

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Long getSize() {
        return this.size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getMetric() {
        return this.metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
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

    public Integer getOrphanage() {
        return orphanage;
    }

    public void setOrphanage(Integer orphanage) {
        this.orphanage = orphanage;
    }
}
