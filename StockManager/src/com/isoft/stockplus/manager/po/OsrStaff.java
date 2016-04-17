package com.isoft.stockplus.manager.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * OsrStaff entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "osr_staff", catalog = "isoftoab")
public class OsrStaff implements java.io.Serializable {

	// Fields

	private String staffId;
	private String sigId;
	private String staffNumber;
	private String staffName;
	private String staffGender;
	private String staffPhone;
	private String staffEmail;
	private String staffQq;
	private String staffPhoto;
	private String staffBirthday;
	private Boolean staffStatus;
	private String staffSkills;
	private String staffHobbies;

	// Constructors

	/** default constructor */
	public OsrStaff() {
	}

	/** full constructor */
	public OsrStaff(String sigId, String staffNumber, String staffName,
			String staffGender, String staffPhone, String staffEmail,
			String staffQq, String staffPhoto, String staffBirthday,
			Boolean staffStatus, String staffSkills, String staffHobbies) {
		this.sigId = sigId;
		this.staffNumber = staffNumber;
		this.staffName = staffName;
		this.staffGender = staffGender;
		this.staffPhone = staffPhone;
		this.staffEmail = staffEmail;
		this.staffQq = staffQq;
		this.staffPhoto = staffPhoto;
		this.staffBirthday = staffBirthday;
		this.staffStatus = staffStatus;
		this.staffSkills = staffSkills;
		this.staffHobbies = staffHobbies;
	}

	// Property accessors
	@Id
	@GenericGenerator(name="generator", strategy="uuid")
	@GeneratedValue(generator="generator")
	@Column(name = "staff_id", unique = true, nullable = false, length = 32)
	public String getStaffId() {
		return this.staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	@Column(name = "sig_id", length = 32)
	public String getSigId() {
		return this.sigId;
	}

	public void setSigId(String sigId) {
		this.sigId = sigId;
	}

	@Column(name = "staff_number", length = 32)
	public String getStaffNumber() {
		return this.staffNumber;
	}

	public void setStaffNumber(String staffNumber) {
		this.staffNumber = staffNumber;
	}

	@Column(name = "staff_name", length = 64)
	public String getStaffName() {
		return this.staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	@Column(name = "staff_gender", length = 32)
	public String getStaffGender() {
		return this.staffGender;
	}

	public void setStaffGender(String staffGender) {
		this.staffGender = staffGender;
	}

	@Column(name = "staff_phone", length = 32)
	public String getStaffPhone() {
		return this.staffPhone;
	}

	public void setStaffPhone(String staffPhone) {
		this.staffPhone = staffPhone;
	}

	@Column(name = "staff_email", length = 64)
	public String getStaffEmail() {
		return this.staffEmail;
	}

	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}

	@Column(name = "staff_qq", length = 32)
	public String getStaffQq() {
		return this.staffQq;
	}

	public void setStaffQq(String staffQq) {
		this.staffQq = staffQq;
	}

	@Column(name = "staff_photo", length = 256)
	public String getStaffPhoto() {
		return this.staffPhoto;
	}

	public void setStaffPhoto(String staffPhoto) {
		this.staffPhoto = staffPhoto;
	}

	@Column(name = "staff_birthday", length = 32)
	public String getStaffBirthday() {
		return this.staffBirthday;
	}

	public void setStaffBirthday(String staffBirthday) {
		this.staffBirthday = staffBirthday;
	}

	@Column(name = "staff_status")
	public Boolean getStaffStatus() {
		return this.staffStatus;
	}

	public void setStaffStatus(Boolean staffStatus) {
		this.staffStatus = staffStatus;
	}

	@Column(name = "staff_skills", length = 256)
	public String getStaffSkills() {
		return this.staffSkills;
	}

	public void setStaffSkills(String staffSkills) {
		this.staffSkills = staffSkills;
	}

	@Column(name = "staff_hobbies", length = 256)
	public String getStaffHobbies() {
		return this.staffHobbies;
	}

	public void setStaffHobbies(String staffHobbies) {
		this.staffHobbies = staffHobbies;
	}

}