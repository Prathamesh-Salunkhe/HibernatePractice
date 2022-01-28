package com.mouritech.onetooneexample.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mouritech.onetooneexample.model.Stock;
import com.mouritech.onetooneexample.util.HibernateUtil;

public class StockDao {
	
	public void saveStock(Stock sto) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			session.save(sto);
			// commit transaction
			transaction.commit();
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
	}

	public Stock getStock(Long stoid) {
		Transaction transaction = null;
		Stock stoById = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			//session.saveOrUpdate(sto);
			
			//get entity from database
			stoById = session.get(Stock.class, stoid);
			if(stoById!=null) {
				
				System.out.println("Stock details are = " + stoById);
			}
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		return stoById;
		
	}
}