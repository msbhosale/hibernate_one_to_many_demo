package com.msbhosale.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.msbhosale.hibernate.bean.Laptop;
import com.msbhosale.hibernate.bean.Person;

public class App {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		session.beginTransaction();

		Person person = new Person(101, "Ajay", "Patil");

		Laptop laptop = new Laptop(12, "hp");
		Laptop laptop2 = new Laptop(15, "ASUS");
		
		person.getLaptop().add(laptop);
		person.getLaptop().add(laptop2);
		
		session.save(person);
		session.save(laptop);
		session.save(laptop2);
		
		Person p = session.get(Person.class, 101);

		System.out.println(p);

		session.getTransaction().commit();
		session.close();

	}
}