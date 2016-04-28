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

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Stockinfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "stockinfo", catalog = "stockplus")
public class Stockinfo implements java.io.Serializable
{

	// Fields

	private Integer stockinfoId;
	private String stockinfoSymbol;
	private String stockinfoName;
	private long stockinfoAmount;
	
	@JsonFormat(pattern="YYYY:MM:DD hh:mm:ss")
	private Date stockinfoTicktime;
	private Integer stockinfoStatus;

	// Constructors

	/** default constructor */
	public Stockinfo()
	{
	}

	/** full constructor */
	public Stockinfo(String stockinfoSymbol, String stockinfoName,
			long stockinfoAmount, Date stockinfoTicktime,
			Integer stockinfoStatus)
	{
		this.stockinfoSymbol = stockinfoSymbol;
		this.stockinfoName = stockinfoName;
		this.stockinfoAmount = stockinfoAmount;
		this.stockinfoTicktime = stockinfoTicktime;
		this.stockinfoStatus = stockinfoStatus;
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

	@Column(name = "stockinfo_symbol", length = 64)
	public String getStockinfoSymbol()
	{
		return this.stockinfoSymbol;
	}

	public void setStockinfoSymbol(String stockinfoSymbol)
	{
		this.stockinfoSymbol = stockinfoSymbol;
	}

	@Column(name = "stockinfo_name", length = 64)
	public String getStockinfoName()
	{
		return this.stockinfoName;
	}

	public void setStockinfoName(String stockinfoName)
	{
		this.stockinfoName = stockinfoName;
	}

	@Column(name = "stockinfo_amount")
	public long getStockinfoAmount()
	{
		return this.stockinfoAmount;
	}

	public void setStockinfoAmount(long stockinfoAmount)
	{
		this.stockinfoAmount = stockinfoAmount;
	}

	@Column(name = "stockinfo_ticktime", length = 19)
	public Date getStockinfoTicktime()
	{
		return this.stockinfoTicktime;
	}

	public void setStockinfoTicktime(Date stockinfoTicktime)
	{
		this.stockinfoTicktime = stockinfoTicktime;
	}

	@Column(name = "stockinfo_status")
	public Integer getStockinfoStatus()
	{
		return this.stockinfoStatus;
	}

	public void setStockinfoStatus(Integer stockinfoStatus)
	{
		this.stockinfoStatus = stockinfoStatus;
	}


}