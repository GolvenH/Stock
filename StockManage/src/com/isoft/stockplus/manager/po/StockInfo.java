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
 * StockInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "stock_info", catalog = "stockplus")
public class StockInfo implements java.io.Serializable
{

	// Fields

	private Integer stockinfoId;
	private String stockinfoNum;
	private String stockinfoName;
	private String stockinfoCurrent;
	private Date stockinfoTime;
	private double stockinfoPrice;
	private Set<UserOpStock> userOpStocks = new HashSet<UserOpStock>(0);
	private Set<StockTransaction> stockTransactions = new HashSet<StockTransaction>(
			0);
	private Set<Bbs> bbses = new HashSet<Bbs>(0);
	private Set<UserInfo> userInfosForStockPrice = new HashSet<UserInfo>(0);
	private Set<UserInfo> userInfosForStockName = new HashSet<UserInfo>(0);

	// Constructors

	/** default constructor */
	public StockInfo()
	{
	}

	/** full constructor */
	public StockInfo(String stockinfoNum, String stockinfoName,
			String stockinfoCurrent, Date stockinfoTime, double stockinfoPrice,
			Set<UserOpStock> userOpStocks,
			Set<StockTransaction> stockTransactions, Set<StockData> stockDatas,
			Set<Bbs> bbses, Set<UserInfo> userInfosForStockPrice,
			Set<UserInfo> userInfosForStockName)
	{
		this.stockinfoNum = stockinfoNum;
		this.stockinfoName = stockinfoName;
		this.stockinfoCurrent = stockinfoCurrent;
		this.stockinfoTime = stockinfoTime;
		this.stockinfoPrice = stockinfoPrice;
		this.userOpStocks = userOpStocks;
		this.stockTransactions = stockTransactions;
		this.bbses = bbses;
		this.userInfosForStockPrice = userInfosForStockPrice;
		this.userInfosForStockName = userInfosForStockName;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "stockinfo_id", unique = true, nullable = false)
	public Integer getStockinfoId()
	{
		return this.stockinfoId;
	}

	public void setStockinfoId(Integer stockinfoId)
	{
		this.stockinfoId = stockinfoId;
	}

	@Column(name = "stockinfo_num")
	public String getStockinfoNum()
	{
		return this.stockinfoNum;
	}

	public void setStockinfoNum(String stockinfoNum)
	{
		this.stockinfoNum = stockinfoNum;
	}

	@Column(name = "stockinfo_name")
	public String getStockinfoName()
	{
		return this.stockinfoName;
	}

	public void setStockinfoName(String stockinfoName)
	{
		this.stockinfoName = stockinfoName;
	}

	@Column(name = "stockinfo_current")
	public String getStockinfoCurrent()
	{
		return this.stockinfoCurrent;
	}

	public void setStockinfoCurrent(String stockinfoCurrent)
	{
		this.stockinfoCurrent = stockinfoCurrent;
	}

	@Column(name = "stockinfo_time", length = 19)
	public Date getStockinfoTime()
	{
		return this.stockinfoTime;
	}

	public void setStockinfoTime(Date stockinfoTime)
	{
		this.stockinfoTime = stockinfoTime;
	}

	@Column(name = "stockinfo_price", precision = 22, scale = 0)
	public double getStockinfoPrice()
	{
		return this.stockinfoPrice;
	}

	public void setStockinfoPrice(double stockinfoPrice)
	{
		this.stockinfoPrice = stockinfoPrice;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "stockInfo")
	public Set<UserOpStock> getUserOpStocks()
	{
		return this.userOpStocks;
	}

	public void setUserOpStocks(Set<UserOpStock> userOpStocks)
	{
		this.userOpStocks = userOpStocks;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "stockInfo")
	public Set<StockTransaction> getStockTransactions()
	{
		return this.stockTransactions;
	}

	public void setStockTransactions(Set<StockTransaction> stockTransactions)
	{
		this.stockTransactions = stockTransactions;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "stockInfo")
	public Set<Bbs> getBbses()
	{
		return this.bbses;
	}

	public void setBbses(Set<Bbs> bbses)
	{
		this.bbses = bbses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "stockInfoByStockPrice")
	public Set<UserInfo> getUserInfosForStockPrice()
	{
		return this.userInfosForStockPrice;
	}

	public void setUserInfosForStockPrice(Set<UserInfo> userInfosForStockPrice)
	{
		this.userInfosForStockPrice = userInfosForStockPrice;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "stockInfoByStockName")
	public Set<UserInfo> getUserInfosForStockName()
	{
		return this.userInfosForStockName;
	}

	public void setUserInfosForStockName(Set<UserInfo> userInfosForStockName)
	{
		this.userInfosForStockName = userInfosForStockName;
	}

}