package com.xworkz.smruthi_xworkz.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;


import com.xworkz.smruthi_xworkz.entity.ZooEntity;

@Repository
public class ZooRepositoryImpl implements ZooRepository {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

public ZooRepositoryImpl() {
	System.out.println("created:" + getClass().getSimpleName());
}
	@Override
	public boolean save(ZooEntity entity) {
	
		System.out.println("Running Save in zooRepoImpli" + entity);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
		
	}
	@Override
	public ZooEntity findById(int id) {
		System.out.println("Find by Id in repoImpli");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		ZooEntity entity = entityManager.find(ZooEntity.class, id);
		entityManager.close();
		return entity;
	}

	}


