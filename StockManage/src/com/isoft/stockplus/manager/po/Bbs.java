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
 * Bbs entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "bbs", catalog = "stockplus")
public class Bbs implements java.io.Serializable
{

	// Fields

	private Integer bbsId;
	private StockInformation stockInformationByStockNum;
	private StockInformation stockInformationByStockName;
	private String bbsContent;
	private Date bbsTime;

	// Constructors

	/** default constructor */
	public Bbs()
	{
	}

	/** full constructor */
	public Bbs(StockInformation stockInformationByStockNum,
			StockInformation stockInformationByStockName, String bbsContent,
			Date bbsTime)
	{
		this.stockInformationByStockNum = stockInformationByStockNum;
		this.stockInformationByStockName = stockInformationByStockName;
		this.bbsContent = bbsContent;
		this.bbsTime = bbsTime;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "bbs_id", unique = true, nullable = false)
	public Integer getBbsId()
	{
		return this.bbsId;
	}

	public void setBbsId(Integer bbsId)
	{
		this.bbsId = bbsId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "stock_num")
	public StockInformation getStockInformationByStockNum()
	{
		return this.stockInformationByStockNum;
	}

	public void setStockInformationByStockNum(
			StockInformation stockInformationByStockNum)
	{
		this.stockInformationByStockNum = stockInformationByStockNum;
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

	@Column(name = "bbs_content")
	public String getBbsContent()
	{
		return this.bbsContent;
	}

	public void setBbsContent(String bbsContent)
	{
		this.bbsContent = bbsContent;
	}

	@Column(name = "bbs_time", length = 19)
	public Date getBbsTime()
	{
		return this.bbsTime;
	}

	public void setBbsTime(Date bbsTime)
	{
		this.bbsTime = bbsTime;
	}

}