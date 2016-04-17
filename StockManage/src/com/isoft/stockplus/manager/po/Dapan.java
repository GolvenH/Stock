package com.isoft.stockplus.manager.po;

/**
 * Dapan entity. @author MyEclipse Persistence Tools
 */

public class Dapan implements java.io.Serializable {

	// Fields

	private Integer dapanId;
	private String dapanName;
	private Double dapanDot;
	private Double dapanNowpic;
	private Double dapanTraAmount;
	private Double dapanTranumber;

	// Constructors

	/** default constructor */
	public Dapan() {
	}

	/** full constructor */
	public Dapan(String dapanName, Double dapanDot, Double dapanNowpic,
			Double dapanTraAmount, Double dapanTranumber) {
		this.dapanName = dapanName;
		this.dapanDot = dapanDot;
		this.dapanNowpic = dapanNowpic;
		this.dapanTraAmount = dapanTraAmount;
		this.dapanTranumber = dapanTranumber;
	}

	// Property accessors

	public Integer getDapanId() {
		return this.dapanId;
	}

	public void setDapanId(Integer dapanId) {
		this.dapanId = dapanId;
	}

	public String getDapanName() {
		return this.dapanName;
	}

	public void setDapanName(String dapanName) {
		this.dapanName = dapanName;
	}

	public Double getDapanDot() {
		return this.dapanDot;
	}

	public void setDapanDot(Double dapanDot) {
		this.dapanDot = dapanDot;
	}

	public Double getDapanNowpic() {
		return this.dapanNowpic;
	}

	public void setDapanNowpic(Double dapanNowpic) {
		this.dapanNowpic = dapanNowpic;
	}

	public Double getDapanTraAmount() {
		return this.dapanTraAmount;
	}

	public void setDapanTraAmount(Double dapanTraAmount) {
		this.dapanTraAmount = dapanTraAmount;
	}

	public Double getDapanTranumber() {
		return this.dapanTranumber;
	}

	public void setDapanTranumber(Double dapanTranumber) {
		this.dapanTranumber = dapanTranumber;
	}

}