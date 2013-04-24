package org.odds.hibernate.entities;
// Generated Apr 24, 2013 4:28:18 PM by Hibernate Tools 3.2.1.GA



/**
 * UserRole generated by hbm2java
 */
public class UserRole  implements java.io.Serializable {


     private int userRoleId;
     private User user;
     private String authority;

    public UserRole() {
    }

    public UserRole(int userRoleId, User user, String authority) {
       this.userRoleId = userRoleId;
       this.user = user;
       this.authority = authority;
    }
   
    public int getUserRoleId() {
        return this.userRoleId;
    }
    
    public void setUserRoleId(int userRoleId) {
        this.userRoleId = userRoleId;
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


