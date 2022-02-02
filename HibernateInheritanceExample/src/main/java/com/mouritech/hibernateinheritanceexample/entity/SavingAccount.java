package com.mouritech.hibernateinheritanceexample.entity;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("sbankaccount")
public class SavingAccount extends BankAccount {
	
	@Column(name="bnk_interestrate")
	private float interestrate;
	
	
	
	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}
	
	

	public SavingAccount(float interestrate) {
		super();
		this.interestrate = interestrate;
		
	}



	public float getInterestrate() {
		return interestrate;
	}



	public void setInterestrate(float interestrate) {
		this.interestrate = interestrate;
	}



}
