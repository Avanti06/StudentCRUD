package com.student.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	  @Id
	  private int sid;
	  private String name;
	  private String branch;
	  private String address;
	  
	public Student() {
		super();
	}
	public Student(int sid, String name, String branch, String address) {
		super();
		this.sid = sid;
		this.name = name;
		this.branch = branch;
		this.address = address;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	  
	  

}
