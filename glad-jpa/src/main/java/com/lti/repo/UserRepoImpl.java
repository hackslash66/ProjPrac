package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.entity.User;
@Repository
public class UserRepoImpl implements UserRepo{
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void save(User user) {
		// TODO Auto-generated method stub
		em.persist(user);
	}

	
	public User fetch(String uname) {
		// TODO Auto-generated method stub
		return em.find(User.class, uname);
	}

	
	public List<User> list() {
		// TODO Auto-generated method stub
		return em.createQuery("from User").getResultList();
	}

	@Transactional
	public void update(User user) {
		// TODO Auto-generated method stub
		em.merge(user);
		
	}


	public List<User> fetchAll() {
		
			
			return em.createQuery("from User").getResultList();
		
	}

	public List<User> fetchIfYes(){
		Query query = em.createNamedQuery("fetchifyes");
		query.setParameter("approvalStatus","yes");
		return query.getResultList();
	}
}
