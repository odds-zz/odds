package org.odds.mvc.admin.form;

/**
 *
 * @author kenkataiwa
 */
public class UserPrivilegesBean {

    private Integer id;
    private String name;
    private String[] userRoles;

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

    public String[] getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(String[] userRoles) {
        this.userRoles = userRoles;
    }
}
