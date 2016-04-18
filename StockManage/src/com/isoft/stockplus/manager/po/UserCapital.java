package com.isoft.stockplus.manager.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * UserCapital entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "user_capital", catalog = "stockplus")
public class UserCapital implements java.io.Serializable
{

	// Fields

	private Integer userCapitalId;
	private double userCapitalTotal;
	private double userCapital;

	// Constructors

	/** default constructor */
	public UserCapital()
	{
	}

	/** full constructor */
	public UserCapital(double userCapitalTotal, double userCapital)
	{
		this.userCapitalTotal = userCapitalTotal;
		this.userCapital = userCapital;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "user_capital_id", unique = true, nullable = false)
	public Integer getUserCapitalId()
	{
		return this.userCapitalId;
	}

	public void setUserCapitalId(Integer userCapitalId)
	{
		this.userCapitalId = userCapitalId;
	}

	@Column(name = "user_capital_total", precision = 255, scale = 0)
	public double getUserCapitalTotal()
	{
		return this.userCapitalTotal;
	}

	public void setUserCapitalTotal(double userCapitalTotal)
	{
		this.userCapitalTotal = userCapitalTotal;
	}

	@Column(name = "user_capital", precision = 255, scale = 0)
	public double getUserCapital()
	{
		return this.userCapital;
	}

	public void setUserCapital(double userCapital)
	{
		this.userCapital = userCapital;
	}

}