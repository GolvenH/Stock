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
	// Constructors

	/** default constructor */
	public StockInfo()
	{
	}

	/** full constructor */
	public StockInfo(String stockinfoNum, String stockinfoName,
			String stockinfoCurrent, Date stockinfoTime, double stockinfoPrice)
	{
		this.stockinfoNum = stockinfoNum;
		this.stockinfoName = stockinfoName;
		this.stockinfoCurrent = stockinfoCurrent;
		this.stockinfoTime = stockinfoTime;
		this.stockinfoPrice = stockinfoPrice;
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


}