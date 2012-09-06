package com.hck.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.transaction.annotation.Transactional;

import com.hck.domain.Roles;

public class UserServiceImpl  {

	// Injected database connection:
    @PersistenceContext private EntityManager em;
 
    // Stores a new roles:
    @Transactional
    public void persist(Roles roles) {
        em.persist(roles);
    }
 
    // Retrieves all the guests:
    public List<Roles> getAllGuests() {
    	
    	System.out.println("RolesDao getAllGuests()---");

    	TypedQuery<Roles> query = em.createQuery(
            "SELECT g FROM Roles g ORDER BY g.roleid", Roles.class);
    	return query.getResultList();
    }

}
