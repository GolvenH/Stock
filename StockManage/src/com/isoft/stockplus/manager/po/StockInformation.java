package com.isoft.stockplus.manager.po;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * StockInformation entity. @author MyEclipse Persistence Tools
 */

public class StockInformation implements java.io.Serializable {

	// Fields

	private Integer stockId;
	private String stockNum;
	private String stockName;
	private String stockCurrent;
	private Timestamp stockTime;
	private Double stockPrice;
	private Set userOpStocks = new HashSet(0);
	private Set userInfosForStockPrice = new HashSet(0);
	private Set bbsesForStockName = new HashSet(0);
	private Set userInfosForStockName = new HashSet(0);
	private Set bbsesForStockNum = new HashSet(0);

	// Constructors

	/** default constructor */
	public StockInformation() {
	}

	/** full constructor */
	public StockInformation(String stockNum, String stockName,
			String stockCurrent, Timestamp stockTime, Double stockPrice,
			Set userOpStocks, Set userInfosForStockPrice,
			Set bbsesForStockName, Set userInfosForStockName,
			Set bbsesForStockNum) {
		this.stockNum = stockNum;
		this.stockName = stockName;
		this.stockCurrent = stockCurrent;
		this.stockTime = stockTime;
		this.stockPrice = stockPrice;
		this.userOpStocks = userOpStocks;
		this.userInfosForStockPrice = userInfosForStockPrice;
		this.bbsesForStockName = bbsesForStockName;
		this.userInfosForStockName = userInfosForStockName;
		this.bbsesForStockNum = bbsesForStockNum;
	}

	// Property accessors

	public Integer getStockId() {
		return this.stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public String getStockNum() {
		return this.stockNum;
	}

	public void setStockNum(String stockNum) {
		this.stockNum = stockNum;
	}

	public String getStockName() {
		return this.stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public String getStockCurrent() {
		return this.stockCurrent;
	}

	public void setStockCurrent(String stockCurrent) {
		this.stockCurrent = stockCurrent;
	}

	public Timestamp getStockTime() {
		return this.stockTime;
	}

	public void setStockTime(Timestamp stockTime) {
		this.stockTime = stockTime;
	}

	public Double getStockPrice() {
		return this.stockPrice;
	}

	public void setStockPrice(Double stockPrice) {
		this.stockPrice = stockPrice;
	}

	public Set getUserOpStocks() {
		return this.userOpStocks;
	}

	public void setUserOpStocks(Set userOpStocks) {
		this.userOpStocks = userOpStocks;
	}

	public Set getUserInfosForStockPrice() {
		return this.userInfosForStockPrice;
	}

	public void setUserInfosForStockPrice(Set userInfosForStockPrice) {
		this.userInfosForStockPrice = userInfosForStockPrice;
	}

	public Set getBbsesForStockName() {
		return this.bbsesForStockName;
	}

	public void setBbsesForStockName(Set bbsesForStockName) {
		this.bbsesForStockName = bbsesForStockName;
	}

	public Set getUserInfosForStockName() {
		return this.userInfosForStockName;
	}

	public void setUserInfosForStockName(Set userInfosForStockName) {
		this.userInfosForStockName = userInfosForStockName;
	}

	public Set getBbsesForStockNum() {
		return this.bbsesForStockNum;
	}

	public void setBbsesForStockNum(Set bbsesForStockNum) {
		this.bbsesForStockNum = bbsesForStockNum;
	}

}