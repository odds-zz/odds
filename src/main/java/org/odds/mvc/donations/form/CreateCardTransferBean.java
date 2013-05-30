package org.odds.mvc.donations.form;

/**
 *
 * @author kenkataiwa
 */
public class CreateCardTransferBean {

    private Integer id;
    private String donor;
    private String email;
    private String amount;
    private String service;
    private String account;
    private String message;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDonor() {
        return this.donor;
    }

    public void setDonor(String donor) {
        this.donor = donor;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAccount() {
        return this.account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getService() {
        return this.service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
