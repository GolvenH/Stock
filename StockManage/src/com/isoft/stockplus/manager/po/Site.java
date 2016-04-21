package com.isoft.stockplus.manager.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Site entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "site", catalog = "stockplus")
public class Site implements java.io.Serializable
{

	// Fields

	private Integer siteId;
	private String about;
	private String siteTitle;
	private String siteContent;

	// Constructors

	/** default constructor */
	public Site()
	{
	}

	/** full constructor */
	public Site(String about, String siteTitle, String siteContent)
	{
		this.about = about;
		this.siteTitle = siteTitle;
		this.siteContent = siteContent;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "site_id", unique = true, nullable = false)
	public Integer getSiteId()
	{
		return this.siteId;
	}

	public void setSiteId(Integer siteId)
	{
		this.siteId = siteId;
	}

	@Column(name = "about")
	public String getAbout()
	{
		return this.about;
	}

	public void setAbout(String about)
	{
		this.about = about;
	}

	@Column(name = "site_title")
	public String getSiteTitle()
	{
		return this.siteTitle;
	}

	public void setSiteTitle(String siteTitle)
	{
		this.siteTitle = siteTitle;
	}

	@Column(name = "site_content")
	public String getSiteContent()
	{
		return this.siteContent;
	}

	public void setSiteContent(String siteContent)
	{
		this.siteContent = siteContent;
	}

}