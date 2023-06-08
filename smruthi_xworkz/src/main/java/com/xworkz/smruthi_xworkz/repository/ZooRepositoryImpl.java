package com.xworkz.smruthi_xworkz.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



import com.xworkz.smruthi_xworkz.entity.ZooEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class ZooRepositoryImpl implements ZooRepository {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

public ZooRepositoryImpl() {
	log.info("created:" + this.getClass().getSimpleName());
}
	@Override
	public boolean save(ZooEntity entity) {
	
		log.info("Running Save in zooRepoImpli" + entity);
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
		log.info("Find by Id in repoImpl");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		ZooEntity entity = entityManager.find(ZooEntity.class, id);
		entityManager.close();
		return entity;
	}
	@Override
	public List<ZooEntity> findByName(String name) {
		log.info("Running findByName in repository " + name);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("nam", name);
			log.info("query : " + query);
			List<ZooEntity> list = query.getResultList();
			log.info("Total list found in repo " + list.size());
			return list;
		} finally {
			manager.close();
			log.info("Released the connection");
		}
	}
@Override
public List<ZooEntity> findByLocation(String location) {
	log.info("find by location in repoimpl "+location);
	EntityManager manager=this.entityManagerFactory.createEntityManager();
	try {
		Query query=manager.createNamedQuery("findByLocation");
		query.setParameter("loc", location);
		List<ZooEntity>list=query.getResultList();
		log.info("total list found in repo "+list.size());
		return list;
	}
	finally {
		manager.close();
	}
}
@Override
public List<ZooEntity> findByNameAndLocation(String name, String location) {
	log.info("Running findByNameAndLocation in repository " + name + location);
	EntityManager manager = this.entityManagerFactory.createEntityManager();
	try {
		Query query = manager.createNamedQuery("findByNameAndLocation");
		query.setParameter("nam", name);
		query.setParameter("loca", location);
		log.info("query : " + query);
		List<ZooEntity> list = query.getResultList();
		log.info("Total list found in repo " + list.size());
		return list;
	} finally {
		manager.close();
		System.out.println("Released the connection");
	}
}

@Override
public List<ZooEntity> findAll() {
	log.info("Running findAll in repository ");
	EntityManager manager = this.entityManagerFactory.createEntityManager();
	try {
		Query query = manager.createNamedQuery("findAll");
		log.info("query : " + query);
		List<ZooEntity> list = query.getResultList();
		log.info("Total list found in repo " + list.size());
		return list;
	} finally {
		manager.close();
		log.info("Released the connection");
	}
}
public boolean update(ZooEntity entity)
{
	log.info("running  update in entity");
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
public boolean delete(int id)
{
	log.info("Running  Delete");
	EntityManager manager = this.entityManagerFactory.createEntityManager();
	try
	{
		EntityTransaction ts = manager.getTransaction();
		ZooEntity delete = manager.find(ZooEntity.class, id);
		ts.begin();
		manager.remove(delete);
		ts.commit();
		return true;
	}
	finally
	{
		manager.close();
	
	}
}
}


