package com.isoft.stockplus.manager.po;

import java.util.Date;
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
 * StockInformation entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "stock_information", catalog = "stockplus")
public class StockInformation implements java.io.Serializable
{

	// Fields

	private Integer stockId;
	private String stockNum;
	private String stockName;
	private String stockCurrent;
	private Date stockTime;
	private double stockPrice;
	private Set<UserOpStock> userOpStocks = new HashSet<UserOpStock>(0);
	private Set<UserInfo> userInfosForStockPrice = new HashSet<UserInfo>(0);
	private Set<Bbs> bbsesForStockName = new HashSet<Bbs>(0);
	private Set<UserInfo> userInfosForStockName = new HashSet<UserInfo>(0);
	private Set<Bbs> bbsesForStockNum = new HashSet<Bbs>(0);

	// Constructors

	/** default constructor */
	public StockInformation()
	{
	}

	/** full constructor */
	public StockInformation(String stockNum, String stockName,
			String stockCurrent, Date stockTime, double stockPrice,
			Set<UserOpStock> userOpStocks,
			Set<UserInfo> userInfosForStockPrice, Set<Bbs> bbsesForStockName,
			Set<UserInfo> userInfosForStockName, Set<Bbs> bbsesForStockNum)
	{
		this.stockNum = stockNum;
		this.stockName = stockName;
		this.stockCurrent = stockCurrent;
		this.stockTime = stockTime;
		this.stockPrice = stockPrice;
		this.userOpStocks = userOpStocks;
		this.userInfosForStockPrice = userInfosForStockPrice;
		this.bbsesForStockName = bbsesForStockName;
		this.userInfosForStockName = userInfosForStockName;
		this.bbsesForStockNum = bbsesForStockNum;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "stock_id", unique = true, nullable = false)
	public Integer getStockId()
	{
		return this.stockId;
	}

	public void setStockId(Integer stockId)
	{
		this.stockId = stockId;
	}

	@Column(name = "stock_num")
	public String getStockNum()
	{
		return this.stockNum;
	}

	public void setStockNum(String stockNum)
	{
		this.stockNum = stockNum;
	}

	@Column(name = "stock_name")
	public String getStockName()
	{
		return this.stockName;
	}

	public void setStockName(String stockName)
	{
		this.stockName = stockName;
	}

	@Column(name = "stock_current")
	public String getStockCurrent()
	{
		return this.stockCurrent;
	}

	public void setStockCurrent(String stockCurrent)
	{
		this.stockCurrent = stockCurrent;
	}

	@Column(name = "stock_time", length = 19)
	public Date getStockTime()
	{
		return this.stockTime;
	}

	public void setStockTime(Date stockTime)
	{
		this.stockTime = stockTime;
	}

	@Column(name = "stock_price", precision = 22, scale = 0)
	public double getStockPrice()
	{
		return this.stockPrice;
	}

	public void setStockPrice(double stockPrice)
	{
		this.stockPrice = stockPrice;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "stockInformation")
	public Set<UserOpStock> getUserOpStocks()
	{
		return this.userOpStocks;
	}

	public void setUserOpStocks(Set<UserOpStock> userOpStocks)
	{
		this.userOpStocks = userOpStocks;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "stockInformationByStockPrice")
	public Set<UserInfo> getUserInfosForStockPrice()
	{
		return this.userInfosForStockPrice;
	}

	public void setUserInfosForStockPrice(Set<UserInfo> userInfosForStockPrice)
	{
		this.userInfosForStockPrice = userInfosForStockPrice;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "stockInformationByStockName")
	public Set<Bbs> getBbsesForStockName()
	{
		return this.bbsesForStockName;
	}

	public void setBbsesForStockName(Set<Bbs> bbsesForStockName)
	{
		this.bbsesForStockName = bbsesForStockName;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "stockInformationByStockName")
	public Set<UserInfo> getUserInfosForStockName()
	{
		return this.userInfosForStockName;
	}

	public void setUserInfosForStockName(Set<UserInfo> userInfosForStockName)
	{
		this.userInfosForStockName = userInfosForStockName;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "stockInformationByStockNum")
	public Set<Bbs> getBbsesForStockNum()
	{
		return this.bbsesForStockNum;
	}

	public void setBbsesForStockNum(Set<Bbs> bbsesForStockNum)
	{
		this.bbsesForStockNum = bbsesForStockNum;
	}

}