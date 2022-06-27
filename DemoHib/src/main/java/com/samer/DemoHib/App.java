package com.samer.DemoHib;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App {
	public static void main(String[] args) {

		Alien a = null;

		Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class);
 
		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();

		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		session.beginTransaction();

		Laptop l=session.get(Laptop.class, 201);
		
		System.out.println(l.getPrice());
	
		session.getTransaction().commit();


	}
}
