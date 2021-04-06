package com.customer.inf.systems.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.customer.addr.systems.hib.entity.AddressEntity;
import com.customer.inf.systems.hib.entity.CisEntity;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AddressEntity address = new AddressEntity();
		address.setAddress1("323 E Main St");
		address.setAddress2(null);
		address.setCity("K City");
		address.setState("SD");
		address.setCountry("USA");
		address.setZipCode(64105);
		CisEntity person3 = new CisEntity();

		person3.setPerFirstName("Pratap");
		person3.setPerLastName("ye");
		person3.setPerPrimaryPh("9123403678");
		person3.setPerSecondaryPh(null);
		person3.setPerEmail("eef@email.com");
		person3.getAddressEntity().add(address);
		
		System.out.println("---------------------------- xxxxxxxxxxxxxxxxxxxxxxxx ----------------------------"+person3.getAddressEntity().add(address));
		person3.setVersion(66);
		// Type

		Session session = getCurrentSessionFromConfig();
		Transaction tx = session.beginTransaction();

		session.save(person3);
		session.save(address);
		tx.commit();
		session.close();
		System.out.println("hello");
	}

	public static Session getCurrentSessionFromConfig() {
		// SessionFactory in Hibernate example
		// EntityManagerFactory --JPA

		Configuration config = new Configuration().configure().addAnnotatedClass(CisEntity.class)
				.addAnnotatedClass(AddressEntity.class);
		// config.configure();
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(config.getProperties()).build(); // local SessionFactory bean created
		SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.getCurrentSession();
		return session;
	}

//	public static SessionFactory getCurrentSessionFromJPA() {
//		  // JPA and Hibernate SessionFactory example
//		  EntityManagerFactory emf = 
//		      Persistence.createEntityManagerFactory("jpa-tutorial");
//		  EntityManager entityManager = emf.createEntityManager();
//		  // Get the Hibernate Session from the EntityManager in JPA
//		  Session session = entityManager.unwrap(org.hibernate.Session.class);
//		  SessionFactory factory = session.getSessionFactory();
//		  return factory;
//		}

}
