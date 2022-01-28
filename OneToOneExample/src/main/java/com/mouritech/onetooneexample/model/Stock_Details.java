package com.mouritech.onetooneexample.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "sto_details")
public class Stock_Details {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long stoDetailsId;
	
	@Column(name = "comp_name")
	private String stoCompName;
	
	@Column(name = "comp_desc")
	private String stoCompDesc;
	
	@Column(name = "remark")
	private String stoRemark;
	
	@Column(name = "listed_date")
	private String stoListedDate;
	
	public Stock_Details() {
		// TODO Auto-generated constructor stub
	}
	public Stock_Details(Long stoDetailsId, String stoCompName, String stoCompDesc,String stoRemark,String stoListedDate ) {
		super();
		this.stoDetailsId = stoDetailsId;
		this.stoCompName = stoCompName;
		this.stoCompDesc = stoCompDesc;
		this.stoRemark=stoRemark;
		this.stoListedDate=stoListedDate;
	}
	public Stock_Details( String stoCompName, String stoCompDesc,String stoRemark,String stoListedDate ) {
		super();
		
		this.stoCompName = stoCompName;
		this.stoCompDesc = stoCompDesc;
		this.stoRemark=stoRemark;
		this.stoListedDate=stoListedDate;
	}
	public Long getStoDetailsId() {
		return stoDetailsId;
	}
	public void setStoDetailsId(Long stoDetailsId) {
		this.stoDetailsId = stoDetailsId;
	}
	public String getStoCompName() {
		return stoCompName;
	}
	public void setStoCompName(String stoCompName) {
		this.stoCompName = stoCompName;
	}
	public String getStoCompDesc() {
		return stoCompDesc;
	}
	public void setStoCompDesc(String stoCompDesc) {
		this.stoCompDesc = stoCompDesc;
	}
	public String getStoRemark() {
		return stoRemark;
	}
	public void setStoRemark(String stoRemark) {
		this.stoRemark = stoRemark;
	}
	public String getStoListedDate() {
		return stoListedDate;
	}
	public void setStoListedDate(String stoListedDate) {
		this.stoListedDate = stoListedDate;
	}
	
	
}
