package org.odds.mvc.auth;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

public class SigninFormBean {

//	@MaskFormat("(###) ###-####")
	@NotEmpty
	private String email;

	@NotEmpty
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

    public String getPassword() {
		return password;
	}

	public void getPassword(String password) {
		this.password = password;
	}

	public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("properties name=");
        if (email != null) {
        	sb.append("'").append(email).append("', ");
        } else {
        	sb.append(email).append(", ");
        }

        return sb.toString();
    }
}
