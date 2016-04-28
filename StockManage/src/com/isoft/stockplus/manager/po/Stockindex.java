package com.isoft.stockplus.manager.po;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Stockindex entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "stockindex", catalog = "stockplus")
public class Stockindex implements java.io.Serializable
{

	// Fields

	private Integer stockindexId;
	private String name;
	private long dealNum;
	private long dealPri;
	private double highPri;
	private double lowpri;
	private double nowpri;
	private double openPri;
	private double yesPri;
	private double increPer;
	private double increase;
	private Date time;

	// Constructors

	/** default constructor */
	public Stockindex()
	{
	}

	/** full constructor */
	public Stockindex(String name, long dealNum, long dealPri, double highPri,
			double lowpri, double nowpri, double openPri, double yesPri,
			double increPer, double increase, Date time)
	{
		this.name = name;
		this.dealNum = dealNum;
		this.dealPri = dealPri;
		this.highPri = highPri;
		this.lowpri = lowpri;
		this.nowpri = nowpri;
		this.openPri = openPri;
		this.yesPri = yesPri;
		this.increPer = increPer;
		this.increase = increase;
		this.time = time;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "stockindex_id", unique = true, nullable = false)
	public Integer getStockindexId()
	{
		return this.stockindexId;
	}

	public void setStockindexId(Integer stockindexId)
	{
		this.stockindexId = stockindexId;
	}

	@Column(name = "name", length = 64)
	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Column(name = "dealNum")
	public long getDealNum()
	{
		return this.dealNum;
	}

	public void setDealNum(long dealNum)
	{
		this.dealNum = dealNum;
	}

	@Column(name = "dealPri")
	public long getDealPri()
	{
		return this.dealPri;
	}

	public void setDealPri(long dealPri)
	{
		this.dealPri = dealPri;
	}

	@Column(name = "highPri", precision = 22, scale = 0)
	public double getHighPri()
	{
		return this.highPri;
	}

	public void setHighPri(double highPri)
	{
		this.highPri = highPri;
	}

	@Column(name = "lowpri", precision = 22, scale = 0)
	public double getLowpri()
	{
		return this.lowpri;
	}

	public void setLowpri(double lowpri)
	{
		this.lowpri = lowpri;
	}

	@Column(name = "nowpri", precision = 22, scale = 0)
	public double getNowpri()
	{
		return this.nowpri;
	}

	public void setNowpri(double nowpri)
	{
		this.nowpri = nowpri;
	}

	@Column(name = "openPri", precision = 22, scale = 0)
	public double getOpenPri()
	{
		return this.openPri;
	}

	public void setOpenPri(double openPri)
	{
		this.openPri = openPri;
	}

	@Column(name = "yesPri", precision = 22, scale = 0)
	public double getYesPri()
	{
		return this.yesPri;
	}

	public void setYesPri(double yesPri)
	{
		this.yesPri = yesPri;
	}

	@Column(name = "increPer", precision = 22, scale = 0)
	public double getIncrePer()
	{
		return this.increPer;
	}

	public void setIncrePer(double increPer)
	{
		this.increPer = increPer;
	}

	@Column(name = "increase", precision = 22, scale = 0)
	public double getIncrease()
	{
		return this.increase;
	}

	public void setIncrease(double increase)
	{
		this.increase = increase;
	}

	@Column(name = "time", length = 19)
	public Date getTime()
	{
		return this.time;
	}

	public void setTime(Date time)
	{
		this.time = time;
	}

}