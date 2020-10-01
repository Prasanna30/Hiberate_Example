package com.quantum.hibernate.example_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.quantum.hibernate");
    	
    	Employee e = new Employee();
    
    	e.setName("Pradhan");
    	e.setcountry("Bangladesh");

    	EntityManager entityManager = entityManagerFactory.createEntityManager();
    	entityManager.getTransaction().begin();
    	entityManager.persist(e);
    	entityManager.getTransaction().commit();
    	entityManagerFactory.close();
    }
}
