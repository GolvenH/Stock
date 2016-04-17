package com.isoft.stockplus.manager.po;

/**
 * UserInfo entity. @author MyEclipse Persistence Tools
 */

public class UserInfo implements java.io.Serializable {

	// Fields

	private Integer userInfoId;
	private StockInformation stockInformationByStockName;
	private StockInformation stockInformationByStockPrice;
	private User user;

	// Constructors

	/** default constructor */
	public UserInfo() {
	}

	/** full constructor */
	public UserInfo(StockInformation stockInformationByStockName,
			StockInformation stockInformationByStockPrice, User user) {
		this.stockInformationByStockName = stockInformationByStockName;
		this.stockInformationByStockPrice = stockInformationByStockPrice;
		this.user = user;
	}

	// Property accessors

	public Integer getUserInfoId() {
		return this.userInfoId;
	}

	public void setUserInfoId(Integer userInfoId) {
		this.userInfoId = userInfoId;
	}

	public StockInformation getStockInformationByStockName() {
		return this.stockInformationByStockName;
	}

	public void setStockInformationByStockName(
			StockInformation stockInformationByStockName) {
		this.stockInformationByStockName = stockInformationByStockName;
	}

	public StockInformation getStockInformationByStockPrice() {
		return this.stockInformationByStockPrice;
	}

	public void setStockInformationByStockPrice(
			StockInformation stockInformationByStockPrice) {
		this.stockInformationByStockPrice = stockInformationByStockPrice;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}