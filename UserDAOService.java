package com.in28minutes.learning.jpa.jpain10steps.service;

import org.springframework.stereotype.Repository;

import com.in28minutes.learning.jpa.jpain10steps.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

// Denotes that this class interacts w/ a DB
@Repository
// Denotes that this class will hold transactional functions
@Transactional
public class UserDAOService {
    @PersistenceContext
    private EntityManager entityManager;

    public long insert(User user){
        // .persist(User) will begin tracking user persistence context in the DB
        entityManager.persist(user);
        return user.getId();
    }
}
