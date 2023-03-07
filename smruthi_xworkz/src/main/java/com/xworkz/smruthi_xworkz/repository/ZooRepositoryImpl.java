package com.xworkz.smruthi_xworkz.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

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
@Override
public List<ZooEntity> findByLocation(String location) {
	System.out.println("find by location in repoimpl");
	EntityManager manager=this.entityManagerFactory.createEntityManager();
	try {
		Query query=manager.createNamedQuery("findByLocation");
		query.setParameter("loc", location);
		List<ZooEntity>list=query.getResultList();
		System.out.println("total list found in repo "+list.size());
		return list;
	}
	finally {
		manager.close();
	}
}
public boolean update(ZooEntity entity)
{
	System.out.println("running the update in entity");
	EntityManager manager = this.entityManagerFactory.createEntityManager();
	try
	{
		EntityTransaction ts = manager.getTransaction();
		ts.begin();
		manager.merge(entity);
		ts.commit();
		return true;
	}
	finally
	{
		manager.close();
	}
}
@Override
public ZooEntity deleteById(int id) {
	System.out.println("running delete by id");
	EntityManager manager=this.entityManagerFactory.createEntityManager();
	try {
		EntityTransaction transaction=manager.getTransaction();
		ZooEntity delete=manager.find(ZooEntity.class, id);
		transaction.begin();
		manager.remove(delete);
		transaction.commit();
		return delete;
	}finally {
		manager.close();
	}
		
}
	}


