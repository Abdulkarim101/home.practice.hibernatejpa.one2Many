package com.home.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.home.entities.AddressEntity;
import com.home.entities.CustomerEntity;

@Repository
public class CustomerRepository {
	
	private EntityManager em;
	
	@Transactional
	public void save(CustomerEntity customer) {
		
		em.persist(customer);
		
		}
	
	@Transactional
	public void save(AddressEntity address) {
		
		em.persist(address);
		
		}
	
	

	public EntityManager getEm() {
		return em;
	}
	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}
	
}
