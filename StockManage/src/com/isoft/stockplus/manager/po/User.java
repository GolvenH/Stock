package com.isoft.stockplus.manager.po;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * User entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "user", catalog = "stockplus")
public class User implements java.io.Serializable
{

	// Fields

	private Integer userId;
	private String userName;
	private String userPassword;
	private String userTel;
	private String userHobby;
	private String userSex;
	private short userAccount;
	private String recordDate;
	private String userEmail;
	
	// Constructors

	/** default constructor */
	public User()
	{
	}

	/** minimal constructor */
	public User(String userName, String userPassword, String userTel,
			String userHobby, String userSex, short userAccount,
			String recordDate, String userEmail)
	{
		this.userName = userName;
		this.userPassword = userPassword;
		this.userTel = userTel;
		this.userHobby = userHobby;
		this.userSex = userSex;
		this.userAccount = userAccount;
		this.recordDate = recordDate;
		this.userEmail = userEmail;
	}



	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "user_id", unique = true, nullable = false)
	public Integer getUserId()
	{
		return this.userId;
	}

	public void setUserId(Integer userId)
	{
		this.userId = userId;
	}

	@Column(name = "user_name", nullable = false)
	public String getUserName()
	{
		return this.userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	@Column(name = "user_password", nullable = false)
	public String getUserPassword()
	{
		return this.userPassword;
	}

	public void setUserPassword(String userPassword)
	{
		this.userPassword = userPassword;
	}

	@Column(name = "user_tel", nullable = false)
	public String getUserTel()
	{
		return this.userTel;
	}

	public void setUserTel(String userTel)
	{
		this.userTel = userTel;
	}

	@Column(name = "user_hobby", nullable = false)
	public String getUserHobby()
	{
		return this.userHobby;
	}

	public void setUserHobby(String userHobby)
	{
		this.userHobby = userHobby;
	}

	@Column(name = "user_sex", nullable = false)
	public String getUserSex()
	{
		return this.userSex;
	}

	public void setUserSex(String userSex)
	{
		this.userSex = userSex;
	}

	@Column(name = "user_account", nullable = false)
	public short getUserAccount()
	{
		return this.userAccount;
	}

	public void setUserAccount(short userAccount)
	{
		this.userAccount = userAccount;
	}

	@Column(name = "record_date", nullable = false, length = 20)
	public String getRecordDate()
	{
		return this.recordDate;
	}

	public void setRecordDate(String recordDate)
	{
		this.recordDate = recordDate;
	}

	@Column(name = "user_email", nullable = false)
	public String getUserEmail()
	{
		return this.userEmail;
	}

	public void setUserEmail(String userEmail)
	{
		this.userEmail = userEmail;
	}

}