package com.mouritech.hibernateinheritanceexample.entity;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "bnk")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "bnktype",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "bankaccount")
public class BankAccount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bnkAccNo;
	private String bnkAccName;
	private double bnkBalance;
	
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}

	public BankAccount(int bnkAccNo, String bnkAccName, double bnkBalance) {
		super();
		this.bnkAccNo = bnkAccNo;
		this.bnkAccName = bnkAccName;
		this.bnkBalance = bnkBalance;
	}

	

	public int getBnkAccNo() {
		return bnkAccNo;
	}

	public void setBnkAccNo(int bnkAccNo) {
		this.bnkAccNo = bnkAccNo;
	}

	public String getBnkAccName() {
		return bnkAccName;
	}

	public void setBnkAccName(String bnkAccName) {
		this.bnkAccName = bnkAccName;
	}

	public double getBnkBalance() {
		return bnkBalance;
	}

	public void setBnkBalance(double bnkBalance) {
		this.bnkBalance = bnkBalance;
	}
	@Override
	public String toString() {
		return "BankAccount [bnkAccNo=" + bnkAccNo + ", bnkAccName=" + bnkAccName + ", bnkBalance=" + bnkBalance + "]";
	}

}
