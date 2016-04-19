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
 * StockTransaction entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "stock_transaction", catalog = "stockplus")
public class StockTransaction implements java.io.Serializable
{

	// Fields

	private Integer stocktransactionId;
	private StockInfo stockInfo;
	private double stocktransactionPrice;
	private Date stocktransactionTime;

	// Constructors

	/** default constructor */
	public StockTransaction()
	{
	}

	/** full constructor */
	public StockTransaction(StockInfo stockInfo, double stocktransactionPrice,
			Date stocktransactionTime)
	{
		this.stockInfo = stockInfo;
		this.stocktransactionPrice = stocktransactionPrice;
		this.stocktransactionTime = stocktransactionTime;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "stocktransaction_id", unique = true, nullable = false)
	public Integer getStocktransactionId()
	{
		return this.stocktransactionId;
	}

	public void setStocktransactionId(Integer stocktransactionId)
	{
		this.stocktransactionId = stocktransactionId;
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

	@Column(name = "stocktransaction_price", precision = 22, scale = 0)
	public double getStocktransactionPrice()
	{
		return this.stocktransactionPrice;
	}

	public void setStocktransactionPrice(double stocktransactionPrice)
	{
		this.stocktransactionPrice = stocktransactionPrice;
	}

	@Column(name = "stocktransaction_time", length = 19)
	public Date getStocktransactionTime()
	{
		return this.stocktransactionTime;
	}

	public void setStocktransactionTime(Date stocktransactionTime)
	{
		this.stocktransactionTime = stocktransactionTime;
	}

}