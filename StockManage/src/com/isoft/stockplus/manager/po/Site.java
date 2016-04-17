package com.isoft.stockplus.manager.po;

/**
 * Site entity. @author MyEclipse Persistence Tools
 */

public class Site implements java.io.Serializable {

	// Fields

	private Integer siteId;
	private String siteTitle;
	private String siteContent;

	// Constructors

	/** default constructor */
	public Site() {
	}

	/** full constructor */
	public Site(String siteTitle, String siteContent) {
		this.siteTitle = siteTitle;
		this.siteContent = siteContent;
	}

	// Property accessors

	public Integer getSiteId() {
		return this.siteId;
	}

	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}

	public String getSiteTitle() {
		return this.siteTitle;
	}

	public void setSiteTitle(String siteTitle) {
		this.siteTitle = siteTitle;
	}

	public String getSiteContent() {
		return this.siteContent;
	}

	public void setSiteContent(String siteContent) {
		this.siteContent = siteContent;
	}

}