package com.vp.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT_JPA")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sid;
	private String firestname;
    private String subject;
	
    public Long getSid() {
		return sid;
	}
	public void setSid(Long sid) {
		this.sid = sid;
	}	
	
	public String getFirstname() {
		return firestname;
	}
	public void setFirstname(String firstname) {
		this.firestname = firstname;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
}