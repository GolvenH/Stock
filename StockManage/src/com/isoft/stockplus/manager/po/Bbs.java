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
	private String bbsContent;
	private Date bbsTime;

	// Constructors

	/** default constructor */
	public Bbs()
	{
	}

	/** full constructor */
	public Bbs( String bbsContent, Date bbsTime)
	{
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