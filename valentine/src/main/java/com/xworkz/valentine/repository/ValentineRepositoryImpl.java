package com.xworkz.valentine.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.valentine.entity.ValentineEntity;
@Repository
public class ValentineRepositoryImpl implements ValentineRepository {
	@Autowired
private EntityManagerFactory factory;
public ValentineRepositoryImpl() {
	System.out.println("created "+this.getClass().getSimpleName());
}
	@Override
	public boolean save(ValentineEntity entity) {
		System.out.println("running save in repository");
		EntityManager em=this.factory.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(entity);
		et.commit();
		em.close();
		return true;
	}

}
