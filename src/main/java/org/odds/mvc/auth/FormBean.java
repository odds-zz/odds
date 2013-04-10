package org.odds.mvc.auth;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

import javax.validation.constraints.Min;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.format.annotation.NumberFormat.Style;
import org.odds.mvc.convert.MaskFormat;

public class FormBean {

	@NotEmpty
	private String firstname;

	@NotEmpty
	private String lastname;

	@Min(21)
	private int age;

//	@MaskFormat("(###) ###-####")
	private String email;

	private String password;

	private String confirmPassword;

    public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

    public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

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

    public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("properties name=");
        if (firstname != null) {
        	sb.append("'").append(firstname).append("', ");
        } else {
        	sb.append(firstname).append(", ");
        }

        return sb.toString();
    }
}
