package com.isoft.stockplus.manager.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Admin entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "admin", catalog = "stockplus")
public class Admin implements java.io.Serializable
{

	// Fields

	private Integer adminId;
	private String adminName;
	private String adminPassword;
	private String adminSex;
	private String adminEmail;
	private String adminTel;

	// Constructors

	/** default constructor */
	public Admin()
	{
	}

	/** full constructor */
	public Admin(String adminName, String adminPassword, String adminSex,
			String adminEmail, String adminTel)
	{
		this.adminName = adminName;
		this.adminPassword = adminPassword;
		this.adminSex = adminSex;
		this.adminEmail = adminEmail;
		this.adminTel = adminTel;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "admin_id", unique = true, nullable = false)
	public Integer getAdminId()
	{
		return this.adminId;
	}

	public void setAdminId(Integer adminId)
	{
		this.adminId = adminId;
	}

	@Column(name = "admin_name")
	public String getAdminName()
	{
		return this.adminName;
	}

	public void setAdminName(String adminName)
	{
		this.adminName = adminName;
	}

	@Column(name = "admin_password")
	public String getAdminPassword()
	{
		return this.adminPassword;
	}

	public void setAdminPassword(String adminPassword)
	{
		this.adminPassword = adminPassword;
	}

	@Column(name = "admin_sex")
	public String getAdminSex()
	{
		return this.adminSex;
	}

	public void setAdminSex(String adminSex)
	{
		this.adminSex = adminSex;
	}

	@Column(name = "admin_email")
	public String getAdminEmail()
	{
		return this.adminEmail;
	}

	public void setAdminEmail(String adminEmail)
	{
		this.adminEmail = adminEmail;
	}

	@Column(name = "admin_tel")
	public String getAdminTel()
	{
		return this.adminTel;
	}

	public void setAdminTel(String adminTel)
	{
		this.adminTel = adminTel;
	}

}