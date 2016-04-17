package com.isoft.stockplus.manager.po;

import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String userName;
	private String userPassword;
	private String userTel;
	private String userHobby;
	private String userSex;
	private Short userAccount;
	private Set userOpStocks = new HashSet(0);
	private Set userInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String userName, String userPassword, String userTel,
			String userHobby, String userSex, Short userAccount,
			Set userOpStocks, Set userInfos) {
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

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserTel() {
		return this.userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public String getUserHobby() {
		return this.userHobby;
	}

	public void setUserHobby(String userHobby) {
		this.userHobby = userHobby;
	}

	public String getUserSex() {
		return this.userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public Short getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(Short userAccount) {
		this.userAccount = userAccount;
	}

	public Set getUserOpStocks() {
		return this.userOpStocks;
	}

	public void setUserOpStocks(Set userOpStocks) {
		this.userOpStocks = userOpStocks;
	}

	public Set getUserInfos() {
		return this.userInfos;
	}

	public void setUserInfos(Set userInfos) {
		this.userInfos = userInfos;
	}

}