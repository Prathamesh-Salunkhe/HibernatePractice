package com.mouritech.onetooneexample.model;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sto1")
public class Stock {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long stoId;
	
	@Column(name = "stock_code")
	private String stoStockCode;
	
	@Column(name = "stock_name")
	private String stoStockName;
	
	public Stock() {
		// TODO Auto-generated constructor stub
	}

	public Stock(Long stoId, String stoStockCode, String stoStockName) {
		super();
		this.stoId = stoId;
		this.stoStockCode = stoStockCode;
		this.stoStockName = stoStockName;
		
	}
	public Stock( String stoStockCode, String stoStockName) {
		super();
		
		this.stoStockCode = stoStockCode;
		this.stoStockName = stoStockName;
		
	}
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="sto_detail_id")
	private Stock_Details stoDetails;

	public Long getStoId() {
		return stoId;
	}

	public void setStoId(Long stoId) {
		this.stoId = stoId;
	}

	public String getStoStockCode() {
		return stoStockCode;
	}

	public void setStoStockCode(String stoStockCode) {
		this.stoStockCode = stoStockCode;
	}

	public String getStoStockName() {
		return stoStockName;
	}

	public void setStoStockName(String stoStockName) {
		this.stoStockName = stoStockName;
	}

	public Stock_Details getStoDetails() {
		return stoDetails;
	}

	public void setStoDetails(Stock_Details stoDetails) {
		this.stoDetails = stoDetails;
	}

}

