package com.isoft.stockplus.manager.po;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Stockdata entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "stockdata", catalog = "stockplus")
public class Stockdata implements java.io.Serializable
{

	// Fields

	private Integer stockdataId;
	private String gid;
	private double increPer;
	private double increase;
	private String name;
	private double todayStartPri;
	private double yestodEndPri;
	private double nowPri;
	private double todayMax;
	private double todayMin;
	private double competitivePri;
	private double reservePri;
	private long traNumber;
	private long traAmount;
	private long buyOne;
	private double buyOnePri;
	private long buyTwo;
	private double buyTwoPri;
	private long sellOne;
	private double sellOnePri;
	private long sellTwo;
	private double sellTwoPri;
	private Date date;
	private Date time;

	// Constructors

	/** default constructor */
	public Stockdata()
	{
	}

	/** full constructor */
	public Stockdata(String gid, double increPer, double increase, String name,
			double todayStartPri, double yestodEndPri, double nowPri,
			double todayMax, double todayMin, double competitivePri,
			double reservePri, long traNumber, long traAmount, long buyOne,
			double buyOnePri, long buyTwo, double buyTwoPri, long sellOne,
			double sellOnePri, long sellTwo, double sellTwoPri, Date date,
			Date time)
	{
		this.gid = gid;
		this.increPer = increPer;
		this.increase = increase;
		this.name = name;
		this.todayStartPri = todayStartPri;
		this.yestodEndPri = yestodEndPri;
		this.nowPri = nowPri;
		this.todayMax = todayMax;
		this.todayMin = todayMin;
		this.competitivePri = competitivePri;
		this.reservePri = reservePri;
		this.traNumber = traNumber;
		this.traAmount = traAmount;
		this.buyOne = buyOne;
		this.buyOnePri = buyOnePri;
		this.buyTwo = buyTwo;
		this.buyTwoPri = buyTwoPri;
		this.sellOne = sellOne;
		this.sellOnePri = sellOnePri;
		this.sellTwo = sellTwo;
		this.sellTwoPri = sellTwoPri;
		this.date = date;
		this.time = time;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "stockdata_id", unique = true, nullable = false)
	public Integer getStockdataId()
	{
		return this.stockdataId;
	}

	public void setStockdataId(Integer stockdataId)
	{
		this.stockdataId = stockdataId;
	}

	@Column(name = "gid", length = 32)
	public String getGid()
	{
		return this.gid;
	}

	public void setGid(String gid)
	{
		this.gid = gid;
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

	@Column(name = "name", length = 64)
	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Column(name = "todayStartPri", precision = 22, scale = 0)
	public double getTodayStartPri()
	{
		return this.todayStartPri;
	}

	public void setTodayStartPri(double todayStartPri)
	{
		this.todayStartPri = todayStartPri;
	}

	@Column(name = "yestodEndPri", precision = 22, scale = 0)
	public double getYestodEndPri()
	{
		return this.yestodEndPri;
	}

	public void setYestodEndPri(double yestodEndPri)
	{
		this.yestodEndPri = yestodEndPri;
	}

	@Column(name = "nowPri", precision = 22, scale = 0)
	public double getNowPri()
	{
		return this.nowPri;
	}

	public void setNowPri(double nowPri)
	{
		this.nowPri = nowPri;
	}

	@Column(name = "todayMax", precision = 22, scale = 0)
	public double getTodayMax()
	{
		return this.todayMax;
	}

	public void setTodayMax(double todayMax)
	{
		this.todayMax = todayMax;
	}

	@Column(name = "todayMin", precision = 22, scale = 0)
	public double getTodayMin()
	{
		return this.todayMin;
	}

	public void setTodayMin(double todayMin)
	{
		this.todayMin = todayMin;
	}

	@Column(name = "competitivePri", precision = 22, scale = 0)
	public double getCompetitivePri()
	{
		return this.competitivePri;
	}

	public void setCompetitivePri(double competitivePri)
	{
		this.competitivePri = competitivePri;
	}

	@Column(name = "reservePri", precision = 22, scale = 0)
	public double getReservePri()
	{
		return this.reservePri;
	}

	public void setReservePri(double reservePri)
	{
		this.reservePri = reservePri;
	}

	@Column(name = "traNumber")
	public long getTraNumber()
	{
		return this.traNumber;
	}

	public void setTraNumber(long traNumber)
	{
		this.traNumber = traNumber;
	}

	@Column(name = "traAmount")
	public long getTraAmount()
	{
		return this.traAmount;
	}

	public void setTraAmount(long traAmount)
	{
		this.traAmount = traAmount;
	}

	@Column(name = "buyOne")
	public long getBuyOne()
	{
		return this.buyOne;
	}

	public void setBuyOne(long buyOne)
	{
		this.buyOne = buyOne;
	}

	@Column(name = "buyOnePri", precision = 22, scale = 0)
	public double getBuyOnePri()
	{
		return this.buyOnePri;
	}

	public void setBuyOnePri(double buyOnePri)
	{
		this.buyOnePri = buyOnePri;
	}

	@Column(name = "buyTwo")
	public long getBuyTwo()
	{
		return this.buyTwo;
	}

	public void setBuyTwo(long buyTwo)
	{
		this.buyTwo = buyTwo;
	}

	@Column(name = "buyTwoPri", precision = 22, scale = 0)
	public double getBuyTwoPri()
	{
		return this.buyTwoPri;
	}

	public void setBuyTwoPri(double buyTwoPri)
	{
		this.buyTwoPri = buyTwoPri;
	}

	@Column(name = "sellOne")
	public long getSellOne()
	{
		return this.sellOne;
	}

	public void setSellOne(long sellOne)
	{
		this.sellOne = sellOne;
	}

	@Column(name = "sellOnePri", precision = 22, scale = 0)
	public double getSellOnePri()
	{
		return this.sellOnePri;
	}

	public void setSellOnePri(double sellOnePri)
	{
		this.sellOnePri = sellOnePri;
	}

	@Column(name = "sellTwo")
	public long getSellTwo()
	{
		return this.sellTwo;
	}

	public void setSellTwo(long sellTwo)
	{
		this.sellTwo = sellTwo;
	}

	@Column(name = "sellTwoPri", precision = 22, scale = 0)
	public double getSellTwoPri()
	{
		return this.sellTwoPri;
	}

	public void setSellTwoPri(double sellTwoPri)
	{
		this.sellTwoPri = sellTwoPri;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date", length = 10)
	public Date getDate()
	{
		return this.date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	@Column(name = "time", length = 8)
	public Date getTime()
	{
		return this.time;
	}

	public void setTime(Date time)
	{
		this.time = time;
	}

}