package com.hibernate_mapping.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		
	  Emp e1=new Emp();
	  Emp e2=new Emp();
	  e1.setEid(21);
	  e1.setEname("prince");
	  
	  e2.setEid(24);
	  e2.setEname("pogo");
	  
	  Project p1=new Project();
	  Project p2=new Project();
	  p1.setPid(41);
	  p1.setPname("bank");
	  
	  p2.setPid(42);
	  p2.setPname("java");
	  
	  List<Emp> list1=new ArrayList<Emp>();
	  List<Project> list2=new ArrayList<Project>();
	  
	  list1.add(e1);
	  list1.add(e2);
	  
	  list2.add(p1);
	  list2.add(p2);
	  
	  Session session=factory.openSession();
	  Transaction tx= session.beginTransaction();
	  
	  session.save(e1);
	  session.save(e2);
	  session.save(p1);
	  session.save(p2);
	  
		tx.commit();
		factory.close();
 
	}

}
