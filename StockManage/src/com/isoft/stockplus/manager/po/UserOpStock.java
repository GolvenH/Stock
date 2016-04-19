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
 * UserOpStock entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "user_op_stock", catalog = "stockplus")
public class UserOpStock implements java.io.Serializable
{

	// Fields

	private Integer userOpStockId;
	private User user;
	private StockInfo stockInfo;
	private Date userOpStockTime;

	// Constructors

	/** default constructor */
	public UserOpStock()
	{
	}

	/** full constructor */
	public UserOpStock(User user, StockInfo stockInfo, Date userOpStockTime)
	{
		this.user = user;
		this.stockInfo = stockInfo;
		this.userOpStockTime = userOpStockTime;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "user_op_stock_id", unique = true, nullable = false)
	public Integer getUserOpStockId()
	{
		return this.userOpStockId;
	}

	public void setUserOpStockId(Integer userOpStockId)
	{
		this.userOpStockId = userOpStockId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public User getUser()
	{
		return this.user;
	}

	public void setUser(User user)
	{
		this.user = user;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "stockinfo_id")
	public StockInfo getStockInfo()
	{
		return this.stockInfo;
	}

	public void setStockInfo(StockInfo stockInfo)
	{
		this.stockInfo = stockInfo;
	}

	@Column(name = "user_op_stock_time", length = 19)
	public Date getUserOpStockTime()
	{
		return this.userOpStockTime;
	}

	public void setUserOpStockTime(Date userOpStockTime)
	{
		this.userOpStockTime = userOpStockTime;
	}

}