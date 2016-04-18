package com.isoft.stockplus.manager.po;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Article entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "article", catalog = "stockplus")
public class Article implements java.io.Serializable
{

	// Fields

	private Integer articleId;
	private String articleType;
	private Integer articleSort;
	private String articleKey;
	private String articleAbst;
	private String articleAuth;
	private String articleSou;
	private Date articleStTime;
	private Date articleEnTime;
	private String srticleContent;

	// Constructors

	/** default constructor */
	public Article()
	{
	}

	/** full constructor */
	public Article(String articleType, Integer articleSort, String articleKey,
			String articleAbst, String articleAuth, String articleSou,
			Date articleStTime, Date articleEnTime, String srticleContent)
	{
		this.articleType = articleType;
		this.articleSort = articleSort;
		this.articleKey = articleKey;
		this.articleAbst = articleAbst;
		this.articleAuth = articleAuth;
		this.articleSou = articleSou;
		this.articleStTime = articleStTime;
		this.articleEnTime = articleEnTime;
		this.srticleContent = srticleContent;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "article_id", unique = true, nullable = false)
	public Integer getArticleId()
	{
		return this.articleId;
	}

	public void setArticleId(Integer articleId)
	{
		this.articleId = articleId;
	}

	@Column(name = "article_type")
	public String getArticleType()
	{
		return this.articleType;
	}

	public void setArticleType(String articleType)
	{
		this.articleType = articleType;
	}

	@Column(name = "article_sort")
	public Integer getArticleSort()
	{
		return this.articleSort;
	}

	public void setArticleSort(Integer articleSort)
	{
		this.articleSort = articleSort;
	}

	@Column(name = "article_key")
	public String getArticleKey()
	{
		return this.articleKey;
	}

	public void setArticleKey(String articleKey)
	{
		this.articleKey = articleKey;
	}

	@Column(name = "article_abst")
	public String getArticleAbst()
	{
		return this.articleAbst;
	}

	public void setArticleAbst(String articleAbst)
	{
		this.articleAbst = articleAbst;
	}

	@Column(name = "article_auth")
	public String getArticleAuth()
	{
		return this.articleAuth;
	}

	public void setArticleAuth(String articleAuth)
	{
		this.articleAuth = articleAuth;
	}

	@Column(name = "article_sou")
	public String getArticleSou()
	{
		return this.articleSou;
	}

	public void setArticleSou(String articleSou)
	{
		this.articleSou = articleSou;
	}

	@Column(name = "article_st_time", length = 19)
	public Date getArticleStTime()
	{
		return this.articleStTime;
	}

	public void setArticleStTime(Date articleStTime)
	{
		this.articleStTime = articleStTime;
	}

	@Column(name = "article_en_time", length = 19)
	public Date getArticleEnTime()
	{
		return this.articleEnTime;
	}

	public void setArticleEnTime(Date articleEnTime)
	{
		this.articleEnTime = articleEnTime;
	}

	@Column(name = "srticle_content")
	public String getSrticleContent()
	{
		return this.srticleContent;
	}

	public void setSrticleContent(String srticleContent)
	{
		this.srticleContent = srticleContent;
	}

}