package com.vastika.studentinusa.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.vastika.studentinusa.model.Address;

@Entity
@Table(name = "tbl_student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "student_name")
	private String studentName;
	private String email;
	@Column(name = "mobile_no")
	private long  mobileNumber;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal (TemporalType.DATE)
	private Date dob;
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	@Column (name = "verification_type")
	private String verificationType;
	private String documents;
	private String colleges;
	@Column(name = "process_status")
	private String processStatus;
	
	
	
	public String getColleges() {
		return colleges;
	}
	public void setColleges(String colleges) {
		this.colleges = colleges;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getVerificationType() {
		return verificationType;
	}
	public void setVerificationType(String verificationType) {
		this.verificationType = verificationType;
	}
	public String getDocuments() {
		return documents;
	}
	public void setDocuments(String documents) {
		this.documents = documents;
	}
	public String getProcessStatus() {
		return processStatus;
	}
	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}
	
	

}
