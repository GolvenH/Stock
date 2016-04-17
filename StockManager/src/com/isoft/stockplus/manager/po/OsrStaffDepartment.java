package com.isoft.stockplus.manager.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * OsrStaffDepartment entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "osr_staff_department", catalog = "isoftoab")
public class OsrStaffDepartment implements java.io.Serializable {

	// Fields

	private String staffDepartmentId;
	private String departmentId;
	private String staffId;

	// Constructors

	/** default constructor */
	public OsrStaffDepartment() {
	}

	/** full constructor */
	public OsrStaffDepartment(String departmentId, String staffId) {
		this.departmentId = departmentId;
		this.staffId = staffId;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "staff_department_id", unique = true, nullable = false, length = 32)
	public String getStaffDepartmentId() {
		return this.staffDepartmentId;
	}

	public void setStaffDepartmentId(String staffDepartmentId) {
		this.staffDepartmentId = staffDepartmentId;
	}

	@Column(name = "department_id", length = 32)
	public String getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	@Column(name = "staff_id", length = 32)
	public String getStaffId() {
		return this.staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

}