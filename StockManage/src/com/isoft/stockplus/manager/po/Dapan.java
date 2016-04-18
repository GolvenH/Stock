package com.isoft.stockplus.manager.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Dapan entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "dapan", catalog = "stockplus")
public class Dapan implements java.io.Serializable
{

	// Fields

	private Integer dapanId;
	private String dapanName;
	private double dapanDot;
	private double dapanNowpic;
	private double dapanTraAmount;
	private double dapanTranumber;

	// Constructors

	/** default constructor */
	public Dapan()
	{
	}

	/** full constructor */
	public Dapan(String dapanName, double dapanDot, double dapanNowpic,
			double dapanTraAmount, double dapanTranumber)
	{
		this.dapanName = dapanName;
		this.dapanDot = dapanDot;
		this.dapanNowpic = dapanNowpic;
		this.dapanTraAmount = dapanTraAmount;
		this.dapanTranumber = dapanTranumber;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "dapan_id", unique = true, nullable = false)
	public Integer getDapanId()
	{
		return this.dapanId;
	}

	public void setDapanId(Integer dapanId)
	{
		this.dapanId = dapanId;
	}

	@Column(name = "dapan_name")
	public String getDapanName()
	{
		return this.dapanName;
	}

	public void setDapanName(String dapanName)
	{
		this.dapanName = dapanName;
	}

	@Column(name = "dapan_dot", precision = 255, scale = 0)
	public double getDapanDot()
	{
		return this.dapanDot;
	}

	public void setDapanDot(double dapanDot)
	{
		this.dapanDot = dapanDot;
	}

	@Column(name = "dapan_nowpic", precision = 255, scale = 0)
	public double getDapanNowpic()
	{
		return this.dapanNowpic;
	}

	public void setDapanNowpic(double dapanNowpic)
	{
		this.dapanNowpic = dapanNowpic;
	}

	@Column(name = "dapan_traAmount", precision = 255, scale = 0)
	public double getDapanTraAmount()
	{
		return this.dapanTraAmount;
	}

	public void setDapanTraAmount(double dapanTraAmount)
	{
		this.dapanTraAmount = dapanTraAmount;
	}

	@Column(name = "dapan_tranumber", precision = 22, scale = 0)
	public double getDapanTranumber()
	{
		return this.dapanTranumber;
	}

	public void setDapanTranumber(double dapanTranumber)
	{
		this.dapanTranumber = dapanTranumber;
	}

}