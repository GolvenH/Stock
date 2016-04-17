package com.isoft.stockplus.manager.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * SysSignin entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sys_signin")
public class SysSignin implements java.io.Serializable {

	// Fields

	private String signinId;
	private String signinAccount;
	private String signinPassword;
	private String signinEmail;
	private String signinStatus;

	// Constructors

	/** default constructor */
	public SysSignin() {
	}

	/** full constructor */
	public SysSignin(String signinAccount, String signinPassword,
			String signinEmail, String signinStatus) {
		this.signinAccount = signinAccount;
		this.signinPassword = signinPassword;
		this.signinEmail = signinEmail;
		this.signinStatus = signinStatus;
	}

	// Property accessors
	@Id
	@GenericGenerator(name="generator", strategy="uuid")
	@GeneratedValue(generator="generator")
	@Column(name = "signin_id", unique = true, nullable = false, length = 32)
	public String getSigninId() {
		return this.signinId;
	}

	public void setSigninId(String signinId) {
		this.signinId = signinId;
	}

	@Column(name = "signin_account", length = 64)
	public String getSigninAccount() {
		return this.signinAccount;
	}

	public void setSigninAccount(String signinAccount) {
		this.signinAccount = signinAccount;
	}

	@Column(name = "signin_password", length = 64)
	public String getSigninPassword() {
		return this.signinPassword;
	}

	public void setSigninPassword(String signinPassword) {
		this.signinPassword = signinPassword;
	}

	@Column(name = "signin_email")
	public String getSigninEmail() {
		return this.signinEmail;
	}

	public void setSigninEmail(String signinEmail) {
		this.signinEmail = signinEmail;
	}

	@Column(name = "signin_status", length = 32)
	public String getSigninStatus() {
		return this.signinStatus;
	}

	public void setSigninStatus(String signinStatus) {
		this.signinStatus = signinStatus;
	}

}