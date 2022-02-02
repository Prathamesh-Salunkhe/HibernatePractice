package com.mouritech.hibernateinheritanceexample.entity;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("sbankaccount")
public class CurrentAccount extends BankAccount {
	
	@Column(name="bnk_servicecharge")
	private float servicecharge;
	
	
	
	public CurrentAccount() {
		// TODO Auto-generated constructor stub
	}
	
	

	public CurrentAccount(float servicecharge) {
		super();
		this.servicecharge = servicecharge;
		
	}



	public float getServicecharge() {
		return servicecharge;
	}



	public void setServicecharge(float servicecharge) {
		this.servicecharge = servicecharge;
	}
 

}
