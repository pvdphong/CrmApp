package com.java.dto;

public class UserDto {
	private int id; 
	private String email;
	private String password; 
	private String fullname; 
	private String phone; 	
	private String address; 
	private String avatar; 
	private String roleName;
	
	public UserDto(int id, String email, String password, String fullname, String phone, String address, String avatar,
			String roleName) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.fullname = fullname;
		this.phone = phone;
		this.address = address;
		this.avatar = avatar;
		this.roleName = roleName;
	}
	
	public UserDto() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
	
}