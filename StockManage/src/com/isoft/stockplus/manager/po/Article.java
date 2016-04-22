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
	private String articleName;
	private String articleType;
	private String articleKey;
	private String articleAbst;
	private String articleAuth;
	private String articleSou;
	private String articleContent;

	// Constructors

	/** default constructor */
	public Article()
	{
	}

	/** full constructor */
	public Article(String articleName, String articleType,
			String articleKey, String articleAbst, String articleAuth,
			String articleSou,String articleContent)
	{
		this.articleName = articleName;
		this.articleType = articleType;
		this.articleKey = articleKey;
		this.articleAbst = articleAbst;
		this.articleAuth = articleAuth;
		this.articleSou = articleSou;
		this.articleContent = articleContent;
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

	@Column(name = "article_name")
	public String getArticleName()
	{
		return this.articleName;
	}

	public void setArticleName(String articleName)
	{
		this.articleName = articleName;
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

	@Column(name = "article_content")
	public String getArticleContent()
	{
		return this.articleContent;
	}

	public void setArticleContent(String articleContent)
	{
		this.articleContent = articleContent;
	}

}