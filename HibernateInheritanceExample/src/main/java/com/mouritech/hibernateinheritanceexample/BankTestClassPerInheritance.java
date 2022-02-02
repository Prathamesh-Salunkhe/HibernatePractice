package com.mouritech.hibernateinheritanceexample;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mouritech.hibernateinheritanceexample.entity.SavingAccount;
import com.mouritech.hibernateinheritanceexample.entity.BankAccount;
import com.mouritech.hibernateinheritanceexample.entity.CurrentAccount;
import com.mouritech.hibernateinheritanceexample.util.HibernateUtil;

public class BankTestClassPerInheritance {

	public static void main(String[] args) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			// start the transaction
			transaction = session.beginTransaction();

			BankAccount bnk = new BankAccount();
			bnk.setBnkAccName("Rama");

			CurrentAccount cbnk = new CurrentAccount();
			cbnk.setBnkAccName("Krishna");
			cbnk.setServicecharge(12);
			

			SavingAccount sbnk = new SavingAccount();
			cbnk.setBnkAccName("Hare");
			sbnk.setInterestrate(10);
			

			// save all the above employee objects in to database
			session.save(bnk);
			session.save(cbnk);
			session.save(sbnk);
			// commit transaction
			transaction.commit();
		  } catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
	}

}



