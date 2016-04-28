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

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Bbs entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "bbs", catalog = "stockplus")
public class Bbs implements java.io.Serializable
{

	// Fields

	private Integer bbsId;
	private Integer userId;
	private Integer stockinfoId;

	private String userName;
	private String stockinfoName;
	private String stockinfoSymbol;
	private String bbsContent;
	@JsonFormat(pattern="yyyy:mm:dd hh:mm:ss")
	private Date bbsTime;

	// Constructors

	/** default constructor */
	public Bbs()
	{
	}

	/** full constructor */
	public Bbs( String userName,
			String stockinfoName, String stockinfoSymbol, String bbsContent,
			Date bbsTime)
			{
		this.userName = userName;
		this.stockinfoName = stockinfoName;
		this.stockinfoSymbol = stockinfoSymbol;
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

	@Column(name = "user_name")
	public String getUserName()
	{
		return this.userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
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

	@Column(name = "stockinfo_symbol")
	public String getStockinfoSymbol()
	{
		return this.stockinfoSymbol;
	}

	public void setStockinfoSymbol(String stockinfoSymbol)
	{
		this.stockinfoSymbol = stockinfoSymbol;
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
	@Column(name = "user_id")
	public Integer getUserId()
	{
		return userId;
	}

	public void setUserId(Integer userId)
	{
		this.userId = userId;
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
}