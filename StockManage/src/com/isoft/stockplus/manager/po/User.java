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
	private Set<UserOpStock> userOpStocks = new HashSet<UserOpStock>(0);
	private Set<UserInfo> userInfos = new HashSet<UserInfo>(0);

	// Constructors

	/** default constructor */
	public User()
	{
	}

	/** full constructor */
	public User(String userName, String userPassword, String userTel,
			String userHobby, String userSex, short userAccount,
			Set<UserOpStock> userOpStocks, Set<UserInfo> userInfos)
	{
		this.userName = userName;
		this.userPassword = userPassword;
		this.userTel = userTel;
		this.userHobby = userHobby;
		this.userSex = userSex;
		this.userAccount = userAccount;
		this.userOpStocks = userOpStocks;
		this.userInfos = userInfos;
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

	@Column(name = "user_name")
	public String getUserName()
	{
		return this.userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	@Column(name = "user_password")
	public String getUserPassword()
	{
		return this.userPassword;
	}

	public void setUserPassword(String userPassword)
	{
		this.userPassword = userPassword;
	}

	@Column(name = "user_tel")
	public String getUserTel()
	{
		return this.userTel;
	}

	public void setUserTel(String userTel)
	{
		this.userTel = userTel;
	}

	@Column(name = "user_hobby")
	public String getUserHobby()
	{
		return this.userHobby;
	}

	public void setUserHobby(String userHobby)
	{
		this.userHobby = userHobby;
	}

	@Column(name = "user_sex")
	public String getUserSex()
	{
		return this.userSex;
	}

	public void setUserSex(String userSex)
	{
		this.userSex = userSex;
	}

	@Column(name = "user_account")
	public short getUserAccount()
	{
		return this.userAccount;
	}

	public void setUserAccount(short userAccount)
	{
		this.userAccount = userAccount;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
	public Set<UserOpStock> getUserOpStocks()
	{
		return this.userOpStocks;
	}

	public void setUserOpStocks(Set<UserOpStock> userOpStocks)
	{
		this.userOpStocks = userOpStocks;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
	public Set<UserInfo> getUserInfos()
	{
		return this.userInfos;
	}

	public void setUserInfos(Set<UserInfo> userInfos)
	{
		this.userInfos = userInfos;
	}

}