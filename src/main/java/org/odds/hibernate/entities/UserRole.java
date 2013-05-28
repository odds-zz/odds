package org.odds.hibernate.entities;
// Generated May 28, 2013 4:00:36 PM by Hibernate Tools 3.2.1.GA



/**
 * UserRole generated by hbm2java
 */
public class UserRole  implements java.io.Serializable {


     private Integer id;
     private User user;
     private String authority;

    public UserRole() {
    }

    public UserRole(User user, String authority) {
       this.user = user;
       this.authority = authority;
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
    public String getAuthority() {
        return this.authority;
    }
    
    public void setAuthority(String authority) {
        this.authority = authority;
    }




}


