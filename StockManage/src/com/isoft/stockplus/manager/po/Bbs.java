package com.isoft.stockplus.manager.po;

import java.sql.Timestamp;

/**
 * Bbs entity. @author MyEclipse Persistence Tools
 */

public class Bbs implements java.io.Serializable {

	// Fields

	private Integer bbsId;
	private StockInformation stockInformationByStockNum;
	private StockInformation stockInformationByStockName;
	private String bbsContent;
	private Timestamp bbsTime;

	// Constructors

	/** default constructor */
	public Bbs() {
	}

	/** full constructor */
	public Bbs(StockInformation stockInformationByStockNum,
			StockInformation stockInformationByStockName, String bbsContent,
			Timestamp bbsTime) {
		this.stockInformationByStockNum = stockInformationByStockNum;
		this.stockInformationByStockName = stockInformationByStockName;
		this.bbsContent = bbsContent;
		this.bbsTime = bbsTime;
	}

	// Property accessors

	public Integer getBbsId() {
		return this.bbsId;
	}

	public void setBbsId(Integer bbsId) {
		this.bbsId = bbsId;
	}

	public StockInformation getStockInformationByStockNum() {
		return this.stockInformationByStockNum;
	}

	public void setStockInformationByStockNum(
			StockInformation stockInformationByStockNum) {
		this.stockInformationByStockNum = stockInformationByStockNum;
	}

	public StockInformation getStockInformationByStockName() {
		return this.stockInformationByStockName;
	}

	public void setStockInformationByStockName(
			StockInformation stockInformationByStockName) {
		this.stockInformationByStockName = stockInformationByStockName;
	}

	public String getBbsContent() {
		return this.bbsContent;
	}

	public void setBbsContent(String bbsContent) {
		this.bbsContent = bbsContent;
	}

	public Timestamp getBbsTime() {
		return this.bbsTime;
	}

	public void setBbsTime(Timestamp bbsTime) {
		this.bbsTime = bbsTime;
	}

}