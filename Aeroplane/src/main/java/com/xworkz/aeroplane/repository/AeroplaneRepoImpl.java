package com.xworkz.aeroplane.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.aeroplane.entity.AeroplaneEntity;
@Repository
public class AeroplaneRepoImpl  implements AeroplaneRepo{
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public AeroplaneRepoImpl() {
		System.out.println("created:" + getClass().getSimpleName());
	}
@Override
	public AeroplaneEntity findById(int id) {
		System.out.println("Find by Id in repoImpli");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		AeroplaneEntity entity = entityManager.find(AeroplaneEntity.class, id);
		entityManager.close();
		return entity;
	}

	@Override
	public boolean save(AeroplaneEntity entity) {
		System.out.println("Running Save in AeroRepoImpli" + entity);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
		
	}
	}


