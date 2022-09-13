package org.ciq.ems.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
//		System.out.println(session);

//		Account account = new Account(1446444646l, "hyd", "ts");

//		Account account = new Account(546474746l, "srnagar", "ts");
//		Employee employee = new Employee("sunil", 55000.00, account);

//		Employee employee = new Employee("prabhu", 99000.00, account);
//		Account account = new Account(656555335l, "bpl", "ts");
		Account account = new Account(774488447l, "srpr", "ts");
		Employee employee = new Employee("praveen", 66000, account);
		session.persist(account);
		session.persist(employee);
		
		System.out.println(employee);
		
		
		session.beginTransaction().commit();
		session.close();

//		Employee employee = new Employee("sampath", 88000.00, account);
//		
//		Account account = new Account(22466444646l, "ameerpet", "ts");
//	Employee employee = new Employee("raghu", 44000.00, account);

//		Account account2 = new Account(99874668l, "gdk", "ts");
//		Employee employee2 = new Employee("rajender", 33000.00, account2);
//		session.persist(account);
//		session.persist(employee);
//		session.persist(account2);
//		session.persist(employee2);

//		Employee employee = (Employee) session.get(Employee.class, 2);

//		session.delete(employee);
//		session.beginTransaction().commit();
//		session.close();

	}

}
