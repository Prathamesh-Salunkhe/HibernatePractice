package com.mouritech.onetooneexample.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mouritech.onetooneexample.model.Stock_Details;
import com.mouritech.onetooneexample.util.HibernateUtil;





public class StockDetailsDao {
	public void saveEmployee(Stock_Details stoDetails) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			session.save(stoDetails);
			// commit transaction
			transaction.commit();
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
	}

	public Stock_Details getEmployeeDetails(Long stoDetailsId) {
		Transaction transaction = null;
		Stock_Details stoDetailsById = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
		//	session.saveOrUpdate(sto);
			
			//get entity from database
			stoDetailsById = session.get(Stock_Details.class, stoDetailsId);
			if(stoDetailsById!=null) {
				
				System.out.println("Stock details are = " + stoDetailsById);
			}
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		return stoDetailsById;
		
	}
}