package com.isoft.stockplus.manager.po;

import java.sql.Timestamp;

/**
 * UserOpStock entity. @author MyEclipse Persistence Tools
 */

public class UserOpStock implements java.io.Serializable {

	// Fields

	private Integer userOpStockId;
	private User user;
	private StockInformation stockInformation;
	private Timestamp userOpStockTime;

	// Constructors

	/** default constructor */
	public UserOpStock() {
	}

	/** full constructor */
	public UserOpStock(User user, StockInformation stockInformation,
			Timestamp userOpStockTime) {
		this.user = user;
		this.stockInformation = stockInformation;
		this.userOpStockTime = userOpStockTime;
	}

	// Property accessors

	public Integer getUserOpStockId() {
		return this.userOpStockId;
	}

	public void setUserOpStockId(Integer userOpStockId) {
		this.userOpStockId = userOpStockId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public StockInformation getStockInformation() {
		return this.stockInformation;
	}

	public void setStockInformation(StockInformation stockInformation) {
		this.stockInformation = stockInformation;
	}

	public Timestamp getUserOpStockTime() {
		return this.userOpStockTime;
	}

	public void setUserOpStockTime(Timestamp userOpStockTime) {
		this.userOpStockTime = userOpStockTime;
	}

}