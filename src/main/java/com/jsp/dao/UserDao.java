

package com.jsp.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.User;


public class UserDao {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("wraaqi");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	
	 public User saveUser(User user) {
		 et.begin();
		 em.persist(user); 
		 et.commit(); 
		 em.close();
		 return user; 
	 }

	 public List<User> getUsers() {
		 // kanktebu the entity name not the table name from the database!!
		 Query query = em.createQuery("SELECT u FROM User u");
		 List<User> allUsers = query.getResultList();
		 em.close();
		 return allUsers;
	}

	 public User findUserByNameAndPass(String username, String password, String role) {
		    Query query = em.createQuery("SELECT u FROM User u WHERE u.username = :username AND u.password = :password AND u.role = :role");
		    query.setParameter("username", username);
		    query.setParameter("password", password);
		    query.setParameter("role", role);
		    
		    List<User> users = query.getResultList();
		    
		    if (users != null && !users.isEmpty()) {
		        return users.get(0); 
		    } else {
		        return null;
		    }
		}

	public User findUserById(int userId) {
	    Query query = em.createQuery("SELECT u FROM User u WHERE u.user_id = :userId");
	    query.setParameter("userId", userId);

	    List<User> users = query.getResultList();
	    
	    if (users != null && !users.isEmpty()) {
	        return users.get(0); 
	    } else {
	        return null;
	    }
	}
}