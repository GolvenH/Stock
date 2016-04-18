package com.isoft.stockplus.manager.po;

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
 * UserInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "user_info", catalog = "stockplus")
public class UserInfo implements java.io.Serializable
{

	// Fields

	private Integer userInfoId;
	private StockInformation stockInformationByStockName;
	private StockInformation stockInformationByStockPrice;
	private User user;

	// Constructors

	/** default constructor */
	public UserInfo()
	{
	}

	/** full constructor */
	public UserInfo(StockInformation stockInformationByStockName,
			StockInformation stockInformationByStockPrice, User user)
	{
		this.stockInformationByStockName = stockInformationByStockName;
		this.stockInformationByStockPrice = stockInformationByStockPrice;
		this.user = user;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "user_info_id", unique = true, nullable = false)
	public Integer getUserInfoId()
	{
		return this.userInfoId;
	}

	public void setUserInfoId(Integer userInfoId)
	{
		this.userInfoId = userInfoId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "stock_name")
	public StockInformation getStockInformationByStockName()
	{
		return this.stockInformationByStockName;
	}

	public void setStockInformationByStockName(
			StockInformation stockInformationByStockName)
	{
		this.stockInformationByStockName = stockInformationByStockName;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "stock_price")
	public StockInformation getStockInformationByStockPrice()
	{
		return this.stockInformationByStockPrice;
	}

	public void setStockInformationByStockPrice(
			StockInformation stockInformationByStockPrice)
	{
		this.stockInformationByStockPrice = stockInformationByStockPrice;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_name")
	public User getUser()
	{
		return this.user;
	}

	public void setUser(User user)
	{
		this.user = user;
	}

}