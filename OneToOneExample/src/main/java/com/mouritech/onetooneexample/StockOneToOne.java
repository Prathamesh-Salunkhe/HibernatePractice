package com.mouritech.onetooneexample;


import com.mouritech.onetooneexample.dao.StockDao;
import com.mouritech.onetooneexample.model.Stock;
import com.mouritech.onetooneexample.model.Stock_Details;

public class StockOneToOne {

	public static void main(String[] args) {
		Stock sto = new Stock("BSE","Axis_Bank");
		Stock_Details stodetails = new Stock_Details("Axis","Bank","IPO","01-01-2015");
		sto.setStoDetails(stodetails);
		
		StockDao stoDao = new StockDao();
		stoDao.saveStock(sto);

	}

}



