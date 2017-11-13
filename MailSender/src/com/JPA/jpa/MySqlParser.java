package com.JPA.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MySqlParser {
private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("JPA");
public static void create(int id, String first_name, String last_name, String status, String email){
	EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
	EntityTransaction transaction = null;
	try{
		transaction = manager.getTransaction();
		transaction.begin();
		
		Users user = new Users();
		user.setId(id);
		user.setFirst_name(first_name);
		user.setLast_name(last_name);
		user.setStatus(status);
		user.setEmail(email);
		
		manager.persist(user);
		
		transaction.commit();
	}
	catch(Exception ex){
		if(transaction != null){
			transaction.rollback();
		}
		ex.printStackTrace();
	}
	finally {
		manager.close();
		ENTITY_MANAGER_FACTORY.close();
	}
}
public static void delete(int id){
	EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
	EntityTransaction transaction = null;
	try{
		transaction = manager.getTransaction();
		transaction.begin();
		Users user = manager.find(Users.class, id);
		manager.remove(user);
		transaction.commit();
	}catch(Exception ex){
		if(transaction != null){
			transaction.rollback();
		}
		ex.printStackTrace();
	}
	finally {
		manager.close();
		ENTITY_MANAGER_FACTORY.close();
	}
}
public static void update(int id, String first_name , String last_name, String status, String email){
	EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
	EntityTransaction transaction = null;
	try{
		transaction = manager.getTransaction();
		transaction.begin();
		
		Users user = manager.find(Users.class, id);
		user.setFirst_name(first_name);
		user.setLast_name(last_name);
		user.setStatus(status);
		user.setEmail(email);
		
		manager.persist(user);
		
		transaction.commit();
	}catch (Exception ex) {
		if(transaction != null){
			transaction.rollback();
		}
		ex.printStackTrace();
	}finally {
		manager.close();
		ENTITY_MANAGER_FACTORY.close();
	}
}
public static List readAll(){
	List users = null;
	
	EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
	EntityTransaction transaction = null;
	
	try{
		transaction = manager.getTransaction();
		transaction.begin();
		
	users = manager.createNativeQuery("SELECT s FROM Users s",Users.class).getResultList();
	transaction.commit();
	}catch (Exception ex) {
		if(transaction != null){
			transaction.rollback();
		}
	}finally {
		manager.close();
		ENTITY_MANAGER_FACTORY.close();
	}
	return users;
}
}
