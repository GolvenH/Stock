package com.isoft.stockplus.manager.po;

/**
 * UserCapital entity. @author MyEclipse Persistence Tools
 */

public class UserCapital implements java.io.Serializable {

	// Fields

	private Integer userCapitalId;
	private Double userCapitalTotal;
	private Double userCapital;

	// Constructors

	/** default constructor */
	public UserCapital() {
	}

	/** full constructor */
	public UserCapital(Double userCapitalTotal, Double userCapital) {
		this.userCapitalTotal = userCapitalTotal;
		this.userCapital = userCapital;
	}

	// Property accessors

	public Integer getUserCapitalId() {
		return this.userCapitalId;
	}

	public void setUserCapitalId(Integer userCapitalId) {
		this.userCapitalId = userCapitalId;
	}

	public Double getUserCapitalTotal() {
		return this.userCapitalTotal;
	}

	public void setUserCapitalTotal(Double userCapitalTotal) {
		this.userCapitalTotal = userCapitalTotal;
	}

	public Double getUserCapital() {
		return this.userCapital;
	}

	public void setUserCapital(Double userCapital) {
		this.userCapital = userCapital;
	}

}