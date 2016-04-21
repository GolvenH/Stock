package com.isoft.stockplus.manager.po;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * UserStock entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "user_stock", catalog = "stockplus")
public class UserStock implements java.io.Serializable
{

	// Fields

	private Integer userstockId;
	private Date userstockTime;

	// Constructors

	/** default constructor */
	public UserStock()
	{
	}

	/** full constructor */
	public UserStock(Date userstockTime)
	{		this.userstockTime = userstockTime;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "userstock_id", unique = true, nullable = false)
	public Integer getUserstockId()
	{
		return this.userstockId;
	}

	public void setUserstockId(Integer userstockId)
	{
		this.userstockId = userstockId;
	}


	@Column(name = "userstock_time", length = 19)
	public Date getUserstockTime()
	{
		return this.userstockTime;
	}

	public void setUserstockTime(Date userstockTime)
	{
		this.userstockTime = userstockTime;
	}

}