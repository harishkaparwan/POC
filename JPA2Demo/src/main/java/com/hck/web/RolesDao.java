package com.hck.web;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.transaction.annotation.Transactional;

import com.hck.domain.Roles;

public class RolesDao {

    // Injected database connection:
    @PersistenceContext private EntityManager em;
 
    // Stores a new guest:
    @Transactional
    public void persist(Roles guest) {
        em.persist(guest);
    }
 
    // Retrieves all the guests:
    public List<Roles> getAllGuests() {
    	TypedQuery<Roles> query = em.createQuery(
            "SELECT g FROM Roles g ORDER BY g.id", Roles.class);
    	return query.getResultList();
    }

}
