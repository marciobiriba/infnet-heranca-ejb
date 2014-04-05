package br.edu.infnet.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractDAO<T> {
	@PersistenceContext(unitName="infnet-heranca-ejbPU")
	private EntityManager em;
	private Class<T> entityClass;
	
	public AbstractDAO(Class<T> entityClass){
		this.entityClass = entityClass;
	}
	public void cadastrar(T entity){
		em.persist(entity);
	}
}
