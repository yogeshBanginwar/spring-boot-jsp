package com.resource.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users", catalog = "resorce_mng")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String user_name;
	private String user_email; 
	private String user_password;
	@OneToOne(cascade=CascadeType.ALL )
	@JoinColumn(name="User_role_id", referencedColumnName="User_role_id")
	private User_role user_role;

	public User() {
	}

	 

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}



	public User_role getUser_role() {
		return user_role;
	}



	public void setUser_role(User_role user_role) {
		this.user_role = user_role;
	}

	

}
