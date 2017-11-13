package com.JPA.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class Users implements Serializable {
	@Id
	@Column(name ="id",unique = true)
	private int id;
	
	@Column(name ="first_name", unique = false)
	private String first_name;
	
	@Column(name = "last_name", unique = false)
	private String last_name;
	
	@Column(name = "status", unique = false)
	private String status;

	@Column(name = "email", unique = false)
	private String email;
	
	public int getId(){
		return id;
	}
	public String getFirst_name(){
		return first_name;
	}
	public String getLast_name(){
		return last_name;
	}
	public String getStatus(){
		return status;
	}
	public String getEmail(){
		return email;
	}
	public void setId(int id){
		this.id = id;
	}
	public void setFirst_name(String first_name){
		this.first_name = first_name;
	}
	public void setLast_name(String last_name){
		this.last_name = last_name;
	}
	public void setStatus(String status){
		this.status = status;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
	@Override
	public String toString(){
		return id+"\t"+first_name+"\t"+last_name+"\t"+status+"\t"+email;
	}
}
