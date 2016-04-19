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
 * StockData entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "stock_data", catalog = "stockplus")
public class StockData implements java.io.Serializable
{

	// Fields

	private Integer stockdataId;

	private Integer stockinfoId;

	private double stockdataToData;
	private double stockdataYesData;
	private double stockdataMax;
	private double stockdataMin;
	private double stockdataCount;
	private double stockdataMoney;
	private Date recordDate;

	// Constructors

	/** default constructor */
	public StockData()
	{
	}

	/** full constructor */
	public StockData(StockInfo stockInfo, double stockdataToData,
			double stockdataYesData, double stockdataMax, double stockdataMin,
			double stockdataCount, double stockdataMoney, Date recordDate)
	{
		this.stockdataToData = stockdataToData;
		this.stockdataYesData = stockdataYesData;
		this.stockdataMax = stockdataMax;
		this.stockdataMin = stockdataMin;
		this.stockdataCount = stockdataCount;
		this.stockdataMoney = stockdataMoney;
		this.recordDate = recordDate;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "stockdata_id", unique = true, nullable = false)
	public Integer getStockdataId()
	{
		return this.stockdataId;
	}

	public void setStockdataId(Integer stockdataId)
	{
		this.stockdataId = stockdataId;
	}

	@Column(name = "stockinfo_id")
	public Integer getStockinfoId()
	{
		return stockinfoId;
	}

	public void setStockinfoId(Integer stockinfoId)
	{
		this.stockinfoId = stockinfoId;
	}

	@Column(name = "stockdata_to_data", precision = 255, scale = 0)
	public double getStockdataToData()
	{
		return this.stockdataToData;
	}

	public void setStockdataToData(double stockdataToData)
	{
		this.stockdataToData = stockdataToData;
	}

	@Column(name = "stockdata_yes_data", precision = 255, scale = 0)
	public double getStockdataYesData()
	{
		return this.stockdataYesData;
	}

	public void setStockdataYesData(double stockdataYesData)
	{
		this.stockdataYesData = stockdataYesData;
	}

	@Column(name = "stockdata_max", precision = 255, scale = 0)
	public double getStockdataMax()
	{
		return this.stockdataMax;
	}

	public void setStockdataMax(double stockdataMax)
	{
		this.stockdataMax = stockdataMax;
	}

	@Column(name = "stockdata_min", precision = 255, scale = 0)
	public double getStockdataMin()
	{
		return this.stockdataMin;
	}

	public void setStockdataMin(double stockdataMin)
	{
		this.stockdataMin = stockdataMin;
	}

	@Column(name = "stockdata_count", precision = 255, scale = 0)
	public double getStockdataCount()
	{
		return this.stockdataCount;
	}

	public void setStockdataCount(double stockdataCount)
	{
		this.stockdataCount = stockdataCount;
	}

	@Column(name = "stockdata_money", precision = 255, scale = 0)
	public double getStockdataMoney()
	{
		return this.stockdataMoney;
	}

	public void setStockdataMoney(double stockdataMoney)
	{
		this.stockdataMoney = stockdataMoney;
	}

	@Column(name = "record_date", length = 19)
	public Date getRecordDate()
	{
		return this.recordDate;
	}

	public void setRecordDate(Date recordDate)
	{
		this.recordDate = recordDate;
	}

}